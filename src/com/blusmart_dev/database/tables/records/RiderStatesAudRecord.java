/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RiderStatesAud;

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
public class RiderStatesAudRecord extends UpdatableRecordImpl<RiderStatesAudRecord> implements Record14<UInteger, UInteger, UInteger, String, UInteger, Byte, Long, Long, UInteger, UInteger, UInteger, UInteger, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1980006881;

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.aud_id</code>.
     */
    public RiderStatesAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.id</code>.
     */
    public RiderStatesAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.rider_id</code>.
     */
    public RiderStatesAudRecord setRiderId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.rider_state</code>.
     */
    public RiderStatesAudRecord setRiderState(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.rider_state</code>.
     */
    public String getRiderState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.service_region_id</code>.
     */
    public RiderStatesAudRecord setServiceRegionId(UInteger value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.service_region_id</code>.
     */
    public UInteger getServiceRegionId() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.is_active</code>.
     */
    public RiderStatesAudRecord setIsActive(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.created_timestamp</code>.
     */
    public RiderStatesAudRecord setCreatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.last_updated_timestamp</code>.
     */
    public RiderStatesAudRecord setLastUpdatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.created_by</code>.
     */
    public RiderStatesAudRecord setCreatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.last_updated_by</code>.
     */
    public RiderStatesAudRecord setLastUpdatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.ride_id</code>.
     */
    public RiderStatesAudRecord setRideId(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.ride_id</code>.
     */
    public UInteger getRideId() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.ride_request_id</code>.
     */
    public RiderStatesAudRecord setRideRequestId(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.latitude</code>.
     */
    public RiderStatesAudRecord setLatitude(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_states_aud.longitude</code>.
     */
    public RiderStatesAudRecord setLongitude(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_states_aud.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(13);
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
    public Row14<UInteger, UInteger, UInteger, String, UInteger, Byte, Long, Long, UInteger, UInteger, UInteger, UInteger, BigDecimal, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, UInteger, UInteger, String, UInteger, Byte, Long, Long, UInteger, UInteger, UInteger, UInteger, BigDecimal, BigDecimal> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RiderStatesAud.RIDER_STATES_AUD.AUD_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return RiderStatesAud.RIDER_STATES_AUD.ID;
    }

    @Override
    public Field<UInteger> field3() {
        return RiderStatesAud.RIDER_STATES_AUD.RIDER_ID;
    }

    @Override
    public Field<String> field4() {
        return RiderStatesAud.RIDER_STATES_AUD.RIDER_STATE;
    }

    @Override
    public Field<UInteger> field5() {
        return RiderStatesAud.RIDER_STATES_AUD.SERVICE_REGION_ID;
    }

    @Override
    public Field<Byte> field6() {
        return RiderStatesAud.RIDER_STATES_AUD.IS_ACTIVE;
    }

    @Override
    public Field<Long> field7() {
        return RiderStatesAud.RIDER_STATES_AUD.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field8() {
        return RiderStatesAud.RIDER_STATES_AUD.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field9() {
        return RiderStatesAud.RIDER_STATES_AUD.CREATED_BY;
    }

    @Override
    public Field<UInteger> field10() {
        return RiderStatesAud.RIDER_STATES_AUD.LAST_UPDATED_BY;
    }

    @Override
    public Field<UInteger> field11() {
        return RiderStatesAud.RIDER_STATES_AUD.RIDE_ID;
    }

    @Override
    public Field<UInteger> field12() {
        return RiderStatesAud.RIDER_STATES_AUD.RIDE_REQUEST_ID;
    }

    @Override
    public Field<BigDecimal> field13() {
        return RiderStatesAud.RIDER_STATES_AUD.LATITUDE;
    }

    @Override
    public Field<BigDecimal> field14() {
        return RiderStatesAud.RIDER_STATES_AUD.LONGITUDE;
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
        return getRiderId();
    }

    @Override
    public String component4() {
        return getRiderState();
    }

    @Override
    public UInteger component5() {
        return getServiceRegionId();
    }

    @Override
    public Byte component6() {
        return getIsActive();
    }

    @Override
    public Long component7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component9() {
        return getCreatedBy();
    }

    @Override
    public UInteger component10() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger component11() {
        return getRideId();
    }

    @Override
    public UInteger component12() {
        return getRideRequestId();
    }

    @Override
    public BigDecimal component13() {
        return getLatitude();
    }

    @Override
    public BigDecimal component14() {
        return getLongitude();
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
        return getRiderId();
    }

    @Override
    public String value4() {
        return getRiderState();
    }

    @Override
    public UInteger value5() {
        return getServiceRegionId();
    }

    @Override
    public Byte value6() {
        return getIsActive();
    }

    @Override
    public Long value7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value9() {
        return getCreatedBy();
    }

    @Override
    public UInteger value10() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger value11() {
        return getRideId();
    }

    @Override
    public UInteger value12() {
        return getRideRequestId();
    }

    @Override
    public BigDecimal value13() {
        return getLatitude();
    }

    @Override
    public BigDecimal value14() {
        return getLongitude();
    }

    @Override
    public RiderStatesAudRecord value1(UInteger value) {
        setAudId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value2(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value3(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value4(String value) {
        setRiderState(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value5(UInteger value) {
        setServiceRegionId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value6(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value7(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value8(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value9(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value10(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value11(UInteger value) {
        setRideId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value12(UInteger value) {
        setRideRequestId(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value13(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord value14(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public RiderStatesAudRecord values(UInteger value1, UInteger value2, UInteger value3, String value4, UInteger value5, Byte value6, Long value7, Long value8, UInteger value9, UInteger value10, UInteger value11, UInteger value12, BigDecimal value13, BigDecimal value14) {
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
     * Create a detached RiderStatesAudRecord
     */
    public RiderStatesAudRecord() {
        super(RiderStatesAud.RIDER_STATES_AUD);
    }

    /**
     * Create a detached, initialised RiderStatesAudRecord
     */
    public RiderStatesAudRecord(UInteger audId, UInteger id, UInteger riderId, String riderState, UInteger serviceRegionId, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, UInteger rideId, UInteger rideRequestId, BigDecimal latitude, BigDecimal longitude) {
        super(RiderStatesAud.RIDER_STATES_AUD);

        set(0, audId);
        set(1, id);
        set(2, riderId);
        set(3, riderState);
        set(4, serviceRegionId);
        set(5, isActive);
        set(6, createdTimestamp);
        set(7, lastUpdatedTimestamp);
        set(8, createdBy);
        set(9, lastUpdatedBy);
        set(10, rideId);
        set(11, rideRequestId);
        set(12, latitude);
        set(13, longitude);
    }
}