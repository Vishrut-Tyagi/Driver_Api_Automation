/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.ChargerDetailsRecord;

import java.math.BigDecimal;
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
public class ChargerDetails extends TableImpl<ChargerDetailsRecord> {

    private static final long serialVersionUID = -1270232008;

    /**
     * The reference instance of <code>blusmartDevDb.charger_details</code>
     */
    public static final ChargerDetails CHARGER_DETAILS = new ChargerDetails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChargerDetailsRecord> getRecordType() {
        return ChargerDetailsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.charger_details.id</code>.
     */
    public final TableField<ChargerDetailsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.charger_location</code>.
     */
    public final TableField<ChargerDetailsRecord, String> CHARGER_LOCATION = createField(DSL.name("charger_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.charger_lat</code>.
     */
    public final TableField<ChargerDetailsRecord, BigDecimal> CHARGER_LAT = createField(DSL.name("charger_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.charger_long</code>.
     */
    public final TableField<ChargerDetailsRecord, BigDecimal> CHARGER_LONG = createField(DSL.name("charger_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.no_of_guns</code>.
     */
    public final TableField<ChargerDetailsRecord, String> NO_OF_GUNS = createField(DSL.name("no_of_guns"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.is_active</code>.
     */
    public final TableField<ChargerDetailsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.created_timestamp</code>.
     */
    public final TableField<ChargerDetailsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.last_updated_timestamp</code>.
     */
    public final TableField<ChargerDetailsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.created_by</code>.
     */
    public final TableField<ChargerDetailsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.last_updated_by</code>.
     */
    public final TableField<ChargerDetailsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.owner</code>.
     */
    public final TableField<ChargerDetailsRecord, String> OWNER = createField(DSL.name("owner"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.owner_url</code>.
     */
    public final TableField<ChargerDetailsRecord, String> OWNER_URL = createField(DSL.name("owner_url"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.charger_details.app_link</code>.
     */
    public final TableField<ChargerDetailsRecord, String> APP_LINK = createField(DSL.name("app_link"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.charger_details</code> table reference
     */
    public ChargerDetails() {
        this(DSL.name("charger_details"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.charger_details</code> table reference
     */
    public ChargerDetails(String alias) {
        this(DSL.name(alias), CHARGER_DETAILS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.charger_details</code> table reference
     */
    public ChargerDetails(Name alias) {
        this(alias, CHARGER_DETAILS);
    }

    private ChargerDetails(Name alias, Table<ChargerDetailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChargerDetails(Name alias, Table<ChargerDetailsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ChargerDetails(Table<O> child, ForeignKey<O, ChargerDetailsRecord> key) {
        super(child, key, CHARGER_DETAILS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<ChargerDetailsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_CHARGER_DETAILS;
    }

    @Override
    public UniqueKey<ChargerDetailsRecord> getPrimaryKey() {
        return Keys.KEY_CHARGER_DETAILS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ChargerDetailsRecord>> getKeys() {
        return Arrays.<UniqueKey<ChargerDetailsRecord>>asList(Keys.KEY_CHARGER_DETAILS_PRIMARY);
    }

    @Override
    public ChargerDetails as(String alias) {
        return new ChargerDetails(DSL.name(alias), this);
    }

    @Override
    public ChargerDetails as(Name alias) {
        return new ChargerDetails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargerDetails rename(String name) {
        return new ChargerDetails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargerDetails rename(Name name) {
        return new ChargerDetails(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, BigDecimal, BigDecimal, String, Byte, Long, Long, UInteger, UInteger, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}