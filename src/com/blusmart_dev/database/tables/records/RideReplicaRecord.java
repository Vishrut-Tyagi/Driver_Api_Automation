/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RideReplica;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RideReplicaRecord extends UpdatableRecordImpl<RideReplicaRecord> {

    private static final long serialVersionUID = -803819680;

    /**
     * Setter for <code>blusmartDevDb.ride_replica.id</code>.
     */
    public RideReplicaRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.rider_id</code>.
     */
    public RideReplicaRecord setRiderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.driver_id</code>.
     */
    public RideReplicaRecord setDriverId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.ride_state</code>.
     */
    public RideReplicaRecord setRideState(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.ride_state</code>.
     */
    public String getRideState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.ride_type</code>.
     */
    public RideReplicaRecord setRideType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.ride_type</code>.
     */
    public String getRideType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.rider_type</code>.
     */
    public RideReplicaRecord setRiderType(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.rider_type</code>.
     */
    public String getRiderType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.vehicle_number</code>.
     */
    public RideReplicaRecord setVehicleNumber(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.vehicle_number</code>.
     */
    public String getVehicleNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.pick_up_timestamp</code>.
     */
    public RideReplicaRecord setPickUpTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.pick_up_timestamp</code>.
     */
    public Long getPickUpTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.arrival_timestamp</code>.
     */
    public RideReplicaRecord setArrivalTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.arrival_timestamp</code>.
     */
    public Long getArrivalTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.drop_timestamp</code>.
     */
    public RideReplicaRecord setDropTimestamp(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.drop_timestamp</code>.
     */
    public Long getDropTimestamp() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.assign_timestamp</code>.
     */
    public RideReplicaRecord setAssignTimestamp(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.assign_timestamp</code>.
     */
    public Long getAssignTimestamp() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.no_show_timestamp</code>.
     */
    public RideReplicaRecord setNoShowTimestamp(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.no_show_timestamp</code>.
     */
    public Long getNoShowTimestamp() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.pick_up_location</code>.
     */
    public RideReplicaRecord setPickUpLocation(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.pick_up_location</code>.
     */
    public String getPickUpLocation() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.arrival_location</code>.
     */
    public RideReplicaRecord setArrivalLocation(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.arrival_location</code>.
     */
    public String getArrivalLocation() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.drop_location</code>.
     */
    public RideReplicaRecord setDropLocation(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.drop_location</code>.
     */
    public String getDropLocation() {
        return (String) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.assign_location</code>.
     */
    public RideReplicaRecord setAssignLocation(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.assign_location</code>.
     */
    public String getAssignLocation() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.no_show_location</code>.
     */
    public RideReplicaRecord setNoShowLocation(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.no_show_location</code>.
     */
    public String getNoShowLocation() {
        return (String) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.pick_up_lat</code>.
     */
    public RideReplicaRecord setPickUpLat(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.pick_up_lat</code>.
     */
    public BigDecimal getPickUpLat() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.arrival_lat</code>.
     */
    public RideReplicaRecord setArrivalLat(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.arrival_lat</code>.
     */
    public BigDecimal getArrivalLat() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.drop_lat</code>.
     */
    public RideReplicaRecord setDropLat(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.drop_lat</code>.
     */
    public BigDecimal getDropLat() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.assign_lat</code>.
     */
    public RideReplicaRecord setAssignLat(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.assign_lat</code>.
     */
    public BigDecimal getAssignLat() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.no_show_lat</code>.
     */
    public RideReplicaRecord setNoShowLat(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.no_show_lat</code>.
     */
    public BigDecimal getNoShowLat() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.pick_up_long</code>.
     */
    public RideReplicaRecord setPickUpLong(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.pick_up_long</code>.
     */
    public BigDecimal getPickUpLong() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.arrival_long</code>.
     */
    public RideReplicaRecord setArrivalLong(BigDecimal value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.arrival_long</code>.
     */
    public BigDecimal getArrivalLong() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.drop_long</code>.
     */
    public RideReplicaRecord setDropLong(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.drop_long</code>.
     */
    public BigDecimal getDropLong() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.assign_long</code>.
     */
    public RideReplicaRecord setAssignLong(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.assign_long</code>.
     */
    public BigDecimal getAssignLong() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.no_show_long</code>.
     */
    public RideReplicaRecord setNoShowLong(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.no_show_long</code>.
     */
    public BigDecimal getNoShowLong() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_start_soc</code>.
     */
    public RideReplicaRecord setTripStartSoc(Integer value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_start_soc</code>.
     */
    public Integer getTripStartSoc() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_complete_soc</code>.
     */
    public RideReplicaRecord setTripCompleteSoc(Integer value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_complete_soc</code>.
     */
    public Integer getTripCompleteSoc() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.platform</code>.
     */
    public RideReplicaRecord setPlatform(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.platform</code>.
     */
    public String getPlatform() {
        return (String) get(29);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_start_timestamp</code>.
     */
    public RideReplicaRecord setEstimatedStartTimestamp(Long value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_start_timestamp</code>.
     */
    public Long getEstimatedStartTimestamp() {
        return (Long) get(30);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_completion_timestamp</code>.
     */
    public RideReplicaRecord setEstimatedCompletionTimestamp(Long value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_completion_timestamp</code>.
     */
    public Long getEstimatedCompletionTimestamp() {
        return (Long) get(31);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_completion_timestamp</code>.
     */
    public RideReplicaRecord setActualCompletionTimestamp(Long value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_completion_timestamp</code>.
     */
    public Long getActualCompletionTimestamp() {
        return (Long) get(32);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_ride_distance</code>.
     */
    public RideReplicaRecord setEstimatedRideDistance(BigDecimal value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_ride_distance</code>.
     */
    public BigDecimal getEstimatedRideDistance() {
        return (BigDecimal) get(33);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_ride_distance</code>.
     */
    public RideReplicaRecord setActualRideDistance(BigDecimal value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_ride_distance</code>.
     */
    public BigDecimal getActualRideDistance() {
        return (BigDecimal) get(34);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_pickup_distance</code>.
     */
    public RideReplicaRecord setEstimatedPickupDistance(BigDecimal value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_pickup_distance</code>.
     */
    public BigDecimal getEstimatedPickupDistance() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_pickup_distance</code>.
     */
    public RideReplicaRecord setActualPickupDistance(BigDecimal value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_pickup_distance</code>.
     */
    public BigDecimal getActualPickupDistance() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_drop_distance</code>.
     */
    public RideReplicaRecord setEstimatedDropDistance(BigDecimal value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_drop_distance</code>.
     */
    public BigDecimal getEstimatedDropDistance() {
        return (BigDecimal) get(37);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_drop_distance</code>.
     */
    public RideReplicaRecord setActualDropDistance(BigDecimal value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_drop_distance</code>.
     */
    public BigDecimal getActualDropDistance() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.pickup_path</code>.
     */
    public RideReplicaRecord setPickupPath(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.pickup_path</code>.
     */
    public String getPickupPath() {
        return (String) get(39);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.drop_path</code>.
     */
    public RideReplicaRecord setDropPath(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.drop_path</code>.
     */
    public String getDropPath() {
        return (String) get(40);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_amount</code>.
     */
    public RideReplicaRecord setEstimatedAmount(BigDecimal value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_amount</code>.
     */
    public BigDecimal getEstimatedAmount() {
        return (BigDecimal) get(41);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_amount</code>.
     */
    public RideReplicaRecord setActualAmount(BigDecimal value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_amount</code>.
     */
    public BigDecimal getActualAmount() {
        return (BigDecimal) get(42);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.discount_amount</code>.
     */
    public RideReplicaRecord setDiscountAmount(BigDecimal value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.discount_amount</code>.
     */
    public BigDecimal getDiscountAmount() {
        return (BigDecimal) get(43);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.payment_order_id</code>.
     */
    public RideReplicaRecord setPaymentOrderId(Integer value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.payment_order_id</code>.
     */
    public Integer getPaymentOrderId() {
        return (Integer) get(44);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.payment_mode</code>.
     */
    public RideReplicaRecord setPaymentMode(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.payment_mode</code>.
     */
    public String getPaymentMode() {
        return (String) get(45);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.ride_request_id</code>.
     */
    public RideReplicaRecord setRideRequestId(UInteger value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(46);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.is_active</code>.
     */
    public RideReplicaRecord setIsActive(Byte value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(47);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.created_timestamp</code>.
     */
    public RideReplicaRecord setCreatedTimestamp(Long value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(48);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.last_updated_timestamp</code>.
     */
    public RideReplicaRecord setLastUpdatedTimestamp(Long value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(49);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.created_by</code>.
     */
    public RideReplicaRecord setCreatedBy(UInteger value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(50);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.last_updated_by</code>.
     */
    public RideReplicaRecord setLastUpdatedBy(UInteger value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(51);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.service_region_id</code>.
     */
    public RideReplicaRecord setServiceRegionId(UInteger value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.service_region_id</code>.
     */
    public UInteger getServiceRegionId() {
        return (UInteger) get(52);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.version_id</code>.
     */
    public RideReplicaRecord setVersionId(Integer value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.version_id</code>.
     */
    public Integer getVersionId() {
        return (Integer) get(53);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_assignment_soc</code>.
     */
    public RideReplicaRecord setTripAssignmentSoc(Integer value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_assignment_soc</code>.
     */
    public Integer getTripAssignmentSoc() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_assignment_dte</code>.
     */
    public RideReplicaRecord setTripAssignmentDte(Integer value) {
        set(55, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_assignment_dte</code>.
     */
    public Integer getTripAssignmentDte() {
        return (Integer) get(55);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_start_dte</code>.
     */
    public RideReplicaRecord setTripStartDte(Integer value) {
        set(56, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_start_dte</code>.
     */
    public Integer getTripStartDte() {
        return (Integer) get(56);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.trip_completion_dte</code>.
     */
    public RideReplicaRecord setTripCompletionDte(Integer value) {
        set(57, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.trip_completion_dte</code>.
     */
    public Integer getTripCompletionDte() {
        return (Integer) get(57);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.estimated_pickup_timestamp</code>.
     */
    public RideReplicaRecord setEstimatedPickupTimestamp(Long value) {
        set(58, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.estimated_pickup_timestamp</code>.
     */
    public Long getEstimatedPickupTimestamp() {
        return (Long) get(58);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.destination_state</code>.
     */
    public RideReplicaRecord setDestinationState(String value) {
        set(59, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.destination_state</code>.
     */
    public String getDestinationState() {
        return (String) get(59);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_start_timestamp</code>.
     */
    public RideReplicaRecord setActualStartTimestamp(Long value) {
        set(60, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_start_timestamp</code>.
     */
    public Long getActualStartTimestamp() {
        return (Long) get(60);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.assigned_by</code>.
     */
    public RideReplicaRecord setAssignedBy(UInteger value) {
        set(61, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.assigned_by</code>.
     */
    public UInteger getAssignedBy() {
        return (UInteger) get(61);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.rejected_by</code>.
     */
    public RideReplicaRecord setRejectedBy(String value) {
        set(62, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.rejected_by</code>.
     */
    public String getRejectedBy() {
        return (String) get(62);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.cancellation_eta</code>.
     */
    public RideReplicaRecord setCancellationEta(Long value) {
        set(63, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.cancellation_eta</code>.
     */
    public Long getCancellationEta() {
        return (Long) get(63);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.promo_code</code>.
     */
    public RideReplicaRecord setPromoCode(String value) {
        set(64, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(64);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.ride_category</code>.
     */
    public RideReplicaRecord setRideCategory(String value) {
        set(65, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.ride_category</code>.
     */
    public String getRideCategory() {
        return (String) get(65);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.other_flags</code>.
     */
    public RideReplicaRecord setOtherFlags(String value) {
        set(66, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(66);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_pickup_lat</code>.
     */
    public RideReplicaRecord setActualPickupLat(BigDecimal value) {
        set(67, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_pickup_lat</code>.
     */
    public BigDecimal getActualPickupLat() {
        return (BigDecimal) get(67);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.actual_pickup_long</code>.
     */
    public RideReplicaRecord setActualPickupLong(BigDecimal value) {
        set(68, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.actual_pickup_long</code>.
     */
    public BigDecimal getActualPickupLong() {
        return (BigDecimal) get(68);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.booked_by</code>.
     */
    public RideReplicaRecord setBookedBy(Integer value) {
        set(69, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.booked_by</code>.
     */
    public Integer getBookedBy() {
        return (Integer) get(69);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.eta</code>.
     */
    public RideReplicaRecord setEta(Long value) {
        set(70, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.eta</code>.
     */
    public Long getEta() {
        return (Long) get(70);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.etd</code>.
     */
    public RideReplicaRecord setEtd(Long value) {
        set(71, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.etd</code>.
     */
    public Long getEtd() {
        return (Long) get(71);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.dta</code>.
     */
    public RideReplicaRecord setDta(BigDecimal value) {
        set(72, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.dta</code>.
     */
    public BigDecimal getDta() {
        return (BigDecimal) get(72);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.dtd</code>.
     */
    public RideReplicaRecord setDtd(BigDecimal value) {
        set(73, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.dtd</code>.
     */
    public BigDecimal getDtd() {
        return (BigDecimal) get(73);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.driver_not_moving</code>.
     */
    public RideReplicaRecord setDriverNotMoving(Long value) {
        set(74, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.driver_not_moving</code>.
     */
    public Long getDriverNotMoving() {
        return (Long) get(74);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.no_gps_ping</code>.
     */
    public RideReplicaRecord setNoGpsPing(Long value) {
        set(75, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.no_gps_ping</code>.
     */
    public Long getNoGpsPing() {
        return (Long) get(75);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.current_soc</code>.
     */
    public RideReplicaRecord setCurrentSoc(Integer value) {
        set(76, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.current_soc</code>.
     */
    public Integer getCurrentSoc() {
        return (Integer) get(76);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_replica.current_dte</code>.
     */
    public RideReplicaRecord setCurrentDte(Integer value) {
        set(77, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_replica.current_dte</code>.
     */
    public Integer getCurrentDte() {
        return (Integer) get(77);
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
     * Create a detached RideReplicaRecord
     */
    public RideReplicaRecord() {
        super(RideReplica.RIDE_REPLICA);
    }

    /**
     * Create a detached, initialised RideReplicaRecord
     */
    public RideReplicaRecord(UInteger id, UInteger riderId, UInteger driverId, String rideState, String rideType, String riderType, String vehicleNumber, Long pickUpTimestamp, Long arrivalTimestamp, Long dropTimestamp, Long assignTimestamp, Long noShowTimestamp, String pickUpLocation, String arrivalLocation, String dropLocation, String assignLocation, String noShowLocation, BigDecimal pickUpLat, BigDecimal arrivalLat, BigDecimal dropLat, BigDecimal assignLat, BigDecimal noShowLat, BigDecimal pickUpLong, BigDecimal arrivalLong, BigDecimal dropLong, BigDecimal assignLong, BigDecimal noShowLong, Integer tripStartSoc, Integer tripCompleteSoc, String platform, Long estimatedStartTimestamp, Long estimatedCompletionTimestamp, Long actualCompletionTimestamp, BigDecimal estimatedRideDistance, BigDecimal actualRideDistance, BigDecimal estimatedPickupDistance, BigDecimal actualPickupDistance, BigDecimal estimatedDropDistance, BigDecimal actualDropDistance, String pickupPath, String dropPath, BigDecimal estimatedAmount, BigDecimal actualAmount, BigDecimal discountAmount, Integer paymentOrderId, String paymentMode, UInteger rideRequestId, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, UInteger serviceRegionId, Integer versionId, Integer tripAssignmentSoc, Integer tripAssignmentDte, Integer tripStartDte, Integer tripCompletionDte, Long estimatedPickupTimestamp, String destinationState, Long actualStartTimestamp, UInteger assignedBy, String rejectedBy, Long cancellationEta, String promoCode, String rideCategory, String otherFlags, BigDecimal actualPickupLat, BigDecimal actualPickupLong, Integer bookedBy, Long eta, Long etd, BigDecimal dta, BigDecimal dtd, Long driverNotMoving, Long noGpsPing, Integer currentSoc, Integer currentDte) {
        super(RideReplica.RIDE_REPLICA);

        set(0, id);
        set(1, riderId);
        set(2, driverId);
        set(3, rideState);
        set(4, rideType);
        set(5, riderType);
        set(6, vehicleNumber);
        set(7, pickUpTimestamp);
        set(8, arrivalTimestamp);
        set(9, dropTimestamp);
        set(10, assignTimestamp);
        set(11, noShowTimestamp);
        set(12, pickUpLocation);
        set(13, arrivalLocation);
        set(14, dropLocation);
        set(15, assignLocation);
        set(16, noShowLocation);
        set(17, pickUpLat);
        set(18, arrivalLat);
        set(19, dropLat);
        set(20, assignLat);
        set(21, noShowLat);
        set(22, pickUpLong);
        set(23, arrivalLong);
        set(24, dropLong);
        set(25, assignLong);
        set(26, noShowLong);
        set(27, tripStartSoc);
        set(28, tripCompleteSoc);
        set(29, platform);
        set(30, estimatedStartTimestamp);
        set(31, estimatedCompletionTimestamp);
        set(32, actualCompletionTimestamp);
        set(33, estimatedRideDistance);
        set(34, actualRideDistance);
        set(35, estimatedPickupDistance);
        set(36, actualPickupDistance);
        set(37, estimatedDropDistance);
        set(38, actualDropDistance);
        set(39, pickupPath);
        set(40, dropPath);
        set(41, estimatedAmount);
        set(42, actualAmount);
        set(43, discountAmount);
        set(44, paymentOrderId);
        set(45, paymentMode);
        set(46, rideRequestId);
        set(47, isActive);
        set(48, createdTimestamp);
        set(49, lastUpdatedTimestamp);
        set(50, createdBy);
        set(51, lastUpdatedBy);
        set(52, serviceRegionId);
        set(53, versionId);
        set(54, tripAssignmentSoc);
        set(55, tripAssignmentDte);
        set(56, tripStartDte);
        set(57, tripCompletionDte);
        set(58, estimatedPickupTimestamp);
        set(59, destinationState);
        set(60, actualStartTimestamp);
        set(61, assignedBy);
        set(62, rejectedBy);
        set(63, cancellationEta);
        set(64, promoCode);
        set(65, rideCategory);
        set(66, otherFlags);
        set(67, actualPickupLat);
        set(68, actualPickupLong);
        set(69, bookedBy);
        set(70, eta);
        set(71, etd);
        set(72, dta);
        set(73, dtd);
        set(74, driverNotMoving);
        set(75, noGpsPing);
        set(76, currentSoc);
        set(77, currentDte);
    }
}
