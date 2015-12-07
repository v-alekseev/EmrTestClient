/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ru.baccasoft.emr.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-04")
public class ThriftCaseData implements org.apache.thrift.TBase<ThriftCaseData, ThriftCaseData._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftCaseData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftCaseData");

  private static final org.apache.thrift.protocol.TField CASE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("caseID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PATIENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("patientID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CASE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("caseName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLINIC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("clinicName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField START_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("startDate", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DOCTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("doctor", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftCaseDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftCaseDataTupleSchemeFactory());
  }

  public String caseID; // required
  public String patientID; // required
  public String caseName; // required
  public String clinicName; // required
  public String startDate; // required
  public String doctor; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CASE_ID((short)1, "caseID"),
    PATIENT_ID((short)2, "patientID"),
    CASE_NAME((short)3, "caseName"),
    CLINIC_NAME((short)4, "clinicName"),
    START_DATE((short)5, "startDate"),
    DOCTOR((short)6, "doctor");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CASE_ID
          return CASE_ID;
        case 2: // PATIENT_ID
          return PATIENT_ID;
        case 3: // CASE_NAME
          return CASE_NAME;
        case 4: // CLINIC_NAME
          return CLINIC_NAME;
        case 5: // START_DATE
          return START_DATE;
        case 6: // DOCTOR
          return DOCTOR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CASE_ID, new org.apache.thrift.meta_data.FieldMetaData("caseID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PATIENT_ID, new org.apache.thrift.meta_data.FieldMetaData("patientID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CASE_NAME, new org.apache.thrift.meta_data.FieldMetaData("caseName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLINIC_NAME, new org.apache.thrift.meta_data.FieldMetaData("clinicName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_DATE, new org.apache.thrift.meta_data.FieldMetaData("startDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOCTOR, new org.apache.thrift.meta_data.FieldMetaData("doctor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftCaseData.class, metaDataMap);
  }

  public ThriftCaseData() {
  }

  public ThriftCaseData(
    String caseID,
    String patientID,
    String caseName,
    String clinicName,
    String startDate,
    String doctor)
  {
    this();
    this.caseID = caseID;
    this.patientID = patientID;
    this.caseName = caseName;
    this.clinicName = clinicName;
    this.startDate = startDate;
    this.doctor = doctor;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftCaseData(ThriftCaseData other) {
    if (other.isSetCaseID()) {
      this.caseID = other.caseID;
    }
    if (other.isSetPatientID()) {
      this.patientID = other.patientID;
    }
    if (other.isSetCaseName()) {
      this.caseName = other.caseName;
    }
    if (other.isSetClinicName()) {
      this.clinicName = other.clinicName;
    }
    if (other.isSetStartDate()) {
      this.startDate = other.startDate;
    }
    if (other.isSetDoctor()) {
      this.doctor = other.doctor;
    }
  }

  public ThriftCaseData deepCopy() {
    return new ThriftCaseData(this);
  }

  @Override
  public void clear() {
    this.caseID = null;
    this.patientID = null;
    this.caseName = null;
    this.clinicName = null;
    this.startDate = null;
    this.doctor = null;
  }

  public String getCaseID() {
    return this.caseID;
  }

  public ThriftCaseData setCaseID(String caseID) {
    this.caseID = caseID;
    return this;
  }

  public void unsetCaseID() {
    this.caseID = null;
  }

  /** Returns true if field caseID is set (has been assigned a value) and false otherwise */
  public boolean isSetCaseID() {
    return this.caseID != null;
  }

  public void setCaseIDIsSet(boolean value) {
    if (!value) {
      this.caseID = null;
    }
  }

  public String getPatientID() {
    return this.patientID;
  }

  public ThriftCaseData setPatientID(String patientID) {
    this.patientID = patientID;
    return this;
  }

  public void unsetPatientID() {
    this.patientID = null;
  }

  /** Returns true if field patientID is set (has been assigned a value) and false otherwise */
  public boolean isSetPatientID() {
    return this.patientID != null;
  }

  public void setPatientIDIsSet(boolean value) {
    if (!value) {
      this.patientID = null;
    }
  }

  public String getCaseName() {
    return this.caseName;
  }

  public ThriftCaseData setCaseName(String caseName) {
    this.caseName = caseName;
    return this;
  }

  public void unsetCaseName() {
    this.caseName = null;
  }

  /** Returns true if field caseName is set (has been assigned a value) and false otherwise */
  public boolean isSetCaseName() {
    return this.caseName != null;
  }

  public void setCaseNameIsSet(boolean value) {
    if (!value) {
      this.caseName = null;
    }
  }

  public String getClinicName() {
    return this.clinicName;
  }

  public ThriftCaseData setClinicName(String clinicName) {
    this.clinicName = clinicName;
    return this;
  }

  public void unsetClinicName() {
    this.clinicName = null;
  }

  /** Returns true if field clinicName is set (has been assigned a value) and false otherwise */
  public boolean isSetClinicName() {
    return this.clinicName != null;
  }

  public void setClinicNameIsSet(boolean value) {
    if (!value) {
      this.clinicName = null;
    }
  }

  public String getStartDate() {
    return this.startDate;
  }

  public ThriftCaseData setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public void unsetStartDate() {
    this.startDate = null;
  }

  /** Returns true if field startDate is set (has been assigned a value) and false otherwise */
  public boolean isSetStartDate() {
    return this.startDate != null;
  }

  public void setStartDateIsSet(boolean value) {
    if (!value) {
      this.startDate = null;
    }
  }

  public String getDoctor() {
    return this.doctor;
  }

  public ThriftCaseData setDoctor(String doctor) {
    this.doctor = doctor;
    return this;
  }

  public void unsetDoctor() {
    this.doctor = null;
  }

  /** Returns true if field doctor is set (has been assigned a value) and false otherwise */
  public boolean isSetDoctor() {
    return this.doctor != null;
  }

  public void setDoctorIsSet(boolean value) {
    if (!value) {
      this.doctor = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CASE_ID:
      if (value == null) {
        unsetCaseID();
      } else {
        setCaseID((String)value);
      }
      break;

    case PATIENT_ID:
      if (value == null) {
        unsetPatientID();
      } else {
        setPatientID((String)value);
      }
      break;

    case CASE_NAME:
      if (value == null) {
        unsetCaseName();
      } else {
        setCaseName((String)value);
      }
      break;

    case CLINIC_NAME:
      if (value == null) {
        unsetClinicName();
      } else {
        setClinicName((String)value);
      }
      break;

    case START_DATE:
      if (value == null) {
        unsetStartDate();
      } else {
        setStartDate((String)value);
      }
      break;

    case DOCTOR:
      if (value == null) {
        unsetDoctor();
      } else {
        setDoctor((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CASE_ID:
      return getCaseID();

    case PATIENT_ID:
      return getPatientID();

    case CASE_NAME:
      return getCaseName();

    case CLINIC_NAME:
      return getClinicName();

    case START_DATE:
      return getStartDate();

    case DOCTOR:
      return getDoctor();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CASE_ID:
      return isSetCaseID();
    case PATIENT_ID:
      return isSetPatientID();
    case CASE_NAME:
      return isSetCaseName();
    case CLINIC_NAME:
      return isSetClinicName();
    case START_DATE:
      return isSetStartDate();
    case DOCTOR:
      return isSetDoctor();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftCaseData)
      return this.equals((ThriftCaseData)that);
    return false;
  }

  public boolean equals(ThriftCaseData that) {
    if (that == null)
      return false;

    boolean this_present_caseID = true && this.isSetCaseID();
    boolean that_present_caseID = true && that.isSetCaseID();
    if (this_present_caseID || that_present_caseID) {
      if (!(this_present_caseID && that_present_caseID))
        return false;
      if (!this.caseID.equals(that.caseID))
        return false;
    }

    boolean this_present_patientID = true && this.isSetPatientID();
    boolean that_present_patientID = true && that.isSetPatientID();
    if (this_present_patientID || that_present_patientID) {
      if (!(this_present_patientID && that_present_patientID))
        return false;
      if (!this.patientID.equals(that.patientID))
        return false;
    }

    boolean this_present_caseName = true && this.isSetCaseName();
    boolean that_present_caseName = true && that.isSetCaseName();
    if (this_present_caseName || that_present_caseName) {
      if (!(this_present_caseName && that_present_caseName))
        return false;
      if (!this.caseName.equals(that.caseName))
        return false;
    }

    boolean this_present_clinicName = true && this.isSetClinicName();
    boolean that_present_clinicName = true && that.isSetClinicName();
    if (this_present_clinicName || that_present_clinicName) {
      if (!(this_present_clinicName && that_present_clinicName))
        return false;
      if (!this.clinicName.equals(that.clinicName))
        return false;
    }

    boolean this_present_startDate = true && this.isSetStartDate();
    boolean that_present_startDate = true && that.isSetStartDate();
    if (this_present_startDate || that_present_startDate) {
      if (!(this_present_startDate && that_present_startDate))
        return false;
      if (!this.startDate.equals(that.startDate))
        return false;
    }

    boolean this_present_doctor = true && this.isSetDoctor();
    boolean that_present_doctor = true && that.isSetDoctor();
    if (this_present_doctor || that_present_doctor) {
      if (!(this_present_doctor && that_present_doctor))
        return false;
      if (!this.doctor.equals(that.doctor))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_caseID = true && (isSetCaseID());
    list.add(present_caseID);
    if (present_caseID)
      list.add(caseID);

    boolean present_patientID = true && (isSetPatientID());
    list.add(present_patientID);
    if (present_patientID)
      list.add(patientID);

    boolean present_caseName = true && (isSetCaseName());
    list.add(present_caseName);
    if (present_caseName)
      list.add(caseName);

    boolean present_clinicName = true && (isSetClinicName());
    list.add(present_clinicName);
    if (present_clinicName)
      list.add(clinicName);

    boolean present_startDate = true && (isSetStartDate());
    list.add(present_startDate);
    if (present_startDate)
      list.add(startDate);

    boolean present_doctor = true && (isSetDoctor());
    list.add(present_doctor);
    if (present_doctor)
      list.add(doctor);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftCaseData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCaseID()).compareTo(other.isSetCaseID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCaseID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.caseID, other.caseID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPatientID()).compareTo(other.isSetPatientID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPatientID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.patientID, other.patientID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCaseName()).compareTo(other.isSetCaseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCaseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.caseName, other.caseName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClinicName()).compareTo(other.isSetClinicName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClinicName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clinicName, other.clinicName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartDate()).compareTo(other.isSetStartDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startDate, other.startDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDoctor()).compareTo(other.isSetDoctor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoctor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doctor, other.doctor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftCaseData(");
    boolean first = true;

    sb.append("caseID:");
    if (this.caseID == null) {
      sb.append("null");
    } else {
      sb.append(this.caseID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("patientID:");
    if (this.patientID == null) {
      sb.append("null");
    } else {
      sb.append(this.patientID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("caseName:");
    if (this.caseName == null) {
      sb.append("null");
    } else {
      sb.append(this.caseName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clinicName:");
    if (this.clinicName == null) {
      sb.append("null");
    } else {
      sb.append(this.clinicName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startDate:");
    if (this.startDate == null) {
      sb.append("null");
    } else {
      sb.append(this.startDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("doctor:");
    if (this.doctor == null) {
      sb.append("null");
    } else {
      sb.append(this.doctor);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftCaseDataStandardSchemeFactory implements SchemeFactory {
    public ThriftCaseDataStandardScheme getScheme() {
      return new ThriftCaseDataStandardScheme();
    }
  }

  private static class ThriftCaseDataStandardScheme extends StandardScheme<ThriftCaseData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftCaseData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CASE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.caseID = iprot.readString();
              struct.setCaseIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATIENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.patientID = iprot.readString();
              struct.setPatientIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CASE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.caseName = iprot.readString();
              struct.setCaseNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLINIC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clinicName = iprot.readString();
              struct.setClinicNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startDate = iprot.readString();
              struct.setStartDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DOCTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.doctor = iprot.readString();
              struct.setDoctorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftCaseData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.caseID != null) {
        oprot.writeFieldBegin(CASE_ID_FIELD_DESC);
        oprot.writeString(struct.caseID);
        oprot.writeFieldEnd();
      }
      if (struct.patientID != null) {
        oprot.writeFieldBegin(PATIENT_ID_FIELD_DESC);
        oprot.writeString(struct.patientID);
        oprot.writeFieldEnd();
      }
      if (struct.caseName != null) {
        oprot.writeFieldBegin(CASE_NAME_FIELD_DESC);
        oprot.writeString(struct.caseName);
        oprot.writeFieldEnd();
      }
      if (struct.clinicName != null) {
        oprot.writeFieldBegin(CLINIC_NAME_FIELD_DESC);
        oprot.writeString(struct.clinicName);
        oprot.writeFieldEnd();
      }
      if (struct.startDate != null) {
        oprot.writeFieldBegin(START_DATE_FIELD_DESC);
        oprot.writeString(struct.startDate);
        oprot.writeFieldEnd();
      }
      if (struct.doctor != null) {
        oprot.writeFieldBegin(DOCTOR_FIELD_DESC);
        oprot.writeString(struct.doctor);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftCaseDataTupleSchemeFactory implements SchemeFactory {
    public ThriftCaseDataTupleScheme getScheme() {
      return new ThriftCaseDataTupleScheme();
    }
  }

  private static class ThriftCaseDataTupleScheme extends TupleScheme<ThriftCaseData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftCaseData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCaseID()) {
        optionals.set(0);
      }
      if (struct.isSetPatientID()) {
        optionals.set(1);
      }
      if (struct.isSetCaseName()) {
        optionals.set(2);
      }
      if (struct.isSetClinicName()) {
        optionals.set(3);
      }
      if (struct.isSetStartDate()) {
        optionals.set(4);
      }
      if (struct.isSetDoctor()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCaseID()) {
        oprot.writeString(struct.caseID);
      }
      if (struct.isSetPatientID()) {
        oprot.writeString(struct.patientID);
      }
      if (struct.isSetCaseName()) {
        oprot.writeString(struct.caseName);
      }
      if (struct.isSetClinicName()) {
        oprot.writeString(struct.clinicName);
      }
      if (struct.isSetStartDate()) {
        oprot.writeString(struct.startDate);
      }
      if (struct.isSetDoctor()) {
        oprot.writeString(struct.doctor);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftCaseData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.caseID = iprot.readString();
        struct.setCaseIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.patientID = iprot.readString();
        struct.setPatientIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.caseName = iprot.readString();
        struct.setCaseNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.clinicName = iprot.readString();
        struct.setClinicNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.startDate = iprot.readString();
        struct.setStartDateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.doctor = iprot.readString();
        struct.setDoctorIsSet(true);
      }
    }
  }

}

