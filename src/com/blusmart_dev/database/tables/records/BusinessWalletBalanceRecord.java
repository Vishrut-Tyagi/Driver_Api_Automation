/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.BusinessWalletBalance;

import java.math.BigDecimal;

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
public class BusinessWalletBalanceRecord extends UpdatableRecordImpl<BusinessWalletBalanceRecord> implements Record9<UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 2102089106;

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.id</code>.
     */
    public BusinessWalletBalanceRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.business_account_id</code>.
     */
    public BusinessWalletBalanceRecord setBusinessAccountId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.business_account_id</code>.
     */
    public UInteger getBusinessAccountId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.current_balance</code>.
     */
    public BusinessWalletBalanceRecord setCurrentBalance(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.current_balance</code>.
     */
    public BigDecimal getCurrentBalance() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.note</code>.
     */
    public BusinessWalletBalanceRecord setNote(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.note</code>.
     */
    public String getNote() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.is_active</code>.
     */
    public BusinessWalletBalanceRecord setIsActive(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.created_timestamp</code>.
     */
    public BusinessWalletBalanceRecord setCreatedTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.last_updated_timestamp</code>.
     */
    public BusinessWalletBalanceRecord setLastUpdatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.created_by</code>.
     */
    public BusinessWalletBalanceRecord setCreatedBy(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance.last_updated_by</code>.
     */
    public BusinessWalletBalanceRecord setLastUpdatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.BUSINESS_ACCOUNT_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.CURRENT_BALANCE;
    }

    @Override
    public Field<String> field4() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.NOTE;
    }

    @Override
    public Field<Byte> field5() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.IS_ACTIVE;
    }

    @Override
    public Field<Long> field6() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field7() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field8() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.CREATED_BY;
    }

    @Override
    public Field<UInteger> field9() {
        return BusinessWalletBalance.BUSINESS_WALLET_BALANCE.LAST_UPDATED_BY;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getBusinessAccountId();
    }

    @Override
    public BigDecimal component3() {
        return getCurrentBalance();
    }

    @Override
    public String component4() {
        return getNote();
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
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getBusinessAccountId();
    }

    @Override
    public BigDecimal value3() {
        return getCurrentBalance();
    }

    @Override
    public String value4() {
        return getNote();
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
    public BusinessWalletBalanceRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value2(UInteger value) {
        setBusinessAccountId(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value3(BigDecimal value) {
        setCurrentBalance(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value4(String value) {
        setNote(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value5(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value6(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value7(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value8(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord value9(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceRecord values(UInteger value1, UInteger value2, BigDecimal value3, String value4, Byte value5, Long value6, Long value7, UInteger value8, UInteger value9) {
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
     * Create a detached BusinessWalletBalanceRecord
     */
    public BusinessWalletBalanceRecord() {
        super(BusinessWalletBalance.BUSINESS_WALLET_BALANCE);
    }

    /**
     * Create a detached, initialised BusinessWalletBalanceRecord
     */
    public BusinessWalletBalanceRecord(UInteger id, UInteger businessAccountId, BigDecimal currentBalance, String note, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(BusinessWalletBalance.BUSINESS_WALLET_BALANCE);

        set(0, id);
        set(1, businessAccountId);
        set(2, currentBalance);
        set(3, note);
        set(4, isActive);
        set(5, createdTimestamp);
        set(6, lastUpdatedTimestamp);
        set(7, createdBy);
        set(8, lastUpdatedBy);
    }
}