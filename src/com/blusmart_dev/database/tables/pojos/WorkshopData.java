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
public class WorkshopData implements Serializable {

    private static final long serialVersionUID = -736152580;

    private UInteger   id;
    private String     workshopName;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer    createdBy;
    private Integer    updatedBy;
    private Long       createdAt;
    private Long       lastUpdatedAt;
    private Byte       isActive;
    private String     oem;
    private String     area;
    private String     address;
    private String     contactPerson;
    private String     contactNumber;

    public WorkshopData() {}

    public WorkshopData(WorkshopData value) {
        this.id = value.id;
        this.workshopName = value.workshopName;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
        this.createdBy = value.createdBy;
        this.updatedBy = value.updatedBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.isActive = value.isActive;
        this.oem = value.oem;
        this.area = value.area;
        this.address = value.address;
        this.contactPerson = value.contactPerson;
        this.contactNumber = value.contactNumber;
    }

    public WorkshopData(
        UInteger   id,
        String     workshopName,
        BigDecimal latitude,
        BigDecimal longitude,
        Integer    createdBy,
        Integer    updatedBy,
        Long       createdAt,
        Long       lastUpdatedAt,
        Byte       isActive,
        String     oem,
        String     area,
        String     address,
        String     contactPerson,
        String     contactNumber
    ) {
        this.id = id;
        this.workshopName = workshopName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.lastUpdatedAt = lastUpdatedAt;
        this.isActive = isActive;
        this.oem = oem;
        this.area = area;
        this.address = address;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
    }

    public UInteger getId() {
        return this.id;
    }

    public WorkshopData setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getWorkshopName() {
        return this.workshopName;
    }

    public WorkshopData setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
        return this;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public WorkshopData setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public WorkshopData setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public WorkshopData setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public WorkshopData setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public WorkshopData setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public WorkshopData setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public WorkshopData setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public String getOem() {
        return this.oem;
    }

    public WorkshopData setOem(String oem) {
        this.oem = oem;
        return this;
    }

    public String getArea() {
        return this.area;
    }

    public WorkshopData setArea(String area) {
        this.area = area;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public WorkshopData setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public WorkshopData setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public WorkshopData setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
        final WorkshopData other = (WorkshopData) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (workshopName == null) {
            if (other.workshopName != null)
                return false;
        }
        else if (!workshopName.equals(other.workshopName))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        }
        else if (!latitude.equals(other.latitude))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        }
        else if (!longitude.equals(other.longitude))
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
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (lastUpdatedAt == null) {
            if (other.lastUpdatedAt != null)
                return false;
        }
        else if (!lastUpdatedAt.equals(other.lastUpdatedAt))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (oem == null) {
            if (other.oem != null)
                return false;
        }
        else if (!oem.equals(other.oem))
            return false;
        if (area == null) {
            if (other.area != null)
                return false;
        }
        else if (!area.equals(other.area))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        }
        else if (!address.equals(other.address))
            return false;
        if (contactPerson == null) {
            if (other.contactPerson != null)
                return false;
        }
        else if (!contactPerson.equals(other.contactPerson))
            return false;
        if (contactNumber == null) {
            if (other.contactNumber != null)
                return false;
        }
        else if (!contactNumber.equals(other.contactNumber))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.workshopName == null) ? 0 : this.workshopName.hashCode());
        result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
        result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.oem == null) ? 0 : this.oem.hashCode());
        result = prime * result + ((this.area == null) ? 0 : this.area.hashCode());
        result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
        result = prime * result + ((this.contactPerson == null) ? 0 : this.contactPerson.hashCode());
        result = prime * result + ((this.contactNumber == null) ? 0 : this.contactNumber.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkshopData (");

        sb.append(id);
        sb.append(", ").append(workshopName);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(isActive);
        sb.append(", ").append(oem);
        sb.append(", ").append(area);
        sb.append(", ").append(address);
        sb.append(", ").append(contactPerson);
        sb.append(", ").append(contactNumber);

        sb.append(")");
        return sb.toString();
    }
}
