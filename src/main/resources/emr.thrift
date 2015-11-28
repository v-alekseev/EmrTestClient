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
	
	// Аутентификационный токен пользователя. Если логин null, значение игнрируется, в противном случае непустая строка. 
	4: string authToken,

	// платформа, на которой живёт данный клиент
	5: ThriftPlatformType clientPlatform,

	// Идентификатор устройства для рассылки пуш-уведомлений (зависит от платформы).
    // нулл или пустая строка допускаются, если пользователь запретил пуши
	6: string pushToken,

    // версия клиента
    7: string clientVersion,
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

//Типы кейсов
enum ThriftCaseType {
    PROBLEM,RESULT,PROCEDURE,ENCOUNTER,PLANOFCARE,ALLERGIES
}

struct ThriftCaseData {
		// идентификатор кейса
	1: string caseID,
		// тип кейса
   	2: ThriftCaseType caseType,
   		// идентификатор пациента
    3: string patientID,
		// тип взаимодействия с клиникой
	4: string caseName,
		// название клиники
	5: string clinicName,
		// дата кейса YYYY-MM-DD
	6: string insertedAt,
		// доктор
	7: string author,
}

struct ThriftCaseTypeProblemData {
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
}

struct ThriftCaseTypeProcedureData {
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
}

struct ThriftCaseTypeEncounterData {
		// место встречи (приема пациента)
	1: string encounterLocation,
		// тип места
	2: string locationType,
		// больница
	3: string hospital,
		// доктор
	4: string doctor,
		// дата начала посещений
	5: string startDate,
		// дата окончания посещений
	6: string endDate,
		// тип взаимодействия
	7: string interactionType,
		// номер кейса
	8: string caseNumber,
		// результат приема
	9: string encounterOutcome,
}

struct ThriftCaseDetailData {
		// кейс
	1: ThriftCaseData caseData,
		// данные для типа Problem
	2: ThriftCaseTypeProblemData problemData,
		// данные для типа Procedure
	3: ThriftCaseTypeProcedureData procedureData,
		// данные для типа Encounter
	4: ThriftCaseTypeEncounterData encounterData,
}

struct ThriftMedicationData {
		// идентификатор пациента
	1: string patientID,
		// идентификатор кейса
	2: string caseID,
		// лекарство
	3: string medication,
		// доза
	4: string dose,
		// форма выпуска
	5: string form,
		// инструкция
	6: string instructions,
		// начало приема YYYY-MM-DD
	7: string startDate,
		// окончание приема YYYY-MM-DD
	8: string endDate,
		// статус
	9: string status,
		// дата кейса YYYY-MM-DD
	10: string insertedAt,
		// доктор
	11: string author,
		// рецепт (PDF)
	12: string prescription,
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

struct ThriftForm100Data {
		// данные
	1: string data,
}

struct ThriftPatientData {
		// идентификатор пациента
	1: string patientID,
		// Фамилия
	2: string surname,
		// Имя
	3: string name,
		// дата рождения
	4: string dateOfBirth,
		// пол ("F","M","")
	5: string sex,
}

struct ThriftPatientDetailData {
		// пациент
	1: ThriftPatientData patient,
		// фотография FIXME
	2: string photo,
		// семейный доктор
	3: ThriftFamilyDoctorData familyDoctor,
		// форма 100
	4: ThriftForm100Data form100,
}

service ThriftAuthService {
	//получение текущего время сервера serverTimestamp и других данных
	//request пока можно не заполнять
	//авторизация не требуется
	ThriftPingResponse ping( 1: ThriftRequestCommonData request ) throws ( 1: ThriftException ex ),

	//получение названия последней версии First Aid Info
	//request пока можно не заполнять
	//авторизация не требуется
	string getFirstAidInfoVersion( 1: ThriftRequestCommonData request ) throws ( 1: ThriftException ex ),

	//получение zip-архива последней версии First Aid Info
	//request пока можно не заполнять
	//авторизация не требуется
	binary getFirstAidInfoArchive( 1: ThriftRequestCommonData request ) throws ( 1: ThriftException ex ),
	
	//авторизация на сервере
	//возвращаю признак успешной авторизации
	//request.userLogin - телефон
	//request.authToken - код подтверждения
	//request.deviceId  - id устройства
	//request.pushToken - токен для отправки push-уведомления
	//При неудачной регистрации exception ex.typeCode = AUTHENTICATION_FAILED
	//test: для пользователей TEST_PATIENT,TEST_DOCTOR,TEST_REPORT возвращаю true
	bool login( 1: ThriftRequestCommonData request ) throws ( 1: ThriftException ex ),

	//получение данных пользователя
	//возвращаю данные профиля пользователя
	//request.userLogin - телефон
	//request.authToken - код подтверждения
	//При неудачной регистрации exception ex.typeCode = AUTHENTICATION_FAILED
	//test: для пользователей TEST_PATIENT,TEST_DOCTOR,TEST_REPORT возвращаю тестовые данные
	ThriftUserData getUserData( 1: ThriftRequestCommonData request ) throws ( 1: ThriftException ex ),

	//Подтверждение кода Organizaton Unit (для роли Doctor) (5.7.2)
	//возвращаю данные профиля пользователя
	//request.userLogin - телефон
	//request.authToken - код подтверждения
	//orgUnit           - код организации
	//При неудачной регистрации exception ex.typeCode = AUTHENTICATION_FAILED
	//test: для пользователя TEST_DOCTOR возвращаю true
	bool doctorOrgUnit( 1: ThriftRequestCommonData request, 2: string orgUnit ) throws ( 1: ThriftException ex ),
}

service ThriftPatientService {
	//Получения списка кейсов по пациенту(5.6.7.1,5.6.8.1,6.1.5,6.1.8)
	list<ThriftCaseData> getPatientCases( 1: string patientId, 2: string dateStart, 3: string dateEnd ) throws ( 1: ThriftException ex ),

	//Получение списка лекраственных назначений по пациенту (6.1.6,6.1.9)
	list<ThriftMedicationData> getPatientMedications( 1: string patientId ) throws ( 1: ThriftException ex ),
}

service ThriftDoctorService {

	//Получение профиля пациента (6.1.7,6.1.8.2)
	ThriftPatientDetailData getPatientDetail( 1: string patientId ) throws ( 1: ThriftException ex ),

	//Поиск пациента (п.5.6.8.1,6.1.8,6.1.9)
	list<ThriftPatientData> findPatients( 1: ThriftPatientData findPatientData ) throws ( 1: ThriftException ex ),

	//Получения списка последних кейсов для доктора (5.6.8.1,6.1.8)
	list<ThriftCaseData> getLastDoctorCases( 1: string doctorPatientId, 2: i32 listSizeMax ) throws ( 1: ThriftException ex ),

	//Получение детализации кейса (5.6.7.1,5.6.8.1,6.1.5.1,6.1.8)
	list<ThriftCaseDetailData> getCaseDetail( 1: string caseId, 2: string patientId ) throws ( 1: ThriftException ex ),

	//Обновить кейс (п.5.6.8.1,п.6.1.8)
	bool updateCaseDetail( 1: ThriftCaseDetailData caseDetailData) throws ( 1: ThriftException ex ),

	//Добавить кейс (п.5.6.8.1,п.6.1.8)
	ThriftCaseDetailData insertCaseDetail( 1: ThriftCaseDetailData caseDetailData) throws ( 1: ThriftException ex ),

	//Получения списка последних рецептов для доктора (6.1.9)
	list<ThriftMedicationData> getLastDoctorMedications( 1: string doctorPatientId, 2: i32 listSizeMax ) throws ( 1: ThriftException ex ),

}

