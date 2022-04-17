/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RecurringRidesWeekWise;

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
public class RecurringRidesWeekWiseRecord extends UpdatableRecordImpl<RecurringRidesWeekWiseRecord> implements Record14<UInteger, UInteger, Long, Long, BigDecimal, String, String, BigDecimal, Byte, UInteger, Long, UInteger, Long, String> {

    private static final long serialVersionUID = -2056837906;

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.id</code>.
     */
    public RecurringRidesWeekWiseRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.recurring_request_id</code>.
     */
    public RecurringRidesWeekWiseRecord setRecurringRequestId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.recurring_request_id</code>.
     */
    public UInteger getRecurringRequestId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.start_timestamp</code>.
     */
    public RecurringRidesWeekWiseRecord setStartTimestamp(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.start_timestamp</code>.
     */
    public Long getStartTimestamp() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.end_timestamp</code>.
     */
    public RecurringRidesWeekWiseRecord setEndTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.end_timestamp</code>.
     */
    public Long getEndTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.wallet_balance</code>.
     */
    public RecurringRidesWeekWiseRecord setWalletBalance(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.wallet_balance</code>.
     */
    public BigDecimal getWalletBalance() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.state</code>.
     */
    public RecurringRidesWeekWiseRecord setState(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.state</code>.
     */
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.weekly_config</code>.
     */
    public RecurringRidesWeekWiseRecord setWeeklyConfig(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.weekly_config</code>.
     */
    public String getWeeklyConfig() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.needed_balance</code>.
     */
    public RecurringRidesWeekWiseRecord setNeededBalance(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.needed_balance</code>.
     */
    public BigDecimal getNeededBalance() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.is_active</code>.
     */
    public RecurringRidesWeekWiseRecord setIsActive(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.created_by</code>.
     */
    public RecurringRidesWeekWiseRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.created_at</code>.
     */
    public RecurringRidesWeekWiseRecord setCreatedAt(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.last_updated_by</code>.
     */
    public RecurringRidesWeekWiseRecord setLastUpdatedBy(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.last_updated_at</code>.
     */
    public RecurringRidesWeekWiseRecord setLastUpdatedAt(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.recurring_rides_week_wise.note</code>.
     */
    public RecurringRidesWeekWiseRecord setNote(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.recurring_rides_week_wise.note</code>.
     */
    public String getNote() {
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
    public Row14<UInteger, UInteger, Long, Long, BigDecimal, String, String, BigDecimal, Byte, UInteger, Long, UInteger, Long, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, UInteger, Long, Long, BigDecimal, String, String, BigDecimal, Byte, UInteger, Long, UInteger, Long, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.RECURRING_REQUEST_ID;
    }

    @Override
    public Field<Long> field3() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.START_TIMESTAMP;
    }

    @Override
    public Field<Long> field4() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.END_TIMESTAMP;
    }

    @Override
    public Field<BigDecimal> field5() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.WALLET_BALANCE;
    }

    @Override
    public Field<String> field6() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.STATE;
    }

    @Override
    public Field<String> field7() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.WEEKLY_CONFIG;
    }

    @Override
    public Field<BigDecimal> field8() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.NEEDED_BALANCE;
    }

    @Override
    public Field<Byte> field9() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.IS_ACTIVE;
    }

    @Override
    public Field<UInteger> field10() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.CREATED_BY;
    }

    @Override
    public Field<Long> field11() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.CREATED_AT;
    }

    @Override
    public Field<UInteger> field12() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.LAST_UPDATED_BY;
    }

    @Override
    public Field<Long> field13() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.LAST_UPDATED_AT;
    }

    @Override
    public Field<String> field14() {
        return RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE.NOTE;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getRecurringRequestId();
    }

    @Override
    public Long component3() {
        return getStartTimestamp();
    }

    @Override
    public Long component4() {
        return getEndTimestamp();
    }

    @Override
    public BigDecimal component5() {
        return getWalletBalance();
    }

    @Override
    public String component6() {
        return getState();
    }

    @Override
    public String component7() {
        return getWeeklyConfig();
    }

    @Override
    public BigDecimal component8() {
        return getNeededBalance();
    }

    @Override
    public Byte component9() {
        return getIsActive();
    }

    @Override
    public UInteger component10() {
        return getCreatedBy();
    }

    @Override
    public Long component11() {
        return getCreatedAt();
    }

    @Override
    public UInteger component12() {
        return getLastUpdatedBy();
    }

    @Override
    public Long component13() {
        return getLastUpdatedAt();
    }

    @Override
    public String component14() {
        return getNote();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getRecurringRequestId();
    }

    @Override
    public Long value3() {
        return getStartTimestamp();
    }

    @Override
    public Long value4() {
        return getEndTimestamp();
    }

    @Override
    public BigDecimal value5() {
        return getWalletBalance();
    }

    @Override
    public String value6() {
        return getState();
    }

    @Override
    public String value7() {
        return getWeeklyConfig();
    }

    @Override
    public BigDecimal value8() {
        return getNeededBalance();
    }

    @Override
    public Byte value9() {
        return getIsActive();
    }

    @Override
    public UInteger value10() {
        return getCreatedBy();
    }

    @Override
    public Long value11() {
        return getCreatedAt();
    }

    @Override
    public UInteger value12() {
        return getLastUpdatedBy();
    }

    @Override
    public Long value13() {
        return getLastUpdatedAt();
    }

    @Override
    public String value14() {
        return getNote();
    }

    @Override
    public RecurringRidesWeekWiseRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value2(UInteger value) {
        setRecurringRequestId(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value3(Long value) {
        setStartTimestamp(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value4(Long value) {
        setEndTimestamp(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value5(BigDecimal value) {
        setWalletBalance(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value6(String value) {
        setState(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value7(String value) {
        setWeeklyConfig(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value8(BigDecimal value) {
        setNeededBalance(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value9(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value11(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value12(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value13(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord value14(String value) {
        setNote(value);
        return this;
    }

    @Override
    public RecurringRidesWeekWiseRecord values(UInteger value1, UInteger value2, Long value3, Long value4, BigDecimal value5, String value6, String value7, BigDecimal value8, Byte value9, UInteger value10, Long value11, UInteger value12, Long value13, String value14) {
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
     * Create a detached RecurringRidesWeekWiseRecord
     */
    public RecurringRidesWeekWiseRecord() {
        super(RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE);
    }

    /**
     * Create a detached, initialised RecurringRidesWeekWiseRecord
     */
    public RecurringRidesWeekWiseRecord(UInteger id, UInteger recurringRequestId, Long startTimestamp, Long endTimestamp, BigDecimal walletBalance, String state, String weeklyConfig, BigDecimal neededBalance, Byte isActive, UInteger createdBy, Long createdAt, UInteger lastUpdatedBy, Long lastUpdatedAt, String note) {
        super(RecurringRidesWeekWise.RECURRING_RIDES_WEEK_WISE);

        set(0, id);
        set(1, recurringRequestId);
        set(2, startTimestamp);
        set(3, endTimestamp);
        set(4, walletBalance);
        set(5, state);
        set(6, weeklyConfig);
        set(7, neededBalance);
        set(8, isActive);
        set(9, createdBy);
        set(10, createdAt);
        set(11, lastUpdatedBy);
        set(12, lastUpdatedAt);
        set(13, note);
    }
}
