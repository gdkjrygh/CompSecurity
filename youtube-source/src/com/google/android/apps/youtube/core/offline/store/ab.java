// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.database.Cursor;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            aa, l

final class ab
{

    final aa a;
    private final Cursor b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    private ab(aa aa1, Cursor cursor)
    {
        a = aa1;
        super();
        b = cursor;
        c = cursor.getColumnIndexOrThrow("id");
        d = cursor.getColumnIndexOrThrow("title");
        e = cursor.getColumnIndexOrThrow("summary");
        f = cursor.getColumnIndexOrThrow("author");
        g = cursor.getColumnIndexOrThrow("updated_date");
        h = cursor.getColumnIndexOrThrow("content_uri");
        i = cursor.getColumnIndexOrThrow("size");
    }

    ab(aa aa1, Cursor cursor, byte byte0)
    {
        this(aa1, cursor);
    }

    private Playlist a()
    {
        String s = b.getString(c);
        android.net.Uri uri = aa.a(a).g(s);
        return (new com.google.android.apps.youtube.datalib.legacy.model.Playlist.Builder()).id(s).title(b.getString(d)).summary(b.getString(e)).author(b.getString(f)).updated(com.google.android.apps.youtube.core.utils.i.a(b, g)).contentUri(com.google.android.apps.youtube.core.utils.i.b(b, h)).size(b.getInt(i)).thumbnailUri(uri).hqThumbnailUri(uri).sdThumbnailUri(uri).build();
    }

    static List a(ab ab1)
    {
        ArrayList arraylist = new ArrayList(ab1.b.getCount());
        for (; ab1.b.moveToNext(); arraylist.add(ab1.a())) { }
        return arraylist;
    }

    static Playlist b(ab ab1)
    {
        if (ab1.b.moveToNext())
        {
            return ab1.a();
        } else
        {
            return null;
        }
    }
}
