/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.PaytmPreauthAccessTokenAudit;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaytmPreauthAccessTokenAuditRecord extends UpdatableRecordImpl<PaytmPreauthAccessTokenAuditRecord> implements Record15<Integer, Integer, UInteger, String, String, Integer, String, String, String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = 759452865;

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.id</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.paytm_preauth_access_token_id</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setPaytmPreauthAccessTokenId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.paytm_preauth_access_token_id</code>.
     */
    public Integer getPaytmPreauthAccessTokenId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.rider_id</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setRiderId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.rider_id</code>.
     */
    public UInteger getRiderId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.mobile_number</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setMobileNumber(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.mobile_number</code>.
     */
    public String getMobileNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.status</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.status_code</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setStatusCode(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.status_code</code>.
     */
    public Integer getStatusCode() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.message</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setMessage(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.message</code>.
     */
    public String getMessage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.response</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setResponse(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.response</code>.
     */
    public String getResponse() {
        return (String) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.state</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setState(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.state</code>.
     */
    public String getState() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.access_token</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setAccessToken(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.access_token</code>.
     */
    public String getAccessToken() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.access_token_expires</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setAccessTokenExpires(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.access_token_expires</code>.
     */
    public String getAccessTokenExpires() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.paytm_pre_auth_state</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setPaytmPreAuthState(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.paytm_pre_auth_state</code>.
     */
    public String getPaytmPreAuthState() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.api_request_json</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setApiRequestJson(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.api_request_json</code>.
     */
    public String getApiRequestJson() {
        return (String) get(12);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.api_response_json</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setApiResponseJson(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.api_response_json</code>.
     */
    public String getApiResponseJson() {
        return (String) get(13);
    }

    /**
     * Setter for <code>blusmartDevDb.paytm_preauth_access_token_audit.created_timestamp</code>.
     */
    public PaytmPreauthAccessTokenAuditRecord setCreatedTimestamp(Long value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.paytm_preauth_access_token_audit.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, UInteger, String, String, Integer, String, String, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, Integer, UInteger, String, String, Integer, String, String, String, String, String, String, String, String, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.ID;
    }

    @Override
    public Field<Integer> field2() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.PAYTM_PREAUTH_ACCESS_TOKEN_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.RIDER_ID;
    }

    @Override
    public Field<String> field4() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.MOBILE_NUMBER;
    }

    @Override
    public Field<String> field5() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.STATUS;
    }

    @Override
    public Field<Integer> field6() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.STATUS_CODE;
    }

    @Override
    public Field<String> field7() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.MESSAGE;
    }

    @Override
    public Field<String> field8() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.RESPONSE;
    }

    @Override
    public Field<String> field9() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.STATE;
    }

    @Override
    public Field<String> field10() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.ACCESS_TOKEN;
    }

    @Override
    public Field<String> field11() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.ACCESS_TOKEN_EXPIRES;
    }

    @Override
    public Field<String> field12() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.PAYTM_PRE_AUTH_STATE;
    }

    @Override
    public Field<String> field13() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.API_REQUEST_JSON;
    }

    @Override
    public Field<String> field14() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.API_RESPONSE_JSON;
    }

    @Override
    public Field<Long> field15() {
        return PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT.CREATED_TIMESTAMP;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPaytmPreauthAccessTokenId();
    }

    @Override
    public UInteger component3() {
        return getRiderId();
    }

    @Override
    public String component4() {
        return getMobileNumber();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public Integer component6() {
        return getStatusCode();
    }

    @Override
    public String component7() {
        return getMessage();
    }

    @Override
    public String component8() {
        return getResponse();
    }

    @Override
    public String component9() {
        return getState();
    }

    @Override
    public String component10() {
        return getAccessToken();
    }

    @Override
    public String component11() {
        return getAccessTokenExpires();
    }

    @Override
    public String component12() {
        return getPaytmPreAuthState();
    }

    @Override
    public String component13() {
        return getApiRequestJson();
    }

    @Override
    public String component14() {
        return getApiResponseJson();
    }

    @Override
    public Long component15() {
        return getCreatedTimestamp();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPaytmPreauthAccessTokenId();
    }

    @Override
    public UInteger value3() {
        return getRiderId();
    }

    @Override
    public String value4() {
        return getMobileNumber();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public Integer value6() {
        return getStatusCode();
    }

    @Override
    public String value7() {
        return getMessage();
    }

    @Override
    public String value8() {
        return getResponse();
    }

    @Override
    public String value9() {
        return getState();
    }

    @Override
    public String value10() {
        return getAccessToken();
    }

    @Override
    public String value11() {
        return getAccessTokenExpires();
    }

    @Override
    public String value12() {
        return getPaytmPreAuthState();
    }

    @Override
    public String value13() {
        return getApiRequestJson();
    }

    @Override
    public String value14() {
        return getApiResponseJson();
    }

    @Override
    public Long value15() {
        return getCreatedTimestamp();
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value2(Integer value) {
        setPaytmPreauthAccessTokenId(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value3(UInteger value) {
        setRiderId(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value4(String value) {
        setMobileNumber(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value6(Integer value) {
        setStatusCode(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value7(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value8(String value) {
        setResponse(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value9(String value) {
        setState(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value10(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value11(String value) {
        setAccessTokenExpires(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value12(String value) {
        setPaytmPreAuthState(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value13(String value) {
        setApiRequestJson(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value14(String value) {
        setApiResponseJson(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord value15(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public PaytmPreauthAccessTokenAuditRecord values(Integer value1, Integer value2, UInteger value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Long value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaytmPreauthAccessTokenAuditRecord
     */
    public PaytmPreauthAccessTokenAuditRecord() {
        super(PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT);
    }

    /**
     * Create a detached, initialised PaytmPreauthAccessTokenAuditRecord
     */
    public PaytmPreauthAccessTokenAuditRecord(Integer id, Integer paytmPreauthAccessTokenId, UInteger riderId, String mobileNumber, String status, Integer statusCode, String message, String response, String state, String accessToken, String accessTokenExpires, String paytmPreAuthState, String apiRequestJson, String apiResponseJson, Long createdTimestamp) {
        super(PaytmPreauthAccessTokenAudit.PAYTM_PREAUTH_ACCESS_TOKEN_AUDIT);

        set(0, id);
        set(1, paytmPreauthAccessTokenId);
        set(2, riderId);
        set(3, mobileNumber);
        set(4, status);
        set(5, statusCode);
        set(6, message);
        set(7, response);
        set(8, state);
        set(9, accessToken);
        set(10, accessTokenExpires);
        set(11, paytmPreAuthState);
        set(12, apiRequestJson);
        set(13, apiResponseJson);
        set(14, createdTimestamp);
    }
}