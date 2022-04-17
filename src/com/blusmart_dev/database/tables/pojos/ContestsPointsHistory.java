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
public class ContestsPointsHistory implements Serializable {

    private static final long serialVersionUID = -191986246;

    private UInteger id;
    private UInteger enrollmentId;
    private UInteger riderId;
    private UInteger rideId;
    private String   subtitle;
    private Integer  points;
    private String   message;
    private String   note;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;

    public ContestsPointsHistory() {}

    public ContestsPointsHistory(ContestsPointsHistory value) {
        this.id = value.id;
        this.enrollmentId = value.enrollmentId;
        this.riderId = value.riderId;
        this.rideId = value.rideId;
        this.subtitle = value.subtitle;
        this.points = value.points;
        this.message = value.message;
        this.note = value.note;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
    }

    public ContestsPointsHistory(
        UInteger id,
        UInteger enrollmentId,
        UInteger riderId,
        UInteger rideId,
        String   subtitle,
        Integer  points,
        String   message,
        String   note,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt
    ) {
        this.id = id;
        this.enrollmentId = enrollmentId;
        this.riderId = riderId;
        this.rideId = rideId;
        this.subtitle = subtitle;
        this.points = points;
        this.message = message;
        this.note = note;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public UInteger getId() {
        return this.id;
    }

    public ContestsPointsHistory setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getEnrollmentId() {
        return this.enrollmentId;
    }

    public ContestsPointsHistory setEnrollmentId(UInteger enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public ContestsPointsHistory setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public UInteger getRideId() {
        return this.rideId;
    }

    public ContestsPointsHistory setRideId(UInteger rideId) {
        this.rideId = rideId;
        return this;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public ContestsPointsHistory setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Integer getPoints() {
        return this.points;
    }

    public ContestsPointsHistory setPoints(Integer points) {
        this.points = points;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ContestsPointsHistory setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public ContestsPointsHistory setNote(String note) {
        this.note = note;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public ContestsPointsHistory setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public ContestsPointsHistory setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ContestsPointsHistory setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public ContestsPointsHistory setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public ContestsPointsHistory setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
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
        final ContestsPointsHistory other = (ContestsPointsHistory) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (enrollmentId == null) {
            if (other.enrollmentId != null)
                return false;
        }
        else if (!enrollmentId.equals(other.enrollmentId))
            return false;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (rideId == null) {
            if (other.rideId != null)
                return false;
        }
        else if (!rideId.equals(other.rideId))
            return false;
        if (subtitle == null) {
            if (other.subtitle != null)
                return false;
        }
        else if (!subtitle.equals(other.subtitle))
            return false;
        if (points == null) {
            if (other.points != null)
                return false;
        }
        else if (!points.equals(other.points))
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        }
        else if (!message.equals(other.message))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.enrollmentId == null) ? 0 : this.enrollmentId.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.rideId == null) ? 0 : this.rideId.hashCode());
        result = prime * result + ((this.subtitle == null) ? 0 : this.subtitle.hashCode());
        result = prime * result + ((this.points == null) ? 0 : this.points.hashCode());
        result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
        result = prime * result + ((this.note == null) ? 0 : this.note.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ContestsPointsHistory (");

        sb.append(id);
        sb.append(", ").append(enrollmentId);
        sb.append(", ").append(riderId);
        sb.append(", ").append(rideId);
        sb.append(", ").append(subtitle);
        sb.append(", ").append(points);
        sb.append(", ").append(message);
        sb.append(", ").append(note);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);

        sb.append(")");
        return sb.toString();
    }
}