/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Riders;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RidersRecord extends UpdatableRecordImpl<RidersRecord> {

    private static final long serialVersionUID = 1281573806;

    /**
     * Setter for <code>blusmartDevDb.riders.id</code>.
     */
    public RidersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.first_name</code>.
     */
    public RidersRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.last_name</code>.
     */
    public RidersRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.email</code>.
     */
    public RidersRecord setEmail(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.phone</code>.
     */
    public RidersRecord setPhone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.profile_pic_url</code>.
     */
    public RidersRecord setProfilePicUrl(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.profile_pic_url</code>.
     */
    public String getProfilePicUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.is_active</code>.
     */
    public RidersRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.created_timestamp</code>.
     */
    public RidersRecord setCreatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.last_updated_timestamp</code>.
     */
    public RidersRecord setLastUpdatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.created_by</code>.
     */
    public RidersRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.last_updated_by</code>.
     */
    public RidersRecord setLastUpdatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.is_verified</code>.
     */
    public RidersRecord setIsVerified(Byte value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.is_verified</code>.
     */
    public Byte getIsVerified() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.is_blocked</code>.
     */
    public RidersRecord setIsBlocked(Byte value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.is_blocked</code>.
     */
    public Byte getIsBlocked() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.ssoId</code>.
     */
    public RidersRecord setSsoid(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.ssoId</code>.
     */
    public Integer getSsoid() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.ridecell_rider_id</code>.
     */
    public RidersRecord setRidecellRiderId(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.ridecell_rider_id</code>.
     */
    public Integer getRidecellRiderId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.last_active_timestamp</code>.
     */
    public RidersRecord setLastActiveTimestamp(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.last_active_timestamp</code>.
     */
    public Long getLastActiveTimestamp() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.signup_source</code>.
     */
    public RidersRecord setSignupSource(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.signup_source</code>.
     */
    public String getSignupSource() {
        return (String) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.login_source</code>.
     */
    public RidersRecord setLoginSource(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.login_source</code>.
     */
    public String getLoginSource() {
        return (String) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.user_setting</code>.
     */
    public RidersRecord setUserSetting(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.user_setting</code>.
     */
    public String getUserSetting() {
        return (String) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.other_flags</code>.
     */
    public RidersRecord setOtherFlags(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.other_flags</code>.
     */
    public String getOtherFlags() {
        return (String) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.gender</code>.
     */
    public RidersRecord setGender(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.gender</code>.
     */
    public String getGender() {
        return (String) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.dob</code>.
     */
    public RidersRecord setDob(Long value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.dob</code>.
     */
    public Long getDob() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.is_profile_completed</code>.
     */
    public RidersRecord setIsProfileCompleted(Byte value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.is_profile_completed</code>.
     */
    public Byte getIsProfileCompleted() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.early_arrival_count</code>.
     */
    public RidersRecord setEarlyArrivalCount(UInteger value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.early_arrival_count</code>.
     */
    public UInteger getEarlyArrivalCount() {
        return (UInteger) get(23);
    }

    /**
     * Setter for <code>blusmartDevDb.riders.state</code>.
     */
    public RidersRecord setState(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.riders.state</code>.
     */
    public String getState() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RidersRecord
     */
    public RidersRecord() {
        super(Riders.RIDERS);
    }

    /**
     * Create a detached, initialised RidersRecord
     */
    public RidersRecord(Integer id, String firstName, String lastName, String email, String phone, String profilePicUrl, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, Byte isVerified, Byte isBlocked, Integer ssoid, Integer ridecellRiderId, Long lastActiveTimestamp, String signupSource, String loginSource, String userSetting, String otherFlags, String gender, Long dob, Byte isProfileCompleted, UInteger earlyArrivalCount, String state) {
        super(Riders.RIDERS);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, email);
        set(4, phone);
        set(5, profilePicUrl);
        set(6, isActive);
        set(7, createdTimestamp);
        set(8, lastUpdatedTimestamp);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, isVerified);
        set(12, isBlocked);
        set(13, ssoid);
        set(14, ridecellRiderId);
        set(15, lastActiveTimestamp);
        set(16, signupSource);
        set(17, loginSource);
        set(18, userSetting);
        set(19, otherFlags);
        set(20, gender);
        set(21, dob);
        set(22, isProfileCompleted);
        set(23, earlyArrivalCount);
        set(24, state);
    }
}
