/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.DateRangeMapper;

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
public class DateRangeMapperRecord extends UpdatableRecordImpl<DateRangeMapperRecord> implements Record9<Integer, String, Long, Long, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 258903129;

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.id</code>.
     */
    public DateRangeMapperRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.code</code>.
     */
    public DateRangeMapperRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.from_date</code>.
     */
    public DateRangeMapperRecord setFromDate(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.from_date</code>.
     */
    public Long getFromDate() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.to_date</code>.
     */
    public DateRangeMapperRecord setToDate(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.to_date</code>.
     */
    public Long getToDate() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.is_active</code>.
     */
    public DateRangeMapperRecord setIsActive(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.created_timestamp</code>.
     */
    public DateRangeMapperRecord setCreatedTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.last_updated_timestamp</code>.
     */
    public DateRangeMapperRecord setLastUpdatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.created_by</code>.
     */
    public DateRangeMapperRecord setCreatedBy(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.date_range_mapper.last_updated_by</code>.
     */
    public DateRangeMapperRecord setLastUpdatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.date_range_mapper.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(8);
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
    public Row9<Integer, String, Long, Long, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, Long, Long, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DateRangeMapper.DATE_RANGE_MAPPER.ID;
    }

    @Override
    public Field<String> field2() {
        return DateRangeMapper.DATE_RANGE_MAPPER.CODE;
    }

    @Override
    public Field<Long> field3() {
        return DateRangeMapper.DATE_RANGE_MAPPER.FROM_DATE;
    }

    @Override
    public Field<Long> field4() {
        return DateRangeMapper.DATE_RANGE_MAPPER.TO_DATE;
    }

    @Override
    public Field<Byte> field5() {
        return DateRangeMapper.DATE_RANGE_MAPPER.IS_ACTIVE;
    }

    @Override
    public Field<Long> field6() {
        return DateRangeMapper.DATE_RANGE_MAPPER.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field7() {
        return DateRangeMapper.DATE_RANGE_MAPPER.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field8() {
        return DateRangeMapper.DATE_RANGE_MAPPER.CREATED_BY;
    }

    @Override
    public Field<UInteger> field9() {
        return DateRangeMapper.DATE_RANGE_MAPPER.LAST_UPDATED_BY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public Long component3() {
        return getFromDate();
    }

    @Override
    public Long component4() {
        return getToDate();
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
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public Long value3() {
        return getFromDate();
    }

    @Override
    public Long value4() {
        return getToDate();
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
    public DateRangeMapperRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value3(Long value) {
        setFromDate(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value4(Long value) {
        setToDate(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value5(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value6(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value7(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value8(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord value9(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public DateRangeMapperRecord values(Integer value1, String value2, Long value3, Long value4, Byte value5, Long value6, Long value7, UInteger value8, UInteger value9) {
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
     * Create a detached DateRangeMapperRecord
     */
    public DateRangeMapperRecord() {
        super(DateRangeMapper.DATE_RANGE_MAPPER);
    }

    /**
     * Create a detached, initialised DateRangeMapperRecord
     */
    public DateRangeMapperRecord(Integer id, String code, Long fromDate, Long toDate, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(DateRangeMapper.DATE_RANGE_MAPPER);

        set(0, id);
        set(1, code);
        set(2, fromDate);
        set(3, toDate);
        set(4, isActive);
        set(5, createdTimestamp);
        set(6, lastUpdatedTimestamp);
        set(7, createdBy);
        set(8, lastUpdatedBy);
    }
}