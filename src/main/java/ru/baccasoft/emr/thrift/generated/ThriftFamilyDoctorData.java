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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-11-28")
public class ThriftFamilyDoctorData implements org.apache.thrift.TBase<ThriftFamilyDoctorData, ThriftFamilyDoctorData._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftFamilyDoctorData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftFamilyDoctorData");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HOSPITAL_FIELD_DESC = new org.apache.thrift.protocol.TField("hospital", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OPERATION_UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("operationUnit", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CHIEF_DOCTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("chiefDoctor", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TELEPHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("telephone", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftFamilyDoctorDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftFamilyDoctorDataTupleSchemeFactory());
  }

  public String name; // required
  public String hospital; // required
  public String operationUnit; // required
  public String chiefDoctor; // required
  public String telephone; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    HOSPITAL((short)2, "hospital"),
    OPERATION_UNIT((short)3, "operationUnit"),
    CHIEF_DOCTOR((short)4, "chiefDoctor"),
    TELEPHONE((short)5, "telephone");

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
        case 1: // NAME
          return NAME;
        case 2: // HOSPITAL
          return HOSPITAL;
        case 3: // OPERATION_UNIT
          return OPERATION_UNIT;
        case 4: // CHIEF_DOCTOR
          return CHIEF_DOCTOR;
        case 5: // TELEPHONE
          return TELEPHONE;
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOSPITAL, new org.apache.thrift.meta_data.FieldMetaData("hospital", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPERATION_UNIT, new org.apache.thrift.meta_data.FieldMetaData("operationUnit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHIEF_DOCTOR, new org.apache.thrift.meta_data.FieldMetaData("chiefDoctor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TELEPHONE, new org.apache.thrift.meta_data.FieldMetaData("telephone", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftFamilyDoctorData.class, metaDataMap);
  }

  public ThriftFamilyDoctorData() {
  }

  public ThriftFamilyDoctorData(
    String name,
    String hospital,
    String operationUnit,
    String chiefDoctor,
    String telephone)
  {
    this();
    this.name = name;
    this.hospital = hospital;
    this.operationUnit = operationUnit;
    this.chiefDoctor = chiefDoctor;
    this.telephone = telephone;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftFamilyDoctorData(ThriftFamilyDoctorData other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetHospital()) {
      this.hospital = other.hospital;
    }
    if (other.isSetOperationUnit()) {
      this.operationUnit = other.operationUnit;
    }
    if (other.isSetChiefDoctor()) {
      this.chiefDoctor = other.chiefDoctor;
    }
    if (other.isSetTelephone()) {
      this.telephone = other.telephone;
    }
  }

  public ThriftFamilyDoctorData deepCopy() {
    return new ThriftFamilyDoctorData(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.hospital = null;
    this.operationUnit = null;
    this.chiefDoctor = null;
    this.telephone = null;
  }

  public String getName() {
    return this.name;
  }

  public ThriftFamilyDoctorData setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getHospital() {
    return this.hospital;
  }

  public ThriftFamilyDoctorData setHospital(String hospital) {
    this.hospital = hospital;
    return this;
  }

  public void unsetHospital() {
    this.hospital = null;
  }

  /** Returns true if field hospital is set (has been assigned a value) and false otherwise */
  public boolean isSetHospital() {
    return this.hospital != null;
  }

  public void setHospitalIsSet(boolean value) {
    if (!value) {
      this.hospital = null;
    }
  }

  public String getOperationUnit() {
    return this.operationUnit;
  }

  public ThriftFamilyDoctorData setOperationUnit(String operationUnit) {
    this.operationUnit = operationUnit;
    return this;
  }

  public void unsetOperationUnit() {
    this.operationUnit = null;
  }

  /** Returns true if field operationUnit is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationUnit() {
    return this.operationUnit != null;
  }

  public void setOperationUnitIsSet(boolean value) {
    if (!value) {
      this.operationUnit = null;
    }
  }

  public String getChiefDoctor() {
    return this.chiefDoctor;
  }

  public ThriftFamilyDoctorData setChiefDoctor(String chiefDoctor) {
    this.chiefDoctor = chiefDoctor;
    return this;
  }

  public void unsetChiefDoctor() {
    this.chiefDoctor = null;
  }

  /** Returns true if field chiefDoctor is set (has been assigned a value) and false otherwise */
  public boolean isSetChiefDoctor() {
    return this.chiefDoctor != null;
  }

  public void setChiefDoctorIsSet(boolean value) {
    if (!value) {
      this.chiefDoctor = null;
    }
  }

  public String getTelephone() {
    return this.telephone;
  }

  public ThriftFamilyDoctorData setTelephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  public void unsetTelephone() {
    this.telephone = null;
  }

  /** Returns true if field telephone is set (has been assigned a value) and false otherwise */
  public boolean isSetTelephone() {
    return this.telephone != null;
  }

  public void setTelephoneIsSet(boolean value) {
    if (!value) {
      this.telephone = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HOSPITAL:
      if (value == null) {
        unsetHospital();
      } else {
        setHospital((String)value);
      }
      break;

    case OPERATION_UNIT:
      if (value == null) {
        unsetOperationUnit();
      } else {
        setOperationUnit((String)value);
      }
      break;

    case CHIEF_DOCTOR:
      if (value == null) {
        unsetChiefDoctor();
      } else {
        setChiefDoctor((String)value);
      }
      break;

    case TELEPHONE:
      if (value == null) {
        unsetTelephone();
      } else {
        setTelephone((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case HOSPITAL:
      return getHospital();

    case OPERATION_UNIT:
      return getOperationUnit();

    case CHIEF_DOCTOR:
      return getChiefDoctor();

    case TELEPHONE:
      return getTelephone();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case HOSPITAL:
      return isSetHospital();
    case OPERATION_UNIT:
      return isSetOperationUnit();
    case CHIEF_DOCTOR:
      return isSetChiefDoctor();
    case TELEPHONE:
      return isSetTelephone();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftFamilyDoctorData)
      return this.equals((ThriftFamilyDoctorData)that);
    return false;
  }

  public boolean equals(ThriftFamilyDoctorData that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_hospital = true && this.isSetHospital();
    boolean that_present_hospital = true && that.isSetHospital();
    if (this_present_hospital || that_present_hospital) {
      if (!(this_present_hospital && that_present_hospital))
        return false;
      if (!this.hospital.equals(that.hospital))
        return false;
    }

    boolean this_present_operationUnit = true && this.isSetOperationUnit();
    boolean that_present_operationUnit = true && that.isSetOperationUnit();
    if (this_present_operationUnit || that_present_operationUnit) {
      if (!(this_present_operationUnit && that_present_operationUnit))
        return false;
      if (!this.operationUnit.equals(that.operationUnit))
        return false;
    }

    boolean this_present_chiefDoctor = true && this.isSetChiefDoctor();
    boolean that_present_chiefDoctor = true && that.isSetChiefDoctor();
    if (this_present_chiefDoctor || that_present_chiefDoctor) {
      if (!(this_present_chiefDoctor && that_present_chiefDoctor))
        return false;
      if (!this.chiefDoctor.equals(that.chiefDoctor))
        return false;
    }

    boolean this_present_telephone = true && this.isSetTelephone();
    boolean that_present_telephone = true && that.isSetTelephone();
    if (this_present_telephone || that_present_telephone) {
      if (!(this_present_telephone && that_present_telephone))
        return false;
      if (!this.telephone.equals(that.telephone))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_hospital = true && (isSetHospital());
    list.add(present_hospital);
    if (present_hospital)
      list.add(hospital);

    boolean present_operationUnit = true && (isSetOperationUnit());
    list.add(present_operationUnit);
    if (present_operationUnit)
      list.add(operationUnit);

    boolean present_chiefDoctor = true && (isSetChiefDoctor());
    list.add(present_chiefDoctor);
    if (present_chiefDoctor)
      list.add(chiefDoctor);

    boolean present_telephone = true && (isSetTelephone());
    list.add(present_telephone);
    if (present_telephone)
      list.add(telephone);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftFamilyDoctorData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHospital()).compareTo(other.isSetHospital());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHospital()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hospital, other.hospital);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperationUnit()).compareTo(other.isSetOperationUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationUnit, other.operationUnit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChiefDoctor()).compareTo(other.isSetChiefDoctor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChiefDoctor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chiefDoctor, other.chiefDoctor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTelephone()).compareTo(other.isSetTelephone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTelephone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.telephone, other.telephone);
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
    StringBuilder sb = new StringBuilder("ThriftFamilyDoctorData(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hospital:");
    if (this.hospital == null) {
      sb.append("null");
    } else {
      sb.append(this.hospital);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operationUnit:");
    if (this.operationUnit == null) {
      sb.append("null");
    } else {
      sb.append(this.operationUnit);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("chiefDoctor:");
    if (this.chiefDoctor == null) {
      sb.append("null");
    } else {
      sb.append(this.chiefDoctor);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("telephone:");
    if (this.telephone == null) {
      sb.append("null");
    } else {
      sb.append(this.telephone);
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

  private static class ThriftFamilyDoctorDataStandardSchemeFactory implements SchemeFactory {
    public ThriftFamilyDoctorDataStandardScheme getScheme() {
      return new ThriftFamilyDoctorDataStandardScheme();
    }
  }

  private static class ThriftFamilyDoctorDataStandardScheme extends StandardScheme<ThriftFamilyDoctorData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftFamilyDoctorData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HOSPITAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hospital = iprot.readString();
              struct.setHospitalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPERATION_UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.operationUnit = iprot.readString();
              struct.setOperationUnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHIEF_DOCTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.chiefDoctor = iprot.readString();
              struct.setChiefDoctorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TELEPHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.telephone = iprot.readString();
              struct.setTelephoneIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftFamilyDoctorData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.hospital != null) {
        oprot.writeFieldBegin(HOSPITAL_FIELD_DESC);
        oprot.writeString(struct.hospital);
        oprot.writeFieldEnd();
      }
      if (struct.operationUnit != null) {
        oprot.writeFieldBegin(OPERATION_UNIT_FIELD_DESC);
        oprot.writeString(struct.operationUnit);
        oprot.writeFieldEnd();
      }
      if (struct.chiefDoctor != null) {
        oprot.writeFieldBegin(CHIEF_DOCTOR_FIELD_DESC);
        oprot.writeString(struct.chiefDoctor);
        oprot.writeFieldEnd();
      }
      if (struct.telephone != null) {
        oprot.writeFieldBegin(TELEPHONE_FIELD_DESC);
        oprot.writeString(struct.telephone);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftFamilyDoctorDataTupleSchemeFactory implements SchemeFactory {
    public ThriftFamilyDoctorDataTupleScheme getScheme() {
      return new ThriftFamilyDoctorDataTupleScheme();
    }
  }

  private static class ThriftFamilyDoctorDataTupleScheme extends TupleScheme<ThriftFamilyDoctorData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftFamilyDoctorData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetHospital()) {
        optionals.set(1);
      }
      if (struct.isSetOperationUnit()) {
        optionals.set(2);
      }
      if (struct.isSetChiefDoctor()) {
        optionals.set(3);
      }
      if (struct.isSetTelephone()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetHospital()) {
        oprot.writeString(struct.hospital);
      }
      if (struct.isSetOperationUnit()) {
        oprot.writeString(struct.operationUnit);
      }
      if (struct.isSetChiefDoctor()) {
        oprot.writeString(struct.chiefDoctor);
      }
      if (struct.isSetTelephone()) {
        oprot.writeString(struct.telephone);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftFamilyDoctorData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hospital = iprot.readString();
        struct.setHospitalIsSet(true);
      }
      if (incoming.get(2)) {
        struct.operationUnit = iprot.readString();
        struct.setOperationUnitIsSet(true);
      }
      if (incoming.get(3)) {
        struct.chiefDoctor = iprot.readString();
        struct.setChiefDoctorIsSet(true);
      }
      if (incoming.get(4)) {
        struct.telephone = iprot.readString();
        struct.setTelephoneIsSet(true);
      }
    }
  }

}
