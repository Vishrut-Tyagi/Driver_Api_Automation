/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.tables.records.BusinessAccountTypesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessAccountTypes extends TableImpl<BusinessAccountTypesRecord> {

    private static final long serialVersionUID = 578604187;

    /**
     * The reference instance of <code>blusmartDevDb.business_account_types</code>
     */
    public static final BusinessAccountTypes BUSINESS_ACCOUNT_TYPES = new BusinessAccountTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusinessAccountTypesRecord> getRecordType() {
        return BusinessAccountTypesRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.business_account_types.account_type</code>.
     */
    public final TableField<BusinessAccountTypesRecord, String> ACCOUNT_TYPE = createField(DSL.name("account_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.business_payment_type</code>.
     */
    public final TableField<BusinessAccountTypesRecord, String> BUSINESS_PAYMENT_TYPE = createField(DSL.name("business_payment_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.note</code>.
     */
    public final TableField<BusinessAccountTypesRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.is_active</code>.
     */
    public final TableField<BusinessAccountTypesRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.created_timestamp</code>.
     */
    public final TableField<BusinessAccountTypesRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.last_updated_timestamp</code>.
     */
    public final TableField<BusinessAccountTypesRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.created_by</code>.
     */
    public final TableField<BusinessAccountTypesRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.business_account_types.last_updated_by</code>.
     */
    public final TableField<BusinessAccountTypesRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.business_account_types</code> table reference
     */
    public BusinessAccountTypes() {
        this(DSL.name("business_account_types"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.business_account_types</code> table reference
     */
    public BusinessAccountTypes(String alias) {
        this(DSL.name(alias), BUSINESS_ACCOUNT_TYPES);
    }

    /**
     * Create an aliased <code>blusmartDevDb.business_account_types</code> table reference
     */
    public BusinessAccountTypes(Name alias) {
        this(alias, BUSINESS_ACCOUNT_TYPES);
    }

    private BusinessAccountTypes(Name alias, Table<BusinessAccountTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusinessAccountTypes(Name alias, Table<BusinessAccountTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BusinessAccountTypes(Table<O> child, ForeignKey<O, BusinessAccountTypesRecord> key) {
        super(child, key, BUSINESS_ACCOUNT_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public BusinessAccountTypes as(String alias) {
        return new BusinessAccountTypes(DSL.name(alias), this);
    }

    @Override
    public BusinessAccountTypes as(Name alias) {
        return new BusinessAccountTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessAccountTypes rename(String name) {
        return new BusinessAccountTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusinessAccountTypes rename(Name name) {
        return new BusinessAccountTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}