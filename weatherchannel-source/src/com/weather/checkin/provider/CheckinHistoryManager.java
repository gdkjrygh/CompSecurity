// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.checkin.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.io.File;

// Referenced classes of package com.weather.checkin.provider:
//            CheckinHistoryRecord, CheckinProvider

public class CheckinHistoryManager
{

    static final String PROJECTION[] = {
        "_id", "checkin_id", "checkin_latitude", "checkin_longitude", "checkin_icon", "checkin_temperature_fahrenheit", "checkin_temperature_celsius", "checkin_address", "checkin_presentation", "checkin_date_time", 
        "checkin_image"
    };
    private static final String TAG = "CheckinHistoryManager";
    private final ContentResolver contentResolver;

    public CheckinHistoryManager(ContentResolver contentresolver)
    {
        contentResolver = (ContentResolver)Preconditions.checkNotNull(contentresolver);
    }

    static ContentValues convertRecordToValues(CheckinHistoryRecord checkinhistoryrecord)
    {
        Preconditions.checkNotNull(checkinhistoryrecord);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("checkin_id", checkinhistoryrecord.getId());
        contentvalues.put("checkin_icon", Byte.valueOf(checkinhistoryrecord.getUserIconCode()));
        contentvalues.put("checkin_latitude", Double.valueOf(checkinhistoryrecord.getLatitude()));
        contentvalues.put("checkin_longitude", Double.valueOf(checkinhistoryrecord.getLongitude()));
        contentvalues.put("checkin_temperature_fahrenheit", checkinhistoryrecord.getTemperatureFahrenheit());
        contentvalues.put("checkin_temperature_celsius", checkinhistoryrecord.getTemperatureCelsius());
        contentvalues.put("checkin_address", "");
        contentvalues.put("checkin_presentation", checkinhistoryrecord.getLocationName());
        contentvalues.put("checkin_date_time", Long.valueOf(checkinhistoryrecord.getTimestamp()));
        contentvalues.put("checkin_image", checkinhistoryrecord.getImagePath());
        return contentvalues;
    }

    public static CheckinHistoryRecord extractRecord(Cursor cursor)
    {
        String s = (String)Preconditions.checkNotNull(cursor.getString(cursor.getColumnIndex("checkin_id")));
        double d = cursor.getDouble(cursor.getColumnIndex("checkin_latitude"));
        double d1 = cursor.getDouble(cursor.getColumnIndex("checkin_longitude"));
        byte byte0 = (byte)cursor.getInt(cursor.getColumnIndex("checkin_icon"));
        Integer integer = getNullableInt(cursor, cursor.getColumnIndex("checkin_temperature_fahrenheit"));
        Integer integer1 = getNullableInt(cursor, cursor.getColumnIndex("checkin_temperature_celsius"));
        return new CheckinHistoryRecord(s, byte0, d, d1, (String)Preconditions.checkNotNull(cursor.getString(cursor.getColumnIndex("checkin_presentation"))), integer, integer1, cursor.getLong(cursor.getColumnIndex("checkin_date_time")), getNullableString(cursor, cursor.getColumnIndex("checkin_image")));
    }

    private static Integer getNullableInt(Cursor cursor, int i)
    {
        if (cursor.isNull(i))
        {
            return null;
        } else
        {
            return Integer.valueOf(cursor.getInt(i));
        }
    }

    private static String getNullableString(Cursor cursor, int i)
    {
        if (cursor.isNull(i))
        {
            return null;
        } else
        {
            return cursor.getString(i);
        }
    }

    public void addImageToCheckin(String s, String s1)
    {
        ContentValues contentvalues = new ContentValues(1);
        contentvalues.put("checkin_image", s1);
        contentResolver.update(CheckinProvider.CONTENT_URI.buildUpon().appendPath(s).build(), contentvalues, null, null);
    }

    public void deleteCheckin(String s, String s1)
    {
        if (s1 != null)
        {
            File file = new File(s1);
            if (!file.delete() && file.exists())
            {
                Log.e("CheckinHistoryManager", (new StringBuilder()).append("Unable to delete checkin image.  path=").append(s1).toString());
            }
        }
        contentResolver.delete(CheckinProvider.CONTENT_URI.buildUpon().appendPath(s).build(), null, null);
    }

    public void insertCheckin(CheckinHistoryRecord checkinhistoryrecord)
    {
        checkinhistoryrecord = convertRecordToValues((CheckinHistoryRecord)Preconditions.checkNotNull(checkinhistoryrecord));
        contentResolver.insert(CheckinProvider.CONTENT_URI, checkinhistoryrecord);
    }

    public Cursor queryAllCheckins()
    {
        return contentResolver.query(CheckinProvider.CONTENT_URI, PROJECTION, null, null, "checkin_date_time DESC");
    }

}
