/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.QrtzBlobTriggers;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzBlobTriggersRecord extends UpdatableRecordImpl<QrtzBlobTriggersRecord> implements Record4<String, String, String, byte[]> {

    private static final long serialVersionUID = 1486689987;

    /**
     * Setter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.SCHED_NAME</code>.
     */
    public QrtzBlobTriggersRecord setSchedName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.SCHED_NAME</code>.
     */
    public String getSchedName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.TRIGGER_NAME</code>.
     */
    public QrtzBlobTriggersRecord setTriggerName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.TRIGGER_NAME</code>.
     */
    public String getTriggerName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP</code>.
     */
    public QrtzBlobTriggersRecord setTriggerGroup(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP</code>.
     */
    public String getTriggerGroup() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.BLOB_DATA</code>.
     */
    public QrtzBlobTriggersRecord setBlobData(byte[] value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_BLOB_TRIGGERS.BLOB_DATA</code>.
     */
    public byte[] getBlobData() {
        return (byte[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.SCHED_NAME;
    }

    @Override
    public Field<String> field2() {
        return QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_NAME;
    }

    @Override
    public Field<String> field3() {
        return QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.TRIGGER_GROUP;
    }

    @Override
    public Field<byte[]> field4() {
        return QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS.BLOB_DATA;
    }

    @Override
    public String component1() {
        return getSchedName();
    }

    @Override
    public String component2() {
        return getTriggerName();
    }

    @Override
    public String component3() {
        return getTriggerGroup();
    }

    @Override
    public byte[] component4() {
        return getBlobData();
    }

    @Override
    public String value1() {
        return getSchedName();
    }

    @Override
    public String value2() {
        return getTriggerName();
    }

    @Override
    public String value3() {
        return getTriggerGroup();
    }

    @Override
    public byte[] value4() {
        return getBlobData();
    }

    @Override
    public QrtzBlobTriggersRecord value1(String value) {
        setSchedName(value);
        return this;
    }

    @Override
    public QrtzBlobTriggersRecord value2(String value) {
        setTriggerName(value);
        return this;
    }

    @Override
    public QrtzBlobTriggersRecord value3(String value) {
        setTriggerGroup(value);
        return this;
    }

    @Override
    public QrtzBlobTriggersRecord value4(byte[] value) {
        setBlobData(value);
        return this;
    }

    @Override
    public QrtzBlobTriggersRecord values(String value1, String value2, String value3, byte[] value4) {
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
     * Create a detached QrtzBlobTriggersRecord
     */
    public QrtzBlobTriggersRecord() {
        super(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS);
    }

    /**
     * Create a detached, initialised QrtzBlobTriggersRecord
     */
    public QrtzBlobTriggersRecord(String schedName, String triggerName, String triggerGroup, byte[] blobData) {
        super(QrtzBlobTriggers.QRTZ_BLOB_TRIGGERS);

        set(0, schedName);
        set(1, triggerName);
        set(2, triggerGroup);
        set(3, blobData);
    }
}
