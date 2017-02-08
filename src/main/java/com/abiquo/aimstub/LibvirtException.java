/**
 * Copyright (C) 2008 - Abiquo Holdings S.L. All rights reserved.
 *
 * Please see /opt/abiquo/tomcat/webapps/legal/ on Abiquo server
 * or contact contact@abiquo.com for licensing information.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.abiquo.aimstub;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-2-8")
public class LibvirtException extends TException implements org.apache.thrift.TBase<LibvirtException, LibvirtException._Fields>, java.io.Serializable, Cloneable, Comparable<LibvirtException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LibvirtException");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("domain", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("level", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField STR1_FIELD_DESC = new org.apache.thrift.protocol.TField("str1", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField STR2_FIELD_DESC = new org.apache.thrift.protocol.TField("str2", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField STR3_FIELD_DESC = new org.apache.thrift.protocol.TField("str3", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField INT1_FIELD_DESC = new org.apache.thrift.protocol.TField("int1", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField INT2_FIELD_DESC = new org.apache.thrift.protocol.TField("int2", org.apache.thrift.protocol.TType.I32, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LibvirtExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LibvirtExceptionTupleSchemeFactory());
  }

  public int code; // required
  public int domain; // required
  public String msg; // required
  public int level; // required
  public String str1; // required
  public String str2; // required
  public String str3; // required
  public int int1; // required
  public int int2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    DOMAIN((short)2, "domain"),
    MSG((short)3, "msg"),
    LEVEL((short)4, "level"),
    STR1((short)5, "str1"),
    STR2((short)6, "str2"),
    STR3((short)7, "str3"),
    INT1((short)8, "int1"),
    INT2((short)9, "int2");

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
        case 1: // CODE
          return CODE;
        case 2: // DOMAIN
          return DOMAIN;
        case 3: // MSG
          return MSG;
        case 4: // LEVEL
          return LEVEL;
        case 5: // STR1
          return STR1;
        case 6: // STR2
          return STR2;
        case 7: // STR3
          return STR3;
        case 8: // INT1
          return INT1;
        case 9: // INT2
          return INT2;
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
  private static final int __CODE_ISSET_ID = 0;
  private static final int __DOMAIN_ISSET_ID = 1;
  private static final int __LEVEL_ISSET_ID = 2;
  private static final int __INT1_ISSET_ID = 3;
  private static final int __INT2_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("domain", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEVEL, new org.apache.thrift.meta_data.FieldMetaData("level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STR1, new org.apache.thrift.meta_data.FieldMetaData("str1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STR2, new org.apache.thrift.meta_data.FieldMetaData("str2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STR3, new org.apache.thrift.meta_data.FieldMetaData("str3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INT1, new org.apache.thrift.meta_data.FieldMetaData("int1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.INT2, new org.apache.thrift.meta_data.FieldMetaData("int2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LibvirtException.class, metaDataMap);
  }

  public LibvirtException() {
  }

  public LibvirtException(
    int code,
    int domain,
    String msg,
    int level,
    String str1,
    String str2,
    String str3,
    int int1,
    int int2)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
    this.domain = domain;
    setDomainIsSet(true);
    this.msg = msg;
    this.level = level;
    setLevelIsSet(true);
    this.str1 = str1;
    this.str2 = str2;
    this.str3 = str3;
    this.int1 = int1;
    setInt1IsSet(true);
    this.int2 = int2;
    setInt2IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LibvirtException(LibvirtException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.code = other.code;
    this.domain = other.domain;
    if (other.isSetMsg()) {
      this.msg = other.msg;
    }
    this.level = other.level;
    if (other.isSetStr1()) {
      this.str1 = other.str1;
    }
    if (other.isSetStr2()) {
      this.str2 = other.str2;
    }
    if (other.isSetStr3()) {
      this.str3 = other.str3;
    }
    this.int1 = other.int1;
    this.int2 = other.int2;
  }

  public LibvirtException deepCopy() {
    return new LibvirtException(this);
  }

  @Override
  public void clear() {
    setCodeIsSet(false);
    this.code = 0;
    setDomainIsSet(false);
    this.domain = 0;
    this.msg = null;
    setLevelIsSet(false);
    this.level = 0;
    this.str1 = null;
    this.str2 = null;
    this.str3 = null;
    setInt1IsSet(false);
    this.int1 = 0;
    setInt2IsSet(false);
    this.int2 = 0;
  }

  public int getCode() {
    return this.code;
  }

  public LibvirtException setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  public int getDomain() {
    return this.domain;
  }

  public LibvirtException setDomain(int domain) {
    this.domain = domain;
    setDomainIsSet(true);
    return this;
  }

  public void unsetDomain() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DOMAIN_ISSET_ID);
  }

  /** Returns true if field domain is set (has been assigned a value) and false otherwise */
  public boolean isSetDomain() {
    return EncodingUtils.testBit(__isset_bitfield, __DOMAIN_ISSET_ID);
  }

  public void setDomainIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DOMAIN_ISSET_ID, value);
  }

  public String getMsg() {
    return this.msg;
  }

  public LibvirtException setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public int getLevel() {
    return this.level;
  }

  public LibvirtException setLevel(int level) {
    this.level = level;
    setLevelIsSet(true);
    return this;
  }

  public void unsetLevel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  /** Returns true if field level is set (has been assigned a value) and false otherwise */
  public boolean isSetLevel() {
    return EncodingUtils.testBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  public void setLevelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEVEL_ISSET_ID, value);
  }

  public String getStr1() {
    return this.str1;
  }

  public LibvirtException setStr1(String str1) {
    this.str1 = str1;
    return this;
  }

  public void unsetStr1() {
    this.str1 = null;
  }

  /** Returns true if field str1 is set (has been assigned a value) and false otherwise */
  public boolean isSetStr1() {
    return this.str1 != null;
  }

  public void setStr1IsSet(boolean value) {
    if (!value) {
      this.str1 = null;
    }
  }

  public String getStr2() {
    return this.str2;
  }

  public LibvirtException setStr2(String str2) {
    this.str2 = str2;
    return this;
  }

  public void unsetStr2() {
    this.str2 = null;
  }

  /** Returns true if field str2 is set (has been assigned a value) and false otherwise */
  public boolean isSetStr2() {
    return this.str2 != null;
  }

  public void setStr2IsSet(boolean value) {
    if (!value) {
      this.str2 = null;
    }
  }

  public String getStr3() {
    return this.str3;
  }

  public LibvirtException setStr3(String str3) {
    this.str3 = str3;
    return this;
  }

  public void unsetStr3() {
    this.str3 = null;
  }

  /** Returns true if field str3 is set (has been assigned a value) and false otherwise */
  public boolean isSetStr3() {
    return this.str3 != null;
  }

  public void setStr3IsSet(boolean value) {
    if (!value) {
      this.str3 = null;
    }
  }

  public int getInt1() {
    return this.int1;
  }

  public LibvirtException setInt1(int int1) {
    this.int1 = int1;
    setInt1IsSet(true);
    return this;
  }

  public void unsetInt1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INT1_ISSET_ID);
  }

  /** Returns true if field int1 is set (has been assigned a value) and false otherwise */
  public boolean isSetInt1() {
    return EncodingUtils.testBit(__isset_bitfield, __INT1_ISSET_ID);
  }

  public void setInt1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INT1_ISSET_ID, value);
  }

  public int getInt2() {
    return this.int2;
  }

  public LibvirtException setInt2(int int2) {
    this.int2 = int2;
    setInt2IsSet(true);
    return this;
  }

  public void unsetInt2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INT2_ISSET_ID);
  }

  /** Returns true if field int2 is set (has been assigned a value) and false otherwise */
  public boolean isSetInt2() {
    return EncodingUtils.testBit(__isset_bitfield, __INT2_ISSET_ID);
  }

  public void setInt2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INT2_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    case DOMAIN:
      if (value == null) {
        unsetDomain();
      } else {
        setDomain((Integer)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((String)value);
      }
      break;

    case LEVEL:
      if (value == null) {
        unsetLevel();
      } else {
        setLevel((Integer)value);
      }
      break;

    case STR1:
      if (value == null) {
        unsetStr1();
      } else {
        setStr1((String)value);
      }
      break;

    case STR2:
      if (value == null) {
        unsetStr2();
      } else {
        setStr2((String)value);
      }
      break;

    case STR3:
      if (value == null) {
        unsetStr3();
      } else {
        setStr3((String)value);
      }
      break;

    case INT1:
      if (value == null) {
        unsetInt1();
      } else {
        setInt1((Integer)value);
      }
      break;

    case INT2:
      if (value == null) {
        unsetInt2();
      } else {
        setInt2((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return Integer.valueOf(getCode());

    case DOMAIN:
      return Integer.valueOf(getDomain());

    case MSG:
      return getMsg();

    case LEVEL:
      return Integer.valueOf(getLevel());

    case STR1:
      return getStr1();

    case STR2:
      return getStr2();

    case STR3:
      return getStr3();

    case INT1:
      return Integer.valueOf(getInt1());

    case INT2:
      return Integer.valueOf(getInt2());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case DOMAIN:
      return isSetDomain();
    case MSG:
      return isSetMsg();
    case LEVEL:
      return isSetLevel();
    case STR1:
      return isSetStr1();
    case STR2:
      return isSetStr2();
    case STR3:
      return isSetStr3();
    case INT1:
      return isSetInt1();
    case INT2:
      return isSetInt2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LibvirtException)
      return this.equals((LibvirtException)that);
    return false;
  }

  public boolean equals(LibvirtException that) {
    if (that == null)
      return false;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    boolean this_present_domain = true;
    boolean that_present_domain = true;
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (this.domain != that.domain)
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    boolean this_present_level = true;
    boolean that_present_level = true;
    if (this_present_level || that_present_level) {
      if (!(this_present_level && that_present_level))
        return false;
      if (this.level != that.level)
        return false;
    }

    boolean this_present_str1 = true && this.isSetStr1();
    boolean that_present_str1 = true && that.isSetStr1();
    if (this_present_str1 || that_present_str1) {
      if (!(this_present_str1 && that_present_str1))
        return false;
      if (!this.str1.equals(that.str1))
        return false;
    }

    boolean this_present_str2 = true && this.isSetStr2();
    boolean that_present_str2 = true && that.isSetStr2();
    if (this_present_str2 || that_present_str2) {
      if (!(this_present_str2 && that_present_str2))
        return false;
      if (!this.str2.equals(that.str2))
        return false;
    }

    boolean this_present_str3 = true && this.isSetStr3();
    boolean that_present_str3 = true && that.isSetStr3();
    if (this_present_str3 || that_present_str3) {
      if (!(this_present_str3 && that_present_str3))
        return false;
      if (!this.str3.equals(that.str3))
        return false;
    }

    boolean this_present_int1 = true;
    boolean that_present_int1 = true;
    if (this_present_int1 || that_present_int1) {
      if (!(this_present_int1 && that_present_int1))
        return false;
      if (this.int1 != that.int1)
        return false;
    }

    boolean this_present_int2 = true;
    boolean that_present_int2 = true;
    if (this_present_int2 || that_present_int2) {
      if (!(this_present_int2 && that_present_int2))
        return false;
      if (this.int2 != that.int2)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_code = true;
    list.add(present_code);
    if (present_code)
      list.add(code);

    boolean present_domain = true;
    list.add(present_domain);
    if (present_domain)
      list.add(domain);

    boolean present_msg = true && (isSetMsg());
    list.add(present_msg);
    if (present_msg)
      list.add(msg);

    boolean present_level = true;
    list.add(present_level);
    if (present_level)
      list.add(level);

    boolean present_str1 = true && (isSetStr1());
    list.add(present_str1);
    if (present_str1)
      list.add(str1);

    boolean present_str2 = true && (isSetStr2());
    list.add(present_str2);
    if (present_str2)
      list.add(str2);

    boolean present_str3 = true && (isSetStr3());
    list.add(present_str3);
    if (present_str3)
      list.add(str3);

    boolean present_int1 = true;
    list.add(present_int1);
    if (present_int1)
      list.add(int1);

    boolean present_int2 = true;
    list.add(present_int2);
    if (present_int2)
      list.add(int2);

    return list.hashCode();
  }

  @Override
  public int compareTo(LibvirtException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDomain()).compareTo(other.isSetDomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain, other.domain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMsg()).compareTo(other.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLevel()).compareTo(other.isSetLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.level, other.level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStr1()).compareTo(other.isSetStr1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStr1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str1, other.str1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStr2()).compareTo(other.isSetStr2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStr2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str2, other.str2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStr3()).compareTo(other.isSetStr3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStr3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str3, other.str3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInt1()).compareTo(other.isSetInt1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInt1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.int1, other.int1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInt2()).compareTo(other.isSetInt2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInt2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.int2, other.int2);
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
    StringBuilder sb = new StringBuilder("LibvirtException(");
    boolean first = true;

    sb.append("code:");
    sb.append(this.code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("domain:");
    sb.append(this.domain);
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("level:");
    sb.append(this.level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("str1:");
    if (this.str1 == null) {
      sb.append("null");
    } else {
      sb.append(this.str1);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("str2:");
    if (this.str2 == null) {
      sb.append("null");
    } else {
      sb.append(this.str2);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("str3:");
    if (this.str3 == null) {
      sb.append("null");
    } else {
      sb.append(this.str3);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("int1:");
    sb.append(this.int1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("int2:");
    sb.append(this.int2);
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

  private static class LibvirtExceptionStandardSchemeFactory implements SchemeFactory {
    public LibvirtExceptionStandardScheme getScheme() {
      return new LibvirtExceptionStandardScheme();
    }
  }

  private static class LibvirtExceptionStandardScheme extends StandardScheme<LibvirtException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LibvirtException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.domain = iprot.readI32();
              struct.setDomainIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.msg = iprot.readString();
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.level = iprot.readI32();
              struct.setLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STR1
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str1 = iprot.readString();
              struct.setStr1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STR2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str2 = iprot.readString();
              struct.setStr2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STR3
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.str3 = iprot.readString();
              struct.setStr3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // INT1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.int1 = iprot.readI32();
              struct.setInt1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // INT2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.int2 = iprot.readI32();
              struct.setInt2IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LibvirtException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(struct.code);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
      oprot.writeI32(struct.domain);
      oprot.writeFieldEnd();
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        oprot.writeString(struct.msg);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEVEL_FIELD_DESC);
      oprot.writeI32(struct.level);
      oprot.writeFieldEnd();
      if (struct.str1 != null) {
        oprot.writeFieldBegin(STR1_FIELD_DESC);
        oprot.writeString(struct.str1);
        oprot.writeFieldEnd();
      }
      if (struct.str2 != null) {
        oprot.writeFieldBegin(STR2_FIELD_DESC);
        oprot.writeString(struct.str2);
        oprot.writeFieldEnd();
      }
      if (struct.str3 != null) {
        oprot.writeFieldBegin(STR3_FIELD_DESC);
        oprot.writeString(struct.str3);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INT1_FIELD_DESC);
      oprot.writeI32(struct.int1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(INT2_FIELD_DESC);
      oprot.writeI32(struct.int2);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LibvirtExceptionTupleSchemeFactory implements SchemeFactory {
    public LibvirtExceptionTupleScheme getScheme() {
      return new LibvirtExceptionTupleScheme();
    }
  }

  private static class LibvirtExceptionTupleScheme extends TupleScheme<LibvirtException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LibvirtException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetDomain()) {
        optionals.set(1);
      }
      if (struct.isSetMsg()) {
        optionals.set(2);
      }
      if (struct.isSetLevel()) {
        optionals.set(3);
      }
      if (struct.isSetStr1()) {
        optionals.set(4);
      }
      if (struct.isSetStr2()) {
        optionals.set(5);
      }
      if (struct.isSetStr3()) {
        optionals.set(6);
      }
      if (struct.isSetInt1()) {
        optionals.set(7);
      }
      if (struct.isSetInt2()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code);
      }
      if (struct.isSetDomain()) {
        oprot.writeI32(struct.domain);
      }
      if (struct.isSetMsg()) {
        oprot.writeString(struct.msg);
      }
      if (struct.isSetLevel()) {
        oprot.writeI32(struct.level);
      }
      if (struct.isSetStr1()) {
        oprot.writeString(struct.str1);
      }
      if (struct.isSetStr2()) {
        oprot.writeString(struct.str2);
      }
      if (struct.isSetStr3()) {
        oprot.writeString(struct.str3);
      }
      if (struct.isSetInt1()) {
        oprot.writeI32(struct.int1);
      }
      if (struct.isSetInt2()) {
        oprot.writeI32(struct.int2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LibvirtException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.code = iprot.readI32();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.domain = iprot.readI32();
        struct.setDomainIsSet(true);
      }
      if (incoming.get(2)) {
        struct.msg = iprot.readString();
        struct.setMsgIsSet(true);
      }
      if (incoming.get(3)) {
        struct.level = iprot.readI32();
        struct.setLevelIsSet(true);
      }
      if (incoming.get(4)) {
        struct.str1 = iprot.readString();
        struct.setStr1IsSet(true);
      }
      if (incoming.get(5)) {
        struct.str2 = iprot.readString();
        struct.setStr2IsSet(true);
      }
      if (incoming.get(6)) {
        struct.str3 = iprot.readString();
        struct.setStr3IsSet(true);
      }
      if (incoming.get(7)) {
        struct.int1 = iprot.readI32();
        struct.setInt1IsSet(true);
      }
      if (incoming.get(8)) {
        struct.int2 = iprot.readI32();
        struct.setInt2IsSet(true);
      }
    }
  }

}

