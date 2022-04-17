/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.PaymentOrderAudit;

import java.math.BigDecimal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentOrderAuditRecord extends UpdatableRecordImpl<PaymentOrderAuditRecord> {

    private static final long serialVersionUID = -295581104;

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.id</code>.
     */
    public PaymentOrderAuditRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.order_id</code>.
     */
    public PaymentOrderAuditRecord setOrderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.order_id</code>.
     */
    public UInteger getOrderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.order_type</code>.
     */
    public PaymentOrderAuditRecord setOrderType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.order_type</code>.
     */
    public String getOrderType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.order_status</code>.
     */
    public PaymentOrderAuditRecord setOrderStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.order_status</code>.
     */
    public String getOrderStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.amount</code>.
     */
    public PaymentOrderAuditRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.ride_id</code>.
     */
    public PaymentOrderAuditRecord setRideId(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.ride_id</code>.
     */
    public UInteger getRideId() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.ride_request_id</code>.
     */
    public PaymentOrderAuditRecord setRideRequestId(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.rider_id</code>.
     */
    public PaymentOrderAuditRecord setRiderId(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.rider_id</code>.
     */
    public Integer getRiderId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.ridecell_rider_id</code>.
     */
    public PaymentOrderAuditRecord setRidecellRiderId(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.ridecell_rider_id</code>.
     */
    public Integer getRidecellRiderId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.paytm_pre_auth_id</code>.
     */
    public PaymentOrderAuditRecord setPaytmPreAuthId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.paytm_pre_auth_id</code>.
     */
    public String getPaytmPreAuthId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.extra_data</code>.
     */
    public PaymentOrderAuditRecord setExtraData(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.extra_data</code>.
     */
    public String getExtraData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.error_log</code>.
     */
    public PaymentOrderAuditRecord setErrorLog(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.error_log</code>.
     */
    public String getErrorLog() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.payment_mode</code>.
     */
    public PaymentOrderAuditRecord setPaymentMode(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.payment_mode</code>.
     */
    public String getPaymentMode() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.refund_status</code>.
     */
    public PaymentOrderAuditRecord setRefundStatus(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.refund_status</code>.
     */
    public String getRefundStatus() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.refund_order_id</code>.
     */
    public PaymentOrderAuditRecord setRefundOrderId(UInteger value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.refund_order_id</code>.
     */
    public UInteger getRefundOrderId() {
        return (UInteger) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.created_by</code>.
     */
    public PaymentOrderAuditRecord setCreatedBy(UInteger value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.created_timestamp</code>.
     */
    public PaymentOrderAuditRecord setCreatedTimestamp(Long value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.is_active</code>.
     */
    public PaymentOrderAuditRecord setIsActive(Byte value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.payment_transaction_id</code>.
     */
    public PaymentOrderAuditRecord setPaymentTransactionId(UInteger value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.payment_transaction_id</code>.
     */
    public UInteger getPaymentTransactionId() {
        return (UInteger) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.block_amount</code>.
     */
    public PaymentOrderAuditRecord setBlockAmount(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.block_amount</code>.
     */
    public BigDecimal getBlockAmount() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.capture_amount</code>.
     */
    public PaymentOrderAuditRecord setCaptureAmount(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.capture_amount</code>.
     */
    public BigDecimal getCaptureAmount() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.release_amount</code>.
     */
    public PaymentOrderAuditRecord setReleaseAmount(BigDecimal value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.release_amount</code>.
     */
    public BigDecimal getReleaseAmount() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.block_duration</code>.
     */
    public PaymentOrderAuditRecord setBlockDuration(Long value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.block_duration</code>.
     */
    public Long getBlockDuration() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.pending_amount</code>.
     */
    public PaymentOrderAuditRecord setPendingAmount(BigDecimal value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.pending_amount</code>.
     */
    public BigDecimal getPendingAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.order_id_for_payment</code>.
     */
    public PaymentOrderAuditRecord setOrderIdForPayment(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.order_id_for_payment</code>.
     */
    public String getOrderIdForPayment() {
        return (String) get(24);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.mark_for_refund</code>.
     */
    public PaymentOrderAuditRecord setMarkForRefund(Byte value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.mark_for_refund</code>.
     */
    public Byte getMarkForRefund() {
        return (Byte) get(25);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.user_id</code>.
     */
    public PaymentOrderAuditRecord setUserId(UInteger value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(26);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.business_account_id</code>.
     */
    public PaymentOrderAuditRecord setBusinessAccountId(UInteger value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.business_account_id</code>.
     */
    public UInteger getBusinessAccountId() {
        return (UInteger) get(27);
    }

    /**
     * Setter for <code>blusmartDevDb.payment_order_audit.driver_id</code>.
     */
    public PaymentOrderAuditRecord setDriverId(UInteger value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.payment_order_audit.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentOrderAuditRecord
     */
    public PaymentOrderAuditRecord() {
        super(PaymentOrderAudit.PAYMENT_ORDER_AUDIT);
    }

    /**
     * Create a detached, initialised PaymentOrderAuditRecord
     */
    public PaymentOrderAuditRecord(UInteger id, UInteger orderId, String orderType, String orderStatus, BigDecimal amount, UInteger rideId, UInteger rideRequestId, Integer riderId, Integer ridecellRiderId, String paytmPreAuthId, String extraData, String errorLog, String paymentMode, String refundStatus, UInteger refundOrderId, UInteger createdBy, Long createdTimestamp, Byte isActive, UInteger paymentTransactionId, BigDecimal blockAmount, BigDecimal captureAmount, BigDecimal releaseAmount, Long blockDuration, BigDecimal pendingAmount, String orderIdForPayment, Byte markForRefund, UInteger userId, UInteger businessAccountId, UInteger driverId) {
        super(PaymentOrderAudit.PAYMENT_ORDER_AUDIT);

        set(0, id);
        set(1, orderId);
        set(2, orderType);
        set(3, orderStatus);
        set(4, amount);
        set(5, rideId);
        set(6, rideRequestId);
        set(7, riderId);
        set(8, ridecellRiderId);
        set(9, paytmPreAuthId);
        set(10, extraData);
        set(11, errorLog);
        set(12, paymentMode);
        set(13, refundStatus);
        set(14, refundOrderId);
        set(15, createdBy);
        set(16, createdTimestamp);
        set(17, isActive);
        set(18, paymentTransactionId);
        set(19, blockAmount);
        set(20, captureAmount);
        set(21, releaseAmount);
        set(22, blockDuration);
        set(23, pendingAmount);
        set(24, orderIdForPayment);
        set(25, markForRefund);
        set(26, userId);
        set(27, businessAccountId);
        set(28, driverId);
    }
}