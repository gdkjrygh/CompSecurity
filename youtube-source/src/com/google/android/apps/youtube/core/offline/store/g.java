// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.i;

public final class g
{

    public final String a;
    public final String b;
    public final String c;
    public final OfflineStoreInterface.VastType d;
    public final long e;
    public final int f;
    public final int g;

    private g(String s, String s1, String s2, OfflineStoreInterface.VastType vasttype, long l, int j, 
            int k)
    {
        a = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        c = s2;
        d = (OfflineStoreInterface.VastType)com.google.android.apps.youtube.common.fromguava.c.a(vasttype);
        e = l;
        f = j;
        g = k;
    }

    static g a(String s, Cursor cursor)
    {
        if (cursor.isAfterLast())
        {
            return null;
        } else
        {
            int j = cursor.getColumnIndexOrThrow(i.a(s, "original_video_id"));
            int k = cursor.getColumnIndexOrThrow(i.a(s, "ad_break_id"));
            int l = cursor.getColumnIndexOrThrow(i.a(s, "ad_video_id"));
            int i1 = cursor.getColumnIndexOrThrow(i.a(s, "vast_type"));
            int j1 = cursor.getColumnIndexOrThrow(i.a(s, "expiry_timestamp"));
            int k1 = cursor.getColumnIndexOrThrow(i.a(s, "asset_frequency_cap"));
            int l1 = cursor.getColumnIndexOrThrow(i.a(s, "vast_playback_count"));
            return new g(cursor.getString(j), cursor.getString(k), cursor.getString(l), OfflineStoreInterface.VastType.fromValue(cursor.getInt(i1)), cursor.getLong(j1), cursor.getInt(k1), cursor.getInt(l1));
        }
    }
}
