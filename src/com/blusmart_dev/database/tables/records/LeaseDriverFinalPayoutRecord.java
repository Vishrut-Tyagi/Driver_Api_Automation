/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.LeaseDriverFinalPayout;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaseDriverFinalPayoutRecord extends UpdatableRecordImpl<LeaseDriverFinalPayoutRecord> implements Record18<UInteger, UInteger, Long, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, UInteger, BigDecimal> {

    private static final long serialVersionUID = 1800477354;

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.id</code>.
     */
    public LeaseDriverFinalPayoutRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.driver_id</code>.
     */
    public LeaseDriverFinalPayoutRecord setDriverId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.start_timestamp</code>.
     */
    public LeaseDriverFinalPayoutRecord setStartTimestamp(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.start_timestamp</code>.
     */
    public Long getStartTimestamp() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.end_timestamp</code>.
     */
    public LeaseDriverFinalPayoutRecord setEndTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.end_timestamp</code>.
     */
    public Long getEndTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.lease_driver_final_payout_status</code>.
     */
    public LeaseDriverFinalPayoutRecord setLeaseDriverFinalPayoutStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.lease_driver_final_payout_status</code>.
     */
    public String getLeaseDriverFinalPayoutStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.initial_driver_take_home</code>.
     */
    public LeaseDriverFinalPayoutRecord setInitialDriverTakeHome(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.initial_driver_take_home</code>.
     */
    public BigDecimal getInitialDriverTakeHome() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.final_driver_take_home</code>.
     */
    public LeaseDriverFinalPayoutRecord setFinalDriverTakeHome(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.final_driver_take_home</code>.
     */
    public BigDecimal getFinalDriverTakeHome() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.total_external_credits</code>.
     */
    public LeaseDriverFinalPayoutRecord setTotalExternalCredits(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.total_external_credits</code>.
     */
    public BigDecimal getTotalExternalCredits() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.total_external_debits</code>.
     */
    public LeaseDriverFinalPayoutRecord setTotalExternalDebits(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.total_external_debits</code>.
     */
    public BigDecimal getTotalExternalDebits() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.total_insurance_amount</code>.
     */
    public LeaseDriverFinalPayoutRecord setTotalInsuranceAmount(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.total_insurance_amount</code>.
     */
    public BigDecimal getTotalInsuranceAmount() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.weekly_slots</code>.
     */
    public LeaseDriverFinalPayoutRecord setWeeklySlots(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.weekly_slots</code>.
     */
    public String getWeeklySlots() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.is_active</code>.
     */
    public LeaseDriverFinalPayoutRecord setIsActive(Byte value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.created_timestamp</code>.
     */
    public LeaseDriverFinalPayoutRecord setCreatedTimestamp(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.last_updated_timestamp</code>.
     */
    public LeaseDriverFinalPayoutRecord setLastUpdatedTimestamp(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.created_by</code>.
     */
    public LeaseDriverFinalPayoutRecord setCreatedBy(UInteger value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.last_updated_by</code>.
     */
    public LeaseDriverFinalPayoutRecord setLastUpdatedBy(UInteger value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.total_workdays</code>.
     */
    public LeaseDriverFinalPayoutRecord setTotalWorkdays(UInteger value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.total_workdays</code>.
     */
    public UInteger getTotalWorkdays() {
        return (UInteger) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_final_payout.total_challan_amount</code>.
     */
    public LeaseDriverFinalPayoutRecord setTotalChallanAmount(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_final_payout.total_challan_amount</code>.
     */
    public BigDecimal getTotalChallanAmount() {
        return (BigDecimal) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<UInteger, UInteger, Long, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, UInteger, BigDecimal> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<UInteger, UInteger, Long, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, UInteger, BigDecimal> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.DRIVER_ID;
    }

    @Override
    public Field<Long> field3() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.START_TIMESTAMP;
    }

    @Override
    public Field<Long> field4() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.END_TIMESTAMP;
    }

    @Override
    public Field<String> field5() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.LEASE_DRIVER_FINAL_PAYOUT_STATUS;
    }

    @Override
    public Field<BigDecimal> field6() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.INITIAL_DRIVER_TAKE_HOME;
    }

    @Override
    public Field<BigDecimal> field7() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.FINAL_DRIVER_TAKE_HOME;
    }

    @Override
    public Field<BigDecimal> field8() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.TOTAL_EXTERNAL_CREDITS;
    }

    @Override
    public Field<BigDecimal> field9() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.TOTAL_EXTERNAL_DEBITS;
    }

    @Override
    public Field<BigDecimal> field10() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.TOTAL_INSURANCE_AMOUNT;
    }

    @Override
    public Field<String> field11() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.WEEKLY_SLOTS;
    }

    @Override
    public Field<Byte> field12() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.IS_ACTIVE;
    }

    @Override
    public Field<Long> field13() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field14() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field15() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.CREATED_BY;
    }

    @Override
    public Field<UInteger> field16() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.LAST_UPDATED_BY;
    }

    @Override
    public Field<UInteger> field17() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.TOTAL_WORKDAYS;
    }

    @Override
    public Field<BigDecimal> field18() {
        return LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT.TOTAL_CHALLAN_AMOUNT;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getDriverId();
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
    public String component5() {
        return getLeaseDriverFinalPayoutStatus();
    }

    @Override
    public BigDecimal component6() {
        return getInitialDriverTakeHome();
    }

    @Override
    public BigDecimal component7() {
        return getFinalDriverTakeHome();
    }

    @Override
    public BigDecimal component8() {
        return getTotalExternalCredits();
    }

    @Override
    public BigDecimal component9() {
        return getTotalExternalDebits();
    }

    @Override
    public BigDecimal component10() {
        return getTotalInsuranceAmount();
    }

    @Override
    public String component11() {
        return getWeeklySlots();
    }

    @Override
    public Byte component12() {
        return getIsActive();
    }

    @Override
    public Long component13() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component14() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component15() {
        return getCreatedBy();
    }

    @Override
    public UInteger component16() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger component17() {
        return getTotalWorkdays();
    }

    @Override
    public BigDecimal component18() {
        return getTotalChallanAmount();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getDriverId();
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
    public String value5() {
        return getLeaseDriverFinalPayoutStatus();
    }

    @Override
    public BigDecimal value6() {
        return getInitialDriverTakeHome();
    }

    @Override
    public BigDecimal value7() {
        return getFinalDriverTakeHome();
    }

    @Override
    public BigDecimal value8() {
        return getTotalExternalCredits();
    }

    @Override
    public BigDecimal value9() {
        return getTotalExternalDebits();
    }

    @Override
    public BigDecimal value10() {
        return getTotalInsuranceAmount();
    }

    @Override
    public String value11() {
        return getWeeklySlots();
    }

    @Override
    public Byte value12() {
        return getIsActive();
    }

    @Override
    public Long value13() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value14() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value15() {
        return getCreatedBy();
    }

    @Override
    public UInteger value16() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger value17() {
        return getTotalWorkdays();
    }

    @Override
    public BigDecimal value18() {
        return getTotalChallanAmount();
    }

    @Override
    public LeaseDriverFinalPayoutRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value2(UInteger value) {
        setDriverId(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value3(Long value) {
        setStartTimestamp(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value4(Long value) {
        setEndTimestamp(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value5(String value) {
        setLeaseDriverFinalPayoutStatus(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value6(BigDecimal value) {
        setInitialDriverTakeHome(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value7(BigDecimal value) {
        setFinalDriverTakeHome(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value8(BigDecimal value) {
        setTotalExternalCredits(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value9(BigDecimal value) {
        setTotalExternalDebits(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value10(BigDecimal value) {
        setTotalInsuranceAmount(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value11(String value) {
        setWeeklySlots(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value12(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value13(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value14(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value15(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value16(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value17(UInteger value) {
        setTotalWorkdays(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord value18(BigDecimal value) {
        setTotalChallanAmount(value);
        return this;
    }

    @Override
    public LeaseDriverFinalPayoutRecord values(UInteger value1, UInteger value2, Long value3, Long value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, String value11, Byte value12, Long value13, Long value14, UInteger value15, UInteger value16, UInteger value17, BigDecimal value18) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LeaseDriverFinalPayoutRecord
     */
    public LeaseDriverFinalPayoutRecord() {
        super(LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT);
    }

    /**
     * Create a detached, initialised LeaseDriverFinalPayoutRecord
     */
    public LeaseDriverFinalPayoutRecord(UInteger id, UInteger driverId, Long startTimestamp, Long endTimestamp, String leaseDriverFinalPayoutStatus, BigDecimal initialDriverTakeHome, BigDecimal finalDriverTakeHome, BigDecimal totalExternalCredits, BigDecimal totalExternalDebits, BigDecimal totalInsuranceAmount, String weeklySlots, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, UInteger totalWorkdays, BigDecimal totalChallanAmount) {
        super(LeaseDriverFinalPayout.LEASE_DRIVER_FINAL_PAYOUT);

        set(0, id);
        set(1, driverId);
        set(2, startTimestamp);
        set(3, endTimestamp);
        set(4, leaseDriverFinalPayoutStatus);
        set(5, initialDriverTakeHome);
        set(6, finalDriverTakeHome);
        set(7, totalExternalCredits);
        set(8, totalExternalDebits);
        set(9, totalInsuranceAmount);
        set(10, weeklySlots);
        set(11, isActive);
        set(12, createdTimestamp);
        set(13, lastUpdatedTimestamp);
        set(14, createdBy);
        set(15, lastUpdatedBy);
        set(16, totalWorkdays);
        set(17, totalChallanAmount);
    }
}
