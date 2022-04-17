/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Category;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record12<UInteger, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = 1849424682;

    /**
     * Setter for <code>blusmartDevDb.category.id</code>.
     */
    public CategoryRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.category.code</code>.
     */
    public CategoryRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.category.ride_types</code>.
     */
    public CategoryRecord setRideTypes(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.ride_types</code>.
     */
    public String getRideTypes() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.category.name</code>.
     */
    public CategoryRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.category.passenger_cap</code>.
     */
    public CategoryRecord setPassengerCap(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.passenger_cap</code>.
     */
    public String getPassengerCap() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.category.vehicle_type</code>.
     */
    public CategoryRecord setVehicleType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.vehicle_type</code>.
     */
    public String getVehicleType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.category.is_active</code>.
     */
    public CategoryRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.category.created_timestamp</code>.
     */
    public CategoryRecord setCreatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.category.last_updated_timestamp</code>.
     */
    public CategoryRecord setLastUpdatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.category.created_by</code>.
     */
    public CategoryRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.category.last_updated_by</code>.
     */
    public CategoryRecord setLastUpdatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.category.other_flags</code>.
     */
    public CategoryRecord setOtherFlags(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.category.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UInteger, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UInteger, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Category.CATEGORY.ID;
    }

    @Override
    public Field<String> field2() {
        return Category.CATEGORY.CODE;
    }

    @Override
    public Field<String> field3() {
        return Category.CATEGORY.RIDE_TYPES;
    }

    @Override
    public Field<String> field4() {
        return Category.CATEGORY.NAME;
    }

    @Override
    public Field<String> field5() {
        return Category.CATEGORY.PASSENGER_CAP;
    }

    @Override
    public Field<String> field6() {
        return Category.CATEGORY.VEHICLE_TYPE;
    }

    @Override
    public Field<Byte> field7() {
        return Category.CATEGORY.IS_ACTIVE;
    }

    @Override
    public Field<Long> field8() {
        return Category.CATEGORY.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field9() {
        return Category.CATEGORY.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field10() {
        return Category.CATEGORY.CREATED_BY;
    }

    @Override
    public Field<UInteger> field11() {
        return Category.CATEGORY.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field12() {
        return Category.CATEGORY.OTHER_FLAGS;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getRideTypes();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public String component5() {
        return getPassengerCap();
    }

    @Override
    public String component6() {
        return getVehicleType();
    }

    @Override
    public Byte component7() {
        return getIsActive();
    }

    @Override
    public Long component8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component10() {
        return getCreatedBy();
    }

    @Override
    public UInteger component11() {
        return getLastUpdatedBy();
    }

    @Override
    public String component12() {
        return getOtherFlags();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getRideTypes();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public String value5() {
        return getPassengerCap();
    }

    @Override
    public String value6() {
        return getVehicleType();
    }

    @Override
    public Byte value7() {
        return getIsActive();
    }

    @Override
    public Long value8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value10() {
        return getCreatedBy();
    }

    @Override
    public UInteger value11() {
        return getLastUpdatedBy();
    }

    @Override
    public String value12() {
        return getOtherFlags();
    }

    @Override
    public CategoryRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public CategoryRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CategoryRecord value3(String value) {
        setRideTypes(value);
        return this;
    }

    @Override
    public CategoryRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public CategoryRecord value5(String value) {
        setPassengerCap(value);
        return this;
    }

    @Override
    public CategoryRecord value6(String value) {
        setVehicleType(value);
        return this;
    }

    @Override
    public CategoryRecord value7(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public CategoryRecord value8(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public CategoryRecord value9(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public CategoryRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CategoryRecord value11(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public CategoryRecord value12(String value) {
        setOtherFlags(value);
        return this;
    }

    @Override
    public CategoryRecord values(UInteger value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Long value8, Long value9, UInteger value10, UInteger value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(UInteger id, String code, String rideTypes, String name, String passengerCap, String vehicleType, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String otherFlags) {
        super(Category.CATEGORY);

        set(0, id);
        set(1, code);
        set(2, rideTypes);
        set(3, name);
        set(4, passengerCap);
        set(5, vehicleType);
        set(6, isActive);
        set(7, createdTimestamp);
        set(8, lastUpdatedTimestamp);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, otherFlags);
    }
}