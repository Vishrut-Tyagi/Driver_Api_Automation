/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.ShiftConfiguration;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShiftConfigurationRecord extends UpdatableRecordImpl<ShiftConfigurationRecord> implements Record9<UInteger, Integer, LocalTime, LocalTime, Byte, Integer, Integer, Long, Long> {

    private static final long serialVersionUID = -1392197167;

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.shift_id</code>.
     */
    public ShiftConfigurationRecord setShiftId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.shift_id</code>.
     */
    public UInteger getShiftId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.hub_id</code>.
     */
    public ShiftConfigurationRecord setHubId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.hub_id</code>.
     */
    public Integer getHubId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.earliest_login</code>.
     */
    public ShiftConfigurationRecord setEarliestLogin(LocalTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.earliest_login</code>.
     */
    public LocalTime getEarliestLogin() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.latest_login</code>.
     */
    public ShiftConfigurationRecord setLatestLogin(LocalTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.latest_login</code>.
     */
    public LocalTime getLatestLogin() {
        return (LocalTime) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.is_active</code>.
     */
    public ShiftConfigurationRecord setIsActive(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.created_by</code>.
     */
    public ShiftConfigurationRecord setCreatedBy(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.updated_by</code>.
     */
    public ShiftConfigurationRecord setUpdatedBy(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.updated_by</code>.
     */
    public Integer getUpdatedBy() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.created_at</code>.
     */
    public ShiftConfigurationRecord setCreatedAt(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.shift_configuration.last_updated_at</code>.
     */
    public ShiftConfigurationRecord setLastUpdatedAt(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.shift_configuration.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UInteger, Integer, LocalTime, LocalTime, Byte, Integer, Integer, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UInteger, Integer, LocalTime, LocalTime, Byte, Integer, Integer, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.SHIFT_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.HUB_ID;
    }

    @Override
    public Field<LocalTime> field3() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.EARLIEST_LOGIN;
    }

    @Override
    public Field<LocalTime> field4() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.LATEST_LOGIN;
    }

    @Override
    public Field<Byte> field5() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.IS_ACTIVE;
    }

    @Override
    public Field<Integer> field6() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.CREATED_BY;
    }

    @Override
    public Field<Integer> field7() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.UPDATED_BY;
    }

    @Override
    public Field<Long> field8() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.CREATED_AT;
    }

    @Override
    public Field<Long> field9() {
        return ShiftConfiguration.SHIFT_CONFIGURATION.LAST_UPDATED_AT;
    }

    @Override
    public UInteger component1() {
        return getShiftId();
    }

    @Override
    public Integer component2() {
        return getHubId();
    }

    @Override
    public LocalTime component3() {
        return getEarliestLogin();
    }

    @Override
    public LocalTime component4() {
        return getLatestLogin();
    }

    @Override
    public Byte component5() {
        return getIsActive();
    }

    @Override
    public Integer component6() {
        return getCreatedBy();
    }

    @Override
    public Integer component7() {
        return getUpdatedBy();
    }

    @Override
    public Long component8() {
        return getCreatedAt();
    }

    @Override
    public Long component9() {
        return getLastUpdatedAt();
    }

    @Override
    public UInteger value1() {
        return getShiftId();
    }

    @Override
    public Integer value2() {
        return getHubId();
    }

    @Override
    public LocalTime value3() {
        return getEarliestLogin();
    }

    @Override
    public LocalTime value4() {
        return getLatestLogin();
    }

    @Override
    public Byte value5() {
        return getIsActive();
    }

    @Override
    public Integer value6() {
        return getCreatedBy();
    }

    @Override
    public Integer value7() {
        return getUpdatedBy();
    }

    @Override
    public Long value8() {
        return getCreatedAt();
    }

    @Override
    public Long value9() {
        return getLastUpdatedAt();
    }

    @Override
    public ShiftConfigurationRecord value1(UInteger value) {
        setShiftId(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value2(Integer value) {
        setHubId(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value3(LocalTime value) {
        setEarliestLogin(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value4(LocalTime value) {
        setLatestLogin(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value5(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value6(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value7(Integer value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value8(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord value9(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public ShiftConfigurationRecord values(UInteger value1, Integer value2, LocalTime value3, LocalTime value4, Byte value5, Integer value6, Integer value7, Long value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShiftConfigurationRecord
     */
    public ShiftConfigurationRecord() {
        super(ShiftConfiguration.SHIFT_CONFIGURATION);
    }

    /**
     * Create a detached, initialised ShiftConfigurationRecord
     */
    public ShiftConfigurationRecord(UInteger shiftId, Integer hubId, LocalTime earliestLogin, LocalTime latestLogin, Byte isActive, Integer createdBy, Integer updatedBy, Long createdAt, Long lastUpdatedAt) {
        super(ShiftConfiguration.SHIFT_CONFIGURATION);

        set(0, shiftId);
        set(1, hubId);
        set(2, earliestLogin);
        set(3, latestLogin);
        set(4, isActive);
        set(5, createdBy);
        set(6, updatedBy);
        set(7, createdAt);
        set(8, lastUpdatedAt);
    }
}
