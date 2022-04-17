/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.DriverAppliedLeavesAud;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverAppliedLeavesAudRecord extends UpdatableRecordImpl<DriverAppliedLeavesAudRecord> implements Record14<UInteger, UInteger, UInteger, UInteger, Long, Long, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = -1055890393;

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.aud_id</code>.
     */
    public DriverAppliedLeavesAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.id</code>.
     */
    public DriverAppliedLeavesAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.leaves_record_id</code>.
     */
    public DriverAppliedLeavesAudRecord setLeavesRecordId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.leaves_record_id</code>.
     */
    public UInteger getLeavesRecordId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.driver_id</code>.
     */
    public DriverAppliedLeavesAudRecord setDriverId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.from_timestamp</code>.
     */
    public DriverAppliedLeavesAudRecord setFromTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.from_timestamp</code>.
     */
    public Long getFromTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.to_timestamp</code>.
     */
    public DriverAppliedLeavesAudRecord setToTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.to_timestamp</code>.
     */
    public Long getToTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.total_hours</code>.
     */
    public DriverAppliedLeavesAudRecord setTotalHours(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.total_hours</code>.
     */
    public BigDecimal getTotalHours() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.state</code>.
     */
    public DriverAppliedLeavesAudRecord setState(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.state</code>.
     */
    public String getState() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.is_active</code>.
     */
    public DriverAppliedLeavesAudRecord setIsActive(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.created_timestamp</code>.
     */
    public DriverAppliedLeavesAudRecord setCreatedTimestamp(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.last_updated_timestamp</code>.
     */
    public DriverAppliedLeavesAudRecord setLastUpdatedTimestamp(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.created_by</code>.
     */
    public DriverAppliedLeavesAudRecord setCreatedBy(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.last_updated_by</code>.
     */
    public DriverAppliedLeavesAudRecord setLastUpdatedBy(UInteger value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_applied_leaves_aud.rejection_reason</code>.
     */
    public DriverAppliedLeavesAudRecord setRejectionReason(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_applied_leaves_aud.rejection_reason</code>.
     */
    public String getRejectionReason() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, UInteger, UInteger, UInteger, Long, Long, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, UInteger, UInteger, UInteger, Long, Long, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.AUD_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.ID;
    }

    @Override
    public Field<UInteger> field3() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.LEAVES_RECORD_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.DRIVER_ID;
    }

    @Override
    public Field<Long> field5() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.FROM_TIMESTAMP;
    }

    @Override
    public Field<Long> field6() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.TO_TIMESTAMP;
    }

    @Override
    public Field<BigDecimal> field7() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.TOTAL_HOURS;
    }

    @Override
    public Field<String> field8() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.STATE;
    }

    @Override
    public Field<Byte> field9() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.IS_ACTIVE;
    }

    @Override
    public Field<Long> field10() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field11() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field12() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.CREATED_BY;
    }

    @Override
    public Field<UInteger> field13() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field14() {
        return DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD.REJECTION_REASON;
    }

    @Override
    public UInteger component1() {
        return getAudId();
    }

    @Override
    public UInteger component2() {
        return getId();
    }

    @Override
    public UInteger component3() {
        return getLeavesRecordId();
    }

    @Override
    public UInteger component4() {
        return getDriverId();
    }

    @Override
    public Long component5() {
        return getFromTimestamp();
    }

    @Override
    public Long component6() {
        return getToTimestamp();
    }

    @Override
    public BigDecimal component7() {
        return getTotalHours();
    }

    @Override
    public String component8() {
        return getState();
    }

    @Override
    public Byte component9() {
        return getIsActive();
    }

    @Override
    public Long component10() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component11() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component12() {
        return getCreatedBy();
    }

    @Override
    public UInteger component13() {
        return getLastUpdatedBy();
    }

    @Override
    public String component14() {
        return getRejectionReason();
    }

    @Override
    public UInteger value1() {
        return getAudId();
    }

    @Override
    public UInteger value2() {
        return getId();
    }

    @Override
    public UInteger value3() {
        return getLeavesRecordId();
    }

    @Override
    public UInteger value4() {
        return getDriverId();
    }

    @Override
    public Long value5() {
        return getFromTimestamp();
    }

    @Override
    public Long value6() {
        return getToTimestamp();
    }

    @Override
    public BigDecimal value7() {
        return getTotalHours();
    }

    @Override
    public String value8() {
        return getState();
    }

    @Override
    public Byte value9() {
        return getIsActive();
    }

    @Override
    public Long value10() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value11() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value12() {
        return getCreatedBy();
    }

    @Override
    public UInteger value13() {
        return getLastUpdatedBy();
    }

    @Override
    public String value14() {
        return getRejectionReason();
    }

    @Override
    public DriverAppliedLeavesAudRecord value1(UInteger value) {
        setAudId(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value2(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value3(UInteger value) {
        setLeavesRecordId(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value4(UInteger value) {
        setDriverId(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value5(Long value) {
        setFromTimestamp(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value6(Long value) {
        setToTimestamp(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value7(BigDecimal value) {
        setTotalHours(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value8(String value) {
        setState(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value9(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value10(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value11(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value12(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value13(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord value14(String value) {
        setRejectionReason(value);
        return this;
    }

    @Override
    public DriverAppliedLeavesAudRecord values(UInteger value1, UInteger value2, UInteger value3, UInteger value4, Long value5, Long value6, BigDecimal value7, String value8, Byte value9, Long value10, Long value11, UInteger value12, UInteger value13, String value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverAppliedLeavesAudRecord
     */
    public DriverAppliedLeavesAudRecord() {
        super(DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD);
    }

    /**
     * Create a detached, initialised DriverAppliedLeavesAudRecord
     */
    public DriverAppliedLeavesAudRecord(UInteger audId, UInteger id, UInteger leavesRecordId, UInteger driverId, Long fromTimestamp, Long toTimestamp, BigDecimal totalHours, String state, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String rejectionReason) {
        super(DriverAppliedLeavesAud.DRIVER_APPLIED_LEAVES_AUD);

        set(0, audId);
        set(1, id);
        set(2, leavesRecordId);
        set(3, driverId);
        set(4, fromTimestamp);
        set(5, toTimestamp);
        set(6, totalHours);
        set(7, state);
        set(8, isActive);
        set(9, createdTimestamp);
        set(10, lastUpdatedTimestamp);
        set(11, createdBy);
        set(12, lastUpdatedBy);
        set(13, rejectionReason);
    }
}