/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.LeaseDriverDailyStats;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LeaseDriverDailyStatsRecord extends UpdatableRecordImpl<LeaseDriverDailyStatsRecord> {

    private static final long serialVersionUID = 1419214277;

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.id</code>.
     */
    public LeaseDriverDailyStatsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.lease_id</code>.
     */
    public LeaseDriverDailyStatsRecord setLeaseId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.lease_id</code>.
     */
    public UInteger getLeaseId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.driver_id</code>.
     */
    public LeaseDriverDailyStatsRecord setDriverId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.record_date</code>.
     */
    public LeaseDriverDailyStatsRecord setRecordDate(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.record_date</code>.
     */
    public Long getRecordDate() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.lease_driver_daily_stats_state</code>.
     */
    public LeaseDriverDailyStatsRecord setLeaseDriverDailyStatsState(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.lease_driver_daily_stats_state</code>.
     */
    public String getLeaseDriverDailyStatsState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_online_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalOnlineDuration(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_online_duration</code>.
     */
    public UInteger getTotalOnlineDuration() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_paused_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPausedDuration(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_paused_duration</code>.
     */
    public UInteger getTotalPausedDuration() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_duty_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalDutyDuration(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_duty_duration</code>.
     */
    public UInteger getTotalDutyDuration() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_trip_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalTripDuration(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_trip_duration</code>.
     */
    public UInteger getTotalTripDuration() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.checkin_checkout_ids</code>.
     */
    public LeaseDriverDailyStatsRecord setCheckinCheckoutIds(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.checkin_checkout_ids</code>.
     */
    public String getCheckinCheckoutIds() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.ride_ids</code>.
     */
    public LeaseDriverDailyStatsRecord setRideIds(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.ride_ids</code>.
     */
    public String getRideIds() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.trips_count</code>.
     */
    public LeaseDriverDailyStatsRecord setTripsCount(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.trips_count</code>.
     */
    public UInteger getTripsCount() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.vehicles_count</code>.
     */
    public LeaseDriverDailyStatsRecord setVehiclesCount(UInteger value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.vehicles_count</code>.
     */
    public UInteger getVehiclesCount() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.vehicles_number</code>.
     */
    public LeaseDriverDailyStatsRecord setVehiclesNumber(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.vehicles_number</code>.
     */
    public String getVehiclesNumber() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.sum_of_feedback</code>.
     */
    public LeaseDriverDailyStatsRecord setSumOfFeedback(UInteger value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.sum_of_feedback</code>.
     */
    public UInteger getSumOfFeedback() {
        return (UInteger) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.number_of_rated_rides</code>.
     */
    public LeaseDriverDailyStatsRecord setNumberOfRatedRides(UInteger value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.number_of_rated_rides</code>.
     */
    public UInteger getNumberOfRatedRides() {
        return (UInteger) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.trip_earnings</code>.
     */
    public LeaseDriverDailyStatsRecord setTripEarnings(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.trip_earnings</code>.
     */
    public BigDecimal getTripEarnings() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.estimated_lease_cost</code>.
     */
    public LeaseDriverDailyStatsRecord setEstimatedLeaseCost(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.estimated_lease_cost</code>.
     */
    public BigDecimal getEstimatedLeaseCost() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.actual_lease_cost</code>.
     */
    public LeaseDriverDailyStatsRecord setActualLeaseCost(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.actual_lease_cost</code>.
     */
    public BigDecimal getActualLeaseCost() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.estimated_minimum_guarantee</code>.
     */
    public LeaseDriverDailyStatsRecord setEstimatedMinimumGuarantee(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.estimated_minimum_guarantee</code>.
     */
    public BigDecimal getEstimatedMinimumGuarantee() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.actual_minimum_guarantee</code>.
     */
    public LeaseDriverDailyStatsRecord setActualMinimumGuarantee(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.actual_minimum_guarantee</code>.
     */
    public BigDecimal getActualMinimumGuarantee() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.driver_earnings</code>.
     */
    public LeaseDriverDailyStatsRecord setDriverEarnings(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.driver_earnings</code>.
     */
    public BigDecimal getDriverEarnings() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.lease_cost_penalty</code>.
     */
    public LeaseDriverDailyStatsRecord setLeaseCostPenalty(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.lease_cost_penalty</code>.
     */
    public BigDecimal getLeaseCostPenalty() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.lease_cost_penalty_breakup</code>.
     */
    public LeaseDriverDailyStatsRecord setLeaseCostPenaltyBreakup(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.lease_cost_penalty_breakup</code>.
     */
    public String getLeaseCostPenaltyBreakup() {
        return (String) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.minimum_guarantee_penalty</code>.
     */
    public LeaseDriverDailyStatsRecord setMinimumGuaranteePenalty(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.minimum_guarantee_penalty</code>.
     */
    public BigDecimal getMinimumGuaranteePenalty() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.minimum_guarantee_penalty_breakup</code>.
     */
    public LeaseDriverDailyStatsRecord setMinimumGuaranteePenaltyBreakup(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.minimum_guarantee_penalty_breakup</code>.
     */
    public String getMinimumGuaranteePenaltyBreakup() {
        return (String) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.duty_start_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setDutyStartTimestamp(Long value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.duty_start_timestamp</code>.
     */
    public Long getDutyStartTimestamp() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.duty_end_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setDutyEndTimestamp(Long value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.duty_end_timestamp</code>.
     */
    public Long getDutyEndTimestamp() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.is_driver_present</code>.
     */
    public LeaseDriverDailyStatsRecord setIsDriverPresent(Byte value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.is_driver_present</code>.
     */
    public Byte getIsDriverPresent() {
        return (Byte) get(28);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.is_active</code>.
     */
    public LeaseDriverDailyStatsRecord setIsActive(Byte value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.created_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setCreatedTimestamp(Long value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(30);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.last_updated_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setLastUpdatedTimestamp(Long value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(31);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.created_by</code>.
     */
    public LeaseDriverDailyStatsRecord setCreatedBy(UInteger value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(32);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.last_updated_by</code>.
     */
    public LeaseDriverDailyStatsRecord setLastUpdatedBy(UInteger value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(33);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.commission</code>.
     */
    public LeaseDriverDailyStatsRecord setCommission(BigDecimal value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.commission</code>.
     */
    public BigDecimal getCommission() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.gst</code>.
     */
    public LeaseDriverDailyStatsRecord setGst(BigDecimal value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.gst</code>.
     */
    public BigDecimal getGst() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.driver_take_home</code>.
     */
    public LeaseDriverDailyStatsRecord setDriverTakeHome(BigDecimal value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.driver_take_home</code>.
     */
    public BigDecimal getDriverTakeHome() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_overtime_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalOvertimeDuration(UInteger value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_overtime_duration</code>.
     */
    public UInteger getTotalOvertimeDuration() {
        return (UInteger) get(37);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.overtime_earnings</code>.
     */
    public LeaseDriverDailyStatsRecord setOvertimeEarnings(BigDecimal value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.overtime_earnings</code>.
     */
    public BigDecimal getOvertimeEarnings() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.has_overlapping_happened</code>.
     */
    public LeaseDriverDailyStatsRecord setHasOverlappingHappened(Byte value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.has_overlapping_happened</code>.
     */
    public Byte getHasOverlappingHappened() {
        return (Byte) get(39);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.overlapped_id</code>.
     */
    public LeaseDriverDailyStatsRecord setOverlappedId(Integer value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.overlapped_id</code>.
     */
    public Integer getOverlappedId() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.official_duty_end_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setOfficialDutyEndTimestamp(Long value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.official_duty_end_timestamp</code>.
     */
    public Long getOfficialDutyEndTimestamp() {
        return (Long) get(41);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.latest_hub_reach_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setLatestHubReachTimestamp(Long value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.latest_hub_reach_timestamp</code>.
     */
    public Long getLatestHubReachTimestamp() {
        return (Long) get(42);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.payout_id</code>.
     */
    public LeaseDriverDailyStatsRecord setPayoutId(UInteger value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.payout_id</code>.
     */
    public UInteger getPayoutId() {
        return (UInteger) get(43);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_paused_breakup_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPausedBreakupDuration(String value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_paused_breakup_duration</code>.
     */
    public String getTotalPausedBreakupDuration() {
        return (String) get(44);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.duty_day</code>.
     */
    public LeaseDriverDailyStatsRecord setDutyDay(UInteger value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.duty_day</code>.
     */
    public UInteger getDutyDay() {
        return (UInteger) get(45);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.check_in_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setCheckInTimestamp(Long value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.check_in_timestamp</code>.
     */
    public Long getCheckInTimestamp() {
        return (Long) get(46);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.check_in_hub</code>.
     */
    public LeaseDriverDailyStatsRecord setCheckInHub(String value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.check_in_hub</code>.
     */
    public String getCheckInHub() {
        return (String) get(47);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.vehicle_handover_epochs</code>.
     */
    public LeaseDriverDailyStatsRecord setVehicleHandoverEpochs(String value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.vehicle_handover_epochs</code>.
     */
    public String getVehicleHandoverEpochs() {
        return (String) get(48);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.official_duty_start_timestamp</code>.
     */
    public LeaseDriverDailyStatsRecord setOfficialDutyStartTimestamp(Long value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.official_duty_start_timestamp</code>.
     */
    public Long getOfficialDutyStartTimestamp() {
        return (Long) get(49);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_pre_overtime_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPreOvertimeDuration(UInteger value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_pre_overtime_duration</code>.
     */
    public UInteger getTotalPreOvertimeDuration() {
        return (UInteger) get(50);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_post_overtime_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPostOvertimeDuration(UInteger value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_post_overtime_duration</code>.
     */
    public UInteger getTotalPostOvertimeDuration() {
        return (UInteger) get(51);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.pre_overtime_earnings</code>.
     */
    public LeaseDriverDailyStatsRecord setPreOvertimeEarnings(BigDecimal value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.pre_overtime_earnings</code>.
     */
    public BigDecimal getPreOvertimeEarnings() {
        return (BigDecimal) get(52);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.post_overtime_earnings</code>.
     */
    public LeaseDriverDailyStatsRecord setPostOvertimeEarnings(BigDecimal value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.post_overtime_earnings</code>.
     */
    public BigDecimal getPostOvertimeEarnings() {
        return (BigDecimal) get(53);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.slot</code>.
     */
    public LeaseDriverDailyStatsRecord setSlot(Integer value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.slot</code>.
     */
    public Integer getSlot() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.slot_wise_payout_id</code>.
     */
    public LeaseDriverDailyStatsRecord setSlotWisePayoutId(Integer value) {
        set(55, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.slot_wise_payout_id</code>.
     */
    public Integer getSlotWisePayoutId() {
        return (Integer) get(55);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.attendance_state</code>.
     */
    public LeaseDriverDailyStatsRecord setAttendanceState(String value) {
        set(56, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.attendance_state</code>.
     */
    public String getAttendanceState() {
        return (String) get(56);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.other_flags</code>.
     */
    public LeaseDriverDailyStatsRecord setOtherFlags(String value) {
        set(57, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(57);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_planned_mbg_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPlannedMbgDuration(UInteger value) {
        set(58, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_planned_mbg_duration</code>.
     */
    public UInteger getTotalPlannedMbgDuration() {
        return (UInteger) get(58);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_actual_mbg_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalActualMbgDuration(UInteger value) {
        set(59, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_actual_mbg_duration</code>.
     */
    public UInteger getTotalActualMbgDuration() {
        return (UInteger) get(59);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_mbg_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPaidMbgDuration(UInteger value) {
        set(60, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_mbg_duration</code>.
     */
    public UInteger getTotalPaidMbgDuration() {
        return (UInteger) get(60);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_actual_supply_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalActualSupplyDuration(UInteger value) {
        set(61, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_actual_supply_duration</code>.
     */
    public UInteger getTotalActualSupplyDuration() {
        return (UInteger) get(61);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_supply_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPaidSupplyDuration(UInteger value) {
        set(62, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_supply_duration</code>.
     */
    public UInteger getTotalPaidSupplyDuration() {
        return (UInteger) get(62);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_early_duty_start_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalEarlyDutyStartDuration(UInteger value) {
        set(63, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_early_duty_start_duration</code>.
     */
    public UInteger getTotalEarlyDutyStartDuration() {
        return (UInteger) get(63);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_late_duty_start_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalLateDutyStartDuration(UInteger value) {
        set(64, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_late_duty_start_duration</code>.
     */
    public UInteger getTotalLateDutyStartDuration() {
        return (UInteger) get(64);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_early_duty_end_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalEarlyDutyEndDuration(UInteger value) {
        set(65, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_early_duty_end_duration</code>.
     */
    public UInteger getTotalEarlyDutyEndDuration() {
        return (UInteger) get(65);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_late_duty_end_duration</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalLateDutyEndDuration(UInteger value) {
        set(66, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_late_duty_end_duration</code>.
     */
    public UInteger getTotalLateDutyEndDuration() {
        return (UInteger) get(66);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_buffer</code>.
     */
    public LeaseDriverDailyStatsRecord setTotalPaidBuffer(UInteger value) {
        set(67, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_daily_stats.total_paid_buffer</code>.
     */
    public UInteger getTotalPaidBuffer() {
        return (UInteger) get(67);
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
     * Create a detached LeaseDriverDailyStatsRecord
     */
    public LeaseDriverDailyStatsRecord() {
        super(LeaseDriverDailyStats.LEASE_DRIVER_DAILY_STATS);
    }

    /**
     * Create a detached, initialised LeaseDriverDailyStatsRecord
     */
    public LeaseDriverDailyStatsRecord(UInteger id, UInteger leaseId, UInteger driverId, Long recordDate, String leaseDriverDailyStatsState, UInteger totalOnlineDuration, UInteger totalPausedDuration, UInteger totalDutyDuration, UInteger totalTripDuration, String checkinCheckoutIds, String rideIds, UInteger tripsCount, UInteger vehiclesCount, String vehiclesNumber, UInteger sumOfFeedback, UInteger numberOfRatedRides, BigDecimal tripEarnings, BigDecimal estimatedLeaseCost, BigDecimal actualLeaseCost, BigDecimal estimatedMinimumGuarantee, BigDecimal actualMinimumGuarantee, BigDecimal driverEarnings, BigDecimal leaseCostPenalty, String leaseCostPenaltyBreakup, BigDecimal minimumGuaranteePenalty, String minimumGuaranteePenaltyBreakup, Long dutyStartTimestamp, Long dutyEndTimestamp, Byte isDriverPresent, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, BigDecimal commission, BigDecimal gst, BigDecimal driverTakeHome, UInteger totalOvertimeDuration, BigDecimal overtimeEarnings, Byte hasOverlappingHappened, Integer overlappedId, Long officialDutyEndTimestamp, Long latestHubReachTimestamp, UInteger payoutId, String totalPausedBreakupDuration, UInteger dutyDay, Long checkInTimestamp, String checkInHub, String vehicleHandoverEpochs, Long officialDutyStartTimestamp, UInteger totalPreOvertimeDuration, UInteger totalPostOvertimeDuration, BigDecimal preOvertimeEarnings, BigDecimal postOvertimeEarnings, Integer slot, Integer slotWisePayoutId, String attendanceState, String otherFlags, UInteger totalPlannedMbgDuration, UInteger totalActualMbgDuration, UInteger totalPaidMbgDuration, UInteger totalActualSupplyDuration, UInteger totalPaidSupplyDuration, UInteger totalEarlyDutyStartDuration, UInteger totalLateDutyStartDuration, UInteger totalEarlyDutyEndDuration, UInteger totalLateDutyEndDuration, UInteger totalPaidBuffer) {
        super(LeaseDriverDailyStats.LEASE_DRIVER_DAILY_STATS);

        set(0, id);
        set(1, leaseId);
        set(2, driverId);
        set(3, recordDate);
        set(4, leaseDriverDailyStatsState);
        set(5, totalOnlineDuration);
        set(6, totalPausedDuration);
        set(7, totalDutyDuration);
        set(8, totalTripDuration);
        set(9, checkinCheckoutIds);
        set(10, rideIds);
        set(11, tripsCount);
        set(12, vehiclesCount);
        set(13, vehiclesNumber);
        set(14, sumOfFeedback);
        set(15, numberOfRatedRides);
        set(16, tripEarnings);
        set(17, estimatedLeaseCost);
        set(18, actualLeaseCost);
        set(19, estimatedMinimumGuarantee);
        set(20, actualMinimumGuarantee);
        set(21, driverEarnings);
        set(22, leaseCostPenalty);
        set(23, leaseCostPenaltyBreakup);
        set(24, minimumGuaranteePenalty);
        set(25, minimumGuaranteePenaltyBreakup);
        set(26, dutyStartTimestamp);
        set(27, dutyEndTimestamp);
        set(28, isDriverPresent);
        set(29, isActive);
        set(30, createdTimestamp);
        set(31, lastUpdatedTimestamp);
        set(32, createdBy);
        set(33, lastUpdatedBy);
        set(34, commission);
        set(35, gst);
        set(36, driverTakeHome);
        set(37, totalOvertimeDuration);
        set(38, overtimeEarnings);
        set(39, hasOverlappingHappened);
        set(40, overlappedId);
        set(41, officialDutyEndTimestamp);
        set(42, latestHubReachTimestamp);
        set(43, payoutId);
        set(44, totalPausedBreakupDuration);
        set(45, dutyDay);
        set(46, checkInTimestamp);
        set(47, checkInHub);
        set(48, vehicleHandoverEpochs);
        set(49, officialDutyStartTimestamp);
        set(50, totalPreOvertimeDuration);
        set(51, totalPostOvertimeDuration);
        set(52, preOvertimeEarnings);
        set(53, postOvertimeEarnings);
        set(54, slot);
        set(55, slotWisePayoutId);
        set(56, attendanceState);
        set(57, otherFlags);
        set(58, totalPlannedMbgDuration);
        set(59, totalActualMbgDuration);
        set(60, totalPaidMbgDuration);
        set(61, totalActualSupplyDuration);
        set(62, totalPaidSupplyDuration);
        set(63, totalEarlyDutyStartDuration);
        set(64, totalLateDutyStartDuration);
        set(65, totalEarlyDutyEndDuration);
        set(66, totalLateDutyEndDuration);
        set(67, totalPaidBuffer);
    }
}