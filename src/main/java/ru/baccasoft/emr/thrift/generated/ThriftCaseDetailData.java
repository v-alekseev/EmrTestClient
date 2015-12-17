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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-15")
public class ThriftCaseDetailData implements org.apache.thrift.TBase<ThriftCaseDetailData, ThriftCaseDetailData._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftCaseDetailData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftCaseDetailData");

  private static final org.apache.thrift.protocol.TField CASE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("caseID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ENCOUNTER_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("encounterData", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField PROBLEM_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("problemData", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PROCEDURE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("procedureData", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MEDICATION_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("medicationData", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftCaseDetailDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftCaseDetailDataTupleSchemeFactory());
  }

  public String caseID; // required
  public ThriftSectionEncounterData encounterData; // required
  public List<ThriftSectionProblemData> problemData; // required
  public List<ThriftSectionProcedureData> procedureData; // required
  public List<ThriftSectionMedicationData> medicationData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CASE_ID((short)1, "caseID"),
    ENCOUNTER_DATA((short)2, "encounterData"),
    PROBLEM_DATA((short)3, "problemData"),
    PROCEDURE_DATA((short)4, "procedureData"),
    MEDICATION_DATA((short)5, "medicationData");

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
        case 2: // ENCOUNTER_DATA
          return ENCOUNTER_DATA;
        case 3: // PROBLEM_DATA
          return PROBLEM_DATA;
        case 4: // PROCEDURE_DATA
          return PROCEDURE_DATA;
        case 5: // MEDICATION_DATA
          return MEDICATION_DATA;
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
    tmpMap.put(_Fields.ENCOUNTER_DATA, new org.apache.thrift.meta_data.FieldMetaData("encounterData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSectionEncounterData.class)));
    tmpMap.put(_Fields.PROBLEM_DATA, new org.apache.thrift.meta_data.FieldMetaData("problemData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSectionProblemData.class))));
    tmpMap.put(_Fields.PROCEDURE_DATA, new org.apache.thrift.meta_data.FieldMetaData("procedureData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSectionProcedureData.class))));
    tmpMap.put(_Fields.MEDICATION_DATA, new org.apache.thrift.meta_data.FieldMetaData("medicationData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSectionMedicationData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftCaseDetailData.class, metaDataMap);
  }

  public ThriftCaseDetailData() {
  }

  public ThriftCaseDetailData(
    String caseID,
    ThriftSectionEncounterData encounterData,
    List<ThriftSectionProblemData> problemData,
    List<ThriftSectionProcedureData> procedureData,
    List<ThriftSectionMedicationData> medicationData)
  {
    this();
    this.caseID = caseID;
    this.encounterData = encounterData;
    this.problemData = problemData;
    this.procedureData = procedureData;
    this.medicationData = medicationData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftCaseDetailData(ThriftCaseDetailData other) {
    if (other.isSetCaseID()) {
      this.caseID = other.caseID;
    }
    if (other.isSetEncounterData()) {
      this.encounterData = new ThriftSectionEncounterData(other.encounterData);
    }
    if (other.isSetProblemData()) {
      List<ThriftSectionProblemData> __this__problemData = new ArrayList<ThriftSectionProblemData>(other.problemData.size());
      for (ThriftSectionProblemData other_element : other.problemData) {
        __this__problemData.add(new ThriftSectionProblemData(other_element));
      }
      this.problemData = __this__problemData;
    }
    if (other.isSetProcedureData()) {
      List<ThriftSectionProcedureData> __this__procedureData = new ArrayList<ThriftSectionProcedureData>(other.procedureData.size());
      for (ThriftSectionProcedureData other_element : other.procedureData) {
        __this__procedureData.add(new ThriftSectionProcedureData(other_element));
      }
      this.procedureData = __this__procedureData;
    }
    if (other.isSetMedicationData()) {
      List<ThriftSectionMedicationData> __this__medicationData = new ArrayList<ThriftSectionMedicationData>(other.medicationData.size());
      for (ThriftSectionMedicationData other_element : other.medicationData) {
        __this__medicationData.add(new ThriftSectionMedicationData(other_element));
      }
      this.medicationData = __this__medicationData;
    }
  }

  public ThriftCaseDetailData deepCopy() {
    return new ThriftCaseDetailData(this);
  }

  @Override
  public void clear() {
    this.caseID = null;
    this.encounterData = null;
    this.problemData = null;
    this.procedureData = null;
    this.medicationData = null;
  }

  public String getCaseID() {
    return this.caseID;
  }

  public ThriftCaseDetailData setCaseID(String caseID) {
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

  public ThriftSectionEncounterData getEncounterData() {
    return this.encounterData;
  }

  public ThriftCaseDetailData setEncounterData(ThriftSectionEncounterData encounterData) {
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

  public int getProblemDataSize() {
    return (this.problemData == null) ? 0 : this.problemData.size();
  }

  public java.util.Iterator<ThriftSectionProblemData> getProblemDataIterator() {
    return (this.problemData == null) ? null : this.problemData.iterator();
  }

  public void addToProblemData(ThriftSectionProblemData elem) {
    if (this.problemData == null) {
      this.problemData = new ArrayList<ThriftSectionProblemData>();
    }
    this.problemData.add(elem);
  }

  public List<ThriftSectionProblemData> getProblemData() {
    return this.problemData;
  }

  public ThriftCaseDetailData setProblemData(List<ThriftSectionProblemData> problemData) {
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

  public int getProcedureDataSize() {
    return (this.procedureData == null) ? 0 : this.procedureData.size();
  }

  public java.util.Iterator<ThriftSectionProcedureData> getProcedureDataIterator() {
    return (this.procedureData == null) ? null : this.procedureData.iterator();
  }

  public void addToProcedureData(ThriftSectionProcedureData elem) {
    if (this.procedureData == null) {
      this.procedureData = new ArrayList<ThriftSectionProcedureData>();
    }
    this.procedureData.add(elem);
  }

  public List<ThriftSectionProcedureData> getProcedureData() {
    return this.procedureData;
  }

  public ThriftCaseDetailData setProcedureData(List<ThriftSectionProcedureData> procedureData) {
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

  public int getMedicationDataSize() {
    return (this.medicationData == null) ? 0 : this.medicationData.size();
  }

  public java.util.Iterator<ThriftSectionMedicationData> getMedicationDataIterator() {
    return (this.medicationData == null) ? null : this.medicationData.iterator();
  }

  public void addToMedicationData(ThriftSectionMedicationData elem) {
    if (this.medicationData == null) {
      this.medicationData = new ArrayList<ThriftSectionMedicationData>();
    }
    this.medicationData.add(elem);
  }

  public List<ThriftSectionMedicationData> getMedicationData() {
    return this.medicationData;
  }

  public ThriftCaseDetailData setMedicationData(List<ThriftSectionMedicationData> medicationData) {
    this.medicationData = medicationData;
    return this;
  }

  public void unsetMedicationData() {
    this.medicationData = null;
  }

  /** Returns true if field medicationData is set (has been assigned a value) and false otherwise */
  public boolean isSetMedicationData() {
    return this.medicationData != null;
  }

  public void setMedicationDataIsSet(boolean value) {
    if (!value) {
      this.medicationData = null;
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

    case ENCOUNTER_DATA:
      if (value == null) {
        unsetEncounterData();
      } else {
        setEncounterData((ThriftSectionEncounterData)value);
      }
      break;

    case PROBLEM_DATA:
      if (value == null) {
        unsetProblemData();
      } else {
        setProblemData((List<ThriftSectionProblemData>)value);
      }
      break;

    case PROCEDURE_DATA:
      if (value == null) {
        unsetProcedureData();
      } else {
        setProcedureData((List<ThriftSectionProcedureData>)value);
      }
      break;

    case MEDICATION_DATA:
      if (value == null) {
        unsetMedicationData();
      } else {
        setMedicationData((List<ThriftSectionMedicationData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CASE_ID:
      return getCaseID();

    case ENCOUNTER_DATA:
      return getEncounterData();

    case PROBLEM_DATA:
      return getProblemData();

    case PROCEDURE_DATA:
      return getProcedureData();

    case MEDICATION_DATA:
      return getMedicationData();

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
    case ENCOUNTER_DATA:
      return isSetEncounterData();
    case PROBLEM_DATA:
      return isSetProblemData();
    case PROCEDURE_DATA:
      return isSetProcedureData();
    case MEDICATION_DATA:
      return isSetMedicationData();
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

    boolean this_present_caseID = true && this.isSetCaseID();
    boolean that_present_caseID = true && that.isSetCaseID();
    if (this_present_caseID || that_present_caseID) {
      if (!(this_present_caseID && that_present_caseID))
        return false;
      if (!this.caseID.equals(that.caseID))
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

    boolean this_present_medicationData = true && this.isSetMedicationData();
    boolean that_present_medicationData = true && that.isSetMedicationData();
    if (this_present_medicationData || that_present_medicationData) {
      if (!(this_present_medicationData && that_present_medicationData))
        return false;
      if (!this.medicationData.equals(that.medicationData))
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

    boolean present_encounterData = true && (isSetEncounterData());
    list.add(present_encounterData);
    if (present_encounterData)
      list.add(encounterData);

    boolean present_problemData = true && (isSetProblemData());
    list.add(present_problemData);
    if (present_problemData)
      list.add(problemData);

    boolean present_procedureData = true && (isSetProcedureData());
    list.add(present_procedureData);
    if (present_procedureData)
      list.add(procedureData);

    boolean present_medicationData = true && (isSetMedicationData());
    list.add(present_medicationData);
    if (present_medicationData)
      list.add(medicationData);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftCaseDetailData other) {
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
    lastComparison = Boolean.valueOf(isSetMedicationData()).compareTo(other.isSetMedicationData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMedicationData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.medicationData, other.medicationData);
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

    sb.append("caseID:");
    if (this.caseID == null) {
      sb.append("null");
    } else {
      sb.append(this.caseID);
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
    sb.append("medicationData:");
    if (this.medicationData == null) {
      sb.append("null");
    } else {
      sb.append(this.medicationData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
          case 1: // CASE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.caseID = iprot.readString();
              struct.setCaseIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENCOUNTER_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.encounterData = new ThriftSectionEncounterData();
              struct.encounterData.read(iprot);
              struct.setEncounterDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROBLEM_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.problemData = new ArrayList<ThriftSectionProblemData>(_list0.size);
                ThriftSectionProblemData _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ThriftSectionProblemData();
                  _elem1.read(iprot);
                  struct.problemData.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setProblemDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROCEDURE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.procedureData = new ArrayList<ThriftSectionProcedureData>(_list3.size);
                ThriftSectionProcedureData _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new ThriftSectionProcedureData();
                  _elem4.read(iprot);
                  struct.procedureData.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setProcedureDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MEDICATION_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.medicationData = new ArrayList<ThriftSectionMedicationData>(_list6.size);
                ThriftSectionMedicationData _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = new ThriftSectionMedicationData();
                  _elem7.read(iprot);
                  struct.medicationData.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setMedicationDataIsSet(true);
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
      if (struct.caseID != null) {
        oprot.writeFieldBegin(CASE_ID_FIELD_DESC);
        oprot.writeString(struct.caseID);
        oprot.writeFieldEnd();
      }
      if (struct.encounterData != null) {
        oprot.writeFieldBegin(ENCOUNTER_DATA_FIELD_DESC);
        struct.encounterData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.problemData != null) {
        oprot.writeFieldBegin(PROBLEM_DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.problemData.size()));
          for (ThriftSectionProblemData _iter9 : struct.problemData)
          {
            _iter9.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.procedureData != null) {
        oprot.writeFieldBegin(PROCEDURE_DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.procedureData.size()));
          for (ThriftSectionProcedureData _iter10 : struct.procedureData)
          {
            _iter10.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.medicationData != null) {
        oprot.writeFieldBegin(MEDICATION_DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.medicationData.size()));
          for (ThriftSectionMedicationData _iter11 : struct.medicationData)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
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
      if (struct.isSetCaseID()) {
        optionals.set(0);
      }
      if (struct.isSetEncounterData()) {
        optionals.set(1);
      }
      if (struct.isSetProblemData()) {
        optionals.set(2);
      }
      if (struct.isSetProcedureData()) {
        optionals.set(3);
      }
      if (struct.isSetMedicationData()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCaseID()) {
        oprot.writeString(struct.caseID);
      }
      if (struct.isSetEncounterData()) {
        struct.encounterData.write(oprot);
      }
      if (struct.isSetProblemData()) {
        {
          oprot.writeI32(struct.problemData.size());
          for (ThriftSectionProblemData _iter12 : struct.problemData)
          {
            _iter12.write(oprot);
          }
        }
      }
      if (struct.isSetProcedureData()) {
        {
          oprot.writeI32(struct.procedureData.size());
          for (ThriftSectionProcedureData _iter13 : struct.procedureData)
          {
            _iter13.write(oprot);
          }
        }
      }
      if (struct.isSetMedicationData()) {
        {
          oprot.writeI32(struct.medicationData.size());
          for (ThriftSectionMedicationData _iter14 : struct.medicationData)
          {
            _iter14.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftCaseDetailData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.caseID = iprot.readString();
        struct.setCaseIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.encounterData = new ThriftSectionEncounterData();
        struct.encounterData.read(iprot);
        struct.setEncounterDataIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.problemData = new ArrayList<ThriftSectionProblemData>(_list15.size);
          ThriftSectionProblemData _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = new ThriftSectionProblemData();
            _elem16.read(iprot);
            struct.problemData.add(_elem16);
          }
        }
        struct.setProblemDataIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.procedureData = new ArrayList<ThriftSectionProcedureData>(_list18.size);
          ThriftSectionProcedureData _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = new ThriftSectionProcedureData();
            _elem19.read(iprot);
            struct.procedureData.add(_elem19);
          }
        }
        struct.setProcedureDataIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.medicationData = new ArrayList<ThriftSectionMedicationData>(_list21.size);
          ThriftSectionMedicationData _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new ThriftSectionMedicationData();
            _elem22.read(iprot);
            struct.medicationData.add(_elem22);
          }
        }
        struct.setMedicationDataIsSet(true);
      }
    }
  }

}

