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
public class PartnerBookingsPayment implements Serializable {

    private static final long serialVersionUID = 646891426;

    private UInteger   id;
    private String     searchId;
    private BigDecimal totalAmount;
    private String     mode;
    private BigDecimal paidAmount;
    private BigDecimal unpaidAmount;
    private String     paymentStatus;
    private Byte       isActive;
    private String     notes;
    private Long       createdAt;
    private Long       updatedAt;
    private BigDecimal cashAmount;
    private UInteger   rideRequestId;

    public PartnerBookingsPayment() {}

    public PartnerBookingsPayment(PartnerBookingsPayment value) {
        this.id = value.id;
        this.searchId = value.searchId;
        this.totalAmount = value.totalAmount;
        this.mode = value.mode;
        this.paidAmount = value.paidAmount;
        this.unpaidAmount = value.unpaidAmount;
        this.paymentStatus = value.paymentStatus;
        this.isActive = value.isActive;
        this.notes = value.notes;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
        this.cashAmount = value.cashAmount;
        this.rideRequestId = value.rideRequestId;
    }

    public PartnerBookingsPayment(
        UInteger   id,
        String     searchId,
        BigDecimal totalAmount,
        String     mode,
        BigDecimal paidAmount,
        BigDecimal unpaidAmount,
        String     paymentStatus,
        Byte       isActive,
        String     notes,
        Long       createdAt,
        Long       updatedAt,
        BigDecimal cashAmount,
        UInteger   rideRequestId
    ) {
        this.id = id;
        this.searchId = searchId;
        this.totalAmount = totalAmount;
        this.mode = mode;
        this.paidAmount = paidAmount;
        this.unpaidAmount = unpaidAmount;
        this.paymentStatus = paymentStatus;
        this.isActive = isActive;
        this.notes = notes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cashAmount = cashAmount;
        this.rideRequestId = rideRequestId;
    }

    public UInteger getId() {
        return this.id;
    }

    public PartnerBookingsPayment setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public PartnerBookingsPayment setSearchId(String searchId) {
        this.searchId = searchId;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public PartnerBookingsPayment setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public String getMode() {
        return this.mode;
    }

    public PartnerBookingsPayment setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public BigDecimal getPaidAmount() {
        return this.paidAmount;
    }

    public PartnerBookingsPayment setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    public BigDecimal getUnpaidAmount() {
        return this.unpaidAmount;
    }

    public PartnerBookingsPayment setUnpaidAmount(BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
        return this;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public PartnerBookingsPayment setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public PartnerBookingsPayment setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public String getNotes() {
        return this.notes;
    }

    public PartnerBookingsPayment setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public PartnerBookingsPayment setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public PartnerBookingsPayment setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public BigDecimal getCashAmount() {
        return this.cashAmount;
    }

    public PartnerBookingsPayment setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    public UInteger getRideRequestId() {
        return this.rideRequestId;
    }

    public PartnerBookingsPayment setRideRequestId(UInteger rideRequestId) {
        this.rideRequestId = rideRequestId;
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
        final PartnerBookingsPayment other = (PartnerBookingsPayment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (searchId == null) {
            if (other.searchId != null)
                return false;
        }
        else if (!searchId.equals(other.searchId))
            return false;
        if (totalAmount == null) {
            if (other.totalAmount != null)
                return false;
        }
        else if (!totalAmount.equals(other.totalAmount))
            return false;
        if (mode == null) {
            if (other.mode != null)
                return false;
        }
        else if (!mode.equals(other.mode))
            return false;
        if (paidAmount == null) {
            if (other.paidAmount != null)
                return false;
        }
        else if (!paidAmount.equals(other.paidAmount))
            return false;
        if (unpaidAmount == null) {
            if (other.unpaidAmount != null)
                return false;
        }
        else if (!unpaidAmount.equals(other.unpaidAmount))
            return false;
        if (paymentStatus == null) {
            if (other.paymentStatus != null)
                return false;
        }
        else if (!paymentStatus.equals(other.paymentStatus))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (notes == null) {
            if (other.notes != null)
                return false;
        }
        else if (!notes.equals(other.notes))
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
        if (cashAmount == null) {
            if (other.cashAmount != null)
                return false;
        }
        else if (!cashAmount.equals(other.cashAmount))
            return false;
        if (rideRequestId == null) {
            if (other.rideRequestId != null)
                return false;
        }
        else if (!rideRequestId.equals(other.rideRequestId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.searchId == null) ? 0 : this.searchId.hashCode());
        result = prime * result + ((this.totalAmount == null) ? 0 : this.totalAmount.hashCode());
        result = prime * result + ((this.mode == null) ? 0 : this.mode.hashCode());
        result = prime * result + ((this.paidAmount == null) ? 0 : this.paidAmount.hashCode());
        result = prime * result + ((this.unpaidAmount == null) ? 0 : this.unpaidAmount.hashCode());
        result = prime * result + ((this.paymentStatus == null) ? 0 : this.paymentStatus.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.notes == null) ? 0 : this.notes.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.cashAmount == null) ? 0 : this.cashAmount.hashCode());
        result = prime * result + ((this.rideRequestId == null) ? 0 : this.rideRequestId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PartnerBookingsPayment (");

        sb.append(id);
        sb.append(", ").append(searchId);
        sb.append(", ").append(totalAmount);
        sb.append(", ").append(mode);
        sb.append(", ").append(paidAmount);
        sb.append(", ").append(unpaidAmount);
        sb.append(", ").append(paymentStatus);
        sb.append(", ").append(isActive);
        sb.append(", ").append(notes);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(cashAmount);
        sb.append(", ").append(rideRequestId);

        sb.append(")");
        return sb.toString();
    }
}