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
public class RiderTrustedContacts implements Serializable {

    private static final long serialVersionUID = -1297455906;

    private UInteger riderId;
    private String   firstName;
    private String   lastName;
    private String   phoneNumber;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private UInteger id;
    private String   color;
    private UInteger contactRiderId;

    public RiderTrustedContacts() {}

    public RiderTrustedContacts(RiderTrustedContacts value) {
        this.riderId = value.riderId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.phoneNumber = value.phoneNumber;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.id = value.id;
        this.color = value.color;
        this.contactRiderId = value.contactRiderId;
    }

    public RiderTrustedContacts(
        UInteger riderId,
        String   firstName,
        String   lastName,
        String   phoneNumber,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        UInteger id,
        String   color,
        UInteger contactRiderId
    ) {
        this.riderId = riderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.id = id;
        this.color = color;
        this.contactRiderId = contactRiderId;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public RiderTrustedContacts setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public RiderTrustedContacts setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return this.lastName;
    }

    public RiderTrustedContacts setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public RiderTrustedContacts setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public RiderTrustedContacts setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public RiderTrustedContacts setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public RiderTrustedContacts setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public RiderTrustedContacts setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public RiderTrustedContacts setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public UInteger getId() {
        return this.id;
    }

    public RiderTrustedContacts setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public RiderTrustedContacts setColor(String color) {
        this.color = color;
        return this;
    }

    public UInteger getContactRiderId() {
        return this.contactRiderId;
    }

    public RiderTrustedContacts setContactRiderId(UInteger contactRiderId) {
        this.contactRiderId = contactRiderId;
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
        final RiderTrustedContacts other = (RiderTrustedContacts) obj;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        }
        else if (!phoneNumber.equals(other.phoneNumber))
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
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        }
        else if (!color.equals(other.color))
            return false;
        if (contactRiderId == null) {
            if (other.contactRiderId != null)
                return false;
        }
        else if (!contactRiderId.equals(other.contactRiderId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.phoneNumber == null) ? 0 : this.phoneNumber.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.color == null) ? 0 : this.color.hashCode());
        result = prime * result + ((this.contactRiderId == null) ? 0 : this.contactRiderId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiderTrustedContacts (");

        sb.append(riderId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(id);
        sb.append(", ").append(color);
        sb.append(", ").append(contactRiderId);

        sb.append(")");
        return sb.toString();
    }
}
