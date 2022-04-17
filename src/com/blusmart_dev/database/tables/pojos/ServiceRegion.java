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
public class ServiceRegion implements Serializable {

    private static final long serialVersionUID = -134062746;

    private Integer  id;
    private String   serviceRegionName;
    private UInteger boundId;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private String   otherFlags;

    public ServiceRegion() {}

    public ServiceRegion(ServiceRegion value) {
        this.id = value.id;
        this.serviceRegionName = value.serviceRegionName;
        this.boundId = value.boundId;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.otherFlags = value.otherFlags;
    }

    public ServiceRegion(
        Integer  id,
        String   serviceRegionName,
        UInteger boundId,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        String   otherFlags
    ) {
        this.id = id;
        this.serviceRegionName = serviceRegionName;
        this.boundId = boundId;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.otherFlags = otherFlags;
    }

    public Integer getId() {
        return this.id;
    }

    public ServiceRegion setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getServiceRegionName() {
        return this.serviceRegionName;
    }

    public ServiceRegion setServiceRegionName(String serviceRegionName) {
        this.serviceRegionName = serviceRegionName;
        return this;
    }

    public UInteger getBoundId() {
        return this.boundId;
    }

    public ServiceRegion setBoundId(UInteger boundId) {
        this.boundId = boundId;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public ServiceRegion setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public ServiceRegion setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public ServiceRegion setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public ServiceRegion setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public ServiceRegion setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getOtherFlags() {
        return this.otherFlags;
    }

    public ServiceRegion setOtherFlags(String otherFlags) {
        this.otherFlags = otherFlags;
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
        final ServiceRegion other = (ServiceRegion) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (serviceRegionName == null) {
            if (other.serviceRegionName != null)
                return false;
        }
        else if (!serviceRegionName.equals(other.serviceRegionName))
            return false;
        if (boundId == null) {
            if (other.boundId != null)
                return false;
        }
        else if (!boundId.equals(other.boundId))
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
        if (otherFlags == null) {
            if (other.otherFlags != null)
                return false;
        }
        else if (!otherFlags.equals(other.otherFlags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.serviceRegionName == null) ? 0 : this.serviceRegionName.hashCode());
        result = prime * result + ((this.boundId == null) ? 0 : this.boundId.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.otherFlags == null) ? 0 : this.otherFlags.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ServiceRegion (");

        sb.append(id);
        sb.append(", ").append(serviceRegionName);
        sb.append(", ").append(boundId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(otherFlags);

        sb.append(")");
        return sb.toString();
    }
}