/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzCronTriggers implements Serializable {

    private static final long serialVersionUID = -85367505;

    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String cronExpression;
    private String timeZoneId;

    public QrtzCronTriggers() {}

    public QrtzCronTriggers(QrtzCronTriggers value) {
        this.schedName = value.schedName;
        this.triggerName = value.triggerName;
        this.triggerGroup = value.triggerGroup;
        this.cronExpression = value.cronExpression;
        this.timeZoneId = value.timeZoneId;
    }

    public QrtzCronTriggers(
        String schedName,
        String triggerName,
        String triggerGroup,
        String cronExpression,
        String timeZoneId
    ) {
        this.schedName = schedName;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
        this.cronExpression = cronExpression;
        this.timeZoneId = timeZoneId;
    }

    public String getSchedName() {
        return this.schedName;
    }

    public QrtzCronTriggers setSchedName(String schedName) {
        this.schedName = schedName;
        return this;
    }

    public String getTriggerName() {
        return this.triggerName;
    }

    public QrtzCronTriggers setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    public String getTriggerGroup() {
        return this.triggerGroup;
    }

    public QrtzCronTriggers setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }

    public String getCronExpression() {
        return this.cronExpression;
    }

    public QrtzCronTriggers setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public QrtzCronTriggers setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
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
        final QrtzCronTriggers other = (QrtzCronTriggers) obj;
        if (schedName == null) {
            if (other.schedName != null)
                return false;
        }
        else if (!schedName.equals(other.schedName))
            return false;
        if (triggerName == null) {
            if (other.triggerName != null)
                return false;
        }
        else if (!triggerName.equals(other.triggerName))
            return false;
        if (triggerGroup == null) {
            if (other.triggerGroup != null)
                return false;
        }
        else if (!triggerGroup.equals(other.triggerGroup))
            return false;
        if (cronExpression == null) {
            if (other.cronExpression != null)
                return false;
        }
        else if (!cronExpression.equals(other.cronExpression))
            return false;
        if (timeZoneId == null) {
            if (other.timeZoneId != null)
                return false;
        }
        else if (!timeZoneId.equals(other.timeZoneId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schedName == null) ? 0 : this.schedName.hashCode());
        result = prime * result + ((this.triggerName == null) ? 0 : this.triggerName.hashCode());
        result = prime * result + ((this.triggerGroup == null) ? 0 : this.triggerGroup.hashCode());
        result = prime * result + ((this.cronExpression == null) ? 0 : this.cronExpression.hashCode());
        result = prime * result + ((this.timeZoneId == null) ? 0 : this.timeZoneId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QrtzCronTriggers (");

        sb.append(schedName);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(triggerGroup);
        sb.append(", ").append(cronExpression);
        sb.append(", ").append(timeZoneId);

        sb.append(")");
        return sb.toString();
    }
}
