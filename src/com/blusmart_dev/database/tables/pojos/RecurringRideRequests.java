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
public class RecurringRideRequests implements Serializable {

    private static final long serialVersionUID = -704556379;

    private UInteger   id;
    private UInteger   riderId;
    private BigDecimal perTripPrice;
    private BigDecimal totalPrice;
    private UInteger   renewCount;
    private Long       startTimestamp;
    private Long       endTimestamp;
    private String     recurringState;
    private String     configuration;
    private BigDecimal walletAdded;
    private Byte       isActive;
    private UInteger   createdBy;
    private Long       createdAt;
    private UInteger   lastUpdatedBy;
    private Long       lastUpdatedAt;
    private String     note;
    private String     platform;
    private BigDecimal estimatedDistance;
    private Integer    estimatedCompletionMins;
    private String     estimatedPricingDetails;
    private Integer    paymentOrderId;
    private Integer    recurringPackageId;
    private String     promoCode;
    private String     cancellationReason;
    private String     lastTriedUpdate;
    private String     otherflags;
    private String     pauseReason;

    public RecurringRideRequests() {}

    public RecurringRideRequests(RecurringRideRequests value) {
        this.id = value.id;
        this.riderId = value.riderId;
        this.perTripPrice = value.perTripPrice;
        this.totalPrice = value.totalPrice;
        this.renewCount = value.renewCount;
        this.startTimestamp = value.startTimestamp;
        this.endTimestamp = value.endTimestamp;
        this.recurringState = value.recurringState;
        this.configuration = value.configuration;
        this.walletAdded = value.walletAdded;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.note = value.note;
        this.platform = value.platform;
        this.estimatedDistance = value.estimatedDistance;
        this.estimatedCompletionMins = value.estimatedCompletionMins;
        this.estimatedPricingDetails = value.estimatedPricingDetails;
        this.paymentOrderId = value.paymentOrderId;
        this.recurringPackageId = value.recurringPackageId;
        this.promoCode = value.promoCode;
        this.cancellationReason = value.cancellationReason;
        this.lastTriedUpdate = value.lastTriedUpdate;
        this.otherflags = value.otherflags;
        this.pauseReason = value.pauseReason;
    }

    public RecurringRideRequests(
        UInteger   id,
        UInteger   riderId,
        BigDecimal perTripPrice,
        BigDecimal totalPrice,
        UInteger   renewCount,
        Long       startTimestamp,
        Long       endTimestamp,
        String     recurringState,
        String     configuration,
        BigDecimal walletAdded,
        Byte       isActive,
        UInteger   createdBy,
        Long       createdAt,
        UInteger   lastUpdatedBy,
        Long       lastUpdatedAt,
        String     note,
        String     platform,
        BigDecimal estimatedDistance,
        Integer    estimatedCompletionMins,
        String     estimatedPricingDetails,
        Integer    paymentOrderId,
        Integer    recurringPackageId,
        String     promoCode,
        String     cancellationReason,
        String     lastTriedUpdate,
        String     otherflags,
        String     pauseReason
    ) {
        this.id = id;
        this.riderId = riderId;
        this.perTripPrice = perTripPrice;
        this.totalPrice = totalPrice;
        this.renewCount = renewCount;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.recurringState = recurringState;
        this.configuration = configuration;
        this.walletAdded = walletAdded;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
        this.note = note;
        this.platform = platform;
        this.estimatedDistance = estimatedDistance;
        this.estimatedCompletionMins = estimatedCompletionMins;
        this.estimatedPricingDetails = estimatedPricingDetails;
        this.paymentOrderId = paymentOrderId;
        this.recurringPackageId = recurringPackageId;
        this.promoCode = promoCode;
        this.cancellationReason = cancellationReason;
        this.lastTriedUpdate = lastTriedUpdate;
        this.otherflags = otherflags;
        this.pauseReason = pauseReason;
    }

    public UInteger getId() {
        return this.id;
    }

    public RecurringRideRequests setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public RecurringRideRequests setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public BigDecimal getPerTripPrice() {
        return this.perTripPrice;
    }

    public RecurringRideRequests setPerTripPrice(BigDecimal perTripPrice) {
        this.perTripPrice = perTripPrice;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public RecurringRideRequests setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public UInteger getRenewCount() {
        return this.renewCount;
    }

    public RecurringRideRequests setRenewCount(UInteger renewCount) {
        this.renewCount = renewCount;
        return this;
    }

    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public RecurringRideRequests setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public RecurringRideRequests setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    public String getRecurringState() {
        return this.recurringState;
    }

    public RecurringRideRequests setRecurringState(String recurringState) {
        this.recurringState = recurringState;
        return this;
    }

    public String getConfiguration() {
        return this.configuration;
    }

    public RecurringRideRequests setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    public BigDecimal getWalletAdded() {
        return this.walletAdded;
    }

    public RecurringRideRequests setWalletAdded(BigDecimal walletAdded) {
        this.walletAdded = walletAdded;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public RecurringRideRequests setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public RecurringRideRequests setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public RecurringRideRequests setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public RecurringRideRequests setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public RecurringRideRequests setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public RecurringRideRequests setNote(String note) {
        this.note = note;
        return this;
    }

    public String getPlatform() {
        return this.platform;
    }

    public RecurringRideRequests setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public BigDecimal getEstimatedDistance() {
        return this.estimatedDistance;
    }

    public RecurringRideRequests setEstimatedDistance(BigDecimal estimatedDistance) {
        this.estimatedDistance = estimatedDistance;
        return this;
    }

    public Integer getEstimatedCompletionMins() {
        return this.estimatedCompletionMins;
    }

    public RecurringRideRequests setEstimatedCompletionMins(Integer estimatedCompletionMins) {
        this.estimatedCompletionMins = estimatedCompletionMins;
        return this;
    }

    public String getEstimatedPricingDetails() {
        return this.estimatedPricingDetails;
    }

    public RecurringRideRequests setEstimatedPricingDetails(String estimatedPricingDetails) {
        this.estimatedPricingDetails = estimatedPricingDetails;
        return this;
    }

    public Integer getPaymentOrderId() {
        return this.paymentOrderId;
    }

    public RecurringRideRequests setPaymentOrderId(Integer paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
        return this;
    }

    public Integer getRecurringPackageId() {
        return this.recurringPackageId;
    }

    public RecurringRideRequests setRecurringPackageId(Integer recurringPackageId) {
        this.recurringPackageId = recurringPackageId;
        return this;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public RecurringRideRequests setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public String getCancellationReason() {
        return this.cancellationReason;
    }

    public RecurringRideRequests setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
        return this;
    }

    public String getLastTriedUpdate() {
        return this.lastTriedUpdate;
    }

    public RecurringRideRequests setLastTriedUpdate(String lastTriedUpdate) {
        this.lastTriedUpdate = lastTriedUpdate;
        return this;
    }

    public String getOtherflags() {
        return this.otherflags;
    }

    public RecurringRideRequests setOtherflags(String otherflags) {
        this.otherflags = otherflags;
        return this;
    }

    public String getPauseReason() {
        return this.pauseReason;
    }

    public RecurringRideRequests setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason;
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
        final RecurringRideRequests other = (RecurringRideRequests) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (perTripPrice == null) {
            if (other.perTripPrice != null)
                return false;
        }
        else if (!perTripPrice.equals(other.perTripPrice))
            return false;
        if (totalPrice == null) {
            if (other.totalPrice != null)
                return false;
        }
        else if (!totalPrice.equals(other.totalPrice))
            return false;
        if (renewCount == null) {
            if (other.renewCount != null)
                return false;
        }
        else if (!renewCount.equals(other.renewCount))
            return false;
        if (startTimestamp == null) {
            if (other.startTimestamp != null)
                return false;
        }
        else if (!startTimestamp.equals(other.startTimestamp))
            return false;
        if (endTimestamp == null) {
            if (other.endTimestamp != null)
                return false;
        }
        else if (!endTimestamp.equals(other.endTimestamp))
            return false;
        if (recurringState == null) {
            if (other.recurringState != null)
                return false;
        }
        else if (!recurringState.equals(other.recurringState))
            return false;
        if (configuration == null) {
            if (other.configuration != null)
                return false;
        }
        else if (!configuration.equals(other.configuration))
            return false;
        if (walletAdded == null) {
            if (other.walletAdded != null)
                return false;
        }
        else if (!walletAdded.equals(other.walletAdded))
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
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (lastUpdatedBy == null) {
            if (other.lastUpdatedBy != null)
                return false;
        }
        else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
            return false;
        if (lastUpdatedAt == null) {
            if (other.lastUpdatedAt != null)
                return false;
        }
        else if (!lastUpdatedAt.equals(other.lastUpdatedAt))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        }
        else if (!note.equals(other.note))
            return false;
        if (platform == null) {
            if (other.platform != null)
                return false;
        }
        else if (!platform.equals(other.platform))
            return false;
        if (estimatedDistance == null) {
            if (other.estimatedDistance != null)
                return false;
        }
        else if (!estimatedDistance.equals(other.estimatedDistance))
            return false;
        if (estimatedCompletionMins == null) {
            if (other.estimatedCompletionMins != null)
                return false;
        }
        else if (!estimatedCompletionMins.equals(other.estimatedCompletionMins))
            return false;
        if (estimatedPricingDetails == null) {
            if (other.estimatedPricingDetails != null)
                return false;
        }
        else if (!estimatedPricingDetails.equals(other.estimatedPricingDetails))
            return false;
        if (paymentOrderId == null) {
            if (other.paymentOrderId != null)
                return false;
        }
        else if (!paymentOrderId.equals(other.paymentOrderId))
            return false;
        if (recurringPackageId == null) {
            if (other.recurringPackageId != null)
                return false;
        }
        else if (!recurringPackageId.equals(other.recurringPackageId))
            return false;
        if (promoCode == null) {
            if (other.promoCode != null)
                return false;
        }
        else if (!promoCode.equals(other.promoCode))
            return false;
        if (cancellationReason == null) {
            if (other.cancellationReason != null)
                return false;
        }
        else if (!cancellationReason.equals(other.cancellationReason))
            return false;
        if (lastTriedUpdate == null) {
            if (other.lastTriedUpdate != null)
                return false;
        }
        else if (!lastTriedUpdate.equals(other.lastTriedUpdate))
            return false;
        if (otherflags == null) {
            if (other.otherflags != null)
                return false;
        }
        else if (!otherflags.equals(other.otherflags))
            return false;
        if (pauseReason == null) {
            if (other.pauseReason != null)
                return false;
        }
        else if (!pauseReason.equals(other.pauseReason))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.perTripPrice == null) ? 0 : this.perTripPrice.hashCode());
        result = prime * result + ((this.totalPrice == null) ? 0 : this.totalPrice.hashCode());
        result = prime * result + ((this.renewCount == null) ? 0 : this.renewCount.hashCode());
        result = prime * result + ((this.startTimestamp == null) ? 0 : this.startTimestamp.hashCode());
        result = prime * result + ((this.endTimestamp == null) ? 0 : this.endTimestamp.hashCode());
        result = prime * result + ((this.recurringState == null) ? 0 : this.recurringState.hashCode());
        result = prime * result + ((this.configuration == null) ? 0 : this.configuration.hashCode());
        result = prime * result + ((this.walletAdded == null) ? 0 : this.walletAdded.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.note == null) ? 0 : this.note.hashCode());
        result = prime * result + ((this.platform == null) ? 0 : this.platform.hashCode());
        result = prime * result + ((this.estimatedDistance == null) ? 0 : this.estimatedDistance.hashCode());
        result = prime * result + ((this.estimatedCompletionMins == null) ? 0 : this.estimatedCompletionMins.hashCode());
        result = prime * result + ((this.estimatedPricingDetails == null) ? 0 : this.estimatedPricingDetails.hashCode());
        result = prime * result + ((this.paymentOrderId == null) ? 0 : this.paymentOrderId.hashCode());
        result = prime * result + ((this.recurringPackageId == null) ? 0 : this.recurringPackageId.hashCode());
        result = prime * result + ((this.promoCode == null) ? 0 : this.promoCode.hashCode());
        result = prime * result + ((this.cancellationReason == null) ? 0 : this.cancellationReason.hashCode());
        result = prime * result + ((this.lastTriedUpdate == null) ? 0 : this.lastTriedUpdate.hashCode());
        result = prime * result + ((this.otherflags == null) ? 0 : this.otherflags.hashCode());
        result = prime * result + ((this.pauseReason == null) ? 0 : this.pauseReason.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RecurringRideRequests (");

        sb.append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(perTripPrice);
        sb.append(", ").append(totalPrice);
        sb.append(", ").append(renewCount);
        sb.append(", ").append(startTimestamp);
        sb.append(", ").append(endTimestamp);
        sb.append(", ").append(recurringState);
        sb.append(", ").append(configuration);
        sb.append(", ").append(walletAdded);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(note);
        sb.append(", ").append(platform);
        sb.append(", ").append(estimatedDistance);
        sb.append(", ").append(estimatedCompletionMins);
        sb.append(", ").append(estimatedPricingDetails);
        sb.append(", ").append(paymentOrderId);
        sb.append(", ").append(recurringPackageId);
        sb.append(", ").append(promoCode);
        sb.append(", ").append(cancellationReason);
        sb.append(", ").append(lastTriedUpdate);
        sb.append(", ").append(otherflags);
        sb.append(", ").append(pauseReason);

        sb.append(")");
        return sb.toString();
    }
}
