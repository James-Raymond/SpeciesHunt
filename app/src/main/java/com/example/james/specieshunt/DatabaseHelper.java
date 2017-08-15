package com.example.james.specieshunt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by James on 15/08/2017.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME= "MarineSpecies.db";
    public static final String TABLE_NAME = "marine_table";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3= "LENGTH";
    public static final String COL_4= "FISHPOINTS";
    public static final String COL_5= "BONUS";
    public static final String COL_6= "TOTAL";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ "marine_table" +"(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, LENGTH INTEGER, FISHPOINTS INTEGER, BONUS INTEGER, TOTAL INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
        onCreate(db);

    }
}
