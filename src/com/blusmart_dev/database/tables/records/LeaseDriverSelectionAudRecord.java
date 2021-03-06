/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.LeaseDriverSelectionAud;

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
public class LeaseDriverSelectionAudRecord extends UpdatableRecordImpl<LeaseDriverSelectionAudRecord> implements Record12<UInteger, UInteger, UInteger, UInteger, String, Byte, UInteger, Long, UInteger, Long, UInteger, String> {

    private static final long serialVersionUID = 458778942;

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.aud_id</code>.
     */
    public LeaseDriverSelectionAudRecord setAudId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.aud_id</code>.
     */
    public UInteger getAudId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.id</code>.
     */
    public LeaseDriverSelectionAudRecord setId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.driver_id</code>.
     */
    public LeaseDriverSelectionAudRecord setDriverId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.driver_id</code>.
     */
    public UInteger getDriverId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.lease_id</code>.
     */
    public LeaseDriverSelectionAudRecord setLeaseId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.lease_id</code>.
     */
    public UInteger getLeaseId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.state</code>.
     */
    public LeaseDriverSelectionAudRecord setState(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.state</code>.
     */
    public String getState() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.is_active</code>.
     */
    public LeaseDriverSelectionAudRecord setIsActive(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.created_by</code>.
     */
    public LeaseDriverSelectionAudRecord setCreatedBy(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.created_at</code>.
     */
    public LeaseDriverSelectionAudRecord setCreatedAt(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.last_updated_by</code>.
     */
    public LeaseDriverSelectionAudRecord setLastUpdatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.last_updated_at</code>.
     */
    public LeaseDriverSelectionAudRecord setLastUpdatedAt(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.hub_id</code>.
     */
    public LeaseDriverSelectionAudRecord setHubId(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.hub_id</code>.
     */
    public UInteger getHubId() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.lease_driver_selection_aud.lmp_combination_id</code>.
     */
    public LeaseDriverSelectionAudRecord setLmpCombinationId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.lease_driver_selection_aud.lmp_combination_id</code>.
     */
    public String getLmpCombinationId() {
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
    public Row12<UInteger, UInteger, UInteger, UInteger, String, Byte, UInteger, Long, UInteger, Long, UInteger, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UInteger, UInteger, UInteger, UInteger, String, Byte, UInteger, Long, UInteger, Long, UInteger, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.AUD_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.ID;
    }

    @Override
    public Field<UInteger> field3() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.DRIVER_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.LEASE_ID;
    }

    @Override
    public Field<String> field5() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.STATE;
    }

    @Override
    public Field<Byte> field6() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.IS_ACTIVE;
    }

    @Override
    public Field<UInteger> field7() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.CREATED_BY;
    }

    @Override
    public Field<Long> field8() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.CREATED_AT;
    }

    @Override
    public Field<UInteger> field9() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.LAST_UPDATED_BY;
    }

    @Override
    public Field<Long> field10() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.LAST_UPDATED_AT;
    }

    @Override
    public Field<UInteger> field11() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.HUB_ID;
    }

    @Override
    public Field<String> field12() {
        return LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD.LMP_COMBINATION_ID;
    }

    @Override
    public UInteger component1() {
        return getAudId();
    }

    @Override
    public UInteger component2() {
        return getId();
    }

    @Override
    public UInteger component3() {
        return getDriverId();
    }

    @Override
    public UInteger component4() {
        return getLeaseId();
    }

    @Override
    public String component5() {
        return getState();
    }

    @Override
    public Byte component6() {
        return getIsActive();
    }

    @Override
    public UInteger component7() {
        return getCreatedBy();
    }

    @Override
    public Long component8() {
        return getCreatedAt();
    }

    @Override
    public UInteger component9() {
        return getLastUpdatedBy();
    }

    @Override
    public Long component10() {
        return getLastUpdatedAt();
    }

    @Override
    public UInteger component11() {
        return getHubId();
    }

    @Override
    public String component12() {
        return getLmpCombinationId();
    }

    @Override
    public UInteger value1() {
        return getAudId();
    }

    @Override
    public UInteger value2() {
        return getId();
    }

    @Override
    public UInteger value3() {
        return getDriverId();
    }

    @Override
    public UInteger value4() {
        return getLeaseId();
    }

    @Override
    public String value5() {
        return getState();
    }

    @Override
    public Byte value6() {
        return getIsActive();
    }

    @Override
    public UInteger value7() {
        return getCreatedBy();
    }

    @Override
    public Long value8() {
        return getCreatedAt();
    }

    @Override
    public UInteger value9() {
        return getLastUpdatedBy();
    }

    @Override
    public Long value10() {
        return getLastUpdatedAt();
    }

    @Override
    public UInteger value11() {
        return getHubId();
    }

    @Override
    public String value12() {
        return getLmpCombinationId();
    }

    @Override
    public LeaseDriverSelectionAudRecord value1(UInteger value) {
        setAudId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value2(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value3(UInteger value) {
        setDriverId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value4(UInteger value) {
        setLeaseId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value5(String value) {
        setState(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value6(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value7(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value8(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value9(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value10(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value11(UInteger value) {
        setHubId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord value12(String value) {
        setLmpCombinationId(value);
        return this;
    }

    @Override
    public LeaseDriverSelectionAudRecord values(UInteger value1, UInteger value2, UInteger value3, UInteger value4, String value5, Byte value6, UInteger value7, Long value8, UInteger value9, Long value10, UInteger value11, String value12) {
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
     * Create a detached LeaseDriverSelectionAudRecord
     */
    public LeaseDriverSelectionAudRecord() {
        super(LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD);
    }

    /**
     * Create a detached, initialised LeaseDriverSelectionAudRecord
     */
    public LeaseDriverSelectionAudRecord(UInteger audId, UInteger id, UInteger driverId, UInteger leaseId, String state, Byte isActive, UInteger createdBy, Long createdAt, UInteger lastUpdatedBy, Long lastUpdatedAt, UInteger hubId, String lmpCombinationId) {
        super(LeaseDriverSelectionAud.LEASE_DRIVER_SELECTION_AUD);

        set(0, audId);
        set(1, id);
        set(2, driverId);
        set(3, leaseId);
        set(4, state);
        set(5, isActive);
        set(6, createdBy);
        set(7, createdAt);
        set(8, lastUpdatedBy);
        set(9, lastUpdatedAt);
        set(10, hubId);
        set(11, lmpCombinationId);
    }
}
