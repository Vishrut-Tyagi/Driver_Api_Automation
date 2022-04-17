/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentTransaction implements Serializable {

    private static final long serialVersionUID = -391586926;

    private UInteger id;
    private UInteger rideId;
    private String   paymentSource;
    private String   transactionId;
    private String   requestChecksum;
    private String   requestMetadata;
    private Long     requestSentTimestamp;
    private String   responseMetadata;
    private String   responseChecksum;
    private Long     responseReceivedTimestamp;
    private String   transactionState;
    private String   errorLog;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private Byte     isActive;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private UInteger paymentOrderId;

    public PaymentTransaction() {}

    public PaymentTransaction(PaymentTransaction value) {
        this.id = value.id;
        this.rideId = value.rideId;
        this.paymentSource = value.paymentSource;
        this.transactionId = value.transactionId;
        this.requestChecksum = value.requestChecksum;
        this.requestMetadata = value.requestMetadata;
        this.requestSentTimestamp = value.requestSentTimestamp;
        this.responseMetadata = value.responseMetadata;
        this.responseChecksum = value.responseChecksum;
        this.responseReceivedTimestamp = value.responseReceivedTimestamp;
        this.transactionState = value.transactionState;
        this.errorLog = value.errorLog;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.paymentOrderId = value.paymentOrderId;
    }

    public PaymentTransaction(
        UInteger id,
        UInteger rideId,
        String   paymentSource,
        String   transactionId,
        String   requestChecksum,
        String   requestMetadata,
        Long     requestSentTimestamp,
        String   responseMetadata,
        String   responseChecksum,
        Long     responseReceivedTimestamp,
        String   transactionState,
        String   errorLog,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        Byte     isActive,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        UInteger paymentOrderId
    ) {
        this.id = id;
        this.rideId = rideId;
        this.paymentSource = paymentSource;
        this.transactionId = transactionId;
        this.requestChecksum = requestChecksum;
        this.requestMetadata = requestMetadata;
        this.requestSentTimestamp = requestSentTimestamp;
        this.responseMetadata = responseMetadata;
        this.responseChecksum = responseChecksum;
        this.responseReceivedTimestamp = responseReceivedTimestamp;
        this.transactionState = transactionState;
        this.errorLog = errorLog;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.paymentOrderId = paymentOrderId;
    }

    public UInteger getId() {
        return this.id;
    }

    public PaymentTransaction setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRideId() {
        return this.rideId;
    }

    public PaymentTransaction setRideId(UInteger rideId) {
        this.rideId = rideId;
        return this;
    }

    public String getPaymentSource() {
        return this.paymentSource;
    }

    public PaymentTransaction setPaymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public PaymentTransaction setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getRequestChecksum() {
        return this.requestChecksum;
    }

    public PaymentTransaction setRequestChecksum(String requestChecksum) {
        this.requestChecksum = requestChecksum;
        return this;
    }

    public String getRequestMetadata() {
        return this.requestMetadata;
    }

    public PaymentTransaction setRequestMetadata(String requestMetadata) {
        this.requestMetadata = requestMetadata;
        return this;
    }

    public Long getRequestSentTimestamp() {
        return this.requestSentTimestamp;
    }

    public PaymentTransaction setRequestSentTimestamp(Long requestSentTimestamp) {
        this.requestSentTimestamp = requestSentTimestamp;
        return this;
    }

    public String getResponseMetadata() {
        return this.responseMetadata;
    }

    public PaymentTransaction setResponseMetadata(String responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    public String getResponseChecksum() {
        return this.responseChecksum;
    }

    public PaymentTransaction setResponseChecksum(String responseChecksum) {
        this.responseChecksum = responseChecksum;
        return this;
    }

    public Long getResponseReceivedTimestamp() {
        return this.responseReceivedTimestamp;
    }

    public PaymentTransaction setResponseReceivedTimestamp(Long responseReceivedTimestamp) {
        this.responseReceivedTimestamp = responseReceivedTimestamp;
        return this;
    }

    public String getTransactionState() {
        return this.transactionState;
    }

    public PaymentTransaction setTransactionState(String transactionState) {
        this.transactionState = transactionState;
        return this;
    }

    public String getErrorLog() {
        return this.errorLog;
    }

    public PaymentTransaction setErrorLog(String errorLog) {
        this.errorLog = errorLog;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public PaymentTransaction setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public PaymentTransaction setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public PaymentTransaction setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public PaymentTransaction setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public PaymentTransaction setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public UInteger getPaymentOrderId() {
        return this.paymentOrderId;
    }

    public PaymentTransaction setPaymentOrderId(UInteger paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
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
        final PaymentTransaction other = (PaymentTransaction) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (rideId == null) {
            if (other.rideId != null)
                return false;
        }
        else if (!rideId.equals(other.rideId))
            return false;
        if (paymentSource == null) {
            if (other.paymentSource != null)
                return false;
        }
        else if (!paymentSource.equals(other.paymentSource))
            return false;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        }
        else if (!transactionId.equals(other.transactionId))
            return false;
        if (requestChecksum == null) {
            if (other.requestChecksum != null)
                return false;
        }
        else if (!requestChecksum.equals(other.requestChecksum))
            return false;
        if (requestMetadata == null) {
            if (other.requestMetadata != null)
                return false;
        }
        else if (!requestMetadata.equals(other.requestMetadata))
            return false;
        if (requestSentTimestamp == null) {
            if (other.requestSentTimestamp != null)
                return false;
        }
        else if (!requestSentTimestamp.equals(other.requestSentTimestamp))
            return false;
        if (responseMetadata == null) {
            if (other.responseMetadata != null)
                return false;
        }
        else if (!responseMetadata.equals(other.responseMetadata))
            return false;
        if (responseChecksum == null) {
            if (other.responseChecksum != null)
                return false;
        }
        else if (!responseChecksum.equals(other.responseChecksum))
            return false;
        if (responseReceivedTimestamp == null) {
            if (other.responseReceivedTimestamp != null)
                return false;
        }
        else if (!responseReceivedTimestamp.equals(other.responseReceivedTimestamp))
            return false;
        if (transactionState == null) {
            if (other.transactionState != null)
                return false;
        }
        else if (!transactionState.equals(other.transactionState))
            return false;
        if (errorLog == null) {
            if (other.errorLog != null)
                return false;
        }
        else if (!errorLog.equals(other.errorLog))
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
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
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
        if (paymentOrderId == null) {
            if (other.paymentOrderId != null)
                return false;
        }
        else if (!paymentOrderId.equals(other.paymentOrderId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.rideId == null) ? 0 : this.rideId.hashCode());
        result = prime * result + ((this.paymentSource == null) ? 0 : this.paymentSource.hashCode());
        result = prime * result + ((this.transactionId == null) ? 0 : this.transactionId.hashCode());
        result = prime * result + ((this.requestChecksum == null) ? 0 : this.requestChecksum.hashCode());
        result = prime * result + ((this.requestMetadata == null) ? 0 : this.requestMetadata.hashCode());
        result = prime * result + ((this.requestSentTimestamp == null) ? 0 : this.requestSentTimestamp.hashCode());
        result = prime * result + ((this.responseMetadata == null) ? 0 : this.responseMetadata.hashCode());
        result = prime * result + ((this.responseChecksum == null) ? 0 : this.responseChecksum.hashCode());
        result = prime * result + ((this.responseReceivedTimestamp == null) ? 0 : this.responseReceivedTimestamp.hashCode());
        result = prime * result + ((this.transactionState == null) ? 0 : this.transactionState.hashCode());
        result = prime * result + ((this.errorLog == null) ? 0 : this.errorLog.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.paymentOrderId == null) ? 0 : this.paymentOrderId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentTransaction (");

        sb.append(id);
        sb.append(", ").append(rideId);
        sb.append(", ").append(paymentSource);
        sb.append(", ").append(transactionId);
        sb.append(", ").append(requestChecksum);
        sb.append(", ").append(requestMetadata);
        sb.append(", ").append(requestSentTimestamp);
        sb.append(", ").append(responseMetadata);
        sb.append(", ").append(responseChecksum);
        sb.append(", ").append(responseReceivedTimestamp);
        sb.append(", ").append(transactionState);
        sb.append(", ").append(errorLog);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(paymentOrderId);

        sb.append(")");
        return sb.toString();
    }
}