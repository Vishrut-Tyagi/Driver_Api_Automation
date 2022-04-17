/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Lease;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaseRecord extends UpdatableRecordImpl<LeaseRecord> {

    private static final long serialVersionUID = -764263278;

    /**
     * Setter for <code>blusmartDevDb.lease.id</code>.
     */
    public LeaseRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.lease_config_id</code>.
     */
    public LeaseRecord setLeaseConfigId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.lease_config_id</code>.
     */
    public UInteger getLeaseConfigId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.lease_start_timestamp</code>.
     */
    public LeaseRecord setLeaseStartTimestamp(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.lease_start_timestamp</code>.
     */
    public Long getLeaseStartTimestamp() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.lease_end_timestamp</code>.
     */
    public LeaseRecord setLeaseEndTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.lease_end_timestamp</code>.
     */
    public Long getLeaseEndTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.duty_start_time</code>.
     */
    public LeaseRecord setDutyStartTime(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.duty_start_time</code>.
     */
    public String getDutyStartTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.duty_end_time</code>.
     */
    public LeaseRecord setDutyEndTime(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.duty_end_time</code>.
     */
    public String getDutyEndTime() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.lease_duration</code>.
     */
    public LeaseRecord setLeaseDuration(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.lease_duration</code>.
     */
    public UInteger getLeaseDuration() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.duty_duration</code>.
     */
    public LeaseRecord setDutyDuration(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.duty_duration</code>.
     */
    public UInteger getDutyDuration() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.available_slots</code>.
     */
    public LeaseRecord setAvailableSlots(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.available_slots</code>.
     */
    public UInteger getAvailableSlots() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.max_slots</code>.
     */
    public LeaseRecord setMaxSlots(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.max_slots</code>.
     */
    public UInteger getMaxSlots() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.lease_cost</code>.
     */
    public LeaseRecord setLeaseCost(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.lease_cost</code>.
     */
    public BigDecimal getLeaseCost() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.minimum_guarantee</code>.
     */
    public LeaseRecord setMinimumGuarantee(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.minimum_guarantee</code>.
     */
    public BigDecimal getMinimumGuarantee() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.commission_percent</code>.
     */
    public LeaseRecord setCommissionPercent(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.commission_percent</code>.
     */
    public BigDecimal getCommissionPercent() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.skip_dates</code>.
     */
    public LeaseRecord setSkipDates(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.skip_dates</code>.
     */
    public String getSkipDates() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_incentive</code>.
     */
    public LeaseRecord setTripIncentive(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_incentive</code>.
     */
    public BigDecimal getTripIncentive() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_incentive_config</code>.
     */
    public LeaseRecord setTripIncentiveConfig(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_incentive_config</code>.
     */
    public String getTripIncentiveConfig() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_incentive_rule</code>.
     */
    public LeaseRecord setTripIncentiveRule(UInteger value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_incentive_rule</code>.
     */
    public UInteger getTripIncentiveRule() {
        return (UInteger) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.feedback_incentive</code>.
     */
    public LeaseRecord setFeedbackIncentive(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.feedback_incentive</code>.
     */
    public BigDecimal getFeedbackIncentive() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.feedback_incentive_config</code>.
     */
    public LeaseRecord setFeedbackIncentiveConfig(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.feedback_incentive_config</code>.
     */
    public String getFeedbackIncentiveConfig() {
        return (String) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.feedback_incentive_rule</code>.
     */
    public LeaseRecord setFeedbackIncentiveRule(UInteger value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.feedback_incentive_rule</code>.
     */
    public UInteger getFeedbackIncentiveRule() {
        return (UInteger) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.absent_penalty</code>.
     */
    public LeaseRecord setAbsentPenalty(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.absent_penalty</code>.
     */
    public BigDecimal getAbsentPenalty() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.absent_penalty_config</code>.
     */
    public LeaseRecord setAbsentPenaltyConfig(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.absent_penalty_config</code>.
     */
    public String getAbsentPenaltyConfig() {
        return (String) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.absent_penalty_rule</code>.
     */
    public LeaseRecord setAbsentPenaltyRule(UInteger value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.absent_penalty_rule</code>.
     */
    public UInteger getAbsentPenaltyRule() {
        return (UInteger) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.cut_off_start_time</code>.
     */
    public LeaseRecord setCutOffStartTime(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.cut_off_start_time</code>.
     */
    public String getCutOffStartTime() {
        return (String) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.cut_off_end_time</code>.
     */
    public LeaseRecord setCutOffEndTime(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.cut_off_end_time</code>.
     */
    public String getCutOffEndTime() {
        return (String) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_start_penalty</code>.
     */
    public LeaseRecord setLateDutyStartPenalty(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_start_penalty</code>.
     */
    public BigDecimal getLateDutyStartPenalty() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_start_penalty_config</code>.
     */
    public LeaseRecord setLateDutyStartPenaltyConfig(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_start_penalty_config</code>.
     */
    public String getLateDutyStartPenaltyConfig() {
        return (String) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_start_penalty_rule</code>.
     */
    public LeaseRecord setLateDutyStartPenaltyRule(UInteger value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_start_penalty_rule</code>.
     */
    public UInteger getLateDutyStartPenaltyRule() {
        return (UInteger) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.early_duty_end_penalty</code>.
     */
    public LeaseRecord setEarlyDutyEndPenalty(BigDecimal value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.early_duty_end_penalty</code>.
     */
    public BigDecimal getEarlyDutyEndPenalty() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.early_duty_end_penalty_config</code>.
     */
    public LeaseRecord setEarlyDutyEndPenaltyConfig(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.early_duty_end_penalty_config</code>.
     */
    public String getEarlyDutyEndPenaltyConfig() {
        return (String) get(29);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.early_duty_end_penalty_rule</code>.
     */
    public LeaseRecord setEarlyDutyEndPenaltyRule(UInteger value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.early_duty_end_penalty_rule</code>.
     */
    public UInteger getEarlyDutyEndPenaltyRule() {
        return (UInteger) get(30);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_end_penalty</code>.
     */
    public LeaseRecord setLateDutyEndPenalty(BigDecimal value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_end_penalty</code>.
     */
    public BigDecimal getLateDutyEndPenalty() {
        return (BigDecimal) get(31);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_end_penalty_config</code>.
     */
    public LeaseRecord setLateDutyEndPenaltyConfig(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_end_penalty_config</code>.
     */
    public String getLateDutyEndPenaltyConfig() {
        return (String) get(32);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.late_duty_end_penalty_rule</code>.
     */
    public LeaseRecord setLateDutyEndPenaltyRule(UInteger value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.late_duty_end_penalty_rule</code>.
     */
    public UInteger getLateDutyEndPenaltyRule() {
        return (UInteger) get(33);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.gst_percent</code>.
     */
    public LeaseRecord setGstPercent(BigDecimal value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.gst_percent</code>.
     */
    public BigDecimal getGstPercent() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.is_lease_expired</code>.
     */
    public LeaseRecord setIsLeaseExpired(Byte value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.is_lease_expired</code>.
     */
    public Byte getIsLeaseExpired() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.is_active</code>.
     */
    public LeaseRecord setIsActive(Byte value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(36);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.created_timestamp</code>.
     */
    public LeaseRecord setCreatedTimestamp(Long value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(37);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.last_updated_timestamp</code>.
     */
    public LeaseRecord setLastUpdatedTimestamp(Long value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(38);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.created_by</code>.
     */
    public LeaseRecord setCreatedBy(UInteger value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(39);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.last_updated_by</code>.
     */
    public LeaseRecord setLastUpdatedBy(UInteger value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(40);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_earning_incentive</code>.
     */
    public LeaseRecord setTripEarningIncentive(BigDecimal value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_earning_incentive</code>.
     */
    public BigDecimal getTripEarningIncentive() {
        return (BigDecimal) get(41);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_earning_incentive_config</code>.
     */
    public LeaseRecord setTripEarningIncentiveConfig(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_earning_incentive_config</code>.
     */
    public String getTripEarningIncentiveConfig() {
        return (String) get(42);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_earning_incentive_rule</code>.
     */
    public LeaseRecord setTripEarningIncentiveRule(UInteger value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_earning_incentive_rule</code>.
     */
    public UInteger getTripEarningIncentiveRule() {
        return (UInteger) get(43);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.overtime_incentive</code>.
     */
    public LeaseRecord setOvertimeIncentive(BigDecimal value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.overtime_incentive</code>.
     */
    public BigDecimal getOvertimeIncentive() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.overtime_incentive_config</code>.
     */
    public LeaseRecord setOvertimeIncentiveConfig(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.overtime_incentive_config</code>.
     */
    public String getOvertimeIncentiveConfig() {
        return (String) get(45);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.overtime_incentive_rule</code>.
     */
    public LeaseRecord setOvertimeIncentiveRule(UInteger value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.overtime_incentive_rule</code>.
     */
    public UInteger getOvertimeIncentiveRule() {
        return (UInteger) get(46);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.other_flags</code>.
     */
    public LeaseRecord setOtherFlags(String value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(47);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.trip_earning_incentive_model_name</code>.
     */
    public LeaseRecord setTripEarningIncentiveModelName(String value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.trip_earning_incentive_model_name</code>.
     */
    public String getTripEarningIncentiveModelName() {
        return (String) get(48);
    }

    /**
     * Setter for <code>blusmartDevDb.lease.vehicle_variant</code>.
     */
    public LeaseRecord setVehicleVariant(String value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease.vehicle_variant</code>.
     */
    public String getVehicleVariant() {
        return (String) get(49);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LeaseRecord
     */
    public LeaseRecord() {
        super(Lease.LEASE);
    }

    /**
     * Create a detached, initialised LeaseRecord
     */
    public LeaseRecord(UInteger id, UInteger leaseConfigId, Long leaseStartTimestamp, Long leaseEndTimestamp, String dutyStartTime, String dutyEndTime, UInteger leaseDuration, UInteger dutyDuration, UInteger availableSlots, UInteger maxSlots, BigDecimal leaseCost, BigDecimal minimumGuarantee, BigDecimal commissionPercent, String skipDates, BigDecimal tripIncentive, String tripIncentiveConfig, UInteger tripIncentiveRule, BigDecimal feedbackIncentive, String feedbackIncentiveConfig, UInteger feedbackIncentiveRule, BigDecimal absentPenalty, String absentPenaltyConfig, UInteger absentPenaltyRule, String cutOffStartTime, String cutOffEndTime, BigDecimal lateDutyStartPenalty, String lateDutyStartPenaltyConfig, UInteger lateDutyStartPenaltyRule, BigDecimal earlyDutyEndPenalty, String earlyDutyEndPenaltyConfig, UInteger earlyDutyEndPenaltyRule, BigDecimal lateDutyEndPenalty, String lateDutyEndPenaltyConfig, UInteger lateDutyEndPenaltyRule, BigDecimal gstPercent, Byte isLeaseExpired, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, BigDecimal tripEarningIncentive, String tripEarningIncentiveConfig, UInteger tripEarningIncentiveRule, BigDecimal overtimeIncentive, String overtimeIncentiveConfig, UInteger overtimeIncentiveRule, String otherFlags, String tripEarningIncentiveModelName, String vehicleVariant) {
        super(Lease.LEASE);

        set(0, id);
        set(1, leaseConfigId);
        set(2, leaseStartTimestamp);
        set(3, leaseEndTimestamp);
        set(4, dutyStartTime);
        set(5, dutyEndTime);
        set(6, leaseDuration);
        set(7, dutyDuration);
        set(8, availableSlots);
        set(9, maxSlots);
        set(10, leaseCost);
        set(11, minimumGuarantee);
        set(12, commissionPercent);
        set(13, skipDates);
        set(14, tripIncentive);
        set(15, tripIncentiveConfig);
        set(16, tripIncentiveRule);
        set(17, feedbackIncentive);
        set(18, feedbackIncentiveConfig);
        set(19, feedbackIncentiveRule);
        set(20, absentPenalty);
        set(21, absentPenaltyConfig);
        set(22, absentPenaltyRule);
        set(23, cutOffStartTime);
        set(24, cutOffEndTime);
        set(25, lateDutyStartPenalty);
        set(26, lateDutyStartPenaltyConfig);
        set(27, lateDutyStartPenaltyRule);
        set(28, earlyDutyEndPenalty);
        set(29, earlyDutyEndPenaltyConfig);
        set(30, earlyDutyEndPenaltyRule);
        set(31, lateDutyEndPenalty);
        set(32, lateDutyEndPenaltyConfig);
        set(33, lateDutyEndPenaltyRule);
        set(34, gstPercent);
        set(35, isLeaseExpired);
        set(36, isActive);
        set(37, createdTimestamp);
        set(38, lastUpdatedTimestamp);
        set(39, createdBy);
        set(40, lastUpdatedBy);
        set(41, tripEarningIncentive);
        set(42, tripEarningIncentiveConfig);
        set(43, tripEarningIncentiveRule);
        set(44, overtimeIncentive);
        set(45, overtimeIncentiveConfig);
        set(46, overtimeIncentiveRule);
        set(47, otherFlags);
        set(48, tripEarningIncentiveModelName);
        set(49, vehicleVariant);
    }
}
