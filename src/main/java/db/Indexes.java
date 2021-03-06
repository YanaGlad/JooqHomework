/*
 * This file is generated by jOOQ.
 */
package db;


import db.tables.FlywaySchemaHistory;
import db.tables.Invoice;
import db.tables.Nomenclature;
import db.tables.Organization;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FLYWAY_SCHEMA_HISTORY_PK = Indexes0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final Index FLYWAY_SCHEMA_HISTORY_S_IDX = Indexes0.FLYWAY_SCHEMA_HISTORY_S_IDX;
    public static final Index INV_ID_PK = Indexes0.INV_ID_PK;
    public static final Index NOMENCLATURE_PKEY = Indexes0.NOMENCLATURE_PKEY;
    public static final Index NAME_PK = Indexes0.NAME_PK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index FLYWAY_SCHEMA_HISTORY_PK = Internal.createIndex("flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static Index FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex("flyway_schema_history_s_idx", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
        public static Index INV_ID_PK = Internal.createIndex("inv_id_pk", Invoice.INVOICE, new OrderField[] { Invoice.INVOICE.ID }, true);
        public static Index NOMENCLATURE_PKEY = Internal.createIndex("Nomenclature_pkey", Nomenclature.NOMENCLATURE, new OrderField[] { Nomenclature.NOMENCLATURE.NAME }, true);
        public static Index NAME_PK = Internal.createIndex("name_pk", Organization.ORGANIZATION, new OrderField[] { Organization.ORGANIZATION.NAME }, true);
    }
}
