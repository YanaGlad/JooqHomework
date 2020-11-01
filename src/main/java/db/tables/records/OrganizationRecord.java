/*
 * This file is generated by jOOQ.
 */
package db.tables.records;


import db.tables.Organization;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationRecord extends UpdatableRecordImpl<OrganizationRecord> implements Record3<String, Integer, Long> {

    private static final long serialVersionUID = -167135643;

    /**
     * Setter for <code>public.Organization.name</code>.
     */
    public OrganizationRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.Organization.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.Organization.inn</code>.
     */
    public OrganizationRecord setInn(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.Organization.inn</code>.
     */
    public Integer getInn() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.Organization.payment_account</code>.
     */
    public OrganizationRecord setPaymentAccount(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.Organization.payment_account</code>.
     */
    public Long getPaymentAccount() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Organization.ORGANIZATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Organization.ORGANIZATION.INN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Organization.ORGANIZATION.PAYMENT_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getInn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getPaymentAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getInn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getPaymentAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationRecord value2(Integer value) {
        setInn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationRecord value3(Long value) {
        setPaymentAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizationRecord values(String value1, Integer value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizationRecord
     */
    public OrganizationRecord() {
        super(Organization.ORGANIZATION);
    }

    /**
     * Create a detached, initialised OrganizationRecord
     */
    public OrganizationRecord(String name, Integer inn, Long paymentAccount) {
        super(Organization.ORGANIZATION);

        set(0, name);
        set(1, inn);
        set(2, paymentAccount);
    }
}
