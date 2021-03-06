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
public class PricingModel implements Serializable {

    private static final long serialVersionUID = 127830970;

    private Integer    id;
    private String     type;
    private String     formula;
    private BigDecimal amount;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private String     businessAccountCode;
    private BigDecimal waitingFeePerMinute;
    private BigDecimal noShowFee;
    private BigDecimal cancellationFee;
    private BigDecimal extraSlabFare;
    private BigDecimal slabDistance;
    private String     slabsPrice;
    private String     state;
    private String     pricingModelName;
    private UInteger   noOfPitStops;
    private UInteger   priority;
    private String     pickUpRegion;
    private String     dropRegion;
    private String     locationData;
    private String     category;

    public PricingModel() {}

    public PricingModel(PricingModel value) {
        this.id = value.id;
        this.type = value.type;
        this.formula = value.formula;
        this.amount = value.amount;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.businessAccountCode = value.businessAccountCode;
        this.waitingFeePerMinute = value.waitingFeePerMinute;
        this.noShowFee = value.noShowFee;
        this.cancellationFee = value.cancellationFee;
        this.extraSlabFare = value.extraSlabFare;
        this.slabDistance = value.slabDistance;
        this.slabsPrice = value.slabsPrice;
        this.state = value.state;
        this.pricingModelName = value.pricingModelName;
        this.noOfPitStops = value.noOfPitStops;
        this.priority = value.priority;
        this.pickUpRegion = value.pickUpRegion;
        this.dropRegion = value.dropRegion;
        this.locationData = value.locationData;
        this.category = value.category;
    }

    public PricingModel(
        Integer    id,
        String     type,
        String     formula,
        BigDecimal amount,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        String     businessAccountCode,
        BigDecimal waitingFeePerMinute,
        BigDecimal noShowFee,
        BigDecimal cancellationFee,
        BigDecimal extraSlabFare,
        BigDecimal slabDistance,
        String     slabsPrice,
        String     state,
        String     pricingModelName,
        UInteger   noOfPitStops,
        UInteger   priority,
        String     pickUpRegion,
        String     dropRegion,
        String     locationData,
        String     category
    ) {
        this.id = id;
        this.type = type;
        this.formula = formula;
        this.amount = amount;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.businessAccountCode = businessAccountCode;
        this.waitingFeePerMinute = waitingFeePerMinute;
        this.noShowFee = noShowFee;
        this.cancellationFee = cancellationFee;
        this.extraSlabFare = extraSlabFare;
        this.slabDistance = slabDistance;
        this.slabsPrice = slabsPrice;
        this.state = state;
        this.pricingModelName = pricingModelName;
        this.noOfPitStops = noOfPitStops;
        this.priority = priority;
        this.pickUpRegion = pickUpRegion;
        this.dropRegion = dropRegion;
        this.locationData = locationData;
        this.category = category;
    }

    public Integer getId() {
        return this.id;
    }

    public PricingModel setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public PricingModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getFormula() {
        return this.formula;
    }

    public PricingModel setFormula(String formula) {
        this.formula = formula;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public PricingModel setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public PricingModel setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public PricingModel setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public PricingModel setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public PricingModel setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public PricingModel setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getBusinessAccountCode() {
        return this.businessAccountCode;
    }

    public PricingModel setBusinessAccountCode(String businessAccountCode) {
        this.businessAccountCode = businessAccountCode;
        return this;
    }

    public BigDecimal getWaitingFeePerMinute() {
        return this.waitingFeePerMinute;
    }

    public PricingModel setWaitingFeePerMinute(BigDecimal waitingFeePerMinute) {
        this.waitingFeePerMinute = waitingFeePerMinute;
        return this;
    }

    public BigDecimal getNoShowFee() {
        return this.noShowFee;
    }

    public PricingModel setNoShowFee(BigDecimal noShowFee) {
        this.noShowFee = noShowFee;
        return this;
    }

    public BigDecimal getCancellationFee() {
        return this.cancellationFee;
    }

    public PricingModel setCancellationFee(BigDecimal cancellationFee) {
        this.cancellationFee = cancellationFee;
        return this;
    }

    public BigDecimal getExtraSlabFare() {
        return this.extraSlabFare;
    }

    public PricingModel setExtraSlabFare(BigDecimal extraSlabFare) {
        this.extraSlabFare = extraSlabFare;
        return this;
    }

    public BigDecimal getSlabDistance() {
        return this.slabDistance;
    }

    public PricingModel setSlabDistance(BigDecimal slabDistance) {
        this.slabDistance = slabDistance;
        return this;
    }

    public String getSlabsPrice() {
        return this.slabsPrice;
    }

    public PricingModel setSlabsPrice(String slabsPrice) {
        this.slabsPrice = slabsPrice;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public PricingModel setState(String state) {
        this.state = state;
        return this;
    }

    public String getPricingModelName() {
        return this.pricingModelName;
    }

    public PricingModel setPricingModelName(String pricingModelName) {
        this.pricingModelName = pricingModelName;
        return this;
    }

    public UInteger getNoOfPitStops() {
        return this.noOfPitStops;
    }

    public PricingModel setNoOfPitStops(UInteger noOfPitStops) {
        this.noOfPitStops = noOfPitStops;
        return this;
    }

    public UInteger getPriority() {
        return this.priority;
    }

    public PricingModel setPriority(UInteger priority) {
        this.priority = priority;
        return this;
    }

    public String getPickUpRegion() {
        return this.pickUpRegion;
    }

    public PricingModel setPickUpRegion(String pickUpRegion) {
        this.pickUpRegion = pickUpRegion;
        return this;
    }

    public String getDropRegion() {
        return this.dropRegion;
    }

    public PricingModel setDropRegion(String dropRegion) {
        this.dropRegion = dropRegion;
        return this;
    }

    public String getLocationData() {
        return this.locationData;
    }

    public PricingModel setLocationData(String locationData) {
        this.locationData = locationData;
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public PricingModel setCategory(String category) {
        this.category = category;
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
        final PricingModel other = (PricingModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (formula == null) {
            if (other.formula != null)
                return false;
        }
        else if (!formula.equals(other.formula))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
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
        if (businessAccountCode == null) {
            if (other.businessAccountCode != null)
                return false;
        }
        else if (!businessAccountCode.equals(other.businessAccountCode))
            return false;
        if (waitingFeePerMinute == null) {
            if (other.waitingFeePerMinute != null)
                return false;
        }
        else if (!waitingFeePerMinute.equals(other.waitingFeePerMinute))
            return false;
        if (noShowFee == null) {
            if (other.noShowFee != null)
                return false;
        }
        else if (!noShowFee.equals(other.noShowFee))
            return false;
        if (cancellationFee == null) {
            if (other.cancellationFee != null)
                return false;
        }
        else if (!cancellationFee.equals(other.cancellationFee))
            return false;
        if (extraSlabFare == null) {
            if (other.extraSlabFare != null)
                return false;
        }
        else if (!extraSlabFare.equals(other.extraSlabFare))
            return false;
        if (slabDistance == null) {
            if (other.slabDistance != null)
                return false;
        }
        else if (!slabDistance.equals(other.slabDistance))
            return false;
        if (slabsPrice == null) {
            if (other.slabsPrice != null)
                return false;
        }
        else if (!slabsPrice.equals(other.slabsPrice))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
            return false;
        if (pricingModelName == null) {
            if (other.pricingModelName != null)
                return false;
        }
        else if (!pricingModelName.equals(other.pricingModelName))
            return false;
        if (noOfPitStops == null) {
            if (other.noOfPitStops != null)
                return false;
        }
        else if (!noOfPitStops.equals(other.noOfPitStops))
            return false;
        if (priority == null) {
            if (other.priority != null)
                return false;
        }
        else if (!priority.equals(other.priority))
            return false;
        if (pickUpRegion == null) {
            if (other.pickUpRegion != null)
                return false;
        }
        else if (!pickUpRegion.equals(other.pickUpRegion))
            return false;
        if (dropRegion == null) {
            if (other.dropRegion != null)
                return false;
        }
        else if (!dropRegion.equals(other.dropRegion))
            return false;
        if (locationData == null) {
            if (other.locationData != null)
                return false;
        }
        else if (!locationData.equals(other.locationData))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        }
        else if (!category.equals(other.category))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.formula == null) ? 0 : this.formula.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.businessAccountCode == null) ? 0 : this.businessAccountCode.hashCode());
        result = prime * result + ((this.waitingFeePerMinute == null) ? 0 : this.waitingFeePerMinute.hashCode());
        result = prime * result + ((this.noShowFee == null) ? 0 : this.noShowFee.hashCode());
        result = prime * result + ((this.cancellationFee == null) ? 0 : this.cancellationFee.hashCode());
        result = prime * result + ((this.extraSlabFare == null) ? 0 : this.extraSlabFare.hashCode());
        result = prime * result + ((this.slabDistance == null) ? 0 : this.slabDistance.hashCode());
        result = prime * result + ((this.slabsPrice == null) ? 0 : this.slabsPrice.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.pricingModelName == null) ? 0 : this.pricingModelName.hashCode());
        result = prime * result + ((this.noOfPitStops == null) ? 0 : this.noOfPitStops.hashCode());
        result = prime * result + ((this.priority == null) ? 0 : this.priority.hashCode());
        result = prime * result + ((this.pickUpRegion == null) ? 0 : this.pickUpRegion.hashCode());
        result = prime * result + ((this.dropRegion == null) ? 0 : this.dropRegion.hashCode());
        result = prime * result + ((this.locationData == null) ? 0 : this.locationData.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PricingModel (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(formula);
        sb.append(", ").append(amount);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(businessAccountCode);
        sb.append(", ").append(waitingFeePerMinute);
        sb.append(", ").append(noShowFee);
        sb.append(", ").append(cancellationFee);
        sb.append(", ").append(extraSlabFare);
        sb.append(", ").append(slabDistance);
        sb.append(", ").append(slabsPrice);
        sb.append(", ").append(state);
        sb.append(", ").append(pricingModelName);
        sb.append(", ").append(noOfPitStops);
        sb.append(", ").append(priority);
        sb.append(", ").append(pickUpRegion);
        sb.append(", ").append(dropRegion);
        sb.append(", ").append(locationData);
        sb.append(", ").append(category);

        sb.append(")");
        return sb.toString();
    }
}
