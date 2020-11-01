/*
 * This file is generated by jOOQ.
 */
package db;


import db.tables.FlywaySchemaHistory;
import db.tables.Invoice;
import db.tables.Invoicepositions;
import db.tables.Nomenclature;
import db.tables.Organization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1453129945;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = db.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.Invoice</code>.
     */
    public final Invoice INVOICE = db.tables.Invoice.INVOICE;

    /**
     * The table <code>public.InvoicePositions</code>.
     */
    public final Invoicepositions INVOICEPOSITIONS = db.tables.Invoicepositions.INVOICEPOSITIONS;

    /**
     * The table <code>public.Nomenclature</code>.
     */
    public final Nomenclature NOMENCLATURE = db.tables.Nomenclature.NOMENCLATURE;

    /**
     * The table <code>public.Organization</code>.
     */
    public final Organization ORGANIZATION = db.tables.Organization.ORGANIZATION;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Invoice.INVOICE,
            Invoicepositions.INVOICEPOSITIONS,
            Nomenclature.NOMENCLATURE,
            Organization.ORGANIZATION);
    }
}
