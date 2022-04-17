/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.DateRangeMapperRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class DateRangeMapper extends TableImpl<DateRangeMapperRecord> {

    private static final long serialVersionUID = -1300783561;

    /**
     * The reference instance of <code>blusmartDevDb.date_range_mapper</code>
     */
    public static final DateRangeMapper DATE_RANGE_MAPPER = new DateRangeMapper();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DateRangeMapperRecord> getRecordType() {
        return DateRangeMapperRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.date_range_mapper.id</code>.
     */
    public final TableField<DateRangeMapperRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.code</code>.
     */
    public final TableField<DateRangeMapperRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.from_date</code>.
     */
    public final TableField<DateRangeMapperRecord, Long> FROM_DATE = createField(DSL.name("from_date"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.to_date</code>.
     */
    public final TableField<DateRangeMapperRecord, Long> TO_DATE = createField(DSL.name("to_date"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.is_active</code>.
     */
    public final TableField<DateRangeMapperRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.created_timestamp</code>.
     */
    public final TableField<DateRangeMapperRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.last_updated_timestamp</code>.
     */
    public final TableField<DateRangeMapperRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.created_by</code>.
     */
    public final TableField<DateRangeMapperRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.date_range_mapper.last_updated_by</code>.
     */
    public final TableField<DateRangeMapperRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.date_range_mapper</code> table reference
     */
    public DateRangeMapper() {
        this(DSL.name("date_range_mapper"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.date_range_mapper</code> table reference
     */
    public DateRangeMapper(String alias) {
        this(DSL.name(alias), DATE_RANGE_MAPPER);
    }

    /**
     * Create an aliased <code>blusmartDevDb.date_range_mapper</code> table reference
     */
    public DateRangeMapper(Name alias) {
        this(alias, DATE_RANGE_MAPPER);
    }

    private DateRangeMapper(Name alias, Table<DateRangeMapperRecord> aliased) {
        this(alias, aliased, null);
    }

    private DateRangeMapper(Name alias, Table<DateRangeMapperRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DateRangeMapper(Table<O> child, ForeignKey<O, DateRangeMapperRecord> key) {
        super(child, key, DATE_RANGE_MAPPER);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<DateRangeMapperRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATE_RANGE_MAPPER;
    }

    @Override
    public UniqueKey<DateRangeMapperRecord> getPrimaryKey() {
        return Keys.KEY_DATE_RANGE_MAPPER_PRIMARY;
    }

    @Override
    public List<UniqueKey<DateRangeMapperRecord>> getKeys() {
        return Arrays.<UniqueKey<DateRangeMapperRecord>>asList(Keys.KEY_DATE_RANGE_MAPPER_PRIMARY, Keys.KEY_DATE_RANGE_MAPPER_CODE_UNIQUE);
    }

    @Override
    public DateRangeMapper as(String alias) {
        return new DateRangeMapper(DSL.name(alias), this);
    }

    @Override
    public DateRangeMapper as(Name alias) {
        return new DateRangeMapper(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DateRangeMapper rename(String name) {
        return new DateRangeMapper(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DateRangeMapper rename(Name name) {
        return new DateRangeMapper(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, Long, Long, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
