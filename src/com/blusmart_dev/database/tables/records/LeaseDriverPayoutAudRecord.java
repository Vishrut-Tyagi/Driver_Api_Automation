/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.LeaseDriverPayoutAud;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaseDriverPayoutAudRecord extends UpdatableRecordImpl<LeaseDriverPayoutAudRecord> {

    private static final long serialVersionUID = -1881361150;

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.aud_id</code>.
     */
    public LeaseDriverPayoutAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.id</code>.
     */
    public LeaseDriverPayoutAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.driver_id</code>.
     */
    public LeaseDriverPayoutAudRecord setDriverId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.lease_id</code>.
     */
    public LeaseDriverPayoutAudRecord setLeaseId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.lease_id</code>.
     */
    public UInteger getLeaseId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.lease_driver_payout_state</code>.
     */
    public LeaseDriverPayoutAudRecord setLeaseDriverPayoutState(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.lease_driver_payout_state</code>.
     */
    public String getLeaseDriverPayoutState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_estimated_lease_cost</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalEstimatedLeaseCost(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_estimated_lease_cost</code>.
     */
    public BigDecimal getTotalEstimatedLeaseCost() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_actual_lease_cost</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalActualLeaseCost(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_actual_lease_cost</code>.
     */
    public BigDecimal getTotalActualLeaseCost() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_estimated_minimum_guarantee</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalEstimatedMinimumGuarantee(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_estimated_minimum_guarantee</code>.
     */
    public BigDecimal getTotalEstimatedMinimumGuarantee() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_actual_minimum_guarantee</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalActualMinimumGuarantee(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_actual_minimum_guarantee</code>.
     */
    public BigDecimal getTotalActualMinimumGuarantee() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_driver_earnings</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalDriverEarnings(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_driver_earnings</code>.
     */
    public BigDecimal getTotalDriverEarnings() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_lease_cost_penalty</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalLeaseCostPenalty(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_lease_cost_penalty</code>.
     */
    public BigDecimal getTotalLeaseCostPenalty() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_minimum_guarantee_penalty</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalMinimumGuaranteePenalty(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_minimum_guarantee_penalty</code>.
     */
    public BigDecimal getTotalMinimumGuaranteePenalty() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_commission</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalCommission(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_commission</code>.
     */
    public BigDecimal getTotalCommission() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_gst</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalGst(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_gst</code>.
     */
    public BigDecimal getTotalGst() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_earnings</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalTripEarnings(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_earnings</code>.
     */
    public BigDecimal getTotalTripEarnings() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_incentive</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalTripIncentive(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_incentive</code>.
     */
    public BigDecimal getTotalTripIncentive() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_feedback_incentive</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalFeedbackIncentive(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_feedback_incentive</code>.
     */
    public BigDecimal getTotalFeedbackIncentive() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_driver_take_home</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalDriverTakeHome(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_driver_take_home</code>.
     */
    public BigDecimal getTotalDriverTakeHome() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_online_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallOnlineDuration(UInteger value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_online_duration</code>.
     */
    public UInteger getOverallOnlineDuration() {
        return (UInteger) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paused_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPausedDuration(UInteger value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paused_duration</code>.
     */
    public UInteger getOverallPausedDuration() {
        return (UInteger) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_duty_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallDutyDuration(UInteger value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_duty_duration</code>.
     */
    public UInteger getOverallDutyDuration() {
        return (UInteger) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_trip_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallTripDuration(UInteger value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_trip_duration</code>.
     */
    public UInteger getOverallTripDuration() {
        return (UInteger) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_trips</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalTrips(UInteger value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_trips</code>.
     */
    public UInteger getTotalTrips() {
        return (UInteger) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_sum_of_feedback</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalSumOfFeedback(UInteger value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_sum_of_feedback</code>.
     */
    public UInteger getTotalSumOfFeedback() {
        return (UInteger) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_number_of_rated_rides</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalNumberOfRatedRides(UInteger value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_number_of_rated_rides</code>.
     */
    public UInteger getTotalNumberOfRatedRides() {
        return (UInteger) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_late_duty_start_count</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalLateDutyStartCount(UInteger value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_late_duty_start_count</code>.
     */
    public UInteger getTotalLateDutyStartCount() {
        return (UInteger) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_early_duty_end_count</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalEarlyDutyEndCount(UInteger value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_early_duty_end_count</code>.
     */
    public UInteger getTotalEarlyDutyEndCount() {
        return (UInteger) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_late_duty_end_count</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalLateDutyEndCount(UInteger value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_late_duty_end_count</code>.
     */
    public UInteger getTotalLateDutyEndCount() {
        return (UInteger) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_absent_days</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalAbsentDays(UInteger value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_absent_days</code>.
     */
    public UInteger getTotalAbsentDays() {
        return (UInteger) get(28);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.is_active</code>.
     */
    public LeaseDriverPayoutAudRecord setIsActive(Byte value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.created_timestamp</code>.
     */
    public LeaseDriverPayoutAudRecord setCreatedTimestamp(Long value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(30);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.last_updated_timestamp</code>.
     */
    public LeaseDriverPayoutAudRecord setLastUpdatedTimestamp(Long value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(31);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.created_by</code>.
     */
    public LeaseDriverPayoutAudRecord setCreatedBy(UInteger value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(32);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.last_updated_by</code>.
     */
    public LeaseDriverPayoutAudRecord setLastUpdatedBy(UInteger value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(33);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_overtime_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallOvertimeDuration(UInteger value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_overtime_duration</code>.
     */
    public UInteger getOverallOvertimeDuration() {
        return (UInteger) get(34);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_overtime_earnings</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalOvertimeEarnings(BigDecimal value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_overtime_earnings</code>.
     */
    public BigDecimal getTotalOvertimeEarnings() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_earning_incentive</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalTripEarningIncentive(BigDecimal value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_trip_earning_incentive</code>.
     */
    public BigDecimal getTotalTripEarningIncentive() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.lease_agreement_status</code>.
     */
    public LeaseDriverPayoutAudRecord setLeaseAgreementStatus(Byte value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.lease_agreement_status</code>.
     */
    public Byte getLeaseAgreementStatus() {
        return (Byte) get(37);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.signed_lease_agreement</code>.
     */
    public LeaseDriverPayoutAudRecord setSignedLeaseAgreement(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.signed_lease_agreement</code>.
     */
    public String getSignedLeaseAgreement() {
        return (String) get(38);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.slot</code>.
     */
    public LeaseDriverPayoutAudRecord setSlot(UInteger value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.slot</code>.
     */
    public UInteger getSlot() {
        return (UInteger) get(39);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paused_breakup_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPausedBreakupDuration(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paused_breakup_duration</code>.
     */
    public String getOverallPausedBreakupDuration() {
        return (String) get(40);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_pre_overtime_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPreOvertimeDuration(UInteger value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_pre_overtime_duration</code>.
     */
    public UInteger getOverallPreOvertimeDuration() {
        return (UInteger) get(41);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_post_overtime_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPostOvertimeDuration(UInteger value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_post_overtime_duration</code>.
     */
    public UInteger getOverallPostOvertimeDuration() {
        return (UInteger) get(42);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_pre_overtime_earnings</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalPreOvertimeEarnings(BigDecimal value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_pre_overtime_earnings</code>.
     */
    public BigDecimal getTotalPreOvertimeEarnings() {
        return (BigDecimal) get(43);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.total_post_overtime_earnings</code>.
     */
    public LeaseDriverPayoutAudRecord setTotalPostOvertimeEarnings(BigDecimal value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.total_post_overtime_earnings</code>.
     */
    public BigDecimal getTotalPostOvertimeEarnings() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_planned_mbg_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPlannedMbgDuration(UInteger value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_planned_mbg_duration</code>.
     */
    public UInteger getOverallPlannedMbgDuration() {
        return (UInteger) get(45);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_actual_mbg_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallActualMbgDuration(UInteger value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_actual_mbg_duration</code>.
     */
    public UInteger getOverallActualMbgDuration() {
        return (UInteger) get(46);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_mbg_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPaidMbgDuration(UInteger value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_mbg_duration</code>.
     */
    public UInteger getOverallPaidMbgDuration() {
        return (UInteger) get(47);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_actual_supply_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallActualSupplyDuration(UInteger value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_actual_supply_duration</code>.
     */
    public UInteger getOverallActualSupplyDuration() {
        return (UInteger) get(48);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_supply_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPaidSupplyDuration(UInteger value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_supply_duration</code>.
     */
    public UInteger getOverallPaidSupplyDuration() {
        return (UInteger) get(49);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_early_duty_start_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallEarlyDutyStartDuration(UInteger value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_early_duty_start_duration</code>.
     */
    public UInteger getOverallEarlyDutyStartDuration() {
        return (UInteger) get(50);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_late_duty_start_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallLateDutyStartDuration(UInteger value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_late_duty_start_duration</code>.
     */
    public UInteger getOverallLateDutyStartDuration() {
        return (UInteger) get(51);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_early_duty_end_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallEarlyDutyEndDuration(UInteger value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_early_duty_end_duration</code>.
     */
    public UInteger getOverallEarlyDutyEndDuration() {
        return (UInteger) get(52);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_late_duty_end_duration</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallLateDutyEndDuration(UInteger value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_late_duty_end_duration</code>.
     */
    public UInteger getOverallLateDutyEndDuration() {
        return (UInteger) get(53);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_buffer</code>.
     */
    public LeaseDriverPayoutAudRecord setOverallPaidBuffer(UInteger value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_payout_aud.overall_paid_buffer</code>.
     */
    public UInteger getOverallPaidBuffer() {
        return (UInteger) get(54);
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
     * Create a detached LeaseDriverPayoutAudRecord
     */
    public LeaseDriverPayoutAudRecord() {
        super(LeaseDriverPayoutAud.LEASE_DRIVER_PAYOUT_AUD);
    }

    /**
     * Create a detached, initialised LeaseDriverPayoutAudRecord
     */
    public LeaseDriverPayoutAudRecord(UInteger audId, UInteger id, UInteger driverId, UInteger leaseId, String leaseDriverPayoutState, BigDecimal totalEstimatedLeaseCost, BigDecimal totalActualLeaseCost, BigDecimal totalEstimatedMinimumGuarantee, BigDecimal totalActualMinimumGuarantee, BigDecimal totalDriverEarnings, BigDecimal totalLeaseCostPenalty, BigDecimal totalMinimumGuaranteePenalty, BigDecimal totalCommission, BigDecimal totalGst, BigDecimal totalTripEarnings, BigDecimal totalTripIncentive, BigDecimal totalFeedbackIncentive, BigDecimal totalDriverTakeHome, UInteger overallOnlineDuration, UInteger overallPausedDuration, UInteger overallDutyDuration, UInteger overallTripDuration, UInteger totalTrips, UInteger totalSumOfFeedback, UInteger totalNumberOfRatedRides, UInteger totalLateDutyStartCount, UInteger totalEarlyDutyEndCount, UInteger totalLateDutyEndCount, UInteger totalAbsentDays, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, UInteger overallOvertimeDuration, BigDecimal totalOvertimeEarnings, BigDecimal totalTripEarningIncentive, Byte leaseAgreementStatus, String signedLeaseAgreement, UInteger slot, String overallPausedBreakupDuration, UInteger overallPreOvertimeDuration, UInteger overallPostOvertimeDuration, BigDecimal totalPreOvertimeEarnings, BigDecimal totalPostOvertimeEarnings, UInteger overallPlannedMbgDuration, UInteger overallActualMbgDuration, UInteger overallPaidMbgDuration, UInteger overallActualSupplyDuration, UInteger overallPaidSupplyDuration, UInteger overallEarlyDutyStartDuration, UInteger overallLateDutyStartDuration, UInteger overallEarlyDutyEndDuration, UInteger overallLateDutyEndDuration, UInteger overallPaidBuffer) {
        super(LeaseDriverPayoutAud.LEASE_DRIVER_PAYOUT_AUD);

        set(0, audId);
        set(1, id);
        set(2, driverId);
        set(3, leaseId);
        set(4, leaseDriverPayoutState);
        set(5, totalEstimatedLeaseCost);
        set(6, totalActualLeaseCost);
        set(7, totalEstimatedMinimumGuarantee);
        set(8, totalActualMinimumGuarantee);
        set(9, totalDriverEarnings);
        set(10, totalLeaseCostPenalty);
        set(11, totalMinimumGuaranteePenalty);
        set(12, totalCommission);
        set(13, totalGst);
        set(14, totalTripEarnings);
        set(15, totalTripIncentive);
        set(16, totalFeedbackIncentive);
        set(17, totalDriverTakeHome);
        set(18, overallOnlineDuration);
        set(19, overallPausedDuration);
        set(20, overallDutyDuration);
        set(21, overallTripDuration);
        set(22, totalTrips);
        set(23, totalSumOfFeedback);
        set(24, totalNumberOfRatedRides);
        set(25, totalLateDutyStartCount);
        set(26, totalEarlyDutyEndCount);
        set(27, totalLateDutyEndCount);
        set(28, totalAbsentDays);
        set(29, isActive);
        set(30, createdTimestamp);
        set(31, lastUpdatedTimestamp);
        set(32, createdBy);
        set(33, lastUpdatedBy);
        set(34, overallOvertimeDuration);
        set(35, totalOvertimeEarnings);
        set(36, totalTripEarningIncentive);
        set(37, leaseAgreementStatus);
        set(38, signedLeaseAgreement);
        set(39, slot);
        set(40, overallPausedBreakupDuration);
        set(41, overallPreOvertimeDuration);
        set(42, overallPostOvertimeDuration);
        set(43, totalPreOvertimeEarnings);
        set(44, totalPostOvertimeEarnings);
        set(45, overallPlannedMbgDuration);
        set(46, overallActualMbgDuration);
        set(47, overallPaidMbgDuration);
        set(48, overallActualSupplyDuration);
        set(49, overallPaidSupplyDuration);
        set(50, overallEarlyDutyStartDuration);
        set(51, overallLateDutyStartDuration);
        set(52, overallEarlyDutyEndDuration);
        set(53, overallLateDutyEndDuration);
        set(54, overallPaidBuffer);
    }
}
