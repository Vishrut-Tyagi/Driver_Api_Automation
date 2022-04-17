/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.DriverCreditsDebitsRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class DriverCreditsDebits extends TableImpl<DriverCreditsDebitsRecord> {

    private static final long serialVersionUID = 104306041;

    /**
     * The reference instance of <code>blusmartDevDb.driver_credits_debits</code>
     */
    public static final DriverCreditsDebits DRIVER_CREDITS_DEBITS = new DriverCreditsDebits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverCreditsDebitsRecord> getRecordType() {
        return DriverCreditsDebitsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.id</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.lease_driver_final_payout_id</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, UInteger> LEASE_DRIVER_FINAL_PAYOUT_ID = createField(DSL.name("lease_driver_final_payout_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.occurrence_timestamp</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, Long> OCCURRENCE_TIMESTAMP = createField(DSL.name("occurrence_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.driver_id</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.driver_name</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> DRIVER_NAME = createField(DSL.name("driver_name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.amount</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL(20, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.type</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.vehicle_number</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.reason</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> REASON = createField(DSL.name("reason"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.other_flags</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.is_active</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.created_timestamp</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.last_updated_timestamp</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.created_by</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.last_updated_by</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.status</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_credits_debits.disbursal_timestamp</code>.
     */
    public final TableField<DriverCreditsDebitsRecord, Long> DISBURSAL_TIMESTAMP = createField(DSL.name("disbursal_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>blusmartDevDb.driver_credits_debits</code> table reference
     */
    public DriverCreditsDebits() {
        this(DSL.name("driver_credits_debits"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_credits_debits</code> table reference
     */
    public DriverCreditsDebits(String alias) {
        this(DSL.name(alias), DRIVER_CREDITS_DEBITS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_credits_debits</code> table reference
     */
    public DriverCreditsDebits(Name alias) {
        this(alias, DRIVER_CREDITS_DEBITS);
    }

    private DriverCreditsDebits(Name alias, Table<DriverCreditsDebitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DriverCreditsDebits(Name alias, Table<DriverCreditsDebitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DriverCreditsDebits(Table<O> child, ForeignKey<O, DriverCreditsDebitsRecord> key) {
        super(child, key, DRIVER_CREDITS_DEBITS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<DriverCreditsDebitsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_DRIVER_CREDITS_DEBITS;
    }

    @Override
    public UniqueKey<DriverCreditsDebitsRecord> getPrimaryKey() {
        return Keys.KEY_DRIVER_CREDITS_DEBITS_PRIMARY;
    }

    @Override
    public List<UniqueKey<DriverCreditsDebitsRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverCreditsDebitsRecord>>asList(Keys.KEY_DRIVER_CREDITS_DEBITS_PRIMARY);
    }

    @Override
    public DriverCreditsDebits as(String alias) {
        return new DriverCreditsDebits(DSL.name(alias), this);
    }

    @Override
    public DriverCreditsDebits as(Name alias) {
        return new DriverCreditsDebits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverCreditsDebits rename(String name) {
        return new DriverCreditsDebits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverCreditsDebits rename(Name name) {
        return new DriverCreditsDebits(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<UInteger, UInteger, Long, UInteger, String, BigDecimal, String, String, String, String, Byte, Long, Long, UInteger, UInteger, String, Long> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}