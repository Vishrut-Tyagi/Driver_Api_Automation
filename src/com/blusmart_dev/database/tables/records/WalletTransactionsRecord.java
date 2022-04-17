/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.WalletTransactions;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WalletTransactionsRecord extends UpdatableRecordImpl<WalletTransactionsRecord> implements Record19<UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = -1513948727;

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.id</code>.
     */
    public WalletTransactionsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.ride_request_id</code>.
     */
    public WalletTransactionsRecord setRideRequestId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.rider_id</code>.
     */
    public WalletTransactionsRecord setRiderId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.amount</code>.
     */
    public WalletTransactionsRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.type</code>.
     */
    public WalletTransactionsRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.from</code>.
     */
    public WalletTransactionsRecord setFrom(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.from</code>.
     */
    public String getFrom() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.transaction_time</code>.
     */
    public WalletTransactionsRecord setTransactionTime(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.transaction_time</code>.
     */
    public Long getTransactionTime() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.payment_mode</code>.
     */
    public WalletTransactionsRecord setPaymentMode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.payment_mode</code>.
     */
    public String getPaymentMode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.payment_status</code>.
     */
    public WalletTransactionsRecord setPaymentStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.payment_status</code>.
     */
    public String getPaymentStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.order_id</code>.
     */
    public WalletTransactionsRecord setOrderId(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.order_id</code>.
     */
    public UInteger getOrderId() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.closing balance</code>.
     */
    public WalletTransactionsRecord setClosingBalance(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.closing balance</code>.
     */
    public BigDecimal getClosingBalance() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.message</code>.
     */
    public WalletTransactionsRecord setMessage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.message</code>.
     */
    public String getMessage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.subtitle</code>.
     */
    public WalletTransactionsRecord setSubtitle(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.subtitle</code>.
     */
    public String getSubtitle() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.is_active</code>.
     */
    public WalletTransactionsRecord setIsActive(Byte value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.created_timestamp</code>.
     */
    public WalletTransactionsRecord setCreatedTimestamp(Long value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.last_updated_timestamp</code>.
     */
    public WalletTransactionsRecord setLastUpdatedTimestamp(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.created_by</code>.
     */
    public WalletTransactionsRecord setCreatedBy(UInteger value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.last_updated_by</code>.
     */
    public WalletTransactionsRecord setLastUpdatedBy(UInteger value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.wallet_transactions.remark</code>.
     */
    public WalletTransactionsRecord setRemark(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.wallet_transactions.remark</code>.
     */
    public String getRemark() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return WalletTransactions.WALLET_TRANSACTIONS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return WalletTransactions.WALLET_TRANSACTIONS.RIDE_REQUEST_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return WalletTransactions.WALLET_TRANSACTIONS.RIDER_ID;
    }

    @Override
    public Field<BigDecimal> field4() {
        return WalletTransactions.WALLET_TRANSACTIONS.AMOUNT;
    }

    @Override
    public Field<String> field5() {
        return WalletTransactions.WALLET_TRANSACTIONS.TYPE;
    }

    @Override
    public Field<String> field6() {
        return WalletTransactions.WALLET_TRANSACTIONS.FROM;
    }

    @Override
    public Field<Long> field7() {
        return WalletTransactions.WALLET_TRANSACTIONS.TRANSACTION_TIME;
    }

    @Override
    public Field<String> field8() {
        return WalletTransactions.WALLET_TRANSACTIONS.PAYMENT_MODE;
    }

    @Override
    public Field<String> field9() {
        return WalletTransactions.WALLET_TRANSACTIONS.PAYMENT_STATUS;
    }

    @Override
    public Field<UInteger> field10() {
        return WalletTransactions.WALLET_TRANSACTIONS.ORDER_ID;
    }

    @Override
    public Field<BigDecimal> field11() {
        return WalletTransactions.WALLET_TRANSACTIONS.CLOSING_BALANCE;
    }

    @Override
    public Field<String> field12() {
        return WalletTransactions.WALLET_TRANSACTIONS.MESSAGE;
    }

    @Override
    public Field<String> field13() {
        return WalletTransactions.WALLET_TRANSACTIONS.SUBTITLE;
    }

    @Override
    public Field<Byte> field14() {
        return WalletTransactions.WALLET_TRANSACTIONS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field15() {
        return WalletTransactions.WALLET_TRANSACTIONS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field16() {
        return WalletTransactions.WALLET_TRANSACTIONS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field17() {
        return WalletTransactions.WALLET_TRANSACTIONS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field18() {
        return WalletTransactions.WALLET_TRANSACTIONS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field19() {
        return WalletTransactions.WALLET_TRANSACTIONS.REMARK;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getRideRequestId();
    }

    @Override
    public UInteger component3() {
        return getRiderId();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public String component6() {
        return getFrom();
    }

    @Override
    public Long component7() {
        return getTransactionTime();
    }

    @Override
    public String component8() {
        return getPaymentMode();
    }

    @Override
    public String component9() {
        return getPaymentStatus();
    }

    @Override
    public UInteger component10() {
        return getOrderId();
    }

    @Override
    public BigDecimal component11() {
        return getClosingBalance();
    }

    @Override
    public String component12() {
        return getMessage();
    }

    @Override
    public String component13() {
        return getSubtitle();
    }

    @Override
    public Byte component14() {
        return getIsActive();
    }

    @Override
    public Long component15() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component16() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component17() {
        return getCreatedBy();
    }

    @Override
    public UInteger component18() {
        return getLastUpdatedBy();
    }

    @Override
    public String component19() {
        return getRemark();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getRideRequestId();
    }

    @Override
    public UInteger value3() {
        return getRiderId();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public String value6() {
        return getFrom();
    }

    @Override
    public Long value7() {
        return getTransactionTime();
    }

    @Override
    public String value8() {
        return getPaymentMode();
    }

    @Override
    public String value9() {
        return getPaymentStatus();
    }

    @Override
    public UInteger value10() {
        return getOrderId();
    }

    @Override
    public BigDecimal value11() {
        return getClosingBalance();
    }

    @Override
    public String value12() {
        return getMessage();
    }

    @Override
    public String value13() {
        return getSubtitle();
    }

    @Override
    public Byte value14() {
        return getIsActive();
    }

    @Override
    public Long value15() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value16() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value17() {
        return getCreatedBy();
    }

    @Override
    public UInteger value18() {
        return getLastUpdatedBy();
    }

    @Override
    public String value19() {
        return getRemark();
    }

    @Override
    public WalletTransactionsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value2(UInteger value) {
        setRideRequestId(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value3(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value6(String value) {
        setFrom(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value7(Long value) {
        setTransactionTime(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value8(String value) {
        setPaymentMode(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value9(String value) {
        setPaymentStatus(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value10(UInteger value) {
        setOrderId(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value11(BigDecimal value) {
        setClosingBalance(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value12(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value13(String value) {
        setSubtitle(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value14(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value15(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value16(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value17(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value18(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord value19(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public WalletTransactionsRecord values(UInteger value1, UInteger value2, UInteger value3, BigDecimal value4, String value5, String value6, Long value7, String value8, String value9, UInteger value10, BigDecimal value11, String value12, String value13, Byte value14, Long value15, Long value16, UInteger value17, UInteger value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WalletTransactionsRecord
     */
    public WalletTransactionsRecord() {
        super(WalletTransactions.WALLET_TRANSACTIONS);
    }

    /**
     * Create a detached, initialised WalletTransactionsRecord
     */
    public WalletTransactionsRecord(UInteger id, UInteger rideRequestId, UInteger riderId, BigDecimal amount, String type, String from, Long transactionTime, String paymentMode, String paymentStatus, UInteger orderId, BigDecimal closingBalance, String message, String subtitle, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String remark) {
        super(WalletTransactions.WALLET_TRANSACTIONS);

        set(0, id);
        set(1, rideRequestId);
        set(2, riderId);
        set(3, amount);
        set(4, type);
        set(5, from);
        set(6, transactionTime);
        set(7, paymentMode);
        set(8, paymentStatus);
        set(9, orderId);
        set(10, closingBalance);
        set(11, message);
        set(12, subtitle);
        set(13, isActive);
        set(14, createdTimestamp);
        set(15, lastUpdatedTimestamp);
        set(16, createdBy);
        set(17, lastUpdatedBy);
        set(18, remark);
    }
}
