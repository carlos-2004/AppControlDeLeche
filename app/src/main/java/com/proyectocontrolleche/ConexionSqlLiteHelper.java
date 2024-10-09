package com.proyectocontrolleche;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSqlLiteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NOMBRE = "datos.db";
    private static final String TABLA_LECHE = "tLeche";

    public ConexionSqlLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLA_LECHE + "(" +
                "id INTEGER PRIMARY KEY," +
                "nombreCompletoProductor TEXT NOT NULL," +
                "telefono TEXT NOT NULL," +
                "direccion TEXT NOT NULL," +
                "email TEXT NOT NULL," +
                "password TEXT NOT NULL," +
                "mes TEXT NOT NULL," +
                "dia REAL NOT NULL," +
                "ano TEXT NOT NULL," +
                "cantidadLechelitrosManana REAL NOT NULL," +
                "cantidadLechelitrosTarde REAL NOT NULL," +
                "cantidadLechelitrosTotal REAL NOT NULL" +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLA_LECHE);
        onCreate(db);
    }
}
