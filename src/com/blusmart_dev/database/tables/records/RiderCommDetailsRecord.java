/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.RiderCommDetails;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiderCommDetailsRecord extends UpdatableRecordImpl<RiderCommDetailsRecord> implements Record10<UInteger, UInteger, String, String, String, Byte, Long, Long, UInteger, UInteger> {

    private static final long serialVersionUID = -1068588999;

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.id</code>.
     */
    public RiderCommDetailsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.rider_id</code>.
     */
    public RiderCommDetailsRecord setRiderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.agent_name</code>.
     */
    public RiderCommDetailsRecord setAgentName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.agent_name</code>.
     */
    public String getAgentName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.call_status</code>.
     */
    public RiderCommDetailsRecord setCallStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.call_status</code>.
     */
    public String getCallStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.remark</code>.
     */
    public RiderCommDetailsRecord setRemark(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.remark</code>.
     */
    public String getRemark() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.is_active</code>.
     */
    public RiderCommDetailsRecord setIsActive(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.created_timestamp</code>.
     */
    public RiderCommDetailsRecord setCreatedTimestamp(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.last_updated_timestamp</code>.
     */
    public RiderCommDetailsRecord setLastUpdatedTimestamp(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.created_by</code>.
     */
    public RiderCommDetailsRecord setCreatedBy(UInteger value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.rider_comm_details.last_updated_by</code>.
     */
    public RiderCommDetailsRecord setLastUpdatedBy(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.rider_comm_details.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<UInteger, UInteger, String, String, String, Byte, Long, Long, UInteger, UInteger> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<UInteger, UInteger, String, String, String, Byte, Long, Long, UInteger, UInteger> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RiderCommDetails.RIDER_COMM_DETAILS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return RiderCommDetails.RIDER_COMM_DETAILS.RIDER_ID;
    }

    @Override
    public Field<String> field3() {
        return RiderCommDetails.RIDER_COMM_DETAILS.AGENT_NAME;
    }

    @Override
    public Field<String> field4() {
        return RiderCommDetails.RIDER_COMM_DETAILS.CALL_STATUS;
    }

    @Override
    public Field<String> field5() {
        return RiderCommDetails.RIDER_COMM_DETAILS.REMARK;
    }

    @Override
    public Field<Byte> field6() {
        return RiderCommDetails.RIDER_COMM_DETAILS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field7() {
        return RiderCommDetails.RIDER_COMM_DETAILS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field8() {
        return RiderCommDetails.RIDER_COMM_DETAILS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field9() {
        return RiderCommDetails.RIDER_COMM_DETAILS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field10() {
        return RiderCommDetails.RIDER_COMM_DETAILS.LAST_UPDATED_BY;
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
        return getAgentName();
    }

    @Override
    public String component4() {
        return getCallStatus();
    }

    @Override
    public String component5() {
        return getRemark();
    }

    @Override
    public Byte component6() {
        return getIsActive();
    }

    @Override
    public Long component7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component9() {
        return getCreatedBy();
    }

    @Override
    public UInteger component10() {
        return getLastUpdatedBy();
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
        return getAgentName();
    }

    @Override
    public String value4() {
        return getCallStatus();
    }

    @Override
    public String value5() {
        return getRemark();
    }

    @Override
    public Byte value6() {
        return getIsActive();
    }

    @Override
    public Long value7() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value8() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value9() {
        return getCreatedBy();
    }

    @Override
    public UInteger value10() {
        return getLastUpdatedBy();
    }

    @Override
    public RiderCommDetailsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value2(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value3(String value) {
        setAgentName(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value4(String value) {
        setCallStatus(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value5(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value6(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value7(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value8(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value9(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord value10(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public RiderCommDetailsRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, Byte value6, Long value7, Long value8, UInteger value9, UInteger value10) {
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
     * Create a detached RiderCommDetailsRecord
     */
    public RiderCommDetailsRecord() {
        super(RiderCommDetails.RIDER_COMM_DETAILS);
    }

    /**
     * Create a detached, initialised RiderCommDetailsRecord
     */
    public RiderCommDetailsRecord(UInteger id, UInteger riderId, String agentName, String callStatus, String remark, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy) {
        super(RiderCommDetails.RIDER_COMM_DETAILS);

        set(0, id);
        set(1, riderId);
        set(2, agentName);
        set(3, callStatus);
        set(4, remark);
        set(5, isActive);
        set(6, createdTimestamp);
        set(7, lastUpdatedTimestamp);
        set(8, createdBy);
        set(9, lastUpdatedBy);
    }
}
