/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.PromoCodesRecord;

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
public class PromoCodes extends TableImpl<PromoCodesRecord> {

    private static final long serialVersionUID = 222105101;

    /**
     * The reference instance of <code>blusmartDevDb.promo_codes</code>
     */
    public static final PromoCodes PROMO_CODES = new PromoCodes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PromoCodesRecord> getRecordType() {
        return PromoCodesRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.promo_codes.id</code>.
     */
    public final TableField<PromoCodesRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.promo_code</code>.
     */
    public final TableField<PromoCodesRecord, String> PROMO_CODE = createField(DSL.name("promo_code"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.valid_from_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> VALID_FROM_TIMESTAMP = createField(DSL.name("valid_from_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.valid_to_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> VALID_TO_TIMESTAMP = createField(DSL.name("valid_to_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.applicable_from_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> APPLICABLE_FROM_TIMESTAMP = createField(DSL.name("applicable_from_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.applicable_to_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> APPLICABLE_TO_TIMESTAMP = createField(DSL.name("applicable_to_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.state</code>.
     */
    public final TableField<PromoCodesRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.type</code>.
     */
    public final TableField<PromoCodesRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.action</code>.
     */
    public final TableField<PromoCodesRecord, String> ACTION = createField(DSL.name("action"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.trigger</code>.
     */
    public final TableField<PromoCodesRecord, String> TRIGGER = createField(DSL.name("trigger"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.ride_type</code>.
     */
    public final TableField<PromoCodesRecord, String> RIDE_TYPE = createField(DSL.name("ride_type"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.ride_category</code>.
     */
    public final TableField<PromoCodesRecord, String> RIDE_CATEGORY = createField(DSL.name("ride_category"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.amount_type</code>.
     */
    public final TableField<PromoCodesRecord, String> AMOUNT_TYPE = createField(DSL.name("amount_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.amount_value</code>.
     */
    public final TableField<PromoCodesRecord, BigDecimal> AMOUNT_VALUE = createField(DSL.name("amount_value"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.percentage_cap_amount</code>.
     */
    public final TableField<PromoCodesRecord, BigDecimal> PERCENTAGE_CAP_AMOUNT = createField(DSL.name("percentage_cap_amount"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.minimum_recharge_amount</code>.
     */
    public final TableField<PromoCodesRecord, BigDecimal> MINIMUM_RECHARGE_AMOUNT = createField(DSL.name("minimum_recharge_amount"), org.jooq.impl.SQLDataType.DECIMAL(30, 16).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.pre_condition</code>.
     */
    public final TableField<PromoCodesRecord, String> PRE_CONDITION = createField(DSL.name("pre_condition"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.capping</code>.
     */
    public final TableField<PromoCodesRecord, String> CAPPING = createField(DSL.name("capping"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.pick_up_service_region</code>.
     */
    public final TableField<PromoCodesRecord, String> PICK_UP_SERVICE_REGION = createField(DSL.name("pick_up_service_region"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.drop_off_service_region</code>.
     */
    public final TableField<PromoCodesRecord, String> DROP_OFF_SERVICE_REGION = createField(DSL.name("drop_off_service_region"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.user_segment_type</code>.
     */
    public final TableField<PromoCodesRecord, String> USER_SEGMENT_TYPE = createField(DSL.name("user_segment_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.is_released</code>.
     */
    public final TableField<PromoCodesRecord, Byte> IS_RELEASED = createField(DSL.name("is_released"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.is_exclusive</code>.
     */
    public final TableField<PromoCodesRecord, Byte> IS_EXCLUSIVE = createField(DSL.name("is_exclusive"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.is_active</code>.
     */
    public final TableField<PromoCodesRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.created_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.last_updated_timestamp</code>.
     */
    public final TableField<PromoCodesRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.created_by</code>.
     */
    public final TableField<PromoCodesRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.last_updated_by</code>.
     */
    public final TableField<PromoCodesRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.is_visible</code>.
     */
    public final TableField<PromoCodesRecord, Byte> IS_VISIBLE = createField(DSL.name("is_visible"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.is_recurring_pack_promo</code>.
     */
    public final TableField<PromoCodesRecord, Byte> IS_RECURRING_PACK_PROMO = createField(DSL.name("is_recurring_pack_promo"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.allowed_source</code>.
     */
    public final TableField<PromoCodesRecord, String> ALLOWED_SOURCE = createField(DSL.name("allowed_source"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.promo_codes.allowed_categories</code>.
     */
    public final TableField<PromoCodesRecord, String> ALLOWED_CATEGORIES = createField(DSL.name("allowed_categories"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * Create a <code>blusmartDevDb.promo_codes</code> table reference
     */
    public PromoCodes() {
        this(DSL.name("promo_codes"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.promo_codes</code> table reference
     */
    public PromoCodes(String alias) {
        this(DSL.name(alias), PROMO_CODES);
    }

    /**
     * Create an aliased <code>blusmartDevDb.promo_codes</code> table reference
     */
    public PromoCodes(Name alias) {
        this(alias, PROMO_CODES);
    }

    private PromoCodes(Name alias, Table<PromoCodesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PromoCodes(Name alias, Table<PromoCodesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> PromoCodes(Table<O> child, ForeignKey<O, PromoCodesRecord> key) {
        super(child, key, PROMO_CODES);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<PromoCodesRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_PROMO_CODES;
    }

    @Override
    public UniqueKey<PromoCodesRecord> getPrimaryKey() {
        return Keys.KEY_PROMO_CODES_PRIMARY;
    }

    @Override
    public List<UniqueKey<PromoCodesRecord>> getKeys() {
        return Arrays.<UniqueKey<PromoCodesRecord>>asList(Keys.KEY_PROMO_CODES_PRIMARY, Keys.KEY_PROMO_CODES_PROMO_CODE);
    }

    @Override
    public PromoCodes as(String alias) {
        return new PromoCodes(DSL.name(alias), this);
    }

    @Override
    public PromoCodes as(Name alias) {
        return new PromoCodes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PromoCodes rename(String name) {
        return new PromoCodes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PromoCodes rename(Name name) {
        return new PromoCodes(name, null);
    }
}
