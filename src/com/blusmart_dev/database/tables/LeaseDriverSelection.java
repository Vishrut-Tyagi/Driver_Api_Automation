/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.LeaseDriverSelectionRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class LeaseDriverSelection extends TableImpl<LeaseDriverSelectionRecord> {

    private static final long serialVersionUID = -1157854703;

    /**
     * The reference instance of <code>blusmartDevDb.lease_driver_selection</code>
     */
    public static final LeaseDriverSelection LEASE_DRIVER_SELECTION = new LeaseDriverSelection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LeaseDriverSelectionRecord> getRecordType() {
        return LeaseDriverSelectionRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.id</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.driver_id</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, UInteger> DRIVER_ID = createField(DSL.name("driver_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.state</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.is_active</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.created_by</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.created_at</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.last_updated_by</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.last_updated_at</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, Long> LAST_UPDATED_AT = createField(DSL.name("last_updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.hub_id</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, UInteger> HUB_ID = createField(DSL.name("hub_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.lease_driver_selection.lmp_combination_id</code>.
     */
    public final TableField<LeaseDriverSelectionRecord, String> LMP_COMBINATION_ID = createField(DSL.name("lmp_combination_id"), org.jooq.impl.SQLDataType.CHAR(36).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.lease_driver_selection</code> table reference
     */
    public LeaseDriverSelection() {
        this(DSL.name("lease_driver_selection"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_driver_selection</code> table reference
     */
    public LeaseDriverSelection(String alias) {
        this(DSL.name(alias), LEASE_DRIVER_SELECTION);
    }

    /**
     * Create an aliased <code>blusmartDevDb.lease_driver_selection</code> table reference
     */
    public LeaseDriverSelection(Name alias) {
        this(alias, LEASE_DRIVER_SELECTION);
    }

    private LeaseDriverSelection(Name alias, Table<LeaseDriverSelectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private LeaseDriverSelection(Name alias, Table<LeaseDriverSelectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> LeaseDriverSelection(Table<O> child, ForeignKey<O, LeaseDriverSelectionRecord> key) {
        super(child, key, LEASE_DRIVER_SELECTION);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<LeaseDriverSelectionRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_LEASE_DRIVER_SELECTION;
    }

    @Override
    public UniqueKey<LeaseDriverSelectionRecord> getPrimaryKey() {
        return Keys.KEY_LEASE_DRIVER_SELECTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<LeaseDriverSelectionRecord>> getKeys() {
        return Arrays.<UniqueKey<LeaseDriverSelectionRecord>>asList(Keys.KEY_LEASE_DRIVER_SELECTION_PRIMARY);
    }

    @Override
    public LeaseDriverSelection as(String alias) {
        return new LeaseDriverSelection(DSL.name(alias), this);
    }

    @Override
    public LeaseDriverSelection as(Name alias) {
        return new LeaseDriverSelection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseDriverSelection rename(String name) {
        return new LeaseDriverSelection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LeaseDriverSelection rename(Name name) {
        return new LeaseDriverSelection(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<UInteger, UInteger, String, Byte, UInteger, Long, UInteger, Long, UInteger, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
