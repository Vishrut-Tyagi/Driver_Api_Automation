/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.SupplyRegionsRecord;

import java.math.BigDecimal;
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
public class SupplyRegions extends TableImpl<SupplyRegionsRecord> {

    private static final long serialVersionUID = 1175592809;

    /**
     * The reference instance of <code>blusmartDevDb.supply_regions</code>
     */
    public static final SupplyRegions SUPPLY_REGIONS = new SupplyRegions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupplyRegionsRecord> getRecordType() {
        return SupplyRegionsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.supply_regions.id</code>.
     */
    public final TableField<SupplyRegionsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.region_key</code>.
     */
    public final TableField<SupplyRegionsRecord, String> REGION_KEY = createField(DSL.name("region_key"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.min_supply</code>.
     */
    public final TableField<SupplyRegionsRecord, Integer> MIN_SUPPLY = createField(DSL.name("min_supply"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.max_supply</code>.
     */
    public final TableField<SupplyRegionsRecord, Integer> MAX_SUPPLY = createField(DSL.name("max_supply"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.flags</code>.
     */
    public final TableField<SupplyRegionsRecord, String> FLAGS = createField(DSL.name("flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.current_supply</code>.
     */
    public final TableField<SupplyRegionsRecord, Integer> CURRENT_SUPPLY = createField(DSL.name("current_supply"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.bounds</code>.
     */
    public final TableField<SupplyRegionsRecord, String> BOUNDS = createField(DSL.name("bounds"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.neighbouring_region_ids</code>.
     */
    public final TableField<SupplyRegionsRecord, String> NEIGHBOURING_REGION_IDS = createField(DSL.name("neighbouring_region_ids"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.center_point_lat</code>.
     */
    public final TableField<SupplyRegionsRecord, BigDecimal> CENTER_POINT_LAT = createField(DSL.name("center_point_lat"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.center_point_lng</code>.
     */
    public final TableField<SupplyRegionsRecord, BigDecimal> CENTER_POINT_LNG = createField(DSL.name("center_point_lng"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.is_active</code>.
     */
    public final TableField<SupplyRegionsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.created_timestamp</code>.
     */
    public final TableField<SupplyRegionsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.last_updated_timestamp</code>.
     */
    public final TableField<SupplyRegionsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.created_by</code>.
     */
    public final TableField<SupplyRegionsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.supply_regions.last_updated_by</code>.
     */
    public final TableField<SupplyRegionsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.supply_regions</code> table reference
     */
    public SupplyRegions() {
        this(DSL.name("supply_regions"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.supply_regions</code> table reference
     */
    public SupplyRegions(String alias) {
        this(DSL.name(alias), SUPPLY_REGIONS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.supply_regions</code> table reference
     */
    public SupplyRegions(Name alias) {
        this(alias, SUPPLY_REGIONS);
    }

    private SupplyRegions(Name alias, Table<SupplyRegionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SupplyRegions(Name alias, Table<SupplyRegionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SupplyRegions(Table<O> child, ForeignKey<O, SupplyRegionsRecord> key) {
        super(child, key, SUPPLY_REGIONS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<SupplyRegionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUPPLY_REGIONS;
    }

    @Override
    public UniqueKey<SupplyRegionsRecord> getPrimaryKey() {
        return Keys.KEY_SUPPLY_REGIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<SupplyRegionsRecord>> getKeys() {
        return Arrays.<UniqueKey<SupplyRegionsRecord>>asList(Keys.KEY_SUPPLY_REGIONS_PRIMARY);
    }

    @Override
    public SupplyRegions as(String alias) {
        return new SupplyRegions(DSL.name(alias), this);
    }

    @Override
    public SupplyRegions as(Name alias) {
        return new SupplyRegions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SupplyRegions rename(String name) {
        return new SupplyRegions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SupplyRegions rename(Name name) {
        return new SupplyRegions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, Integer, Integer, String, Integer, String, String, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
