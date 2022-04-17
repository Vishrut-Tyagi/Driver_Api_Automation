/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.ServiceRegion;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServiceRegionRecord extends UpdatableRecordImpl<ServiceRegionRecord> implements Record9<Integer, String, UInteger, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = -1917072542;

    /**
     * Setter for <code>blusmartDevDb.service_region.id</code>.
     */
    public ServiceRegionRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.service_region_name</code>.
     */
    public ServiceRegionRecord setServiceRegionName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.service_region_name</code>.
     */
    public String getServiceRegionName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.bound_id</code>.
     */
    public ServiceRegionRecord setBoundId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.bound_id</code>.
     */
    public UInteger getBoundId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.is_active</code>.
     */
    public ServiceRegionRecord setIsActive(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.created_timestamp</code>.
     */
    public ServiceRegionRecord setCreatedTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.last_updated_timestamp</code>.
     */
    public ServiceRegionRecord setLastUpdatedTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.created_by</code>.
     */
    public ServiceRegionRecord setCreatedBy(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.last_updated_by</code>.
     */
    public ServiceRegionRecord setLastUpdatedBy(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.service_region.other_flags</code>.
     */
    public ServiceRegionRecord setOtherFlags(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.service_region.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, UInteger, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, UInteger, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ServiceRegion.SERVICE_REGION.ID;
    }

    @Override
    public Field<String> field2() {
        return ServiceRegion.SERVICE_REGION.SERVICE_REGION_NAME;
    }

    @Override
    public Field<UInteger> field3() {
        return ServiceRegion.SERVICE_REGION.BOUND_ID;
    }

    @Override
    public Field<Byte> field4() {
        return ServiceRegion.SERVICE_REGION.IS_ACTIVE;
    }

    @Override
    public Field<Long> field5() {
        return ServiceRegion.SERVICE_REGION.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field6() {
        return ServiceRegion.SERVICE_REGION.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field7() {
        return ServiceRegion.SERVICE_REGION.CREATED_BY;
    }

    @Override
    public Field<UInteger> field8() {
        return ServiceRegion.SERVICE_REGION.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field9() {
        return ServiceRegion.SERVICE_REGION.OTHER_FLAGS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getServiceRegionName();
    }

    @Override
    public UInteger component3() {
        return getBoundId();
    }

    @Override
    public Byte component4() {
        return getIsActive();
    }

    @Override
    public Long component5() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component6() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component7() {
        return getCreatedBy();
    }

    @Override
    public UInteger component8() {
        return getLastUpdatedBy();
    }

    @Override
    public String component9() {
        return getOtherFlags();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getServiceRegionName();
    }

    @Override
    public UInteger value3() {
        return getBoundId();
    }

    @Override
    public Byte value4() {
        return getIsActive();
    }

    @Override
    public Long value5() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value6() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value7() {
        return getCreatedBy();
    }

    @Override
    public UInteger value8() {
        return getLastUpdatedBy();
    }

    @Override
    public String value9() {
        return getOtherFlags();
    }

    @Override
    public ServiceRegionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value2(String value) {
        setServiceRegionName(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value3(UInteger value) {
        setBoundId(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value4(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value5(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value6(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value7(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value8(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public ServiceRegionRecord value9(String value) {
        setOtherFlags(value);
        return this;
    }

    @Override
    public ServiceRegionRecord values(Integer value1, String value2, UInteger value3, Byte value4, Long value5, Long value6, UInteger value7, UInteger value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceRegionRecord
     */
    public ServiceRegionRecord() {
        super(ServiceRegion.SERVICE_REGION);
    }

    /**
     * Create a detached, initialised ServiceRegionRecord
     */
    public ServiceRegionRecord(Integer id, String serviceRegionName, UInteger boundId, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String otherFlags) {
        super(ServiceRegion.SERVICE_REGION);

        set(0, id);
        set(1, serviceRegionName);
        set(2, boundId);
        set(3, isActive);
        set(4, createdTimestamp);
        set(5, lastUpdatedTimestamp);
        set(6, createdBy);
        set(7, lastUpdatedBy);
        set(8, otherFlags);
    }
}