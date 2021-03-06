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
public class ContestsEnrollment implements Serializable {

    private static final long serialVersionUID = 2066852892;

    private UInteger id;
    private UInteger contestId;
    private UInteger riderId;
    private Long     enrollmentTimestamp;
    private Integer  currentScore;
    private Integer  currentRank;
    private Integer  prevRank;
    private Byte     isActive;
    private UInteger createdBy;
    private Long     createdAt;
    private UInteger lastUpdatedBy;
    private Long     lastUpdatedAt;
    private String   otherFlags;

    public ContestsEnrollment() {}

    public ContestsEnrollment(ContestsEnrollment value) {
        this.id = value.id;
        this.contestId = value.contestId;
        this.riderId = value.riderId;
        this.enrollmentTimestamp = value.enrollmentTimestamp;
        this.currentScore = value.currentScore;
        this.currentRank = value.currentRank;
        this.prevRank = value.prevRank;
        this.isActive = value.isActive;
        this.createdBy = value.createdBy;
        this.createdAt = value.createdAt;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.lastUpdatedAt = value.lastUpdatedAt;
        this.otherFlags = value.otherFlags;
    }

    public ContestsEnrollment(
        UInteger id,
        UInteger contestId,
        UInteger riderId,
        Long     enrollmentTimestamp,
        Integer  currentScore,
        Integer  currentRank,
        Integer  prevRank,
        Byte     isActive,
        UInteger createdBy,
        Long     createdAt,
        UInteger lastUpdatedBy,
        Long     lastUpdatedAt,
        String   otherFlags
    ) {
        this.id = id;
        this.contestId = contestId;
        this.riderId = riderId;
        this.enrollmentTimestamp = enrollmentTimestamp;
        this.currentScore = currentScore;
        this.currentRank = currentRank;
        this.prevRank = prevRank;
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

    public ContestsEnrollment setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getContestId() {
        return this.contestId;
    }

    public ContestsEnrollment setContestId(UInteger contestId) {
        this.contestId = contestId;
        return this;
    }

    public UInteger getRiderId() {
        return this.riderId;
    }

    public ContestsEnrollment setRiderId(UInteger riderId) {
        this.riderId = riderId;
        return this;
    }

    public Long getEnrollmentTimestamp() {
        return this.enrollmentTimestamp;
    }

    public ContestsEnrollment setEnrollmentTimestamp(Long enrollmentTimestamp) {
        this.enrollmentTimestamp = enrollmentTimestamp;
        return this;
    }

    public Integer getCurrentScore() {
        return this.currentScore;
    }

    public ContestsEnrollment setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
        return this;
    }

    public Integer getCurrentRank() {
        return this.currentRank;
    }

    public ContestsEnrollment setCurrentRank(Integer currentRank) {
        this.currentRank = currentRank;
        return this;
    }

    public Integer getPrevRank() {
        return this.prevRank;
    }

    public ContestsEnrollment setPrevRank(Integer prevRank) {
        this.prevRank = prevRank;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public ContestsEnrollment setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public ContestsEnrollment setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ContestsEnrollment setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public ContestsEnrollment setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public Long getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public ContestsEnrollment setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public String getOtherFlags() {
        return this.otherFlags;
    }

    public ContestsEnrollment setOtherFlags(String otherFlags) {
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
        final ContestsEnrollment other = (ContestsEnrollment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (contestId == null) {
            if (other.contestId != null)
                return false;
        }
        else if (!contestId.equals(other.contestId))
            return false;
        if (riderId == null) {
            if (other.riderId != null)
                return false;
        }
        else if (!riderId.equals(other.riderId))
            return false;
        if (enrollmentTimestamp == null) {
            if (other.enrollmentTimestamp != null)
                return false;
        }
        else if (!enrollmentTimestamp.equals(other.enrollmentTimestamp))
            return false;
        if (currentScore == null) {
            if (other.currentScore != null)
                return false;
        }
        else if (!currentScore.equals(other.currentScore))
            return false;
        if (currentRank == null) {
            if (other.currentRank != null)
                return false;
        }
        else if (!currentRank.equals(other.currentRank))
            return false;
        if (prevRank == null) {
            if (other.prevRank != null)
                return false;
        }
        else if (!prevRank.equals(other.prevRank))
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
        result = prime * result + ((this.contestId == null) ? 0 : this.contestId.hashCode());
        result = prime * result + ((this.riderId == null) ? 0 : this.riderId.hashCode());
        result = prime * result + ((this.enrollmentTimestamp == null) ? 0 : this.enrollmentTimestamp.hashCode());
        result = prime * result + ((this.currentScore == null) ? 0 : this.currentScore.hashCode());
        result = prime * result + ((this.currentRank == null) ? 0 : this.currentRank.hashCode());
        result = prime * result + ((this.prevRank == null) ? 0 : this.prevRank.hashCode());
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
        StringBuilder sb = new StringBuilder("ContestsEnrollment (");

        sb.append(id);
        sb.append(", ").append(contestId);
        sb.append(", ").append(riderId);
        sb.append(", ").append(enrollmentTimestamp);
        sb.append(", ").append(currentScore);
        sb.append(", ").append(currentRank);
        sb.append(", ").append(prevRank);
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
