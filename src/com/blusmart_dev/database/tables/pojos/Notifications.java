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
public class Notifications implements Serializable {

    private static final long serialVersionUID = 362973267;

    private UInteger id;
    private UInteger riderId;
    private UInteger driverId;
    private UInteger notificationTemplateId;
    private String   requestMetadata;
    private String   state;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private String   responseMetadata;

    public Notifications() {}

    public Notifications(Notifications value) {
        this.id = value.id;
        this.riderId = value.riderId;
        this.driverId = value.driverId;
        this.notificationTemplateId = value.notificationTemplateId;
        this.requestMetadata = value.requestMetadata;
        this.state = value.state;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.responseMetadata = value.responseMetadata;
    }

    public Notifications(
        UInteger id,
        UInteger riderId,
        UInteger driverId,
        UInteger notificationTemplateId,
        String   requestMetadata,
        String   state,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        String   responseMetadata
    ) {
        this.id = id;
        this.riderId = riderId;
        this.driverId = driverId;
        this.notificationTemplateId = notificationTemplateId;
        this.requestMetadata = requestMetadata;
        this.state = state;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.responseMetadata = responseMetadata;
    }

    public UInteger getId() {
        return this.id;
    }

    public Notifications setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public Notifications setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public UInteger getDriverId() {
        return this.driverId;
    }

    public Notifications setDriverId(UInteger driverId) {
        this.driverId = driverId;
        return this;
    }

    public UInteger getNotificationTemplateId() {
        return this.notificationTemplateId;
    }

    public Notifications setNotificationTemplateId(UInteger notificationTemplateId) {
        this.notificationTemplateId = notificationTemplateId;
        return this;
    }

    public String getRequestMetadata() {
        return this.requestMetadata;
    }

    public Notifications setRequestMetadata(String requestMetadata) {
        this.requestMetadata = requestMetadata;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Notifications setState(String state) {
        this.state = state;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public Notifications setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Notifications setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public Notifications setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public Notifications setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public Notifications setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getResponseMetadata() {
        return this.responseMetadata;
    }

    public Notifications setResponseMetadata(String responseMetadata) {
        this.responseMetadata = responseMetadata;
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
        final Notifications other = (Notifications) obj;
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
        if (notificationTemplateId == null) {
            if (other.notificationTemplateId != null)
                return false;
        }
        else if (!notificationTemplateId.equals(other.notificationTemplateId))
            return false;
        if (requestMetadata == null) {
            if (other.requestMetadata != null)
                return false;
        }
        else if (!requestMetadata.equals(other.requestMetadata))
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
        if (responseMetadata == null) {
            if (other.responseMetadata != null)
                return false;
        }
        else if (!responseMetadata.equals(other.responseMetadata))
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
        result = prime * result + ((this.notificationTemplateId == null) ? 0 : this.notificationTemplateId.hashCode());
        result = prime * result + ((this.requestMetadata == null) ? 0 : this.requestMetadata.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.responseMetadata == null) ? 0 : this.responseMetadata.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Notifications (");

        sb.append(id);
        sb.append(", ").append(riderId);
        sb.append(", ").append(driverId);
        sb.append(", ").append(notificationTemplateId);
        sb.append(", ").append(requestMetadata);
        sb.append(", ").append(state);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(responseMetadata);

        sb.append(")");
        return sb.toString();
    }
}
