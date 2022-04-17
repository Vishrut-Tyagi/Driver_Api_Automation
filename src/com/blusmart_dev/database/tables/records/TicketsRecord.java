/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.Tickets;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TicketsRecord extends UpdatableRecordImpl<TicketsRecord> implements Record16<UInteger, UInteger, UInteger, UInteger, String, String, String, String, Long, String, Byte, Long, Long, UInteger, UInteger, String> {

    private static final long serialVersionUID = -1097581235;

    /**
     * Setter for <code>blusmartDevDb.tickets.id</code>.
     */
    public TicketsRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.ride_request_id</code>.
     */
    public TicketsRecord setRideRequestId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.ride_request_id</code>.
     */
    public UInteger getRideRequestId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.ride_id</code>.
     */
    public TicketsRecord setRideId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.ride_id</code>.
     */
    public UInteger getRideId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.rider_id</code>.
     */
    public TicketsRecord setRiderId(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.ticket_type</code>.
     */
    public TicketsRecord setTicketType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.ticket_type</code>.
     */
    public String getTicketType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.ticket_stage</code>.
     */
    public TicketsRecord setTicketStage(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.ticket_stage</code>.
     */
    public String getTicketStage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.incident_id</code>.
     */
    public TicketsRecord setIncidentId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.incident_id</code>.
     */
    public String getIncidentId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.ticket_history_details</code>.
     */
    public TicketsRecord setTicketHistoryDetails(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.ticket_history_details</code>.
     */
    public String getTicketHistoryDetails() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.closed_timestamp</code>.
     */
    public TicketsRecord setClosedTimestamp(Long value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.closed_timestamp</code>.
     */
    public Long getClosedTimestamp() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.closure_remark</code>.
     */
    public TicketsRecord setClosureRemark(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.closure_remark</code>.
     */
    public String getClosureRemark() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.is_active</code>.
     */
    public TicketsRecord setIsActive(Byte value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.created_timestamp</code>.
     */
    public TicketsRecord setCreatedTimestamp(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.last_updated_timestamp</code>.
     */
    public TicketsRecord setLastUpdatedTimestamp(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.created_by</code>.
     */
    public TicketsRecord setCreatedBy(UInteger value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.created_by</code>.
     */
    public UInteger getCreatedBy() {
        return (UInteger) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.last_updated_by</code>.
     */
    public TicketsRecord setLastUpdatedBy(UInteger value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.last_updated_by</code>.
     */
    public UInteger getLastUpdatedBy() {
        return (UInteger) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.tickets.feedback</code>.
     */
    public TicketsRecord setFeedback(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.tickets.feedback</code>.
     */
    public String getFeedback() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<UInteger, UInteger, UInteger, UInteger, String, String, String, String, Long, String, Byte, Long, Long, UInteger, UInteger, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<UInteger, UInteger, UInteger, UInteger, String, String, String, String, Long, String, Byte, Long, Long, UInteger, UInteger, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Tickets.TICKETS.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return Tickets.TICKETS.RIDE_REQUEST_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return Tickets.TICKETS.RIDE_ID;
    }

    @Override
    public Field<UInteger> field4() {
        return Tickets.TICKETS.RIDER_ID;
    }

    @Override
    public Field<String> field5() {
        return Tickets.TICKETS.TICKET_TYPE;
    }

    @Override
    public Field<String> field6() {
        return Tickets.TICKETS.TICKET_STAGE;
    }

    @Override
    public Field<String> field7() {
        return Tickets.TICKETS.INCIDENT_ID;
    }

    @Override
    public Field<String> field8() {
        return Tickets.TICKETS.TICKET_HISTORY_DETAILS;
    }

    @Override
    public Field<Long> field9() {
        return Tickets.TICKETS.CLOSED_TIMESTAMP;
    }

    @Override
    public Field<String> field10() {
        return Tickets.TICKETS.CLOSURE_REMARK;
    }

    @Override
    public Field<Byte> field11() {
        return Tickets.TICKETS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field12() {
        return Tickets.TICKETS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field13() {
        return Tickets.TICKETS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<UInteger> field14() {
        return Tickets.TICKETS.CREATED_BY;
    }

    @Override
    public Field<UInteger> field15() {
        return Tickets.TICKETS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field16() {
        return Tickets.TICKETS.FEEDBACK;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getRideRequestId();
    }

    @Override
    public UInteger component3() {
        return getRideId();
    }

    @Override
    public UInteger component4() {
        return getRiderId();
    }

    @Override
    public String component5() {
        return getTicketType();
    }

    @Override
    public String component6() {
        return getTicketStage();
    }

    @Override
    public String component7() {
        return getIncidentId();
    }

    @Override
    public String component8() {
        return getTicketHistoryDetails();
    }

    @Override
    public Long component9() {
        return getClosedTimestamp();
    }

    @Override
    public String component10() {
        return getClosureRemark();
    }

    @Override
    public Byte component11() {
        return getIsActive();
    }

    @Override
    public Long component12() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component13() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger component14() {
        return getCreatedBy();
    }

    @Override
    public UInteger component15() {
        return getLastUpdatedBy();
    }

    @Override
    public String component16() {
        return getFeedback();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getRideRequestId();
    }

    @Override
    public UInteger value3() {
        return getRideId();
    }

    @Override
    public UInteger value4() {
        return getRiderId();
    }

    @Override
    public String value5() {
        return getTicketType();
    }

    @Override
    public String value6() {
        return getTicketStage();
    }

    @Override
    public String value7() {
        return getIncidentId();
    }

    @Override
    public String value8() {
        return getTicketHistoryDetails();
    }

    @Override
    public Long value9() {
        return getClosedTimestamp();
    }

    @Override
    public String value10() {
        return getClosureRemark();
    }

    @Override
    public Byte value11() {
        return getIsActive();
    }

    @Override
    public Long value12() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value13() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public UInteger value14() {
        return getCreatedBy();
    }

    @Override
    public UInteger value15() {
        return getLastUpdatedBy();
    }

    @Override
    public String value16() {
        return getFeedback();
    }

    @Override
    public TicketsRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public TicketsRecord value2(UInteger value) {
        setRideRequestId(value);
        return this;
    }

    @Override
    public TicketsRecord value3(UInteger value) {
        setRideId(value);
        return this;
    }

    @Override
    public TicketsRecord value4(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public TicketsRecord value5(String value) {
        setTicketType(value);
        return this;
    }

    @Override
    public TicketsRecord value6(String value) {
        setTicketStage(value);
        return this;
    }

    @Override
    public TicketsRecord value7(String value) {
        setIncidentId(value);
        return this;
    }

    @Override
    public TicketsRecord value8(String value) {
        setTicketHistoryDetails(value);
        return this;
    }

    @Override
    public TicketsRecord value9(Long value) {
        setClosedTimestamp(value);
        return this;
    }

    @Override
    public TicketsRecord value10(String value) {
        setClosureRemark(value);
        return this;
    }

    @Override
    public TicketsRecord value11(Byte value) {
        setIsActive(value);
        return this;
    }

    @Override
    public TicketsRecord value12(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public TicketsRecord value13(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public TicketsRecord value14(UInteger value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TicketsRecord value15(UInteger value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public TicketsRecord value16(String value) {
        setFeedback(value);
        return this;
    }

    @Override
    public TicketsRecord values(UInteger value1, UInteger value2, UInteger value3, UInteger value4, String value5, String value6, String value7, String value8, Long value9, String value10, Byte value11, Long value12, Long value13, UInteger value14, UInteger value15, String value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TicketsRecord
     */
    public TicketsRecord() {
        super(Tickets.TICKETS);
    }

    /**
     * Create a detached, initialised TicketsRecord
     */
    public TicketsRecord(UInteger id, UInteger rideRequestId, UInteger rideId, UInteger riderId, String ticketType, String ticketStage, String incidentId, String ticketHistoryDetails, Long closedTimestamp, String closureRemark, Byte isActive, Long createdTimestamp, Long lastUpdatedTimestamp, UInteger createdBy, UInteger lastUpdatedBy, String feedback) {
        super(Tickets.TICKETS);

        set(0, id);
        set(1, rideRequestId);
        set(2, rideId);
        set(3, riderId);
        set(4, ticketType);
        set(5, ticketStage);
        set(6, incidentId);
        set(7, ticketHistoryDetails);
        set(8, closedTimestamp);
        set(9, closureRemark);
        set(10, isActive);
        set(11, createdTimestamp);
        set(12, lastUpdatedTimestamp);
        set(13, createdBy);
        set(14, lastUpdatedBy);
        set(15, feedback);
    }
}