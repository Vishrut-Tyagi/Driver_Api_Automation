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
public class InvoicePrefixCounter implements Serializable {

    private static final long serialVersionUID = 1767742405;

    private UInteger id;
    private String   prefix;
    private String   value;
    private String   year;
    private Long     applicableTimestamp;
    private Integer  currentCount;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;

    public InvoicePrefixCounter() {}

    public InvoicePrefixCounter(InvoicePrefixCounter value) {
        this.id = value.id;
        this.prefix = value.prefix;
        this.value = value.value;
        this.year = value.year;
        this.applicableTimestamp = value.applicableTimestamp;
        this.currentCount = value.currentCount;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
    }

    public InvoicePrefixCounter(
        UInteger id,
        String   prefix,
        String   value,
        String   year,
        Long     applicableTimestamp,
        Integer  currentCount,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt
    ) {
        this.id = id;
        this.prefix = prefix;
        this.value = value;
        this.year = year;
        this.applicableTimestamp = applicableTimestamp;
        this.currentCount = currentCount;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public UInteger getId() {
        return this.id;
    }

    public InvoicePrefixCounter setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public InvoicePrefixCounter setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public InvoicePrefixCounter setValue(String value) {
        this.value = value;
        return this;
    }

    public String getYear() {
        return this.year;
    }

    public InvoicePrefixCounter setYear(String year) {
        this.year = year;
        return this;
    }

    public Long getApplicableTimestamp() {
        return this.applicableTimestamp;
    }

    public InvoicePrefixCounter setApplicableTimestamp(Long applicableTimestamp) {
        this.applicableTimestamp = applicableTimestamp;
        return this;
    }

    public Integer getCurrentCount() {
        return this.currentCount;
    }

    public InvoicePrefixCounter setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public InvoicePrefixCounter setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public InvoicePrefixCounter setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public InvoicePrefixCounter setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public InvoicePrefixCounter setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public InvoicePrefixCounter setLastUpdatedAt(Long lastUpdatedAt) {
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
        final InvoicePrefixCounter other = (InvoicePrefixCounter) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (prefix == null) {
            if (other.prefix != null)
                return false;
        }
        else if (!prefix.equals(other.prefix))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        }
        else if (!value.equals(other.value))
            return false;
        if (year == null) {
            if (other.year != null)
                return false;
        }
        else if (!year.equals(other.year))
            return false;
        if (applicableTimestamp == null) {
            if (other.applicableTimestamp != null)
                return false;
        }
        else if (!applicableTimestamp.equals(other.applicableTimestamp))
            return false;
        if (currentCount == null) {
            if (other.currentCount != null)
                return false;
        }
        else if (!currentCount.equals(other.currentCount))
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
        result = prime * result + ((this.prefix == null) ? 0 : this.prefix.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
        result = prime * result + ((this.year == null) ? 0 : this.year.hashCode());
        result = prime * result + ((this.applicableTimestamp == null) ? 0 : this.applicableTimestamp.hashCode());
        result = prime * result + ((this.currentCount == null) ? 0 : this.currentCount.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InvoicePrefixCounter (");

        sb.append(id);
        sb.append(", ").append(prefix);
        sb.append(", ").append(value);
        sb.append(", ").append(year);
        sb.append(", ").append(applicableTimestamp);
        sb.append(", ").append(currentCount);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);

        sb.append(")");
        return sb.toString();
    }
}
