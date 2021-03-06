/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RecurringRidesWeekWiseRecord;

import java.math.BigDecimal;
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
public class RecurringRidesWeekWise extends TableImpl<RecurringRidesWeekWiseRecord> {

    private static final long serialVersionUID = -2037580126;

    /**
     * The reference instance of <code>blusmartDevDb.recurring_rides_week_wise</code>
     */
    public static final RecurringRidesWeekWise RECURRING_RIDES_WEEK_WISE = new RecurringRidesWeekWise();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecurringRidesWeekWiseRecord> getRecordType() {
        return RecurringRidesWeekWiseRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.id</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.recurring_request_id</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, UInteger> RECURRING_REQUEST_ID = createField(DSL.name("recurring_request_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.start_timestamp</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, Long> START_TIMESTAMP = createField(DSL.name("start_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.end_timestamp</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, Long> END_TIMESTAMP = createField(DSL.name("end_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.wallet_balance</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, BigDecimal> WALLET_BALANCE = createField(DSL.name("wallet_balance"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.state</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.weekly_config</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, String> WEEKLY_CONFIG = createField(DSL.name("weekly_config"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.needed_balance</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, BigDecimal> NEEDED_BALANCE = createField(DSL.name("needed_balance"), org.jooq.impl.SQLDataType.DECIMAL(11, 2).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.is_active</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.created_by</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.created_at</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.last_updated_by</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.last_updated_at</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.recurring_rides_week_wise.note</code>.
     */
    public final TableField<RecurringRidesWeekWiseRecord, String> NOTE = createField(DSL.name("note"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.recurring_rides_week_wise</code> table reference
     */
    public RecurringRidesWeekWise() {
        this(DSL.name("recurring_rides_week_wise"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.recurring_rides_week_wise</code> table reference
     */
    public RecurringRidesWeekWise(String alias) {
        this(DSL.name(alias), RECURRING_RIDES_WEEK_WISE);
    }

    /**
     * Create an aliased <code>blusmartDevDb.recurring_rides_week_wise</code> table reference
     */
    public RecurringRidesWeekWise(Name alias) {
        this(alias, RECURRING_RIDES_WEEK_WISE);
    }

    private RecurringRidesWeekWise(Name alias, Table<RecurringRidesWeekWiseRecord> aliased) {
        this(alias, aliased, null);
    }

    private RecurringRidesWeekWise(Name alias, Table<RecurringRidesWeekWiseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RecurringRidesWeekWise(Table<O> child, ForeignKey<O, RecurringRidesWeekWiseRecord> key) {
        super(child, key, RECURRING_RIDES_WEEK_WISE);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<RecurringRidesWeekWiseRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RECURRING_RIDES_WEEK_WISE;
    }

    @Override
    public UniqueKey<RecurringRidesWeekWiseRecord> getPrimaryKey() {
        return Keys.KEY_RECURRING_RIDES_WEEK_WISE_PRIMARY;
    }

    @Override
    public List<UniqueKey<RecurringRidesWeekWiseRecord>> getKeys() {
        return Arrays.<UniqueKey<RecurringRidesWeekWiseRecord>>asList(Keys.KEY_RECURRING_RIDES_WEEK_WISE_PRIMARY);
    }

    @Override
    public RecurringRidesWeekWise as(String alias) {
        return new RecurringRidesWeekWise(DSL.name(alias), this);
    }

    @Override
    public RecurringRidesWeekWise as(Name alias) {
        return new RecurringRidesWeekWise(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RecurringRidesWeekWise rename(String name) {
        return new RecurringRidesWeekWise(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RecurringRidesWeekWise rename(Name name) {
        return new RecurringRidesWeekWise(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, UInteger, Long, Long, BigDecimal, String, String, BigDecimal, Byte, UInteger, Long, UInteger, Long, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
