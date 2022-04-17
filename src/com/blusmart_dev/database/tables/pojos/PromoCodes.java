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
public class PromoCodes implements Serializable {

    private static final long serialVersionUID = 807819549;

    private UInteger   id;
    private String     promoCode;
    private Long       validFromTimestamp;
    private Long       validToTimestamp;
    private Long       applicableFromTimestamp;
    private Long       applicableToTimestamp;
    private String     state;
    private String     type;
    private String     action;
    private String     trigger;
    private String     rideType;
    private String     rideCategory;
    private String     amountType;
    private BigDecimal amountValue;
    private BigDecimal percentageCapAmount;
    private BigDecimal minimumRechargeAmount;
    private String     preCondition;
    private String     capping;
    private String     pickUpServiceRegion;
    private String     dropOffServiceRegion;
    private String     userSegmentType;
    private Byte       isReleased;
    private Byte       isExclusive;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private Byte       isVisible;
    private Byte       isRecurringPackPromo;
    private String     allowedSource;
    private String     allowedCategories;

    public PromoCodes() {}

    public PromoCodes(PromoCodes value) {
        this.id = value.id;
        this.promoCode = value.promoCode;
        this.validFromTimestamp = value.validFromTimestamp;
        this.validToTimestamp = value.validToTimestamp;
        this.applicableFromTimestamp = value.applicableFromTimestamp;
        this.applicableToTimestamp = value.applicableToTimestamp;
        this.state = value.state;
        this.type = value.type;
        this.action = value.action;
        this.trigger = value.trigger;
        this.rideType = value.rideType;
        this.rideCategory = value.rideCategory;
        this.amountType = value.amountType;
        this.amountValue = value.amountValue;
        this.percentageCapAmount = value.percentageCapAmount;
        this.minimumRechargeAmount = value.minimumRechargeAmount;
        this.preCondition = value.preCondition;
        this.capping = value.capping;
        this.pickUpServiceRegion = value.pickUpServiceRegion;
        this.dropOffServiceRegion = value.dropOffServiceRegion;
        this.userSegmentType = value.userSegmentType;
        this.isReleased = value.isReleased;
        this.isExclusive = value.isExclusive;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.isVisible = value.isVisible;
        this.isRecurringPackPromo = value.isRecurringPackPromo;
        this.allowedSource = value.allowedSource;
        this.allowedCategories = value.allowedCategories;
    }

    public PromoCodes(
        UInteger   id,
        String     promoCode,
        Long       validFromTimestamp,
        Long       validToTimestamp,
        Long       applicableFromTimestamp,
        Long       applicableToTimestamp,
        String     state,
        String     type,
        String     action,
        String     trigger,
        String     rideType,
        String     rideCategory,
        String     amountType,
        BigDecimal amountValue,
        BigDecimal percentageCapAmount,
        BigDecimal minimumRechargeAmount,
        String     preCondition,
        String     capping,
        String     pickUpServiceRegion,
        String     dropOffServiceRegion,
        String     userSegmentType,
        Byte       isReleased,
        Byte       isExclusive,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        Byte       isVisible,
        Byte       isRecurringPackPromo,
        String     allowedSource,
        String     allowedCategories
    ) {
        this.id = id;
        this.promoCode = promoCode;
        this.validFromTimestamp = validFromTimestamp;
        this.validToTimestamp = validToTimestamp;
        this.applicableFromTimestamp = applicableFromTimestamp;
        this.applicableToTimestamp = applicableToTimestamp;
        this.state = state;
        this.type = type;
        this.action = action;
        this.trigger = trigger;
        this.rideType = rideType;
        this.rideCategory = rideCategory;
        this.amountType = amountType;
        this.amountValue = amountValue;
        this.percentageCapAmount = percentageCapAmount;
        this.minimumRechargeAmount = minimumRechargeAmount;
        this.preCondition = preCondition;
        this.capping = capping;
        this.pickUpServiceRegion = pickUpServiceRegion;
        this.dropOffServiceRegion = dropOffServiceRegion;
        this.userSegmentType = userSegmentType;
        this.isReleased = isReleased;
        this.isExclusive = isExclusive;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.isVisible = isVisible;
        this.isRecurringPackPromo = isRecurringPackPromo;
        this.allowedSource = allowedSource;
        this.allowedCategories = allowedCategories;
    }

    public UInteger getId() {
        return this.id;
    }

    public PromoCodes setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public PromoCodes setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public Long getValidFromTimestamp() {
        return this.validFromTimestamp;
    }

    public PromoCodes setValidFromTimestamp(Long validFromTimestamp) {
        this.validFromTimestamp = validFromTimestamp;
        return this;
    }

    public Long getValidToTimestamp() {
        return this.validToTimestamp;
    }

    public PromoCodes setValidToTimestamp(Long validToTimestamp) {
        this.validToTimestamp = validToTimestamp;
        return this;
    }

    public Long getApplicableFromTimestamp() {
        return this.applicableFromTimestamp;
    }

    public PromoCodes setApplicableFromTimestamp(Long applicableFromTimestamp) {
        this.applicableFromTimestamp = applicableFromTimestamp;
        return this;
    }

    public Long getApplicableToTimestamp() {
        return this.applicableToTimestamp;
    }

    public PromoCodes setApplicableToTimestamp(Long applicableToTimestamp) {
        this.applicableToTimestamp = applicableToTimestamp;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public PromoCodes setState(String state) {
        this.state = state;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public PromoCodes setType(String type) {
        this.type = type;
        return this;
    }

    public String getAction() {
        return this.action;
    }

    public PromoCodes setAction(String action) {
        this.action = action;
        return this;
    }

    public String getTrigger() {
        return this.trigger;
    }

    public PromoCodes setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getRideType() {
        return this.rideType;
    }

    public PromoCodes setRideType(String rideType) {
        this.rideType = rideType;
        return this;
    }

    public String getRideCategory() {
        return this.rideCategory;
    }

    public PromoCodes setRideCategory(String rideCategory) {
        this.rideCategory = rideCategory;
        return this;
    }

    public String getAmountType() {
        return this.amountType;
    }

    public PromoCodes setAmountType(String amountType) {
        this.amountType = amountType;
        return this;
    }

    public BigDecimal getAmountValue() {
        return this.amountValue;
    }

    public PromoCodes setAmountValue(BigDecimal amountValue) {
        this.amountValue = amountValue;
        return this;
    }

    public BigDecimal getPercentageCapAmount() {
        return this.percentageCapAmount;
    }

    public PromoCodes setPercentageCapAmount(BigDecimal percentageCapAmount) {
        this.percentageCapAmount = percentageCapAmount;
        return this;
    }

    public BigDecimal getMinimumRechargeAmount() {
        return this.minimumRechargeAmount;
    }

    public PromoCodes setMinimumRechargeAmount(BigDecimal minimumRechargeAmount) {
        this.minimumRechargeAmount = minimumRechargeAmount;
        return this;
    }

    public String getPreCondition() {
        return this.preCondition;
    }

    public PromoCodes setPreCondition(String preCondition) {
        this.preCondition = preCondition;
        return this;
    }

    public String getCapping() {
        return this.capping;
    }

    public PromoCodes setCapping(String capping) {
        this.capping = capping;
        return this;
    }

    public String getPickUpServiceRegion() {
        return this.pickUpServiceRegion;
    }

    public PromoCodes setPickUpServiceRegion(String pickUpServiceRegion) {
        this.pickUpServiceRegion = pickUpServiceRegion;
        return this;
    }

    public String getDropOffServiceRegion() {
        return this.dropOffServiceRegion;
    }

    public PromoCodes setDropOffServiceRegion(String dropOffServiceRegion) {
        this.dropOffServiceRegion = dropOffServiceRegion;
        return this;
    }

    public String getUserSegmentType() {
        return this.userSegmentType;
    }

    public PromoCodes setUserSegmentType(String userSegmentType) {
        this.userSegmentType = userSegmentType;
        return this;
    }

    public Byte getIsReleased() {
        return this.isReleased;
    }

    public PromoCodes setIsReleased(Byte isReleased) {
        this.isReleased = isReleased;
        return this;
    }

    public Byte getIsExclusive() {
        return this.isExclusive;
    }

    public PromoCodes setIsExclusive(Byte isExclusive) {
        this.isExclusive = isExclusive;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public PromoCodes setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public PromoCodes setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public PromoCodes setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public PromoCodes setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public PromoCodes setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Byte getIsVisible() {
        return this.isVisible;
    }

    public PromoCodes setIsVisible(Byte isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    public Byte getIsRecurringPackPromo() {
        return this.isRecurringPackPromo;
    }

    public PromoCodes setIsRecurringPackPromo(Byte isRecurringPackPromo) {
        this.isRecurringPackPromo = isRecurringPackPromo;
        return this;
    }

    public String getAllowedSource() {
        return this.allowedSource;
    }

    public PromoCodes setAllowedSource(String allowedSource) {
        this.allowedSource = allowedSource;
        return this;
    }

    public String getAllowedCategories() {
        return this.allowedCategories;
    }

    public PromoCodes setAllowedCategories(String allowedCategories) {
        this.allowedCategories = allowedCategories;
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
        final PromoCodes other = (PromoCodes) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (promoCode == null) {
            if (other.promoCode != null)
                return false;
        }
        else if (!promoCode.equals(other.promoCode))
            return false;
        if (validFromTimestamp == null) {
            if (other.validFromTimestamp != null)
                return false;
        }
        else if (!validFromTimestamp.equals(other.validFromTimestamp))
            return false;
        if (validToTimestamp == null) {
            if (other.validToTimestamp != null)
                return false;
        }
        else if (!validToTimestamp.equals(other.validToTimestamp))
            return false;
        if (applicableFromTimestamp == null) {
            if (other.applicableFromTimestamp != null)
                return false;
        }
        else if (!applicableFromTimestamp.equals(other.applicableFromTimestamp))
            return false;
        if (applicableToTimestamp == null) {
            if (other.applicableToTimestamp != null)
                return false;
        }
        else if (!applicableToTimestamp.equals(other.applicableToTimestamp))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (action == null) {
            if (other.action != null)
                return false;
        }
        else if (!action.equals(other.action))
            return false;
        if (trigger == null) {
            if (other.trigger != null)
                return false;
        }
        else if (!trigger.equals(other.trigger))
            return false;
        if (rideType == null) {
            if (other.rideType != null)
                return false;
        }
        else if (!rideType.equals(other.rideType))
            return false;
        if (rideCategory == null) {
            if (other.rideCategory != null)
                return false;
        }
        else if (!rideCategory.equals(other.rideCategory))
            return false;
        if (amountType == null) {
            if (other.amountType != null)
                return false;
        }
        else if (!amountType.equals(other.amountType))
            return false;
        if (amountValue == null) {
            if (other.amountValue != null)
                return false;
        }
        else if (!amountValue.equals(other.amountValue))
            return false;
        if (percentageCapAmount == null) {
            if (other.percentageCapAmount != null)
                return false;
        }
        else if (!percentageCapAmount.equals(other.percentageCapAmount))
            return false;
        if (minimumRechargeAmount == null) {
            if (other.minimumRechargeAmount != null)
                return false;
        }
        else if (!minimumRechargeAmount.equals(other.minimumRechargeAmount))
            return false;
        if (preCondition == null) {
            if (other.preCondition != null)
                return false;
        }
        else if (!preCondition.equals(other.preCondition))
            return false;
        if (capping == null) {
            if (other.capping != null)
                return false;
        }
        else if (!capping.equals(other.capping))
            return false;
        if (pickUpServiceRegion == null) {
            if (other.pickUpServiceRegion != null)
                return false;
        }
        else if (!pickUpServiceRegion.equals(other.pickUpServiceRegion))
            return false;
        if (dropOffServiceRegion == null) {
            if (other.dropOffServiceRegion != null)
                return false;
        }
        else if (!dropOffServiceRegion.equals(other.dropOffServiceRegion))
            return false;
        if (userSegmentType == null) {
            if (other.userSegmentType != null)
                return false;
        }
        else if (!userSegmentType.equals(other.userSegmentType))
            return false;
        if (isReleased == null) {
            if (other.isReleased != null)
                return false;
        }
        else if (!isReleased.equals(other.isReleased))
            return false;
        if (isExclusive == null) {
            if (other.isExclusive != null)
                return false;
        }
        else if (!isExclusive.equals(other.isExclusive))
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
        if (isVisible == null) {
            if (other.isVisible != null)
                return false;
        }
        else if (!isVisible.equals(other.isVisible))
            return false;
        if (isRecurringPackPromo == null) {
            if (other.isRecurringPackPromo != null)
                return false;
        }
        else if (!isRecurringPackPromo.equals(other.isRecurringPackPromo))
            return false;
        if (allowedSource == null) {
            if (other.allowedSource != null)
                return false;
        }
        else if (!allowedSource.equals(other.allowedSource))
            return false;
        if (allowedCategories == null) {
            if (other.allowedCategories != null)
                return false;
        }
        else if (!allowedCategories.equals(other.allowedCategories))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.promoCode == null) ? 0 : this.promoCode.hashCode());
        result = prime * result + ((this.validFromTimestamp == null) ? 0 : this.validFromTimestamp.hashCode());
        result = prime * result + ((this.validToTimestamp == null) ? 0 : this.validToTimestamp.hashCode());
        result = prime * result + ((this.applicableFromTimestamp == null) ? 0 : this.applicableFromTimestamp.hashCode());
        result = prime * result + ((this.applicableToTimestamp == null) ? 0 : this.applicableToTimestamp.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.action == null) ? 0 : this.action.hashCode());
        result = prime * result + ((this.trigger == null) ? 0 : this.trigger.hashCode());
        result = prime * result + ((this.rideType == null) ? 0 : this.rideType.hashCode());
        result = prime * result + ((this.rideCategory == null) ? 0 : this.rideCategory.hashCode());
        result = prime * result + ((this.amountType == null) ? 0 : this.amountType.hashCode());
        result = prime * result + ((this.amountValue == null) ? 0 : this.amountValue.hashCode());
        result = prime * result + ((this.percentageCapAmount == null) ? 0 : this.percentageCapAmount.hashCode());
        result = prime * result + ((this.minimumRechargeAmount == null) ? 0 : this.minimumRechargeAmount.hashCode());
        result = prime * result + ((this.preCondition == null) ? 0 : this.preCondition.hashCode());
        result = prime * result + ((this.capping == null) ? 0 : this.capping.hashCode());
        result = prime * result + ((this.pickUpServiceRegion == null) ? 0 : this.pickUpServiceRegion.hashCode());
        result = prime * result + ((this.dropOffServiceRegion == null) ? 0 : this.dropOffServiceRegion.hashCode());
        result = prime * result + ((this.userSegmentType == null) ? 0 : this.userSegmentType.hashCode());
        result = prime * result + ((this.isReleased == null) ? 0 : this.isReleased.hashCode());
        result = prime * result + ((this.isExclusive == null) ? 0 : this.isExclusive.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.isVisible == null) ? 0 : this.isVisible.hashCode());
        result = prime * result + ((this.isRecurringPackPromo == null) ? 0 : this.isRecurringPackPromo.hashCode());
        result = prime * result + ((this.allowedSource == null) ? 0 : this.allowedSource.hashCode());
        result = prime * result + ((this.allowedCategories == null) ? 0 : this.allowedCategories.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PromoCodes (");

        sb.append(id);
        sb.append(", ").append(promoCode);
        sb.append(", ").append(validFromTimestamp);
        sb.append(", ").append(validToTimestamp);
        sb.append(", ").append(applicableFromTimestamp);
        sb.append(", ").append(applicableToTimestamp);
        sb.append(", ").append(state);
        sb.append(", ").append(type);
        sb.append(", ").append(action);
        sb.append(", ").append(trigger);
        sb.append(", ").append(rideType);
        sb.append(", ").append(rideCategory);
        sb.append(", ").append(amountType);
        sb.append(", ").append(amountValue);
        sb.append(", ").append(percentageCapAmount);
        sb.append(", ").append(minimumRechargeAmount);
        sb.append(", ").append(preCondition);
        sb.append(", ").append(capping);
        sb.append(", ").append(pickUpServiceRegion);
        sb.append(", ").append(dropOffServiceRegion);
        sb.append(", ").append(userSegmentType);
        sb.append(", ").append(isReleased);
        sb.append(", ").append(isExclusive);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(isVisible);
        sb.append(", ").append(isRecurringPackPromo);
        sb.append(", ").append(allowedSource);
        sb.append(", ").append(allowedCategories);

        sb.append(")");
        return sb.toString();
    }
}
