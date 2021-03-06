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
public class VehicleHandoverAudit implements Serializable {

    private static final long serialVersionUID = -1977124704;

    private UInteger   id;
    private UInteger   auditId;
    private UInteger   fromId;
    private UInteger   toId;
    private String     vehicleNumber;
    private String     handoverType;
    private String     handoverStatus;
    private BigDecimal socReading;
    private BigDecimal odometerReading;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private UInteger   hubId;

    public VehicleHandoverAudit() {}

    public VehicleHandoverAudit(VehicleHandoverAudit value) {
        this.id = value.id;
        this.auditId = value.auditId;
        this.fromId = value.fromId;
        this.toId = value.toId;
        this.vehicleNumber = value.vehicleNumber;
        this.handoverType = value.handoverType;
        this.handoverStatus = value.handoverStatus;
        this.socReading = value.socReading;
        this.odometerReading = value.odometerReading;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.hubId = value.hubId;
    }

    public VehicleHandoverAudit(
        UInteger   id,
        UInteger   auditId,
        UInteger   fromId,
        UInteger   toId,
        String     vehicleNumber,
        String     handoverType,
        String     handoverStatus,
        BigDecimal socReading,
        BigDecimal odometerReading,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        UInteger   hubId
    ) {
        this.id = id;
        this.auditId = auditId;
        this.fromId = fromId;
        this.toId = toId;
        this.vehicleNumber = vehicleNumber;
        this.handoverType = handoverType;
        this.handoverStatus = handoverStatus;
        this.socReading = socReading;
        this.odometerReading = odometerReading;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.hubId = hubId;
    }

    public UInteger getId() {
        return this.id;
    }

    public VehicleHandoverAudit setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getAuditId() {
        return this.auditId;
    }

    public VehicleHandoverAudit setAuditId(UInteger auditId) {
        this.auditId = auditId;
        return this;
    }

    public UInteger getFromId() {
        return this.fromId;
    }

    public VehicleHandoverAudit setFromId(UInteger fromId) {
        this.fromId = fromId;
        return this;
    }

    public UInteger getToId() {
        return this.toId;
    }

    public VehicleHandoverAudit setToId(UInteger toId) {
        this.toId = toId;
        return this;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public VehicleHandoverAudit setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getHandoverType() {
        return this.handoverType;
    }

    public VehicleHandoverAudit setHandoverType(String handoverType) {
        this.handoverType = handoverType;
        return this;
    }

    public String getHandoverStatus() {
        return this.handoverStatus;
    }

    public VehicleHandoverAudit setHandoverStatus(String handoverStatus) {
        this.handoverStatus = handoverStatus;
        return this;
    }

    public BigDecimal getSocReading() {
        return this.socReading;
    }

    public VehicleHandoverAudit setSocReading(BigDecimal socReading) {
        this.socReading = socReading;
        return this;
    }

    public BigDecimal getOdometerReading() {
        return this.odometerReading;
    }

    public VehicleHandoverAudit setOdometerReading(BigDecimal odometerReading) {
        this.odometerReading = odometerReading;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public VehicleHandoverAudit setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public VehicleHandoverAudit setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public VehicleHandoverAudit setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public VehicleHandoverAudit setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public VehicleHandoverAudit setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public UInteger getHubId() {
        return this.hubId;
    }

    public VehicleHandoverAudit setHubId(UInteger hubId) {
        this.hubId = hubId;
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
        final VehicleHandoverAudit other = (VehicleHandoverAudit) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (auditId == null) {
            if (other.auditId != null)
                return false;
        }
        else if (!auditId.equals(other.auditId))
            return false;
        if (fromId == null) {
            if (other.fromId != null)
                return false;
        }
        else if (!fromId.equals(other.fromId))
            return false;
        if (toId == null) {
            if (other.toId != null)
                return false;
        }
        else if (!toId.equals(other.toId))
            return false;
        if (vehicleNumber == null) {
            if (other.vehicleNumber != null)
                return false;
        }
        else if (!vehicleNumber.equals(other.vehicleNumber))
            return false;
        if (handoverType == null) {
            if (other.handoverType != null)
                return false;
        }
        else if (!handoverType.equals(other.handoverType))
            return false;
        if (handoverStatus == null) {
            if (other.handoverStatus != null)
                return false;
        }
        else if (!handoverStatus.equals(other.handoverStatus))
            return false;
        if (socReading == null) {
            if (other.socReading != null)
                return false;
        }
        else if (!socReading.equals(other.socReading))
            return false;
        if (odometerReading == null) {
            if (other.odometerReading != null)
                return false;
        }
        else if (!odometerReading.equals(other.odometerReading))
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
        if (hubId == null) {
            if (other.hubId != null)
                return false;
        }
        else if (!hubId.equals(other.hubId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.auditId == null) ? 0 : this.auditId.hashCode());
        result = prime * result + ((this.fromId == null) ? 0 : this.fromId.hashCode());
        result = prime * result + ((this.toId == null) ? 0 : this.toId.hashCode());
        result = prime * result + ((this.vehicleNumber == null) ? 0 : this.vehicleNumber.hashCode());
        result = prime * result + ((this.handoverType == null) ? 0 : this.handoverType.hashCode());
        result = prime * result + ((this.handoverStatus == null) ? 0 : this.handoverStatus.hashCode());
        result = prime * result + ((this.socReading == null) ? 0 : this.socReading.hashCode());
        result = prime * result + ((this.odometerReading == null) ? 0 : this.odometerReading.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.hubId == null) ? 0 : this.hubId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VehicleHandoverAudit (");

        sb.append(id);
        sb.append(", ").append(auditId);
        sb.append(", ").append(fromId);
        sb.append(", ").append(toId);
        sb.append(", ").append(vehicleNumber);
        sb.append(", ").append(handoverType);
        sb.append(", ").append(handoverStatus);
        sb.append(", ").append(socReading);
        sb.append(", ").append(odometerReading);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(hubId);

        sb.append(")");
        return sb.toString();
    }
}
