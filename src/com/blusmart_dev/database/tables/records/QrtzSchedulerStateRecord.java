/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.QrtzSchedulerState;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzSchedulerStateRecord extends UpdatableRecordImpl<QrtzSchedulerStateRecord> implements Record4<String, String, Long, Long> {

    private static final long serialVersionUID = -51134256;

    /**
     * Setter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.SCHED_NAME</code>.
     */
    public QrtzSchedulerStateRecord setSchedName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.SCHED_NAME</code>.
     */
    public String getSchedName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.INSTANCE_NAME</code>.
     */
    public QrtzSchedulerStateRecord setInstanceName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.INSTANCE_NAME</code>.
     */
    public String getInstanceName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME</code>.
     */
    public QrtzSchedulerStateRecord setLastCheckinTime(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME</code>.
     */
    public Long getLastCheckinTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL</code>.
     */
    public QrtzSchedulerStateRecord setCheckinInterval(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL</code>.
     */
    public Long getCheckinInterval() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.SCHED_NAME;
    }

    @Override
    public Field<String> field2() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.INSTANCE_NAME;
    }

    @Override
    public Field<Long> field3() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.LAST_CHECKIN_TIME;
    }

    @Override
    public Field<Long> field4() {
        return QrtzSchedulerState.QRTZ_SCHEDULER_STATE.CHECKIN_INTERVAL;
    }

    @Override
    public String component1() {
        return getSchedName();
    }

    @Override
    public String component2() {
        return getInstanceName();
    }

    @Override
    public Long component3() {
        return getLastCheckinTime();
    }

    @Override
    public Long component4() {
        return getCheckinInterval();
    }

    @Override
    public String value1() {
        return getSchedName();
    }

    @Override
    public String value2() {
        return getInstanceName();
    }

    @Override
    public Long value3() {
        return getLastCheckinTime();
    }

    @Override
    public Long value4() {
        return getCheckinInterval();
    }

    @Override
    public QrtzSchedulerStateRecord value1(String value) {
        setSchedName(value);
        return this;
    }

    @Override
    public QrtzSchedulerStateRecord value2(String value) {
        setInstanceName(value);
        return this;
    }

    @Override
    public QrtzSchedulerStateRecord value3(Long value) {
        setLastCheckinTime(value);
        return this;
    }

    @Override
    public QrtzSchedulerStateRecord value4(Long value) {
        setCheckinInterval(value);
        return this;
    }

    @Override
    public QrtzSchedulerStateRecord values(String value1, String value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QrtzSchedulerStateRecord
     */
    public QrtzSchedulerStateRecord() {
        super(QrtzSchedulerState.QRTZ_SCHEDULER_STATE);
    }

    /**
     * Create a detached, initialised QrtzSchedulerStateRecord
     */
    public QrtzSchedulerStateRecord(String schedName, String instanceName, Long lastCheckinTime, Long checkinInterval) {
        super(QrtzSchedulerState.QRTZ_SCHEDULER_STATE);

        set(0, schedName);
        set(1, instanceName);
        set(2, lastCheckinTime);
        set(3, checkinInterval);
    }
}