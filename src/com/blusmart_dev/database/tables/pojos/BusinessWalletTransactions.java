/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessWalletTransactions implements Serializable {

    private static final long serialVersionUID = -1488289086;

    private UInteger   id;
    private UInteger   businessAccountId;
    private UInteger   rideRequestId;
    private UInteger   userId;
    private UInteger   riderId;
    private BigDecimal amount;
    private String     type;
    private String     from;
    private Long       transactionTime;
    private String     paymentMode;
    private String     paymentStatus;
    private UInteger   orderId;
    private BigDecimal closingBalance;
    private String     message;
    private String     subtitle;
    private String     note;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;

    public BusinessWalletTransactions() {}

    public BusinessWalletTransactions(BusinessWalletTransactions value) {
        this.id = value.id;
        this.businessAccountId = value.businessAccountId;
        this.rideRequestId = value.rideRequestId;
        this.userId = value.userId;
        this.riderId = value.riderId;
        this.amount = value.amount;
        this.type = value.type;
        this.from = value.from;
        this.transactionTime = value.transactionTime;
        this.paymentMode = value.paymentMode;
        this.paymentStatus = value.paymentStatus;
        this.orderId = value.orderId;
        this.closingBalance = value.closingBalance;
        this.message = value.message;
        this.subtitle = value.subtitle;
        this.note = value.note;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
    }

    public BusinessWalletTransactions(
        UInteger   id,
        UInteger   businessAccountId,
        UInteger   rideRequestId,
        UInteger   userId,
        UInteger   riderId,
        BigDecimal amount,
        String     type,
        String     from,
        Long       transactionTime,
        String     paymentMode,
        String     paymentStatus,
        UInteger   orderId,
        BigDecimal closingBalance,
        String     message,
        String     subtitle,
        String     note,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy
    ) {
        this.id = id;
        this.businessAccountId = businessAccountId;
        this.rideRequestId = rideRequestId;
        this.userId = userId;
        this.riderId = riderId;
        this.amount = amount;
        this.type = type;
        this.from = from;
        this.transactionTime = transactionTime;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.orderId = orderId;
        this.closingBalance = closingBalance;
        this.message = message;
        this.subtitle = subtitle;
        this.note = note;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public UInteger getId() {
        return this.id;
    }

    public BusinessWalletTransactions setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getBusinessAccountId() {
        return this.businessAccountId;
    }

    public BusinessWalletTransactions setBusinessAccountId(UInteger businessAccountId) {
        this.businessAccountId = businessAccountId;
        return this;
    }

    public UInteger getRideRequestId() {
        return this.rideRequestId;
    }

    public BusinessWalletTransactions setRideRequestId(UInteger rideRequestId) {
        this.rideRequestId = rideRequestId;
        return this;
    }

    public UInteger getUserId() {
        return this.userId;
    }

    public BusinessWalletTransactions setUserId(UInteger userId) {
        this.userId = userId;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public BusinessWalletTransactions setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BusinessWalletTransactions setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public BusinessWalletTransactions setType(String type) {
        this.type = type;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public BusinessWalletTransactions setFrom(String from) {
        this.from = from;
        return this;
    }

    public Long getTransactionTime() {
        return this.transactionTime;
    }

    public BusinessWalletTransactions setTransactionTime(Long transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public BusinessWalletTransactions setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public BusinessWalletTransactions setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public UInteger getOrderId() {
        return this.orderId;
    }

    public BusinessWalletTransactions setOrderId(UInteger orderId) {
        this.orderId = orderId;
        return this;
    }

    public BigDecimal getClosingBalance() {
        return this.closingBalance;
    }

    public BusinessWalletTransactions setClosingBalance(BigDecimal closingBalance) {
        this.closingBalance = closingBalance;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public BusinessWalletTransactions setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public BusinessWalletTransactions setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public BusinessWalletTransactions setNote(String note) {
        this.note = note;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public BusinessWalletTransactions setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public BusinessWalletTransactions setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public BusinessWalletTransactions setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public BusinessWalletTransactions setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public BusinessWalletTransactions setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final BusinessWalletTransactions other = (BusinessWalletTransactions) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (businessAccountId == null) {
            if (other.businessAccountId != null)
                return false;
        }
        else if (!businessAccountId.equals(other.businessAccountId))
            return false;
        if (rideRequestId == null) {
            if (other.rideRequestId != null)
                return false;
        }
        else if (!rideRequestId.equals(other.rideRequestId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (from == null) {
            if (other.from != null)
                return false;
        }
        else if (!from.equals(other.from))
            return false;
        if (transactionTime == null) {
            if (other.transactionTime != null)
                return false;
        }
        else if (!transactionTime.equals(other.transactionTime))
            return false;
        if (paymentMode == null) {
            if (other.paymentMode != null)
                return false;
        }
        else if (!paymentMode.equals(other.paymentMode))
            return false;
        if (paymentStatus == null) {
            if (other.paymentStatus != null)
                return false;
        }
        else if (!paymentStatus.equals(other.paymentStatus))
            return false;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!orderId.equals(other.orderId))
            return false;
        if (closingBalance == null) {
            if (other.closingBalance != null)
                return false;
        }
        else if (!closingBalance.equals(other.closingBalance))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        }
        else if (!message.equals(other.message))
            return false;
        if (subtitle == null) {
            if (other.subtitle != null)
                return false;
        }
        else if (!subtitle.equals(other.subtitle))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        }
        else if (!note.equals(other.note))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        if (lastUpdatedTimestamp == null) {
            if (other.lastUpdatedTimestamp != null)
                return false;
        }
        else if (!lastUpdatedTimestamp.equals(other.lastUpdatedTimestamp))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (lastUpdatedBy == null) {
            if (other.lastUpdatedBy != null)
                return false;
        }
        else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.businessAccountId == null) ? 0 : this.businessAccountId.hashCode());
        result = prime * result + ((this.rideRequestId == null) ? 0 : this.rideRequestId.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.from == null) ? 0 : this.from.hashCode());
        result = prime * result + ((this.transactionTime == null) ? 0 : this.transactionTime.hashCode());
        result = prime * result + ((this.paymentMode == null) ? 0 : this.paymentMode.hashCode());
        result = prime * result + ((this.paymentStatus == null) ? 0 : this.paymentStatus.hashCode());
        result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
        result = prime * result + ((this.closingBalance == null) ? 0 : this.closingBalance.hashCode());
        result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
        result = prime * result + ((this.subtitle == null) ? 0 : this.subtitle.hashCode());
        result = prime * result + ((this.note == null) ? 0 : this.note.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessWalletTransactions (");

        sb.append(id);
        sb.append(", ").append(businessAccountId);
        sb.append(", ").append(rideRequestId);
        sb.append(", ").append(userId);
        sb.append(", ").append(riderId);
        sb.append(", ").append(amount);
        sb.append(", ").append(type);
        sb.append(", ").append(from);
        sb.append(", ").append(transactionTime);
        sb.append(", ").append(paymentMode);
        sb.append(", ").append(paymentStatus);
        sb.append(", ").append(orderId);
        sb.append(", ").append(closingBalance);
        sb.append(", ").append(message);
        sb.append(", ").append(subtitle);
        sb.append(", ").append(note);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);

        sb.append(")");
        return sb.toString();
    }
}
