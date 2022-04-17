/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RideRecord;

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
public class Ride extends TableImpl<RideRecord> {

    private static final long serialVersionUID = -1534605157;

    /**
     * The reference instance of <code>blusmartDevDb.ride</code>
     */
    public static final Ride RIDE = new Ride();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RideRecord> getRecordType() {
        return RideRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.ride.id</code>.
     */
    public final TableField<RideRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.ride.rider_id</code>.
     */
    public final TableField<RideRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.driver_id</code>.
     */
    public final TableField<RideRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.ride_state</code>.
     */
    public final TableField<RideRecord, String> RIDE_STATE = createField(DSL.name("ride_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.ride_type</code>.
     */
    public final TableField<RideRecord, String> RIDE_TYPE = createField(DSL.name("ride_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.rider_type</code>.
     */
    public final TableField<RideRecord, String> RIDER_TYPE = createField(DSL.name("rider_type"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.vehicle_number</code>.
     */
    public final TableField<RideRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.pick_up_timestamp</code>.
     */
    public final TableField<RideRecord, Long> PICK_UP_TIMESTAMP = createField(DSL.name("pick_up_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.arrival_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ARRIVAL_TIMESTAMP = createField(DSL.name("arrival_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.drop_timestamp</code>.
     */
    public final TableField<RideRecord, Long> DROP_TIMESTAMP = createField(DSL.name("drop_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.assign_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ASSIGN_TIMESTAMP = createField(DSL.name("assign_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.no_show_timestamp</code>.
     */
    public final TableField<RideRecord, Long> NO_SHOW_TIMESTAMP = createField(DSL.name("no_show_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.pick_up_location</code>.
     */
    public final TableField<RideRecord, String> PICK_UP_LOCATION = createField(DSL.name("pick_up_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.arrival_location</code>.
     */
    public final TableField<RideRecord, String> ARRIVAL_LOCATION = createField(DSL.name("arrival_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.drop_location</code>.
     */
    public final TableField<RideRecord, String> DROP_LOCATION = createField(DSL.name("drop_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.assign_location</code>.
     */
    public final TableField<RideRecord, String> ASSIGN_LOCATION = createField(DSL.name("assign_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.no_show_location</code>.
     */
    public final TableField<RideRecord, String> NO_SHOW_LOCATION = createField(DSL.name("no_show_location"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.pick_up_lat</code>.
     */
    public final TableField<RideRecord, BigDecimal> PICK_UP_LAT = createField(DSL.name("pick_up_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.arrival_lat</code>.
     */
    public final TableField<RideRecord, BigDecimal> ARRIVAL_LAT = createField(DSL.name("arrival_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.drop_lat</code>.
     */
    public final TableField<RideRecord, BigDecimal> DROP_LAT = createField(DSL.name("drop_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.assign_lat</code>.
     */
    public final TableField<RideRecord, BigDecimal> ASSIGN_LAT = createField(DSL.name("assign_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.no_show_lat</code>.
     */
    public final TableField<RideRecord, BigDecimal> NO_SHOW_LAT = createField(DSL.name("no_show_lat"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.pick_up_long</code>.
     */
    public final TableField<RideRecord, BigDecimal> PICK_UP_LONG = createField(DSL.name("pick_up_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.arrival_long</code>.
     */
    public final TableField<RideRecord, BigDecimal> ARRIVAL_LONG = createField(DSL.name("arrival_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.drop_long</code>.
     */
    public final TableField<RideRecord, BigDecimal> DROP_LONG = createField(DSL.name("drop_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.assign_long</code>.
     */
    public final TableField<RideRecord, BigDecimal> ASSIGN_LONG = createField(DSL.name("assign_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.no_show_long</code>.
     */
    public final TableField<RideRecord, BigDecimal> NO_SHOW_LONG = createField(DSL.name("no_show_long"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_start_soc</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_START_SOC = createField(DSL.name("trip_start_soc"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_complete_soc</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_COMPLETE_SOC = createField(DSL.name("trip_complete_soc"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.platform</code>.
     */
    public final TableField<RideRecord, String> PLATFORM = createField(DSL.name("platform"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_start_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ESTIMATED_START_TIMESTAMP = createField(DSL.name("estimated_start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_completion_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ESTIMATED_COMPLETION_TIMESTAMP = createField(DSL.name("estimated_completion_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_completion_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ACTUAL_COMPLETION_TIMESTAMP = createField(DSL.name("actual_completion_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_ride_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ESTIMATED_RIDE_DISTANCE = createField(DSL.name("estimated_ride_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_ride_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ACTUAL_RIDE_DISTANCE = createField(DSL.name("actual_ride_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_pickup_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ESTIMATED_PICKUP_DISTANCE = createField(DSL.name("estimated_pickup_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_pickup_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ACTUAL_PICKUP_DISTANCE = createField(DSL.name("actual_pickup_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_drop_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ESTIMATED_DROP_DISTANCE = createField(DSL.name("estimated_drop_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_drop_distance</code>.
     */
    public final TableField<RideRecord, BigDecimal> ACTUAL_DROP_DISTANCE = createField(DSL.name("actual_drop_distance"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.pickup_path</code>.
     */
    public final TableField<RideRecord, String> PICKUP_PATH = createField(DSL.name("pickup_path"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.drop_path</code>.
     */
    public final TableField<RideRecord, String> DROP_PATH = createField(DSL.name("drop_path"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_amount</code>.
     */
    public final TableField<RideRecord, BigDecimal> ESTIMATED_AMOUNT = createField(DSL.name("estimated_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_amount</code>.
     */
    public final TableField<RideRecord, BigDecimal> ACTUAL_AMOUNT = createField(DSL.name("actual_amount"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.discount_amount</code>.
     */
    public final TableField<RideRecord, BigDecimal> DISCOUNT_AMOUNT = createField(DSL.name("discount_amount"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.payment_order_id</code>.
     */
    public final TableField<RideRecord, Integer> PAYMENT_ORDER_ID = createField(DSL.name("payment_order_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.payment_mode</code>.
     */
    public final TableField<RideRecord, String> PAYMENT_MODE = createField(DSL.name("payment_mode"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.ride_request_id</code>.
     */
    public final TableField<RideRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.is_active</code>.
     */
    public final TableField<RideRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.created_timestamp</code>.
     */
    public final TableField<RideRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.last_updated_timestamp</code>.
     */
    public final TableField<RideRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.created_by</code>.
     */
    public final TableField<RideRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.last_updated_by</code>.
     */
    public final TableField<RideRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.service_region_id</code>.
     */
    public final TableField<RideRecord, UInteger> SERVICE_REGION_ID = createField(DSL.name("service_region_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.version_id</code>.
     */
    public final TableField<RideRecord, Integer> VERSION_ID = createField(DSL.name("version_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_assignment_soc</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_ASSIGNMENT_SOC = createField(DSL.name("trip_assignment_soc"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_assignment_dte</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_ASSIGNMENT_DTE = createField(DSL.name("trip_assignment_dte"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_start_dte</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_START_DTE = createField(DSL.name("trip_start_dte"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.trip_completion_dte</code>.
     */
    public final TableField<RideRecord, Integer> TRIP_COMPLETION_DTE = createField(DSL.name("trip_completion_dte"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.estimated_pickup_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ESTIMATED_PICKUP_TIMESTAMP = createField(DSL.name("estimated_pickup_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.destination_state</code>.
     */
    public final TableField<RideRecord, String> DESTINATION_STATE = createField(DSL.name("destination_state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.actual_start_timestamp</code>.
     */
    public final TableField<RideRecord, Long> ACTUAL_START_TIMESTAMP = createField(DSL.name("actual_start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.assigned_by</code>.
     */
    public final TableField<RideRecord, UInteger> ASSIGNED_BY = createField(DSL.name("assigned_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.rejected_by</code>.
     */
    public final TableField<RideRecord, String> REJECTED_BY = createField(DSL.name("rejected_by"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.cancellation_eta</code>.
     */
    public final TableField<RideRecord, Long> CANCELLATION_ETA = createField(DSL.name("cancellation_eta"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.promo_code</code>.
     */
    public final TableField<RideRecord, String> PROMO_CODE = createField(DSL.name("promo_code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.ride_category</code>.
     */
    public final TableField<RideRecord, String> RIDE_CATEGORY = createField(DSL.name("ride_category"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.other_flags</code>.
     */
    public final TableField<RideRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.booked_for</code>.
     */
    public final TableField<RideRecord, Integer> BOOKED_FOR = createField(DSL.name("booked_for"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.ride.booked_by</code>.
     */
    public final TableField<RideRecord, Integer> BOOKED_BY = createField(DSL.name("booked_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.ride</code> table reference
     */
    public Ride() {
        this(DSL.name("ride"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.ride</code> table reference
     */
    public Ride(String alias) {
        this(DSL.name(alias), RIDE);
    }

    /**
     * Create an aliased <code>blusmartDevDb.ride</code> table reference
     */
    public Ride(Name alias) {
        this(alias, RIDE);
    }

    private Ride(Name alias, Table<RideRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ride(Name alias, Table<RideRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Ride(Table<O> child, ForeignKey<O, RideRecord> key) {
        super(child, key, RIDE);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RideRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RIDE;
    }

    @Override
    public UniqueKey<RideRecord> getPrimaryKey() {
        return Keys.KEY_RIDE_PRIMARY;
    }

    @Override
    public List<UniqueKey<RideRecord>> getKeys() {
        return Arrays.<UniqueKey<RideRecord>>asList(Keys.KEY_RIDE_PRIMARY);
    }

    @Override
    public Ride as(String alias) {
        return new Ride(DSL.name(alias), this);
    }

    @Override
    public Ride as(Name alias) {
        return new Ride(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ride rename(String name) {
        return new Ride(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ride rename(Name name) {
        return new Ride(name, null);
    }
}
