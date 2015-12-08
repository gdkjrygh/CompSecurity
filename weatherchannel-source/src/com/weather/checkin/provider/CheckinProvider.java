// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.checkin.provider;

import android.net.Uri;
import com.google.common.collect.ImmutableMap;
import com.weather.util.DatabaseContentProvider;
import java.util.Map;

// Referenced classes of package com.weather.checkin.provider:
//            CheckinHistoryManager, CheckinDatabase

public class CheckinProvider extends DatabaseContentProvider
{

    static final String AUTHORITY = "com.weather.weather.provider.checkin";
    static final Uri BASE_CONTENT_URI;
    static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.weather.checkin";
    static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.weather.checkin";
    static final Uri CONTENT_URI;
    private static final String PATH_CHECKINS = "checkins";
    private static final Map PROJECTION_MAP;

    public CheckinProvider()
    {
        super("checkins", "com.weather.weather.provider.checkin", "vnd.android.cursor.dir/vnd.weather.checkin", "vnd.android.cursor.item/vnd.weather.checkin", "checkins", "checkin_id", PROJECTION_MAP, PROJECTION_MAP);
    }

    public boolean onCreate()
    {
        setDatabaseHelper(new CheckinDatabase(getContext()));
        return true;
    }

    static 
    {
        BASE_CONTENT_URI = Uri.parse("content://com.weather.weather.provider.checkin");
        CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath("checkins").build();
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        String as[] = CheckinHistoryManager.PROJECTION;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            builder.put(s, s);
        }

        PROJECTION_MAP = builder.build();
    }
}
