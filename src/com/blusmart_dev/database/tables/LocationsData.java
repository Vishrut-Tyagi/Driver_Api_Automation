/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.LocationsDataRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class LocationsData extends TableImpl<LocationsDataRecord> {

    private static final long serialVersionUID = -1797737385;

    /**
     * The reference instance of <code>blusmartDevDb.locations_data</code>
     */
    public static final LocationsData LOCATIONS_DATA = new LocationsData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationsDataRecord> getRecordType() {
        return LocationsDataRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.locations_data.id</code>.
     */
    public final TableField<LocationsDataRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.name</code>.
     */
    public final TableField<LocationsDataRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.type</code>.
     */
    public final TableField<LocationsDataRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.location_data</code>.
     */
    public final TableField<LocationsDataRecord, String> LOCATION_DATA = createField(DSL.name("location_data"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.latitude</code>.
     */
    public final TableField<LocationsDataRecord, BigDecimal> LATITUDE = createField(DSL.name("latitude"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.longitude</code>.
     */
    public final TableField<LocationsDataRecord, BigDecimal> LONGITUDE = createField(DSL.name("longitude"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.toll_price</code>.
     */
    public final TableField<LocationsDataRecord, BigDecimal> TOLL_PRICE = createField(DSL.name("toll_price"), org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.is_active</code>.
     */
    public final TableField<LocationsDataRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.created_timestamp</code>.
     */
    public final TableField<LocationsDataRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.last_updated_timestamp</code>.
     */
    public final TableField<LocationsDataRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.created_by</code>.
     */
    public final TableField<LocationsDataRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.locations_data.last_updated_by</code>.
     */
    public final TableField<LocationsDataRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.locations_data</code> table reference
     */
    public LocationsData() {
        this(DSL.name("locations_data"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.locations_data</code> table reference
     */
    public LocationsData(String alias) {
        this(DSL.name(alias), LOCATIONS_DATA);
    }

    /**
     * Create an aliased <code>blusmartDevDb.locations_data</code> table reference
     */
    public LocationsData(Name alias) {
        this(alias, LOCATIONS_DATA);
    }

    private LocationsData(Name alias, Table<LocationsDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private LocationsData(Name alias, Table<LocationsDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> LocationsData(Table<O> child, ForeignKey<O, LocationsDataRecord> key) {
        super(child, key, LOCATIONS_DATA);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<LocationsDataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCATIONS_DATA;
    }

    @Override
    public UniqueKey<LocationsDataRecord> getPrimaryKey() {
        return Keys.KEY_LOCATIONS_DATA_PRIMARY;
    }

    @Override
    public List<UniqueKey<LocationsDataRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationsDataRecord>>asList(Keys.KEY_LOCATIONS_DATA_PRIMARY);
    }

    @Override
    public LocationsData as(String alias) {
        return new LocationsData(DSL.name(alias), this);
    }

    @Override
    public LocationsData as(Name alias) {
        return new LocationsData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationsData rename(String name) {
        return new LocationsData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationsData rename(Name name) {
        return new LocationsData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, BigDecimal, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
