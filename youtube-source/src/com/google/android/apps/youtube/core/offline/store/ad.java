// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            l

final class ad
{

    private final Cursor a;
    private final l b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    ad(Cursor cursor, l l1)
    {
        a = (Cursor)com.google.android.apps.youtube.common.fromguava.c.a(cursor);
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = cursor.getColumnIndexOrThrow("id");
        d = cursor.getColumnIndexOrThrow("watch_uri");
        e = cursor.getColumnIndexOrThrow("title");
        f = cursor.getColumnIndexOrThrow("duration");
        g = cursor.getColumnIndexOrThrow("view_count");
        h = cursor.getColumnIndexOrThrow("likes_count");
        i = cursor.getColumnIndexOrThrow("dislikes_count");
        j = cursor.getColumnIndexOrThrow("owner");
        k = cursor.getColumnIndexOrThrow("owner_display_name");
        l = cursor.getColumnIndexOrThrow("owner_uri");
        m = cursor.getColumnIndexOrThrow("upload_date");
        n = cursor.getColumnIndexOrThrow("published_date");
        o = cursor.getColumnIndexOrThrow("tags");
        p = cursor.getColumnIndexOrThrow("description");
        q = cursor.getColumnIndexOrThrow("subtitle_tracks_uri");
        r = cursor.getColumnIndexOrThrow("state");
    }

    static List a(ad ad1)
    {
        ArrayList arraylist = new ArrayList(ad1.a.getCount());
        for (; ad1.a.moveToNext(); arraylist.add(ad1.a())) { }
        return arraylist;
    }

    static Video b(ad ad1)
    {
        if (ad1.a.moveToNext())
        {
            return ad1.a();
        } else
        {
            return null;
        }
    }

    final Video a()
    {
        String s = a.getString(c);
        String s1 = a.getString(j);
        Uri uri1 = b.e(s);
        Uri uri2 = b.d(s);
        Uri uri;
        if (s1 != null)
        {
            uri = b.b(s1);
        } else
        {
            uri = null;
        }
        return (new com.google.android.apps.youtube.datalib.model.gdata.Video.Builder()).id(s).streams(null).defaultThumbnailUri(uri2).mqThumbnailUri(uri2).hqThumbnailUri(uri1).sdThumbnailUri(uri1).watchUri(com.google.android.apps.youtube.core.utils.i.b(a, d)).title(a.getString(e)).duration(a.getInt(f)).viewCount(a.getLong(g)).likesCount(a.getLong(h)).dislikesCount(a.getLong(i)).owner(s1).ownerUri(com.google.android.apps.youtube.core.utils.i.b(a, l)).uploadedDate(com.google.android.apps.youtube.core.utils.i.a(a, m)).publishedDate(com.google.android.apps.youtube.core.utils.i.a(a, n)).tags(a.getString(o)).description(a.getString(p)).ownerDisplayName(a.getString(k)).captionTracksUri(com.google.android.apps.youtube.core.utils.i.b(a, q)).state((com.google.android.apps.youtube.datalib.model.gdata.Video.State)Enum.valueOf(com/google/android/apps/youtube/datalib/model/gdata/Video$State, a.getString(r))).isInOfflineStore(true).offlineChannelAvatarThumbnailUrl(uri.toString()).monetize(true).build();
    }
}
