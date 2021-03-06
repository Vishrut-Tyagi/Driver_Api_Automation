/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.ShiftConfigurationRecord;

import java.time.LocalTime;
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
public class ShiftConfiguration extends TableImpl<ShiftConfigurationRecord> {

    private static final long serialVersionUID = 577129209;

    /**
     * The reference instance of <code>blusmartDevDb.shift_configuration</code>
     */
    public static final ShiftConfiguration SHIFT_CONFIGURATION = new ShiftConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShiftConfigurationRecord> getRecordType() {
        return ShiftConfigurationRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.shift_configuration.shift_id</code>.
     */
    public final TableField<ShiftConfigurationRecord, UInteger> SHIFT_ID = createField(DSL.name("shift_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.hub_id</code>.
     */
    public final TableField<ShiftConfigurationRecord, Integer> HUB_ID = createField(DSL.name("hub_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.earliest_login</code>.
     */
    public final TableField<ShiftConfigurationRecord, LocalTime> EARLIEST_LOGIN = createField(DSL.name("earliest_login"), org.jooq.impl.SQLDataType.LOCALTIME.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.latest_login</code>.
     */
    public final TableField<ShiftConfigurationRecord, LocalTime> LATEST_LOGIN = createField(DSL.name("latest_login"), org.jooq.impl.SQLDataType.LOCALTIME.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.is_active</code>.
     */
    public final TableField<ShiftConfigurationRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.created_by</code>.
     */
    public final TableField<ShiftConfigurationRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.updated_by</code>.
     */
    public final TableField<ShiftConfigurationRecord, Integer> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.created_at</code>.
     */
    public final TableField<ShiftConfigurationRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.shift_configuration.last_updated_at</code>.
     */
    public final TableField<ShiftConfigurationRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>blusmartDevDb.shift_configuration</code> table reference
     */
    public ShiftConfiguration() {
        this(DSL.name("shift_configuration"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.shift_configuration</code> table reference
     */
    public ShiftConfiguration(String alias) {
        this(DSL.name(alias), SHIFT_CONFIGURATION);
    }

    /**
     * Create an aliased <code>blusmartDevDb.shift_configuration</code> table reference
     */
    public ShiftConfiguration(Name alias) {
        this(alias, SHIFT_CONFIGURATION);
    }

    private ShiftConfiguration(Name alias, Table<ShiftConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShiftConfiguration(Name alias, Table<ShiftConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ShiftConfiguration(Table<O> child, ForeignKey<O, ShiftConfigurationRecord> key) {
        super(child, key, SHIFT_CONFIGURATION);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<ShiftConfigurationRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_SHIFT_CONFIGURATION;
    }

    @Override
    public UniqueKey<ShiftConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_SHIFT_CONFIGURATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<ShiftConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<ShiftConfigurationRecord>>asList(Keys.KEY_SHIFT_CONFIGURATION_PRIMARY);
    }

    @Override
    public ShiftConfiguration as(String alias) {
        return new ShiftConfiguration(DSL.name(alias), this);
    }

    @Override
    public ShiftConfiguration as(Name alias) {
        return new ShiftConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftConfiguration rename(String name) {
        return new ShiftConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftConfiguration rename(Name name) {
        return new ShiftConfiguration(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UInteger, Integer, LocalTime, LocalTime, Byte, Integer, Integer, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
