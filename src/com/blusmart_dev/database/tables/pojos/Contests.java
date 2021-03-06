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
public class Contests implements Serializable {

    private static final long serialVersionUID = 2051870349;

    private UInteger id;
    private String   contestName;
    private String   description;
    private Long     contestStartTimestamp;
    private Long     contestEndTimestamp;
    private Long     endVisibilityTimestamp;
    private Long     applicableTimestamp;
    private Long     visibilityTimestamp;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;
    private String   otherFlags;

    public Contests() {}

    public Contests(Contests value) {
        this.id = value.id;
        this.contestName = value.contestName;
        this.description = value.description;
        this.contestStartTimestamp = value.contestStartTimestamp;
        this.contestEndTimestamp = value.contestEndTimestamp;
        this.endVisibilityTimestamp = value.endVisibilityTimestamp;
        this.applicableTimestamp = value.applicableTimestamp;
        this.visibilityTimestamp = value.visibilityTimestamp;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.otherFlags = value.otherFlags;
    }

    public Contests(
        UInteger id,
        String   contestName,
        String   description,
        Long     contestStartTimestamp,
        Long     contestEndTimestamp,
        Long     endVisibilityTimestamp,
        Long     applicableTimestamp,
        Long     visibilityTimestamp,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt,
        String   otherFlags
    ) {
        this.id = id;
        this.contestName = contestName;
        this.description = description;
        this.contestStartTimestamp = contestStartTimestamp;
        this.contestEndTimestamp = contestEndTimestamp;
        this.endVisibilityTimestamp = endVisibilityTimestamp;
        this.applicableTimestamp = applicableTimestamp;
        this.visibilityTimestamp = visibilityTimestamp;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedAt = lastUpdatedAt;
        this.otherFlags = otherFlags;
    }

    public UInteger getId() {
        return this.id;
    }

    public Contests setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getContestName() {
        return this.contestName;
    }

    public Contests setContestName(String contestName) {
        this.contestName = contestName;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Contests setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getContestStartTimestamp() {
        return this.contestStartTimestamp;
    }

    public Contests setContestStartTimestamp(Long contestStartTimestamp) {
        this.contestStartTimestamp = contestStartTimestamp;
        return this;
    }

    public Long getContestEndTimestamp() {
        return this.contestEndTimestamp;
    }

    public Contests setContestEndTimestamp(Long contestEndTimestamp) {
        this.contestEndTimestamp = contestEndTimestamp;
        return this;
    }

    public Long getEndVisibilityTimestamp() {
        return this.endVisibilityTimestamp;
    }

    public Contests setEndVisibilityTimestamp(Long endVisibilityTimestamp) {
        this.endVisibilityTimestamp = endVisibilityTimestamp;
        return this;
    }

    public Long getApplicableTimestamp() {
        return this.applicableTimestamp;
    }

    public Contests setApplicableTimestamp(Long applicableTimestamp) {
        this.applicableTimestamp = applicableTimestamp;
        return this;
    }

    public Long getVisibilityTimestamp() {
        return this.visibilityTimestamp;
    }

    public Contests setVisibilityTimestamp(Long visibilityTimestamp) {
        this.visibilityTimestamp = visibilityTimestamp;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public Contests setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public Contests setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Contests setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public Contests setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Contests setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public String getOtherFlags() {
        return this.otherFlags;
    }

    public Contests setOtherFlags(String otherFlags) {
        this.otherFlags = otherFlags;
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
        final Contests other = (Contests) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (contestName == null) {
            if (other.contestName != null)
                return false;
        }
        else if (!contestName.equals(other.contestName))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (contestStartTimestamp == null) {
            if (other.contestStartTimestamp != null)
                return false;
        }
        else if (!contestStartTimestamp.equals(other.contestStartTimestamp))
            return false;
        if (contestEndTimestamp == null) {
            if (other.contestEndTimestamp != null)
                return false;
        }
        else if (!contestEndTimestamp.equals(other.contestEndTimestamp))
            return false;
        if (endVisibilityTimestamp == null) {
            if (other.endVisibilityTimestamp != null)
                return false;
        }
        else if (!endVisibilityTimestamp.equals(other.endVisibilityTimestamp))
            return false;
        if (applicableTimestamp == null) {
            if (other.applicableTimestamp != null)
                return false;
        }
        else if (!applicableTimestamp.equals(other.applicableTimestamp))
            return false;
        if (visibilityTimestamp == null) {
            if (other.visibilityTimestamp != null)
                return false;
        }
        else if (!visibilityTimestamp.equals(other.visibilityTimestamp))
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
        if (otherFlags == null) {
            if (other.otherFlags != null)
                return false;
        }
        else if (!otherFlags.equals(other.otherFlags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.contestName == null) ? 0 : this.contestName.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.contestStartTimestamp == null) ? 0 : this.contestStartTimestamp.hashCode());
        result = prime * result + ((this.contestEndTimestamp == null) ? 0 : this.contestEndTimestamp.hashCode());
        result = prime * result + ((this.endVisibilityTimestamp == null) ? 0 : this.endVisibilityTimestamp.hashCode());
        result = prime * result + ((this.applicableTimestamp == null) ? 0 : this.applicableTimestamp.hashCode());
        result = prime * result + ((this.visibilityTimestamp == null) ? 0 : this.visibilityTimestamp.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.lastUpdatedAt == null) ? 0 : this.lastUpdatedAt.hashCode());
        result = prime * result + ((this.otherFlags == null) ? 0 : this.otherFlags.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contests (");

        sb.append(id);
        sb.append(", ").append(contestName);
        sb.append(", ").append(description);
        sb.append(", ").append(contestStartTimestamp);
        sb.append(", ").append(contestEndTimestamp);
        sb.append(", ").append(endVisibilityTimestamp);
        sb.append(", ").append(applicableTimestamp);
        sb.append(", ").append(visibilityTimestamp);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(lastUpdatedAt);
        sb.append(", ").append(otherFlags);

        sb.append(")");
        return sb.toString();
    }
}
