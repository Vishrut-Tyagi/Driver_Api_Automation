/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.InvoicePrefixCounter;

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
public class InvoicePrefixCounterRecord extends UpdatableRecordImpl<InvoicePrefixCounterRecord> implements Record11<UInteger, String, String, String, Long, Integer, Byte, UInteger, Long, UInteger, Long> {

    private static final long serialVersionUID = 241854403;

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.id</code>.
     */
    public InvoicePrefixCounterRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.prefix</code>.
     */
    public InvoicePrefixCounterRecord setPrefix(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.prefix</code>.
     */
    public String getPrefix() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.value</code>.
     */
    public InvoicePrefixCounterRecord setValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.year</code>.
     */
    public InvoicePrefixCounterRecord setYear(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.year</code>.
     */
    public String getYear() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.applicable_timestamp</code>.
     */
    public InvoicePrefixCounterRecord setApplicableTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.applicable_timestamp</code>.
     */
    public Long getApplicableTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.current_count</code>.
     */
    public InvoicePrefixCounterRecord setCurrentCount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.current_count</code>.
     */
    public Integer getCurrentCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.is_active</code>.
     */
    public InvoicePrefixCounterRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.created_by</code>.
     */
    public InvoicePrefixCounterRecord setCreatedBy(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.created_at</code>.
     */
    public InvoicePrefixCounterRecord setCreatedAt(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.last_updated_by</code>.
     */
    public InvoicePrefixCounterRecord setLastUpdatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.invoice_prefix_counter.last_updated_at</code>.
     */
    public InvoicePrefixCounterRecord setLastUpdatedAt(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.invoice_prefix_counter.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(10);
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
    public Row11<UInteger, String, String, String, Long, Integer, Byte, UInteger, Long, UInteger, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<UInteger, String, String, String, Long, Integer, Byte, UInteger, Long, UInteger, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.ID;
    }

    @Override
    public Field<String> field2() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.PREFIX;
    }

    @Override
    public Field<String> field3() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.VALUE;
    }

    @Override
    public Field<String> field4() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.YEAR;
    }

    @Override
    public Field<Long> field5() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.APPLICABLE_TIMESTAMP;
    }

    @Override
    public Field<Integer> field6() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.CURRENT_COUNT;
    }

    @Override
    public Field<Byte> field7() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.IS_ACTIVE;
    }

    @Override
    public Field<UInteger> field8() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.CREATED_BY;
    }

    @Override
    public Field<Long> field9() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.CREATED_AT;
    }

    @Override
    public Field<UInteger> field10() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.LAST_UPDATED_BY;
    }

    @Override
    public Field<Long> field11() {
        return InvoicePrefixCounter.INVOICE_PREFIX_COUNTER.LAST_UPDATED_AT;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPrefix();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public String component4() {
        return getYear();
    }

    @Override
    public Long component5() {
        return getApplicableTimestamp();
    }

    @Override
    public Integer component6() {
        return getCurrentCount();
    }

    @Override
    public Byte component7() {
        return getIsActive();
    }

    @Override
    public UInteger component8() {
        return getCreatedBy();
    }

    @Override
    public Long component9() {
        return getCreatedAt();
    }

    @Override
    public UInteger component10() {
        return getLastUpdatedBy();
    }

    @Override
    public Long component11() {
        return getLastUpdatedAt();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPrefix();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public String value4() {
        return getYear();
    }

    @Override
    public Long value5() {
        return getApplicableTimestamp();
    }

    @Override
    public Integer value6() {
        return getCurrentCount();
    }

    @Override
    public Byte value7() {
        return getIsActive();
    }

    @Override
    public UInteger value8() {
        return getCreatedBy();
    }

    @Override
    public Long value9() {
        return getCreatedAt();
    }

    @Override
    public UInteger value10() {
        return getLastUpdatedBy();
    }

    @Override
    public Long value11() {
        return getLastUpdatedAt();
    }

    @Override
    public InvoicePrefixCounterRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value2(String value) {
        setPrefix(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value4(String value) {
        setYear(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value5(Long value) {
        setApplicableTimestamp(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value6(Integer value) {
        setCurrentCount(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value7(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value8(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value9(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value10(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord value11(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public InvoicePrefixCounterRecord values(UInteger value1, String value2, String value3, String value4, Long value5, Integer value6, Byte value7, UInteger value8, Long value9, UInteger value10, Long value11) {
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
     * Create a detached InvoicePrefixCounterRecord
     */
    public InvoicePrefixCounterRecord() {
        super(InvoicePrefixCounter.INVOICE_PREFIX_COUNTER);
    }

    /**
     * Create a detached, initialised InvoicePrefixCounterRecord
     */
    public InvoicePrefixCounterRecord(UInteger id, String prefix, String value, String year, Long applicableTimestamp, Integer currentCount, Byte isActive, UInteger createdBy, Long createdAt, UInteger lastUpdatedBy, Long lastUpdatedAt) {
        super(InvoicePrefixCounter.INVOICE_PREFIX_COUNTER);

        set(0, id);
        set(1, prefix);
        set(2, value);
        set(3, year);
        set(4, applicableTimestamp);
        set(5, currentCount);
        set(6, isActive);
        set(7, createdBy);
        set(8, createdAt);
        set(9, lastUpdatedBy);
        set(10, lastUpdatedAt);
    }
}
