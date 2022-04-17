/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.PickupNotesAud;

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
public class PickupNotesAudRecord extends UpdatableRecordImpl<PickupNotesAudRecord> implements Record14<UInteger, UInteger, UInteger, String, Byte, UInteger, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 1821083386;

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.aud_id</code>.
     */
    public PickupNotesAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.id</code>.
     */
    public PickupNotesAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.rider_id</code>.
     */
    public PickupNotesAudRecord setRiderId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.place_hash</code>.
     */
    public PickupNotesAudRecord setPlaceHash(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.place_hash</code>.
     */
    public String getPlaceHash() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.is_for_all</code>.
     */
    public PickupNotesAudRecord setIsForAll(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.is_for_all</code>.
     */
    public Byte getIsForAll() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.ride_request_id</code>.
     */
    public PickupNotesAudRecord setRideRequestId(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.latitude</code>.
     */
    public PickupNotesAudRecord setLatitude(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.longitude</code>.
     */
    public PickupNotesAudRecord setLongitude(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.notes</code>.
     */
    public PickupNotesAudRecord setNotes(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.notes</code>.
     */
    public String getNotes() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.is_active</code>.
     */
    public PickupNotesAudRecord setIsActive(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.created_timestamp</code>.
     */
    public PickupNotesAudRecord setCreatedTimestamp(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.last_updated_timestamp</code>.
     */
    public PickupNotesAudRecord setLastUpdatedTimestamp(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.created_by</code>.
     */
    public PickupNotesAudRecord setCreatedBy(UInteger value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.pickup_notes_aud.last_updated_by</code>.
     */
    public PickupNotesAudRecord setLastUpdatedBy(UInteger value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.pickup_notes_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(13);
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
    public Row14<UInteger, UInteger, UInteger, String, Byte, UInteger, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, UInteger, UInteger, String, Byte, UInteger, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return PickupNotesAud.PICKUP_NOTES_AUD.AUD_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return PickupNotesAud.PICKUP_NOTES_AUD.ID;
    }

    @Override
    public Field<UInteger> field3() {
        return PickupNotesAud.PICKUP_NOTES_AUD.RIDER_ID;
    }

    @Override
    public Field<String> field4() {
        return PickupNotesAud.PICKUP_NOTES_AUD.PLACE_HASH;
    }

    @Override
    public Field<Byte> field5() {
        return PickupNotesAud.PICKUP_NOTES_AUD.IS_FOR_ALL;
    }

    @Override
    public Field<UInteger> field6() {
        return PickupNotesAud.PICKUP_NOTES_AUD.RIDE_REQUEST_ID;
    }

    @Override
    public Field<BigDecimal> field7() {
        return PickupNotesAud.PICKUP_NOTES_AUD.LATITUDE;
    }

    @Override
    public Field<BigDecimal> field8() {
        return PickupNotesAud.PICKUP_NOTES_AUD.LONGITUDE;
    }

    @Override
    public Field<String> field9() {
        return PickupNotesAud.PICKUP_NOTES_AUD.NOTES;
    }

    @Override
    public Field<Byte> field10() {
        return PickupNotesAud.PICKUP_NOTES_AUD.IS_ACTIVE;
    }

    @Override
    public Field<Long> field11() {
        return PickupNotesAud.PICKUP_NOTES_AUD.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field12() {
        return PickupNotesAud.PICKUP_NOTES_AUD.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field13() {
        return PickupNotesAud.PICKUP_NOTES_AUD.CREATED_BY;
    }

    @Override
    public Field<UInteger> field14() {
        return PickupNotesAud.PICKUP_NOTES_AUD.LAST_UPDATED_BY;
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
        return getPlaceHash();
    }

    @Override
    public Byte component5() {
        return getIsForAll();
    }

    @Override
    public UInteger component6() {
        return getRideRequestId();
    }

    @Override
    public BigDecimal component7() {
        return getLatitude();
    }

    @Override
    public BigDecimal component8() {
        return getLongitude();
    }

    @Override
    public String component9() {
        return getNotes();
    }

    @Override
    public Byte component10() {
        return getIsActive();
    }

    @Override
    public Long component11() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component12() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component13() {
        return getCreatedBy();
    }

    @Override
    public UInteger component14() {
        return getLastUpdatedBy();
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
        return getPlaceHash();
    }

    @Override
    public Byte value5() {
        return getIsForAll();
    }

    @Override
    public UInteger value6() {
        return getRideRequestId();
    }

    @Override
    public BigDecimal value7() {
        return getLatitude();
    }

    @Override
    public BigDecimal value8() {
        return getLongitude();
    }

    @Override
    public String value9() {
        return getNotes();
    }

    @Override
    public Byte value10() {
        return getIsActive();
    }

    @Override
    public Long value11() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value12() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value13() {
        return getCreatedBy();
    }

    @Override
    public UInteger value14() {
        return getLastUpdatedBy();
    }

    @Override
    public PickupNotesAudRecord value1(UInteger value) {
        setAudId(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value2(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value3(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value4(String value) {
        setPlaceHash(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value5(Byte value) {
        setIsForAll(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value6(UInteger value) {
        setRideRequestId(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value7(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value8(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value9(String value) {
        setNotes(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value10(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value11(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value12(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value13(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord value14(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public PickupNotesAudRecord values(UInteger value1, UInteger value2, UInteger value3, String value4, Byte value5, UInteger value6, BigDecimal value7, BigDecimal value8, String value9, Byte value10, Long value11, Long value12, UInteger value13, UInteger value14) {
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
     * Create a detached PickupNotesAudRecord
     */
    public PickupNotesAudRecord() {
        super(PickupNotesAud.PICKUP_NOTES_AUD);
    }

    /**
     * Create a detached, initialised PickupNotesAudRecord
     */
    public PickupNotesAudRecord(UInteger audId, UInteger id, UInteger riderId, String placeHash, Byte isForAll, UInteger rideRequestId, BigDecimal latitude, BigDecimal longitude, String notes, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(PickupNotesAud.PICKUP_NOTES_AUD);

        set(0, audId);
        set(1, id);
        set(2, riderId);
        set(3, placeHash);
        set(4, isForAll);
        set(5, rideRequestId);
        set(6, latitude);
        set(7, longitude);
        set(8, notes);
        set(9, isActive);
        set(10, createdTimestamp);
        set(11, lastUpdatedTimestamp);
        set(12, createdBy);
        set(13, lastUpdatedBy);
    }
}