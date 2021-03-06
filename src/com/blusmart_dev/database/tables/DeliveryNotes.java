/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.DeliveryNotesRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class DeliveryNotes extends TableImpl<DeliveryNotesRecord> {

    private static final long serialVersionUID = -481459730;

    /**
     * The reference instance of <code>blusmartDevDb.delivery_notes</code>
     */
    public static final DeliveryNotes DELIVERY_NOTES = new DeliveryNotes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeliveryNotesRecord> getRecordType() {
        return DeliveryNotesRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.delivery_notes.id</code>.
     */
    public final TableField<DeliveryNotesRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.sender_id</code>.
     */
    public final TableField<DeliveryNotesRecord, UInteger> SENDER_ID = createField(DSL.name("sender_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.receiver_place_hash</code>.
     */
    public final TableField<DeliveryNotesRecord, String> RECEIVER_PLACE_HASH = createField(DSL.name("receiver_place_hash"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.ride_request_id</code>.
     */
    public final TableField<DeliveryNotesRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.receiver_phone</code>.
     */
    public final TableField<DeliveryNotesRecord, String> RECEIVER_PHONE = createField(DSL.name("receiver_phone"), org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.is_latest</code>.
     */
    public final TableField<DeliveryNotesRecord, Byte> IS_LATEST = createField(DSL.name("is_latest"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.latitude</code>.
     */
    public final TableField<DeliveryNotesRecord, BigDecimal> LATITUDE = createField(DSL.name("latitude"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.longitude</code>.
     */
    public final TableField<DeliveryNotesRecord, BigDecimal> LONGITUDE = createField(DSL.name("longitude"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.notes</code>.
     */
    public final TableField<DeliveryNotesRecord, String> NOTES = createField(DSL.name("notes"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.is_active</code>.
     */
    public final TableField<DeliveryNotesRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.created_timestamp</code>.
     */
    public final TableField<DeliveryNotesRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.last_updated_timestamp</code>.
     */
    public final TableField<DeliveryNotesRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.created_by</code>.
     */
    public final TableField<DeliveryNotesRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.delivery_notes.last_updated_by</code>.
     */
    public final TableField<DeliveryNotesRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.delivery_notes</code> table reference
     */
    public DeliveryNotes() {
        this(DSL.name("delivery_notes"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.delivery_notes</code> table reference
     */
    public DeliveryNotes(String alias) {
        this(DSL.name(alias), DELIVERY_NOTES);
    }

    /**
     * Create an aliased <code>blusmartDevDb.delivery_notes</code> table reference
     */
    public DeliveryNotes(Name alias) {
        this(alias, DELIVERY_NOTES);
    }

    private DeliveryNotes(Name alias, Table<DeliveryNotesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeliveryNotes(Name alias, Table<DeliveryNotesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DeliveryNotes(Table<O> child, ForeignKey<O, DeliveryNotesRecord> key) {
        super(child, key, DELIVERY_NOTES);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<DeliveryNotesRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_DELIVERY_NOTES;
    }

    @Override
    public UniqueKey<DeliveryNotesRecord> getPrimaryKey() {
        return Keys.KEY_DELIVERY_NOTES_PRIMARY;
    }

    @Override
    public List<UniqueKey<DeliveryNotesRecord>> getKeys() {
        return Arrays.<UniqueKey<DeliveryNotesRecord>>asList(Keys.KEY_DELIVERY_NOTES_PRIMARY);
    }

    @Override
    public DeliveryNotes as(String alias) {
        return new DeliveryNotes(DSL.name(alias), this);
    }

    @Override
    public DeliveryNotes as(Name alias) {
        return new DeliveryNotes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliveryNotes rename(String name) {
        return new DeliveryNotes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliveryNotes rename(Name name) {
        return new DeliveryNotes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, UInteger, String, UInteger, String, Byte, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
