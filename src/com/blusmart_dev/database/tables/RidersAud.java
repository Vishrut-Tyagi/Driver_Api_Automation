/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Indexes;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.RidersAudRecord;

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
public class RidersAud extends TableImpl<RidersAudRecord> {

    private static final long serialVersionUID = 899041448;

    /**
     * The reference instance of <code>blusmartDevDb.riders_aud</code>
     */
    public static final RidersAud RIDERS_AUD = new RidersAud();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RidersAudRecord> getRecordType() {
        return RidersAudRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.riders_aud.aud_id</code>.
     */
    public final TableField<RidersAudRecord, Integer> AUD_ID = createField(DSL.name("aud_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.id</code>.
     */
    public final TableField<RidersAudRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.first_name</code>.
     */
    public final TableField<RidersAudRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.last_name</code>.
     */
    public final TableField<RidersAudRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.email</code>.
     */
    public final TableField<RidersAudRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.phone</code>.
     */
    public final TableField<RidersAudRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.profile_pic_url</code>.
     */
    public final TableField<RidersAudRecord, String> PROFILE_PIC_URL = createField(DSL.name("profile_pic_url"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.is_active</code>.
     */
    public final TableField<RidersAudRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.created_timestamp</code>.
     */
    public final TableField<RidersAudRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.last_updated_timestamp</code>.
     */
    public final TableField<RidersAudRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.created_by</code>.
     */
    public final TableField<RidersAudRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.last_updated_by</code>.
     */
    public final TableField<RidersAudRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.is_verified</code>.
     */
    public final TableField<RidersAudRecord, Byte> IS_VERIFIED = createField(DSL.name("is_verified"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.is_blocked</code>.
     */
    public final TableField<RidersAudRecord, Byte> IS_BLOCKED = createField(DSL.name("is_blocked"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.ssoId</code>.
     */
    public final TableField<RidersAudRecord, Integer> SSOID = createField(DSL.name("ssoId"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.ridecell_rider_id</code>.
     */
    public final TableField<RidersAudRecord, Integer> RIDECELL_RIDER_ID = createField(DSL.name("ridecell_rider_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.last_active_timestamp</code>.
     */
    public final TableField<RidersAudRecord, Long> LAST_ACTIVE_TIMESTAMP = createField(DSL.name("last_active_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.signup_source</code>.
     */
    public final TableField<RidersAudRecord, String> SIGNUP_SOURCE = createField(DSL.name("signup_source"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.login_source</code>.
     */
    public final TableField<RidersAudRecord, String> LOGIN_SOURCE = createField(DSL.name("login_source"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.user_setting</code>.
     */
    public final TableField<RidersAudRecord, String> USER_SETTING = createField(DSL.name("user_setting"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.other_flags</code>.
     */
    public final TableField<RidersAudRecord, String> OTHER_FLAGS = createField(DSL.name("other_flags"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.gender</code>.
     */
    public final TableField<RidersAudRecord, String> GENDER = createField(DSL.name("gender"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.dob</code>.
     */
    public final TableField<RidersAudRecord, Long> DOB = createField(DSL.name("dob"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.is_profile_completed</code>.
     */
    public final TableField<RidersAudRecord, Byte> IS_PROFILE_COMPLETED = createField(DSL.name("is_profile_completed"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.early_arrival_count</code>.
     */
    public final TableField<RidersAudRecord, UInteger> EARLY_ARRIVAL_COUNT = createField(DSL.name("early_arrival_count"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.operation</code>.
     */
    public final TableField<RidersAudRecord, String> OPERATION = createField(DSL.name("operation"), org.jooq.impl.SQLDataType.VARCHAR(25).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.riders_aud.state</code>.
     */
    public final TableField<RidersAudRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("'ACTIVE'", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.riders_aud</code> table reference
     */
    public RidersAud() {
        this(DSL.name("riders_aud"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.riders_aud</code> table reference
     */
    public RidersAud(String alias) {
        this(DSL.name(alias), RIDERS_AUD);
    }

    /**
     * Create an aliased <code>blusmartDevDb.riders_aud</code> table reference
     */
    public RidersAud(Name alias) {
        this(alias, RIDERS_AUD);
    }

    private RidersAud(Name alias, Table<RidersAudRecord> aliased) {
        this(alias, aliased, null);
    }

    private RidersAud(Name alias, Table<RidersAudRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RidersAud(Table<O> child, ForeignKey<O, RidersAudRecord> key) {
        super(child, key, RIDERS_AUD);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RIDERS_AUD_RIDERS_CREATED_TIMESTAMP, Indexes.RIDERS_AUD_RIDERS_EMAIL, Indexes.RIDERS_AUD_RIDERS_PHONE, Indexes.RIDERS_AUD_RIDERS_SSOID);
    }

    @Override
    public Identity<RidersAudRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RIDERS_AUD;
    }

    @Override
    public UniqueKey<RidersAudRecord> getPrimaryKey() {
        return Keys.KEY_RIDERS_AUD_PRIMARY;
    }

    @Override
    public List<UniqueKey<RidersAudRecord>> getKeys() {
        return Arrays.<UniqueKey<RidersAudRecord>>asList(Keys.KEY_RIDERS_AUD_PRIMARY);
    }

    @Override
    public RidersAud as(String alias) {
        return new RidersAud(DSL.name(alias), this);
    }

    @Override
    public RidersAud as(Name alias) {
        return new RidersAud(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RidersAud rename(String name) {
        return new RidersAud(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RidersAud rename(Name name) {
        return new RidersAud(name, null);
    }
}