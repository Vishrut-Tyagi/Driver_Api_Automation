/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RulesConfigurationRecord;

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
public class RulesConfiguration extends TableImpl<RulesConfigurationRecord> {

    private static final long serialVersionUID = 624396447;

    /**
     * The reference instance of <code>blusmartDevDb.rules_configuration</code>
     */
    public static final RulesConfiguration RULES_CONFIGURATION = new RulesConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RulesConfigurationRecord> getRecordType() {
        return RulesConfigurationRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.rules_configuration.id</code>.
     */
    public final TableField<RulesConfigurationRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.rule_name</code>.
     */
    public final TableField<RulesConfigurationRecord, String> RULE_NAME = createField(DSL.name("rule_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.when_condition</code>.
     */
    public final TableField<RulesConfigurationRecord, String> WHEN_CONDITION = createField(DSL.name("when_condition"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.then_action</code>.
     */
    public final TableField<RulesConfigurationRecord, String> THEN_ACTION = createField(DSL.name("then_action"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.service_region</code>.
     */
    public final TableField<RulesConfigurationRecord, Integer> SERVICE_REGION = createField(DSL.name("service_region"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.priority</code>.
     */
    public final TableField<RulesConfigurationRecord, Integer> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.created_at</code>.
     */
    public final TableField<RulesConfigurationRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.last_updated_at</code>.
     */
    public final TableField<RulesConfigurationRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.created_by</code>.
     */
    public final TableField<RulesConfigurationRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.updated_by</code>.
     */
    public final TableField<RulesConfigurationRecord, UInteger> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.is_active</code>.
     */
    public final TableField<RulesConfigurationRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.rule_type</code>.
     */
    public final TableField<RulesConfigurationRecord, String> RULE_TYPE = createField(DSL.name("rule_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rules_configuration.weightage</code>.
     */
    public final TableField<RulesConfigurationRecord, Integer> WEIGHTAGE = createField(DSL.name("weightage"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.rules_configuration</code> table reference
     */
    public RulesConfiguration() {
        this(DSL.name("rules_configuration"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rules_configuration</code> table reference
     */
    public RulesConfiguration(String alias) {
        this(DSL.name(alias), RULES_CONFIGURATION);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rules_configuration</code> table reference
     */
    public RulesConfiguration(Name alias) {
        this(alias, RULES_CONFIGURATION);
    }

    private RulesConfiguration(Name alias, Table<RulesConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private RulesConfiguration(Name alias, Table<RulesConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RulesConfiguration(Table<O> child, ForeignKey<O, RulesConfigurationRecord> key) {
        super(child, key, RULES_CONFIGURATION);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RulesConfigurationRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RULES_CONFIGURATION;
    }

    @Override
    public UniqueKey<RulesConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_RULES_CONFIGURATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<RulesConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<RulesConfigurationRecord>>asList(Keys.KEY_RULES_CONFIGURATION_PRIMARY);
    }

    @Override
    public RulesConfiguration as(String alias) {
        return new RulesConfiguration(DSL.name(alias), this);
    }

    @Override
    public RulesConfiguration as(Name alias) {
        return new RulesConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RulesConfiguration rename(String name) {
        return new RulesConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RulesConfiguration rename(Name name) {
        return new RulesConfiguration(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, String, String, Integer, Integer, Long, Long, UInteger, UInteger, Byte, String, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
