/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.VehicleHandoverAuditRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class VehicleHandoverAudit extends TableImpl<VehicleHandoverAuditRecord> {

    private static final long serialVersionUID = -297070488;

    /**
     * The reference instance of <code>blusmartDevDb.vehicle_handover_audit</code>
     */
    public static final VehicleHandoverAudit VEHICLE_HANDOVER_AUDIT = new VehicleHandoverAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VehicleHandoverAuditRecord> getRecordType() {
        return VehicleHandoverAuditRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.id</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.audit_id</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> AUDIT_ID = createField(DSL.name("audit_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.from_id</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> FROM_ID = createField(DSL.name("from_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.to_id</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> TO_ID = createField(DSL.name("to_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.vehicle_number</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.handover_type</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, String> HANDOVER_TYPE = createField(DSL.name("handover_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.handover_status</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, String> HANDOVER_STATUS = createField(DSL.name("handover_status"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.soc_reading</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, BigDecimal> SOC_READING = createField(DSL.name("soc_reading"), org.jooq.impl.SQLDataType.DECIMAL(6, 3).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.odometer_reading</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, BigDecimal> ODOMETER_READING = createField(DSL.name("odometer_reading"), org.jooq.impl.SQLDataType.DECIMAL(16, 8).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.is_active</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.created_timestamp</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.last_updated_timestamp</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.created_by</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.last_updated_by</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.vehicle_handover_audit.hub_id</code>.
     */
    public final TableField<VehicleHandoverAuditRecord, UInteger> HUB_ID = createField(DSL.name("hub_id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.vehicle_handover_audit</code> table reference
     */
    public VehicleHandoverAudit() {
        this(DSL.name("vehicle_handover_audit"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.vehicle_handover_audit</code> table reference
     */
    public VehicleHandoverAudit(String alias) {
        this(DSL.name(alias), VEHICLE_HANDOVER_AUDIT);
    }

    /**
     * Create an aliased <code>blusmartDevDb.vehicle_handover_audit</code> table reference
     */
    public VehicleHandoverAudit(Name alias) {
        this(alias, VEHICLE_HANDOVER_AUDIT);
    }

    private VehicleHandoverAudit(Name alias, Table<VehicleHandoverAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private VehicleHandoverAudit(Name alias, Table<VehicleHandoverAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VehicleHandoverAudit(Table<O> child, ForeignKey<O, VehicleHandoverAuditRecord> key) {
        super(child, key, VEHICLE_HANDOVER_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<VehicleHandoverAuditRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_VEHICLE_HANDOVER_AUDIT;
    }

    @Override
    public UniqueKey<VehicleHandoverAuditRecord> getPrimaryKey() {
        return Keys.KEY_VEHICLE_HANDOVER_AUDIT_PRIMARY;
    }

    @Override
    public List<UniqueKey<VehicleHandoverAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<VehicleHandoverAuditRecord>>asList(Keys.KEY_VEHICLE_HANDOVER_AUDIT_PRIMARY);
    }

    @Override
    public VehicleHandoverAudit as(String alias) {
        return new VehicleHandoverAudit(DSL.name(alias), this);
    }

    @Override
    public VehicleHandoverAudit as(Name alias) {
        return new VehicleHandoverAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleHandoverAudit rename(String name) {
        return new VehicleHandoverAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VehicleHandoverAudit rename(Name name) {
        return new VehicleHandoverAudit(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, UInteger, UInteger, UInteger, String, String, String, BigDecimal, BigDecimal, Byte, Long, Long, UInteger, UInteger, UInteger> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
