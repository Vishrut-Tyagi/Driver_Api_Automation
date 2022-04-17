/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Packages;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PackagesRecord extends UpdatableRecordImpl<PackagesRecord> implements Record15<UInteger, String, Integer, Integer, Integer, Long, Long, Integer, Integer, Byte, String, String, String, Long, Integer> {

    private static final long serialVersionUID = -1538096503;

    /**
     * Setter for <code>blusmartDevDb.packages.id</code>.
     */
    public PackagesRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.package_code</code>.
     */
    public PackagesRecord setPackageCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.package_code</code>.
     */
    public String getPackageCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.base_distance</code>.
     */
    public PackagesRecord setBaseDistance(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.base_distance</code>.
     */
    public Integer getBaseDistance() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.base_time</code>.
     */
    public PackagesRecord setBaseTime(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.base_time</code>.
     */
    public Integer getBaseTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.base_price</code>.
     */
    public PackagesRecord setBasePrice(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.base_price</code>.
     */
    public Integer getBasePrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.created_at</code>.
     */
    public PackagesRecord setCreatedAt(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.upadted_at</code>.
     */
    public PackagesRecord setUpadtedAt(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.upadted_at</code>.
     */
    public Long getUpadtedAt() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.created_by</code>.
     */
    public PackagesRecord setCreatedBy(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.upadted_by</code>.
     */
    public PackagesRecord setUpadtedBy(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.upadted_by</code>.
     */
    public Integer getUpadtedBy() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.is_active</code>.
     */
    public PackagesRecord setIsActive(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.notes</code>.
     */
    public PackagesRecord setNotes(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.notes</code>.
     */
    public String getNotes() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.source</code>.
     */
    public PackagesRecord setSource(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.source</code>.
     */
    public String getSource() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.state</code>.
     */
    public PackagesRecord setState(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.state</code>.
     */
    public String getState() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.updated_at</code>.
     */
    public PackagesRecord setUpdatedAt(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.updated_at</code>.
     */
    public Long getUpdatedAt() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.packages.updated_by</code>.
     */
    public PackagesRecord setUpdatedBy(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.packages.updated_by</code>.
     */
    public Integer getUpdatedBy() {
        return (Integer) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, String, Integer, Integer, Integer, Long, Long, Integer, Integer, Byte, String, String, String, Long, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<UInteger, String, Integer, Integer, Integer, Long, Long, Integer, Integer, Byte, String, String, String, Long, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Packages.PACKAGES.ID;
    }

    @Override
    public Field<String> field2() {
        return Packages.PACKAGES.PACKAGE_CODE;
    }

    @Override
    public Field<Integer> field3() {
        return Packages.PACKAGES.BASE_DISTANCE;
    }

    @Override
    public Field<Integer> field4() {
        return Packages.PACKAGES.BASE_TIME;
    }

    @Override
    public Field<Integer> field5() {
        return Packages.PACKAGES.BASE_PRICE;
    }

    @Override
    public Field<Long> field6() {
        return Packages.PACKAGES.CREATED_AT;
    }

    @Override
    public Field<Long> field7() {
        return Packages.PACKAGES.UPADTED_AT;
    }

    @Override
    public Field<Integer> field8() {
        return Packages.PACKAGES.CREATED_BY;
    }

    @Override
    public Field<Integer> field9() {
        return Packages.PACKAGES.UPADTED_BY;
    }

    @Override
    public Field<Byte> field10() {
        return Packages.PACKAGES.IS_ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return Packages.PACKAGES.NOTES;
    }

    @Override
    public Field<String> field12() {
        return Packages.PACKAGES.SOURCE;
    }

    @Override
    public Field<String> field13() {
        return Packages.PACKAGES.STATE;
    }

    @Override
    public Field<Long> field14() {
        return Packages.PACKAGES.UPDATED_AT;
    }

    @Override
    public Field<Integer> field15() {
        return Packages.PACKAGES.UPDATED_BY;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPackageCode();
    }

    @Override
    public Integer component3() {
        return getBaseDistance();
    }

    @Override
    public Integer component4() {
        return getBaseTime();
    }

    @Override
    public Integer component5() {
        return getBasePrice();
    }

    @Override
    public Long component6() {
        return getCreatedAt();
    }

    @Override
    public Long component7() {
        return getUpadtedAt();
    }

    @Override
    public Integer component8() {
        return getCreatedBy();
    }

    @Override
    public Integer component9() {
        return getUpadtedBy();
    }

    @Override
    public Byte component10() {
        return getIsActive();
    }

    @Override
    public String component11() {
        return getNotes();
    }

    @Override
    public String component12() {
        return getSource();
    }

    @Override
    public String component13() {
        return getState();
    }

    @Override
    public Long component14() {
        return getUpdatedAt();
    }

    @Override
    public Integer component15() {
        return getUpdatedBy();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPackageCode();
    }

    @Override
    public Integer value3() {
        return getBaseDistance();
    }

    @Override
    public Integer value4() {
        return getBaseTime();
    }

    @Override
    public Integer value5() {
        return getBasePrice();
    }

    @Override
    public Long value6() {
        return getCreatedAt();
    }

    @Override
    public Long value7() {
        return getUpadtedAt();
    }

    @Override
    public Integer value8() {
        return getCreatedBy();
    }

    @Override
    public Integer value9() {
        return getUpadtedBy();
    }

    @Override
    public Byte value10() {
        return getIsActive();
    }

    @Override
    public String value11() {
        return getNotes();
    }

    @Override
    public String value12() {
        return getSource();
    }

    @Override
    public String value13() {
        return getState();
    }

    @Override
    public Long value14() {
        return getUpdatedAt();
    }

    @Override
    public Integer value15() {
        return getUpdatedBy();
    }

    @Override
    public PackagesRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public PackagesRecord value2(String value) {
        setPackageCode(value);
        return this;
    }

    @Override
    public PackagesRecord value3(Integer value) {
        setBaseDistance(value);
        return this;
    }

    @Override
    public PackagesRecord value4(Integer value) {
        setBaseTime(value);
        return this;
    }

    @Override
    public PackagesRecord value5(Integer value) {
        setBasePrice(value);
        return this;
    }

    @Override
    public PackagesRecord value6(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public PackagesRecord value7(Long value) {
        setUpadtedAt(value);
        return this;
    }

    @Override
    public PackagesRecord value8(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public PackagesRecord value9(Integer value) {
        setUpadtedBy(value);
        return this;
    }

    @Override
    public PackagesRecord value10(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public PackagesRecord value11(String value) {
        setNotes(value);
        return this;
    }

    @Override
    public PackagesRecord value12(String value) {
        setSource(value);
        return this;
    }

    @Override
    public PackagesRecord value13(String value) {
        setState(value);
        return this;
    }

    @Override
    public PackagesRecord value14(Long value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public PackagesRecord value15(Integer value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public PackagesRecord values(UInteger value1, String value2, Integer value3, Integer value4, Integer value5, Long value6, Long value7, Integer value8, Integer value9, Byte value10, String value11, String value12, String value13, Long value14, Integer value15) {
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
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PackagesRecord
     */
    public PackagesRecord() {
        super(Packages.PACKAGES);
    }

    /**
     * Create a detached, initialised PackagesRecord
     */
    public PackagesRecord(UInteger id, String packageCode, Integer baseDistance, Integer baseTime, Integer basePrice, Long createdAt, Long upadtedAt, Integer createdBy, Integer upadtedBy, Byte isActive, String notes, String source, String state, Long updatedAt, Integer updatedBy) {
        super(Packages.PACKAGES);

        set(0, id);
        set(1, packageCode);
        set(2, baseDistance);
        set(3, baseTime);
        set(4, basePrice);
        set(5, createdAt);
        set(6, upadtedAt);
        set(7, createdBy);
        set(8, upadtedBy);
        set(9, isActive);
        set(10, notes);
        set(11, source);
        set(12, state);
        set(13, updatedAt);
        set(14, updatedBy);
    }
}
