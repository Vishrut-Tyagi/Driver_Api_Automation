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
public class LeaseDriverAction implements Serializable {

    private static final long serialVersionUID = 510418500;

    private UInteger id;
    private UInteger dutyId;
    private UInteger driverId;
    private UInteger driverLeaseDailyStatsId;
    private String   vehicleNumber;
    private String   fromState;
    private String   toState;
    private Long     fromTimestamp;
    private Long     toTimestamp;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdTimestamp;
    private String   pauseReason;

    public LeaseDriverAction() {}

    public LeaseDriverAction(LeaseDriverAction value) {
        this.id = value.id;
        this.dutyId = value.dutyId;
        this.driverId = value.driverId;
        this.driverLeaseDailyStatsId = value.driverLeaseDailyStatsId;
        this.vehicleNumber = value.vehicleNumber;
        this.fromState = value.fromState;
        this.toState = value.toState;
        this.fromTimestamp = value.fromTimestamp;
        this.toTimestamp = value.toTimestamp;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdTimestamp = value.createdTimestamp;
        this.pauseReason = value.pauseReason;
    }

    public LeaseDriverAction(
        UInteger id,
        UInteger dutyId,
        UInteger driverId,
        UInteger driverLeaseDailyStatsId,
        String   vehicleNumber,
        String   fromState,
        String   toState,
        Long     fromTimestamp,
        Long     toTimestamp,
        Byte     isActive,
        UInteger createdBy,
        Long     createdTimestamp,
        String   pauseReason
    ) {
        this.id = id;
        this.dutyId = dutyId;
        this.driverId = driverId;
        this.driverLeaseDailyStatsId = driverLeaseDailyStatsId;
        this.vehicleNumber = vehicleNumber;
        this.fromState = fromState;
        this.toState = toState;
        this.fromTimestamp = fromTimestamp;
        this.toTimestamp = toTimestamp;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdTimestamp = createdTimestamp;
        this.pauseReason = pauseReason;
    }

    public UInteger getId() {
        return this.id;
    }

    public LeaseDriverAction setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getDutyId() {
        return this.dutyId;
    }

    public LeaseDriverAction setDutyId(UInteger dutyId) {
        this.dutyId = dutyId;
        return this;
    }

    public UInteger getDriverId() {
        return this.driverId;
    }

    public LeaseDriverAction setDriverId(UInteger driverId) {
        this.driverId = driverId;
        return this;
    }

    public UInteger getDriverLeaseDailyStatsId() {
        return this.driverLeaseDailyStatsId;
    }

    public LeaseDriverAction setDriverLeaseDailyStatsId(UInteger driverLeaseDailyStatsId) {
        this.driverLeaseDailyStatsId = driverLeaseDailyStatsId;
        return this;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public LeaseDriverAction setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getFromState() {
        return this.fromState;
    }

    public LeaseDriverAction setFromState(String fromState) {
        this.fromState = fromState;
        return this;
    }

    public String getToState() {
        return this.toState;
    }

    public LeaseDriverAction setToState(String toState) {
        this.toState = toState;
        return this;
    }

    public Long getFromTimestamp() {
        return this.fromTimestamp;
    }

    public LeaseDriverAction setFromTimestamp(Long fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
        return this;
    }

    public Long getToTimestamp() {
        return this.toTimestamp;
    }

    public LeaseDriverAction setToTimestamp(Long toTimestamp) {
        this.toTimestamp = toTimestamp;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public LeaseDriverAction setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public LeaseDriverAction setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public LeaseDriverAction setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public String getPauseReason() {
        return this.pauseReason;
    }

    public LeaseDriverAction setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason;
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
        final LeaseDriverAction other = (LeaseDriverAction) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (dutyId == null) {
            if (other.dutyId != null)
                return false;
        }
        else if (!dutyId.equals(other.dutyId))
            return false;
        if (driverId == null) {
            if (other.driverId != null)
                return false;
        }
        else if (!driverId.equals(other.driverId))
            return false;
        if (driverLeaseDailyStatsId == null) {
            if (other.driverLeaseDailyStatsId != null)
                return false;
        }
        else if (!driverLeaseDailyStatsId.equals(other.driverLeaseDailyStatsId))
            return false;
        if (vehicleNumber == null) {
            if (other.vehicleNumber != null)
                return false;
        }
        else if (!vehicleNumber.equals(other.vehicleNumber))
            return false;
        if (fromState == null) {
            if (other.fromState != null)
                return false;
        }
        else if (!fromState.equals(other.fromState))
            return false;
        if (toState == null) {
            if (other.toState != null)
                return false;
        }
        else if (!toState.equals(other.toState))
            return false;
        if (fromTimestamp == null) {
            if (other.fromTimestamp != null)
                return false;
        }
        else if (!fromTimestamp.equals(other.fromTimestamp))
            return false;
        if (toTimestamp == null) {
            if (other.toTimestamp != null)
                return false;
        }
        else if (!toTimestamp.equals(other.toTimestamp))
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
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        if (pauseReason == null) {
            if (other.pauseReason != null)
                return false;
        }
        else if (!pauseReason.equals(other.pauseReason))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.dutyId == null) ? 0 : this.dutyId.hashCode());
        result = prime * result + ((this.driverId == null) ? 0 : this.driverId.hashCode());
        result = prime * result + ((this.driverLeaseDailyStatsId == null) ? 0 : this.driverLeaseDailyStatsId.hashCode());
        result = prime * result + ((this.vehicleNumber == null) ? 0 : this.vehicleNumber.hashCode());
        result = prime * result + ((this.fromState == null) ? 0 : this.fromState.hashCode());
        result = prime * result + ((this.toState == null) ? 0 : this.toState.hashCode());
        result = prime * result + ((this.fromTimestamp == null) ? 0 : this.fromTimestamp.hashCode());
        result = prime * result + ((this.toTimestamp == null) ? 0 : this.toTimestamp.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.pauseReason == null) ? 0 : this.pauseReason.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LeaseDriverAction (");

        sb.append(id);
        sb.append(", ").append(dutyId);
        sb.append(", ").append(driverId);
        sb.append(", ").append(driverLeaseDailyStatsId);
        sb.append(", ").append(vehicleNumber);
        sb.append(", ").append(fromState);
        sb.append(", ").append(toState);
        sb.append(", ").append(fromTimestamp);
        sb.append(", ").append(toTimestamp);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(pauseReason);

        sb.append(")");
        return sb.toString();
    }
}
