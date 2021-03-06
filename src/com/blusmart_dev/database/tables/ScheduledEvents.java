/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.ScheduledEventsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScheduledEvents extends TableImpl<ScheduledEventsRecord> {

    private static final long serialVersionUID = -974316292;

    /**
     * The reference instance of <code>blusmartDevDb.scheduled_events</code>
     */
    public static final ScheduledEvents SCHEDULED_EVENTS = new ScheduledEvents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduledEventsRecord> getRecordType() {
        return ScheduledEventsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.scheduled_events.id</code>.
     */
    public final TableField<ScheduledEventsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.event_type</code>.
     */
    public final TableField<ScheduledEventsRecord, String> EVENT_TYPE = createField(DSL.name("event_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.request_data</code>.
     */
    public final TableField<ScheduledEventsRecord, String> REQUEST_DATA = createField(DSL.name("request_data"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.state</code>.
     */
    public final TableField<ScheduledEventsRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.is_active</code>.
     */
    public final TableField<ScheduledEventsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.scheduled_timestamp</code>.
     */
    public final TableField<ScheduledEventsRecord, Long> SCHEDULED_TIMESTAMP = createField(DSL.name("scheduled_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.created_timestamp</code>.
     */
    public final TableField<ScheduledEventsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.last_updated_timestamp</code>.
     */
    public final TableField<ScheduledEventsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.created_by</code>.
     */
    public final TableField<ScheduledEventsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.last_updated_by</code>.
     */
    public final TableField<ScheduledEventsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.response_data</code>.
     */
    public final TableField<ScheduledEventsRecord, String> RESPONSE_DATA = createField(DSL.name("response_data"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.trigger_validity</code>.
     */
    public final TableField<ScheduledEventsRecord, String> TRIGGER_VALIDITY = createField(DSL.name("trigger_validity"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.scheduled_events.event_validity</code>.
     */
    public final TableField<ScheduledEventsRecord, String> EVENT_VALIDITY = createField(DSL.name("event_validity"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.scheduled_events</code> table reference
     */
    public ScheduledEvents() {
        this(DSL.name("scheduled_events"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.scheduled_events</code> table reference
     */
    public ScheduledEvents(String alias) {
        this(DSL.name(alias), SCHEDULED_EVENTS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.scheduled_events</code> table reference
     */
    public ScheduledEvents(Name alias) {
        this(alias, SCHEDULED_EVENTS);
    }

    private ScheduledEvents(Name alias, Table<ScheduledEventsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScheduledEvents(Name alias, Table<ScheduledEventsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ScheduledEvents(Table<O> child, ForeignKey<O, ScheduledEventsRecord> key) {
        super(child, key, SCHEDULED_EVENTS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<ScheduledEventsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_SCHEDULED_EVENTS;
    }

    @Override
    public UniqueKey<ScheduledEventsRecord> getPrimaryKey() {
        return Keys.KEY_SCHEDULED_EVENTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ScheduledEventsRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduledEventsRecord>>asList(Keys.KEY_SCHEDULED_EVENTS_PRIMARY);
    }

    @Override
    public ScheduledEvents as(String alias) {
        return new ScheduledEvents(DSL.name(alias), this);
    }

    @Override
    public ScheduledEvents as(Name alias) {
        return new ScheduledEvents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduledEvents rename(String name) {
        return new ScheduledEvents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduledEvents rename(Name name) {
        return new ScheduledEvents(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, String, String, Byte, Long, Long, Long, UInteger, UInteger, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
