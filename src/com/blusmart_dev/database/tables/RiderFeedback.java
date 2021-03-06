/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RiderFeedbackRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class RiderFeedback extends TableImpl<RiderFeedbackRecord> {

    private static final long serialVersionUID = -44315823;

    /**
     * The reference instance of <code>blusmartDevDb.rider_feedback</code>
     */
    public static final RiderFeedback RIDER_FEEDBACK = new RiderFeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RiderFeedbackRecord> getRecordType() {
        return RiderFeedbackRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.rider_feedback.id</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.ride_id</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> RIDE_ID = createField(DSL.name("ride_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.ride_request_id</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> RIDE_REQUEST_ID = createField(DSL.name("ride_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.feedback</code>.
     */
    public final TableField<RiderFeedbackRecord, String> FEEDBACK = createField(DSL.name("feedback"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.star_rating</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> STAR_RATING = createField(DSL.name("star_rating"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.is_active</code>.
     */
    public final TableField<RiderFeedbackRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.created_timestamp</code>.
     */
    public final TableField<RiderFeedbackRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.last_updated_timestamp</code>.
     */
    public final TableField<RiderFeedbackRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.created_by</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.last_updated_by</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.feedback_type</code>.
     */
    public final TableField<RiderFeedbackRecord, String> FEEDBACK_TYPE = createField(DSL.name("feedback_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.driver_id</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.rider_id</code>.
     */
    public final TableField<RiderFeedbackRecord, UInteger> RIDER_ID = createField(DSL.name("rider_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.rider_feedback.feedback_json</code>.
     */
    public final TableField<RiderFeedbackRecord, String> FEEDBACK_JSON = createField(DSL.name("feedback_json"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.rider_feedback</code> table reference
     */
    public RiderFeedback() {
        this(DSL.name("rider_feedback"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rider_feedback</code> table reference
     */
    public RiderFeedback(String alias) {
        this(DSL.name(alias), RIDER_FEEDBACK);
    }

    /**
     * Create an aliased <code>blusmartDevDb.rider_feedback</code> table reference
     */
    public RiderFeedback(Name alias) {
        this(alias, RIDER_FEEDBACK);
    }

    private RiderFeedback(Name alias, Table<RiderFeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private RiderFeedback(Name alias, Table<RiderFeedbackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RiderFeedback(Table<O> child, ForeignKey<O, RiderFeedbackRecord> key) {
        super(child, key, RIDER_FEEDBACK);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RiderFeedbackRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RIDER_FEEDBACK;
    }

    @Override
    public UniqueKey<RiderFeedbackRecord> getPrimaryKey() {
        return Keys.KEY_RIDER_FEEDBACK_PRIMARY;
    }

    @Override
    public List<UniqueKey<RiderFeedbackRecord>> getKeys() {
        return Arrays.<UniqueKey<RiderFeedbackRecord>>asList(Keys.KEY_RIDER_FEEDBACK_PRIMARY);
    }

    @Override
    public RiderFeedback as(String alias) {
        return new RiderFeedback(DSL.name(alias), this);
    }

    @Override
    public RiderFeedback as(Name alias) {
        return new RiderFeedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RiderFeedback rename(String name) {
        return new RiderFeedback(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RiderFeedback rename(Name name) {
        return new RiderFeedback(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, UInteger, UInteger, String, UInteger, Byte, Long, Long, UInteger, UInteger, String, UInteger, UInteger, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
