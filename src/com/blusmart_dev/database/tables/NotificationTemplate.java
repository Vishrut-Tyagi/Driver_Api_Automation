/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables;


import com.blusmart_dev.database.Blusmartdevdb;
import com.blusmart_dev.database.Keys;
import com.blusmart_dev.database.tables.records.NotificationTemplateRecord;

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
public class NotificationTemplate extends TableImpl<NotificationTemplateRecord> {

    private static final long serialVersionUID = 2023619899;

    /**
     * The reference instance of <code>blusmartDevDb.notification_template</code>
     */
    public static final NotificationTemplate NOTIFICATION_TEMPLATE = new NotificationTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationTemplateRecord> getRecordType() {
        return NotificationTemplateRecord.class;
    }

    /**
     * The column <code>blusmartDevDb.notification_template.id</code>.
     */
    public final TableField<NotificationTemplateRecord, UInteger> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.title</code>.
     */
    public final TableField<NotificationTemplateRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(1024).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.body</code>.
     */
    public final TableField<NotificationTemplateRecord, String> BODY = createField(DSL.name("body"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.template_metadata</code>.
     */
    public final TableField<NotificationTemplateRecord, String> TEMPLATE_METADATA = createField(DSL.name("template_metadata"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.is_active</code>.
     */
    public final TableField<NotificationTemplateRecord, Byte> IS_ACTIVE = createField(DSL.name("is_active"), org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.created_timestamp</code>.
     */
    public final TableField<NotificationTemplateRecord, Long> CREATED_TIMESTAMP = createField(DSL.name("created_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.last_updated_timestamp</code>.
     */
    public final TableField<NotificationTemplateRecord, Long> LAST_UPDATED_TIMESTAMP = createField(DSL.name("last_updated_timestamp"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.created_by</code>.
     */
    public final TableField<NotificationTemplateRecord, UInteger> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.last_updated_by</code>.
     */
    public final TableField<NotificationTemplateRecord, UInteger> LAST_UPDATED_BY = createField(DSL.name("last_updated_by"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.information_type</code>.
     */
    public final TableField<NotificationTemplateRecord, String> INFORMATION_TYPE = createField(DSL.name("information_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.action_type</code>.
     */
    public final TableField<NotificationTemplateRecord, String> ACTION_TYPE = createField(DSL.name("action_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.notification_type</code>.
     */
    public final TableField<NotificationTemplateRecord, String> NOTIFICATION_TYPE = createField(DSL.name("notification_type"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>blusmartDevDb.notification_template.template_key</code>.
     */
    public final TableField<NotificationTemplateRecord, String> TEMPLATE_KEY = createField(DSL.name("template_key"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>blusmartDevDb.notification_template</code> table reference
     */
    public NotificationTemplate() {
        this(DSL.name("notification_template"), null);
    }

    /**
     * Create an aliased <code>blusmartDevDb.notification_template</code> table reference
     */
    public NotificationTemplate(String alias) {
        this(DSL.name(alias), NOTIFICATION_TEMPLATE);
    }

    /**
     * Create an aliased <code>blusmartDevDb.notification_template</code> table reference
     */
    public NotificationTemplate(Name alias) {
        this(alias, NOTIFICATION_TEMPLATE);
    }

    private NotificationTemplate(Name alias, Table<NotificationTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationTemplate(Name alias, Table<NotificationTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> NotificationTemplate(Table<O> child, ForeignKey<O, NotificationTemplateRecord> key) {
        super(child, key, NOTIFICATION_TEMPLATE);
    }

    @Override
    public Schema getSchema() {
        return Blusmartdevdb.BLUSMARTDEVDB;
    }

    @Override
    public Identity<NotificationTemplateRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_TEMPLATE;
    }

    @Override
    public UniqueKey<NotificationTemplateRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_TEMPLATE_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationTemplateRecord>>asList(Keys.KEY_NOTIFICATION_TEMPLATE_PRIMARY);
    }

    @Override
    public NotificationTemplate as(String alias) {
        return new NotificationTemplate(DSL.name(alias), this);
    }

    @Override
    public NotificationTemplate as(Name alias) {
        return new NotificationTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationTemplate rename(String name) {
        return new NotificationTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationTemplate rename(Name name) {
        return new NotificationTemplate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, String, String, Byte, Long, Long, UInteger, UInteger, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
