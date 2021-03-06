/*
 * This file is generated by jOOQ.
 */
package db.tables.records;


import db.tables.Nomenclature;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class NomenclatureRecord extends UpdatableRecordImpl<NomenclatureRecord> implements Record2<String, Integer> {

    private static final long serialVersionUID = 1042438292;

    /**
     * Setter for <code>public.Nomenclature.name</code>.
     */
    public NomenclatureRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.Nomenclature.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.Nomenclature.inside_code</code>.
     */
    public NomenclatureRecord setInsideCode(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.Nomenclature.inside_code</code>.
     */
    public Integer getInsideCode() {
        return (Integer) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Nomenclature.NOMENCLATURE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Nomenclature.NOMENCLATURE.INSIDE_CODE;
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
        return getInsideCode();
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
        return getInsideCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclatureRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclatureRecord value2(Integer value) {
        setInsideCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclatureRecord values(String value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NomenclatureRecord
     */
    public NomenclatureRecord() {
        super(Nomenclature.NOMENCLATURE);
    }

    /**
     * Create a detached, initialised NomenclatureRecord
     */
    public NomenclatureRecord(String name, Integer insideCode) {
        super(Nomenclature.NOMENCLATURE);

        set(0, name);
        set(1, insideCode);
    }
}
