/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.DriverRetentionBonusAud;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This Table is used for audit for the retentio bonus for the drivers.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DriverRetentionBonusAudRecord extends UpdatableRecordImpl<DriverRetentionBonusAudRecord> implements Record12<Integer, Integer, Integer, BigDecimal, Long, Long, Long, Byte, Byte, Integer, Integer, String> {

    private static final long serialVersionUID = -2054852683;

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.aud_id</code>.
     */
    public DriverRetentionBonusAudRecord setAudId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.aud_id</code>.
     */
    public Integer getAudId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.id</code>.
     */
    public DriverRetentionBonusAudRecord setId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.driver_id</code>.
     */
    public DriverRetentionBonusAudRecord setDriverId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.driver_id</code>.
     */
    public Integer getDriverId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.retention_bonus</code>.
     */
    public DriverRetentionBonusAudRecord setRetentionBonus(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.retention_bonus</code>.
     */
    public BigDecimal getRetentionBonus() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.last_bonus_date</code>.
     */
    public DriverRetentionBonusAudRecord setLastBonusDate(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.last_bonus_date</code>.
     */
    public Long getLastBonusDate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.created_at</code>.
     */
    public DriverRetentionBonusAudRecord setCreatedAt(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.last_updated_at</code>.
     */
    public DriverRetentionBonusAudRecord setLastUpdatedAt(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.is_active</code>.
     */
    public DriverRetentionBonusAudRecord setIsActive(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.stop_bonus</code>.
     */
    public DriverRetentionBonusAudRecord setStopBonus(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.stop_bonus</code>.
     */
    public Byte getStopBonus() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.created_by</code>.
     */
    public DriverRetentionBonusAudRecord setCreatedBy(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.last_updated_by</code>.
     */
    public DriverRetentionBonusAudRecord setLastUpdatedBy(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.last_updated_by</code>.
     */
    public Integer getLastUpdatedBy() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.driver_retention_bonus_aud.operation</code>.
     */
    public DriverRetentionBonusAudRecord setOperation(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.driver_retention_bonus_aud.operation</code>.
     */
    public String getOperation() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Integer, Integer, BigDecimal, Long, Long, Long, Byte, Byte, Integer, Integer, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, Integer, Integer, BigDecimal, Long, Long, Long, Byte, Byte, Integer, Integer, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.AUD_ID;
    }

    @Override
    public Field<Integer> field2() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.ID;
    }

    @Override
    public Field<Integer> field3() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.DRIVER_ID;
    }

    @Override
    public Field<BigDecimal> field4() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.RETENTION_BONUS;
    }

    @Override
    public Field<Long> field5() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.LAST_BONUS_DATE;
    }

    @Override
    public Field<Long> field6() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.CREATED_AT;
    }

    @Override
    public Field<Long> field7() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.LAST_UPDATED_AT;
    }

    @Override
    public Field<Byte> field8() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.IS_ACTIVE;
    }

    @Override
    public Field<Byte> field9() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.STOP_BONUS;
    }

    @Override
    public Field<Integer> field10() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.CREATED_BY;
    }

    @Override
    public Field<Integer> field11() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field12() {
        return DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD.OPERATION;
    }

    @Override
    public Integer component1() {
        return getAudId();
    }

    @Override
    public Integer component2() {
        return getId();
    }

    @Override
    public Integer component3() {
        return getDriverId();
    }

    @Override
    public BigDecimal component4() {
        return getRetentionBonus();
    }

    @Override
    public Long component5() {
        return getLastBonusDate();
    }

    @Override
    public Long component6() {
        return getCreatedAt();
    }

    @Override
    public Long component7() {
        return getLastUpdatedAt();
    }

    @Override
    public Byte component8() {
        return getIsActive();
    }

    @Override
    public Byte component9() {
        return getStopBonus();
    }

    @Override
    public Integer component10() {
        return getCreatedBy();
    }

    @Override
    public Integer component11() {
        return getLastUpdatedBy();
    }

    @Override
    public String component12() {
        return getOperation();
    }

    @Override
    public Integer value1() {
        return getAudId();
    }

    @Override
    public Integer value2() {
        return getId();
    }

    @Override
    public Integer value3() {
        return getDriverId();
    }

    @Override
    public BigDecimal value4() {
        return getRetentionBonus();
    }

    @Override
    public Long value5() {
        return getLastBonusDate();
    }

    @Override
    public Long value6() {
        return getCreatedAt();
    }

    @Override
    public Long value7() {
        return getLastUpdatedAt();
    }

    @Override
    public Byte value8() {
        return getIsActive();
    }

    @Override
    public Byte value9() {
        return getStopBonus();
    }

    @Override
    public Integer value10() {
        return getCreatedBy();
    }

    @Override
    public Integer value11() {
        return getLastUpdatedBy();
    }

    @Override
    public String value12() {
        return getOperation();
    }

    @Override
    public DriverRetentionBonusAudRecord value1(Integer value) {
        setAudId(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value2(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value3(Integer value) {
        setDriverId(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value4(BigDecimal value) {
        setRetentionBonus(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value5(Long value) {
        setLastBonusDate(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value6(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value7(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value8(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value9(Byte value) {
        setStopBonus(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value10(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value11(Integer value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord value12(String value) {
        setOperation(value);
        return this;
    }

    @Override
    public DriverRetentionBonusAudRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4, Long value5, Long value6, Long value7, Byte value8, Byte value9, Integer value10, Integer value11, String value12) {
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
     * Create a detached DriverRetentionBonusAudRecord
     */
    public DriverRetentionBonusAudRecord() {
        super(DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD);
    }

    /**
     * Create a detached, initialised DriverRetentionBonusAudRecord
     */
    public DriverRetentionBonusAudRecord(Integer audId, Integer id, Integer driverId, BigDecimal retentionBonus, Long lastBonusDate, Long createdAt, Long lastUpdatedAt, Byte isActive, Byte stopBonus, Integer createdBy, Integer lastUpdatedBy, String operation) {
        super(DriverRetentionBonusAud.DRIVER_RETENTION_BONUS_AUD);

        set(0, audId);
        set(1, id);
        set(2, driverId);
        set(3, retentionBonus);
        set(4, lastBonusDate);
        set(5, createdAt);
        set(6, lastUpdatedAt);
        set(7, isActive);
        set(8, stopBonus);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, operation);
    }
}
