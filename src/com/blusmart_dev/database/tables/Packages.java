/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.PackagesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class Packages extends TableImpl<PackagesRecord> {

    private static final long serialVersionUID = -1952745683;

    /**
     * The reference instance of <code>blusmartDevDb.packages</code>
     */
    public static final Packages PACKAGES = new Packages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PackagesRecord> getRecordType() {
        return PackagesRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.packages.id</code>.
     */
    public final TableField<PackagesRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.packages.package_code</code>.
     */
    public final TableField<PackagesRecord, String> PACKAGE_CODE = createField(DSL.name("package_code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.base_distance</code>.
     */
    public final TableField<PackagesRecord, Integer> BASE_DISTANCE = createField(DSL.name("base_distance"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.base_time</code>.
     */
    public final TableField<PackagesRecord, Integer> BASE_TIME = createField(DSL.name("base_time"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.base_price</code>.
     */
    public final TableField<PackagesRecord, Integer> BASE_PRICE = createField(DSL.name("base_price"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.created_at</code>.
     */
    public final TableField<PackagesRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.upadted_at</code>.
     */
    public final TableField<PackagesRecord, Long> UPADTED_AT = createField(DSL.name("upadted_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.created_by</code>.
     */
    public final TableField<PackagesRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.upadted_by</code>.
     */
    public final TableField<PackagesRecord, Integer> UPADTED_BY = createField(DSL.name("upadted_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.is_active</code>.
     */
    public final TableField<PackagesRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.notes</code>.
     */
    public final TableField<PackagesRecord, String> NOTES = createField(DSL.name("notes"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.source</code>.
     */
    public final TableField<PackagesRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.state</code>.
     */
    public final TableField<PackagesRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.updated_at</code>.
     */
    public final TableField<PackagesRecord, Long> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.packages.updated_by</code>.
     */
    public final TableField<PackagesRecord, Integer> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.packages</code> table reference
     */
    public Packages() {
        this(DSL.name("packages"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.packages</code> table reference
     */
    public Packages(String alias) {
        this(DSL.name(alias), PACKAGES);
    }

    /**
     * Create an aliased <code>blusmartDevDb.packages</code> table reference
     */
    public Packages(Name alias) {
        this(alias, PACKAGES);
    }

    private Packages(Name alias, Table<PackagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Packages(Name alias, Table<PackagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Packages(Table<O> child, ForeignKey<O, PackagesRecord> key) {
        super(child, key, PACKAGES);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<PackagesRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_PACKAGES;
    }

    @Override
    public UniqueKey<PackagesRecord> getPrimaryKey() {
        return Keys.KEY_PACKAGES_PRIMARY;
    }

    @Override
    public List<UniqueKey<PackagesRecord>> getKeys() {
        return Arrays.<UniqueKey<PackagesRecord>>asList(Keys.KEY_PACKAGES_PRIMARY);
    }

    @Override
    public Packages as(String alias) {
        return new Packages(DSL.name(alias), this);
    }

    @Override
    public Packages as(Name alias) {
        return new Packages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Packages rename(String name) {
        return new Packages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Packages rename(Name name) {
        return new Packages(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, String, Integer, Integer, Integer, Long, Long, Integer, Integer, Byte, String, String, String, Long, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
