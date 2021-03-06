/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RfidTyres;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RfidTyresRecord extends UpdatableRecordImpl<RfidTyresRecord> implements Record11<UInteger, Integer, String, String, String, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 1562703821;

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.id</code>.
     */
    public RfidTyresRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.rfid_id</code>.
     */
    public RfidTyresRecord setRfidId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.rfid_id</code>.
     */
    public Integer getRfidId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.tyre_side</code>.
     */
    public RfidTyresRecord setTyreSide(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.tyre_side</code>.
     */
    public String getTyreSide() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.rssi</code>.
     */
    public RfidTyresRecord setRssi(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.rssi</code>.
     */
    public String getRssi() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.epc_id</code>.
     */
    public RfidTyresRecord setEpcId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.epc_id</code>.
     */
    public String getEpcId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.frequency</code>.
     */
    public RfidTyresRecord setFrequency(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.frequency</code>.
     */
    public String getFrequency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.is_active</code>.
     */
    public RfidTyresRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.created_timestamp</code>.
     */
    public RfidTyresRecord setCreatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.last_updated_timestamp</code>.
     */
    public RfidTyresRecord setLastUpdatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.created_by</code>.
     */
    public RfidTyresRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.rfid_tyres.last_updated_by</code>.
     */
    public RfidTyresRecord setLastUpdatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rfid_tyres.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<UInteger, Integer, String, String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<UInteger, Integer, String, String, String, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RfidTyres.RFID_TYRES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return RfidTyres.RFID_TYRES.RFID_ID;
    }

    @Override
    public Field<String> field3() {
        return RfidTyres.RFID_TYRES.TYRE_SIDE;
    }

    @Override
    public Field<String> field4() {
        return RfidTyres.RFID_TYRES.RSSI;
    }

    @Override
    public Field<String> field5() {
        return RfidTyres.RFID_TYRES.EPC_ID;
    }

    @Override
    public Field<String> field6() {
        return RfidTyres.RFID_TYRES.FREQUENCY;
    }

    @Override
    public Field<Byte> field7() {
        return RfidTyres.RFID_TYRES.IS_ACTIVE;
    }

    @Override
    public Field<Long> field8() {
        return RfidTyres.RFID_TYRES.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field9() {
        return RfidTyres.RFID_TYRES.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field10() {
        return RfidTyres.RFID_TYRES.CREATED_BY;
    }

    @Override
    public Field<UInteger> field11() {
        return RfidTyres.RFID_TYRES.LAST_UPDATED_BY;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getRfidId();
    }

    @Override
    public String component3() {
        return getTyreSide();
    }

    @Override
    public String component4() {
        return getRssi();
    }

    @Override
    public String component5() {
        return getEpcId();
    }

    @Override
    public String component6() {
        return getFrequency();
    }

    @Override
    public Byte component7() {
        return getIsActive();
    }

    @Override
    public Long component8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component10() {
        return getCreatedBy();
    }

    @Override
    public UInteger component11() {
        return getLastUpdatedBy();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getRfidId();
    }

    @Override
    public String value3() {
        return getTyreSide();
    }

    @Override
    public String value4() {
        return getRssi();
    }

    @Override
    public String value5() {
        return getEpcId();
    }

    @Override
    public String value6() {
        return getFrequency();
    }

    @Override
    public Byte value7() {
        return getIsActive();
    }

    @Override
    public Long value8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value10() {
        return getCreatedBy();
    }

    @Override
    public UInteger value11() {
        return getLastUpdatedBy();
    }

    @Override
    public RfidTyresRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RfidTyresRecord value2(Integer value) {
        setRfidId(value);
        return this;
    }

    @Override
    public RfidTyresRecord value3(String value) {
        setTyreSide(value);
        return this;
    }

    @Override
    public RfidTyresRecord value4(String value) {
        setRssi(value);
        return this;
    }

    @Override
    public RfidTyresRecord value5(String value) {
        setEpcId(value);
        return this;
    }

    @Override
    public RfidTyresRecord value6(String value) {
        setFrequency(value);
        return this;
    }

    @Override
    public RfidTyresRecord value7(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RfidTyresRecord value8(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public RfidTyresRecord value9(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public RfidTyresRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RfidTyresRecord value11(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public RfidTyresRecord values(UInteger value1, Integer value2, String value3, String value4, String value5, String value6, Byte value7, Long value8, Long value9, UInteger value10, UInteger value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RfidTyresRecord
     */
    public RfidTyresRecord() {
        super(RfidTyres.RFID_TYRES);
    }

    /**
     * Create a detached, initialised RfidTyresRecord
     */
    public RfidTyresRecord(UInteger id, Integer rfidId, String tyreSide, String rssi, String epcId, String frequency, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(RfidTyres.RFID_TYRES);

        set(0, id);
        set(1, rfidId);
        set(2, tyreSide);
        set(3, rssi);
        set(4, epcId);
        set(5, frequency);
        set(6, isActive);
        set(7, createdTimestamp);
        set(8, lastUpdatedTimestamp);
        set(9, createdBy);
        set(10, lastUpdatedBy);
    }
}
