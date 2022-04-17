/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.WorkshopDataRecord;

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
public class WorkshopData extends TableImpl<WorkshopDataRecord> {

    private static final long serialVersionUID = -268968303;

    /**
     * The reference instance of <code>blusmartDevDb.workshop_data</code>
     */
    public static final WorkshopData WORKSHOP_DATA = new WorkshopData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WorkshopDataRecord> getRecordType() {
        return WorkshopDataRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.workshop_data.id</code>.
     */
    public final TableField<WorkshopDataRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.workshop_name</code>.
     */
    public final TableField<WorkshopDataRecord, String> WORKSHOP_NAME = createField(DSL.name("workshop_name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.latitude</code>.
     */
    public final TableField<WorkshopDataRecord, BigDecimal> LATITUDE = createField(DSL.name("latitude"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.longitude</code>.
     */
    public final TableField<WorkshopDataRecord, BigDecimal> LONGITUDE = createField(DSL.name("longitude"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.created_by</code>.
     */
    public final TableField<WorkshopDataRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.updated_by</code>.
     */
    public final TableField<WorkshopDataRecord, Integer> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.created_at</code>.
     */
    public final TableField<WorkshopDataRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.last_updated_at</code>.
     */
    public final TableField<WorkshopDataRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.is_active</code>.
     */
    public final TableField<WorkshopDataRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.oem</code>.
     */
    public final TableField<WorkshopDataRecord, String> OEM = createField(DSL.name("oem"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.area</code>.
     */
    public final TableField<WorkshopDataRecord, String> AREA = createField(DSL.name("area"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.address</code>.
     */
    public final TableField<WorkshopDataRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.contact_person</code>.
     */
    public final TableField<WorkshopDataRecord, String> CONTACT_PERSON = createField(DSL.name("contact_person"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.workshop_data.contact_number</code>.
     */
    public final TableField<WorkshopDataRecord, String> CONTACT_NUMBER = createField(DSL.name("contact_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.workshop_data</code> table reference
     */
    public WorkshopData() {
        this(DSL.name("workshop_data"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.workshop_data</code> table reference
     */
    public WorkshopData(String alias) {
        this(DSL.name(alias), WORKSHOP_DATA);
    }

    /**
     * Create an aliased <code>blusmartDevDb.workshop_data</code> table reference
     */
    public WorkshopData(Name alias) {
        this(alias, WORKSHOP_DATA);
    }

    private WorkshopData(Name alias, Table<WorkshopDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private WorkshopData(Name alias, Table<WorkshopDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WorkshopData(Table<O> child, ForeignKey<O, WorkshopDataRecord> key) {
        super(child, key, WORKSHOP_DATA);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<WorkshopDataRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_WORKSHOP_DATA;
    }

    @Override
    public UniqueKey<WorkshopDataRecord> getPrimaryKey() {
        return Keys.KEY_WORKSHOP_DATA_PRIMARY;
    }

    @Override
    public List<UniqueKey<WorkshopDataRecord>> getKeys() {
        return Arrays.<UniqueKey<WorkshopDataRecord>>asList(Keys.KEY_WORKSHOP_DATA_PRIMARY);
    }

    @Override
    public WorkshopData as(String alias) {
        return new WorkshopData(DSL.name(alias), this);
    }

    @Override
    public WorkshopData as(Name alias) {
        return new WorkshopData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WorkshopData rename(String name) {
        return new WorkshopData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WorkshopData rename(Name name) {
        return new WorkshopData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, String, BigDecimal, BigDecimal, Integer, Integer, Long, Long, Byte, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
