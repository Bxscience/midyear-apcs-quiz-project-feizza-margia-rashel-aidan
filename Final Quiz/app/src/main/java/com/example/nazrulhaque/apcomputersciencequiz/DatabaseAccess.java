package com.example.nazrulhaque.apcomputersciencequiz;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c = null;

    //private constructor so that object creation outside the class is avoided
    private DatabaseAccess(Context context){
        this.openHelper = new DatabaseOpenHelper(context);

    }

    //to return the single instance of the class
    public static DatabaseAccess getInstance(Context context){
        if(instance==null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    //to open the database
    public void open(){
        this.db =openHelper.getWritableDatabase();
    }

    //to close the database connection
    public void close(){
        if(db!=null){
            this.db.close();
        }
    }


    public String getValue(String name){

        String q ="SELECT Answer FROM Quiz WHERE Question ='"+name+"'";
        //String q ="SELECT Answer FROM Questions WHERE Name ='AB_1.png'";
        c=db.rawQuery(q ,new String[]{});

        StringBuffer buffer = new StringBuffer();
        while (c.moveToNext()){
            String val = c.getString(0);
            buffer.append(""+val);
        }
        return buffer.toString();
    }
}
