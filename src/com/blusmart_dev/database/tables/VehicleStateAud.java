/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.VehicleStateAudRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class VehicleStateAud extends TableImpl<VehicleStateAudRecord> {

    private static final long serialVersionUID = 267581909;

    /**
     * The reference instance of <code>blusmartDevDb.vehicle_state_aud</code>
     */
    public static final VehicleStateAud VEHICLE_STATE_AUD = new VehicleStateAud();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VehicleStateAudRecord> getRecordType() {
        return VehicleStateAudRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.aud_id</code>.
     */
    public final TableField<VehicleStateAudRecord, UInteger> AUD_ID = createField(DSL.name("aud_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.vehicle_number</code>.
     */
    public final TableField<VehicleStateAudRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.vehicle_state</code>.
     */
    public final TableField<VehicleStateAudRecord, String> VEHICLE_STATE = createField(DSL.name("vehicle_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.is_active</code>.
     */
    public final TableField<VehicleStateAudRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.created_timestamp</code>.
     */
    public final TableField<VehicleStateAudRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.last_updated_timestamp</code>.
     */
    public final TableField<VehicleStateAudRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.created_by</code>.
     */
    public final TableField<VehicleStateAudRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.last_updated_by</code>.
     */
    public final TableField<VehicleStateAudRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_state_aud.other_flags</code>.
     */
    public final TableField<VehicleStateAudRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.vehicle_state_aud</code> table reference
     */
    public VehicleStateAud() {
        this(DSL.name("vehicle_state_aud"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.vehicle_state_aud</code> table reference
     */
    public VehicleStateAud(String alias) {
        this(DSL.name(alias), VEHICLE_STATE_AUD);
    }

    /**
     * Create an aliased <code>blusmartDevDb.vehicle_state_aud</code> table reference
     */
    public VehicleStateAud(Name alias) {
        this(alias, VEHICLE_STATE_AUD);
    }

    private VehicleStateAud(Name alias, Table<VehicleStateAudRecord> aliased) {
        this(alias, aliased, null);
    }

    private VehicleStateAud(Name alias, Table<VehicleStateAudRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VehicleStateAud(Table<O> child, ForeignKey<O, VehicleStateAudRecord> key) {
        super(child, key, VEHICLE_STATE_AUD);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<VehicleStateAudRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_VEHICLE_STATE_AUD;
    }

    @Override
    public UniqueKey<VehicleStateAudRecord> getPrimaryKey() {
        return Keys.KEY_VEHICLE_STATE_AUD_PRIMARY;
    }

    @Override
    public List<UniqueKey<VehicleStateAudRecord>> getKeys() {
        return Arrays.<UniqueKey<VehicleStateAudRecord>>asList(Keys.KEY_VEHICLE_STATE_AUD_PRIMARY);
    }

    @Override
    public VehicleStateAud as(String alias) {
        return new VehicleStateAud(DSL.name(alias), this);
    }

    @Override
    public VehicleStateAud as(Name alias) {
        return new VehicleStateAud(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleStateAud rename(String name) {
        return new VehicleStateAud(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleStateAud rename(Name name) {
        return new VehicleStateAud(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UInteger, String, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
