/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.BusinessWalletTransactions;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessWalletTransactionsRecord extends UpdatableRecordImpl<BusinessWalletTransactionsRecord> implements Record21<UInteger, UInteger, UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = 2046584612;

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.id</code>.
     */
    public BusinessWalletTransactionsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.business_account_id</code>.
     */
    public BusinessWalletTransactionsRecord setBusinessAccountId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.business_account_id</code>.
     */
    public UInteger getBusinessAccountId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.ride_request_id</code>.
     */
    public BusinessWalletTransactionsRecord setRideRequestId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.user_id</code>.
     */
    public BusinessWalletTransactionsRecord setUserId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.rider_id</code>.
     */
    public BusinessWalletTransactionsRecord setRiderId(UInteger value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.amount</code>.
     */
    public BusinessWalletTransactionsRecord setAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.type</code>.
     */
    public BusinessWalletTransactionsRecord setType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.type</code>.
     */
    public String getType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.from</code>.
     */
    public BusinessWalletTransactionsRecord setFrom(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.from</code>.
     */
    public String getFrom() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.transaction_time</code>.
     */
    public BusinessWalletTransactionsRecord setTransactionTime(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.transaction_time</code>.
     */
    public Long getTransactionTime() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.payment_mode</code>.
     */
    public BusinessWalletTransactionsRecord setPaymentMode(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.payment_mode</code>.
     */
    public String getPaymentMode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.payment_status</code>.
     */
    public BusinessWalletTransactionsRecord setPaymentStatus(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.payment_status</code>.
     */
    public String getPaymentStatus() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.order_id</code>.
     */
    public BusinessWalletTransactionsRecord setOrderId(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.order_id</code>.
     */
    public UInteger getOrderId() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.closing balance</code>.
     */
    public BusinessWalletTransactionsRecord setClosingBalance(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.closing balance</code>.
     */
    public BigDecimal getClosingBalance() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.message</code>.
     */
    public BusinessWalletTransactionsRecord setMessage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.message</code>.
     */
    public String getMessage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.subtitle</code>.
     */
    public BusinessWalletTransactionsRecord setSubtitle(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.subtitle</code>.
     */
    public String getSubtitle() {
        return (String) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.note</code>.
     */
    public BusinessWalletTransactionsRecord setNote(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.note</code>.
     */
    public String getNote() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.is_active</code>.
     */
    public BusinessWalletTransactionsRecord setIsActive(Byte value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.created_timestamp</code>.
     */
    public BusinessWalletTransactionsRecord setCreatedTimestamp(Long value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.last_updated_timestamp</code>.
     */
    public BusinessWalletTransactionsRecord setLastUpdatedTimestamp(Long value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.created_by</code>.
     */
    public BusinessWalletTransactionsRecord setCreatedBy(UInteger value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.business_wallet_transactions.last_updated_by</code>.
     */
    public BusinessWalletTransactionsRecord setLastUpdatedBy(UInteger value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.business_wallet_transactions.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<UInteger, UInteger, UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<UInteger, UInteger, UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.BUSINESS_ACCOUNT_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.RIDE_REQUEST_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.USER_ID;
    }

    @Override
    public Field<UInteger> field5() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.RIDER_ID;
    }

    @Override
    public Field<BigDecimal> field6() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.AMOUNT;
    }

    @Override
    public Field<String> field7() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.TYPE;
    }

    @Override
    public Field<String> field8() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.FROM;
    }

    @Override
    public Field<Long> field9() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.TRANSACTION_TIME;
    }

    @Override
    public Field<String> field10() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.PAYMENT_MODE;
    }

    @Override
    public Field<String> field11() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.PAYMENT_STATUS;
    }

    @Override
    public Field<UInteger> field12() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.ORDER_ID;
    }

    @Override
    public Field<BigDecimal> field13() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.CLOSING_BALANCE;
    }

    @Override
    public Field<String> field14() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.MESSAGE;
    }

    @Override
    public Field<String> field15() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.SUBTITLE;
    }

    @Override
    public Field<String> field16() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.NOTE;
    }

    @Override
    public Field<Byte> field17() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field18() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field19() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field20() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field21() {
        return BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS.LAST_UPDATED_BY;
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
    public UInteger component3() {
        return getRideRequestId();
    }

    @Override
    public UInteger component4() {
        return getUserId();
    }

    @Override
    public UInteger component5() {
        return getRiderId();
    }

    @Override
    public BigDecimal component6() {
        return getAmount();
    }

    @Override
    public String component7() {
        return getType();
    }

    @Override
    public String component8() {
        return getFrom();
    }

    @Override
    public Long component9() {
        return getTransactionTime();
    }

    @Override
    public String component10() {
        return getPaymentMode();
    }

    @Override
    public String component11() {
        return getPaymentStatus();
    }

    @Override
    public UInteger component12() {
        return getOrderId();
    }

    @Override
    public BigDecimal component13() {
        return getClosingBalance();
    }

    @Override
    public String component14() {
        return getMessage();
    }

    @Override
    public String component15() {
        return getSubtitle();
    }

    @Override
    public String component16() {
        return getNote();
    }

    @Override
    public Byte component17() {
        return getIsActive();
    }

    @Override
    public Long component18() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component19() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component20() {
        return getCreatedBy();
    }

    @Override
    public UInteger component21() {
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
    public UInteger value3() {
        return getRideRequestId();
    }

    @Override
    public UInteger value4() {
        return getUserId();
    }

    @Override
    public UInteger value5() {
        return getRiderId();
    }

    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    @Override
    public String value7() {
        return getType();
    }

    @Override
    public String value8() {
        return getFrom();
    }

    @Override
    public Long value9() {
        return getTransactionTime();
    }

    @Override
    public String value10() {
        return getPaymentMode();
    }

    @Override
    public String value11() {
        return getPaymentStatus();
    }

    @Override
    public UInteger value12() {
        return getOrderId();
    }

    @Override
    public BigDecimal value13() {
        return getClosingBalance();
    }

    @Override
    public String value14() {
        return getMessage();
    }

    @Override
    public String value15() {
        return getSubtitle();
    }

    @Override
    public String value16() {
        return getNote();
    }

    @Override
    public Byte value17() {
        return getIsActive();
    }

    @Override
    public Long value18() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value19() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value20() {
        return getCreatedBy();
    }

    @Override
    public UInteger value21() {
        return getLastUpdatedBy();
    }

    @Override
    public BusinessWalletTransactionsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value2(UInteger value) {
        setBusinessAccountId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value3(UInteger value) {
        setRideRequestId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value4(UInteger value) {
        setUserId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value5(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value7(String value) {
        setType(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value8(String value) {
        setFrom(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value9(Long value) {
        setTransactionTime(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value10(String value) {
        setPaymentMode(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value11(String value) {
        setPaymentStatus(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value12(UInteger value) {
        setOrderId(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value13(BigDecimal value) {
        setClosingBalance(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value14(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value15(String value) {
        setSubtitle(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value16(String value) {
        setNote(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value17(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value18(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value19(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value20(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord value21(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public BusinessWalletTransactionsRecord values(UInteger value1, UInteger value2, UInteger value3, UInteger value4, UInteger value5, BigDecimal value6, String value7, String value8, Long value9, String value10, String value11, UInteger value12, BigDecimal value13, String value14, String value15, String value16, Byte value17, Long value18, Long value19, UInteger value20, UInteger value21) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusinessWalletTransactionsRecord
     */
    public BusinessWalletTransactionsRecord() {
        super(BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS);
    }

    /**
     * Create a detached, initialised BusinessWalletTransactionsRecord
     */
    public BusinessWalletTransactionsRecord(UInteger id, UInteger businessAccountId, UInteger rideRequestId, UInteger userId, UInteger riderId, BigDecimal amount, String type, String from, Long transactionTime, String paymentMode, String paymentStatus, UInteger orderId, BigDecimal closingBalance, String message, String subtitle, String note, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(BusinessWalletTransactions.BUSINESS_WALLET_TRANSACTIONS);

        set(0, id);
        set(1, businessAccountId);
        set(2, rideRequestId);
        set(3, userId);
        set(4, riderId);
        set(5, amount);
        set(6, type);
        set(7, from);
        set(8, transactionTime);
        set(9, paymentMode);
        set(10, paymentStatus);
        set(11, orderId);
        set(12, closingBalance);
        set(13, message);
        set(14, subtitle);
        set(15, note);
        set(16, isActive);
        set(17, createdTimestamp);
        set(18, lastUpdatedTimestamp);
        set(19, createdBy);
        set(20, lastUpdatedBy);
    }
}
