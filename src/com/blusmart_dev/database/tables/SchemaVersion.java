/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Indexes;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.SchemaVersionRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class SchemaVersion extends TableImpl<SchemaVersionRecord> {

    private static final long serialVersionUID = -1926570676;

    /**
     * The reference instance of <code>blusmartDevDb.schema_version</code>
     */
    public static final SchemaVersion SCHEMA_VERSION = new SchemaVersion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaVersionRecord> getRecordType() {
        return SchemaVersionRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.schema_version.installed_rank</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> INSTALLED_RANK = createField(DSL.name("installed_rank"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.version</code>.
     */
    public final TableField<SchemaVersionRecord, String> VERSION = createField(DSL.name("version"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.description</code>.
     */
    public final TableField<SchemaVersionRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.type</code>.
     */
    public final TableField<SchemaVersionRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.script</code>.
     */
    public final TableField<SchemaVersionRecord, String> SCRIPT = createField(DSL.name("script"), org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.checksum</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> CHECKSUM = createField(DSL.name("checksum"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.installed_by</code>.
     */
    public final TableField<SchemaVersionRecord, String> INSTALLED_BY = createField(DSL.name("installed_by"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.installed_on</code>.
     */
    public final TableField<SchemaVersionRecord, LocalDateTime> INSTALLED_ON = createField(DSL.name("installed_on"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("current_timestamp()", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.execution_time</code>.
     */
    public final TableField<SchemaVersionRecord, Integer> EXECUTION_TIME = createField(DSL.name("execution_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.schema_version.success</code>.
     */
    public final TableField<SchemaVersionRecord, Byte> SUCCESS = createField(DSL.name("success"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>blusmartDevDb.schema_version</code> table reference
     */
    public SchemaVersion() {
        this(DSL.name("schema_version"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.schema_version</code> table reference
     */
    public SchemaVersion(String alias) {
        this(DSL.name(alias), SCHEMA_VERSION);
    }

    /**
     * Create an aliased <code>blusmartDevDb.schema_version</code> table reference
     */
    public SchemaVersion(Name alias) {
        this(alias, SCHEMA_VERSION);
    }

    private SchemaVersion(Name alias, Table<SchemaVersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaVersion(Name alias, Table<SchemaVersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SchemaVersion(Table<O> child, ForeignKey<O, SchemaVersionRecord> key) {
        super(child, key, SCHEMA_VERSION);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHEMA_VERSION_SCHEMA_VERSION_S_IDX);
    }

    @Override
    public UniqueKey<SchemaVersionRecord> getPrimaryKey() {
        return Keys.KEY_SCHEMA_VERSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SchemaVersionRecord>> getKeys() {
        return Arrays.<UniqueKey<SchemaVersionRecord>>asList(Keys.KEY_SCHEMA_VERSION_PRIMARY);
    }

    @Override
    public SchemaVersion as(String alias) {
        return new SchemaVersion(DSL.name(alias), this);
    }

    @Override
    public SchemaVersion as(Name alias) {
        return new SchemaVersion(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaVersion rename(String name) {
        return new SchemaVersion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaVersion rename(Name name) {
        return new SchemaVersion(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, Integer, String, LocalDateTime, Integer, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}