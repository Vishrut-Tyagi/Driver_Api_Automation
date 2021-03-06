/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Indexes;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RecurringRideRequestsRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
public class RecurringRideRequests extends TableImpl<RecurringRideRequestsRecord> {

    private static final long serialVersionUID = -1438637940;

    /**
     * The reference instance of <code>blusmartDevDb.recurring_ride_requests</code>
     */
    public static final RecurringRideRequests RECURRING_RIDE_REQUESTS = new RecurringRideRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecurringRideRequestsRecord> getRecordType() {
        return RecurringRideRequestsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.id</code>.
     */
    public final TableField<RecurringRideRequestsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.rider_id</code>.
     */
    public final TableField<RecurringRideRequestsRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.per_trip_price</code>.
     */
    public final TableField<RecurringRideRequestsRecord, BigDecimal> PER_TRIP_PRICE = createField(DSL.name("per_trip_price"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.total_price</code>.
     */
    public final TableField<RecurringRideRequestsRecord, BigDecimal> TOTAL_PRICE = createField(DSL.name("total_price"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.renew_count</code>.
     */
    public final TableField<RecurringRideRequestsRecord, UInteger> RENEW_COUNT = createField(DSL.name("renew_count"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.start_timestamp</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Long> START_TIMESTAMP = createField(DSL.name("start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.end_timestamp</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Long> END_TIMESTAMP = createField(DSL.name("end_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.recurring_state</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> RECURRING_STATE = createField(DSL.name("recurring_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.configuration</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> CONFIGURATION = createField(DSL.name("configuration"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.wallet_added</code>.
     */
    public final TableField<RecurringRideRequestsRecord, BigDecimal> WALLET_ADDED = createField(DSL.name("wallet_added"), org.jooq.impl.SQLDataType.DECIMAL(12, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.is_active</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.created_by</code>.
     */
    public final TableField<RecurringRideRequestsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.created_at</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.last_updated_by</code>.
     */
    public final TableField<RecurringRideRequestsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.last_updated_at</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.note</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.platform</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> PLATFORM = createField(DSL.name("platform"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.estimated_distance</code>.
     */
    public final TableField<RecurringRideRequestsRecord, BigDecimal> ESTIMATED_DISTANCE = createField(DSL.name("estimated_distance"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.estimated_completion_mins</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Integer> ESTIMATED_COMPLETION_MINS = createField(DSL.name("estimated_completion_mins"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.estimated_pricing_details</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> ESTIMATED_PRICING_DETAILS = createField(DSL.name("estimated_pricing_details"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.payment_order_id</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Integer> PAYMENT_ORDER_ID = createField(DSL.name("payment_order_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.recurring_package_id</code>.
     */
    public final TableField<RecurringRideRequestsRecord, Integer> RECURRING_PACKAGE_ID = createField(DSL.name("recurring_package_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.promo_code</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> PROMO_CODE = createField(DSL.name("promo_code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.cancellation_reason</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> CANCELLATION_REASON = createField(DSL.name("cancellation_reason"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.last_tried_update</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> LAST_TRIED_UPDATE = createField(DSL.name("last_tried_update"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.otherFlags</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> OTHERFLAGS = createField(DSL.name("otherFlags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_ride_requests.pause_reason</code>.
     */
    public final TableField<RecurringRideRequestsRecord, String> PAUSE_REASON = createField(DSL.name("pause_reason"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.recurring_ride_requests</code> table reference
     */
    public RecurringRideRequests() {
        this(DSL.name("recurring_ride_requests"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.recurring_ride_requests</code> table reference
     */
    public RecurringRideRequests(String alias) {
        this(DSL.name(alias), RECURRING_RIDE_REQUESTS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.recurring_ride_requests</code> table reference
     */
    public RecurringRideRequests(Name alias) {
        this(alias, RECURRING_RIDE_REQUESTS);
    }

    private RecurringRideRequests(Name alias, Table<RecurringRideRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RecurringRideRequests(Name alias, Table<RecurringRideRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RecurringRideRequests(Table<O> child, ForeignKey<O, RecurringRideRequestsRecord> key) {
        super(child, key, RECURRING_RIDE_REQUESTS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RECURRING_RIDE_REQUESTS_END_TIME_INDEX, Indexes.RECURRING_RIDE_REQUESTS_RIDER_ID_INDEX, Indexes.RECURRING_RIDE_REQUESTS_STATE_INDEX);
    }

    @Override
    public Identity<RecurringRideRequestsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RECURRING_RIDE_REQUESTS;
    }

    @Override
    public UniqueKey<RecurringRideRequestsRecord> getPrimaryKey() {
        return Keys.KEY_RECURRING_RIDE_REQUESTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RecurringRideRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<RecurringRideRequestsRecord>>asList(Keys.KEY_RECURRING_RIDE_REQUESTS_PRIMARY);
    }

    @Override
    public RecurringRideRequests as(String alias) {
        return new RecurringRideRequests(DSL.name(alias), this);
    }

    @Override
    public RecurringRideRequests as(Name alias) {
        return new RecurringRideRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RecurringRideRequests rename(String name) {
        return new RecurringRideRequests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RecurringRideRequests rename(Name name) {
        return new RecurringRideRequests(name, null);
    }
}
