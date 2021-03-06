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
public class LeaseSkipDatesAud implements Serializable {

    private static final long serialVersionUID = 1960739048;

    private UInteger audId;
    private UInteger id;
    private Long     date;
    private Integer  availableQuota;
    private UInteger maxQuota;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;
    private UInteger hubId;
    private String   dutyType;

    public LeaseSkipDatesAud() {}

    public LeaseSkipDatesAud(LeaseSkipDatesAud value) {
        this.audId = value.audId;
        this.id = value.id;
        this.date = value.date;
        this.availableQuota = value.availableQuota;
        this.maxQuota = value.maxQuota;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.hubId = value.hubId;
        this.dutyType = value.dutyType;
    }

    public LeaseSkipDatesAud(
        UInteger audId,
        UInteger id,
        Long     date,
        Integer  availableQuota,
        UInteger maxQuota,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt,
        UInteger hubId,
        String   dutyType
    ) {
        this.audId = audId;
        this.id = id;
        this.date = date;
        this.availableQuota = availableQuota;
        this.maxQuota = maxQuota;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
        this.hubId = hubId;
        this.dutyType = dutyType;
    }

    public UInteger getAudId() {
        return this.audId;
    }

    public LeaseSkipDatesAud setAudId(UInteger audId) {
        this.audId = audId;
        return this;
    }

    public UInteger getId() {
        return this.id;
    }

    public LeaseSkipDatesAud setId(UInteger id) {
        this.id = id;
        return this;
    }

    public Long getDate() {
        return this.date;
    }

    public LeaseSkipDatesAud setDate(Long date) {
        this.date = date;
        return this;
    }

    public Integer getAvailableQuota() {
        return this.availableQuota;
    }

    public LeaseSkipDatesAud setAvailableQuota(Integer availableQuota) {
        this.availableQuota = availableQuota;
        return this;
    }

    public UInteger getMaxQuota() {
        return this.maxQuota;
    }

    public LeaseSkipDatesAud setMaxQuota(UInteger maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public LeaseSkipDatesAud setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public LeaseSkipDatesAud setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public LeaseSkipDatesAud setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public LeaseSkipDatesAud setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public LeaseSkipDatesAud setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public UInteger getHubId() {
        return this.hubId;
    }

    public LeaseSkipDatesAud setHubId(UInteger hubId) {
        this.hubId = hubId;
        return this;
    }

    public String getDutyType() {
        return this.dutyType;
    }

    public LeaseSkipDatesAud setDutyType(String dutyType) {
        this.dutyType = dutyType;
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
        final LeaseSkipDatesAud other = (LeaseSkipDatesAud) obj;
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
        if (date == null) {
            if (other.date != null)
                return false;
        }
        else if (!date.equals(other.date))
            return false;
        if (availableQuota == null) {
            if (other.availableQuota != null)
                return false;
        }
        else if (!availableQuota.equals(other.availableQuota))
            return false;
        if (maxQuota == null) {
            if (other.maxQuota != null)
                return false;
        }
        else if (!maxQuota.equals(other.maxQuota))
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
        if (dutyType == null) {
            if (other.dutyType != null)
                return false;
        }
        else if (!dutyType.equals(other.dutyType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.audId == null) ? 0 : this.audId.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
        result = prime * result + ((this.availableQuota == null) ? 0 : this.availableQuota.hashCode());
        result = prime * result + ((this.maxQuota == null) ? 0 : this.maxQuota.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.hubId == null) ? 0 : this.hubId.hashCode());
        result = prime * result + ((this.dutyType == null) ? 0 : this.dutyType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeaseSkipDatesAud (");

        sb.append(audId);
        sb.append(", ").append(id);
        sb.append(", ").append(date);
        sb.append(", ").append(availableQuota);
        sb.append(", ").append(maxQuota);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(hubId);
        sb.append(", ").append(dutyType);

        sb.append(")");
        return sb.toString();
    }
}
