/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.DriverDuty;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverDutyRecord extends UpdatableRecordImpl<DriverDutyRecord> implements Record10<UInteger, Integer, Long, Long, Long, Long, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = -1887631973;

    /**
     * Setter for <code>blusmartDevDb.driver_duty.id</code>.
     */
    public DriverDutyRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.driver_id</code>.
     */
    public DriverDutyRecord setDriverId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.driver_id</code>.
     */
    public Integer getDriverId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.online_timestamp</code>.
     */
    public DriverDutyRecord setOnlineTimestamp(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.online_timestamp</code>.
     */
    public Long getOnlineTimestamp() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.offline_timestamp</code>.
     */
    public DriverDutyRecord setOfflineTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.offline_timestamp</code>.
     */
    public Long getOfflineTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.created_at</code>.
     */
    public DriverDutyRecord setCreatedAt(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.last_updated_at</code>.
     */
    public DriverDutyRecord setLastUpdatedAt(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.trip_start_timestamp</code>.
     */
    public DriverDutyRecord setTripStartTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.trip_start_timestamp</code>.
     */
    public Long getTripStartTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.trip_end_timestamp</code>.
     */
    public DriverDutyRecord setTripEndTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.trip_end_timestamp</code>.
     */
    public Long getTripEndTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.created_by</code>.
     */
    public DriverDutyRecord setCreatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_duty.updated_by</code>.
     */
    public DriverDutyRecord setUpdatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_duty.updated_by</code>.
     */
    public UInteger getUpdatedBy() {
        return (UInteger) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<UInteger, Integer, Long, Long, Long, Long, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<UInteger, Integer, Long, Long, Long, Long, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return DriverDuty.DRIVER_DUTY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return DriverDuty.DRIVER_DUTY.DRIVER_ID;
    }

    @Override
    public Field<Long> field3() {
        return DriverDuty.DRIVER_DUTY.ONLINE_TIMESTAMP;
    }

    @Override
    public Field<Long> field4() {
        return DriverDuty.DRIVER_DUTY.OFFLINE_TIMESTAMP;
    }

    @Override
    public Field<Long> field5() {
        return DriverDuty.DRIVER_DUTY.CREATED_AT;
    }

    @Override
    public Field<Long> field6() {
        return DriverDuty.DRIVER_DUTY.LAST_UPDATED_AT;
    }

    @Override
    public Field<Long> field7() {
        return DriverDuty.DRIVER_DUTY.TRIP_START_TIMESTAMP;
    }

    @Override
    public Field<Long> field8() {
        return DriverDuty.DRIVER_DUTY.TRIP_END_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field9() {
        return DriverDuty.DRIVER_DUTY.CREATED_BY;
    }

    @Override
    public Field<UInteger> field10() {
        return DriverDuty.DRIVER_DUTY.UPDATED_BY;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getDriverId();
    }

    @Override
    public Long component3() {
        return getOnlineTimestamp();
    }

    @Override
    public Long component4() {
        return getOfflineTimestamp();
    }

    @Override
    public Long component5() {
        return getCreatedAt();
    }

    @Override
    public Long component6() {
        return getLastUpdatedAt();
    }

    @Override
    public Long component7() {
        return getTripStartTimestamp();
    }

    @Override
    public Long component8() {
        return getTripEndTimestamp();
    }

    @Override
    public UInteger component9() {
        return getCreatedBy();
    }

    @Override
    public UInteger component10() {
        return getUpdatedBy();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getDriverId();
    }

    @Override
    public Long value3() {
        return getOnlineTimestamp();
    }

    @Override
    public Long value4() {
        return getOfflineTimestamp();
    }

    @Override
    public Long value5() {
        return getCreatedAt();
    }

    @Override
    public Long value6() {
        return getLastUpdatedAt();
    }

    @Override
    public Long value7() {
        return getTripStartTimestamp();
    }

    @Override
    public Long value8() {
        return getTripEndTimestamp();
    }

    @Override
    public UInteger value9() {
        return getCreatedBy();
    }

    @Override
    public UInteger value10() {
        return getUpdatedBy();
    }

    @Override
    public DriverDutyRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public DriverDutyRecord value2(Integer value) {
        setDriverId(value);
        return this;
    }

    @Override
    public DriverDutyRecord value3(Long value) {
        setOnlineTimestamp(value);
        return this;
    }

    @Override
    public DriverDutyRecord value4(Long value) {
        setOfflineTimestamp(value);
        return this;
    }

    @Override
    public DriverDutyRecord value5(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DriverDutyRecord value6(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public DriverDutyRecord value7(Long value) {
        setTripStartTimestamp(value);
        return this;
    }

    @Override
    public DriverDutyRecord value8(Long value) {
        setTripEndTimestamp(value);
        return this;
    }

    @Override
    public DriverDutyRecord value9(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DriverDutyRecord value10(UInteger value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public DriverDutyRecord values(UInteger value1, Integer value2, Long value3, Long value4, Long value5, Long value6, Long value7, Long value8, UInteger value9, UInteger value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverDutyRecord
     */
    public DriverDutyRecord() {
        super(DriverDuty.DRIVER_DUTY);
    }

    /**
     * Create a detached, initialised DriverDutyRecord
     */
    public DriverDutyRecord(UInteger id, Integer driverId, Long onlineTimestamp, Long offlineTimestamp, Long createdAt, Long lastUpdatedAt, Long tripStartTimestamp, Long tripEndTimestamp, UInteger createdBy, UInteger updatedBy) {
        super(DriverDuty.DRIVER_DUTY);

        set(0, id);
        set(1, driverId);
        set(2, onlineTimestamp);
        set(3, offlineTimestamp);
        set(4, createdAt);
        set(5, lastUpdatedAt);
        set(6, tripStartTimestamp);
        set(7, tripEndTimestamp);
        set(8, createdBy);
        set(9, updatedBy);
    }
}
