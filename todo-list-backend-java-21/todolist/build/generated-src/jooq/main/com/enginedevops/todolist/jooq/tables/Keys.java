/*
 * This file is generated by jOOQ.
 */
package com.enginedevops.todolist.jooq.tables;


import com.enginedevops.todolist.jooq.tables.tables.FlywaySchemaHistory;
import com.enginedevops.todolist.jooq.tables.tables.Todolist;
import com.enginedevops.todolist.jooq.tables.tables.records.FlywaySchemaHistoryRecord;
import com.enginedevops.todolist.jooq.tables.tables.records.TodolistRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, DSL.name("flyway_schema_history_pk"), new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
    public static final UniqueKey<TodolistRecord> TODOLIST_PKEY = Internal.createUniqueKey(Todolist.TODOLIST, DSL.name("todolist_pkey"), new TableField[] { Todolist.TODOLIST.ID }, true);
}