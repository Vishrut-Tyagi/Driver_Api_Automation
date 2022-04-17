/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RideRequests;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RideRequestsRecord extends UpdatableRecordImpl<RideRequestsRecord> {

    private static final long serialVersionUID = 1525878970;

    /**
     * Setter for <code>blusmartDevDb.ride_requests.id</code>.
     */
    public RideRequestsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.rider_id</code>.
     */
    public RideRequestsRecord setRiderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.rider_type</code>.
     */
    public RideRequestsRecord setRiderType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.rider_type</code>.
     */
    public String getRiderType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.request_state</code>.
     */
    public RideRequestsRecord setRequestState(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.request_state</code>.
     */
    public String getRequestState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pick_up_location</code>.
     */
    public RideRequestsRecord setPickUpLocation(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pick_up_location</code>.
     */
    public String getPickUpLocation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.drop_location</code>.
     */
    public RideRequestsRecord setDropLocation(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.drop_location</code>.
     */
    public String getDropLocation() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.verification_token_id</code>.
     */
    public RideRequestsRecord setVerificationTokenId(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.verification_token_id</code>.
     */
    public UInteger getVerificationTokenId() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.request_location</code>.
     */
    public RideRequestsRecord setRequestLocation(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.request_location</code>.
     */
    public String getRequestLocation() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pick_up_location_lat</code>.
     */
    public RideRequestsRecord setPickUpLocationLat(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pick_up_location_lat</code>.
     */
    public BigDecimal getPickUpLocationLat() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.drop_location_lat</code>.
     */
    public RideRequestsRecord setDropLocationLat(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.drop_location_lat</code>.
     */
    public BigDecimal getDropLocationLat() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.request_location_lat</code>.
     */
    public RideRequestsRecord setRequestLocationLat(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.request_location_lat</code>.
     */
    public BigDecimal getRequestLocationLat() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pick_up_location_long</code>.
     */
    public RideRequestsRecord setPickUpLocationLong(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pick_up_location_long</code>.
     */
    public BigDecimal getPickUpLocationLong() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.drop_location_long</code>.
     */
    public RideRequestsRecord setDropLocationLong(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.drop_location_long</code>.
     */
    public BigDecimal getDropLocationLong() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.request_location_long</code>.
     */
    public RideRequestsRecord setRequestLocationLong(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.request_location_long</code>.
     */
    public BigDecimal getRequestLocationLong() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.estimated_start_timestamp</code>.
     */
    public RideRequestsRecord setEstimatedStartTimestamp(Long value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.estimated_start_timestamp</code>.
     */
    public Long getEstimatedStartTimestamp() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.estimated_completion_timestamp</code>.
     */
    public RideRequestsRecord setEstimatedCompletionTimestamp(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.estimated_completion_timestamp</code>.
     */
    public Long getEstimatedCompletionTimestamp() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.estimated_amount</code>.
     */
    public RideRequestsRecord setEstimatedAmount(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.estimated_amount</code>.
     */
    public BigDecimal getEstimatedAmount() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.estimated_distance</code>.
     */
    public RideRequestsRecord setEstimatedDistance(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.estimated_distance</code>.
     */
    public BigDecimal getEstimatedDistance() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.no_of_passengers</code>.
     */
    public RideRequestsRecord setNoOfPassengers(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.no_of_passengers</code>.
     */
    public Integer getNoOfPassengers() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.is_active</code>.
     */
    public RideRequestsRecord setIsActive(Byte value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.created_timestamp</code>.
     */
    public RideRequestsRecord setCreatedTimestamp(Long value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.last_updated_timestamp</code>.
     */
    public RideRequestsRecord setLastUpdatedTimestamp(Long value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.created_by</code>.
     */
    public RideRequestsRecord setCreatedBy(UInteger value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.last_updated_by</code>.
     */
    public RideRequestsRecord setLastUpdatedBy(UInteger value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.payment_mode</code>.
     */
    public RideRequestsRecord setPaymentMode(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.payment_mode</code>.
     */
    public String getPaymentMode() {
        return (String) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.platform</code>.
     */
    public RideRequestsRecord setPlatform(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.platform</code>.
     */
    public String getPlatform() {
        return (String) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.ride_type</code>.
     */
    public RideRequestsRecord setRideType(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.ride_type</code>.
     */
    public String getRideType() {
        return (String) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.service_region_id</code>.
     */
    public RideRequestsRecord setServiceRegionId(UInteger value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.service_region_id</code>.
     */
    public UInteger getServiceRegionId() {
        return (UInteger) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.payment_order_id</code>.
     */
    public RideRequestsRecord setPaymentOrderId(UInteger value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.payment_order_id</code>.
     */
    public UInteger getPaymentOrderId() {
        return (UInteger) get(28);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.cancellation_reason</code>.
     */
    public RideRequestsRecord setCancellationReason(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.cancellation_reason</code>.
     */
    public String getCancellationReason() {
        return (String) get(29);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pickup_drop_direction</code>.
     */
    public RideRequestsRecord setPickupDropDirection(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pickup_drop_direction</code>.
     */
    public String getPickupDropDirection() {
        return (String) get(30);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.flight_no</code>.
     */
    public RideRequestsRecord setFlightNo(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.flight_no</code>.
     */
    public String getFlightNo() {
        return (String) get(31);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pick_drop_path_id</code>.
     */
    public RideRequestsRecord setPickDropPathId(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pick_drop_path_id</code>.
     */
    public String getPickDropPathId() {
        return (String) get(32);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.eligible_timestamp</code>.
     */
    public RideRequestsRecord setEligibleTimestamp(Long value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.eligible_timestamp</code>.
     */
    public Long getEligibleTimestamp() {
        return (Long) get(33);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.ridecell_trip_id</code>.
     */
    public RideRequestsRecord setRidecellTripId(UInteger value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.ridecell_trip_id</code>.
     */
    public UInteger getRidecellTripId() {
        return (UInteger) get(34);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.package_code</code>.
     */
    public RideRequestsRecord setPackageCode(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.package_code</code>.
     */
    public String getPackageCode() {
        return (String) get(35);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.pricing_details_id</code>.
     */
    public RideRequestsRecord setPricingDetailsId(Integer value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.pricing_details_id</code>.
     */
    public Integer getPricingDetailsId() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.confirmation_timestamp</code>.
     */
    public RideRequestsRecord setConfirmationTimestamp(Long value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.confirmation_timestamp</code>.
     */
    public Long getConfirmationTimestamp() {
        return (Long) get(37);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.ticket_id</code>.
     */
    public RideRequestsRecord setTicketId(UInteger value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.ticket_id</code>.
     */
    public UInteger getTicketId() {
        return (UInteger) get(38);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.cancellation_timestamp</code>.
     */
    public RideRequestsRecord setCancellationTimestamp(Long value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.cancellation_timestamp</code>.
     */
    public Long getCancellationTimestamp() {
        return (Long) get(39);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.promo_code</code>.
     */
    public RideRequestsRecord setPromoCode(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(40);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.source</code>.
     */
    public RideRequestsRecord setSource(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.source</code>.
     */
    public String getSource() {
        return (String) get(41);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.ride_category</code>.
     */
    public RideRequestsRecord setRideCategory(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.ride_category</code>.
     */
    public String getRideCategory() {
        return (String) get(42);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.other_flags</code>.
     */
    public RideRequestsRecord setOtherFlags(String value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(43);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.additional_promo</code>.
     */
    public RideRequestsRecord setAdditionalPromo(String value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.additional_promo</code>.
     */
    public String getAdditionalPromo() {
        return (String) get(44);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.request_type</code>.
     */
    public RideRequestsRecord setRequestType(String value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.request_type</code>.
     */
    public String getRequestType() {
        return (String) get(45);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.booked_for</code>.
     */
    public RideRequestsRecord setBookedFor(Integer value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.booked_for</code>.
     */
    public Integer getBookedFor() {
        return (Integer) get(46);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.booked_by</code>.
     */
    public RideRequestsRecord setBookedBy(Integer value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.booked_by</code>.
     */
    public Integer getBookedBy() {
        return (Integer) get(47);
    }

    /**
     * Setter for <code>blusmartDevDb.ride_requests.price_map_id</code>.
     */
    public RideRequestsRecord setPriceMapId(Integer value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.ride_requests.price_map_id</code>.
     */
    public Integer getPriceMapId() {
        return (Integer) get(48);
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
     * Create a detached RideRequestsRecord
     */
    public RideRequestsRecord() {
        super(RideRequests.RIDE_REQUESTS);
    }

    /**
     * Create a detached, initialised RideRequestsRecord
     */
    public RideRequestsRecord(UInteger id, UInteger riderId, String riderType, String requestState, String pickUpLocation, String dropLocation, UInteger verificationTokenId, String requestLocation, BigDecimal pickUpLocationLat, BigDecimal dropLocationLat, BigDecimal requestLocationLat, BigDecimal pickUpLocationLong, BigDecimal dropLocationLong, BigDecimal requestLocationLong, Long estimatedStartTimestamp, Long estimatedCompletionTimestamp, BigDecimal estimatedAmount, BigDecimal estimatedDistance, Integer noOfPassengers, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String paymentMode, String platform, String rideType, UInteger serviceRegionId, UInteger paymentOrderId, String cancellationReason, String pickupDropDirection, String flightNo, String pickDropPathId, Long eligibleTimestamp, UInteger ridecellTripId, String packageCode, Integer pricingDetailsId, Long confirmationTimestamp, UInteger ticketId, Long cancellationTimestamp, String promoCode, String source, String rideCategory, String otherFlags, String additionalPromo, String requestType, Integer bookedFor, Integer bookedBy, Integer priceMapId) {
        super(RideRequests.RIDE_REQUESTS);

        set(0, id);
        set(1, riderId);
        set(2, riderType);
        set(3, requestState);
        set(4, pickUpLocation);
        set(5, dropLocation);
        set(6, verificationTokenId);
        set(7, requestLocation);
        set(8, pickUpLocationLat);
        set(9, dropLocationLat);
        set(10, requestLocationLat);
        set(11, pickUpLocationLong);
        set(12, dropLocationLong);
        set(13, requestLocationLong);
        set(14, estimatedStartTimestamp);
        set(15, estimatedCompletionTimestamp);
        set(16, estimatedAmount);
        set(17, estimatedDistance);
        set(18, noOfPassengers);
        set(19, isActive);
        set(20, createdTimestamp);
        set(21, lastUpdatedTimestamp);
        set(22, createdBy);
        set(23, lastUpdatedBy);
        set(24, paymentMode);
        set(25, platform);
        set(26, rideType);
        set(27, serviceRegionId);
        set(28, paymentOrderId);
        set(29, cancellationReason);
        set(30, pickupDropDirection);
        set(31, flightNo);
        set(32, pickDropPathId);
        set(33, eligibleTimestamp);
        set(34, ridecellTripId);
        set(35, packageCode);
        set(36, pricingDetailsId);
        set(37, confirmationTimestamp);
        set(38, ticketId);
        set(39, cancellationTimestamp);
        set(40, promoCode);
        set(41, source);
        set(42, rideCategory);
        set(43, otherFlags);
        set(44, additionalPromo);
        set(45, requestType);
        set(46, bookedFor);
        set(47, bookedBy);
        set(48, priceMapId);
    }
}
