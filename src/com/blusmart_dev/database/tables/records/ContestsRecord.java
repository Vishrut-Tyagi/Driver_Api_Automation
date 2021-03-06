/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Contests;

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
public class ContestsRecord extends UpdatableRecordImpl<ContestsRecord> implements Record14<UInteger, String, String, Long, Long, Long, Long, Long, Byte, UInteger, Long, UInteger, Long, String> {

    private static final long serialVersionUID = -1144978386;

    /**
     * Setter for <code>blusmartDevDb.contests.id</code>.
     */
    public ContestsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.contest_name</code>.
     */
    public ContestsRecord setContestName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.contest_name</code>.
     */
    public String getContestName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.description</code>.
     */
    public ContestsRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.contest_start_timestamp</code>.
     */
    public ContestsRecord setContestStartTimestamp(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.contest_start_timestamp</code>.
     */
    public Long getContestStartTimestamp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.contest_end_timestamp</code>.
     */
    public ContestsRecord setContestEndTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.contest_end_timestamp</code>.
     */
    public Long getContestEndTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.end_visibility_timestamp</code>.
     */
    public ContestsRecord setEndVisibilityTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.end_visibility_timestamp</code>.
     */
    public Long getEndVisibilityTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.applicable_timestamp</code>.
     */
    public ContestsRecord setApplicableTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.applicable_timestamp</code>.
     */
    public Long getApplicableTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.visibility_timestamp</code>.
     */
    public ContestsRecord setVisibilityTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.visibility_timestamp</code>.
     */
    public Long getVisibilityTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.is_active</code>.
     */
    public ContestsRecord setIsActive(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.created_by</code>.
     */
    public ContestsRecord setCreatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.created_at</code>.
     */
    public ContestsRecord setCreatedAt(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.last_updated_by</code>.
     */
    public ContestsRecord setLastUpdatedBy(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.last_updated_at</code>.
     */
    public ContestsRecord setLastUpdatedAt(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.contests.other_flags</code>.
     */
    public ContestsRecord setOtherFlags(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.contests.other_flags</code>.
     */
    public String getOtherFlags() {
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
    public Row14<UInteger, String, String, Long, Long, Long, Long, Long, Byte, UInteger, Long, UInteger, Long, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, String, String, Long, Long, Long, Long, Long, Byte, UInteger, Long, UInteger, Long, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Contests.CONTESTS.ID;
    }

    @Override
    public Field<String> field2() {
        return Contests.CONTESTS.CONTEST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Contests.CONTESTS.DESCRIPTION;
    }

    @Override
    public Field<Long> field4() {
        return Contests.CONTESTS.CONTEST_START_TIMESTAMP;
    }

    @Override
    public Field<Long> field5() {
        return Contests.CONTESTS.CONTEST_END_TIMESTAMP;
    }

    @Override
    public Field<Long> field6() {
        return Contests.CONTESTS.END_VISIBILITY_TIMESTAMP;
    }

    @Override
    public Field<Long> field7() {
        return Contests.CONTESTS.APPLICABLE_TIMESTAMP;
    }

    @Override
    public Field<Long> field8() {
        return Contests.CONTESTS.VISIBILITY_TIMESTAMP;
    }

    @Override
    public Field<Byte> field9() {
        return Contests.CONTESTS.IS_ACTIVE;
    }

    @Override
    public Field<UInteger> field10() {
        return Contests.CONTESTS.CREATED_BY;
    }

    @Override
    public Field<Long> field11() {
        return Contests.CONTESTS.CREATED_AT;
    }

    @Override
    public Field<UInteger> field12() {
        return Contests.CONTESTS.LAST_UPDATED_BY;
    }

    @Override
    public Field<Long> field13() {
        return Contests.CONTESTS.LAST_UPDATED_AT;
    }

    @Override
    public Field<String> field14() {
        return Contests.CONTESTS.OTHER_FLAGS;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getContestName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Long component4() {
        return getContestStartTimestamp();
    }

    @Override
    public Long component5() {
        return getContestEndTimestamp();
    }

    @Override
    public Long component6() {
        return getEndVisibilityTimestamp();
    }

    @Override
    public Long component7() {
        return getApplicableTimestamp();
    }

    @Override
    public Long component8() {
        return getVisibilityTimestamp();
    }

    @Override
    public Byte component9() {
        return getIsActive();
    }

    @Override
    public UInteger component10() {
        return getCreatedBy();
    }

    @Override
    public Long component11() {
        return getCreatedAt();
    }

    @Override
    public UInteger component12() {
        return getLastUpdatedBy();
    }

    @Override
    public Long component13() {
        return getLastUpdatedAt();
    }

    @Override
    public String component14() {
        return getOtherFlags();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getContestName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Long value4() {
        return getContestStartTimestamp();
    }

    @Override
    public Long value5() {
        return getContestEndTimestamp();
    }

    @Override
    public Long value6() {
        return getEndVisibilityTimestamp();
    }

    @Override
    public Long value7() {
        return getApplicableTimestamp();
    }

    @Override
    public Long value8() {
        return getVisibilityTimestamp();
    }

    @Override
    public Byte value9() {
        return getIsActive();
    }

    @Override
    public UInteger value10() {
        return getCreatedBy();
    }

    @Override
    public Long value11() {
        return getCreatedAt();
    }

    @Override
    public UInteger value12() {
        return getLastUpdatedBy();
    }

    @Override
    public Long value13() {
        return getLastUpdatedAt();
    }

    @Override
    public String value14() {
        return getOtherFlags();
    }

    @Override
    public ContestsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public ContestsRecord value2(String value) {
        setContestName(value);
        return this;
    }

    @Override
    public ContestsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ContestsRecord value4(Long value) {
        setContestStartTimestamp(value);
        return this;
    }

    @Override
    public ContestsRecord value5(Long value) {
        setContestEndTimestamp(value);
        return this;
    }

    @Override
    public ContestsRecord value6(Long value) {
        setEndVisibilityTimestamp(value);
        return this;
    }

    @Override
    public ContestsRecord value7(Long value) {
        setApplicableTimestamp(value);
        return this;
    }

    @Override
    public ContestsRecord value8(Long value) {
        setVisibilityTimestamp(value);
        return this;
    }

    @Override
    public ContestsRecord value9(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public ContestsRecord value10(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public ContestsRecord value11(Long value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public ContestsRecord value12(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public ContestsRecord value13(Long value) {
        setLastUpdatedAt(value);
        return this;
    }

    @Override
    public ContestsRecord value14(String value) {
        setOtherFlags(value);
        return this;
    }

    @Override
    public ContestsRecord values(UInteger value1, String value2, String value3, Long value4, Long value5, Long value6, Long value7, Long value8, Byte value9, UInteger value10, Long value11, UInteger value12, Long value13, String value14) {
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
     * Create a detached ContestsRecord
     */
    public ContestsRecord() {
        super(Contests.CONTESTS);
    }

    /**
     * Create a detached, initialised ContestsRecord
     */
    public ContestsRecord(UInteger id, String contestName, String description, Long contestStartTimestamp, Long contestEndTimestamp, Long endVisibilityTimestamp, Long applicableTimestamp, Long visibilityTimestamp, Byte isActive, UInteger createdBy, Long createdAt, UInteger lastUpdatedBy, Long lastUpdatedAt, String otherFlags) {
        super(Contests.CONTESTS);

        set(0, id);
        set(1, contestName);
        set(2, description);
        set(3, contestStartTimestamp);
        set(4, contestEndTimestamp);
        set(5, endVisibilityTimestamp);
        set(6, applicableTimestamp);
        set(7, visibilityTimestamp);
        set(8, isActive);
        set(9, createdBy);
        set(10, createdAt);
        set(11, lastUpdatedBy);
        set(12, lastUpdatedAt);
        set(13, otherFlags);
    }
}
