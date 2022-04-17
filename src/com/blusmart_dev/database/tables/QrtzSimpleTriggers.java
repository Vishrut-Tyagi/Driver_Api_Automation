/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.QrtzSimpleTriggersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class QrtzSimpleTriggers extends TableImpl<QrtzSimpleTriggersRecord> {

    private static final long serialVersionUID = -565677574;

    /**
     * The reference instance of <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS</code>
     */
    public static final QrtzSimpleTriggers QRTZ_SIMPLE_TRIGGERS = new QrtzSimpleTriggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QrtzSimpleTriggersRecord> getRecordType() {
        return QrtzSimpleTriggersRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.SCHED_NAME</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, String> SCHED_NAME = createField(DSL.name("SCHED_NAME"), org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.TRIGGER_NAME</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, String> TRIGGER_NAME = createField(DSL.name("TRIGGER_NAME"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.TRIGGER_GROUP</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, String> TRIGGER_GROUP = createField(DSL.name("TRIGGER_GROUP"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.REPEAT_COUNT</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, Long> REPEAT_COUNT = createField(DSL.name("REPEAT_COUNT"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.REPEAT_INTERVAL</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, Long> REPEAT_INTERVAL = createField(DSL.name("REPEAT_INTERVAL"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS.TIMES_TRIGGERED</code>.
     */
    public final TableField<QrtzSimpleTriggersRecord, Long> TIMES_TRIGGERED = createField(DSL.name("TIMES_TRIGGERED"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS</code> table reference
     */
    public QrtzSimpleTriggers() {
        this(DSL.name("QRTZ_SIMPLE_TRIGGERS"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS</code> table reference
     */
    public QrtzSimpleTriggers(String alias) {
        this(DSL.name(alias), QRTZ_SIMPLE_TRIGGERS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.QRTZ_SIMPLE_TRIGGERS</code> table reference
     */
    public QrtzSimpleTriggers(Name alias) {
        this(alias, QRTZ_SIMPLE_TRIGGERS);
    }

    private QrtzSimpleTriggers(Name alias, Table<QrtzSimpleTriggersRecord> aliased) {
        this(alias, aliased, null);
    }

    private QrtzSimpleTriggers(Name alias, Table<QrtzSimpleTriggersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> QrtzSimpleTriggers(Table<O> child, ForeignKey<O, QrtzSimpleTriggersRecord> key) {
        super(child, key, QRTZ_SIMPLE_TRIGGERS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public UniqueKey<QrtzSimpleTriggersRecord> getPrimaryKey() {
        return Keys.KEY_QRTZ_SIMPLE_TRIGGERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<QrtzSimpleTriggersRecord>> getKeys() {
        return Arrays.<UniqueKey<QrtzSimpleTriggersRecord>>asList(Keys.KEY_QRTZ_SIMPLE_TRIGGERS_PRIMARY);
    }

    @Override
    public List<ForeignKey<QrtzSimpleTriggersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QrtzSimpleTriggersRecord, ?>>asList(Keys.QRTZ_SIMPLE_TRIGGERS_IBFK_1);
    }

    public QrtzTriggers qrtzTriggers() {
        return new QrtzTriggers(this, Keys.QRTZ_SIMPLE_TRIGGERS_IBFK_1);
    }

    @Override
    public QrtzSimpleTriggers as(String alias) {
        return new QrtzSimpleTriggers(DSL.name(alias), this);
    }

    @Override
    public QrtzSimpleTriggers as(Name alias) {
        return new QrtzSimpleTriggers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QrtzSimpleTriggers rename(String name) {
        return new QrtzSimpleTriggers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QrtzSimpleTriggers rename(Name name) {
        return new QrtzSimpleTriggers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}