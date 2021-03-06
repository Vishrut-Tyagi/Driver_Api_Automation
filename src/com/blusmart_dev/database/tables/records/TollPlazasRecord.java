/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.records;


import com.blusmart_dev.database.tables.TollPlazas;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TollPlazasRecord extends TableRecordImpl<TollPlazasRecord> implements Record13<Integer, Integer, String, Integer, Long, Long, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 2068346866;

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.id</code>.
     */
    public TollPlazasRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.plaza_id</code>.
     */
    public TollPlazasRecord setPlazaId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.plaza_id</code>.
     */
    public Integer getPlazaId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.plaza_name</code>.
     */
    public TollPlazasRecord setPlazaName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.plaza_name</code>.
     */
    public String getPlazaName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.is_active</code>.
     */
    public TollPlazasRecord setIsActive(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.is_active</code>.
     */
    public Integer getIsActive() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.created_timestamp</code>.
     */
    public TollPlazasRecord setCreatedTimestamp(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.created_timestamp</code>.
     */
    public Long getCreatedTimestamp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.last_updated_timestamp</code>.
     */
    public TollPlazasRecord setLastUpdatedTimestamp(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.last_updated_timestamp</code>.
     */
    public Long getLastUpdatedTimestamp() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.created_by</code>.
     */
    public TollPlazasRecord setCreatedBy(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.created_by</code>.
     */
    public Integer getCreatedBy() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.last_updated_by</code>.
     */
    public TollPlazasRecord setLastUpdatedBy(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.last_updated_by</code>.
     */
    public Integer getLastUpdatedBy() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.plaza_type</code>.
     */
    public TollPlazasRecord setPlazaType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.plaza_type</code>.
     */
    public String getPlazaType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.type</code>.
     */
    public TollPlazasRecord setType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.type</code>.
     */
    public String getType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.city</code>.
     */
    public TollPlazasRecord setCity(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.city</code>.
     */
    public String getCity() {
        return (String) get(10);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.plaza_state</code>.
     */
    public TollPlazasRecord setPlazaState(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.plaza_state</code>.
     */
    public String getPlazaState() {
        return (String) get(11);
    }

    /**
     * Setter for <code>blusmartDevDb.toll_plazas.concessionaire</code>.
     */
    public TollPlazasRecord setConcessionaire(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>blusmartDevDb.toll_plazas.concessionaire</code>.
     */
    public String getConcessionaire() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, String, Integer, Long, Long, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, Integer, String, Integer, Long, Long, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TollPlazas.TOLL_PLAZAS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return TollPlazas.TOLL_PLAZAS.PLAZA_ID;
    }

    @Override
    public Field<String> field3() {
        return TollPlazas.TOLL_PLAZAS.PLAZA_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return TollPlazas.TOLL_PLAZAS.IS_ACTIVE;
    }

    @Override
    public Field<Long> field5() {
        return TollPlazas.TOLL_PLAZAS.CREATED_TIMESTAMP;
    }

    @Override
    public Field<Long> field6() {
        return TollPlazas.TOLL_PLAZAS.LAST_UPDATED_TIMESTAMP;
    }

    @Override
    public Field<Integer> field7() {
        return TollPlazas.TOLL_PLAZAS.CREATED_BY;
    }

    @Override
    public Field<Integer> field8() {
        return TollPlazas.TOLL_PLAZAS.LAST_UPDATED_BY;
    }

    @Override
    public Field<String> field9() {
        return TollPlazas.TOLL_PLAZAS.PLAZA_TYPE;
    }

    @Override
    public Field<String> field10() {
        return TollPlazas.TOLL_PLAZAS.TYPE;
    }

    @Override
    public Field<String> field11() {
        return TollPlazas.TOLL_PLAZAS.CITY;
    }

    @Override
    public Field<String> field12() {
        return TollPlazas.TOLL_PLAZAS.PLAZA_STATE;
    }

    @Override
    public Field<String> field13() {
        return TollPlazas.TOLL_PLAZAS.CONCESSIONAIRE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPlazaId();
    }

    @Override
    public String component3() {
        return getPlazaName();
    }

    @Override
    public Integer component4() {
        return getIsActive();
    }

    @Override
    public Long component5() {
        return getCreatedTimestamp();
    }

    @Override
    public Long component6() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public Integer component7() {
        return getCreatedBy();
    }

    @Override
    public Integer component8() {
        return getLastUpdatedBy();
    }

    @Override
    public String component9() {
        return getPlazaType();
    }

    @Override
    public String component10() {
        return getType();
    }

    @Override
    public String component11() {
        return getCity();
    }

    @Override
    public String component12() {
        return getPlazaState();
    }

    @Override
    public String component13() {
        return getConcessionaire();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPlazaId();
    }

    @Override
    public String value3() {
        return getPlazaName();
    }

    @Override
    public Integer value4() {
        return getIsActive();
    }

    @Override
    public Long value5() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value6() {
        return getLastUpdatedTimestamp();
    }

    @Override
    public Integer value7() {
        return getCreatedBy();
    }

    @Override
    public Integer value8() {
        return getLastUpdatedBy();
    }

    @Override
    public String value9() {
        return getPlazaType();
    }

    @Override
    public String value10() {
        return getType();
    }

    @Override
    public String value11() {
        return getCity();
    }

    @Override
    public String value12() {
        return getPlazaState();
    }

    @Override
    public String value13() {
        return getConcessionaire();
    }

    @Override
    public TollPlazasRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TollPlazasRecord value2(Integer value) {
        setPlazaId(value);
        return this;
    }

    @Override
    public TollPlazasRecord value3(String value) {
        setPlazaName(value);
        return this;
    }

    @Override
    public TollPlazasRecord value4(Integer value) {
        setIsActive(value);
        return this;
    }

    @Override
    public TollPlazasRecord value5(Long value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public TollPlazasRecord value6(Long value) {
        setLastUpdatedTimestamp(value);
        return this;
    }

    @Override
    public TollPlazasRecord value7(Integer value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TollPlazasRecord value8(Integer value) {
        setLastUpdatedBy(value);
        return this;
    }

    @Override
    public TollPlazasRecord value9(String value) {
        setPlazaType(value);
        return this;
    }

    @Override
    public TollPlazasRecord value10(String value) {
        setType(value);
        return this;
    }

    @Override
    public TollPlazasRecord value11(String value) {
        setCity(value);
        return this;
    }

    @Override
    public TollPlazasRecord value12(String value) {
        setPlazaState(value);
        return this;
    }

    @Override
    public TollPlazasRecord value13(String value) {
        setConcessionaire(value);
        return this;
    }

    @Override
    public TollPlazasRecord values(Integer value1, Integer value2, String value3, Integer value4, Long value5, Long value6, Integer value7, Integer value8, String value9, String value10, String value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TollPlazasRecord
     */
    public TollPlazasRecord() {
        super(TollPlazas.TOLL_PLAZAS);
    }

    /**
     * Create a detached, initialised TollPlazasRecord
     */
    public TollPlazasRecord(Integer id, Integer plazaId, String plazaName, Integer isActive, Long createdTimestamp, Long lastUpdatedTimestamp, Integer createdBy, Integer lastUpdatedBy, String plazaType, String type, String city, String plazaState, String concessionaire) {
        super(TollPlazas.TOLL_PLAZAS);

        set(0, id);
        set(1, plazaId);
        set(2, plazaName);
        set(3, isActive);
        set(4, createdTimestamp);
        set(5, lastUpdatedTimestamp);
        set(6, createdBy);
        set(7, lastUpdatedBy);
        set(8, plazaType);
        set(9, type);
        set(10, city);
        set(11, plazaState);
        set(12, concessionaire);
    }
}
