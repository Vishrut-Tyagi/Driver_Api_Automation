/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.LeaseMarketplaceCombinationRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class LeaseMarketplaceCombination extends TableImpl<LeaseMarketplaceCombinationRecord> {

    private static final long serialVersionUID = 83224561;

    /**
     * The reference instance of <code>blusmartDevDb.lease_marketplace_combination</code>
     */
    public static final LeaseMarketplaceCombination LEASE_MARKETPLACE_COMBINATION = new LeaseMarketplaceCombination();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LeaseMarketplaceCombinationRecord> getRecordType() {
        return LeaseMarketplaceCombinationRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.id</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.lease_id</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, UInteger> LEASE_ID = createField(DSL.name("lease_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.lmp_combination_id</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, String> LMP_COMBINATION_ID = createField(DSL.name("lmp_combination_id"), org.jooq.impl.SQLDataType.CHAR(36).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.slot</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, UInteger> SLOT = createField(DSL.name("slot"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.created_by</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.created_at</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.last_updated_by</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.is_active</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.last_updated_at</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.duty_type</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, String> DUTY_TYPE = createField(DSL.name("duty_type"), org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_marketplace_combination.vehicle_variant</code>.
     */
    public final TableField<LeaseMarketplaceCombinationRecord, String> VEHICLE_VARIANT = createField(DSL.name("vehicle_variant"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.lease_marketplace_combination</code> table reference
     */
    public LeaseMarketplaceCombination() {
        this(DSL.name("lease_marketplace_combination"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_marketplace_combination</code> table reference
     */
    public LeaseMarketplaceCombination(String alias) {
        this(DSL.name(alias), LEASE_MARKETPLACE_COMBINATION);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_marketplace_combination</code> table reference
     */
    public LeaseMarketplaceCombination(Name alias) {
        this(alias, LEASE_MARKETPLACE_COMBINATION);
    }

    private LeaseMarketplaceCombination(Name alias, Table<LeaseMarketplaceCombinationRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaseMarketplaceCombination(Name alias, Table<LeaseMarketplaceCombinationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> LeaseMarketplaceCombination(Table<O> child, ForeignKey<O, LeaseMarketplaceCombinationRecord> key) {
        super(child, key, LEASE_MARKETPLACE_COMBINATION);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<LeaseMarketplaceCombinationRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_LEASE_MARKETPLACE_COMBINATION;
    }

    @Override
    public UniqueKey<LeaseMarketplaceCombinationRecord> getPrimaryKey() {
        return Keys.KEY_LEASE_MARKETPLACE_COMBINATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<LeaseMarketplaceCombinationRecord>> getKeys() {
        return Arrays.<UniqueKey<LeaseMarketplaceCombinationRecord>>asList(Keys.KEY_LEASE_MARKETPLACE_COMBINATION_PRIMARY);
    }

    @Override
    public LeaseMarketplaceCombination as(String alias) {
        return new LeaseMarketplaceCombination(DSL.name(alias), this);
    }

    @Override
    public LeaseMarketplaceCombination as(Name alias) {
        return new LeaseMarketplaceCombination(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseMarketplaceCombination rename(String name) {
        return new LeaseMarketplaceCombination(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseMarketplaceCombination rename(Name name) {
        return new LeaseMarketplaceCombination(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UInteger, UInteger, String, UInteger, UInteger, Long, UInteger, Byte, Long, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}