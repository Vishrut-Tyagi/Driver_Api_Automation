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
public class WalletBalanceAud implements Serializable {

    private static final long serialVersionUID = -964732065;

    private UInteger   audId;
    private UInteger   id;
    private UInteger   riderId;
    private BigDecimal currentBalance;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private BigDecimal promotionalCreditsBalance;
    private BigDecimal promotionalCreditsUsed;

    public WalletBalanceAud() {}

    public WalletBalanceAud(WalletBalanceAud value) {
        this.audId = value.audId;
        this.id = value.id;
        this.riderId = value.riderId;
        this.currentBalance = value.currentBalance;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.promotionalCreditsBalance = value.promotionalCreditsBalance;
        this.promotionalCreditsUsed = value.promotionalCreditsUsed;
    }

    public WalletBalanceAud(
        UInteger   audId,
        UInteger   id,
        UInteger   riderId,
        BigDecimal currentBalance,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        BigDecimal promotionalCreditsBalance,
        BigDecimal promotionalCreditsUsed
    ) {
        this.audId = audId;
        this.id = id;
        this.riderId = riderId;
        this.currentBalance = currentBalance;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.promotionalCreditsBalance = promotionalCreditsBalance;
        this.promotionalCreditsUsed = promotionalCreditsUsed;
    }

    public UInteger getAudId() {
        return this.audId;
    }

    public WalletBalanceAud setAudId(UInteger audId) {
        this.audId = audId;
        return this;
    }

    public UInteger getId() {
        return this.id;
    }

    public WalletBalanceAud setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public WalletBalanceAud setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public WalletBalanceAud setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public WalletBalanceAud setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public WalletBalanceAud setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public WalletBalanceAud setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public WalletBalanceAud setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public WalletBalanceAud setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public BigDecimal getPromotionalCreditsBalance() {
        return this.promotionalCreditsBalance;
    }

    public WalletBalanceAud setPromotionalCreditsBalance(BigDecimal promotionalCreditsBalance) {
        this.promotionalCreditsBalance = promotionalCreditsBalance;
        return this;
    }

    public BigDecimal getPromotionalCreditsUsed() {
        return this.promotionalCreditsUsed;
    }

    public WalletBalanceAud setPromotionalCreditsUsed(BigDecimal promotionalCreditsUsed) {
        this.promotionalCreditsUsed = promotionalCreditsUsed;
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
        final WalletBalanceAud other = (WalletBalanceAud) obj;
        if (audId == null) {
            if (other.audId != null)
                return false;
        }
        else if (!audId.equals(other.audId))
            return false;
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
        if (currentBalance == null) {
            if (other.currentBalance != null)
                return false;
        }
        else if (!currentBalance.equals(other.currentBalance))
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
        if (promotionalCreditsBalance == null) {
            if (other.promotionalCreditsBalance != null)
                return false;
        }
        else if (!promotionalCreditsBalance.equals(other.promotionalCreditsBalance))
            return false;
        if (promotionalCreditsUsed == null) {
            if (other.promotionalCreditsUsed != null)
                return false;
        }
        else if (!promotionalCreditsUsed.equals(other.promotionalCreditsUsed))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.audId == null) ? 0 : this.audId.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.currentBalance == null) ? 0 : this.currentBalance.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.promotionalCreditsBalance == null) ? 0 : this.promotionalCreditsBalance.hashCode());
        result = prime * result + ((this.promotionalCreditsUsed == null) ? 0 : this.promotionalCreditsUsed.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WalletBalanceAud (");

        sb.append(audId);
        sb.append(", ").append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(currentBalance);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(promotionalCreditsBalance);
        sb.append(", ").append(promotionalCreditsUsed);

        sb.append(")");
        return sb.toString();
    }
}
