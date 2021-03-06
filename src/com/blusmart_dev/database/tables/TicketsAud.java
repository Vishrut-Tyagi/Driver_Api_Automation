/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.TicketsAudRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class TicketsAud extends TableImpl<TicketsAudRecord> {

    private static final long serialVersionUID = 482931998;

    /**
     * The reference instance of <code>blusmartDevDb.tickets_aud</code>
     */
    public static final TicketsAud TICKETS_AUD = new TicketsAud();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TicketsAudRecord> getRecordType() {
        return TicketsAudRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.tickets_aud.aud_id</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> AUD_ID = createField(DSL.name("aud_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.id</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.ride_request_id</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.ride_id</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.rider_id</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.ticket_type</code>.
     */
    public final TableField<TicketsAudRecord, String> TICKET_TYPE = createField(DSL.name("ticket_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.ticket_stage</code>.
     */
    public final TableField<TicketsAudRecord, String> TICKET_STAGE = createField(DSL.name("ticket_stage"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.incident_id</code>.
     */
    public final TableField<TicketsAudRecord, String> INCIDENT_ID = createField(DSL.name("incident_id"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.ticket_history_details</code>.
     */
    public final TableField<TicketsAudRecord, String> TICKET_HISTORY_DETAILS = createField(DSL.name("ticket_history_details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.closed_timestamp</code>.
     */
    public final TableField<TicketsAudRecord, Long> CLOSED_TIMESTAMP = createField(DSL.name("closed_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.closure_remark</code>.
     */
    public final TableField<TicketsAudRecord, String> CLOSURE_REMARK = createField(DSL.name("closure_remark"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.is_active</code>.
     */
    public final TableField<TicketsAudRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.created_timestamp</code>.
     */
    public final TableField<TicketsAudRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.last_updated_timestamp</code>.
     */
    public final TableField<TicketsAudRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.created_by</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.last_updated_by</code>.
     */
    public final TableField<TicketsAudRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.tickets_aud.feedback</code>.
     */
    public final TableField<TicketsAudRecord, String> FEEDBACK = createField(DSL.name("feedback"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.tickets_aud</code> table reference
     */
    public TicketsAud() {
        this(DSL.name("tickets_aud"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.tickets_aud</code> table reference
     */
    public TicketsAud(String alias) {
        this(DSL.name(alias), TICKETS_AUD);
    }

    /**
     * Create an aliased <code>blusmartDevDb.tickets_aud</code> table reference
     */
    public TicketsAud(Name alias) {
        this(alias, TICKETS_AUD);
    }

    private TicketsAud(Name alias, Table<TicketsAudRecord> aliased) {
        this(alias, aliased, null);
    }

    private TicketsAud(Name alias, Table<TicketsAudRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TicketsAud(Table<O> child, ForeignKey<O, TicketsAudRecord> key) {
        super(child, key, TICKETS_AUD);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<TicketsAudRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_TICKETS_AUD;
    }

    @Override
    public UniqueKey<TicketsAudRecord> getPrimaryKey() {
        return Keys.KEY_TICKETS_AUD_PRIMARY;
    }

    @Override
    public List<UniqueKey<TicketsAudRecord>> getKeys() {
        return Arrays.<UniqueKey<TicketsAudRecord>>asList(Keys.KEY_TICKETS_AUD_PRIMARY);
    }

    @Override
    public TicketsAud as(String alias) {
        return new TicketsAud(DSL.name(alias), this);
    }

    @Override
    public TicketsAud as(Name alias) {
        return new TicketsAud(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TicketsAud rename(String name) {
        return new TicketsAud(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TicketsAud rename(Name name) {
        return new TicketsAud(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<UInteger, UInteger, UInteger, UInteger, UInteger, String, String, String, String, Long, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
