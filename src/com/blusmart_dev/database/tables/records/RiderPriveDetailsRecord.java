/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RiderPriveDetails;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiderPriveDetailsRecord extends UpdatableRecordImpl<RiderPriveDetailsRecord> implements Record17<UInteger, UInteger, String, Long, Long, UInteger, Byte, Byte, Long, Byte, UInteger, UInteger, UInteger, UInteger, Long, Long, String> {

    private static final long serialVersionUID = -837733573;

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.id</code>.
     */
    public RiderPriveDetailsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.rider_id</code>.
     */
    public RiderPriveDetailsRecord setRiderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.prive_key</code>.
     */
    public RiderPriveDetailsRecord setPriveKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.prive_key</code>.
     */
    public String getPriveKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.eligible_start_date</code>.
     */
    public RiderPriveDetailsRecord setEligibleStartDate(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.eligible_start_date</code>.
     */
    public Long getEligibleStartDate() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.eligible_end_date</code>.
     */
    public RiderPriveDetailsRecord setEligibleEndDate(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.eligible_end_date</code>.
     */
    public Long getEligibleEndDate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.total_points</code>.
     */
    public RiderPriveDetailsRecord setTotalPoints(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.total_points</code>.
     */
    public UInteger getTotalPoints() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.is_membership_active</code>.
     */
    public RiderPriveDetailsRecord setIsMembershipActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.is_membership_active</code>.
     */
    public Byte getIsMembershipActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.is_active</code>.
     */
    public RiderPriveDetailsRecord setIsActive(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.membership_active_timestamp</code>.
     */
    public RiderPriveDetailsRecord setMembershipActiveTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.membership_active_timestamp</code>.
     */
    public Long getMembershipActiveTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.is_prev_month_points_added</code>.
     */
    public RiderPriveDetailsRecord setIsPrevMonthPointsAdded(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.is_prev_month_points_added</code>.
     */
    public Byte getIsPrevMonthPointsAdded() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.point_to_show</code>.
     */
    public RiderPriveDetailsRecord setPointToShow(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.point_to_show</code>.
     */
    public UInteger getPointToShow() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.required_points</code>.
     */
    public RiderPriveDetailsRecord setRequiredPoints(UInteger value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.required_points</code>.
     */
    public UInteger getRequiredPoints() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.total_cumulative_point</code>.
     */
    public RiderPriveDetailsRecord setTotalCumulativePoint(UInteger value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.total_cumulative_point</code>.
     */
    public UInteger getTotalCumulativePoint() {
        return (UInteger) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.version_id</code>.
     */
    public RiderPriveDetailsRecord setVersionId(UInteger value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.version_id</code>.
     */
    public UInteger getVersionId() {
        return (UInteger) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.created_timestamp</code>.
     */
    public RiderPriveDetailsRecord setCreatedTimestamp(Long value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.last_updated_timestamp</code>.
     */
    public RiderPriveDetailsRecord setLastUpdatedTimestamp(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_prive_details.prive_other_flags</code>.
     */
    public RiderPriveDetailsRecord setPriveOtherFlags(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_prive_details.prive_other_flags</code>.
     */
    public String getPriveOtherFlags() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<UInteger, UInteger, String, Long, Long, UInteger, Byte, Byte, Long, Byte, UInteger, UInteger, UInteger, UInteger, Long, Long, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<UInteger, UInteger, String, Long, Long, UInteger, Byte, Byte, Long, Byte, UInteger, UInteger, UInteger, UInteger, Long, Long, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.RIDER_ID;
    }

    @Override
    public Field<String> field3() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.PRIVE_KEY;
    }

    @Override
    public Field<Long> field4() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.ELIGIBLE_START_DATE;
    }

    @Override
    public Field<Long> field5() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.ELIGIBLE_END_DATE;
    }

    @Override
    public Field<UInteger> field6() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.TOTAL_POINTS;
    }

    @Override
    public Field<Byte> field7() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.IS_MEMBERSHIP_ACTIVE;
    }

    @Override
    public Field<Byte> field8() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field9() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.MEMBERSHIP_ACTIVE_TIMESTAMP;
    }

    @Override
    public Field<Byte> field10() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.IS_PREV_MONTH_POINTS_ADDED;
    }

    @Override
    public Field<UInteger> field11() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.POINT_TO_SHOW;
    }

    @Override
    public Field<UInteger> field12() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.REQUIRED_POINTS;
    }

    @Override
    public Field<UInteger> field13() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.TOTAL_CUMULATIVE_POINT;
    }

    @Override
    public Field<UInteger> field14() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.VERSION_ID;
    }

    @Override
    public Field<Long> field15() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field16() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<String> field17() {
        return RiderPriveDetails.RIDER_PRIVE_DETAILS.PRIVE_OTHER_FLAGS;
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
    public String component3() {
        return getPriveKey();
    }

    @Override
    public Long component4() {
        return getEligibleStartDate();
    }

    @Override
    public Long component5() {
        return getEligibleEndDate();
    }

    @Override
    public UInteger component6() {
        return getTotalPoints();
    }

    @Override
    public Byte component7() {
        return getIsMembershipActive();
    }

    @Override
    public Byte component8() {
        return getIsActive();
    }

    @Override
    public Long component9() {
        return getMembershipActiveTimestamp();
    }

    @Override
    public Byte component10() {
        return getIsPrevMonthPointsAdded();
    }

    @Override
    public UInteger component11() {
        return getPointToShow();
    }

    @Override
    public UInteger component12() {
        return getRequiredPoints();
    }

    @Override
    public UInteger component13() {
        return getTotalCumulativePoint();
    }

    @Override
    public UInteger component14() {
        return getVersionId();
    }

    @Override
    public Long component15() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component16() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public String component17() {
        return getPriveOtherFlags();
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
    public String value3() {
        return getPriveKey();
    }

    @Override
    public Long value4() {
        return getEligibleStartDate();
    }

    @Override
    public Long value5() {
        return getEligibleEndDate();
    }

    @Override
    public UInteger value6() {
        return getTotalPoints();
    }

    @Override
    public Byte value7() {
        return getIsMembershipActive();
    }

    @Override
    public Byte value8() {
        return getIsActive();
    }

    @Override
    public Long value9() {
        return getMembershipActiveTimestamp();
    }

    @Override
    public Byte value10() {
        return getIsPrevMonthPointsAdded();
    }

    @Override
    public UInteger value11() {
        return getPointToShow();
    }

    @Override
    public UInteger value12() {
        return getRequiredPoints();
    }

    @Override
    public UInteger value13() {
        return getTotalCumulativePoint();
    }

    @Override
    public UInteger value14() {
        return getVersionId();
    }

    @Override
    public Long value15() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value16() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public String value17() {
        return getPriveOtherFlags();
    }

    @Override
    public RiderPriveDetailsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value2(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value3(String value) {
        setPriveKey(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value4(Long value) {
        setEligibleStartDate(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value5(Long value) {
        setEligibleEndDate(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value6(UInteger value) {
        setTotalPoints(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value7(Byte value) {
        setIsMembershipActive(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value8(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value9(Long value) {
        setMembershipActiveTimestamp(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value10(Byte value) {
        setIsPrevMonthPointsAdded(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value11(UInteger value) {
        setPointToShow(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value12(UInteger value) {
        setRequiredPoints(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value13(UInteger value) {
        setTotalCumulativePoint(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value14(UInteger value) {
        setVersionId(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value15(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value16(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord value17(String value) {
        setPriveOtherFlags(value);
        return this;
    }

    @Override
    public RiderPriveDetailsRecord values(UInteger value1, UInteger value2, String value3, Long value4, Long value5, UInteger value6, Byte value7, Byte value8, Long value9, Byte value10, UInteger value11, UInteger value12, UInteger value13, UInteger value14, Long value15, Long value16, String value17) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RiderPriveDetailsRecord
     */
    public RiderPriveDetailsRecord() {
        super(RiderPriveDetails.RIDER_PRIVE_DETAILS);
    }

    /**
     * Create a detached, initialised RiderPriveDetailsRecord
     */
    public RiderPriveDetailsRecord(UInteger id, UInteger riderId, String priveKey, Long eligibleStartDate, Long eligibleEndDate, UInteger totalPoints, Byte isMembershipActive, Byte isActive, Long membershipActiveTimestamp, Byte isPrevMonthPointsAdded, UInteger pointToShow, UInteger requiredPoints, UInteger totalCumulativePoint, UInteger versionId, Long createdTimestamp, Long lastUpdatedTimestamp, String priveOtherFlags) {
        super(RiderPriveDetails.RIDER_PRIVE_DETAILS);

        set(0, id);
        set(1, riderId);
        set(2, priveKey);
        set(3, eligibleStartDate);
        set(4, eligibleEndDate);
        set(5, totalPoints);
        set(6, isMembershipActive);
        set(7, isActive);
        set(8, membershipActiveTimestamp);
        set(9, isPrevMonthPointsAdded);
        set(10, pointToShow);
        set(11, requiredPoints);
        set(12, totalCumulativePoint);
        set(13, versionId);
        set(14, createdTimestamp);
        set(15, lastUpdatedTimestamp);
        set(16, priveOtherFlags);
    }
}
