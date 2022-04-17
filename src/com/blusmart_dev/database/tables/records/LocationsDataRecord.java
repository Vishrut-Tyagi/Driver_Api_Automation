/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.LocationsData;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LocationsDataRecord extends UpdatableRecordImpl<LocationsDataRecord> implements Record12<Integer, String, String, String, BigDecimal, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 63936550;

    /**
     * Setter for <code>blusmartDevDb.locations_data.id</code>.
     */
    public LocationsDataRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.name</code>.
     */
    public LocationsDataRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.type</code>.
     */
    public LocationsDataRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.location_data</code>.
     */
    public LocationsDataRecord setLocationData(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.location_data</code>.
     */
    public String getLocationData() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.latitude</code>.
     */
    public LocationsDataRecord setLatitude(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.longitude</code>.
     */
    public LocationsDataRecord setLongitude(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.toll_price</code>.
     */
    public LocationsDataRecord setTollPrice(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.toll_price</code>.
     */
    public BigDecimal getTollPrice() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.is_active</code>.
     */
    public LocationsDataRecord setIsActive(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.created_timestamp</code>.
     */
    public LocationsDataRecord setCreatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.last_updated_timestamp</code>.
     */
    public LocationsDataRecord setLastUpdatedTimestamp(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.created_by</code>.
     */
    public LocationsDataRecord setCreatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.locations_data.last_updated_by</code>.
     */
    public LocationsDataRecord setLastUpdatedBy(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.locations_data.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, BigDecimal, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, BigDecimal, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return LocationsData.LOCATIONS_DATA.ID;
    }

    @Override
    public Field<String> field2() {
        return LocationsData.LOCATIONS_DATA.NAME;
    }

    @Override
    public Field<String> field3() {
        return LocationsData.LOCATIONS_DATA.TYPE;
    }

    @Override
    public Field<String> field4() {
        return LocationsData.LOCATIONS_DATA.LOCATION_DATA;
    }

    @Override
    public Field<BigDecimal> field5() {
        return LocationsData.LOCATIONS_DATA.LATITUDE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return LocationsData.LOCATIONS_DATA.LONGITUDE;
    }

    @Override
    public Field<BigDecimal> field7() {
        return LocationsData.LOCATIONS_DATA.TOLL_PRICE;
    }

    @Override
    public Field<Byte> field8() {
        return LocationsData.LOCATIONS_DATA.IS_ACTIVE;
    }

    @Override
    public Field<Long> field9() {
        return LocationsData.LOCATIONS_DATA.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field10() {
        return LocationsData.LOCATIONS_DATA.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field11() {
        return LocationsData.LOCATIONS_DATA.CREATED_BY;
    }

    @Override
    public Field<UInteger> field12() {
        return LocationsData.LOCATIONS_DATA.LAST_UPDATED_BY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getLocationData();
    }

    @Override
    public BigDecimal component5() {
        return getLatitude();
    }

    @Override
    public BigDecimal component6() {
        return getLongitude();
    }

    @Override
    public BigDecimal component7() {
        return getTollPrice();
    }

    @Override
    public Byte component8() {
        return getIsActive();
    }

    @Override
    public Long component9() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component10() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component11() {
        return getCreatedBy();
    }

    @Override
    public UInteger component12() {
        return getLastUpdatedBy();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getLocationData();
    }

    @Override
    public BigDecimal value5() {
        return getLatitude();
    }

    @Override
    public BigDecimal value6() {
        return getLongitude();
    }

    @Override
    public BigDecimal value7() {
        return getTollPrice();
    }

    @Override
    public Byte value8() {
        return getIsActive();
    }

    @Override
    public Long value9() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value10() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value11() {
        return getCreatedBy();
    }

    @Override
    public UInteger value12() {
        return getLastUpdatedBy();
    }

    @Override
    public LocationsDataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public LocationsDataRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LocationsDataRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public LocationsDataRecord value4(String value) {
        setLocationData(value);
        return this;
    }

    @Override
    public LocationsDataRecord value5(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    @Override
    public LocationsDataRecord value6(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    @Override
    public LocationsDataRecord value7(BigDecimal value) {
        setTollPrice(value);
        return this;
    }

    @Override
    public LocationsDataRecord value8(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public LocationsDataRecord value9(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public LocationsDataRecord value10(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public LocationsDataRecord value11(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public LocationsDataRecord value12(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public LocationsDataRecord values(Integer value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, BigDecimal value7, Byte value8, Long value9, Long value10, UInteger value11, UInteger value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationsDataRecord
     */
    public LocationsDataRecord() {
        super(LocationsData.LOCATIONS_DATA);
    }

    /**
     * Create a detached, initialised LocationsDataRecord
     */
    public LocationsDataRecord(Integer id, String name, String type, String locationData, BigDecimal latitude, BigDecimal longitude, BigDecimal tollPrice, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(LocationsData.LOCATIONS_DATA);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, locationData);
        set(4, latitude);
        set(5, longitude);
        set(6, tollPrice);
        set(7, isActive);
        set(8, createdTimestamp);
        set(9, lastUpdatedTimestamp);
        set(10, createdBy);
        set(11, lastUpdatedBy);
    }
}
