/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.WalletTransactionsRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class WalletTransactions extends TableImpl<WalletTransactionsRecord> {

    private static final long serialVersionUID = -514244109;

    /**
     * The reference instance of <code>blusmartDevDb.wallet_transactions</code>
     */
    public static final WalletTransactions WALLET_TRANSACTIONS = new WalletTransactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WalletTransactionsRecord> getRecordType() {
        return WalletTransactionsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.wallet_transactions.id</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.ride_request_id</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.rider_id</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.amount</code>.
     */
    public final TableField<WalletTransactionsRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.type</code>.
     */
    public final TableField<WalletTransactionsRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.from</code>.
     */
    public final TableField<WalletTransactionsRecord, String> FROM = createField(DSL.name("from"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.transaction_time</code>.
     */
    public final TableField<WalletTransactionsRecord, Long> TRANSACTION_TIME = createField(DSL.name("transaction_time"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.payment_mode</code>.
     */
    public final TableField<WalletTransactionsRecord, String> PAYMENT_MODE = createField(DSL.name("payment_mode"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.payment_status</code>.
     */
    public final TableField<WalletTransactionsRecord, String> PAYMENT_STATUS = createField(DSL.name("payment_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.order_id</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.closing balance</code>.
     */
    public final TableField<WalletTransactionsRecord, BigDecimal> CLOSING_BALANCE = createField(DSL.name("closing balance"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.message</code>.
     */
    public final TableField<WalletTransactionsRecord, String> MESSAGE = createField(DSL.name("message"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.subtitle</code>.
     */
    public final TableField<WalletTransactionsRecord, String> SUBTITLE = createField(DSL.name("subtitle"), org.jooq.impl.SQLDataType.VARCHAR(2048).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.is_active</code>.
     */
    public final TableField<WalletTransactionsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.created_timestamp</code>.
     */
    public final TableField<WalletTransactionsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.last_updated_timestamp</code>.
     */
    public final TableField<WalletTransactionsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.created_by</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.last_updated_by</code>.
     */
    public final TableField<WalletTransactionsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wallet_transactions.remark</code>.
     */
    public final TableField<WalletTransactionsRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.wallet_transactions</code> table reference
     */
    public WalletTransactions() {
        this(DSL.name("wallet_transactions"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.wallet_transactions</code> table reference
     */
    public WalletTransactions(String alias) {
        this(DSL.name(alias), WALLET_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.wallet_transactions</code> table reference
     */
    public WalletTransactions(Name alias) {
        this(alias, WALLET_TRANSACTIONS);
    }

    private WalletTransactions(Name alias, Table<WalletTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WalletTransactions(Name alias, Table<WalletTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WalletTransactions(Table<O> child, ForeignKey<O, WalletTransactionsRecord> key) {
        super(child, key, WALLET_TRANSACTIONS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<WalletTransactionsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_WALLET_TRANSACTIONS;
    }

    @Override
    public UniqueKey<WalletTransactionsRecord> getPrimaryKey() {
        return Keys.KEY_WALLET_TRANSACTIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<WalletTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<WalletTransactionsRecord>>asList(Keys.KEY_WALLET_TRANSACTIONS_PRIMARY);
    }

    @Override
    public WalletTransactions as(String alias) {
        return new WalletTransactions(DSL.name(alias), this);
    }

    @Override
    public WalletTransactions as(Name alias) {
        return new WalletTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WalletTransactions rename(String name) {
        return new WalletTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WalletTransactions rename(Name name) {
        return new WalletTransactions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<UInteger, UInteger, UInteger, BigDecimal, String, String, Long, String, String, UInteger, BigDecimal, String, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
