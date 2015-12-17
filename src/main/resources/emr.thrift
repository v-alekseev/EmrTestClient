namespace java ru.baccasoft.emr.thrift.generated

// Тип исключения при синхронизации
enum ThriftExceptionType {
	// Неверная версия протокола обмена МП-ПСС. Необходимо обновить клиент.
	SERVICE_VERSION_MISMATCH,

	// Аутентификация пользователя не прошла. Либо (при вызове сервиса аутентификации) указаны неправильные
	// учетные данные, либо (при обычной работе) протух токен и требуется повторная аутентификация.
	AUTHENTICATION_FAILED,

	// Произошла непредвиденная ошибка, попробуйте позднее...
	UNDEFINED, // всё остальное -- клиенту пофиг
}

// Любые ошибки, возникшие внутри ПСС при обработке запроса МП, возвращаются в МП в виде таких исключений.
exception ThriftException {
	// Тип ошибки.
	1: ThriftExceptionType typeCode,

	// Сообщение об ошибке. Предназначено для логгирования, не является человекочитаемым. Может быть null.
	2: string logErrorMsg,

	// Сообщение об ошибке. Предназначено для пользователя.
	3: string userErrorMsg,

	// url, по которому находится обновление при SERVICE_VERSION_MISMATCH, иначе ""
	4: string updateUrl
}

// Платформа, на которой работает клиент.
enum ThriftPlatformType {
	IPHONE, IPAD, ANDROID_PHONE, ANDROID_PAD, FAKE_TEST_CLIENT
}

// Стандартные данные, присутствующие в любом запросе МП --> ПСС.
struct ThriftRequestCommonData {
	// Версия протокола обмена, на которую рассчитан данный клиент. Хардкодится при сборке клиента.
	1: string protocolVersion,

	// Уникальный идентификатор клиента. Должен генерироваться в момент установки МП на устройство, должен
	// однозначно идентифицировать данное устройство среди всех устройств данной платформы, на которых установлено МП
	2: string deviceId,

	// Логин пользователя. Null для анонимного доступа.
	3: string userLogin,

	// Пароль пользователя.
	4: string password,

	// Аутентификационный токен пользователя. Если логин null, значение игнорируется, в противном случае - непустая строка.
	5: string authToken,

	// платформа, на которой живёт данный клиент
	6: ThriftPlatformType clientPlatform,

	// Идентификатор устройства для рассылки пуш-уведомлений (зависит от платформы).
    // нулл или пустая строка допускаются, если пользователь запретил пуши
	7: string pushToken,

    // версия клиента
    8: string clientVersion,
}

struct ThriftPingResponse {
    // текущее системное время сервера. Предназначено для фиксации следующего за пингом обновления.
    1: i64 serverTimestamp,

    // если истина, пользователю необходимо выдать вежливое предложение обновить версию клиента
    2: bool newVersionAvailable,

    // если newVersionAvailable, то платформозависимый url, по которому находится обновление, иначе null
    3: string updateUrl,

    // если newVersionAvailable, то платформозависимое приглашение к обновлению на языке пользователя, иначе null
    4: string updateMessage,

    // если истина, клиент должен удалить все данные из БД, после чего обновиться с датой синхронизации 0
    5: bool shouldCleanClientData,
}


// Профиль пользователя
struct ThriftUserData {
		// идентификатор пациента
	1: string patientID,
		// роль. Одна из - Patient,Doctor,Report
	2: string role,
}

// Типы секций
enum ThriftSectionType {
    PROBLEM,PROCEDURE,ENCOUNTER,MEDICATION,
}

// Секция Encounter
struct ThriftCaseData {
		// идентификатор кейса
	1: string caseID,
   		// идентификатор пациента
    2: string patientID,
		// тип взаимодействия с клиникой
	3: string caseName,
		// название клиники
	4: string clinicName,
		// дата кейса YYYY-MM-DD
	5: string startDate,
		// доктор
	6: string doctor,
}

struct ThriftSectionProblemData {
		// группа заболевания
	1: string diseaseGroup,
		// заболевание
	2: string disease,
		// диагноз
	3: string clinicalDiagnosis,
		// статус (открыт/закрыт)
	4: string status,
		// дата начала заболевания
	5: string effectiveStartDate,
		// дата окончания заболевания
	6: string effectiveEndDate,
}

struct ThriftSectionProcedureData {
		// система органов
	1: string bodySystem,
		// назначенная процедура
	2: string procedure,
		// месяц лечения
	3: string month,
		// год лечения
	4: string year,
		// статус (открыт/закрыт)
	5: string status,
		// описание процедруы
	6: string pDescription,
		// дата
	7: string date;
}

struct ThriftSectionEncounterData {
		// больница
    1: string hospital,
		// отделение
	2: string department,
		// тип взаимодействия
    3: string interactionType,
		// доктор
    4: string doctor,
		// дата начала посещений
    5: string startDate,
        // дата окончания посещений
    6: string endDate,
     	// результат приема
    7: string encounterOutcome,
		// номер кейса
    8: string caseNumber,
}

struct ThriftSectionMedicationData {
		// идентификатор назначения
	1: string medicationID
		// идентификатор пациента
	2: string patientID,
		// идентификатор кейса
	3: string caseID,
		// номер рецепта
	4: string ePrescriptionN,
		// лекарство
	5: string drug,
		// активное вещество
	6: string activeSubstance
		// дозировка
	7: string dose,
		// начало приема YYYY-MM-DD
	8: string startDate,
		// окончание приема YYYY-MM-DD
	9: string endDate,
		// статус
	10: string status,
		// инструкции по применению
    11: string instructions,
}

struct ThriftCaseDetailData {
		// кейс
	//1: ThriftCaseData caseData,
	1: string caseID,
		// данные секции Encounters
    2: ThriftSectionEncounterData encounterData,
		// данные секции Problems
	3: list<ThriftSectionProblemData> problemData,
		// данные секции Procedure
	4: list<ThriftSectionProcedureData> procedureData,
		// данные секции Medications&ePrescriptions
	5: list<ThriftSectionMedicationData> medicationData,
}

struct ThriftFamilyDoctorData {
		// Имя
	1: string name,
		// больница
	2: string hospital,
		// подразделение
	3: string operationUnit,
		// главный врач
	4: string chiefDoctor,
		// телефон
	5: string telephone,
}

struct ThriftPatientSummaryData {
		// данные
	1: string data,
}

struct ThriftPatientData {
		// идентификатор пациента
	1: string patientID,
		// идентификатор пациента как гражданина Грузии
	2: string nationalID,
		// Фамилия
	3: string surname,
		// Имя
	4: string name,
		// дата рождения
	5: string dateOfBirth,
		// пол ("F","M","")
	6: string sex,
}

struct ThriftPatientPersonalData {
	// пациент
	1: ThriftPatientData idInfo,
	// фото
	2: string photo,
}

struct ThriftPatientProfileData {