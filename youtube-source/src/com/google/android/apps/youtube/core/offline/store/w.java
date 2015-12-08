// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;

final class w
{

    private final Cursor a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    private w(Cursor cursor)
    {
        a = cursor;
        b = cursor.getColumnIndexOrThrow("video_id");
        c = cursor.getColumnIndexOrThrow("language_code");
        d = cursor.getColumnIndexOrThrow("source_language_code");
        e = cursor.getColumnIndexOrThrow("language_name");
        f = cursor.getColumnIndexOrThrow("track_name");
        g = cursor.getColumnIndexOrThrow("format");
        h = cursor.getColumnIndexOrThrow("subtitles_path");
        i = cursor.getColumnIndex("track_vss_id");
    }

    w(Cursor cursor, byte byte0)
    {
        this(cursor);
    }

    static List a(w w1)
    {
        ArrayList arraylist = new ArrayList(w1.a.getCount());
        for (; w1.a.moveToNext(); arraylist.add(SubtitleTrack.createOffline(w1.a.getString(w1.c), w1.a.getString(w1.e), w1.a.getString(w1.f), w1.a.getString(w1.b), w1.a.getInt(w1.g), w1.a.getString(w1.h), w1.a.getString(w1.i)))) { }
        return arraylist;
    }
}
