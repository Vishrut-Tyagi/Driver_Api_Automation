/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RideRequestsRecord;

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
public class RideRequests extends TableImpl<RideRequestsRecord> {

    private static final long serialVersionUID = -419226456;

    /**
     * The reference instance of <code>blusmartDevDb.ride_requests</code>
     */
    public static final RideRequests RIDE_REQUESTS = new RideRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RideRequestsRecord> getRecordType() {
        return RideRequestsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.ride_requests.id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.rider_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.rider_type</code>.
     */
    public final TableField<RideRequestsRecord, String> RIDER_TYPE = createField(DSL.name("rider_type"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.request_state</code>.
     */
    public final TableField<RideRequestsRecord, String> REQUEST_STATE = createField(DSL.name("request_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pick_up_location</code>.
     */
    public final TableField<RideRequestsRecord, String> PICK_UP_LOCATION = createField(DSL.name("pick_up_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.drop_location</code>.
     */
    public final TableField<RideRequestsRecord, String> DROP_LOCATION = createField(DSL.name("drop_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.verification_token_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> VERIFICATION_TOKEN_ID = createField(DSL.name("verification_token_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.request_location</code>.
     */
    public final TableField<RideRequestsRecord, String> REQUEST_LOCATION = createField(DSL.name("request_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pick_up_location_lat</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> PICK_UP_LOCATION_LAT = createField(DSL.name("pick_up_location_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.drop_location_lat</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> DROP_LOCATION_LAT = createField(DSL.name("drop_location_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.request_location_lat</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> REQUEST_LOCATION_LAT = createField(DSL.name("request_location_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pick_up_location_long</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> PICK_UP_LOCATION_LONG = createField(DSL.name("pick_up_location_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.drop_location_long</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> DROP_LOCATION_LONG = createField(DSL.name("drop_location_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.request_location_long</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> REQUEST_LOCATION_LONG = createField(DSL.name("request_location_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.estimated_start_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> ESTIMATED_START_TIMESTAMP = createField(DSL.name("estimated_start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.estimated_completion_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> ESTIMATED_COMPLETION_TIMESTAMP = createField(DSL.name("estimated_completion_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.estimated_amount</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> ESTIMATED_AMOUNT = createField(DSL.name("estimated_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.estimated_distance</code>.
     */
    public final TableField<RideRequestsRecord, BigDecimal> ESTIMATED_DISTANCE = createField(DSL.name("estimated_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.no_of_passengers</code>.
     */
    public final TableField<RideRequestsRecord, Integer> NO_OF_PASSENGERS = createField(DSL.name("no_of_passengers"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.is_active</code>.
     */
    public final TableField<RideRequestsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.created_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.last_updated_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.created_by</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.last_updated_by</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.payment_mode</code>.
     */
    public final TableField<RideRequestsRecord, String> PAYMENT_MODE = createField(DSL.name("payment_mode"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.platform</code>.
     */
    public final TableField<RideRequestsRecord, String> PLATFORM = createField(DSL.name("platform"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.ride_type</code>.
     */
    public final TableField<RideRequestsRecord, String> RIDE_TYPE = createField(DSL.name("ride_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.service_region_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> SERVICE_REGION_ID = createField(DSL.name("service_region_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.payment_order_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> PAYMENT_ORDER_ID = createField(DSL.name("payment_order_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.cancellation_reason</code>.
     */
    public final TableField<RideRequestsRecord, String> CANCELLATION_REASON = createField(DSL.name("cancellation_reason"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pickup_drop_direction</code>.
     */
    public final TableField<RideRequestsRecord, String> PICKUP_DROP_DIRECTION = createField(DSL.name("pickup_drop_direction"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.flight_no</code>.
     */
    public final TableField<RideRequestsRecord, String> FLIGHT_NO = createField(DSL.name("flight_no"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pick_drop_path_id</code>.
     */
    public final TableField<RideRequestsRecord, String> PICK_DROP_PATH_ID = createField(DSL.name("pick_drop_path_id"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.eligible_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> ELIGIBLE_TIMESTAMP = createField(DSL.name("eligible_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.ridecell_trip_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> RIDECELL_TRIP_ID = createField(DSL.name("ridecell_trip_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.package_code</code>.
     */
    public final TableField<RideRequestsRecord, String> PACKAGE_CODE = createField(DSL.name("package_code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.pricing_details_id</code>.
     */
    public final TableField<RideRequestsRecord, Integer> PRICING_DETAILS_ID = createField(DSL.name("pricing_details_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.confirmation_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> CONFIRMATION_TIMESTAMP = createField(DSL.name("confirmation_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.ticket_id</code>.
     */
    public final TableField<RideRequestsRecord, UInteger> TICKET_ID = createField(DSL.name("ticket_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.cancellation_timestamp</code>.
     */
    public final TableField<RideRequestsRecord, Long> CANCELLATION_TIMESTAMP = createField(DSL.name("cancellation_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.promo_code</code>.
     */
    public final TableField<RideRequestsRecord, String> PROMO_CODE = createField(DSL.name("promo_code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.source</code>.
     */
    public final TableField<RideRequestsRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.ride_category</code>.
     */
    public final TableField<RideRequestsRecord, String> RIDE_CATEGORY = createField(DSL.name("ride_category"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.other_flags</code>.
     */
    public final TableField<RideRequestsRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.additional_promo</code>.
     */
    public final TableField<RideRequestsRecord, String> ADDITIONAL_PROMO = createField(DSL.name("additional_promo"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.request_type</code>.
     */
    public final TableField<RideRequestsRecord, String> REQUEST_TYPE = createField(DSL.name("request_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.booked_for</code>.
     */
    public final TableField<RideRequestsRecord, Integer> BOOKED_FOR = createField(DSL.name("booked_for"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.booked_by</code>.
     */
    public final TableField<RideRequestsRecord, Integer> BOOKED_BY = createField(DSL.name("booked_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride_requests.price_map_id</code>.
     */
    public final TableField<RideRequestsRecord, Integer> PRICE_MAP_ID = createField(DSL.name("price_map_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.ride_requests</code> table reference
     */
    public RideRequests() {
        this(DSL.name("ride_requests"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.ride_requests</code> table reference
     */
    public RideRequests(String alias) {
        this(DSL.name(alias), RIDE_REQUESTS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.ride_requests</code> table reference
     */
    public RideRequests(Name alias) {
        this(alias, RIDE_REQUESTS);
    }

    private RideRequests(Name alias, Table<RideRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RideRequests(Name alias, Table<RideRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RideRequests(Table<O> child, ForeignKey<O, RideRequestsRecord> key) {
        super(child, key, RIDE_REQUESTS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RideRequestsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RIDE_REQUESTS;
    }

    @Override
    public UniqueKey<RideRequestsRecord> getPrimaryKey() {
        return Keys.KEY_RIDE_REQUESTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RideRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<RideRequestsRecord>>asList(Keys.KEY_RIDE_REQUESTS_PRIMARY);
    }

    @Override
    public RideRequests as(String alias) {
        return new RideRequests(DSL.name(alias), this);
    }

    @Override
    public RideRequests as(Name alias) {
        return new RideRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RideRequests rename(String name) {
        return new RideRequests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RideRequests rename(Name name) {
        return new RideRequests(name, null);
    }
}
