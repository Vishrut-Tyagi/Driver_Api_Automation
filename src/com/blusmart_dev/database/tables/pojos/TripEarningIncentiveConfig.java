/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This Table is used to configure the trip earning incentives for drivers. 
 * you can add multiple earnings limit slots for a particular package.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TripEarningIncentiveConfig implements Serializable {

    private static final long serialVersionUID = 1095068697;

    private Integer    id;
    private String     modelName;
    private Integer    earningLimit;
    private BigDecimal incentive;
    private Long       createdAt;
    private Long       lastUpdatedAt;
    private Byte       isActive;
    private Integer    createdBy;
    private Integer    lastUpdatedBy;
    private String     createdByUser;

    public TripEarningIncentiveConfig() {}

    public TripEarningIncentiveConfig(TripEarningIncentiveConfig value) {
        this.id = value.id;
        this.modelName = value.modelName;
        this.earningLimit = value.earningLimit;
        this.incentive = value.incentive;
        this.createdAt = value.createdAt;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.createdByUser = value.createdByUser;
    }

    public TripEarningIncentiveConfig(
        Integer    id,
        String     modelName,
        Integer    earningLimit,
        BigDecimal incentive,
        Long       createdAt,
        Long       lastUpdatedAt,
        Byte       isActive,
        Integer    createdBy,
        Integer    lastUpdatedBy,
        String     createdByUser
    ) {
        this.id = id;
        this.modelName = modelName;
        this.earningLimit = earningLimit;
        this.incentive = incentive;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.createdByUser = createdByUser;
    }

    public Integer getId() {
        return this.id;
    }

    public TripEarningIncentiveConfig setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getModelName() {
        return this.modelName;
    }

    public TripEarningIncentiveConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public Integer getEarningLimit() {
        return this.earningLimit;
    }

    public TripEarningIncentiveConfig setEarningLimit(Integer earningLimit) {
        this.earningLimit = earningLimit;
        return this;
    }

    public BigDecimal getIncentive() {
        return this.incentive;
    }

    public TripEarningIncentiveConfig setIncentive(BigDecimal incentive) {
        this.incentive = incentive;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public TripEarningIncentiveConfig setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public TripEarningIncentiveConfig setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public TripEarningIncentiveConfig setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public TripEarningIncentiveConfig setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public TripEarningIncentiveConfig setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getCreatedByUser() {
        return this.createdByUser;
    }

    public TripEarningIncentiveConfig setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
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
        final TripEarningIncentiveConfig other = (TripEarningIncentiveConfig) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (modelName == null) {
            if (other.modelName != null)
                return false;
        }
        else if (!modelName.equals(other.modelName))
            return false;
        if (earningLimit == null) {
            if (other.earningLimit != null)
                return false;
        }
        else if (!earningLimit.equals(other.earningLimit))
            return false;
        if (incentive == null) {
            if (other.incentive != null)
                return false;
        }
        else if (!incentive.equals(other.incentive))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (lastUpdatedAt == null) {
            if (other.lastUpdatedAt != null)
                return false;
        }
        else if (!lastUpdatedAt.equals(other.lastUpdatedAt))
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
        if (createdByUser == null) {
            if (other.createdByUser != null)
                return false;
        }
        else if (!createdByUser.equals(other.createdByUser))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.modelName == null) ? 0 : this.modelName.hashCode());
        result = prime * result + ((this.earningLimit == null) ? 0 : this.earningLimit.hashCode());
        result = prime * result + ((this.incentive == null) ? 0 : this.incentive.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.createdByUser == null) ? 0 : this.createdByUser.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TripEarningIncentiveConfig (");

        sb.append(id);
        sb.append(", ").append(modelName);
        sb.append(", ").append(earningLimit);
        sb.append(", ").append(incentive);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(createdByUser);

        sb.append(")");
        return sb.toString();
    }
}
