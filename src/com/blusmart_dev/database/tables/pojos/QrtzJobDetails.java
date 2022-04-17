/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzJobDetails implements Serializable {

    private static final long serialVersionUID = -1222238328;

    private String schedName;
    private String jobName;
    private String jobGroup;
    private String description;
    private String jobClassName;
    private String isDurable;
    private String isNonconcurrent;
    private String isUpdateData;
    private String requestsRecovery;
    private byte[] jobData;

    public QrtzJobDetails() {}

    public QrtzJobDetails(QrtzJobDetails value) {
        this.schedName = value.schedName;
        this.jobName = value.jobName;
        this.jobGroup = value.jobGroup;
        this.description = value.description;
        this.jobClassName = value.jobClassName;
        this.isDurable = value.isDurable;
        this.isNonconcurrent = value.isNonconcurrent;
        this.isUpdateData = value.isUpdateData;
        this.requestsRecovery = value.requestsRecovery;
        this.jobData = value.jobData;
    }

    public QrtzJobDetails(
        String schedName,
        String jobName,
        String jobGroup,
        String description,
        String jobClassName,
        String isDurable,
        String isNonconcurrent,
        String isUpdateData,
        String requestsRecovery,
        byte[] jobData
    ) {
        this.schedName = schedName;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.description = description;
        this.jobClassName = jobClassName;
        this.isDurable = isDurable;
        this.isNonconcurrent = isNonconcurrent;
        this.isUpdateData = isUpdateData;
        this.requestsRecovery = requestsRecovery;
        this.jobData = jobData;
    }

    public String getSchedName() {
        return this.schedName;
    }

    public QrtzJobDetails setSchedName(String schedName) {
        this.schedName = schedName;
        return this;
    }

    public String getJobName() {
        return this.jobName;
    }

    public QrtzJobDetails setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    public String getJobGroup() {
        return this.jobGroup;
    }

    public QrtzJobDetails setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public QrtzJobDetails setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getJobClassName() {
        return this.jobClassName;
    }

    public QrtzJobDetails setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
        return this;
    }

    public String getIsDurable() {
        return this.isDurable;
    }

    public QrtzJobDetails setIsDurable(String isDurable) {
        this.isDurable = isDurable;
        return this;
    }

    public String getIsNonconcurrent() {
        return this.isNonconcurrent;
    }

    public QrtzJobDetails setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
        return this;
    }

    public String getIsUpdateData() {
        return this.isUpdateData;
    }

    public QrtzJobDetails setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
        return this;
    }

    public String getRequestsRecovery() {
        return this.requestsRecovery;
    }

    public QrtzJobDetails setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
        return this;
    }

    public byte[] getJobData() {
        return this.jobData;
    }

    public QrtzJobDetails setJobData(byte[] jobData) {
        this.jobData = jobData;
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
        final QrtzJobDetails other = (QrtzJobDetails) obj;
        if (schedName == null) {
            if (other.schedName != null)
                return false;
        }
        else if (!schedName.equals(other.schedName))
            return false;
        if (jobName == null) {
            if (other.jobName != null)
                return false;
        }
        else if (!jobName.equals(other.jobName))
            return false;
        if (jobGroup == null) {
            if (other.jobGroup != null)
                return false;
        }
        else if (!jobGroup.equals(other.jobGroup))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (jobClassName == null) {
            if (other.jobClassName != null)
                return false;
        }
        else if (!jobClassName.equals(other.jobClassName))
            return false;
        if (isDurable == null) {
            if (other.isDurable != null)
                return false;
        }
        else if (!isDurable.equals(other.isDurable))
            return false;
        if (isNonconcurrent == null) {
            if (other.isNonconcurrent != null)
                return false;
        }
        else if (!isNonconcurrent.equals(other.isNonconcurrent))
            return false;
        if (isUpdateData == null) {
            if (other.isUpdateData != null)
                return false;
        }
        else if (!isUpdateData.equals(other.isUpdateData))
            return false;
        if (requestsRecovery == null) {
            if (other.requestsRecovery != null)
                return false;
        }
        else if (!requestsRecovery.equals(other.requestsRecovery))
            return false;
        if (jobData == null) {
            if (other.jobData != null)
                return false;
        }
        else if (!Arrays.equals(jobData, other.jobData))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schedName == null) ? 0 : this.schedName.hashCode());
        result = prime * result + ((this.jobName == null) ? 0 : this.jobName.hashCode());
        result = prime * result + ((this.jobGroup == null) ? 0 : this.jobGroup.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.jobClassName == null) ? 0 : this.jobClassName.hashCode());
        result = prime * result + ((this.isDurable == null) ? 0 : this.isDurable.hashCode());
        result = prime * result + ((this.isNonconcurrent == null) ? 0 : this.isNonconcurrent.hashCode());
        result = prime * result + ((this.isUpdateData == null) ? 0 : this.isUpdateData.hashCode());
        result = prime * result + ((this.requestsRecovery == null) ? 0 : this.requestsRecovery.hashCode());
        result = prime * result + ((this.jobData == null) ? 0 : Arrays.hashCode(this.jobData));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QrtzJobDetails (");

        sb.append(schedName);
        sb.append(", ").append(jobName);
        sb.append(", ").append(jobGroup);
        sb.append(", ").append(description);
        sb.append(", ").append(jobClassName);
        sb.append(", ").append(isDurable);
        sb.append(", ").append(isNonconcurrent);
        sb.append(", ").append(isUpdateData);
        sb.append(", ").append(requestsRecovery);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}