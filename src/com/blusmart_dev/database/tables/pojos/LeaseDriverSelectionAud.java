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
public class LeaseDriverSelectionAud implements Serializable {

    private static final long serialVersionUID = 197283883;

    private UInteger audId;
    private UInteger id;
    private UInteger driverId;
    private UInteger leaseId;
    private String   state;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;
    private UInteger hubId;
    private String   lmpCombinationId;

    public LeaseDriverSelectionAud() {}

    public LeaseDriverSelectionAud(LeaseDriverSelectionAud value) {
        this.audId = value.audId;
        this.id = value.id;
        this.driverId = value.driverId;
        this.leaseId = value.leaseId;
        this.state = value.state;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.hubId = value.hubId;
        this.lmpCombinationId = value.lmpCombinationId;
    }

    public LeaseDriverSelectionAud(
        UInteger audId,
        UInteger id,
        UInteger driverId,
        UInteger leaseId,
        String   state,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt,
        UInteger hubId,
        String   lmpCombinationId
    ) {
        this.audId = audId;
        this.id = id;
        this.driverId = driverId;
        this.leaseId = leaseId;
        this.state = state;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
        this.hubId = hubId;
        this.lmpCombinationId = lmpCombinationId;
    }

    public UInteger getAudId() {
        return this.audId;
    }

    public LeaseDriverSelectionAud setAudId(UInteger audId) {
        this.audId = audId;
        return this;
    }

    public UInteger getId() {
        return this.id;
    }

    public LeaseDriverSelectionAud setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getDriverId() {
        return this.driverId;
    }

    public LeaseDriverSelectionAud setDriverId(UInteger driverId) {
        this.driverId = driverId;
        return this;
    }

    public UInteger getLeaseId() {
        return this.leaseId;
    }

    public LeaseDriverSelectionAud setLeaseId(UInteger leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public LeaseDriverSelectionAud setState(String state) {
        this.state = state;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public LeaseDriverSelectionAud setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public LeaseDriverSelectionAud setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public LeaseDriverSelectionAud setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public LeaseDriverSelectionAud setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public LeaseDriverSelectionAud setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public UInteger getHubId() {
        return this.hubId;
    }

    public LeaseDriverSelectionAud setHubId(UInteger hubId) {
        this.hubId = hubId;
        return this;
    }

    public String getLmpCombinationId() {
        return this.lmpCombinationId;
    }

    public LeaseDriverSelectionAud setLmpCombinationId(String lmpCombinationId) {
        this.lmpCombinationId = lmpCombinationId;
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
        final LeaseDriverSelectionAud other = (LeaseDriverSelectionAud) obj;
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
        if (driverId == null) {
            if (other.driverId != null)
                return false;
        }
        else if (!driverId.equals(other.driverId))
            return false;
        if (leaseId == null) {
            if (other.leaseId != null)
                return false;
        }
        else if (!leaseId.equals(other.leaseId))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        }
        else if (!state.equals(other.state))
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
        if (hubId == null) {
            if (other.hubId != null)
                return false;
        }
        else if (!hubId.equals(other.hubId))
            return false;
        if (lmpCombinationId == null) {
            if (other.lmpCombinationId != null)
                return false;
        }
        else if (!lmpCombinationId.equals(other.lmpCombinationId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.audId == null) ? 0 : this.audId.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.driverId == null) ? 0 : this.driverId.hashCode());
        result = prime * result + ((this.leaseId == null) ? 0 : this.leaseId.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.hubId == null) ? 0 : this.hubId.hashCode());
        result = prime * result + ((this.lmpCombinationId == null) ? 0 : this.lmpCombinationId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeaseDriverSelectionAud (");

        sb.append(audId);
        sb.append(", ").append(id);
        sb.append(", ").append(driverId);
        sb.append(", ").append(leaseId);
        sb.append(", ").append(state);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(hubId);
        sb.append(", ").append(lmpCombinationId);

        sb.append(")");
        return sb.toString();
    }
}
