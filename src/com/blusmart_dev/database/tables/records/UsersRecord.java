/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Users;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record14<UInteger, UInteger, String, String, String, Byte, Byte, Long, Long, UInteger, UInteger, String, String, String> {

    private static final long serialVersionUID = -1185091657;

    /**
     * Setter for <code>blusmartDevDb.users.id</code>.
     */
    public UsersRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.users.sso_id</code>.
     */
    public UsersRecord setSsoId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.sso_id</code>.
     */
    public UInteger getSsoId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.users.first_name</code>.
     */
    public UsersRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.users.last_name</code>.
     */
    public UsersRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.users.email</code>.
     */
    public UsersRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.users.is_blocked</code>.
     */
    public UsersRecord setIsBlocked(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.is_blocked</code>.
     */
    public Byte getIsBlocked() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.users.is_active</code>.
     */
    public UsersRecord setIsActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.users.created_timestamp</code>.
     */
    public UsersRecord setCreatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.users.last_updated_timestamp</code>.
     */
    public UsersRecord setLastUpdatedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.users.created_by</code>.
     */
    public UsersRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.users.last_updated_by</code>.
     */
    public UsersRecord setLastUpdatedBy(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.users.phone</code>.
     */
    public UsersRecord setPhone(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.phone</code>.
     */
    public String getPhone() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.users.business_name</code>.
     */
    public UsersRecord setBusinessName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.business_name</code>.
     */
    public String getBusinessName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.users.role</code>.
     */
    public UsersRecord setRole(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.users.role</code>.
     */
    public String getRole() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, UInteger, String, String, String, Byte, Byte, Long, Long, UInteger, UInteger, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, UInteger, String, String, String, Byte, Byte, Long, Long, UInteger, UInteger, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return Users.USERS.SSO_ID;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.FIRST_NAME;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.LAST_NAME;
    }

    @Override
    public Field<String> field5() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<Byte> field6() {
        return Users.USERS.IS_BLOCKED;
    }

    @Override
    public Field<Byte> field7() {
        return Users.USERS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field8() {
        return Users.USERS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field9() {
        return Users.USERS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field10() {
        return Users.USERS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field11() {
        return Users.USERS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field12() {
        return Users.USERS.PHONE;
    }

    @Override
    public Field<String> field13() {
        return Users.USERS.BUSINESS_NAME;
    }

    @Override
    public Field<String> field14() {
        return Users.USERS.ROLE;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getSsoId();
    }

    @Override
    public String component3() {
        return getFirstName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public Byte component6() {
        return getIsBlocked();
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
        return getPhone();
    }

    @Override
    public String component13() {
        return getBusinessName();
    }

    @Override
    public String component14() {
        return getRole();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getSsoId();
    }

    @Override
    public String value3() {
        return getFirstName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public Byte value6() {
        return getIsBlocked();
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
        return getPhone();
    }

    @Override
    public String value13() {
        return getBusinessName();
    }

    @Override
    public String value14() {
        return getRole();
    }

    @Override
    public UsersRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(UInteger value) {
        setSsoId(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public UsersRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value6(Byte value) {
        setIsBlocked(value);
        return this;
    }

    @Override
    public UsersRecord value7(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public UsersRecord value8(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public UsersRecord value9(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public UsersRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public UsersRecord value11(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public UsersRecord value12(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public UsersRecord value13(String value) {
        setBusinessName(value);
        return this;
    }

    @Override
    public UsersRecord value14(String value) {
        setRole(value);
        return this;
    }

    @Override
    public UsersRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, Byte value6, Byte value7, Long value8, Long value9, UInteger value10, UInteger value11, String value12, String value13, String value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(UInteger id, UInteger ssoId, String firstName, String lastName, String email, Byte isBlocked, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String phone, String businessName, String role) {
        super(Users.USERS);

        set(0, id);
        set(1, ssoId);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, isBlocked);
        set(6, isActive);
        set(7, createdTimestamp);
        set(8, lastUpdatedTimestamp);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, phone);
        set(12, businessName);
        set(13, role);
    }
}
