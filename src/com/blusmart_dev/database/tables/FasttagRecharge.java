/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.FasttagRechargeRecord;

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
public class FasttagRecharge extends TableImpl<FasttagRechargeRecord> {

    private static final long serialVersionUID = 1850927398;

    /**
     * The reference instance of <code>blusmartDevDb.fastTag_recharge</code>
     */
    public static final FasttagRecharge FASTTAG_RECHARGE = new FasttagRecharge();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FasttagRechargeRecord> getRecordType() {
        return FasttagRechargeRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.id</code>.
     */
    public final TableField<FasttagRechargeRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.vehicle_number</code>.
     */
    public final TableField<FasttagRechargeRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.tagId</code>.
     */
    public final TableField<FasttagRechargeRecord, String> TAGID = createField(DSL.name("tagId"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.orderId</code>.
     */
    public final TableField<FasttagRechargeRecord, String> ORDERID = createField(DSL.name("orderId"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.hub</code>.
     */
    public final TableField<FasttagRechargeRecord, String> HUB = createField(DSL.name("hub"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.recharge_amount</code>.
     */
    public final TableField<FasttagRechargeRecord, String> RECHARGE_AMOUNT = createField(DSL.name("recharge_amount"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.status</code>.
     */
    public final TableField<FasttagRechargeRecord, String> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.transaction_id</code>.
     */
    public final TableField<FasttagRechargeRecord, String> TRANSACTION_ID = createField(DSL.name("transaction_id"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.opening_balance</code>.
     */
    public final TableField<FasttagRechargeRecord, String> OPENING_BALANCE = createField(DSL.name("opening_balance"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.closing_balance</code>.
     */
    public final TableField<FasttagRechargeRecord, String> CLOSING_BALANCE = createField(DSL.name("closing_balance"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.is_active</code>.
     */
    public final TableField<FasttagRechargeRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.created_by</code>.
     */
    public final TableField<FasttagRechargeRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.updated_by</code>.
     */
    public final TableField<FasttagRechargeRecord, Integer> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.created_timestamp</code>.
     */
    public final TableField<FasttagRechargeRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.fastTag_recharge.last_updated_timestamp</code>.
     */
    public final TableField<FasttagRechargeRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>blusmartDevDb.fastTag_recharge</code> table reference
     */
    public FasttagRecharge() {
        this(DSL.name("fastTag_recharge"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.fastTag_recharge</code> table reference
     */
    public FasttagRecharge(String alias) {
        this(DSL.name(alias), FASTTAG_RECHARGE);
    }

    /**
     * Create an aliased <code>blusmartDevDb.fastTag_recharge</code> table reference
     */
    public FasttagRecharge(Name alias) {
        this(alias, FASTTAG_RECHARGE);
    }

    private FasttagRecharge(Name alias, Table<FasttagRechargeRecord> aliased) {
        this(alias, aliased, null);
    }

    private FasttagRecharge(Name alias, Table<FasttagRechargeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> FasttagRecharge(Table<O> child, ForeignKey<O, FasttagRechargeRecord> key) {
        super(child, key, FASTTAG_RECHARGE);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<FasttagRechargeRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_FASTTAG_RECHARGE;
    }

    @Override
    public UniqueKey<FasttagRechargeRecord> getPrimaryKey() {
        return Keys.KEY_FASTTAG_RECHARGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<FasttagRechargeRecord>> getKeys() {
        return Arrays.<UniqueKey<FasttagRechargeRecord>>asList(Keys.KEY_FASTTAG_RECHARGE_PRIMARY);
    }

    @Override
    public FasttagRecharge as(String alias) {
        return new FasttagRecharge(DSL.name(alias), this);
    }

    @Override
    public FasttagRecharge as(Name alias) {
        return new FasttagRecharge(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FasttagRecharge rename(String name) {
        return new FasttagRecharge(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FasttagRecharge rename(Name name) {
        return new FasttagRecharge(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, String, String, String, String, String, String, String, String, String, Byte, Integer, Integer, Long, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
