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
public class Bounds implements Serializable {

    private static final long serialVersionUID = 1395718006;

    private Integer  id;
    private String   locationKey;
    private String   boundsData;
    private Long     createdTimestamp;
    private Long     lastUpdatedTimestamp;
    private UInteger createdBy;
    private UInteger lastUpdatedBy;
    private String   kmlFile;
    private String   geometryType;
    private String   allowedLocationTags;
    private String   kmlFilePath;

    public Bounds() {}

    public Bounds(Bounds value) {
        this.id = value.id;
        this.locationKey = value.locationKey;
        this.boundsData = value.boundsData;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.kmlFile = value.kmlFile;
        this.geometryType = value.geometryType;
        this.allowedLocationTags = value.allowedLocationTags;
        this.kmlFilePath = value.kmlFilePath;
    }

    public Bounds(
        Integer  id,
        String   locationKey,
        String   boundsData,
        Long     createdTimestamp,
        Long     lastUpdatedTimestamp,
        UInteger createdBy,
        UInteger lastUpdatedBy,
        String   kmlFile,
        String   geometryType,
        String   allowedLocationTags,
        String   kmlFilePath
    ) {
        this.id = id;
        this.locationKey = locationKey;
        this.boundsData = boundsData;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.kmlFile = kmlFile;
        this.geometryType = geometryType;
        this.allowedLocationTags = allowedLocationTags;
        this.kmlFilePath = kmlFilePath;
    }

    public Integer getId() {
        return this.id;
    }

    public Bounds setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLocationKey() {
        return this.locationKey;
    }

    public Bounds setLocationKey(String locationKey) {
        this.locationKey = locationKey;
        return this;
    }

    public String getBoundsData() {
        return this.boundsData;
    }

    public Bounds setBoundsData(String boundsData) {
        this.boundsData = boundsData;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Bounds setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public Bounds setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public Bounds setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public Bounds setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getKmlFile() {
        return this.kmlFile;
    }

    public Bounds setKmlFile(String kmlFile) {
        this.kmlFile = kmlFile;
        return this;
    }

    public String getGeometryType() {
        return this.geometryType;
    }

    public Bounds setGeometryType(String geometryType) {
        this.geometryType = geometryType;
        return this;
    }

    public String getAllowedLocationTags() {
        return this.allowedLocationTags;
    }

    public Bounds setAllowedLocationTags(String allowedLocationTags) {
        this.allowedLocationTags = allowedLocationTags;
        return this;
    }

    public String getKmlFilePath() {
        return this.kmlFilePath;
    }

    public Bounds setKmlFilePath(String kmlFilePath) {
        this.kmlFilePath = kmlFilePath;
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
        final Bounds other = (Bounds) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (locationKey == null) {
            if (other.locationKey != null)
                return false;
        }
        else if (!locationKey.equals(other.locationKey))
            return false;
        if (boundsData == null) {
            if (other.boundsData != null)
                return false;
        }
        else if (!boundsData.equals(other.boundsData))
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
        if (kmlFile == null) {
            if (other.kmlFile != null)
                return false;
        }
        else if (!kmlFile.equals(other.kmlFile))
            return false;
        if (geometryType == null) {
            if (other.geometryType != null)
                return false;
        }
        else if (!geometryType.equals(other.geometryType))
            return false;
        if (allowedLocationTags == null) {
            if (other.allowedLocationTags != null)
                return false;
        }
        else if (!allowedLocationTags.equals(other.allowedLocationTags))
            return false;
        if (kmlFilePath == null) {
            if (other.kmlFilePath != null)
                return false;
        }
        else if (!kmlFilePath.equals(other.kmlFilePath))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.locationKey == null) ? 0 : this.locationKey.hashCode());
        result = prime * result + ((this.boundsData == null) ? 0 : this.boundsData.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.kmlFile == null) ? 0 : this.kmlFile.hashCode());
        result = prime * result + ((this.geometryType == null) ? 0 : this.geometryType.hashCode());
        result = prime * result + ((this.allowedLocationTags == null) ? 0 : this.allowedLocationTags.hashCode());
        result = prime * result + ((this.kmlFilePath == null) ? 0 : this.kmlFilePath.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bounds (");

        sb.append(id);
        sb.append(", ").append(locationKey);
        sb.append(", ").append(boundsData);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(kmlFile);
        sb.append(", ").append(geometryType);
        sb.append(", ").append(allowedLocationTags);
        sb.append(", ").append(kmlFilePath);

        sb.append(")");
        return sb.toString();
    }
}
