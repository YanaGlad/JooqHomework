/*
 * This file is generated by jOOQ.
 */
package db;


import db.tables.FlywaySchemaHistory;
import db.tables.Invoice;
import db.tables.Invoicepositions;
import db.tables.Nomenclature;
import db.tables.Organization;
import db.tables.records.FlywaySchemaHistoryRecord;
import db.tables.records.InvoiceRecord;
import db.tables.records.InvoicepositionsRecord;
import db.tables.records.NomenclatureRecord;
import db.tables.records.OrganizationRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<InvoiceRecord> INV_ID_PK = UniqueKeys0.INV_ID_PK;
    public static final UniqueKey<NomenclatureRecord> NOMENCLATURE_PKEY = UniqueKeys0.NOMENCLATURE_PKEY;
    public static final UniqueKey<OrganizationRecord> NAME_PK = UniqueKeys0.NAME_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<InvoiceRecord, OrganizationRecord> INVOICE__ORG_FK = ForeignKeys0.INVOICE__ORG_FK;
    public static final ForeignKey<InvoicepositionsRecord, NomenclatureRecord> INVOICEPOSITIONS__NOMENCL_FK = ForeignKeys0.INVOICEPOSITIONS__NOMENCL_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<InvoiceRecord> INV_ID_PK = Internal.createUniqueKey(Invoice.INVOICE, "inv_id_pk", Invoice.INVOICE.ID);
        public static final UniqueKey<NomenclatureRecord> NOMENCLATURE_PKEY = Internal.createUniqueKey(Nomenclature.NOMENCLATURE, "Nomenclature_pkey", Nomenclature.NOMENCLATURE.NAME);
        public static final UniqueKey<OrganizationRecord> NAME_PK = Internal.createUniqueKey(Organization.ORGANIZATION, "name_pk", Organization.ORGANIZATION.NAME);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<InvoiceRecord, OrganizationRecord> INVOICE__ORG_FK = Internal.createForeignKey(db.Keys.NAME_PK, Invoice.INVOICE, "Invoice__org_fk", Invoice.INVOICE.ORGANIZATION_NAME);
        public static final ForeignKey<InvoicepositionsRecord, NomenclatureRecord> INVOICEPOSITIONS__NOMENCL_FK = Internal.createForeignKey(db.Keys.NOMENCLATURE_PKEY, Invoicepositions.INVOICEPOSITIONS, "InvoicePositions__nomencl_fk", Invoicepositions.INVOICEPOSITIONS.NOMENCLATURE_NAME);
    }
}
