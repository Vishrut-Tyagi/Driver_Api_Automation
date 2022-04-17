/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.WheelsScannedDetail;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WheelsScannedDetailRecord extends UpdatableRecordImpl<WheelsScannedDetailRecord> implements Record13<UInteger, Integer, String, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = -1761439438;

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.id</code>.
     */
    public WheelsScannedDetailRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.scanning_id</code>.
     */
    public WheelsScannedDetailRecord setScanningId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.scanning_id</code>.
     */
    public Integer getScanningId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.vehicle_number</code>.
     */
    public WheelsScannedDetailRecord setVehicleNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.vehicle_number</code>.
     */
    public String getVehicleNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.tyre_side</code>.
     */
    public WheelsScannedDetailRecord setTyreSide(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.tyre_side</code>.
     */
    public String getTyreSide() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.scanning_status</code>.
     */
    public WheelsScannedDetailRecord setScanningStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.scanning_status</code>.
     */
    public String getScanningStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.rssi</code>.
     */
    public WheelsScannedDetailRecord setRssi(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.rssi</code>.
     */
    public String getRssi() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.epc_id</code>.
     */
    public WheelsScannedDetailRecord setEpcId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.epc_id</code>.
     */
    public String getEpcId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.frequency</code>.
     */
    public WheelsScannedDetailRecord setFrequency(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.frequency</code>.
     */
    public String getFrequency() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.is_active</code>.
     */
    public WheelsScannedDetailRecord setIsActive(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.created_timestamp</code>.
     */
    public WheelsScannedDetailRecord setCreatedTimestamp(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.last_updated_timestamp</code>.
     */
    public WheelsScannedDetailRecord setLastUpdatedTimestamp(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.created_by</code>.
     */
    public WheelsScannedDetailRecord setCreatedBy(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.wheels_scanned_detail.last_updated_by</code>.
     */
    public WheelsScannedDetailRecord setLastUpdatedBy(UInteger value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wheels_scanned_detail.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, Integer, String, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<UInteger, Integer, String, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.ID;
    }

    @Override
    public Field<Integer> field2() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.SCANNING_ID;
    }

    @Override
    public Field<String> field3() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.VEHICLE_NUMBER;
    }

    @Override
    public Field<String> field4() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.TYRE_SIDE;
    }

    @Override
    public Field<String> field5() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.SCANNING_STATUS;
    }

    @Override
    public Field<String> field6() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.RSSI;
    }

    @Override
    public Field<String> field7() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.EPC_ID;
    }

    @Override
    public Field<String> field8() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.FREQUENCY;
    }

    @Override
    public Field<Byte> field9() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.IS_ACTIVE;
    }

    @Override
    public Field<Long> field10() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field11() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field12() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.CREATED_BY;
    }

    @Override
    public Field<UInteger> field13() {
        return WheelsScannedDetail.WHEELS_SCANNED_DETAIL.LAST_UPDATED_BY;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getScanningId();
    }

    @Override
    public String component3() {
        return getVehicleNumber();
    }

    @Override
    public String component4() {
        return getTyreSide();
    }

    @Override
    public String component5() {
        return getScanningStatus();
    }

    @Override
    public String component6() {
        return getRssi();
    }

    @Override
    public String component7() {
        return getEpcId();
    }

    @Override
    public String component8() {
        return getFrequency();
    }

    @Override
    public Byte component9() {
        return getIsActive();
    }

    @Override
    public Long component10() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component11() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component12() {
        return getCreatedBy();
    }

    @Override
    public UInteger component13() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getScanningId();
    }

    @Override
    public String value3() {
        return getVehicleNumber();
    }

    @Override
    public String value4() {
        return getTyreSide();
    }

    @Override
    public String value5() {
        return getScanningStatus();
    }

    @Override
    public String value6() {
        return getRssi();
    }

    @Override
    public String value7() {
        return getEpcId();
    }

    @Override
    public String value8() {
        return getFrequency();
    }

    @Override
    public Byte value9() {
        return getIsActive();
    }

    @Override
    public Long value10() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value11() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value12() {
        return getCreatedBy();
    }

    @Override
    public UInteger value13() {
        return getLastUpdatedBy();
    }

    @Override
    public WheelsScannedDetailRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value2(Integer value) {
        setScanningId(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value3(String value) {
        setVehicleNumber(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value4(String value) {
        setTyreSide(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value5(String value) {
        setScanningStatus(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value6(String value) {
        setRssi(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value7(String value) {
        setEpcId(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value8(String value) {
        setFrequency(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value9(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value10(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value11(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value12(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord value13(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public WheelsScannedDetailRecord values(UInteger value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, Byte value9, Long value10, Long value11, UInteger value12, UInteger value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WheelsScannedDetailRecord
     */
    public WheelsScannedDetailRecord() {
        super(WheelsScannedDetail.WHEELS_SCANNED_DETAIL);
    }

    /**
     * Create a detached, initialised WheelsScannedDetailRecord
     */
    public WheelsScannedDetailRecord(UInteger id, Integer scanningId, String vehicleNumber, String tyreSide, String scanningStatus, String rssi, String epcId, String frequency, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(WheelsScannedDetail.WHEELS_SCANNED_DETAIL);

        set(0, id);
        set(1, scanningId);
        set(2, vehicleNumber);
        set(3, tyreSide);
        set(4, scanningStatus);
        set(5, rssi);
        set(6, epcId);
        set(7, frequency);
        set(8, isActive);
        set(9, createdTimestamp);
        set(10, lastUpdatedTimestamp);
        set(11, createdBy);
        set(12, lastUpdatedBy);
    }
}
