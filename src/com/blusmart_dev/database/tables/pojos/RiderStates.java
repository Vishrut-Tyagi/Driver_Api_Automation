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
public class RiderStates implements Serializable {

    private static final long serialVersionUID = 1600443436;

    private UInteger   id;
    private UInteger   riderId;
    private String     riderState;
    private UInteger   serviceRegionId;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private UInteger   rideRequestId;
    private UInteger   rideId;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public RiderStates() {}

    public RiderStates(RiderStates value) {
        this.id = value.id;
        this.riderId = value.riderId;
        this.riderState = value.riderState;
        this.serviceRegionId = value.serviceRegionId;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.rideRequestId = value.rideRequestId;
        this.rideId = value.rideId;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
    }

    public RiderStates(
        UInteger   id,
        UInteger   riderId,
        String     riderState,
        UInteger   serviceRegionId,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        UInteger   rideRequestId,
        UInteger   rideId,
        BigDecimal latitude,
        BigDecimal longitude
    ) {
        this.id = id;
        this.riderId = riderId;
        this.riderState = riderState;
        this.serviceRegionId = serviceRegionId;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.rideRequestId = rideRequestId;
        this.rideId = rideId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public UInteger getId() {
        return this.id;
    }

    public RiderStates setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public RiderStates setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public String getRiderState() {
        return this.riderState;
    }

    public RiderStates setRiderState(String riderState) {
        this.riderState = riderState;
        return this;
    }

    public UInteger getServiceRegionId() {
        return this.serviceRegionId;
    }

    public RiderStates setServiceRegionId(UInteger serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public RiderStates setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public RiderStates setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public RiderStates setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public RiderStates setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public RiderStates setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public UInteger getRideRequestId() {
        return this.rideRequestId;
    }

    public RiderStates setRideRequestId(UInteger rideRequestId) {
        this.rideRequestId = rideRequestId;
        return this;
    }

    public UInteger getRideId() {
        return this.rideId;
    }

    public RiderStates setRideId(UInteger rideId) {
        this.rideId = rideId;
        return this;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public RiderStates setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public RiderStates setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
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
        final RiderStates other = (RiderStates) obj;
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
        if (riderState == null) {
            if (other.riderState != null)
                return false;
        }
        else if (!riderState.equals(other.riderState))
            return false;
        if (serviceRegionId == null) {
            if (other.serviceRegionId != null)
                return false;
        }
        else if (!serviceRegionId.equals(other.serviceRegionId))
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
        if (rideRequestId == null) {
            if (other.rideRequestId != null)
                return false;
        }
        else if (!rideRequestId.equals(other.rideRequestId))
            return false;
        if (rideId == null) {
            if (other.rideId != null)
                return false;
        }
        else if (!rideId.equals(other.rideId))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        }
        else if (!latitude.equals(other.latitude))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        }
        else if (!longitude.equals(other.longitude))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.riderState == null) ? 0 : this.riderState.hashCode());
        result = prime * result + ((this.serviceRegionId == null) ? 0 : this.serviceRegionId.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.rideRequestId == null) ? 0 : this.rideRequestId.hashCode());
        result = prime * result + ((this.rideId == null) ? 0 : this.rideId.hashCode());
        result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
        result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiderStates (");

        sb.append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(riderState);
        sb.append(", ").append(serviceRegionId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(rideRequestId);
        sb.append(", ").append(rideId);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);

        sb.append(")");
        return sb.toString();
    }
}