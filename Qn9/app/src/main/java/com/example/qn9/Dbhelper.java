package com.example.qn9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "Studentdb";
    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "Student";
    private static final String COL_ID  = "ID";
    private static final String COL_NAME  = "Name";

    public Dbhelper(Context context)
    {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" ( "+COL_ID+" INTEGER PRIMARY KEY,"+COL_NAME+" TEXT NOT NULL)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertStudent(int id, String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ID",id);
        cv.put("Name",name);
        long result = db.insert("Student",null,cv);
        db.close();
        if(result!=-1)
        {
            return true;
        }
        return false;
    }
    public boolean updateStudent(int id, String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Name", name);
        int result = db.update("Student", cv, "ID = ?", new String[]{String.valueOf(id)});
        db.close();
        if(result>0)
        {
            return true;
        }
        return false;
    }

    public boolean deleteStudent(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int result = db.delete("Student", "ID = ?", new String[]{String.valueOf(id)});
        db.close();
        return result > 0;
    }

    public String readData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Student", null);

        if (cursor.getCount() == 0) {
            return "No Data";
        }

        StringBuilder sb = new StringBuilder();
        while (cursor.moveToNext()) {
            sb.append(cursor.getInt(0)).append(", ").append(cursor.getString(1)).append("\n");
        }
        cursor.close();
        db.close();
        return sb.toString();
    }

}
