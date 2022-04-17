/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Notifications;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationsRecord extends UpdatableRecordImpl<NotificationsRecord> implements Record12<UInteger, UInteger, UInteger, UInteger, String, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = 1548582140;

    /**
     * Setter for <code>blusmartDevDb.notifications.id</code>.
     */
    public NotificationsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.rider_id</code>.
     */
    public NotificationsRecord setRiderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.driver_id</code>.
     */
    public NotificationsRecord setDriverId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.notification_template_id</code>.
     */
    public NotificationsRecord setNotificationTemplateId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.notification_template_id</code>.
     */
    public UInteger getNotificationTemplateId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.request_metadata</code>.
     */
    public NotificationsRecord setRequestMetadata(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.request_metadata</code>.
     */
    public String getRequestMetadata() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.state</code>.
     */
    public NotificationsRecord setState(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.state</code>.
     */
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.is_active</code>.
     */
    public NotificationsRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.created_timestamp</code>.
     */
    public NotificationsRecord setCreatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.last_updated_timestamp</code>.
     */
    public NotificationsRecord setLastUpdatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.created_by</code>.
     */
    public NotificationsRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.last_updated_by</code>.
     */
    public NotificationsRecord setLastUpdatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.notifications.response_metadata</code>.
     */
    public NotificationsRecord setResponseMetadata(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.notifications.response_metadata</code>.
     */
    public String getResponseMetadata() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UInteger, UInteger, UInteger, UInteger, String, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UInteger, UInteger, UInteger, UInteger, String, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Notifications.NOTIFICATIONS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return Notifications.NOTIFICATIONS.RIDER_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return Notifications.NOTIFICATIONS.DRIVER_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return Notifications.NOTIFICATIONS.NOTIFICATION_TEMPLATE_ID;
    }

    @Override
    public Field<String> field5() {
        return Notifications.NOTIFICATIONS.REQUEST_METADATA;
    }

    @Override
    public Field<String> field6() {
        return Notifications.NOTIFICATIONS.STATE;
    }

    @Override
    public Field<Byte> field7() {
        return Notifications.NOTIFICATIONS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field8() {
        return Notifications.NOTIFICATIONS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field9() {
        return Notifications.NOTIFICATIONS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field10() {
        return Notifications.NOTIFICATIONS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field11() {
        return Notifications.NOTIFICATIONS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field12() {
        return Notifications.NOTIFICATIONS.RESPONSE_METADATA;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getRiderId();
    }

    @Override
    public UInteger component3() {
        return getDriverId();
    }

    @Override
    public UInteger component4() {
        return getNotificationTemplateId();
    }

    @Override
    public String component5() {
        return getRequestMetadata();
    }

    @Override
    public String component6() {
        return getState();
    }

    @Override
    public Byte component7() {
        return getIsActive();
    }

    @Override
    public Long component8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component10() {
        return getCreatedBy();
    }

    @Override
    public UInteger component11() {
        return getLastUpdatedBy();
    }

    @Override
    public String component12() {
        return getResponseMetadata();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getRiderId();
    }

    @Override
    public UInteger value3() {
        return getDriverId();
    }

    @Override
    public UInteger value4() {
        return getNotificationTemplateId();
    }

    @Override
    public String value5() {
        return getRequestMetadata();
    }

    @Override
    public String value6() {
        return getState();
    }

    @Override
    public Byte value7() {
        return getIsActive();
    }

    @Override
    public Long value8() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value9() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value10() {
        return getCreatedBy();
    }

    @Override
    public UInteger value11() {
        return getLastUpdatedBy();
    }

    @Override
    public String value12() {
        return getResponseMetadata();
    }

    @Override
    public NotificationsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public NotificationsRecord value2(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public NotificationsRecord value3(UInteger value) {
        setDriverId(value);
        return this;
    }

    @Override
    public NotificationsRecord value4(UInteger value) {
        setNotificationTemplateId(value);
        return this;
    }

    @Override
    public NotificationsRecord value5(String value) {
        setRequestMetadata(value);
        return this;
    }

    @Override
    public NotificationsRecord value6(String value) {
        setState(value);
        return this;
    }

    @Override
    public NotificationsRecord value7(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public NotificationsRecord value8(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public NotificationsRecord value9(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public NotificationsRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public NotificationsRecord value11(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public NotificationsRecord value12(String value) {
        setResponseMetadata(value);
        return this;
    }

    @Override
    public NotificationsRecord values(UInteger value1, UInteger value2, UInteger value3, UInteger value4, String value5, String value6, Byte value7, Long value8, Long value9, UInteger value10, UInteger value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotificationsRecord
     */
    public NotificationsRecord() {
        super(Notifications.NOTIFICATIONS);
    }

    /**
     * Create a detached, initialised NotificationsRecord
     */
    public NotificationsRecord(UInteger id, UInteger riderId, UInteger driverId, UInteger notificationTemplateId, String requestMetadata, String state, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String responseMetadata) {
        super(Notifications.NOTIFICATIONS);

        set(0, id);
        set(1, riderId);
        set(2, driverId);
        set(3, notificationTemplateId);
        set(4, requestMetadata);
        set(5, state);
        set(6, isActive);
        set(7, createdTimestamp);
        set(8, lastUpdatedTimestamp);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, responseMetadata);
    }
}