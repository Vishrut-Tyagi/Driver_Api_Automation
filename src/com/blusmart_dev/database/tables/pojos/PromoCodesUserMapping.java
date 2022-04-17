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
public class PromoCodesUserMapping implements Serializable {

    private static final long serialVersionUID = 200884985;

    private UInteger   id;
    private UInteger   riderId;
    private String     promoCode;
    private UInteger   numberOfRides;
    private BigDecimal amountOfSavings;
    private String     breakup;
    private Long       exclusiveExpiryTimestamp;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private Long       exclusiveStartTimestamp;

    public PromoCodesUserMapping() {}

    public PromoCodesUserMapping(PromoCodesUserMapping value) {
        this.id = value.id;
        this.riderId = value.riderId;
        this.promoCode = value.promoCode;
        this.numberOfRides = value.numberOfRides;
        this.amountOfSavings = value.amountOfSavings;
        this.breakup = value.breakup;
        this.exclusiveExpiryTimestamp = value.exclusiveExpiryTimestamp;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.exclusiveStartTimestamp = value.exclusiveStartTimestamp;
    }

    public PromoCodesUserMapping(
        UInteger   id,
        UInteger   riderId,
        String     promoCode,
        UInteger   numberOfRides,
        BigDecimal amountOfSavings,
        String     breakup,
        Long       exclusiveExpiryTimestamp,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        Long       exclusiveStartTimestamp
    ) {
        this.id = id;
        this.riderId = riderId;
        this.promoCode = promoCode;
        this.numberOfRides = numberOfRides;
        this.amountOfSavings = amountOfSavings;
        this.breakup = breakup;
        this.exclusiveExpiryTimestamp = exclusiveExpiryTimestamp;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.exclusiveStartTimestamp = exclusiveStartTimestamp;
    }

    public UInteger getId() {
        return this.id;
    }

    public PromoCodesUserMapping setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public PromoCodesUserMapping setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public PromoCodesUserMapping setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public UInteger getNumberOfRides() {
        return this.numberOfRides;
    }

    public PromoCodesUserMapping setNumberOfRides(UInteger numberOfRides) {
        this.numberOfRides = numberOfRides;
        return this;
    }

    public BigDecimal getAmountOfSavings() {
        return this.amountOfSavings;
    }

    public PromoCodesUserMapping setAmountOfSavings(BigDecimal amountOfSavings) {
        this.amountOfSavings = amountOfSavings;
        return this;
    }

    public String getBreakup() {
        return this.breakup;
    }

    public PromoCodesUserMapping setBreakup(String breakup) {
        this.breakup = breakup;
        return this;
    }

    public Long getExclusiveExpiryTimestamp() {
        return this.exclusiveExpiryTimestamp;
    }

    public PromoCodesUserMapping setExclusiveExpiryTimestamp(Long exclusiveExpiryTimestamp) {
        this.exclusiveExpiryTimestamp = exclusiveExpiryTimestamp;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public PromoCodesUserMapping setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public PromoCodesUserMapping setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public PromoCodesUserMapping setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public PromoCodesUserMapping setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public PromoCodesUserMapping setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getExclusiveStartTimestamp() {
        return this.exclusiveStartTimestamp;
    }

    public PromoCodesUserMapping setExclusiveStartTimestamp(Long exclusiveStartTimestamp) {
        this.exclusiveStartTimestamp = exclusiveStartTimestamp;
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
        final PromoCodesUserMapping other = (PromoCodesUserMapping) obj;
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
        if (promoCode == null) {
            if (other.promoCode != null)
                return false;
        }
        else if (!promoCode.equals(other.promoCode))
            return false;
        if (numberOfRides == null) {
            if (other.numberOfRides != null)
                return false;
        }
        else if (!numberOfRides.equals(other.numberOfRides))
            return false;
        if (amountOfSavings == null) {
            if (other.amountOfSavings != null)
                return false;
        }
        else if (!amountOfSavings.equals(other.amountOfSavings))
            return false;
        if (breakup == null) {
            if (other.breakup != null)
                return false;
        }
        else if (!breakup.equals(other.breakup))
            return false;
        if (exclusiveExpiryTimestamp == null) {
            if (other.exclusiveExpiryTimestamp != null)
                return false;
        }
        else if (!exclusiveExpiryTimestamp.equals(other.exclusiveExpiryTimestamp))
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
        if (exclusiveStartTimestamp == null) {
            if (other.exclusiveStartTimestamp != null)
                return false;
        }
        else if (!exclusiveStartTimestamp.equals(other.exclusiveStartTimestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.promoCode == null) ? 0 : this.promoCode.hashCode());
        result = prime * result + ((this.numberOfRides == null) ? 0 : this.numberOfRides.hashCode());
        result = prime * result + ((this.amountOfSavings == null) ? 0 : this.amountOfSavings.hashCode());
        result = prime * result + ((this.breakup == null) ? 0 : this.breakup.hashCode());
        result = prime * result + ((this.exclusiveExpiryTimestamp == null) ? 0 : this.exclusiveExpiryTimestamp.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.exclusiveStartTimestamp == null) ? 0 : this.exclusiveStartTimestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PromoCodesUserMapping (");

        sb.append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(promoCode);
        sb.append(", ").append(numberOfRides);
        sb.append(", ").append(amountOfSavings);
        sb.append(", ").append(breakup);
        sb.append(", ").append(exclusiveExpiryTimestamp);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(exclusiveStartTimestamp);

        sb.append(")");
        return sb.toString();
    }
}