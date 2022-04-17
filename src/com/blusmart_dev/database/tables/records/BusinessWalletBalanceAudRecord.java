/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.BusinessWalletBalanceAud;

import java.math.BigDecimal;

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
public class BusinessWalletBalanceAudRecord extends UpdatableRecordImpl<BusinessWalletBalanceAudRecord> implements Record11<UInteger, UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = 842835137;

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.aud_id</code>.
     */
    public BusinessWalletBalanceAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.id</code>.
     */
    public BusinessWalletBalanceAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.business_account_id</code>.
     */
    public BusinessWalletBalanceAudRecord setBusinessAccountId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.business_account_id</code>.
     */
    public UInteger getBusinessAccountId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.current_balance</code>.
     */
    public BusinessWalletBalanceAudRecord setCurrentBalance(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.current_balance</code>.
     */
    public BigDecimal getCurrentBalance() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.note</code>.
     */
    public BusinessWalletBalanceAudRecord setNote(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.note</code>.
     */
    public String getNote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.is_active</code>.
     */
    public BusinessWalletBalanceAudRecord setIsActive(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.created_timestamp</code>.
     */
    public BusinessWalletBalanceAudRecord setCreatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.last_updated_timestamp</code>.
     */
    public BusinessWalletBalanceAudRecord setLastUpdatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.created_by</code>.
     */
    public BusinessWalletBalanceAudRecord setCreatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.last_updated_by</code>.
     */
    public BusinessWalletBalanceAudRecord setLastUpdatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_balance_aud.operation</code>.
     */
    public BusinessWalletBalanceAudRecord setOperation(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_balance_aud.operation</code>.
     */
    public String getOperation() {
        return (String) get(10);
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
    public Row11<UInteger, UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<UInteger, UInteger, UInteger, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.AUD_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.ID;
    }

    @Override
    public Field<UInteger> field3() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.BUSINESS_ACCOUNT_ID;
    }

    @Override
    public Field<BigDecimal> field4() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.CURRENT_BALANCE;
    }

    @Override
    public Field<String> field5() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.NOTE;
    }

    @Override
    public Field<Byte> field6() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.IS_ACTIVE;
    }

    @Override
    public Field<Long> field7() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field8() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field9() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.CREATED_BY;
    }

    @Override
    public Field<UInteger> field10() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field11() {
        return BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD.OPERATION;
    }

    @Override
    public UInteger component1() {
        return getAudId();
    }

    @Override
    public UInteger component2() {
        return getId();
    }

    @Override
    public UInteger component3() {
        return getBusinessAccountId();
    }

    @Override
    public BigDecimal component4() {
        return getCurrentBalance();
    }

    @Override
    public String component5() {
        return getNote();
    }

    @Override
    public Byte component6() {
        return getIsActive();
    }

    @Override
    public Long component7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component9() {
        return getCreatedBy();
    }

    @Override
    public UInteger component10() {
        return getLastUpdatedBy();
    }

    @Override
    public String component11() {
        return getOperation();
    }

    @Override
    public UInteger value1() {
        return getAudId();
    }

    @Override
    public UInteger value2() {
        return getId();
    }

    @Override
    public UInteger value3() {
        return getBusinessAccountId();
    }

    @Override
    public BigDecimal value4() {
        return getCurrentBalance();
    }

    @Override
    public String value5() {
        return getNote();
    }

    @Override
    public Byte value6() {
        return getIsActive();
    }

    @Override
    public Long value7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value9() {
        return getCreatedBy();
    }

    @Override
    public UInteger value10() {
        return getLastUpdatedBy();
    }

    @Override
    public String value11() {
        return getOperation();
    }

    @Override
    public BusinessWalletBalanceAudRecord value1(UInteger value) {
        setAudId(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value2(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value3(UInteger value) {
        setBusinessAccountId(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value4(BigDecimal value) {
        setCurrentBalance(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value5(String value) {
        setNote(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value6(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value7(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value8(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value9(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value10(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord value11(String value) {
        setOperation(value);
        return this;
    }

    @Override
    public BusinessWalletBalanceAudRecord values(UInteger value1, UInteger value2, UInteger value3, BigDecimal value4, String value5, Byte value6, Long value7, Long value8, UInteger value9, UInteger value10, String value11) {
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
     * Create a detached BusinessWalletBalanceAudRecord
     */
    public BusinessWalletBalanceAudRecord() {
        super(BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD);
    }

    /**
     * Create a detached, initialised BusinessWalletBalanceAudRecord
     */
    public BusinessWalletBalanceAudRecord(UInteger audId, UInteger id, UInteger businessAccountId, BigDecimal currentBalance, String note, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String operation) {
        super(BusinessWalletBalanceAud.BUSINESS_WALLET_BALANCE_AUD);

        set(0, audId);
        set(1, id);
        set(2, businessAccountId);
        set(3, currentBalance);
        set(4, note);
        set(5, isActive);
        set(6, createdTimestamp);
        set(7, lastUpdatedTimestamp);
        set(8, createdBy);
        set(9, lastUpdatedBy);
        set(10, operation);
    }
}