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
public class RentalsRidesAud implements Serializable {

    private static final long serialVersionUID = -2125688469;

    private UInteger   id;
    private Integer    riderId;
    private Integer    driverId;
    private BigDecimal stopLatitude;
    private BigDecimal stopLongitude;
    private String     stopLocation;
    private Integer    distanceTaken;
    private Integer    timeTaken;
    private String     stopType;
    private Integer    stopId;
    private Integer    max;
    private Long       createdAt;
    private Long       lastUpadtedAt;
    private Long       startTime;
    private Long       endTime;
    private Integer    createdBy;
    private Integer    updatedBy;
    private String     notes;
    private Integer    rideRequestId;
    private String     startLocation;
    private BigDecimal startLatitude;
    private BigDecimal startLongitude;
    private Long       leftTime;
    private Long       reachedTime;
    private String     vehicleNumber;
    private Byte       isActive;
    private BigDecimal estimatedDistance;
    private Long       estimatedTimeStamp;
    private Long       actualTimeStamp;
    private BigDecimal actualDistance;
    private String     status;
    private Byte       isVisible;
    private Integer    stopServiceRegionId;
    private String     actionBy;
    private UInteger   rentalsRidesId;
    private Integer    audId;

    public RentalsRidesAud() {}

    public RentalsRidesAud(RentalsRidesAud value) {
        this.id = value.id;
        this.riderId = value.riderId;
        this.driverId = value.driverId;
        this.stopLatitude = value.stopLatitude;
        this.stopLongitude = value.stopLongitude;
        this.stopLocation = value.stopLocation;
        this.distanceTaken = value.distanceTaken;
        this.timeTaken = value.timeTaken;
        this.stopType = value.stopType;
        this.stopId = value.stopId;
        this.max = value.max;
        this.createdAt = value.createdAt;
        this.lastUpadtedAt = value.lastUpadtedAt;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
        this.notes = value.notes;
        this.rideRequestId = value.rideRequestId;
        this.startLocation = value.startLocation;
        this.startLatitude = value.startLatitude;
        this.startLongitude = value.startLongitude;
        this.leftTime = value.leftTime;
        this.reachedTime = value.reachedTime;
        this.vehicleNumber = value.vehicleNumber;
        this.isActive = value.isActive;
        this.estimatedDistance = value.estimatedDistance;
        this.estimatedTimeStamp = value.estimatedTimeStamp;
        this.actualTimeStamp = value.actualTimeStamp;
        this.actualDistance = value.actualDistance;
        this.status = value.status;
        this.isVisible = value.isVisible;
        this.stopServiceRegionId = value.stopServiceRegionId;
        this.actionBy = value.actionBy;
        this.rentalsRidesId = value.rentalsRidesId;
        this.audId = value.audId;
    }

    public RentalsRidesAud(
        UInteger   id,
        Integer    riderId,
        Integer    driverId,
        BigDecimal stopLatitude,
        BigDecimal stopLongitude,
        String     stopLocation,
        Integer    distanceTaken,
        Integer    timeTaken,
        String     stopType,
        Integer    stopId,
        Integer    max,
        Long       createdAt,
        Long       lastUpadtedAt,
        Long       startTime,
        Long       endTime,
        Integer    createdBy,
        Integer    updatedBy,
        String     notes,
        Integer    rideRequestId,
        String     startLocation,
        BigDecimal startLatitude,
        BigDecimal startLongitude,
        Long       leftTime,
        Long       reachedTime,
        String     vehicleNumber,
        Byte       isActive,
        BigDecimal estimatedDistance,
        Long       estimatedTimeStamp,
        Long       actualTimeStamp,
        BigDecimal actualDistance,
        String     status,
        Byte       isVisible,
        Integer    stopServiceRegionId,
        String     actionBy,
        UInteger   rentalsRidesId,
        Integer    audId
    ) {
        this.id = id;
        this.riderId = riderId;
        this.driverId = driverId;
        this.stopLatitude = stopLatitude;
        this.stopLongitude = stopLongitude;
        this.stopLocation = stopLocation;
        this.distanceTaken = distanceTaken;
        this.timeTaken = timeTaken;
        this.stopType = stopType;
        this.stopId = stopId;
        this.max = max;
        this.createdAt = createdAt;
        this.lastUpadtedAt = lastUpadtedAt;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.notes = notes;
        this.rideRequestId = rideRequestId;
        this.startLocation = startLocation;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.leftTime = leftTime;
        this.reachedTime = reachedTime;
        this.vehicleNumber = vehicleNumber;
        this.isActive = isActive;
        this.estimatedDistance = estimatedDistance;
        this.estimatedTimeStamp = estimatedTimeStamp;
        this.actualTimeStamp = actualTimeStamp;
        this.actualDistance = actualDistance;
        this.status = status;
        this.isVisible = isVisible;
        this.stopServiceRegionId = stopServiceRegionId;
        this.actionBy = actionBy;
        this.rentalsRidesId = rentalsRidesId;
        this.audId = audId;
    }

    public UInteger getId() {
        return this.id;
    }

    public RentalsRidesAud setId(UInteger id) {
        this.id = id;
        return this;
    }

    public Integer getRiderId() {
        return this.riderId;
    }

    public RentalsRidesAud setRiderId(Integer riderId) {
        this.riderId = riderId;
        return this;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public RentalsRidesAud setDriverId(Integer driverId) {
        this.driverId = driverId;
        return this;
    }

    public BigDecimal getStopLatitude() {
        return this.stopLatitude;
    }

    public RentalsRidesAud setStopLatitude(BigDecimal stopLatitude) {
        this.stopLatitude = stopLatitude;
        return this;
    }

    public BigDecimal getStopLongitude() {
        return this.stopLongitude;
    }

    public RentalsRidesAud setStopLongitude(BigDecimal stopLongitude) {
        this.stopLongitude = stopLongitude;
        return this;
    }

    public String getStopLocation() {
        return this.stopLocation;
    }

    public RentalsRidesAud setStopLocation(String stopLocation) {
        this.stopLocation = stopLocation;
        return this;
    }

    public Integer getDistanceTaken() {
        return this.distanceTaken;
    }

    public RentalsRidesAud setDistanceTaken(Integer distanceTaken) {
        this.distanceTaken = distanceTaken;
        return this;
    }

    public Integer getTimeTaken() {
        return this.timeTaken;
    }

    public RentalsRidesAud setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
        return this;
    }

    public String getStopType() {
        return this.stopType;
    }

    public RentalsRidesAud setStopType(String stopType) {
        this.stopType = stopType;
        return this;
    }

    public Integer getStopId() {
        return this.stopId;
    }

    public RentalsRidesAud setStopId(Integer stopId) {
        this.stopId = stopId;
        return this;
    }

    public Integer getMax() {
        return this.max;
    }

    public RentalsRidesAud setMax(Integer max) {
        this.max = max;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public RentalsRidesAud setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getLastUpadtedAt() {
        return this.lastUpadtedAt;
    }

    public RentalsRidesAud setLastUpadtedAt(Long lastUpadtedAt) {
        this.lastUpadtedAt = lastUpadtedAt;
        return this;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public RentalsRidesAud setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public RentalsRidesAud setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public RentalsRidesAud setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public RentalsRidesAud setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getNotes() {
        return this.notes;
    }

    public RentalsRidesAud setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public Integer getRideRequestId() {
        return this.rideRequestId;
    }

    public RentalsRidesAud setRideRequestId(Integer rideRequestId) {
        this.rideRequestId = rideRequestId;
        return this;
    }

    public String getStartLocation() {
        return this.startLocation;
    }

    public RentalsRidesAud setStartLocation(String startLocation) {
        this.startLocation = startLocation;
        return this;
    }

    public BigDecimal getStartLatitude() {
        return this.startLatitude;
    }

    public RentalsRidesAud setStartLatitude(BigDecimal startLatitude) {
        this.startLatitude = startLatitude;
        return this;
    }

    public BigDecimal getStartLongitude() {
        return this.startLongitude;
    }

    public RentalsRidesAud setStartLongitude(BigDecimal startLongitude) {
        this.startLongitude = startLongitude;
        return this;
    }

    public Long getLeftTime() {
        return this.leftTime;
    }

    public RentalsRidesAud setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    public Long getReachedTime() {
        return this.reachedTime;
    }

    public RentalsRidesAud setReachedTime(Long reachedTime) {
        this.reachedTime = reachedTime;
        return this;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public RentalsRidesAud setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public RentalsRidesAud setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public BigDecimal getEstimatedDistance() {
        return this.estimatedDistance;
    }

    public RentalsRidesAud setEstimatedDistance(BigDecimal estimatedDistance) {
        this.estimatedDistance = estimatedDistance;
        return this;
    }

    public Long getEstimatedTimeStamp() {
        return this.estimatedTimeStamp;
    }

    public RentalsRidesAud setEstimatedTimeStamp(Long estimatedTimeStamp) {
        this.estimatedTimeStamp = estimatedTimeStamp;
        return this;
    }

    public Long getActualTimeStamp() {
        return this.actualTimeStamp;
    }

    public RentalsRidesAud setActualTimeStamp(Long actualTimeStamp) {
        this.actualTimeStamp = actualTimeStamp;
        return this;
    }

    public BigDecimal getActualDistance() {
        return this.actualDistance;
    }

    public RentalsRidesAud setActualDistance(BigDecimal actualDistance) {
        this.actualDistance = actualDistance;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public RentalsRidesAud setStatus(String status) {
        this.status = status;
        return this;
    }

    public Byte getIsVisible() {
        return this.isVisible;
    }

    public RentalsRidesAud setIsVisible(Byte isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    public Integer getStopServiceRegionId() {
        return this.stopServiceRegionId;
    }

    public RentalsRidesAud setStopServiceRegionId(Integer stopServiceRegionId) {
        this.stopServiceRegionId = stopServiceRegionId;
        return this;
    }

    public String getActionBy() {
        return this.actionBy;
    }

    public RentalsRidesAud setActionBy(String actionBy) {
        this.actionBy = actionBy;
        return this;
    }

    public UInteger getRentalsRidesId() {
        return this.rentalsRidesId;
    }

    public RentalsRidesAud setRentalsRidesId(UInteger rentalsRidesId) {
        this.rentalsRidesId = rentalsRidesId;
        return this;
    }

    public Integer getAudId() {
        return this.audId;
    }

    public RentalsRidesAud setAudId(Integer audId) {
        this.audId = audId;
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
        final RentalsRidesAud other = (RentalsRidesAud) obj;
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
        if (driverId == null) {
            if (other.driverId != null)
                return false;
        }
        else if (!driverId.equals(other.driverId))
            return false;
        if (stopLatitude == null) {
            if (other.stopLatitude != null)
                return false;
        }
        else if (!stopLatitude.equals(other.stopLatitude))
            return false;
        if (stopLongitude == null) {
            if (other.stopLongitude != null)
                return false;
        }
        else if (!stopLongitude.equals(other.stopLongitude))
            return false;
        if (stopLocation == null) {
            if (other.stopLocation != null)
                return false;
        }
        else if (!stopLocation.equals(other.stopLocation))
            return false;
        if (distanceTaken == null) {
            if (other.distanceTaken != null)
                return false;
        }
        else if (!distanceTaken.equals(other.distanceTaken))
            return false;
        if (timeTaken == null) {
            if (other.timeTaken != null)
                return false;
        }
        else if (!timeTaken.equals(other.timeTaken))
            return false;
        if (stopType == null) {
            if (other.stopType != null)
                return false;
        }
        else if (!stopType.equals(other.stopType))
            return false;
        if (stopId == null) {
            if (other.stopId != null)
                return false;
        }
        else if (!stopId.equals(other.stopId))
            return false;
        if (max == null) {
            if (other.max != null)
                return false;
        }
        else if (!max.equals(other.max))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (lastUpadtedAt == null) {
            if (other.lastUpadtedAt != null)
                return false;
        }
        else if (!lastUpadtedAt.equals(other.lastUpadtedAt))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        }
        else if (!startTime.equals(other.startTime))
            return false;
        if (endTime == null) {
            if (other.endTime != null)
                return false;
        }
        else if (!endTime.equals(other.endTime))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!updatedBy.equals(other.updatedBy))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        }
        else if (!notes.equals(other.notes))
            return false;
        if (rideRequestId == null) {
            if (other.rideRequestId != null)
                return false;
        }
        else if (!rideRequestId.equals(other.rideRequestId))
            return false;
        if (startLocation == null) {
            if (other.startLocation != null)
                return false;
        }
        else if (!startLocation.equals(other.startLocation))
            return false;
        if (startLatitude == null) {
            if (other.startLatitude != null)
                return false;
        }
        else if (!startLatitude.equals(other.startLatitude))
            return false;
        if (startLongitude == null) {
            if (other.startLongitude != null)
                return false;
        }
        else if (!startLongitude.equals(other.startLongitude))
            return false;
        if (leftTime == null) {
            if (other.leftTime != null)
                return false;
        }
        else if (!leftTime.equals(other.leftTime))
            return false;
        if (reachedTime == null) {
            if (other.reachedTime != null)
                return false;
        }
        else if (!reachedTime.equals(other.reachedTime))
            return false;
        if (vehicleNumber == null) {
            if (other.vehicleNumber != null)
                return false;
        }
        else if (!vehicleNumber.equals(other.vehicleNumber))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (estimatedDistance == null) {
            if (other.estimatedDistance != null)
                return false;
        }
        else if (!estimatedDistance.equals(other.estimatedDistance))
            return false;
        if (estimatedTimeStamp == null) {
            if (other.estimatedTimeStamp != null)
                return false;
        }
        else if (!estimatedTimeStamp.equals(other.estimatedTimeStamp))
            return false;
        if (actualTimeStamp == null) {
            if (other.actualTimeStamp != null)
                return false;
        }
        else if (!actualTimeStamp.equals(other.actualTimeStamp))
            return false;
        if (actualDistance == null) {
            if (other.actualDistance != null)
                return false;
        }
        else if (!actualDistance.equals(other.actualDistance))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (isVisible == null) {
            if (other.isVisible != null)
                return false;
        }
        else if (!isVisible.equals(other.isVisible))
            return false;
        if (stopServiceRegionId == null) {
            if (other.stopServiceRegionId != null)
                return false;
        }
        else if (!stopServiceRegionId.equals(other.stopServiceRegionId))
            return false;
        if (actionBy == null) {
            if (other.actionBy != null)
                return false;
        }
        else if (!actionBy.equals(other.actionBy))
            return false;
        if (rentalsRidesId == null) {
            if (other.rentalsRidesId != null)
                return false;
        }
        else if (!rentalsRidesId.equals(other.rentalsRidesId))
            return false;
        if (audId == null) {
            if (other.audId != null)
                return false;
        }
        else if (!audId.equals(other.audId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.driverId == null) ? 0 : this.driverId.hashCode());
        result = prime * result + ((this.stopLatitude == null) ? 0 : this.stopLatitude.hashCode());
        result = prime * result + ((this.stopLongitude == null) ? 0 : this.stopLongitude.hashCode());
        result = prime * result + ((this.stopLocation == null) ? 0 : this.stopLocation.hashCode());
        result = prime * result + ((this.distanceTaken == null) ? 0 : this.distanceTaken.hashCode());
        result = prime * result + ((this.timeTaken == null) ? 0 : this.timeTaken.hashCode());
        result = prime * result + ((this.stopType == null) ? 0 : this.stopType.hashCode());
        result = prime * result + ((this.stopId == null) ? 0 : this.stopId.hashCode());
        result = prime * result + ((this.max == null) ? 0 : this.max.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpadtedAt == null) ? 0 : this.lastUpadtedAt.hashCode());
        result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
        result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        result = prime * result + ((this.notes == null) ? 0 : this.notes.hashCode());
        result = prime * result + ((this.rideRequestId == null) ? 0 : this.rideRequestId.hashCode());
        result = prime * result + ((this.startLocation == null) ? 0 : this.startLocation.hashCode());
        result = prime * result + ((this.startLatitude == null) ? 0 : this.startLatitude.hashCode());
        result = prime * result + ((this.startLongitude == null) ? 0 : this.startLongitude.hashCode());
        result = prime * result + ((this.leftTime == null) ? 0 : this.leftTime.hashCode());
        result = prime * result + ((this.reachedTime == null) ? 0 : this.reachedTime.hashCode());
        result = prime * result + ((this.vehicleNumber == null) ? 0 : this.vehicleNumber.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.estimatedDistance == null) ? 0 : this.estimatedDistance.hashCode());
        result = prime * result + ((this.estimatedTimeStamp == null) ? 0 : this.estimatedTimeStamp.hashCode());
        result = prime * result + ((this.actualTimeStamp == null) ? 0 : this.actualTimeStamp.hashCode());
        result = prime * result + ((this.actualDistance == null) ? 0 : this.actualDistance.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.isVisible == null) ? 0 : this.isVisible.hashCode());
        result = prime * result + ((this.stopServiceRegionId == null) ? 0 : this.stopServiceRegionId.hashCode());
        result = prime * result + ((this.actionBy == null) ? 0 : this.actionBy.hashCode());
        result = prime * result + ((this.rentalsRidesId == null) ? 0 : this.rentalsRidesId.hashCode());
        result = prime * result + ((this.audId == null) ? 0 : this.audId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RentalsRidesAud (");

        sb.append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(driverId);
        sb.append(", ").append(stopLatitude);
        sb.append(", ").append(stopLongitude);
        sb.append(", ").append(stopLocation);
        sb.append(", ").append(distanceTaken);
        sb.append(", ").append(timeTaken);
        sb.append(", ").append(stopType);
        sb.append(", ").append(stopId);
        sb.append(", ").append(max);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpadtedAt);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(notes);
        sb.append(", ").append(rideRequestId);
        sb.append(", ").append(startLocation);
        sb.append(", ").append(startLatitude);
        sb.append(", ").append(startLongitude);
        sb.append(", ").append(leftTime);
        sb.append(", ").append(reachedTime);
        sb.append(", ").append(vehicleNumber);
        sb.append(", ").append(isActive);
        sb.append(", ").append(estimatedDistance);
        sb.append(", ").append(estimatedTimeStamp);
        sb.append(", ").append(actualTimeStamp);
        sb.append(", ").append(actualDistance);
        sb.append(", ").append(status);
        sb.append(", ").append(isVisible);
        sb.append(", ").append(stopServiceRegionId);
        sb.append(", ").append(actionBy);
        sb.append(", ").append(rentalsRidesId);
        sb.append(", ").append(audId);

        sb.append(")");
        return sb.toString();
    }
}