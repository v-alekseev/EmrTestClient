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
public class ThriftCaseDetailData implements org.apache.thrift.TBase<ThriftCaseDetailData, ThriftCaseDetailData._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftCaseDetailData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftCaseDetailData");

  private static final org.apache.thrift.protocol.TField CASE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("caseData", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PROBLEM_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("problemData", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PROCEDURE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("procedureData", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField ENCOUNTER_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("encounterData", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftCaseDetailDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftCaseDetailDataTupleSchemeFactory());
  }

  public ThriftCaseData caseData; // required
  public ThriftCaseTypeProblemData problemData; // required
  public ThriftCaseTypeProcedureData procedureData; // required
  public ThriftCaseTypeEncounterData encounterData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CASE_DATA((short)1, "caseData"),
    PROBLEM_DATA((short)2, "problemData"),
    PROCEDURE_DATA((short)3, "procedureData"),
    ENCOUNTER_DATA((short)4, "encounterData");

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
        case 1: // CASE_DATA
          return CASE_DATA;
        case 2: // PROBLEM_DATA
          return PROBLEM_DATA;
        case 3: // PROCEDURE_DATA
          return PROCEDURE_DATA;
        case 4: // ENCOUNTER_DATA
          return ENCOUNTER_DATA;
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
    tmpMap.put(_Fields.CASE_DATA, new org.apache.thrift.meta_data.FieldMetaData("caseData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftCaseData.class)));
    tmpMap.put(_Fields.PROBLEM_DATA, new org.apache.thrift.meta_data.FieldMetaData("problemData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftCaseTypeProblemData.class)));
    tmpMap.put(_Fields.PROCEDURE_DATA, new org.apache.thrift.meta_data.FieldMetaData("procedureData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftCaseTypeProcedureData.class)));
    tmpMap.put(_Fields.ENCOUNTER_DATA, new org.apache.thrift.meta_data.FieldMetaData("encounterData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftCaseTypeEncounterData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftCaseDetailData.class, metaDataMap);
  }

  public ThriftCaseDetailData() {
  }

  public ThriftCaseDetailData(
    ThriftCaseData caseData,
    ThriftCaseTypeProblemData problemData,
    ThriftCaseTypeProcedureData procedureData,
    ThriftCaseTypeEncounterData encounterData)
  {
    this();
    this.caseData = caseData;
    this.problemData = problemData;
    this.procedureData = procedureData;
    this.encounterData = encounterData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftCaseDetailData(ThriftCaseDetailData other) {
    if (other.isSetCaseData()) {
      this.caseData = new ThriftCaseData(other.caseData);
    }
    if (other.isSetProblemData()) {
      this.problemData = new ThriftCaseTypeProblemData(other.problemData);
    }
    if (other.isSetProcedureData()) {
      this.procedureData = new ThriftCaseTypeProcedureData(other.procedureData);
    }
    if (other.isSetEncounterData()) {
      this.encounterData = new ThriftCaseTypeEncounterData(other.encounterData);
    }
  }

  public ThriftCaseDetailData deepCopy() {
    return new ThriftCaseDetailData(this);
  }

  @Override
  public void clear() {
    this.caseData = null;
    this.problemData = null;
    this.procedureData = null;
    this.encounterData = null;
  }

  public ThriftCaseData getCaseData() {
    return this.caseData;
  }

  public ThriftCaseDetailData setCaseData(ThriftCaseData caseData) {
    this.caseData = caseData;
    return this;
  }

  public void unsetCaseData() {
    this.caseData = null;
  }

  /** Returns true if field caseData is set (has been assigned a value) and false otherwise */
  public boolean isSetCaseData() {
    return this.caseData != null;
  }

  public void setCaseDataIsSet(boolean value) {
    if (!value) {
      this.caseData = null;
    }
  }

  public ThriftCaseTypeProblemData getProblemData() {
    return this.problemData;
  }

  public ThriftCaseDetailData setProblemData(ThriftCaseTypeProblemData problemData) {
    this.problemData = problemData;
    return this;
  }

  public void unsetProblemData() {
    this.problemData = null;
  }

  /** Returns true if field problemData is set (has been assigned a value) and false otherwise */
  public boolean isSetProblemData() {
    return this.problemData != null;
  }

  public void setProblemDataIsSet(boolean value) {
    if (!value) {
      this.problemData = null;
    }
  }

  public ThriftCaseTypeProcedureData getProcedureData() {
    return this.procedureData;
  }

  public ThriftCaseDetailData setProcedureData(ThriftCaseTypeProcedureData procedureData) {
    this.procedureData = procedureData;
    return this;
  }

  public void unsetProcedureData() {
    this.procedureData = null;
  }

  /** Returns true if field procedureData is set (has been assigned a value) and false otherwise */
  public boolean isSetProcedureData() {
    return this.procedureData != null;
  }

  public void setProcedureDataIsSet(boolean value) {
    if (!value) {
      this.procedureData = null;
    }
  }

  public ThriftCaseTypeEncounterData getEncounterData() {
    return this.encounterData;
  }

  public ThriftCaseDetailData setEncounterData(ThriftCaseTypeEncounterData encounterData) {
    this.encounterData = encounterData;
    return this;
  }

  public void unsetEncounterData() {
    this.encounterData = null;
  }

  /** Returns true if field encounterData is set (has been assigned a value) and false otherwise */
  public boolean isSetEncounterData() {
    return this.encounterData != null;
  }

  public void setEncounterDataIsSet(boolean value) {
    if (!value) {
      this.encounterData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CASE_DATA:
      if (value == null) {
        unsetCaseData();
      } else {
        setCaseData((ThriftCaseData)value);
      }
      break;

    case PROBLEM_DATA:
      if (value == null) {
        unsetProblemData();
      } else {
        setProblemData((ThriftCaseTypeProblemData)value);
      }
      break;

    case PROCEDURE_DATA:
      if (value == null) {
        unsetProcedureData();
      } else {
        setProcedureData((ThriftCaseTypeProcedureData)value);
      }
      break;

    case ENCOUNTER_DATA:
      if (value == null) {
        unsetEncounterData();
      } else {
        setEncounterData((ThriftCaseTypeEncounterData)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CASE_DATA:
      return getCaseData();

    case PROBLEM_DATA:
      return getProblemData();

    case PROCEDURE_DATA:
      return getProcedureData();

    case ENCOUNTER_DATA:
      return getEncounterData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CASE_DATA:
      return isSetCaseData();
    case PROBLEM_DATA:
      return isSetProblemData();
    case PROCEDURE_DATA:
      return isSetProcedureData();
    case ENCOUNTER_DATA:
      return isSetEncounterData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftCaseDetailData)
      return this.equals((ThriftCaseDetailData)that);
    return false;
  }

  public boolean equals(ThriftCaseDetailData that) {
    if (that == null)
      return false;

    boolean this_present_caseData = true && this.isSetCaseData();
    boolean that_present_caseData = true && that.isSetCaseData();
    if (this_present_caseData || that_present_caseData) {
      if (!(this_present_caseData && that_present_caseData))
        return false;
      if (!this.caseData.equals(that.caseData))
        return false;
    }

    boolean this_present_problemData = true && this.isSetProblemData();
    boolean that_present_problemData = true && that.isSetProblemData();
    if (this_present_problemData || that_present_problemData) {
      if (!(this_present_problemData && that_present_problemData))
        return false;
      if (!this.problemData.equals(that.problemData))
        return false;
    }

    boolean this_present_procedureData = true && this.isSetProcedureData();
    boolean that_present_procedureData = true && that.isSetProcedureData();
    if (this_present_procedureData || that_present_procedureData) {
      if (!(this_present_procedureData && that_present_procedureData))
        return false;
      if (!this.procedureData.equals(that.procedureData))
        return false;
    }

    boolean this_present_encounterData = true && this.isSetEncounterData();
    boolean that_present_encounterData = true && that.isSetEncounterData();
    if (this_present_encounterData || that_present_encounterData) {
      if (!(this_present_encounterData && that_present_encounterData))
        return false;
      if (!this.encounterData.equals(that.encounterData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_caseData = true && (isSetCaseData());
    list.add(present_caseData);
    if (present_caseData)
      list.add(caseData);

    boolean present_problemData = true && (isSetProblemData());
    list.add(present_problemData);
    if (present_problemData)
      list.add(problemData);

    boolean present_procedureData = true && (isSetProcedureData());
    list.add(present_procedureData);
    if (present_procedureData)
      list.add(procedureData);

    boolean present_encounterData = true && (isSetEncounterData());
    list.add(present_encounterData);
    if (present_encounterData)
      list.add(encounterData);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftCaseDetailData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCaseData()).compareTo(other.isSetCaseData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCaseData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.caseData, other.caseData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProblemData()).compareTo(other.isSetProblemData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProblemData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.problemData, other.problemData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProcedureData()).compareTo(other.isSetProcedureData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcedureData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.procedureData, other.procedureData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEncounterData()).compareTo(other.isSetEncounterData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEncounterData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.encounterData, other.encounterData);
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
    StringBuilder sb = new StringBuilder("ThriftCaseDetailData(");
    boolean first = true;

    sb.append("caseData:");
    if (this.caseData == null) {
      sb.append("null");
    } else {
      sb.append(this.caseData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("problemData:");
    if (this.problemData == null) {
      sb.append("null");
    } else {
      sb.append(this.problemData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("procedureData:");
    if (this.procedureData == null) {
      sb.append("null");
    } else {
      sb.append(this.procedureData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("encounterData:");
    if (this.encounterData == null) {
      sb.append("null");
    } else {
      sb.append(this.encounterData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (caseData != null) {
      caseData.validate();
    }
    if (problemData != null) {
      problemData.validate();
    }
    if (procedureData != null) {
      procedureData.validate();
    }
    if (encounterData != null) {
      encounterData.validate();
    }
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

  private static class ThriftCaseDetailDataStandardSchemeFactory implements SchemeFactory {
    public ThriftCaseDetailDataStandardScheme getScheme() {
      return new ThriftCaseDetailDataStandardScheme();
    }
  }

  private static class ThriftCaseDetailDataStandardScheme extends StandardScheme<ThriftCaseDetailData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftCaseDetailData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CASE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.caseData = new ThriftCaseData();
              struct.caseData.read(iprot);
              struct.setCaseDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROBLEM_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.problemData = new ThriftCaseTypeProblemData();
              struct.problemData.read(iprot);
              struct.setProblemDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROCEDURE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.procedureData = new ThriftCaseTypeProcedureData();
              struct.procedureData.read(iprot);
              struct.setProcedureDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENCOUNTER_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.encounterData = new ThriftCaseTypeEncounterData();
              struct.encounterData.read(iprot);
              struct.setEncounterDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftCaseDetailData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.caseData != null) {
        oprot.writeFieldBegin(CASE_DATA_FIELD_DESC);
        struct.caseData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.problemData != null) {
        oprot.writeFieldBegin(PROBLEM_DATA_FIELD_DESC);
        struct.problemData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.procedureData != null) {
        oprot.writeFieldBegin(PROCEDURE_DATA_FIELD_DESC);
        struct.procedureData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.encounterData != null) {
        oprot.writeFieldBegin(ENCOUNTER_DATA_FIELD_DESC);
        struct.encounterData.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftCaseDetailDataTupleSchemeFactory implements SchemeFactory {
    public ThriftCaseDetailDataTupleScheme getScheme() {
      return new ThriftCaseDetailDataTupleScheme();
    }
  }

  private static class ThriftCaseDetailDataTupleScheme extends TupleScheme<ThriftCaseDetailData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftCaseDetailData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCaseData()) {
        optionals.set(0);
      }
      if (struct.isSetProblemData()) {
        optionals.set(1);
      }
      if (struct.isSetProcedureData()) {
        optionals.set(2);
      }
      if (struct.isSetEncounterData()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCaseData()) {
        struct.caseData.write(oprot);
      }
      if (struct.isSetProblemData()) {
        struct.problemData.write(oprot);
      }
      if (struct.isSetProcedureData()) {
        struct.procedureData.write(oprot);
      }
      if (struct.isSetEncounterData()) {
        struct.encounterData.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftCaseDetailData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.caseData = new ThriftCaseData();
        struct.caseData.read(iprot);
        struct.setCaseDataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.problemData = new ThriftCaseTypeProblemData();
        struct.problemData.read(iprot);
        struct.setProblemDataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.procedureData = new ThriftCaseTypeProcedureData();
        struct.procedureData.read(iprot);
        struct.setProcedureDataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.encounterData = new ThriftCaseTypeEncounterData();
        struct.encounterData.read(iprot);
        struct.setEncounterDataIsSet(true);
      }
    }
  }

}

