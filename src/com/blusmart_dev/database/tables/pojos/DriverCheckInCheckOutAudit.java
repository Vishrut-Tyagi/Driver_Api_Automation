/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverCheckInCheckOutAudit implements Serializable {

    private static final long serialVersionUID = -1539140013;

    private Integer dutyId;
    private Integer punchId;
    private Integer checkinHub;
    private Integer checkoutHub;
    private Byte    isActive;
    private Long    checkinTimestamp;
    private Long    checkoutTimestamp;
    private Byte    forcedCheckout;
    private String  remarks;
    private Long    createdAt;
    private Long    updatedAt;
    private Integer createdBy;
    private Integer updatedBy;

    public DriverCheckInCheckOutAudit() {}

    public DriverCheckInCheckOutAudit(DriverCheckInCheckOutAudit value) {
        this.dutyId = value.dutyId;
        this.punchId = value.punchId;
        this.checkinHub = value.checkinHub;
        this.checkoutHub = value.checkoutHub;
        this.isActive = value.isActive;
        this.checkinTimestamp = value.checkinTimestamp;
        this.checkoutTimestamp = value.checkoutTimestamp;
        this.forcedCheckout = value.forcedCheckout;
        this.remarks = value.remarks;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
    }

    public DriverCheckInCheckOutAudit(
        Integer dutyId,
        Integer punchId,
        Integer checkinHub,
        Integer checkoutHub,
        Byte    isActive,
        Long    checkinTimestamp,
        Long    checkoutTimestamp,
        Byte    forcedCheckout,
        String  remarks,
        Long    createdAt,
        Long    updatedAt,
        Integer createdBy,
        Integer updatedBy
    ) {
        this.dutyId = dutyId;
        this.punchId = punchId;
        this.checkinHub = checkinHub;
        this.checkoutHub = checkoutHub;
        this.isActive = isActive;
        this.checkinTimestamp = checkinTimestamp;
        this.checkoutTimestamp = checkoutTimestamp;
        this.forcedCheckout = forcedCheckout;
        this.remarks = remarks;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getDutyId() {
        return this.dutyId;
    }

    public DriverCheckInCheckOutAudit setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
        return this;
    }

    public Integer getPunchId() {
        return this.punchId;
    }

    public DriverCheckInCheckOutAudit setPunchId(Integer punchId) {
        this.punchId = punchId;
        return this;
    }

    public Integer getCheckinHub() {
        return this.checkinHub;
    }

    public DriverCheckInCheckOutAudit setCheckinHub(Integer checkinHub) {
        this.checkinHub = checkinHub;
        return this;
    }

    public Integer getCheckoutHub() {
        return this.checkoutHub;
    }

    public DriverCheckInCheckOutAudit setCheckoutHub(Integer checkoutHub) {
        this.checkoutHub = checkoutHub;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public DriverCheckInCheckOutAudit setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCheckinTimestamp() {
        return this.checkinTimestamp;
    }

    public DriverCheckInCheckOutAudit setCheckinTimestamp(Long checkinTimestamp) {
        this.checkinTimestamp = checkinTimestamp;
        return this;
    }

    public Long getCheckoutTimestamp() {
        return this.checkoutTimestamp;
    }

    public DriverCheckInCheckOutAudit setCheckoutTimestamp(Long checkoutTimestamp) {
        this.checkoutTimestamp = checkoutTimestamp;
        return this;
    }

    public Byte getForcedCheckout() {
        return this.forcedCheckout;
    }

    public DriverCheckInCheckOutAudit setForcedCheckout(Byte forcedCheckout) {
        this.forcedCheckout = forcedCheckout;
        return this;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public DriverCheckInCheckOutAudit setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public DriverCheckInCheckOutAudit setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public DriverCheckInCheckOutAudit setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public DriverCheckInCheckOutAudit setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public DriverCheckInCheckOutAudit setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
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
        final DriverCheckInCheckOutAudit other = (DriverCheckInCheckOutAudit) obj;
        if (dutyId == null) {
            if (other.dutyId != null)
                return false;
        }
        else if (!dutyId.equals(other.dutyId))
            return false;
        if (punchId == null) {
            if (other.punchId != null)
                return false;
        }
        else if (!punchId.equals(other.punchId))
            return false;
        if (checkinHub == null) {
            if (other.checkinHub != null)
                return false;
        }
        else if (!checkinHub.equals(other.checkinHub))
            return false;
        if (checkoutHub == null) {
            if (other.checkoutHub != null)
                return false;
        }
        else if (!checkoutHub.equals(other.checkoutHub))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (checkinTimestamp == null) {
            if (other.checkinTimestamp != null)
                return false;
        }
        else if (!checkinTimestamp.equals(other.checkinTimestamp))
            return false;
        if (checkoutTimestamp == null) {
            if (other.checkoutTimestamp != null)
                return false;
        }
        else if (!checkoutTimestamp.equals(other.checkoutTimestamp))
            return false;
        if (forcedCheckout == null) {
            if (other.forcedCheckout != null)
                return false;
        }
        else if (!forcedCheckout.equals(other.forcedCheckout))
            return false;
        if (remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!remarks.equals(other.remarks))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!updatedAt.equals(other.updatedAt))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.dutyId == null) ? 0 : this.dutyId.hashCode());
        result = prime * result + ((this.punchId == null) ? 0 : this.punchId.hashCode());
        result = prime * result + ((this.checkinHub == null) ? 0 : this.checkinHub.hashCode());
        result = prime * result + ((this.checkoutHub == null) ? 0 : this.checkoutHub.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.checkinTimestamp == null) ? 0 : this.checkinTimestamp.hashCode());
        result = prime * result + ((this.checkoutTimestamp == null) ? 0 : this.checkoutTimestamp.hashCode());
        result = prime * result + ((this.forcedCheckout == null) ? 0 : this.forcedCheckout.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DriverCheckInCheckOutAudit (");

        sb.append(dutyId);
        sb.append(", ").append(punchId);
        sb.append(", ").append(checkinHub);
        sb.append(", ").append(checkoutHub);
        sb.append(", ").append(isActive);
        sb.append(", ").append(checkinTimestamp);
        sb.append(", ").append(checkoutTimestamp);
        sb.append(", ").append(forcedCheckout);
        sb.append(", ").append(remarks);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }
}
