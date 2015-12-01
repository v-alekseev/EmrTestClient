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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-01")
public class ThriftException extends TException implements org.apache.thrift.TBase<ThriftException, ThriftException._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftException");

  private static final org.apache.thrift.protocol.TField TYPE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("typeCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LOG_ERROR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("logErrorMsg", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_ERROR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("userErrorMsg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("updateUrl", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftExceptionTupleSchemeFactory());
  }

  /**
   * 
   * @see ThriftExceptionType
   */
  public ThriftExceptionType typeCode; // required
  public String logErrorMsg; // required
  public String userErrorMsg; // required
  public String updateUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ThriftExceptionType
     */
    TYPE_CODE((short)1, "typeCode"),
    LOG_ERROR_MSG((short)2, "logErrorMsg"),
    USER_ERROR_MSG((short)3, "userErrorMsg"),
    UPDATE_URL((short)4, "updateUrl");

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
        case 1: // TYPE_CODE
          return TYPE_CODE;
        case 2: // LOG_ERROR_MSG
          return LOG_ERROR_MSG;
        case 3: // USER_ERROR_MSG
          return USER_ERROR_MSG;
        case 4: // UPDATE_URL
          return UPDATE_URL;
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
    tmpMap.put(_Fields.TYPE_CODE, new org.apache.thrift.meta_data.FieldMetaData("typeCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftExceptionType.class)));
    tmpMap.put(_Fields.LOG_ERROR_MSG, new org.apache.thrift.meta_data.FieldMetaData("logErrorMsg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ERROR_MSG, new org.apache.thrift.meta_data.FieldMetaData("userErrorMsg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_URL, new org.apache.thrift.meta_data.FieldMetaData("updateUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftException.class, metaDataMap);
  }

  public ThriftException() {
  }

  public ThriftException(
    ThriftExceptionType typeCode,
    String logErrorMsg,
    String userErrorMsg,
    String updateUrl)
  {
    this();
    this.typeCode = typeCode;
    this.logErrorMsg = logErrorMsg;
    this.userErrorMsg = userErrorMsg;
    this.updateUrl = updateUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftException(ThriftException other) {
    if (other.isSetTypeCode()) {
      this.typeCode = other.typeCode;
    }
    if (other.isSetLogErrorMsg()) {
      this.logErrorMsg = other.logErrorMsg;
    }
    if (other.isSetUserErrorMsg()) {
      this.userErrorMsg = other.userErrorMsg;
    }
    if (other.isSetUpdateUrl()) {
      this.updateUrl = other.updateUrl;
    }
  }

  public ThriftException deepCopy() {
    return new ThriftException(this);
  }

  @Override
  public void clear() {
    this.typeCode = null;
    this.logErrorMsg = null;
    this.userErrorMsg = null;
    this.updateUrl = null;
  }

  /**
   * 
   * @see ThriftExceptionType
   */
  public ThriftExceptionType getTypeCode() {
    return this.typeCode;
  }

  /**
   * 
   * @see ThriftExceptionType
   */
  public ThriftException setTypeCode(ThriftExceptionType typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  public void unsetTypeCode() {
    this.typeCode = null;
  }

  /** Returns true if field typeCode is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeCode() {
    return this.typeCode != null;
  }

  public void setTypeCodeIsSet(boolean value) {
    if (!value) {
      this.typeCode = null;
    }
  }

  public String getLogErrorMsg() {
    return this.logErrorMsg;
  }

  public ThriftException setLogErrorMsg(String logErrorMsg) {
    this.logErrorMsg = logErrorMsg;
    return this;
  }

  public void unsetLogErrorMsg() {
    this.logErrorMsg = null;
  }

  /** Returns true if field logErrorMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetLogErrorMsg() {
    return this.logErrorMsg != null;
  }

  public void setLogErrorMsgIsSet(boolean value) {
    if (!value) {
      this.logErrorMsg = null;
    }
  }

  public String getUserErrorMsg() {
    return this.userErrorMsg;
  }

  public ThriftException setUserErrorMsg(String userErrorMsg) {
    this.userErrorMsg = userErrorMsg;
    return this;
  }

  public void unsetUserErrorMsg() {
    this.userErrorMsg = null;
  }

  /** Returns true if field userErrorMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetUserErrorMsg() {
    return this.userErrorMsg != null;
  }

  public void setUserErrorMsgIsSet(boolean value) {
    if (!value) {
      this.userErrorMsg = null;
    }
  }

  public String getUpdateUrl() {
    return this.updateUrl;
  }

  public ThriftException setUpdateUrl(String updateUrl) {
    this.updateUrl = updateUrl;
    return this;
  }

  public void unsetUpdateUrl() {
    this.updateUrl = null;
  }

  /** Returns true if field updateUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateUrl() {
    return this.updateUrl != null;
  }

  public void setUpdateUrlIsSet(boolean value) {
    if (!value) {
      this.updateUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE_CODE:
      if (value == null) {
        unsetTypeCode();
      } else {
        setTypeCode((ThriftExceptionType)value);
      }
      break;

    case LOG_ERROR_MSG:
      if (value == null) {
        unsetLogErrorMsg();
      } else {
        setLogErrorMsg((String)value);
      }
      break;

    case USER_ERROR_MSG:
      if (value == null) {
        unsetUserErrorMsg();
      } else {
        setUserErrorMsg((String)value);
      }
      break;

    case UPDATE_URL:
      if (value == null) {
        unsetUpdateUrl();
      } else {
        setUpdateUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE_CODE:
      return getTypeCode();

    case LOG_ERROR_MSG:
      return getLogErrorMsg();

    case USER_ERROR_MSG:
      return getUserErrorMsg();

    case UPDATE_URL:
      return getUpdateUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE_CODE:
      return isSetTypeCode();
    case LOG_ERROR_MSG:
      return isSetLogErrorMsg();
    case USER_ERROR_MSG:
      return isSetUserErrorMsg();
    case UPDATE_URL:
      return isSetUpdateUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftException)
      return this.equals((ThriftException)that);
    return false;
  }

  public boolean equals(ThriftException that) {
    if (that == null)
      return false;

    boolean this_present_typeCode = true && this.isSetTypeCode();
    boolean that_present_typeCode = true && that.isSetTypeCode();
    if (this_present_typeCode || that_present_typeCode) {
      if (!(this_present_typeCode && that_present_typeCode))
        return false;
      if (!this.typeCode.equals(that.typeCode))
        return false;
    }

    boolean this_present_logErrorMsg = true && this.isSetLogErrorMsg();
    boolean that_present_logErrorMsg = true && that.isSetLogErrorMsg();
    if (this_present_logErrorMsg || that_present_logErrorMsg) {
      if (!(this_present_logErrorMsg && that_present_logErrorMsg))
        return false;
      if (!this.logErrorMsg.equals(that.logErrorMsg))
        return false;
    }

    boolean this_present_userErrorMsg = true && this.isSetUserErrorMsg();
    boolean that_present_userErrorMsg = true && that.isSetUserErrorMsg();
    if (this_present_userErrorMsg || that_present_userErrorMsg) {
      if (!(this_present_userErrorMsg && that_present_userErrorMsg))
        return false;
      if (!this.userErrorMsg.equals(that.userErrorMsg))
        return false;
    }

    boolean this_present_updateUrl = true && this.isSetUpdateUrl();
    boolean that_present_updateUrl = true && that.isSetUpdateUrl();
    if (this_present_updateUrl || that_present_updateUrl) {
      if (!(this_present_updateUrl && that_present_updateUrl))
        return false;
      if (!this.updateUrl.equals(that.updateUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_typeCode = true && (isSetTypeCode());
    list.add(present_typeCode);
    if (present_typeCode)
      list.add(typeCode.getValue());

    boolean present_logErrorMsg = true && (isSetLogErrorMsg());
    list.add(present_logErrorMsg);
    if (present_logErrorMsg)
      list.add(logErrorMsg);

    boolean present_userErrorMsg = true && (isSetUserErrorMsg());
    list.add(present_userErrorMsg);
    if (present_userErrorMsg)
      list.add(userErrorMsg);

    boolean present_updateUrl = true && (isSetUpdateUrl());
    list.add(present_updateUrl);
    if (present_updateUrl)
      list.add(updateUrl);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTypeCode()).compareTo(other.isSetTypeCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeCode, other.typeCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogErrorMsg()).compareTo(other.isSetLogErrorMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogErrorMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logErrorMsg, other.logErrorMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserErrorMsg()).compareTo(other.isSetUserErrorMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserErrorMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userErrorMsg, other.userErrorMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateUrl()).compareTo(other.isSetUpdateUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateUrl, other.updateUrl);
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
    StringBuilder sb = new StringBuilder("ThriftException(");
    boolean first = true;

    sb.append("typeCode:");
    if (this.typeCode == null) {
      sb.append("null");
    } else {
      sb.append(this.typeCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("logErrorMsg:");
    if (this.logErrorMsg == null) {
      sb.append("null");
    } else {
      sb.append(this.logErrorMsg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userErrorMsg:");
    if (this.userErrorMsg == null) {
      sb.append("null");
    } else {
      sb.append(this.userErrorMsg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateUrl:");
    if (this.updateUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.updateUrl);
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

  private static class ThriftExceptionStandardSchemeFactory implements SchemeFactory {
    public ThriftExceptionStandardScheme getScheme() {
      return new ThriftExceptionStandardScheme();
    }
  }

  private static class ThriftExceptionStandardScheme extends StandardScheme<ThriftException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.typeCode = ru.baccasoft.emr.thrift.generated.ThriftExceptionType.findByValue(iprot.readI32());
              struct.setTypeCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOG_ERROR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.logErrorMsg = iprot.readString();
              struct.setLogErrorMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_ERROR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userErrorMsg = iprot.readString();
              struct.setUserErrorMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateUrl = iprot.readString();
              struct.setUpdateUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.typeCode != null) {
        oprot.writeFieldBegin(TYPE_CODE_FIELD_DESC);
        oprot.writeI32(struct.typeCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.logErrorMsg != null) {
        oprot.writeFieldBegin(LOG_ERROR_MSG_FIELD_DESC);
        oprot.writeString(struct.logErrorMsg);
        oprot.writeFieldEnd();
      }
      if (struct.userErrorMsg != null) {
        oprot.writeFieldBegin(USER_ERROR_MSG_FIELD_DESC);
        oprot.writeString(struct.userErrorMsg);
        oprot.writeFieldEnd();
      }
      if (struct.updateUrl != null) {
        oprot.writeFieldBegin(UPDATE_URL_FIELD_DESC);
        oprot.writeString(struct.updateUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftExceptionTupleSchemeFactory implements SchemeFactory {
    public ThriftExceptionTupleScheme getScheme() {
      return new ThriftExceptionTupleScheme();
    }
  }

  private static class ThriftExceptionTupleScheme extends TupleScheme<ThriftException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTypeCode()) {
        optionals.set(0);
      }
      if (struct.isSetLogErrorMsg()) {
        optionals.set(1);
      }
      if (struct.isSetUserErrorMsg()) {
        optionals.set(2);
      }
      if (struct.isSetUpdateUrl()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTypeCode()) {
        oprot.writeI32(struct.typeCode.getValue());
      }
      if (struct.isSetLogErrorMsg()) {
        oprot.writeString(struct.logErrorMsg);
      }
      if (struct.isSetUserErrorMsg()) {
        oprot.writeString(struct.userErrorMsg);
      }
      if (struct.isSetUpdateUrl()) {
        oprot.writeString(struct.updateUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.typeCode = ru.baccasoft.emr.thrift.generated.ThriftExceptionType.findByValue(iprot.readI32());
        struct.setTypeCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.logErrorMsg = iprot.readString();
        struct.setLogErrorMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.userErrorMsg = iprot.readString();
        struct.setUserErrorMsgIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updateUrl = iprot.readString();
        struct.setUpdateUrlIsSet(true);
      }
    }
  }

}

