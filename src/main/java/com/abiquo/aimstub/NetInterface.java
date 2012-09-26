/**
 * Copyright (C) 2008 - Abiquo Holdings S.L. All rights reserved.
 *
 * Please see /opt/abiquo/tomcat/webapps/legal/ on Abiquo server
 * or contact contact@abiquo.com for licensing information.
 */
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.abiquo.aimstub;

import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.TFieldRequirementType;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TType;

public class NetInterface implements TBase<NetInterface._Fields>, java.io.Serializable, Cloneable,
    Comparable<NetInterface>
{
    private static final TStruct STRUCT_DESC = new TStruct("NetInterface");

    private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short) 1);

    private static final TField ADDRESS_FIELD_DESC = new TField("address", TType.STRING, (short) 2);

    private static final TField PHYSICAL_ADDRESS_FIELD_DESC = new TField("physicalAddress",
        TType.STRING,
        (short) 3);

    public String name;

    public String address;

    public String physicalAddress;

    /**
     * The set of fields this struct contains, along with convenience methods for finding and
     * manipulating them.
     */
    public enum _Fields implements TFieldIdEnum
    {
        NAME((short) 1, "name"), ADDRESS((short) 2, "address"), PHYSICAL_ADDRESS((short) 3,
            "physicalAddress");

        private static final Map<Integer, _Fields> byId = new HashMap<Integer, _Fields>();

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static
        {
            for (_Fields field : EnumSet.allOf(_Fields.class))
            {
                byId.put((int) field._thriftId, field);
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(final int fieldId)
        {
            return byId.get(fieldId);
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(final int fieldId)
        {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null)
            {
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            }
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(final String name)
        {
            return byName.get(name);
        }

        private final short _thriftId;

        private final String _fieldName;

        _Fields(final short thriftId, final String fieldName)
        {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        @Override
        public short getThriftFieldId()
        {
            return _thriftId;
        }

        @Override
        public String getFieldName()
        {
            return _fieldName;
        }
    }

    // isset id assignments

    public static final Map<_Fields, FieldMetaData> metaDataMap = Collections
        .unmodifiableMap(new EnumMap<_Fields, FieldMetaData>(_Fields.class)
        {
            {
                put(_Fields.NAME, new FieldMetaData("name",
                    TFieldRequirementType.DEFAULT,
                    new FieldValueMetaData(TType.STRING)));
                put(_Fields.ADDRESS, new FieldMetaData("address",
                    TFieldRequirementType.DEFAULT,
                    new FieldValueMetaData(TType.STRING)));
                put(_Fields.PHYSICAL_ADDRESS, new FieldMetaData("physicalAddress",
                    TFieldRequirementType.DEFAULT,
                    new FieldValueMetaData(TType.STRING)));
            }
        });

    static
    {
        FieldMetaData.addStructMetaDataMap(NetInterface.class, metaDataMap);
    }

    public NetInterface()
    {
    }

    public NetInterface(final String name, final String address, final String physicalAddress)
    {
        this();
        this.name = name;
        this.address = address;
        this.physicalAddress = physicalAddress;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public NetInterface(final NetInterface other)
    {
        if (other.isSetName())
        {
            this.name = other.name;
        }
        if (other.isSetAddress())
        {
            this.address = other.address;
        }
        if (other.isSetPhysicalAddress())
        {
            this.physicalAddress = other.physicalAddress;
        }
    }

    @Override
    public NetInterface deepCopy()
    {
        return new NetInterface(this);
    }

    @Override
    @Deprecated
    public NetInterface clone()
    {
        return new NetInterface(this);
    }

    public String getName()
    {
        return this.name;
    }

    public NetInterface setName(final String name)
    {
        this.name = name;
        return this;
    }

    public void unsetName()
    {
        this.name = null;
    }

    /** Returns true if field name is set (has been asigned a value) and false otherwise */
    public boolean isSetName()
    {
        return this.name != null;
    }

    public void setNameIsSet(final boolean value)
    {
        if (!value)
        {
            this.name = null;
        }
    }

    public String getAddress()
    {
        return this.address;
    }

    public NetInterface setAddress(final String address)
    {
        this.address = address;
        return this;
    }

    public void unsetAddress()
    {
        this.address = null;
    }

    /** Returns true if field address is set (has been asigned a value) and false otherwise */
    public boolean isSetAddress()
    {
        return this.address != null;
    }

    public void setAddressIsSet(final boolean value)
    {
        if (!value)
        {
            this.address = null;
        }
    }

    public String getPhysicalAddress()
    {
        return this.physicalAddress;
    }

    public NetInterface setPhysicalAddress(final String physicalAddress)
    {
        this.physicalAddress = physicalAddress;
        return this;
    }

    public void unsetPhysicalAddress()
    {
        this.physicalAddress = null;
    }

    /** Returns true if field physicalAddress is set (has been asigned a value) and false otherwise */
    public boolean isSetPhysicalAddress()
    {
        return this.physicalAddress != null;
    }

    public void setPhysicalAddressIsSet(final boolean value)
    {
        if (!value)
        {
            this.physicalAddress = null;
        }
    }

    @Override
    public void setFieldValue(final _Fields field, final Object value)
    {
        switch (field)
        {
            case NAME:
                if (value == null)
                {
                    unsetName();
                }
                else
                {
                    setName((String) value);
                }
                break;

            case ADDRESS:
                if (value == null)
                {
                    unsetAddress();
                }
                else
                {
                    setAddress((String) value);
                }
                break;

            case PHYSICAL_ADDRESS:
                if (value == null)
                {
                    unsetPhysicalAddress();
                }
                else
                {
                    setPhysicalAddress((String) value);
                }
                break;

        }
    }

    @Override
    public void setFieldValue(final int fieldID, final Object value)
    {
        setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
    }

    @Override
    public Object getFieldValue(final _Fields field)
    {
        switch (field)
        {
            case NAME:
                return getName();

            case ADDRESS:
                return getAddress();

            case PHYSICAL_ADDRESS:
                return getPhysicalAddress();

        }
        throw new IllegalStateException();
    }

    @Override
    public Object getFieldValue(final int fieldId)
    {
        return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been asigned a value) and false
     * otherwise
     */
    @Override
    public boolean isSet(final _Fields field)
    {
        switch (field)
        {
            case NAME:
                return isSetName();
            case ADDRESS:
                return isSetAddress();
            case PHYSICAL_ADDRESS:
                return isSetPhysicalAddress();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean isSet(final int fieldID)
    {
        return isSet(_Fields.findByThriftIdOrThrow(fieldID));
    }

    @Override
    public boolean equals(final Object that)
    {
        if (that == null)
        {
            return false;
        }
        if (that instanceof NetInterface)
        {
            return this.equals((NetInterface) that);
        }
        return false;
    }

    public boolean equals(final NetInterface that)
    {
        if (that == null)
        {
            return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name)
        {
            if (!(this_present_name && that_present_name))
            {
                return false;
            }
            if (!this.name.equals(that.name))
            {
                return false;
            }
        }

        boolean this_present_address = true && this.isSetAddress();
        boolean that_present_address = true && that.isSetAddress();
        if (this_present_address || that_present_address)
        {
            if (!(this_present_address && that_present_address))
            {
                return false;
            }
            if (!this.address.equals(that.address))
            {
                return false;
            }
        }

        boolean this_present_physicalAddress = true && this.isSetPhysicalAddress();
        boolean that_present_physicalAddress = true && that.isSetPhysicalAddress();
        if (this_present_physicalAddress || that_present_physicalAddress)
        {
            if (!(this_present_physicalAddress && that_present_physicalAddress))
            {
                return false;
            }
            if (!this.physicalAddress.equals(that.physicalAddress))
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    @Override
    public int compareTo(final NetInterface other)
    {
        if (!getClass().equals(other.getClass()))
        {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;
        NetInterface typedOther = other;

        lastComparison = Boolean.valueOf(isSetName()).compareTo(isSetName());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        lastComparison = TBaseHelper.compareTo(name, typedOther.name);
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        lastComparison = Boolean.valueOf(isSetAddress()).compareTo(isSetAddress());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        lastComparison = TBaseHelper.compareTo(address, typedOther.address);
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        lastComparison = Boolean.valueOf(isSetPhysicalAddress()).compareTo(isSetPhysicalAddress());
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        lastComparison = TBaseHelper.compareTo(physicalAddress, typedOther.physicalAddress);
        if (lastComparison != 0)
        {
            return lastComparison;
        }
        return 0;
    }

    @Override
    public void read(final TProtocol iprot) throws TException
    {
        TField field;
        iprot.readStructBegin();
        while (true)
        {
            field = iprot.readFieldBegin();
            if (field.type == TType.STOP)
            {
                break;
            }
            _Fields fieldId = _Fields.findByThriftId(field.id);
            if (fieldId == null)
            {
                TProtocolUtil.skip(iprot, field.type);
            }
            else
            {
                switch (fieldId)
                {
                    case NAME:
                        if (field.type == TType.STRING)
                        {
                            this.name = iprot.readString();
                        }
                        else
                        {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                    case ADDRESS:
                        if (field.type == TType.STRING)
                        {
                            this.address = iprot.readString();
                        }
                        else
                        {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                    case PHYSICAL_ADDRESS:
                        if (field.type == TType.STRING)
                        {
                            this.physicalAddress = iprot.readString();
                        }
                        else
                        {
                            TProtocolUtil.skip(iprot, field.type);
                        }
                        break;
                }
                iprot.readFieldEnd();
            }
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate
        // method
        validate();
    }

    @Override
    public void write(final TProtocol oprot) throws TException
    {
        validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (this.name != null)
        {
            oprot.writeFieldBegin(NAME_FIELD_DESC);
            oprot.writeString(this.name);
            oprot.writeFieldEnd();
        }
        if (this.address != null)
        {
            oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
            oprot.writeString(this.address);
            oprot.writeFieldEnd();
        }
        if (this.physicalAddress != null)
        {
            oprot.writeFieldBegin(PHYSICAL_ADDRESS_FIELD_DESC);
            oprot.writeString(this.physicalAddress);
            oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("NetInterface(");
        boolean first = true;

        sb.append("name:");
        if (this.name == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.name);
        }
        first = false;
        if (!first)
        {
            sb.append(", ");
        }
        sb.append("address:");
        if (this.address == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.address);
        }
        first = false;
        if (!first)
        {
            sb.append(", ");
        }
        sb.append("physicalAddress:");
        if (this.physicalAddress == null)
        {
            sb.append("null");
        }
        else
        {
            sb.append(this.physicalAddress);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws TException
    {
        // check for required fields
    }

}
