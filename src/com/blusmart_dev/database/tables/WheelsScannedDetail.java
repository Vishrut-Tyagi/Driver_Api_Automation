/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.WheelsScannedDetailRecord;

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
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WheelsScannedDetail extends TableImpl<WheelsScannedDetailRecord> {

    private static final long serialVersionUID = -7000195;

    /**
     * The reference instance of <code>blusmartDevDb.wheels_scanned_detail</code>
     */
    public static final WheelsScannedDetail WHEELS_SCANNED_DETAIL = new WheelsScannedDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WheelsScannedDetailRecord> getRecordType() {
        return WheelsScannedDetailRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.id</code>.
     */
    public final TableField<WheelsScannedDetailRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.scanning_id</code>.
     */
    public final TableField<WheelsScannedDetailRecord, Integer> SCANNING_ID = createField(DSL.name("scanning_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.vehicle_number</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> VEHICLE_NUMBER = createField(DSL.name("vehicle_number"), org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.tyre_side</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> TYRE_SIDE = createField(DSL.name("tyre_side"), org.jooq.impl.SQLDataType.VARCHAR(2000).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.scanning_status</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> SCANNING_STATUS = createField(DSL.name("scanning_status"), org.jooq.impl.SQLDataType.VARCHAR(200).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.rssi</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> RSSI = createField(DSL.name("rssi"), org.jooq.impl.SQLDataType.VARCHAR(216).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.epc_id</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> EPC_ID = createField(DSL.name("epc_id"), org.jooq.impl.SQLDataType.VARCHAR(216).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.frequency</code>.
     */
    public final TableField<WheelsScannedDetailRecord, String> FREQUENCY = createField(DSL.name("frequency"), org.jooq.impl.SQLDataType.VARCHAR(216).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.is_active</code>.
     */
    public final TableField<WheelsScannedDetailRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.created_timestamp</code>.
     */
    public final TableField<WheelsScannedDetailRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.last_updated_timestamp</code>.
     */
    public final TableField<WheelsScannedDetailRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.created_by</code>.
     */
    public final TableField<WheelsScannedDetailRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.wheels_scanned_detail.last_updated_by</code>.
     */
    public final TableField<WheelsScannedDetailRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>blusmartDevDb.wheels_scanned_detail</code> table reference
     */
    public WheelsScannedDetail() {
        this(DSL.name("wheels_scanned_detail"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.wheels_scanned_detail</code> table reference
     */
    public WheelsScannedDetail(String alias) {
        this(DSL.name(alias), WHEELS_SCANNED_DETAIL);
    }

    /**
     * Create an aliased <code>blusmartDevDb.wheels_scanned_detail</code> table reference
     */
    public WheelsScannedDetail(Name alias) {
        this(alias, WHEELS_SCANNED_DETAIL);
    }

    private WheelsScannedDetail(Name alias, Table<WheelsScannedDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private WheelsScannedDetail(Name alias, Table<WheelsScannedDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> WheelsScannedDetail(Table<O> child, ForeignKey<O, WheelsScannedDetailRecord> key) {
        super(child, key, WHEELS_SCANNED_DETAIL);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<WheelsScannedDetailRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_WHEELS_SCANNED_DETAIL;
    }

    @Override
    public UniqueKey<WheelsScannedDetailRecord> getPrimaryKey() {
        return Keys.KEY_WHEELS_SCANNED_DETAIL_PRIMARY;
    }

    @Override
    public List<UniqueKey<WheelsScannedDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<WheelsScannedDetailRecord>>asList(Keys.KEY_WHEELS_SCANNED_DETAIL_PRIMARY);
    }

    @Override
    public WheelsScannedDetail as(String alias) {
        return new WheelsScannedDetail(DSL.name(alias), this);
    }

    @Override
    public WheelsScannedDetail as(Name alias) {
        return new WheelsScannedDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WheelsScannedDetail rename(String name) {
        return new WheelsScannedDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WheelsScannedDetail rename(Name name) {
        return new WheelsScannedDetail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, Integer, String, String, String, String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
