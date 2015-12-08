// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            d, h, g

public final class f
{

    static final String a[] = {
        "original_video_id", "ad_break_id", "ad_video_id", "vast_type", "expiry_timestamp", "asset_frequency_cap", "vast_playback_count", "vast"
    };
    private static final String b[] = {
        "original_video_id", "ad_break_id", "ad_video_id", "vast_type", "expiry_timestamp", "asset_frequency_cap", "vast_playback_count"
    };
    private final SQLiteDatabase c;

    public f(SQLiteDatabase sqlitedatabase)
    {
        c = (SQLiteDatabase)com.google.android.apps.youtube.common.fromguava.c.a(sqlitedatabase);
    }

    private static ContentValues a(VastAd vastad)
    {
        ContentValues contentvalues = new ContentValues();
        if (vastad.getAdVideoId() != null)
        {
            contentvalues.put("ad_video_id", vastad.getAdVideoId());
            contentvalues.put("vast_type", Integer.valueOf(OfflineStoreInterface.VastType.FULL.value()));
            contentvalues.put("expiry_timestamp", Long.valueOf(vastad.getExpirationTimeMillis()));
            contentvalues.put("asset_frequency_cap", Integer.valueOf(vastad.getAssetFrequencyCap()));
        } else
        if (!vastad.isEmpty())
        {
            contentvalues.put("vast_type", Integer.valueOf(OfflineStoreInterface.VastType.FORECASTING.value()));
            contentvalues.put("expiry_timestamp", Long.valueOf(vastad.getExpirationTimeMillis()));
            contentvalues.put("asset_frequency_cap", Integer.valueOf(vastad.getAssetFrequencyCap()));
        } else
        {
            contentvalues.put("vast_type", Integer.valueOf(OfflineStoreInterface.VastType.EMPTY.value()));
            contentvalues.put("expiry_timestamp", Long.valueOf(0L));
            contentvalues.put("asset_frequency_cap", Integer.valueOf(-1));
        }
        contentvalues.put("vast", Util.a(vastad.getConverter().b().toString(), 1024));
        return contentvalues;
    }

    public final VastAd a(String s, String s1)
    {
        s = c.query("ads", new String[] {
            "vast"
        }, "original_video_id=? AND ad_break_id=?", new String[] {
            s, s1
        }, null, null, null, null);
        boolean flag = s.moveToNext();
        if (!flag)
        {
            s.close();
            return null;
        }
        s1 = (VastAd)com.google.android.apps.youtube.datalib.legacy.a.b.b(new JSONObject(Util.c(s.getBlob(0))));
        s.close();
        return s1;
        s1;
        s.close();
        throw s1;
    }

    public final List a()
    {
        Cursor cursor = c.rawQuery((new StringBuilder("SELECT ")).append(i.b("ads", b)).append(",").append(i.b("ad_videos", d.a)).append(" FROM ads").append(" LEFT JOIN ad_videos").append(" ON ").append(i.a("ads", new String[] {
            "ad_video_id"
        })).append(" = ").append(i.a("ad_videos", new String[] {
            "ad_video_id"
        })).toString(), null);
        Object obj;
        if (cursor.getCount() > 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = Collections.emptyList();
        cursor.close();
        return ((List) (obj));
        obj = new ArrayList();
        for (; cursor.moveToNext(); ((List) (obj)).add(h.a("ads", "ad_videos", cursor))) { }
        break MISSING_BLOCK_LABEL_167;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    public final Set a(String s)
    {
        s = c.query("ads", new String[] {
            "ad_video_id"
        }, "original_video_id=? AND ad_video_id IS NOT NULL", new String[] {
            s
        }, null, null, null, null);
        Object obj;
        if (s.getCount() > 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = Collections.emptySet();
        s.close();
        return ((Set) (obj));
        obj = new HashSet();
        for (; s.moveToNext(); ((Set) (obj)).add(s.getString(0))) { }
        break MISSING_BLOCK_LABEL_97;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((Set) (obj));
    }

    public final void a(String s, String s1, VastAd vastad)
    {
        SQLiteDatabase sqlitedatabase = c;
        vastad = a(vastad);
        vastad.put("original_video_id", s);
        vastad.put("ad_break_id", s1);
        sqlitedatabase.insert("ads", null, vastad);
    }

    public final int b(String s)
    {
        s = c.rawQuery("SELECT COUNT(DISTINCT original_video_id) FROM ads WHERE ad_video_id=?", new String[] {
            s
        });
        int j = s.getCount();
        if (j <= 0)
        {
            s.close();
            return 0;
        }
        s.moveToNext();
        j = s.getInt(0);
        s.close();
        return j;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public final g b(String s, String s1)
    {
        s = c.query("ads", b, "original_video_id=? AND ad_break_id=?", new String[] {
            s, s1
        }, null, null, null, null);
        if (!s.moveToNext())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s1 = g.a(null, s);
        s.close();
        return s1;
        s.close();
        return null;
        s1;
        s.close();
        throw s1;
    }

    public final void b(String s, String s1, VastAd vastad)
    {
        c.update("ads", a(vastad), "original_video_id=? AND ad_break_id=?", new String[] {
            s, s1
        });
    }

    public final void c(String s)
    {
        c.delete("ads", "original_video_id=?", new String[] {
            s
        });
    }

    public final boolean c(String s, String s1)
    {
        boolean flag;
        flag = true;
        s = c.rawQuery("SELECT COUNT(*) FROM ads WHERE original_video_id=? AND ad_break_id=?", new String[] {
            s, s1
        });
        int j = s.getCount();
        if (j <= 0)
        {
            s.close();
            return false;
        }
        s.moveToNext();
        j = s.getInt(0);
        if (j <= 0)
        {
            flag = false;
        }
        s.close();
        return flag;
        s1;
        s.close();
        throw s1;
    }

    final void d(String s, String s1)
    {
        c.execSQL("UPDATE ads SET vast_playback_count = vast_playback_count + 1 WHERE original_video_id = ? AND ad_break_id = ?", new Object[] {
            s, s1
        });
    }

    final void e(String s, String s1)
    {
        c.execSQL("UPDATE ads SET vast_playback_count = 0 WHERE original_video_id = ? AND ad_break_id = ?", new Object[] {
            s, s1
        });
    }

}
