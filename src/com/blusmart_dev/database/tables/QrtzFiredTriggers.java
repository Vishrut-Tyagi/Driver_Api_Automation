/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.QrtzFiredTriggersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class QrtzFiredTriggers extends TableImpl<QrtzFiredTriggersRecord> {

    private static final long serialVersionUID = 1030358873;

    /**
     * The reference instance of <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS</code>
     */
    public static final QrtzFiredTriggers QRTZ_FIRED_TRIGGERS = new QrtzFiredTriggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QrtzFiredTriggersRecord> getRecordType() {
        return QrtzFiredTriggersRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.SCHED_NAME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> SCHED_NAME = createField(DSL.name("SCHED_NAME"), org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.ENTRY_ID</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> ENTRY_ID = createField(DSL.name("ENTRY_ID"), org.jooq.impl.SQLDataType.VARCHAR(95).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.TRIGGER_NAME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> TRIGGER_NAME = createField(DSL.name("TRIGGER_NAME"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> TRIGGER_GROUP = createField(DSL.name("TRIGGER_GROUP"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.INSTANCE_NAME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> INSTANCE_NAME = createField(DSL.name("INSTANCE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.FIRED_TIME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, Long> FIRED_TIME = createField(DSL.name("FIRED_TIME"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.SCHED_TIME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, Long> SCHED_TIME = createField(DSL.name("SCHED_TIME"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.PRIORITY</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, Integer> PRIORITY = createField(DSL.name("PRIORITY"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.STATE</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> STATE = createField(DSL.name("STATE"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.JOB_NAME</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> JOB_NAME = createField(DSL.name("JOB_NAME"), org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.JOB_GROUP</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> JOB_GROUP = createField(DSL.name("JOB_GROUP"), org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> IS_NONCONCURRENT = createField(DSL.name("IS_NONCONCURRENT"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY</code>.
     */
    public final TableField<QrtzFiredTriggersRecord, String> REQUESTS_RECOVERY = createField(DSL.name("REQUESTS_RECOVERY"), org.jooq.impl.SQLDataType.VARCHAR(1).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS</code> table reference
     */
    public QrtzFiredTriggers() {
        this(DSL.name("QRTZ_FIRED_TRIGGERS"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS</code> table reference
     */
    public QrtzFiredTriggers(String alias) {
        this(DSL.name(alias), QRTZ_FIRED_TRIGGERS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.QRTZ_FIRED_TRIGGERS</code> table reference
     */
    public QrtzFiredTriggers(Name alias) {
        this(alias, QRTZ_FIRED_TRIGGERS);
    }

    private QrtzFiredTriggers(Name alias, Table<QrtzFiredTriggersRecord> aliased) {
        this(alias, aliased, null);
    }

    private QrtzFiredTriggers(Name alias, Table<QrtzFiredTriggersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> QrtzFiredTriggers(Table<O> child, ForeignKey<O, QrtzFiredTriggersRecord> key) {
        super(child, key, QRTZ_FIRED_TRIGGERS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public UniqueKey<QrtzFiredTriggersRecord> getPrimaryKey() {
        return Keys.KEY_QRTZ_FIRED_TRIGGERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<QrtzFiredTriggersRecord>> getKeys() {
        return Arrays.<UniqueKey<QrtzFiredTriggersRecord>>asList(Keys.KEY_QRTZ_FIRED_TRIGGERS_PRIMARY);
    }

    @Override
    public QrtzFiredTriggers as(String alias) {
        return new QrtzFiredTriggers(DSL.name(alias), this);
    }

    @Override
    public QrtzFiredTriggers as(Name alias) {
        return new QrtzFiredTriggers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QrtzFiredTriggers rename(String name) {
        return new QrtzFiredTriggers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QrtzFiredTriggers rename(Name name) {
        return new QrtzFiredTriggers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, Long, Long, Integer, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
