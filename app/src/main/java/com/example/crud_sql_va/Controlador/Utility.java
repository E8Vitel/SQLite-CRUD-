package com.example.crud_sql_va.Controlador;

public class Utility {
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_CORREO="correo";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE " +""+ TABLA_USUARIO+" ("+
            CAMPO_ID+" " + "INTEGER," +
            CAMPO_NOMBRE+"TEXT, " +
            CAMPO_CORREO+"TEXT)";
}
