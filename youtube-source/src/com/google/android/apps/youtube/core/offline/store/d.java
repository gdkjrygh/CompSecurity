// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            e

public final class d
{

    static final String a[] = {
        "ad_video_id", "playback_count", "status"
    };
    private final SQLiteDatabase b;

    public d(SQLiteDatabase sqlitedatabase)
    {
        b = (SQLiteDatabase)com.google.android.apps.youtube.common.fromguava.c.a(sqlitedatabase);
    }

    public final void a(String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("ad_video_id", s);
        contentvalues.put("playback_count", Integer.valueOf(0));
        contentvalues.put("status", Integer.valueOf(OfflineMediaStatus.ACTIVE.value()));
        b.insert("ad_videos", null, contentvalues);
    }

    final void a(String s, OfflineMediaStatus offlinemediastatus)
    {
        b.execSQL("UPDATE ad_videos SET status = ? WHERE ad_video_id = ?", new Object[] {
            Integer.valueOf(offlinemediastatus.value()), s
        });
    }

    public final void b(String s)
    {
        b.delete("ad_videos", "ad_video_id=?", new String[] {
            s
        });
    }

    public final boolean c(String s)
    {
        boolean flag;
        flag = true;
        s = b.rawQuery("SELECT COUNT(*) FROM ad_videos WHERE ad_video_id=?", new String[] {
            s
        });
        boolean flag1 = s.moveToNext();
        if (!flag1)
        {
            s.close();
            return false;
        }
        int i = s.getInt(0);
        if (i <= 0)
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

    public final e d(String s)
    {
        s = b.query("ad_videos", a, "ad_video_id=?", new String[] {
            s
        }, null, null, null, null);
        e e1;
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        e1 = com.google.android.apps.youtube.core.offline.store.e.a(null, s);
        s.close();
        return e1;
        s.close();
        return null;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    final void e(String s)
    {
        b.execSQL("UPDATE ad_videos SET playback_count = playback_count + 1 WHERE ad_video_id = ?", new Object[] {
            s
        });
    }

    final void f(String s)
    {
        b.execSQL("UPDATE ad_videos SET playback_count = 0 WHERE ad_video_id = ?", new Object[] {
            s
        });
    }

}
