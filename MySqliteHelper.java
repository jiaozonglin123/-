package com.example.abner.myapplication6;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MySqliteHelper extends SQLiteOpenHelper {


    public MySqliteHelper(Context context) {
        super(context, "userdb.db", null, 3);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub

        db.execSQL("create table users(id integer primary key ,name text,pwd text)");

        String sql = "insert into users values (0,0,0)"; //id 自增加
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }

}