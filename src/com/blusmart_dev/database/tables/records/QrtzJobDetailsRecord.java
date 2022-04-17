/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.QrtzJobDetails;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record3;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzJobDetailsRecord extends UpdatableRecordImpl<QrtzJobDetailsRecord> implements Record10<String, String, String, String, String, String, String, String, String, byte[]> {

    private static final long serialVersionUID = -177626145;

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.SCHED_NAME</code>.
     */
    public QrtzJobDetailsRecord setSchedName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.SCHED_NAME</code>.
     */
    public String getSchedName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_NAME</code>.
     */
    public QrtzJobDetailsRecord setJobName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_NAME</code>.
     */
    public String getJobName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_GROUP</code>.
     */
    public QrtzJobDetailsRecord setJobGroup(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_GROUP</code>.
     */
    public String getJobGroup() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.DESCRIPTION</code>.
     */
    public QrtzJobDetailsRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_CLASS_NAME</code>.
     */
    public QrtzJobDetailsRecord setJobClassName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_CLASS_NAME</code>.
     */
    public String getJobClassName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_DURABLE</code>.
     */
    public QrtzJobDetailsRecord setIsDurable(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_DURABLE</code>.
     */
    public String getIsDurable() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_NONCONCURRENT</code>.
     */
    public QrtzJobDetailsRecord setIsNonconcurrent(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_NONCONCURRENT</code>.
     */
    public String getIsNonconcurrent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_UPDATE_DATA</code>.
     */
    public QrtzJobDetailsRecord setIsUpdateData(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.IS_UPDATE_DATA</code>.
     */
    public String getIsUpdateData() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.REQUESTS_RECOVERY</code>.
     */
    public QrtzJobDetailsRecord setRequestsRecovery(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.REQUESTS_RECOVERY</code>.
     */
    public String getRequestsRecovery() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_DATA</code>.
     */
    public QrtzJobDetailsRecord setJobData(byte[] value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.QRTZ_JOB_DETAILS.JOB_DATA</code>.
     */
    public byte[] getJobData() {
        return (byte[]) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, byte[]> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, byte[]> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.SCHED_NAME;
    }

    @Override
    public Field<String> field2() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_NAME;
    }

    @Override
    public Field<String> field3() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_GROUP;
    }

    @Override
    public Field<String> field4() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_CLASS_NAME;
    }

    @Override
    public Field<String> field6() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.IS_DURABLE;
    }

    @Override
    public Field<String> field7() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.IS_NONCONCURRENT;
    }

    @Override
    public Field<String> field8() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.IS_UPDATE_DATA;
    }

    @Override
    public Field<String> field9() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.REQUESTS_RECOVERY;
    }

    @Override
    public Field<byte[]> field10() {
        return QrtzJobDetails.QRTZ_JOB_DETAILS.JOB_DATA;
    }

    @Override
    public String component1() {
        return getSchedName();
    }

    @Override
    public String component2() {
        return getJobName();
    }

    @Override
    public String component3() {
        return getJobGroup();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String component5() {
        return getJobClassName();
    }

    @Override
    public String component6() {
        return getIsDurable();
    }

    @Override
    public String component7() {
        return getIsNonconcurrent();
    }

    @Override
    public String component8() {
        return getIsUpdateData();
    }

    @Override
    public String component9() {
        return getRequestsRecovery();
    }

    @Override
    public byte[] component10() {
        return getJobData();
    }

    @Override
    public String value1() {
        return getSchedName();
    }

    @Override
    public String value2() {
        return getJobName();
    }

    @Override
    public String value3() {
        return getJobGroup();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public String value5() {
        return getJobClassName();
    }

    @Override
    public String value6() {
        return getIsDurable();
    }

    @Override
    public String value7() {
        return getIsNonconcurrent();
    }

    @Override
    public String value8() {
        return getIsUpdateData();
    }

    @Override
    public String value9() {
        return getRequestsRecovery();
    }

    @Override
    public byte[] value10() {
        return getJobData();
    }

    @Override
    public QrtzJobDetailsRecord value1(String value) {
        setSchedName(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value2(String value) {
        setJobName(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value3(String value) {
        setJobGroup(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value5(String value) {
        setJobClassName(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value6(String value) {
        setIsDurable(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value7(String value) {
        setIsNonconcurrent(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value8(String value) {
        setIsUpdateData(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value9(String value) {
        setRequestsRecovery(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord value10(byte[] value) {
        setJobData(value);
        return this;
    }

    @Override
    public QrtzJobDetailsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, byte[] value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QrtzJobDetailsRecord
     */
    public QrtzJobDetailsRecord() {
        super(QrtzJobDetails.QRTZ_JOB_DETAILS);
    }

    /**
     * Create a detached, initialised QrtzJobDetailsRecord
     */
    public QrtzJobDetailsRecord(String schedName, String jobName, String jobGroup, String description, String jobClassName, String isDurable, String isNonconcurrent, String isUpdateData, String requestsRecovery, byte[] jobData) {
        super(QrtzJobDetails.QRTZ_JOB_DETAILS);

        set(0, schedName);
        set(1, jobName);
        set(2, jobGroup);
        set(3, description);
        set(4, jobClassName);
        set(5, isDurable);
        set(6, isNonconcurrent);
        set(7, isUpdateData);
        set(8, requestsRecovery);
        set(9, jobData);
    }
}
