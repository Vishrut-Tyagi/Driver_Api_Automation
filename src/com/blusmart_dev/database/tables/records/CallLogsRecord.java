/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.CallLogs;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CallLogsRecord extends UpdatableRecordImpl<CallLogsRecord> {

    private static final long serialVersionUID = 247957070;

    /**
     * Setter for <code>blusmartDevDb.call_logs.id</code>.
     */
    public CallLogsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.sid</code>.
     */
    public CallLogsRecord setSid(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.sid</code>.
     */
    public String getSid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.to</code>.
     */
    public CallLogsRecord setTo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.to</code>.
     */
    public String getTo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.from</code>.
     */
    public CallLogsRecord setFrom(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.from</code>.
     */
    public String getFrom() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.phone_number_sid</code>.
     */
    public CallLogsRecord setPhoneNumberSid(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.phone_number_sid</code>.
     */
    public String getPhoneNumberSid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.duration</code>.
     */
    public CallLogsRecord setDuration(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.duration</code>.
     */
    public String getDuration() {
        return (String) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.price</code>.
     */
    public CallLogsRecord setPrice(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.price</code>.
     */
    public String getPrice() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.direction</code>.
     */
    public CallLogsRecord setDirection(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.direction</code>.
     */
    public String getDirection() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.uri</code>.
     */
    public CallLogsRecord setUri(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.uri</code>.
     */
    public String getUri() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.created_by</code>.
     */
    public CallLogsRecord setCreatedBy(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.last_updated_by</code>.
     */
    public CallLogsRecord setLastUpdatedBy(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.last_updated_by</code>.
     */
    public Integer getLastUpdatedBy() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.note</code>.
     */
    public CallLogsRecord setNote(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.note</code>.
     */
    public String getNote() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.answer_by</code>.
     */
    public CallLogsRecord setAnswerBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.answer_by</code>.
     */
    public String getAnswerBy() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.record</code>.
     */
    public CallLogsRecord setRecord(Byte value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.record</code>.
     */
    public Byte getRecord() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.is_active</code>.
     */
    public CallLogsRecord setIsActive(Byte value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.is_active</code>.
     */
    public Byte getIsActive() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.created_at</code>.
     */
    public CallLogsRecord setCreatedAt(Long value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.created_at</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.last_updated_at</code>.
     */
    public CallLogsRecord setLastUpdatedAt(Long value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.last_updated_at</code>.
     */
    public Long getLastUpdatedAt() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.start_time</code>.
     */
    public CallLogsRecord setStartTime(Long value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.start_time</code>.
     */
    public Long getStartTime() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.end_time</code>.
     */
    public CallLogsRecord setEndTime(Long value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.end_time</code>.
     */
    public Long getEndTime() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.status</code>.
     */
    public CallLogsRecord setStatus(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.status</code>.
     */
    public String getStatus() {
        return (String) get(19);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.call_type</code>.
     */
    public CallLogsRecord setCallType(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.call_type</code>.
     */
    public String getCallType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.recording_url</code>.
     */
    public CallLogsRecord setRecordingUrl(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.recording_url</code>.
     */
    public String getRecordingUrl() {
        return (String) get(21);
    }

    /**
     * Setter for <code>blusmartDevDb.call_logs.ride_id</code>.
     */
    public CallLogsRecord setRideId(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.call_logs.ride_id</code>.
     */
    public Integer getRideId() {
        return (Integer) get(22);
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
     * Create a detached CallLogsRecord
     */
    public CallLogsRecord() {
        super(CallLogs.CALL_LOGS);
    }

    /**
     * Create a detached, initialised CallLogsRecord
     */
    public CallLogsRecord(Integer id, String sid, String to, String from, String phoneNumberSid, String duration, String price, String direction, String uri, Integer createdBy, Integer lastUpdatedBy, String note, String answerBy, Byte record, Byte isActive, Long createdAt, Long lastUpdatedAt, Long startTime, Long endTime, String status, String callType, String recordingUrl, Integer rideId) {
        super(CallLogs.CALL_LOGS);

        set(0, id);
        set(1, sid);
        set(2, to);
        set(3, from);
        set(4, phoneNumberSid);
        set(5, duration);
        set(6, price);
        set(7, direction);
        set(8, uri);
        set(9, createdBy);
        set(10, lastUpdatedBy);
        set(11, note);
        set(12, answerBy);
        set(13, record);
        set(14, isActive);
        set(15, createdAt);
        set(16, lastUpdatedAt);
        set(17, startTime);
        set(18, endTime);
        set(19, status);
        set(20, callType);
        set(21, recordingUrl);
        set(22, rideId);
    }
}