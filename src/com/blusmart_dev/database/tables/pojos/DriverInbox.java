/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverInbox implements Serializable {

    private static final long serialVersionUID = 1634930686;

    private Integer       id;
    private Byte          isRead;
    private Byte          isActive;
    private String        messageId;
    private Integer       driverId;
    private LocalDateTime createdAt;
    private Integer       createdBy;
    private LocalDateTime lastUpdatedAt;
    private Integer       lastUpdatedBy;

    public DriverInbox() {}

    public DriverInbox(DriverInbox value) {
        this.id = value.id;
        this.isRead = value.isRead;
        this.isActive = value.isActive;
        this.messageId = value.messageId;
        this.driverId = value.driverId;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
    }

    public DriverInbox(
        Integer       id,
        Byte          isRead,
        Byte          isActive,
        String        messageId,
        Integer       driverId,
        LocalDateTime createdAt,
        Integer       createdBy,
        LocalDateTime lastUpdatedAt,
        Integer       lastUpdatedBy
    ) {
        this.id = id;
        this.isRead = isRead;
        this.isActive = isActive;
        this.messageId = messageId;
        this.driverId = driverId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastUpdatedAt = lastUpdatedAt;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Integer getId() {
        return this.id;
    }

    public DriverInbox setId(Integer id) {
        this.id = id;
        return this;
    }

    public Byte getIsRead() {
        return this.isRead;
    }

    public DriverInbox setIsRead(Byte isRead) {
        this.isRead = isRead;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public DriverInbox setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public DriverInbox setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public DriverInbox setDriverId(Integer driverId) {
        this.driverId = driverId;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public DriverInbox setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public DriverInbox setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDateTime getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public DriverInbox setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public Integer getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public DriverInbox setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
        final DriverInbox other = (DriverInbox) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (isRead == null) {
            if (other.isRead != null)
                return false;
        }
        else if (!isRead.equals(other.isRead))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (messageId == null) {
            if (other.messageId != null)
                return false;
        }
        else if (!messageId.equals(other.messageId))
            return false;
        if (driverId == null) {
            if (other.driverId != null)
                return false;
        }
        else if (!driverId.equals(other.driverId))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (lastUpdatedAt == null) {
            if (other.lastUpdatedAt != null)
                return false;
        }
        else if (!lastUpdatedAt.equals(other.lastUpdatedAt))
            return false;
        if (lastUpdatedBy == null) {
            if (other.lastUpdatedBy != null)
                return false;
        }
        else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.isRead == null) ? 0 : this.isRead.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.messageId == null) ? 0 : this.messageId.hashCode());
        result = prime * result + ((this.driverId == null) ? 0 : this.driverId.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DriverInbox (");

        sb.append(id);
        sb.append(", ").append(isRead);
        sb.append(", ").append(isActive);
        sb.append(", ").append(messageId);
        sb.append(", ").append(driverId);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(lastUpdatedBy);

        sb.append(")");
        return sb.toString();
    }
}
