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
public class BlockRegionBoundsMapping implements Serializable {

    private static final long serialVersionUID = 1546554226;

    private UInteger id;
    private UInteger blockRegionId;
    private UInteger boundsId;
    private Byte     isActive;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;

    public BlockRegionBoundsMapping() {}

    public BlockRegionBoundsMapping(BlockRegionBoundsMapping value) {
        this.id = value.id;
        this.blockRegionId = value.blockRegionId;
        this.boundsId = value.boundsId;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
    }

    public BlockRegionBoundsMapping(
        UInteger id,
        UInteger blockRegionId,
        UInteger boundsId,
        Byte     isActive,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy
    ) {
        this.id = id;
        this.blockRegionId = blockRegionId;
        this.boundsId = boundsId;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public UInteger getId() {
        return this.id;
    }

    public BlockRegionBoundsMapping setId(UInteger id) {
        this.id = id;
        return this;
    }

    public UInteger getBlockRegionId() {
        return this.blockRegionId;
    }

    public BlockRegionBoundsMapping setBlockRegionId(UInteger blockRegionId) {
        this.blockRegionId = blockRegionId;
        return this;
    }

    public UInteger getBoundsId() {
        return this.boundsId;
    }

    public BlockRegionBoundsMapping setBoundsId(UInteger boundsId) {
        this.boundsId = boundsId;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public BlockRegionBoundsMapping setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public BlockRegionBoundsMapping setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public BlockRegionBoundsMapping setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public BlockRegionBoundsMapping setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public BlockRegionBoundsMapping setLastUpdatedBy(UInteger lastUpdatedBy) {
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
        final BlockRegionBoundsMapping other = (BlockRegionBoundsMapping) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (blockRegionId == null) {
            if (other.blockRegionId != null)
                return false;
        }
        else if (!blockRegionId.equals(other.blockRegionId))
            return false;
        if (boundsId == null) {
            if (other.boundsId != null)
                return false;
        }
        else if (!boundsId.equals(other.boundsId))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.blockRegionId == null) ? 0 : this.blockRegionId.hashCode());
        result = prime * result + ((this.boundsId == null) ? 0 : this.boundsId.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BlockRegionBoundsMapping (");

        sb.append(id);
        sb.append(", ").append(blockRegionId);
        sb.append(", ").append(boundsId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);

        sb.append(")");
        return sb.toString();
    }
}