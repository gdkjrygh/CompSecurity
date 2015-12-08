// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.checkin.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class CheckinDatabase extends SQLiteOpenHelper
{

    public static final String COLUMN_ADDRESS = "checkin_address";
    public static final String COLUMN_DATE_TIME = "checkin_date_time";
    public static final String COLUMN_ICON_CODE = "checkin_icon";
    public static final String COLUMN_ID = "checkin_id";
    public static final String COLUMN_IMAGE = "checkin_image";
    public static final String COLUMN_LATITUDE = "checkin_latitude";
    public static final String COLUMN_LOCATION_NAME = "checkin_presentation";
    public static final String COLUMN_LONGITUDE = "checkin_longitude";
    public static final String COLUMN_TEMPERATURE_CELSIUS = "checkin_temperature_celsius";
    public static final String COLUMN_TEMPERATURE_FAHRENHEIT = "checkin_temperature_fahrenheit";
    static final String DATABASE_NAME = "checkin.db";
    private static final int DATABASE_VERSION = 3;
    public static final String TABLE_NAME = "checkins";
    private final Context context;

    CheckinDatabase(Context context1)
    {
        super(context1, "checkin.db", null, 3);
        context = context1;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE checkins (_id INTEGER PRIMARY KEY AUTOINCREMENT,checkin_id TEXT NOT NULL,checkin_icon INTEGER NOT NULL,checkin_latitude REAL NOT NULL,checkin_longitude REAL NOT NULL,checkin_temperature_fahrenheit INTEGER,checkin_temperature_celsius INTEGER,checkin_address TEXT NOT NULL,checkin_presentation TEXT NOT NULL,checkin_date_time INTEGER NOT NULL,checkin_image String,UNIQUE (checkin_id) ON CONFLICT REPLACE)");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        context.deleteDatabase("checkin.db");
    }
}
