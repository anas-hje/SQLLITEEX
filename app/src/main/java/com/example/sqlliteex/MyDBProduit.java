package com.example.sqlliteex;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MyDBProduit extends SQLiteOpenHelper {
    public static String DB_NAME = "DBProduit.db";
    public static String TABLE_NAME = "PRODUIT";
    public static String COL1 = "ID";
    public static String COL2 = "LIBELLE";
    public static String COL3 = "FAMILLE";
    public static String COL4 = "PRIXACHAT";
    public static String COL5 = "PRIXVENTE";

    public MyDBProduit(Context c) {
        super(c,DB_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE " + TABLE_NAME + "(" + COL1 + " integer primary key autoincrement," + COL2 + " text," + COL3 + " text," + COL4 + " double," + COL5 + " double)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE "+TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
    public static int insert_produit(SQLiteDatabase sqLiteDatabase, PRODUIT p){
        return 0;
    }

    public static int update_produit(SQLiteDatabase sqLiteDatabase, PRODUIT p){
        return 0;
    }

    public static int delete_produit(SQLiteDatabase sqLiteDatabase, int id){
        return 0;
    }

    public static ArrayList<PRODUIT> getAllProds(SQLiteDatabase sqLiteDatabase){
        return null;
    }

    public static PRODUIT getOneProd(SQLiteDatabase sqLiteDatabase, int id){
        return null;
    }
}
