/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.CallLogsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CallLogs extends TableImpl<CallLogsRecord> {

    private static final long serialVersionUID = 40040859;

    /**
     * The reference instance of <code>blusmartDevDb.call_logs</code>
     */
    public static final CallLogs CALL_LOGS = new CallLogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CallLogsRecord> getRecordType() {
        return CallLogsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.call_logs.id</code>.
     */
    public final TableField<CallLogsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.sid</code>.
     */
    public final TableField<CallLogsRecord, String> SID = createField(DSL.name("sid"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.to</code>.
     */
    public final TableField<CallLogsRecord, String> TO = createField(DSL.name("to"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.from</code>.
     */
    public final TableField<CallLogsRecord, String> FROM = createField(DSL.name("from"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.phone_number_sid</code>.
     */
    public final TableField<CallLogsRecord, String> PHONE_NUMBER_SID = createField(DSL.name("phone_number_sid"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.duration</code>.
     */
    public final TableField<CallLogsRecord, String> DURATION = createField(DSL.name("duration"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.price</code>.
     */
    public final TableField<CallLogsRecord, String> PRICE = createField(DSL.name("price"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.direction</code>.
     */
    public final TableField<CallLogsRecord, String> DIRECTION = createField(DSL.name("direction"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.uri</code>.
     */
    public final TableField<CallLogsRecord, String> URI = createField(DSL.name("uri"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.created_by</code>.
     */
    public final TableField<CallLogsRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.last_updated_by</code>.
     */
    public final TableField<CallLogsRecord, Integer> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.note</code>.
     */
    public final TableField<CallLogsRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.answer_by</code>.
     */
    public final TableField<CallLogsRecord, String> ANSWER_BY = createField(DSL.name("answer_by"), org.jooq.impl.SQLDataType.VARCHAR(45).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.record</code>.
     */
    public final TableField<CallLogsRecord, Byte> RECORD = createField(DSL.name("record"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.is_active</code>.
     */
    public final TableField<CallLogsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.created_at</code>.
     */
    public final TableField<CallLogsRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.last_updated_at</code>.
     */
    public final TableField<CallLogsRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.start_time</code>.
     */
    public final TableField<CallLogsRecord, Long> START_TIME = createField(DSL.name("start_time"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.end_time</code>.
     */
    public final TableField<CallLogsRecord, Long> END_TIME = createField(DSL.name("end_time"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.status</code>.
     */
    public final TableField<CallLogsRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(240).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.call_type</code>.
     */
    public final TableField<CallLogsRecord, String> CALL_TYPE = createField(DSL.name("call_type"), org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.recording_url</code>.
     */
    public final TableField<CallLogsRecord, String> RECORDING_URL = createField(DSL.name("recording_url"), org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.call_logs.ride_id</code>.
     */
    public final TableField<CallLogsRecord, Integer> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.call_logs</code> table reference
     */
    public CallLogs() {
        this(DSL.name("call_logs"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.call_logs</code> table reference
     */
    public CallLogs(String alias) {
        this(DSL.name(alias), CALL_LOGS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.call_logs</code> table reference
     */
    public CallLogs(Name alias) {
        this(alias, CALL_LOGS);
    }

    private CallLogs(Name alias, Table<CallLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CallLogs(Name alias, Table<CallLogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CallLogs(Table<O> child, ForeignKey<O, CallLogsRecord> key) {
        super(child, key, CALL_LOGS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<CallLogsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CALL_LOGS;
    }

    @Override
    public UniqueKey<CallLogsRecord> getPrimaryKey() {
        return Keys.KEY_CALL_LOGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<CallLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<CallLogsRecord>>asList(Keys.KEY_CALL_LOGS_PRIMARY);
    }

    @Override
    public CallLogs as(String alias) {
        return new CallLogs(DSL.name(alias), this);
    }

    @Override
    public CallLogs as(Name alias) {
        return new CallLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CallLogs rename(String name) {
        return new CallLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CallLogs rename(Name name) {
        return new CallLogs(name, null);
    }
}
