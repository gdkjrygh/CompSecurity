// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;

public final class e
{

    public final String a;
    public final int b;
    public final OfflineMediaStatus c;

    private e(String s, int j, OfflineMediaStatus offlinemediastatus)
    {
        a = s;
        b = j;
        c = offlinemediastatus;
    }

    static e a(String s, Cursor cursor)
    {
        if (!cursor.isAfterLast())
        {
            int j = cursor.getColumnIndexOrThrow(i.a(s, "ad_video_id"));
            int k = cursor.getColumnIndexOrThrow(i.a(s, "playback_count"));
            int l = cursor.getColumnIndexOrThrow(i.a(s, "status"));
            if (!cursor.isNull(j))
            {
                return new e(cursor.getString(j), cursor.getInt(k), OfflineMediaStatus.fromValue(cursor.getInt(l)));
            }
        }
        return null;
    }
}
