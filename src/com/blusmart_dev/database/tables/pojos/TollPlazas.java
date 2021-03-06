/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TollPlazas implements Serializable {

    private static final long serialVersionUID = 473269491;

    private Integer id;
    private Integer plazaId;
    private String  plazaName;
    private Integer isActive;
    private Long    createdTimestamp;
    private Long    lastUpdatedTimestamp;
    private Integer createdBy;
    private Integer lastUpdatedBy;
    private String  plazaType;
    private String  type;
    private String  city;
    private String  plazaState;
    private String  concessionaire;

    public TollPlazas() {}

    public TollPlazas(TollPlazas value) {
        this.id = value.id;
        this.plazaId = value.plazaId;
        this.plazaName = value.plazaName;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.plazaType = value.plazaType;
        this.type = value.type;
        this.city = value.city;
        this.plazaState = value.plazaState;
        this.concessionaire = value.concessionaire;
    }

    public TollPlazas(
        Integer id,
        Integer plazaId,
        String  plazaName,
        Integer isActive,
        Long    createdTimestamp,
        Long    lastUpdatedTimestamp,
        Integer createdBy,
        Integer lastUpdatedBy,
        String  plazaType,
        String  type,
        String  city,
        String  plazaState,
        String  concessionaire
    ) {
        this.id = id;
        this.plazaId = plazaId;
        this.plazaName = plazaName;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.plazaType = plazaType;
        this.type = type;
        this.city = city;
        this.plazaState = plazaState;
        this.concessionaire = concessionaire;
    }

    public Integer getId() {
        return this.id;
    }

    public TollPlazas setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPlazaId() {
        return this.plazaId;
    }

    public TollPlazas setPlazaId(Integer plazaId) {
        this.plazaId = plazaId;
        return this;
    }

    public String getPlazaName() {
        return this.plazaName;
    }

    public TollPlazas setPlazaName(String plazaName) {
        this.plazaName = plazaName;
        return this;
    }

    public Integer getIsActive() {
        return this.isActive;
    }

    public TollPlazas setIsActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public TollPlazas setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public TollPlazas setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public TollPlazas setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Integer getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public TollPlazas setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getPlazaType() {
        return this.plazaType;
    }

    public TollPlazas setPlazaType(String plazaType) {
        this.plazaType = plazaType;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TollPlazas setType(String type) {
        this.type = type;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public TollPlazas setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPlazaState() {
        return this.plazaState;
    }

    public TollPlazas setPlazaState(String plazaState) {
        this.plazaState = plazaState;
        return this;
    }

    public String getConcessionaire() {
        return this.concessionaire;
    }

    public TollPlazas setConcessionaire(String concessionaire) {
        this.concessionaire = concessionaire;
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
        final TollPlazas other = (TollPlazas) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (plazaId == null) {
            if (other.plazaId != null)
                return false;
        }
        else if (!plazaId.equals(other.plazaId))
            return false;
        if (plazaName == null) {
            if (other.plazaName != null)
                return false;
        }
        else if (!plazaName.equals(other.plazaName))
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
        if (plazaType == null) {
            if (other.plazaType != null)
                return false;
        }
        else if (!plazaType.equals(other.plazaType))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (plazaState == null) {
            if (other.plazaState != null)
                return false;
        }
        else if (!plazaState.equals(other.plazaState))
            return false;
        if (concessionaire == null) {
            if (other.concessionaire != null)
                return false;
        }
        else if (!concessionaire.equals(other.concessionaire))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.plazaId == null) ? 0 : this.plazaId.hashCode());
        result = prime * result + ((this.plazaName == null) ? 0 : this.plazaName.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.plazaType == null) ? 0 : this.plazaType.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.plazaState == null) ? 0 : this.plazaState.hashCode());
        result = prime * result + ((this.concessionaire == null) ? 0 : this.concessionaire.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TollPlazas (");

        sb.append(id);
        sb.append(", ").append(plazaId);
        sb.append(", ").append(plazaName);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(plazaType);
        sb.append(", ").append(type);
        sb.append(", ").append(city);
        sb.append(", ").append(plazaState);
        sb.append(", ").append(concessionaire);

        sb.append(")");
        return sb.toString();
    }
}
