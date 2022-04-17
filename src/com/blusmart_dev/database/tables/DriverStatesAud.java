/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.DriverStatesAudRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverStatesAud extends TableImpl<DriverStatesAudRecord> {

    private static final long serialVersionUID = 429746713;

    /**
     * The reference instance of <code>blusmartDevDb.driver_states_aud</code>
     */
    public static final DriverStatesAud DRIVER_STATES_AUD = new DriverStatesAud();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverStatesAudRecord> getRecordType() {
        return DriverStatesAudRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.driver_states_aud.aud_id</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> AUD_ID = createField(DSL.name("aud_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.id</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.driver_id</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.driver_state</code>.
     */
    public final TableField<DriverStatesAudRecord, String> DRIVER_STATE = createField(DSL.name("driver_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.vehicle_number</code>.
     */
    public final TableField<DriverStatesAudRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.is_active</code>.
     */
    public final TableField<DriverStatesAudRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.created_timestamp</code>.
     */
    public final TableField<DriverStatesAudRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.last_updated_timestamp</code>.
     */
    public final TableField<DriverStatesAudRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.created_by</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.last_updated_by</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.ride_id</code>.
     */
    public final TableField<DriverStatesAudRecord, UInteger> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.latitude</code>.
     */
    public final TableField<DriverStatesAudRecord, BigDecimal> LATITUDE = createField(DSL.name("latitude"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.longitude</code>.
     */
    public final TableField<DriverStatesAudRecord, BigDecimal> LONGITUDE = createField(DSL.name("longitude"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.next_eligible_timestamp</code>.
     */
    public final TableField<DriverStatesAudRecord, Long> NEXT_ELIGIBLE_TIMESTAMP = createField(DSL.name("next_eligible_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.is_paused</code>.
     */
    public final TableField<DriverStatesAudRecord, Byte> IS_PAUSED = createField(DSL.name("is_paused"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.current_destination</code>.
     */
    public final TableField<DriverStatesAudRecord, String> CURRENT_DESTINATION = createField(DSL.name("current_destination"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.destination_status</code>.
     */
    public final TableField<DriverStatesAudRecord, String> DESTINATION_STATUS = createField(DSL.name("destination_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.paused_by</code>.
     */
    public final TableField<DriverStatesAudRecord, Integer> PAUSED_BY = createField(DSL.name("paused_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.is_soc_required</code>.
     */
    public final TableField<DriverStatesAudRecord, Byte> IS_SOC_REQUIRED = createField(DSL.name("is_soc_required"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.pause_reason</code>.
     */
    public final TableField<DriverStatesAudRecord, String> PAUSE_REASON = createField(DSL.name("pause_reason"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.other_flags</code>.
     */
    public final TableField<DriverStatesAudRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.shift_start_timestamp</code>.
     */
    public final TableField<DriverStatesAudRecord, Long> SHIFT_START_TIMESTAMP = createField(DSL.name("shift_start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_states_aud.shift_end_timestamp</code>.
     */
    public final TableField<DriverStatesAudRecord, Long> SHIFT_END_TIMESTAMP = createField(DSL.name("shift_end_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>blusmartDevDb.driver_states_aud</code> table reference
     */
    public DriverStatesAud() {
        this(DSL.name("driver_states_aud"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_states_aud</code> table reference
     */
    public DriverStatesAud(String alias) {
        this(DSL.name(alias), DRIVER_STATES_AUD);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_states_aud</code> table reference
     */
    public DriverStatesAud(Name alias) {
        this(alias, DRIVER_STATES_AUD);
    }

    private DriverStatesAud(Name alias, Table<DriverStatesAudRecord> aliased) {
        this(alias, aliased, null);
    }

    private DriverStatesAud(Name alias, Table<DriverStatesAudRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DriverStatesAud(Table<O> child, ForeignKey<O, DriverStatesAudRecord> key) {
        super(child, key, DRIVER_STATES_AUD);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<DriverStatesAudRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_DRIVER_STATES_AUD;
    }

    @Override
    public UniqueKey<DriverStatesAudRecord> getPrimaryKey() {
        return Keys.KEY_DRIVER_STATES_AUD_PRIMARY;
    }

    @Override
    public List<UniqueKey<DriverStatesAudRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverStatesAudRecord>>asList(Keys.KEY_DRIVER_STATES_AUD_PRIMARY);
    }

    @Override
    public DriverStatesAud as(String alias) {
        return new DriverStatesAud(DSL.name(alias), this);
    }

    @Override
    public DriverStatesAud as(Name alias) {
        return new DriverStatesAud(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverStatesAud rename(String name) {
        return new DriverStatesAud(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverStatesAud rename(Name name) {
        return new DriverStatesAud(name, null);
    }
}
