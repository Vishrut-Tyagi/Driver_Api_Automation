/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.PriceCategoryMapping;

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
public class PriceCategoryMappingRecord extends UpdatableRecordImpl<PriceCategoryMappingRecord> implements Record10<UInteger, String, UInteger, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = 542455818;

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.id</code>.
     */
    public PriceCategoryMappingRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.category_code</code>.
     */
    public PriceCategoryMappingRecord setCategoryCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.category_code</code>.
     */
    public String getCategoryCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.base_price</code>.
     */
    public PriceCategoryMappingRecord setBasePrice(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.base_price</code>.
     */
    public UInteger getBasePrice() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.package_code</code>.
     */
    public PriceCategoryMappingRecord setPackageCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.package_code</code>.
     */
    public String getPackageCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.is_active</code>.
     */
    public PriceCategoryMappingRecord setIsActive(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.created_timestamp</code>.
     */
    public PriceCategoryMappingRecord setCreatedTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.last_updated_timestamp</code>.
     */
    public PriceCategoryMappingRecord setLastUpdatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.created_by</code>.
     */
    public PriceCategoryMappingRecord setCreatedBy(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.last_updated_by</code>.
     */
    public PriceCategoryMappingRecord setLastUpdatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.price_category_mapping.other_flags</code>.
     */
    public PriceCategoryMappingRecord setOtherFlags(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.price_category_mapping.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(9);
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
    public Row10<UInteger, String, UInteger, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<UInteger, String, UInteger, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.ID;
    }

    @Override
    public Field<String> field2() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.CATEGORY_CODE;
    }

    @Override
    public Field<UInteger> field3() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.BASE_PRICE;
    }

    @Override
    public Field<String> field4() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.PACKAGE_CODE;
    }

    @Override
    public Field<Byte> field5() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.IS_ACTIVE;
    }

    @Override
    public Field<Long> field6() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field7() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field8() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.CREATED_BY;
    }

    @Override
    public Field<UInteger> field9() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field10() {
        return PriceCategoryMapping.PRICE_CATEGORY_MAPPING.OTHER_FLAGS;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCategoryCode();
    }

    @Override
    public UInteger component3() {
        return getBasePrice();
    }

    @Override
    public String component4() {
        return getPackageCode();
    }

    @Override
    public Byte component5() {
        return getIsActive();
    }

    @Override
    public Long component6() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component7() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component8() {
        return getCreatedBy();
    }

    @Override
    public UInteger component9() {
        return getLastUpdatedBy();
    }

    @Override
    public String component10() {
        return getOtherFlags();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCategoryCode();
    }

    @Override
    public UInteger value3() {
        return getBasePrice();
    }

    @Override
    public String value4() {
        return getPackageCode();
    }

    @Override
    public Byte value5() {
        return getIsActive();
    }

    @Override
    public Long value6() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value7() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value8() {
        return getCreatedBy();
    }

    @Override
    public UInteger value9() {
        return getLastUpdatedBy();
    }

    @Override
    public String value10() {
        return getOtherFlags();
    }

    @Override
    public PriceCategoryMappingRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value2(String value) {
        setCategoryCode(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value3(UInteger value) {
        setBasePrice(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value4(String value) {
        setPackageCode(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value5(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value6(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value7(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value8(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value9(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord value10(String value) {
        setOtherFlags(value);
        return this;
    }

    @Override
    public PriceCategoryMappingRecord values(UInteger value1, String value2, UInteger value3, String value4, Byte value5, Long value6, Long value7, UInteger value8, UInteger value9, String value10) {
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
     * Create a detached PriceCategoryMappingRecord
     */
    public PriceCategoryMappingRecord() {
        super(PriceCategoryMapping.PRICE_CATEGORY_MAPPING);
    }

    /**
     * Create a detached, initialised PriceCategoryMappingRecord
     */
    public PriceCategoryMappingRecord(UInteger id, String categoryCode, UInteger basePrice, String packageCode, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String otherFlags) {
        super(PriceCategoryMapping.PRICE_CATEGORY_MAPPING);

        set(0, id);
        set(1, categoryCode);
        set(2, basePrice);
        set(3, packageCode);
        set(4, isActive);
        set(5, createdTimestamp);
        set(6, lastUpdatedTimestamp);
        set(7, createdBy);
        set(8, lastUpdatedBy);
        set(9, otherFlags);
    }
}
