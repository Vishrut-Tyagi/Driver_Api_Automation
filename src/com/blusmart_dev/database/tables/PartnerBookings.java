/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.PartnerBookingsRecord;

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
public class PartnerBookings extends TableImpl<PartnerBookingsRecord> {

    private static final long serialVersionUID = 1620385993;

    /**
     * The reference instance of <code>blusmartDevDb.partner_bookings</code>
     */
    public static final PartnerBookings PARTNER_BOOKINGS = new PartnerBookings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartnerBookingsRecord> getRecordType() {
        return PartnerBookingsRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.partner_bookings.id</code>.
     */
    public final TableField<PartnerBookingsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.search_id</code>.
     */
    public final TableField<PartnerBookingsRecord, String> SEARCH_ID = createField(DSL.name("search_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.ride_request_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.ride_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.created_at</code>.
     */
    public final TableField<PartnerBookingsRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.updated_at</code>.
     */
    public final TableField<PartnerBookingsRecord, Long> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.booking_reference_number</code>.
     */
    public final TableField<PartnerBookingsRecord, String> BOOKING_REFERENCE_NUMBER = createField(DSL.name("booking_reference_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.booking_status</code>.
     */
    public final TableField<PartnerBookingsRecord, String> BOOKING_STATUS = createField(DSL.name("booking_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.partner_name</code>.
     */
    public final TableField<PartnerBookingsRecord, String> PARTNER_NAME = createField(DSL.name("partner_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.is_active</code>.
     */
    public final TableField<PartnerBookingsRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.note</code>.
     */
    public final TableField<PartnerBookingsRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.payment_order_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> PAYMENT_ORDER_ID = createField(DSL.name("payment_order_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.pricing_details_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> PRICING_DETAILS_ID = createField(DSL.name("pricing_details_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.rider_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.driver_id</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.verfication_code</code>.
     */
    public final TableField<PartnerBookingsRecord, UInteger> VERFICATION_CODE = createField(DSL.name("verfication_code"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.party_reference_number</code>.
     */
    public final TableField<PartnerBookingsRecord, String> PARTY_REFERENCE_NUMBER = createField(DSL.name("party_reference_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.cancelled_by</code>.
     */
    public final TableField<PartnerBookingsRecord, String> CANCELLED_BY = createField(DSL.name("cancelled_by"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.partner_bookings.request_type</code>.
     */
    public final TableField<PartnerBookingsRecord, String> REQUEST_TYPE = createField(DSL.name("request_type"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.partner_bookings</code> table reference
     */
    public PartnerBookings() {
        this(DSL.name("partner_bookings"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.partner_bookings</code> table reference
     */
    public PartnerBookings(String alias) {
        this(DSL.name(alias), PARTNER_BOOKINGS);
    }

    /**
     * Create an aliased <code>blusmartDevDb.partner_bookings</code> table reference
     */
    public PartnerBookings(Name alias) {
        this(alias, PARTNER_BOOKINGS);
    }

    private PartnerBookings(Name alias, Table<PartnerBookingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PartnerBookings(Name alias, Table<PartnerBookingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> PartnerBookings(Table<O> child, ForeignKey<O, PartnerBookingsRecord> key) {
        super(child, key, PARTNER_BOOKINGS);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<PartnerBookingsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PARTNER_BOOKINGS;
    }

    @Override
    public UniqueKey<PartnerBookingsRecord> getPrimaryKey() {
        return Keys.KEY_PARTNER_BOOKINGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<PartnerBookingsRecord>> getKeys() {
        return Arrays.<UniqueKey<PartnerBookingsRecord>>asList(Keys.KEY_PARTNER_BOOKINGS_PRIMARY);
    }

    @Override
    public PartnerBookings as(String alias) {
        return new PartnerBookings(DSL.name(alias), this);
    }

    @Override
    public PartnerBookings as(Name alias) {
        return new PartnerBookings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PartnerBookings rename(String name) {
        return new PartnerBookings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PartnerBookings rename(Name name) {
        return new PartnerBookings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, String, UInteger, UInteger, Long, Long, String, String, String, Byte, String, UInteger, UInteger, UInteger, UInteger, UInteger, String, String, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
