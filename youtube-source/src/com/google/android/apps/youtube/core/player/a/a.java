// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.a;

import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.exoplayer.upstream.FileDataSource;
import com.google.android.exoplayer.upstream.cache.CacheDataSink;
import com.google.android.exoplayer.upstream.cache.b;
import com.google.android.exoplayer.upstream.i;
import java.security.Key;

public final class a
    implements e
{

    private final e a;
    private final e b;
    private final Key c;
    private com.google.android.exoplayer.upstream.cache.a d;
    private com.google.android.exoplayer.upstream.cache.a e;

    public a(e e1, e e2, Key key)
    {
        a = e1;
        b = e2;
        c = key;
    }

    public final i a()
    {
        i j = (i)a.b();
        com.google.android.exoplayer.upstream.cache.a a1 = (com.google.android.exoplayer.upstream.cache.a)b.b();
        Object obj = j;
        if (a1 != null)
        {
            obj = new com.google.android.exoplayer.upstream.a.a(c.getEncoded(), new byte[4096], new CacheDataSink(a1, 0x500000L));
            obj = new b(a1, j, new com.google.android.exoplayer.upstream.a.b(c.getEncoded(), new FileDataSource()), ((com.google.android.exoplayer.upstream.h) (obj)), false, true);
        }
        if (d != null)
        {
            obj = new b(d, ((i) (obj)), new com.google.android.exoplayer.upstream.a.b(c.getEncoded(), new FileDataSource()), null, false, true);
            if (e != null)
            {
                return new b(d, ((i) (obj)), new com.google.android.exoplayer.upstream.a.b(c.getEncoded(), new FileDataSource()), null, false, true);
            } else
            {
                return ((i) (obj));
            }
        } else
        {
            return ((i) (obj));
        }
    }

    public final void a(com.google.android.exoplayer.upstream.cache.a a1, com.google.android.exoplayer.upstream.cache.a a2)
    {
        d = a1;
        e = a2;
    }

    public final Object b()
    {
        return a();
    }
}
