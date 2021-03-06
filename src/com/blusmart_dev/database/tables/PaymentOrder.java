/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.PaymentOrderRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class PaymentOrder extends TableImpl<PaymentOrderRecord> {

    private static final long serialVersionUID = -1874640184;

    /**
     * The reference instance of <code>blusmartDevDb.payment_order</code>
     */
    public static final PaymentOrder PAYMENT_ORDER = new PaymentOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentOrderRecord> getRecordType() {
        return PaymentOrderRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.payment_order.order_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> ORDER_ID = createField(DSL.name("order_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.order_type</code>.
     */
    public final TableField<PaymentOrderRecord, String> ORDER_TYPE = createField(DSL.name("order_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.amount</code>.
     */
    public final TableField<PaymentOrderRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.ride_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.is_active</code>.
     */
    public final TableField<PaymentOrderRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.order_status</code>.
     */
    public final TableField<PaymentOrderRecord, String> ORDER_STATUS = createField(DSL.name("order_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.created_timestamp</code>.
     */
    public final TableField<PaymentOrderRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.last_updated_timestamp</code>.
     */
    public final TableField<PaymentOrderRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.rider_id</code>.
     */
    public final TableField<PaymentOrderRecord, Integer> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.payment_mode</code>.
     */
    public final TableField<PaymentOrderRecord, String> PAYMENT_MODE = createField(DSL.name("payment_mode"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.refund_status</code>.
     */
    public final TableField<PaymentOrderRecord, String> REFUND_STATUS = createField(DSL.name("refund_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.refund_order_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> REFUND_ORDER_ID = createField(DSL.name("refund_order_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.error_log</code>.
     */
    public final TableField<PaymentOrderRecord, String> ERROR_LOG = createField(DSL.name("error_log"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.created_by</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.last_updated_by</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.ride_request_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.extra_data</code>.
     */
    public final TableField<PaymentOrderRecord, String> EXTRA_DATA = createField(DSL.name("extra_data"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.ridecell_rider_id</code>.
     */
    public final TableField<PaymentOrderRecord, Integer> RIDECELL_RIDER_ID = createField(DSL.name("ridecell_rider_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.paytm_pre_auth_id</code>.
     */
    public final TableField<PaymentOrderRecord, String> PAYTM_PRE_AUTH_ID = createField(DSL.name("paytm_pre_auth_id"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.payment_transaction_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> PAYMENT_TRANSACTION_ID = createField(DSL.name("payment_transaction_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.capture_amount</code>.
     */
    public final TableField<PaymentOrderRecord, BigDecimal> CAPTURE_AMOUNT = createField(DSL.name("capture_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.block_duration</code>.
     */
    public final TableField<PaymentOrderRecord, Long> BLOCK_DURATION = createField(DSL.name("block_duration"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.pending_amount</code>.
     */
    public final TableField<PaymentOrderRecord, BigDecimal> PENDING_AMOUNT = createField(DSL.name("pending_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.order_id_for_payment</code>.
     */
    public final TableField<PaymentOrderRecord, String> ORDER_ID_FOR_PAYMENT = createField(DSL.name("order_id_for_payment"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.mark_for_refund</code>.
     */
    public final TableField<PaymentOrderRecord, Byte> MARK_FOR_REFUND = createField(DSL.name("mark_for_refund"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.block_amount</code>.
     */
    public final TableField<PaymentOrderRecord, BigDecimal> BLOCK_AMOUNT = createField(DSL.name("block_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.release_amount</code>.
     */
    public final TableField<PaymentOrderRecord, BigDecimal> RELEASE_AMOUNT = createField(DSL.name("release_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.user_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.business_account_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> BUSINESS_ACCOUNT_ID = createField(DSL.name("business_account_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.payment_order.driver_id</code>.
     */
    public final TableField<PaymentOrderRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.payment_order</code> table reference
     */
    public PaymentOrder() {
        this(DSL.name("payment_order"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.payment_order</code> table reference
     */
    public PaymentOrder(String alias) {
        this(DSL.name(alias), PAYMENT_ORDER);
    }

    /**
     * Create an aliased <code>blusmartDevDb.payment_order</code> table reference
     */
    public PaymentOrder(Name alias) {
        this(alias, PAYMENT_ORDER);
    }

    private PaymentOrder(Name alias, Table<PaymentOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentOrder(Name alias, Table<PaymentOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> PaymentOrder(Table<O> child, ForeignKey<O, PaymentOrderRecord> key) {
        super(child, key, PAYMENT_ORDER);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<PaymentOrderRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_PAYMENT_ORDER;
    }

    @Override
    public UniqueKey<PaymentOrderRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENT_ORDER_PRIMARY;
    }

    @Override
    public List<UniqueKey<PaymentOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentOrderRecord>>asList(Keys.KEY_PAYMENT_ORDER_PRIMARY, Keys.KEY_PAYMENT_ORDER_REFUND_ORDER_ID);
    }

    @Override
    public PaymentOrder as(String alias) {
        return new PaymentOrder(DSL.name(alias), this);
    }

    @Override
    public PaymentOrder as(Name alias) {
        return new PaymentOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentOrder rename(String name) {
        return new PaymentOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentOrder rename(Name name) {
        return new PaymentOrder(name, null);
    }
}
