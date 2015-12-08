// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.common.database.f;

final class o
    implements f
{

    o()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("ALTER TABLE subtitles ADD COLUMN track_vss_id TEXT NOT NULL DEFAULT '-'");
    }
}
