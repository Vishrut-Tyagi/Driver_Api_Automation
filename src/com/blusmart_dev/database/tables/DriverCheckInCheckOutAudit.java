/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.DriverCheckInCheckOutAuditRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverCheckInCheckOutAudit extends TableImpl<DriverCheckInCheckOutAuditRecord> {

    private static final long serialVersionUID = -1125455477;

    /**
     * The reference instance of <code>blusmartDevDb.driver_check_in_check_out_audit</code>
     */
    public static final DriverCheckInCheckOutAudit DRIVER_CHECK_IN_CHECK_OUT_AUDIT = new DriverCheckInCheckOutAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverCheckInCheckOutAuditRecord> getRecordType() {
        return DriverCheckInCheckOutAuditRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.duty_id</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> DUTY_ID = createField(DSL.name("duty_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.punch_id</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> PUNCH_ID = createField(DSL.name("punch_id"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.checkin_hub</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> CHECKIN_HUB = createField(DSL.name("checkin_hub"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.checkout_hub</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> CHECKOUT_HUB = createField(DSL.name("checkout_hub"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.is_active</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.checkin_timestamp</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Long> CHECKIN_TIMESTAMP = createField(DSL.name("checkin_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.checkout_timestamp</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Long> CHECKOUT_TIMESTAMP = createField(DSL.name("checkout_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.forced_checkout</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Byte> FORCED_CHECKOUT = createField(DSL.name("forced_checkout"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.remarks</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, String> REMARKS = createField(DSL.name("remarks"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.created_at</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Long> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.updated_at</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Long> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.created_by</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>blusmartDevDb.driver_check_in_check_out_audit.updated_by</code>.
     */
    public final TableField<DriverCheckInCheckOutAuditRecord, Integer> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>blusmartDevDb.driver_check_in_check_out_audit</code> table reference
     */
    public DriverCheckInCheckOutAudit() {
        this(DSL.name("driver_check_in_check_out_audit"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_check_in_check_out_audit</code> table reference
     */
    public DriverCheckInCheckOutAudit(String alias) {
        this(DSL.name(alias), DRIVER_CHECK_IN_CHECK_OUT_AUDIT);
    }

    /**
     * Create an aliased <code>blusmartDevDb.driver_check_in_check_out_audit</code> table reference
     */
    public DriverCheckInCheckOutAudit(Name alias) {
        this(alias, DRIVER_CHECK_IN_CHECK_OUT_AUDIT);
    }

    private DriverCheckInCheckOutAudit(Name alias, Table<DriverCheckInCheckOutAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private DriverCheckInCheckOutAudit(Name alias, Table<DriverCheckInCheckOutAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DriverCheckInCheckOutAudit(Table<O> child, ForeignKey<O, DriverCheckInCheckOutAuditRecord> key) {
        super(child, key, DRIVER_CHECK_IN_CHECK_OUT_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<DriverCheckInCheckOutAuditRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DRIVER_CHECK_IN_CHECK_OUT_AUDIT;
    }

    @Override
    public UniqueKey<DriverCheckInCheckOutAuditRecord> getPrimaryKey() {
        return Keys.KEY_DRIVER_CHECK_IN_CHECK_OUT_AUDIT_PRIMARY;
    }

    @Override
    public List<UniqueKey<DriverCheckInCheckOutAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverCheckInCheckOutAuditRecord>>asList(Keys.KEY_DRIVER_CHECK_IN_CHECK_OUT_AUDIT_PRIMARY);
    }

    @Override
    public DriverCheckInCheckOutAudit as(String alias) {
        return new DriverCheckInCheckOutAudit(DSL.name(alias), this);
    }

    @Override
    public DriverCheckInCheckOutAudit as(Name alias) {
        return new DriverCheckInCheckOutAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverCheckInCheckOutAudit rename(String name) {
        return new DriverCheckInCheckOutAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverCheckInCheckOutAudit rename(Name name) {
        return new DriverCheckInCheckOutAudit(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, Integer, Integer, Byte, Long, Long, Byte, String, Long, Long, Integer, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
