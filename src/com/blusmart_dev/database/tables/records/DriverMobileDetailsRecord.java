/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.DriverMobileDetails;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverMobileDetailsRecord extends UpdatableRecordImpl<DriverMobileDetailsRecord> {

    private static final long serialVersionUID = -1526513564;

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.id</code>.
     */
    public DriverMobileDetailsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.driver_id</code>.
     */
    public DriverMobileDetailsRecord setDriverId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.fcm_token</code>.
     */
    public DriverMobileDetailsRecord setFcmToken(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.fcm_token</code>.
     */
    public String getFcmToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.imei_1</code>.
     */
    public DriverMobileDetailsRecord setImei_1(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.imei_1</code>.
     */
    public String getImei_1() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.imei_2</code>.
     */
    public DriverMobileDetailsRecord setImei_2(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.imei_2</code>.
     */
    public String getImei_2() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.screen_height</code>.
     */
    public DriverMobileDetailsRecord setScreenHeight(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.screen_height</code>.
     */
    public String getScreenHeight() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.screen_width</code>.
     */
    public DriverMobileDetailsRecord setScreenWidth(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.screen_width</code>.
     */
    public String getScreenWidth() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.screen_dpi</code>.
     */
    public DriverMobileDetailsRecord setScreenDpi(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.screen_dpi</code>.
     */
    public String getScreenDpi() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.app_build_number</code>.
     */
    public DriverMobileDetailsRecord setAppBuildNumber(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.app_build_number</code>.
     */
    public String getAppBuildNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.app_version</code>.
     */
    public DriverMobileDetailsRecord setAppVersion(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.app_version</code>.
     */
    public String getAppVersion() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.platform</code>.
     */
    public DriverMobileDetailsRecord setPlatform(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.platform</code>.
     */
    public String getPlatform() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.brand</code>.
     */
    public DriverMobileDetailsRecord setBrand(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.brand</code>.
     */
    public String getBrand() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.model</code>.
     */
    public DriverMobileDetailsRecord setModel(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.model</code>.
     */
    public String getModel() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.carrier</code>.
     */
    public DriverMobileDetailsRecord setCarrier(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.carrier</code>.
     */
    public String getCarrier() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.os_version</code>.
     */
    public DriverMobileDetailsRecord setOsVersion(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.os_version</code>.
     */
    public String getOsVersion() {
        return (String) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.gms</code>.
     */
    public DriverMobileDetailsRecord setGms(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.gms</code>.
     */
    public String getGms() {
        return (String) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.manufacturer</code>.
     */
    public DriverMobileDetailsRecord setManufacturer(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.manufacturer</code>.
     */
    public String getManufacturer() {
        return (String) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.city</code>.
     */
    public DriverMobileDetailsRecord setCity(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.city</code>.
     */
    public String getCity() {
        return (String) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.distinct_id</code>.
     */
    public DriverMobileDetailsRecord setDistinctId(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.distinct_id</code>.
     */
    public String getDistinctId() {
        return (String) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.is_active</code>.
     */
    public DriverMobileDetailsRecord setIsActive(Byte value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.created_timestamp</code>.
     */
    public DriverMobileDetailsRecord setCreatedTimestamp(Long value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.last_updated_timestamp</code>.
     */
    public DriverMobileDetailsRecord setLastUpdatedTimestamp(Long value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.created_by</code>.
     */
    public DriverMobileDetailsRecord setCreatedBy(UInteger value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_mobile_details.last_updated_by</code>.
     */
    public DriverMobileDetailsRecord setLastUpdatedBy(UInteger value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_mobile_details.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DriverMobileDetailsRecord
     */
    public DriverMobileDetailsRecord() {
        super(DriverMobileDetails.DRIVER_MOBILE_DETAILS);
    }

    /**
     * Create a detached, initialised DriverMobileDetailsRecord
     */
    public DriverMobileDetailsRecord(UInteger id, UInteger driverId, String fcmToken, String imei_1, String imei_2, String screenHeight, String screenWidth, String screenDpi, String appBuildNumber, String appVersion, String platform, String brand, String model, String carrier, String osVersion, String gms, String manufacturer, String city, String distinctId, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(DriverMobileDetails.DRIVER_MOBILE_DETAILS);

        set(0, id);
        set(1, driverId);
        set(2, fcmToken);
        set(3, imei_1);
        set(4, imei_2);
        set(5, screenHeight);
        set(6, screenWidth);
        set(7, screenDpi);
        set(8, appBuildNumber);
        set(9, appVersion);
        set(10, platform);
        set(11, brand);
        set(12, model);
        set(13, carrier);
        set(14, osVersion);
        set(15, gms);
        set(16, manufacturer);
        set(17, city);
        set(18, distinctId);
        set(19, isActive);
        set(20, createdTimestamp);
        set(21, lastUpdatedTimestamp);
        set(22, createdBy);
        set(23, lastUpdatedBy);
    }
}
