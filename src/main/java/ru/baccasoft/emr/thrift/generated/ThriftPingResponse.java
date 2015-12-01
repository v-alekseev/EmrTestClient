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
public class ThriftPingResponse implements org.apache.thrift.TBase<ThriftPingResponse, ThriftPingResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftPingResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftPingResponse");

  private static final org.apache.thrift.protocol.TField SERVER_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("serverTimestamp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_VERSION_AVAILABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("newVersionAvailable", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("updateUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATE_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("updateMessage", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SHOULD_CLEAN_CLIENT_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("shouldCleanClientData", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftPingResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftPingResponseTupleSchemeFactory());
  }

  public long serverTimestamp; // required
  public boolean newVersionAvailable; // required
  public String updateUrl; // required
  public String updateMessage; // required
  public boolean shouldCleanClientData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVER_TIMESTAMP((short)1, "serverTimestamp"),
    NEW_VERSION_AVAILABLE((short)2, "newVersionAvailable"),
    UPDATE_URL((short)3, "updateUrl"),
    UPDATE_MESSAGE((short)4, "updateMessage"),
    SHOULD_CLEAN_CLIENT_DATA((short)5, "shouldCleanClientData");

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
        case 1: // SERVER_TIMESTAMP
          return SERVER_TIMESTAMP;
        case 2: // NEW_VERSION_AVAILABLE
          return NEW_VERSION_AVAILABLE;
        case 3: // UPDATE_URL
          return UPDATE_URL;
        case 4: // UPDATE_MESSAGE
          return UPDATE_MESSAGE;
        case 5: // SHOULD_CLEAN_CLIENT_DATA
          return SHOULD_CLEAN_CLIENT_DATA;
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
  private static final int __SERVERTIMESTAMP_ISSET_ID = 0;
  private static final int __NEWVERSIONAVAILABLE_ISSET_ID = 1;
  private static final int __SHOULDCLEANCLIENTDATA_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVER_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("serverTimestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NEW_VERSION_AVAILABLE, new org.apache.thrift.meta_data.FieldMetaData("newVersionAvailable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UPDATE_URL, new org.apache.thrift.meta_data.FieldMetaData("updateUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UPDATE_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("updateMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHOULD_CLEAN_CLIENT_DATA, new org.apache.thrift.meta_data.FieldMetaData("shouldCleanClientData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftPingResponse.class, metaDataMap);
  }

  public ThriftPingResponse() {
  }

  public ThriftPingResponse(
    long serverTimestamp,
    boolean newVersionAvailable,
    String updateUrl,
    String updateMessage,
    boolean shouldCleanClientData)
  {
    this();
    this.serverTimestamp = serverTimestamp;
    setServerTimestampIsSet(true);
    this.newVersionAvailable = newVersionAvailable;
    setNewVersionAvailableIsSet(true);
    this.updateUrl = updateUrl;
    this.updateMessage = updateMessage;
    this.shouldCleanClientData = shouldCleanClientData;
    setShouldCleanClientDataIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftPingResponse(ThriftPingResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.serverTimestamp = other.serverTimestamp;
    this.newVersionAvailable = other.newVersionAvailable;
    if (other.isSetUpdateUrl()) {
      this.updateUrl = other.updateUrl;
    }
    if (other.isSetUpdateMessage()) {
      this.updateMessage = other.updateMessage;
    }
    this.shouldCleanClientData = other.shouldCleanClientData;
  }

  public ThriftPingResponse deepCopy() {
    return new ThriftPingResponse(this);
  }

  @Override
  public void clear() {
    setServerTimestampIsSet(false);
    this.serverTimestamp = 0;
    setNewVersionAvailableIsSet(false);
    this.newVersionAvailable = false;
    this.updateUrl = null;
    this.updateMessage = null;
    setShouldCleanClientDataIsSet(false);
    this.shouldCleanClientData = false;
  }

  public long getServerTimestamp() {
    return this.serverTimestamp;
  }

  public ThriftPingResponse setServerTimestamp(long serverTimestamp) {
    this.serverTimestamp = serverTimestamp;
    setServerTimestampIsSet(true);
    return this;
  }

  public void unsetServerTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SERVERTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field serverTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetServerTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __SERVERTIMESTAMP_ISSET_ID);
  }

  public void setServerTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SERVERTIMESTAMP_ISSET_ID, value);
  }

  public boolean isNewVersionAvailable() {
    return this.newVersionAvailable;
  }

  public ThriftPingResponse setNewVersionAvailable(boolean newVersionAvailable) {
    this.newVersionAvailable = newVersionAvailable;
    setNewVersionAvailableIsSet(true);
    return this;
  }

  public void unsetNewVersionAvailable() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEWVERSIONAVAILABLE_ISSET_ID);
  }

  /** Returns true if field newVersionAvailable is set (has been assigned a value) and false otherwise */
  public boolean isSetNewVersionAvailable() {
    return EncodingUtils.testBit(__isset_bitfield, __NEWVERSIONAVAILABLE_ISSET_ID);
  }

  public void setNewVersionAvailableIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEWVERSIONAVAILABLE_ISSET_ID, value);
  }

  public String getUpdateUrl() {
    return this.updateUrl;
  }

  public ThriftPingResponse setUpdateUrl(String updateUrl) {
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

  public String getUpdateMessage() {
    return this.updateMessage;
  }

  public ThriftPingResponse setUpdateMessage(String updateMessage) {
    this.updateMessage = updateMessage;
    return this;
  }

  public void unsetUpdateMessage() {
    this.updateMessage = null;
  }

  /** Returns true if field updateMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateMessage() {
    return this.updateMessage != null;
  }

  public void setUpdateMessageIsSet(boolean value) {
    if (!value) {
      this.updateMessage = null;
    }
  }

  public boolean isShouldCleanClientData() {
    return this.shouldCleanClientData;
  }

  public ThriftPingResponse setShouldCleanClientData(boolean shouldCleanClientData) {
    this.shouldCleanClientData = shouldCleanClientData;
    setShouldCleanClientDataIsSet(true);
    return this;
  }

  public void unsetShouldCleanClientData() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOULDCLEANCLIENTDATA_ISSET_ID);
  }

  /** Returns true if field shouldCleanClientData is set (has been assigned a value) and false otherwise */
  public boolean isSetShouldCleanClientData() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOULDCLEANCLIENTDATA_ISSET_ID);
  }

  public void setShouldCleanClientDataIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOULDCLEANCLIENTDATA_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERVER_TIMESTAMP:
      if (value == null) {
        unsetServerTimestamp();
      } else {
        setServerTimestamp((Long)value);
      }
      break;

    case NEW_VERSION_AVAILABLE:
      if (value == null) {
        unsetNewVersionAvailable();
      } else {
        setNewVersionAvailable((Boolean)value);
      }
      break;

    case UPDATE_URL:
      if (value == null) {
        unsetUpdateUrl();
      } else {
        setUpdateUrl((String)value);
      }
      break;

    case UPDATE_MESSAGE:
      if (value == null) {
        unsetUpdateMessage();
      } else {
        setUpdateMessage((String)value);
      }
      break;

    case SHOULD_CLEAN_CLIENT_DATA:
      if (value == null) {
        unsetShouldCleanClientData();
      } else {
        setShouldCleanClientData((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVER_TIMESTAMP:
      return getServerTimestamp();

    case NEW_VERSION_AVAILABLE:
      return isNewVersionAvailable();

    case UPDATE_URL:
      return getUpdateUrl();

    case UPDATE_MESSAGE:
      return getUpdateMessage();

    case SHOULD_CLEAN_CLIENT_DATA:
      return isShouldCleanClientData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERVER_TIMESTAMP:
      return isSetServerTimestamp();
    case NEW_VERSION_AVAILABLE:
      return isSetNewVersionAvailable();
    case UPDATE_URL:
      return isSetUpdateUrl();
    case UPDATE_MESSAGE:
      return isSetUpdateMessage();
    case SHOULD_CLEAN_CLIENT_DATA:
      return isSetShouldCleanClientData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftPingResponse)
      return this.equals((ThriftPingResponse)that);
    return false;
  }

  public boolean equals(ThriftPingResponse that) {
    if (that == null)
      return false;

    boolean this_present_serverTimestamp = true;
    boolean that_present_serverTimestamp = true;
    if (this_present_serverTimestamp || that_present_serverTimestamp) {
      if (!(this_present_serverTimestamp && that_present_serverTimestamp))
        return false;
      if (this.serverTimestamp != that.serverTimestamp)
        return false;
    }

    boolean this_present_newVersionAvailable = true;
    boolean that_present_newVersionAvailable = true;
    if (this_present_newVersionAvailable || that_present_newVersionAvailable) {
      if (!(this_present_newVersionAvailable && that_present_newVersionAvailable))
        return false;
      if (this.newVersionAvailable != that.newVersionAvailable)
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

    boolean this_present_updateMessage = true && this.isSetUpdateMessage();
    boolean that_present_updateMessage = true && that.isSetUpdateMessage();
    if (this_present_updateMessage || that_present_updateMessage) {
      if (!(this_present_updateMessage && that_present_updateMessage))
        return false;
      if (!this.updateMessage.equals(that.updateMessage))
        return false;
    }

    boolean this_present_shouldCleanClientData = true;
    boolean that_present_shouldCleanClientData = true;
    if (this_present_shouldCleanClientData || that_present_shouldCleanClientData) {
      if (!(this_present_shouldCleanClientData && that_present_shouldCleanClientData))
        return false;
      if (this.shouldCleanClientData != that.shouldCleanClientData)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_serverTimestamp = true;
    list.add(present_serverTimestamp);
    if (present_serverTimestamp)
      list.add(serverTimestamp);

    boolean present_newVersionAvailable = true;
    list.add(present_newVersionAvailable);
    if (present_newVersionAvailable)
      list.add(newVersionAvailable);

    boolean present_updateUrl = true && (isSetUpdateUrl());
    list.add(present_updateUrl);
    if (present_updateUrl)
      list.add(updateUrl);

    boolean present_updateMessage = true && (isSetUpdateMessage());
    list.add(present_updateMessage);
    if (present_updateMessage)
      list.add(updateMessage);

    boolean present_shouldCleanClientData = true;
    list.add(present_shouldCleanClientData);
    if (present_shouldCleanClientData)
      list.add(shouldCleanClientData);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftPingResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetServerTimestamp()).compareTo(other.isSetServerTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverTimestamp, other.serverTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewVersionAvailable()).compareTo(other.isSetNewVersionAvailable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewVersionAvailable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newVersionAvailable, other.newVersionAvailable);
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
    lastComparison = Boolean.valueOf(isSetUpdateMessage()).compareTo(other.isSetUpdateMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateMessage, other.updateMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShouldCleanClientData()).compareTo(other.isSetShouldCleanClientData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShouldCleanClientData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shouldCleanClientData, other.shouldCleanClientData);
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
    StringBuilder sb = new StringBuilder("ThriftPingResponse(");
    boolean first = true;

    sb.append("serverTimestamp:");
    sb.append(this.serverTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("newVersionAvailable:");
    sb.append(this.newVersionAvailable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateUrl:");
    if (this.updateUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.updateUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateMessage:");
    if (this.updateMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.updateMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shouldCleanClientData:");
    sb.append(this.shouldCleanClientData);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftPingResponseStandardSchemeFactory implements SchemeFactory {
    public ThriftPingResponseStandardScheme getScheme() {
      return new ThriftPingResponseStandardScheme();
    }
  }

  private static class ThriftPingResponseStandardScheme extends StandardScheme<ThriftPingResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftPingResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVER_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.serverTimestamp = iprot.readI64();
              struct.setServerTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_VERSION_AVAILABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.newVersionAvailable = iprot.readBool();
              struct.setNewVersionAvailableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateUrl = iprot.readString();
              struct.setUpdateUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATE_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updateMessage = iprot.readString();
              struct.setUpdateMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SHOULD_CLEAN_CLIENT_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.shouldCleanClientData = iprot.readBool();
              struct.setShouldCleanClientDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftPingResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SERVER_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.serverTimestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NEW_VERSION_AVAILABLE_FIELD_DESC);
      oprot.writeBool(struct.newVersionAvailable);
      oprot.writeFieldEnd();
      if (struct.updateUrl != null) {
        oprot.writeFieldBegin(UPDATE_URL_FIELD_DESC);
        oprot.writeString(struct.updateUrl);
        oprot.writeFieldEnd();
      }
      if (struct.updateMessage != null) {
        oprot.writeFieldBegin(UPDATE_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.updateMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SHOULD_CLEAN_CLIENT_DATA_FIELD_DESC);
      oprot.writeBool(struct.shouldCleanClientData);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftPingResponseTupleSchemeFactory implements SchemeFactory {
    public ThriftPingResponseTupleScheme getScheme() {
      return new ThriftPingResponseTupleScheme();
    }
  }

  private static class ThriftPingResponseTupleScheme extends TupleScheme<ThriftPingResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftPingResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetServerTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetNewVersionAvailable()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateUrl()) {
        optionals.set(2);
      }
      if (struct.isSetUpdateMessage()) {
        optionals.set(3);
      }
      if (struct.isSetShouldCleanClientData()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetServerTimestamp()) {
        oprot.writeI64(struct.serverTimestamp);
      }
      if (struct.isSetNewVersionAvailable()) {
        oprot.writeBool(struct.newVersionAvailable);
      }
      if (struct.isSetUpdateUrl()) {
        oprot.writeString(struct.updateUrl);
      }
      if (struct.isSetUpdateMessage()) {
        oprot.writeString(struct.updateMessage);
      }
      if (struct.isSetShouldCleanClientData()) {
        oprot.writeBool(struct.shouldCleanClientData);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftPingResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.serverTimestamp = iprot.readI64();
        struct.setServerTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newVersionAvailable = iprot.readBool();
        struct.setNewVersionAvailableIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateUrl = iprot.readString();
        struct.setUpdateUrlIsSet(true);
      }
      if (incoming.get(3)) {
        struct.updateMessage = iprot.readString();
        struct.setUpdateMessageIsSet(true);
      }
      if (incoming.get(4)) {
        struct.shouldCleanClientData = iprot.readBool();
        struct.setShouldCleanClientDataIsSet(true);
      }
    }
  }

}

