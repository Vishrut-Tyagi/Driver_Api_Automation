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
public class BusinessWalletBalance implements Serializable {

    private static final long serialVersionUID = 2123553272;

    private UInteger   id;
    private UInteger   businessAccountId;
    private BigDecimal currentBalance;
    private String     note;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;

    public BusinessWalletBalance() {}

    public BusinessWalletBalance(BusinessWalletBalance value) {
        this.id = value.id;
        this.businessAccountId = value.businessAccountId;
        this.currentBalance = value.currentBalance;
        this.note = value.note;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
    }

    public BusinessWalletBalance(
        UInteger   id,
        UInteger   businessAccountId,
        BigDecimal currentBalance,
        String     note,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy
    ) {
        this.id = id;
        this.businessAccountId = businessAccountId;
        this.currentBalance = currentBalance;
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

    public BusinessWalletBalance setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getBusinessAccountId() {
        return this.businessAccountId;
    }

    public BusinessWalletBalance setBusinessAccountId(UInteger businessAccountId) {
        this.businessAccountId = businessAccountId;
        return this;
    }

    public BigDecimal getCurrentBalance() {
        return this.currentBalance;
    }

    public BusinessWalletBalance setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public BusinessWalletBalance setNote(String note) {
        this.note = note;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public BusinessWalletBalance setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public BusinessWalletBalance setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public BusinessWalletBalance setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public BusinessWalletBalance setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public BusinessWalletBalance setLastUpdatedBy(UInteger lastUpdatedBy) {
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
        final BusinessWalletBalance other = (BusinessWalletBalance) obj;
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
        if (currentBalance == null) {
            if (other.currentBalance != null)
                return false;
        }
        else if (!currentBalance.equals(other.currentBalance))
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
        result = prime * result + ((this.currentBalance == null) ? 0 : this.currentBalance.hashCode());
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
        StringBuilder sb = new StringBuilder("BusinessWalletBalance (");

        sb.append(id);
        sb.append(", ").append(businessAccountId);
        sb.append(", ").append(currentBalance);
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
