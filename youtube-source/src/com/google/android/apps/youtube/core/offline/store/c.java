// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import java.util.List;
import org.json.JSONArray;

public final class c
{

    static final String a[] = {
        "adbreaks", "original_video_id"
    };
    private final SQLiteDatabase b;

    public c(SQLiteDatabase sqlitedatabase)
    {
        b = (SQLiteDatabase)com.google.android.apps.youtube.common.fromguava.c.a(sqlitedatabase);
    }

    public final List a(String s)
    {
        s = b.query("adbreaks", new String[] {
            "adbreaks"
        }, "original_video_id=?", new String[] {
            s
        }, null, null, null, null);
        int i = s.getCount();
        if (i <= 0)
        {
            s.close();
            return null;
        }
        List list;
        s.moveToNext();
        list = com.google.android.apps.youtube.datalib.legacy.a.b.a(new JSONArray(Util.c(s.getBlob(0))));
        s.close();
        return list;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final void a(String s, List list)
    {
        SQLiteDatabase sqlitedatabase = b;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("adbreaks", Util.a(com.google.android.apps.youtube.datalib.legacy.a.b.a(list).toString(), 1024));
        contentvalues.put("original_video_id", s);
        sqlitedatabase.insert("adbreaks", null, contentvalues);
    }

    public final boolean b(String s)
    {
        s = b.query("adbreaks", new String[] {
            "original_video_id"
        }, "original_video_id=?", new String[] {
            s
        }, null, null, null, null);
        int i = s.getCount();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.close();
        return flag;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final void c(String s)
    {
        b.delete("adbreaks", "original_video_id=?", new String[] {
            s
        });
    }

}
