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
public class VehicleStateAud implements Serializable {

    private static final long serialVersionUID = -1298457769;

    private UInteger audId;
    private String   vehicleNumber;
    private String   vehicleState;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private String   otherFlags;

    public VehicleStateAud() {}

    public VehicleStateAud(VehicleStateAud value) {
        this.audId = value.audId;
        this.vehicleNumber = value.vehicleNumber;
        this.vehicleState = value.vehicleState;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.otherFlags = value.otherFlags;
    }

    public VehicleStateAud(
        UInteger audId,
        String   vehicleNumber,
        String   vehicleState,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        String   otherFlags
    ) {
        this.audId = audId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleState = vehicleState;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.otherFlags = otherFlags;
    }

    public UInteger getAudId() {
        return this.audId;
    }

    public VehicleStateAud setAudId(UInteger audId) {
        this.audId = audId;
        return this;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public VehicleStateAud setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getVehicleState() {
        return this.vehicleState;
    }

    public VehicleStateAud setVehicleState(String vehicleState) {
        this.vehicleState = vehicleState;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public VehicleStateAud setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public VehicleStateAud setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public VehicleStateAud setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public VehicleStateAud setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public VehicleStateAud setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getOtherFlags() {
        return this.otherFlags;
    }

    public VehicleStateAud setOtherFlags(String otherFlags) {
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
        final VehicleStateAud other = (VehicleStateAud) obj;
        if (audId == null) {
            if (other.audId != null)
                return false;
        }
        else if (!audId.equals(other.audId))
            return false;
        if (vehicleNumber == null) {
            if (other.vehicleNumber != null)
                return false;
        }
        else if (!vehicleNumber.equals(other.vehicleNumber))
            return false;
        if (vehicleState == null) {
            if (other.vehicleState != null)
                return false;
        }
        else if (!vehicleState.equals(other.vehicleState))
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
        result = prime * result + ((this.audId == null) ? 0 : this.audId.hashCode());
        result = prime * result + ((this.vehicleNumber == null) ? 0 : this.vehicleNumber.hashCode());
        result = prime * result + ((this.vehicleState == null) ? 0 : this.vehicleState.hashCode());
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
        StringBuilder sb = new StringBuilder("VehicleStateAud (");

        sb.append(audId);
        sb.append(", ").append(vehicleNumber);
        sb.append(", ").append(vehicleState);
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
