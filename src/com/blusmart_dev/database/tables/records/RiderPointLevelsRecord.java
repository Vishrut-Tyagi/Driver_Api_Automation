/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RiderPointLevels;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiderPointLevelsRecord extends UpdatableRecordImpl<RiderPointLevelsRecord> implements Record10<Integer, String, Integer, Integer, String, Byte, Long, Integer, Long, Integer> {

    private static final long serialVersionUID = -220111728;

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.id</code>.
     */
    public RiderPointLevelsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.level_name</code>.
     */
    public RiderPointLevelsRecord setLevelName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.level_name</code>.
     */
    public String getLevelName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.level_number</code>.
     */
    public RiderPointLevelsRecord setLevelNumber(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.level_number</code>.
     */
    public Integer getLevelNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.required_points</code>.
     */
    public RiderPointLevelsRecord setRequiredPoints(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.required_points</code>.
     */
    public Integer getRequiredPoints() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.level_rewards</code>.
     */
    public RiderPointLevelsRecord setLevelRewards(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.level_rewards</code>.
     */
    public String getLevelRewards() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.is_active</code>.
     */
    public RiderPointLevelsRecord setIsActive(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.create_at</code>.
     */
    public RiderPointLevelsRecord setCreateAt(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.create_at</code>.
     */
    public Long getCreateAt() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.created_by</code>.
     */
    public RiderPointLevelsRecord setCreatedBy(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.last_updated_at</code>.
     */
    public RiderPointLevelsRecord setLastUpdatedAt(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_point_levels.last_updated_by</code>.
     */
    public RiderPointLevelsRecord setLastUpdatedBy(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_point_levels.last_updated_by</code>.
     */
    public Integer getLastUpdatedBy() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, Integer, Integer, String, Byte, Long, Integer, Long, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, String, Integer, Integer, String, Byte, Long, Integer, Long, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return RiderPointLevels.RIDER_POINT_LEVELS.ID;
    }

    @Override
    public Field<String> field2() {
        return RiderPointLevels.RIDER_POINT_LEVELS.LEVEL_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return RiderPointLevels.RIDER_POINT_LEVELS.LEVEL_NUMBER;
    }

    @Override
    public Field<Integer> field4() {
        return RiderPointLevels.RIDER_POINT_LEVELS.REQUIRED_POINTS;
    }

    @Override
    public Field<String> field5() {
        return RiderPointLevels.RIDER_POINT_LEVELS.LEVEL_REWARDS;
    }

    @Override
    public Field<Byte> field6() {
        return RiderPointLevels.RIDER_POINT_LEVELS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field7() {
        return RiderPointLevels.RIDER_POINT_LEVELS.CREATE_AT;
    }

    @Override
    public Field<Integer> field8() {
        return RiderPointLevels.RIDER_POINT_LEVELS.CREATED_BY;
    }

    @Override
    public Field<Long> field9() {
        return RiderPointLevels.RIDER_POINT_LEVELS.LAST_UPDATED_AT;
    }

    @Override
    public Field<Integer> field10() {
        return RiderPointLevels.RIDER_POINT_LEVELS.LAST_UPDATED_BY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getLevelName();
    }

    @Override
    public Integer component3() {
        return getLevelNumber();
    }

    @Override
    public Integer component4() {
        return getRequiredPoints();
    }

    @Override
    public String component5() {
        return getLevelRewards();
    }

    @Override
    public Byte component6() {
        return getIsActive();
    }

    @Override
    public Long component7() {
        return getCreateAt();
    }

    @Override
    public Integer component8() {
        return getCreatedBy();
    }

    @Override
    public Long component9() {
        return getLastUpdatedAt();
    }

    @Override
    public Integer component10() {
        return getLastUpdatedBy();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getLevelName();
    }

    @Override
    public Integer value3() {
        return getLevelNumber();
    }

    @Override
    public Integer value4() {
        return getRequiredPoints();
    }

    @Override
    public String value5() {
        return getLevelRewards();
    }

    @Override
    public Byte value6() {
        return getIsActive();
    }

    @Override
    public Long value7() {
        return getCreateAt();
    }

    @Override
    public Integer value8() {
        return getCreatedBy();
    }

    @Override
    public Long value9() {
        return getLastUpdatedAt();
    }

    @Override
    public Integer value10() {
        return getLastUpdatedBy();
    }

    @Override
    public RiderPointLevelsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value2(String value) {
        setLevelName(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value3(Integer value) {
        setLevelNumber(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value4(Integer value) {
        setRequiredPoints(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value5(String value) {
        setLevelRewards(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value6(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value7(Long value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value8(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value9(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord value10(Integer value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public RiderPointLevelsRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Byte value6, Long value7, Integer value8, Long value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RiderPointLevelsRecord
     */
    public RiderPointLevelsRecord() {
        super(RiderPointLevels.RIDER_POINT_LEVELS);
    }

    /**
     * Create a detached, initialised RiderPointLevelsRecord
     */
    public RiderPointLevelsRecord(Integer id, String levelName, Integer levelNumber, Integer requiredPoints, String levelRewards, Byte isActive, Long createAt, Integer createdBy, Long lastUpdatedAt, Integer lastUpdatedBy) {
        super(RiderPointLevels.RIDER_POINT_LEVELS);

        set(0, id);
        set(1, levelName);
        set(2, levelNumber);
        set(3, requiredPoints);
        set(4, levelRewards);
        set(5, isActive);
        set(6, createAt);
        set(7, createdBy);
        set(8, lastUpdatedAt);
        set(9, lastUpdatedBy);
    }
}
