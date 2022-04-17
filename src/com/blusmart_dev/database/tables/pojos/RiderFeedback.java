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
public class RiderFeedback implements Serializable {

    private static final long serialVersionUID = -824120649;

    private UInteger id;
    private UInteger rideId;
    private UInteger rideRequestId;
    private String   feedback;
    private UInteger starRating;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private String   feedbackType;
    private UInteger driverId;
    private UInteger riderId;
    private String   feedbackJson;

    public RiderFeedback() {}

    public RiderFeedback(RiderFeedback value) {
        this.id = value.id;
        this.rideId = value.rideId;
        this.rideRequestId = value.rideRequestId;
        this.feedback = value.feedback;
        this.starRating = value.starRating;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.feedbackType = value.feedbackType;
        this.driverId = value.driverId;
        this.riderId = value.riderId;
        this.feedbackJson = value.feedbackJson;
    }

    public RiderFeedback(
        UInteger id,
        UInteger rideId,
        UInteger rideRequestId,
        String   feedback,
        UInteger starRating,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        String   feedbackType,
        UInteger driverId,
        UInteger riderId,
        String   feedbackJson
    ) {
        this.id = id;
        this.rideId = rideId;
        this.rideRequestId = rideRequestId;
        this.feedback = feedback;
        this.starRating = starRating;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.feedbackType = feedbackType;
        this.driverId = driverId;
        this.riderId = riderId;
        this.feedbackJson = feedbackJson;
    }

    public UInteger getId() {
        return this.id;
    }

    public RiderFeedback setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRideId() {
        return this.rideId;
    }

    public RiderFeedback setRideId(UInteger rideId) {
        this.rideId = rideId;
        return this;
    }

    public UInteger getRideRequestId() {
        return this.rideRequestId;
    }

    public RiderFeedback setRideRequestId(UInteger rideRequestId) {
        this.rideRequestId = rideRequestId;
        return this;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public RiderFeedback setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    public UInteger getStarRating() {
        return this.starRating;
    }

    public RiderFeedback setStarRating(UInteger starRating) {
        this.starRating = starRating;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public RiderFeedback setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public RiderFeedback setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public RiderFeedback setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public RiderFeedback setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public RiderFeedback setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }

    public RiderFeedback setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
        return this;
    }

    public UInteger getDriverId() {
        return this.driverId;
    }

    public RiderFeedback setDriverId(UInteger driverId) {
        this.driverId = driverId;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public RiderFeedback setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public String getFeedbackJson() {
        return this.feedbackJson;
    }

    public RiderFeedback setFeedbackJson(String feedbackJson) {
        this.feedbackJson = feedbackJson;
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
        final RiderFeedback other = (RiderFeedback) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (rideId == null) {
            if (other.rideId != null)
                return false;
        }
        else if (!rideId.equals(other.rideId))
            return false;
        if (rideRequestId == null) {
            if (other.rideRequestId != null)
                return false;
        }
        else if (!rideRequestId.equals(other.rideRequestId))
            return false;
        if (feedback == null) {
            if (other.feedback != null)
                return false;
        }
        else if (!feedback.equals(other.feedback))
            return false;
        if (starRating == null) {
            if (other.starRating != null)
                return false;
        }
        else if (!starRating.equals(other.starRating))
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
        if (feedbackType == null) {
            if (other.feedbackType != null)
                return false;
        }
        else if (!feedbackType.equals(other.feedbackType))
            return false;
        if (driverId == null) {
            if (other.driverId != null)
                return false;
        }
        else if (!driverId.equals(other.driverId))
            return false;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (feedbackJson == null) {
            if (other.feedbackJson != null)
                return false;
        }
        else if (!feedbackJson.equals(other.feedbackJson))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.rideId == null) ? 0 : this.rideId.hashCode());
        result = prime * result + ((this.rideRequestId == null) ? 0 : this.rideRequestId.hashCode());
        result = prime * result + ((this.feedback == null) ? 0 : this.feedback.hashCode());
        result = prime * result + ((this.starRating == null) ? 0 : this.starRating.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.feedbackType == null) ? 0 : this.feedbackType.hashCode());
        result = prime * result + ((this.driverId == null) ? 0 : this.driverId.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.feedbackJson == null) ? 0 : this.feedbackJson.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiderFeedback (");

        sb.append(id);
        sb.append(", ").append(rideId);
        sb.append(", ").append(rideRequestId);
        sb.append(", ").append(feedback);
        sb.append(", ").append(starRating);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(feedbackType);
        sb.append(", ").append(driverId);
        sb.append(", ").append(riderId);
        sb.append(", ").append(feedbackJson);

        sb.append(")");
        return sb.toString();
    }
}
