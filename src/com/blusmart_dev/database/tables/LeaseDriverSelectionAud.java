/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.LeaseDriverSelectionAudRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class LeaseDriverSelectionAud extends TableImpl<LeaseDriverSelectionAudRecord> {

    private static final long serialVersionUID = -2096651521;

    /**
     * The reference instance of <code>blusmartDevDb.lease_driver_selection_aud</code>
     */
    public static final LeaseDriverSelectionAud LEASE_DRIVER_SELECTION_AUD = new LeaseDriverSelectionAud();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LeaseDriverSelectionAudRecord> getRecordType() {
        return LeaseDriverSelectionAudRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.aud_id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> AUD_ID = createField(DSL.name("aud_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.driver_id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.lease_id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> LEASE_ID = createField(DSL.name("lease_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.state</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.is_active</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.created_by</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.created_at</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.last_updated_by</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.last_updated_at</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.hub_id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, UInteger> HUB_ID = createField(DSL.name("hub_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection_aud.lmp_combination_id</code>.
     */
    public final TableField<LeaseDriverSelectionAudRecord, String> LMP_COMBINATION_ID = createField(DSL.name("lmp_combination_id"), org.jooq.impl.SQLDataType.CHAR(36).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.lease_driver_selection_aud</code> table reference
     */
    public LeaseDriverSelectionAud() {
        this(DSL.name("lease_driver_selection_aud"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_driver_selection_aud</code> table reference
     */
    public LeaseDriverSelectionAud(String alias) {
        this(DSL.name(alias), LEASE_DRIVER_SELECTION_AUD);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_driver_selection_aud</code> table reference
     */
    public LeaseDriverSelectionAud(Name alias) {
        this(alias, LEASE_DRIVER_SELECTION_AUD);
    }

    private LeaseDriverSelectionAud(Name alias, Table<LeaseDriverSelectionAudRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaseDriverSelectionAud(Name alias, Table<LeaseDriverSelectionAudRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> LeaseDriverSelectionAud(Table<O> child, ForeignKey<O, LeaseDriverSelectionAudRecord> key) {
        super(child, key, LEASE_DRIVER_SELECTION_AUD);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<LeaseDriverSelectionAudRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_LEASE_DRIVER_SELECTION_AUD;
    }

    @Override
    public UniqueKey<LeaseDriverSelectionAudRecord> getPrimaryKey() {
        return Keys.KEY_LEASE_DRIVER_SELECTION_AUD_PRIMARY;
    }

    @Override
    public List<UniqueKey<LeaseDriverSelectionAudRecord>> getKeys() {
        return Arrays.<UniqueKey<LeaseDriverSelectionAudRecord>>asList(Keys.KEY_LEASE_DRIVER_SELECTION_AUD_PRIMARY);
    }

    @Override
    public LeaseDriverSelectionAud as(String alias) {
        return new LeaseDriverSelectionAud(DSL.name(alias), this);
    }

    @Override
    public LeaseDriverSelectionAud as(Name alias) {
        return new LeaseDriverSelectionAud(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseDriverSelectionAud rename(String name) {
        return new LeaseDriverSelectionAud(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseDriverSelectionAud rename(Name name) {
        return new LeaseDriverSelectionAud(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<UInteger, UInteger, UInteger, UInteger, String, Byte, UInteger, Long, UInteger, Long, UInteger, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
