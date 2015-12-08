// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.g;
import com.google.android.apps.youtube.core.async.s;
import com.google.android.apps.youtube.core.converter.a;
import com.google.android.apps.youtube.core.converter.http.ba;
import com.google.android.apps.youtube.core.converter.http.i;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, bj, ai

public final class ah extends m
    implements bj
{

    private final Executor a;
    private final int h;
    private final int i;
    private final af j;
    private final af k;
    private final af l;
    private final af m;
    private final af n;
    private final af o;
    private final af p;
    private final af q;
    private final af r = a(480, false, true, null);
    private final af s;

    private ah(Executor executor, Executor executor1, HttpClient httpclient, String s1, b b1, ai ai1, int i1, 
            int j1)
    {
        super(executor, httpclient, s1, b1);
        a = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor1);
        h = i1;
        i = j1;
        executor = new ba();
        httpclient = a(h);
        executor1 = a(f, executor);
        executor = executor1;
        if (e != null)
        {
            executor = a(e(), executor1, 0x240c8400L);
        }
        j = a(httpclient, new s(executor), 0x6ddd00L);
        k = a(j);
        executor = new i(true);
        l = a(b(i), a(g.a(j, executor, a)), 0x6ddd00L);
        m = a(ai1.a, ai1.d, true, ai1.f);
        o = a(ai1.b, ai1.e, true, ai1.g);
        executor = b(0);
        executor1 = new a(1.625F);
        n = a(executor, a(g.a(l, executor1, a)), 0x6ddd00L);
        p = a(ai1.a, ai1.d, false, ai1.f);
        q = a(ai1.b, ai1.e, false, ai1.g);
        s = a(ai1.c, false, true, null);
    }

    private af a(int i1, boolean flag, boolean flag1, android.graphics.Bitmap.Config config)
    {
        config = new i(i1, flag, flag1, config);
        com.google.android.apps.youtube.core.async.b b1 = a(g.a(j, config, a));
        config = b1;
        if (flag1)
        {
            config = a(((com.google.android.apps.youtube.common.cache.a) (a(i))), ((af) (b1)), 0x6ddd00L);
        }
        return config;
    }

    public static ah a(Executor executor, Executor executor1, HttpClient httpclient, b b1, ai ai1, int i1, int j1)
    {
        return new ah(executor, executor1, httpclient, null, b1, ai1, 70, 30);
    }

    public static ah a(Executor executor, Executor executor1, HttpClient httpclient, String s1, b b1, ai ai1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        char c1;
        byte byte0;
        if (flag)
        {
            c1 = '\u012C';
        } else
        {
            c1 = '2';
        }
        if (flag)
        {
            byte0 = 100;
        } else
        {
            byte0 = 15;
        }
        return new ah(executor, executor1, httpclient, s1, b1, ai1, c1, byte0);
    }

    public final void a(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        l.a(uri, b1);
    }

    public final void b(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        o.a(uri, b1);
    }

    public final void c(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        s.a(uri, b1);
    }

    public final void d(Uri uri, com.google.android.apps.youtube.common.a.b b1)
    {
        k.a(uri, b1);
    }
}
