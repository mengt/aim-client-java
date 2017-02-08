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
public class DomainBlockInfo implements org.apache.thrift.TBase<DomainBlockInfo, DomainBlockInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DomainBlockInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainBlockInfo");

  private static final org.apache.thrift.protocol.TField CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("capacity", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ALLOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("allocation", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PHYSICAL_FIELD_DESC = new org.apache.thrift.protocol.TField("physical", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DISK_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("diskPath", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainBlockInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainBlockInfoTupleSchemeFactory());
  }

  public long capacity; // required
  public long allocation; // required
  public long physical; // required
  public String diskPath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAPACITY((short)1, "capacity"),
    ALLOCATION((short)2, "allocation"),
    PHYSICAL((short)3, "physical"),
    DISK_PATH((short)4, "diskPath");

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
        case 1: // CAPACITY
          return CAPACITY;
        case 2: // ALLOCATION
          return ALLOCATION;
        case 3: // PHYSICAL
          return PHYSICAL;
        case 4: // DISK_PATH
          return DISK_PATH;
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
  private static final int __CAPACITY_ISSET_ID = 0;
  private static final int __ALLOCATION_ISSET_ID = 1;
  private static final int __PHYSICAL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("capacity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ALLOCATION, new org.apache.thrift.meta_data.FieldMetaData("allocation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PHYSICAL, new org.apache.thrift.meta_data.FieldMetaData("physical", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DISK_PATH, new org.apache.thrift.meta_data.FieldMetaData("diskPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainBlockInfo.class, metaDataMap);
  }

  public DomainBlockInfo() {
  }

  public DomainBlockInfo(
    long capacity,
    long allocation,
    long physical,
    String diskPath)
  {
    this();
    this.capacity = capacity;
    setCapacityIsSet(true);
    this.allocation = allocation;
    setAllocationIsSet(true);
    this.physical = physical;
    setPhysicalIsSet(true);
    this.diskPath = diskPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainBlockInfo(DomainBlockInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.capacity = other.capacity;
    this.allocation = other.allocation;
    this.physical = other.physical;
    if (other.isSetDiskPath()) {
      this.diskPath = other.diskPath;
    }
  }

  public DomainBlockInfo deepCopy() {
    return new DomainBlockInfo(this);
  }

  @Override
  public void clear() {
    setCapacityIsSet(false);
    this.capacity = 0;
    setAllocationIsSet(false);
    this.allocation = 0;
    setPhysicalIsSet(false);
    this.physical = 0;
    this.diskPath = null;
  }

  public long getCapacity() {
    return this.capacity;
  }

  public DomainBlockInfo setCapacity(long capacity) {
    this.capacity = capacity;
    setCapacityIsSet(true);
    return this;
  }

  public void unsetCapacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  /** Returns true if field capacity is set (has been assigned a value) and false otherwise */
  public boolean isSetCapacity() {
    return EncodingUtils.testBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  public void setCapacityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CAPACITY_ISSET_ID, value);
  }

  public long getAllocation() {
    return this.allocation;
  }

  public DomainBlockInfo setAllocation(long allocation) {
    this.allocation = allocation;
    setAllocationIsSet(true);
    return this;
  }

  public void unsetAllocation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALLOCATION_ISSET_ID);
  }

  /** Returns true if field allocation is set (has been assigned a value) and false otherwise */
  public boolean isSetAllocation() {
    return EncodingUtils.testBit(__isset_bitfield, __ALLOCATION_ISSET_ID);
  }

  public void setAllocationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALLOCATION_ISSET_ID, value);
  }

  public long getPhysical() {
    return this.physical;
  }

  public DomainBlockInfo setPhysical(long physical) {
    this.physical = physical;
    setPhysicalIsSet(true);
    return this;
  }

  public void unsetPhysical() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PHYSICAL_ISSET_ID);
  }

  /** Returns true if field physical is set (has been assigned a value) and false otherwise */
  public boolean isSetPhysical() {
    return EncodingUtils.testBit(__isset_bitfield, __PHYSICAL_ISSET_ID);
  }

  public void setPhysicalIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PHYSICAL_ISSET_ID, value);
  }

  public String getDiskPath() {
    return this.diskPath;
  }

  public DomainBlockInfo setDiskPath(String diskPath) {
    this.diskPath = diskPath;
    return this;
  }

  public void unsetDiskPath() {
    this.diskPath = null;
  }

  /** Returns true if field diskPath is set (has been assigned a value) and false otherwise */
  public boolean isSetDiskPath() {
    return this.diskPath != null;
  }

  public void setDiskPathIsSet(boolean value) {
    if (!value) {
      this.diskPath = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CAPACITY:
      if (value == null) {
        unsetCapacity();
      } else {
        setCapacity((Long)value);
      }
      break;

    case ALLOCATION:
      if (value == null) {
        unsetAllocation();
      } else {
        setAllocation((Long)value);
      }
      break;

    case PHYSICAL:
      if (value == null) {
        unsetPhysical();
      } else {
        setPhysical((Long)value);
      }
      break;

    case DISK_PATH:
      if (value == null) {
        unsetDiskPath();
      } else {
        setDiskPath((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CAPACITY:
      return Long.valueOf(getCapacity());

    case ALLOCATION:
      return Long.valueOf(getAllocation());

    case PHYSICAL:
      return Long.valueOf(getPhysical());

    case DISK_PATH:
      return getDiskPath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CAPACITY:
      return isSetCapacity();
    case ALLOCATION:
      return isSetAllocation();
    case PHYSICAL:
      return isSetPhysical();
    case DISK_PATH:
      return isSetDiskPath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainBlockInfo)
      return this.equals((DomainBlockInfo)that);
    return false;
  }

  public boolean equals(DomainBlockInfo that) {
    if (that == null)
      return false;

    boolean this_present_capacity = true;
    boolean that_present_capacity = true;
    if (this_present_capacity || that_present_capacity) {
      if (!(this_present_capacity && that_present_capacity))
        return false;
      if (this.capacity != that.capacity)
        return false;
    }

    boolean this_present_allocation = true;
    boolean that_present_allocation = true;
    if (this_present_allocation || that_present_allocation) {
      if (!(this_present_allocation && that_present_allocation))
        return false;
      if (this.allocation != that.allocation)
        return false;
    }

    boolean this_present_physical = true;
    boolean that_present_physical = true;
    if (this_present_physical || that_present_physical) {
      if (!(this_present_physical && that_present_physical))
        return false;
      if (this.physical != that.physical)
        return false;
    }

    boolean this_present_diskPath = true && this.isSetDiskPath();
    boolean that_present_diskPath = true && that.isSetDiskPath();
    if (this_present_diskPath || that_present_diskPath) {
      if (!(this_present_diskPath && that_present_diskPath))
        return false;
      if (!this.diskPath.equals(that.diskPath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_capacity = true;
    list.add(present_capacity);
    if (present_capacity)
      list.add(capacity);

    boolean present_allocation = true;
    list.add(present_allocation);
    if (present_allocation)
      list.add(allocation);

    boolean present_physical = true;
    list.add(present_physical);
    if (present_physical)
      list.add(physical);

    boolean present_diskPath = true && (isSetDiskPath());
    list.add(present_diskPath);
    if (present_diskPath)
      list.add(diskPath);

    return list.hashCode();
  }

  @Override
  public int compareTo(DomainBlockInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCapacity()).compareTo(other.isSetCapacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capacity, other.capacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAllocation()).compareTo(other.isSetAllocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allocation, other.allocation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhysical()).compareTo(other.isSetPhysical());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhysical()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.physical, other.physical);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDiskPath()).compareTo(other.isSetDiskPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiskPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diskPath, other.diskPath);
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
    StringBuilder sb = new StringBuilder("DomainBlockInfo(");
    boolean first = true;

    sb.append("capacity:");
    sb.append(this.capacity);
    first = false;
    if (!first) sb.append(", ");
    sb.append("allocation:");
    sb.append(this.allocation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("physical:");
    sb.append(this.physical);
    first = false;
    if (!first) sb.append(", ");
    sb.append("diskPath:");
    if (this.diskPath == null) {
      sb.append("null");
    } else {
      sb.append(this.diskPath);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainBlockInfoStandardSchemeFactory implements SchemeFactory {
    public DomainBlockInfoStandardScheme getScheme() {
      return new DomainBlockInfoStandardScheme();
    }
  }

  private static class DomainBlockInfoStandardScheme extends StandardScheme<DomainBlockInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainBlockInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.capacity = iprot.readI64();
              struct.setCapacityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALLOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.allocation = iprot.readI64();
              struct.setAllocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PHYSICAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.physical = iprot.readI64();
              struct.setPhysicalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISK_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.diskPath = iprot.readString();
              struct.setDiskPathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainBlockInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CAPACITY_FIELD_DESC);
      oprot.writeI64(struct.capacity);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALLOCATION_FIELD_DESC);
      oprot.writeI64(struct.allocation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PHYSICAL_FIELD_DESC);
      oprot.writeI64(struct.physical);
      oprot.writeFieldEnd();
      if (struct.diskPath != null) {
        oprot.writeFieldBegin(DISK_PATH_FIELD_DESC);
        oprot.writeString(struct.diskPath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainBlockInfoTupleSchemeFactory implements SchemeFactory {
    public DomainBlockInfoTupleScheme getScheme() {
      return new DomainBlockInfoTupleScheme();
    }
  }

  private static class DomainBlockInfoTupleScheme extends TupleScheme<DomainBlockInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainBlockInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCapacity()) {
        optionals.set(0);
      }
      if (struct.isSetAllocation()) {
        optionals.set(1);
      }
      if (struct.isSetPhysical()) {
        optionals.set(2);
      }
      if (struct.isSetDiskPath()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCapacity()) {
        oprot.writeI64(struct.capacity);
      }
      if (struct.isSetAllocation()) {
        oprot.writeI64(struct.allocation);
      }
      if (struct.isSetPhysical()) {
        oprot.writeI64(struct.physical);
      }
      if (struct.isSetDiskPath()) {
        oprot.writeString(struct.diskPath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainBlockInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.capacity = iprot.readI64();
        struct.setCapacityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.allocation = iprot.readI64();
        struct.setAllocationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.physical = iprot.readI64();
        struct.setPhysicalIsSet(true);
      }
      if (incoming.get(3)) {
        struct.diskPath = iprot.readString();
        struct.setDiskPathIsSet(true);
      }
    }
  }

}

