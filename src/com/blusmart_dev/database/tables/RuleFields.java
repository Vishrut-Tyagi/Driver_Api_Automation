/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RuleFieldsRecord;

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
public class RuleFields extends TableImpl<RuleFieldsRecord> {

    private static final long serialVersionUID = -1910663112;

    /**
     * The reference instance of <code>blusmartDevDb.rule_fields</code>
     */
    public static final RuleFields RULE_FIELDS = new RuleFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleFieldsRecord> getRecordType() {
        return RuleFieldsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.rule_fields.id</code>.
     */
    public final TableField<RuleFieldsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.rule_type</code>.
     */
    public final TableField<RuleFieldsRecord, String> RULE_TYPE = createField(DSL.name("rule_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.field_name</code>.
     */
    public final TableField<RuleFieldsRecord, String> FIELD_NAME = createField(DSL.name("field_name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.parent_id</code>.
     */
    public final TableField<RuleFieldsRecord, UInteger> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.field_type</code>.
     */
    public final TableField<RuleFieldsRecord, String> FIELD_TYPE = createField(DSL.name("field_type"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.package_name</code>.
     */
    public final TableField<RuleFieldsRecord, String> PACKAGE_NAME = createField(DSL.name("package_name"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.value_type</code>.
     */
    public final TableField<RuleFieldsRecord, String> VALUE_TYPE = createField(DSL.name("value_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.is_active</code>.
     */
    public final TableField<RuleFieldsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.is_sortable</code>.
     */
    public final TableField<RuleFieldsRecord, Byte> IS_SORTABLE = createField(DSL.name("is_sortable"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.created_timestamp</code>.
     */
    public final TableField<RuleFieldsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.last_updated_timestamp</code>.
     */
    public final TableField<RuleFieldsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.created_by</code>.
     */
    public final TableField<RuleFieldsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rule_fields.updated_by</code>.
     */
    public final TableField<RuleFieldsRecord, UInteger> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.rule_fields</code> table reference
     */
    public RuleFields() {
        this(DSL.name("rule_fields"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rule_fields</code> table reference
     */
    public RuleFields(String alias) {
        this(DSL.name(alias), RULE_FIELDS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rule_fields</code> table reference
     */
    public RuleFields(Name alias) {
        this(alias, RULE_FIELDS);
    }

    private RuleFields(Name alias, Table<RuleFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleFields(Name alias, Table<RuleFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RuleFields(Table<O> child, ForeignKey<O, RuleFieldsRecord> key) {
        super(child, key, RULE_FIELDS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RuleFieldsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RULE_FIELDS;
    }

    @Override
    public UniqueKey<RuleFieldsRecord> getPrimaryKey() {
        return Keys.KEY_RULE_FIELDS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RuleFieldsRecord>> getKeys() {
        return Arrays.<UniqueKey<RuleFieldsRecord>>asList(Keys.KEY_RULE_FIELDS_PRIMARY);
    }

    @Override
    public RuleFields as(String alias) {
        return new RuleFields(DSL.name(alias), this);
    }

    @Override
    public RuleFields as(Name alias) {
        return new RuleFields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleFields rename(String name) {
        return new RuleFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleFields rename(Name name) {
        return new RuleFields(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, String, UInteger, String, String, String, Byte, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
