/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Bounds;

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
public class BoundsRecord extends UpdatableRecordImpl<BoundsRecord> implements Record11<Integer, String, String, Long, Long, UInteger, UInteger, String, String, String, String> {

    private static final long serialVersionUID = 76070893;

    /**
     * Setter for <code>blusmartDevDb.bounds.id</code>.
     */
    public BoundsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.location_key</code>.
     */
    public BoundsRecord setLocationKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.location_key</code>.
     */
    public String getLocationKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.bounds_data</code>.
     */
    public BoundsRecord setBoundsData(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.bounds_data</code>.
     */
    public String getBoundsData() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.created_timestamp</code>.
     */
    public BoundsRecord setCreatedTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.last_updated_timestamp</code>.
     */
    public BoundsRecord setLastUpdatedTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.created_by</code>.
     */
    public BoundsRecord setCreatedBy(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.last_updated_by</code>.
     */
    public BoundsRecord setLastUpdatedBy(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.kml_file</code>.
     */
    public BoundsRecord setKmlFile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.kml_file</code>.
     */
    public String getKmlFile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.geometry_type</code>.
     */
    public BoundsRecord setGeometryType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.geometry_type</code>.
     */
    public String getGeometryType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.allowed_location_tags</code>.
     */
    public BoundsRecord setAllowedLocationTags(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.allowed_location_tags</code>.
     */
    public String getAllowedLocationTags() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.bounds.kml_file_path</code>.
     */
    public BoundsRecord setKmlFilePath(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.bounds.kml_file_path</code>.
     */
    public String getKmlFilePath() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, Long, Long, UInteger, UInteger, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, Long, Long, UInteger, UInteger, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Bounds.BOUNDS.ID;
    }

    @Override
    public Field<String> field2() {
        return Bounds.BOUNDS.LOCATION_KEY;
    }

    @Override
    public Field<String> field3() {
        return Bounds.BOUNDS.BOUNDS_DATA;
    }

    @Override
    public Field<Long> field4() {
        return Bounds.BOUNDS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field5() {
        return Bounds.BOUNDS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field6() {
        return Bounds.BOUNDS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field7() {
        return Bounds.BOUNDS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field8() {
        return Bounds.BOUNDS.KML_FILE;
    }

    @Override
    public Field<String> field9() {
        return Bounds.BOUNDS.GEOMETRY_TYPE;
    }

    @Override
    public Field<String> field10() {
        return Bounds.BOUNDS.ALLOWED_LOCATION_TAGS;
    }

    @Override
    public Field<String> field11() {
        return Bounds.BOUNDS.KML_FILE_PATH;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLocationKey();
    }

    @Override
    public String component3() {
        return getBoundsData();
    }

    @Override
    public Long component4() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component5() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component6() {
        return getCreatedBy();
    }

    @Override
    public UInteger component7() {
        return getLastUpdatedBy();
    }

    @Override
    public String component8() {
        return getKmlFile();
    }

    @Override
    public String component9() {
        return getGeometryType();
    }

    @Override
    public String component10() {
        return getAllowedLocationTags();
    }

    @Override
    public String component11() {
        return getKmlFilePath();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLocationKey();
    }

    @Override
    public String value3() {
        return getBoundsData();
    }

    @Override
    public Long value4() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value5() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value6() {
        return getCreatedBy();
    }

    @Override
    public UInteger value7() {
        return getLastUpdatedBy();
    }

    @Override
    public String value8() {
        return getKmlFile();
    }

    @Override
    public String value9() {
        return getGeometryType();
    }

    @Override
    public String value10() {
        return getAllowedLocationTags();
    }

    @Override
    public String value11() {
        return getKmlFilePath();
    }

    @Override
    public BoundsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BoundsRecord value2(String value) {
        setLocationKey(value);
        return this;
    }

    @Override
    public BoundsRecord value3(String value) {
        setBoundsData(value);
        return this;
    }

    @Override
    public BoundsRecord value4(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public BoundsRecord value5(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public BoundsRecord value6(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BoundsRecord value7(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public BoundsRecord value8(String value) {
        setKmlFile(value);
        return this;
    }

    @Override
    public BoundsRecord value9(String value) {
        setGeometryType(value);
        return this;
    }

    @Override
    public BoundsRecord value10(String value) {
        setAllowedLocationTags(value);
        return this;
    }

    @Override
    public BoundsRecord value11(String value) {
        setKmlFilePath(value);
        return this;
    }

    @Override
    public BoundsRecord values(Integer value1, String value2, String value3, Long value4, Long value5, UInteger value6, UInteger value7, String value8, String value9, String value10, String value11) {
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
     * Create a detached BoundsRecord
     */
    public BoundsRecord() {
        super(Bounds.BOUNDS);
    }

    /**
     * Create a detached, initialised BoundsRecord
     */
    public BoundsRecord(Integer id, String locationKey, String boundsData, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String kmlFile, String geometryType, String allowedLocationTags, String kmlFilePath) {
        super(Bounds.BOUNDS);

        set(0, id);
        set(1, locationKey);
        set(2, boundsData);
        set(3, createdTimestamp);
        set(4, lastUpdatedTimestamp);
        set(5, createdBy);
        set(6, lastUpdatedBy);
        set(7, kmlFile);
        set(8, geometryType);
        set(9, allowedLocationTags);
        set(10, kmlFilePath);
    }
}
