// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.core.player.fetcher.d;
import com.google.android.apps.youtube.datalib.a.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            q, h

public final class r
{

    private final Executor a;
    private final HttpClient b;
    private final n c;
    private final b d;
    private final a e;
    private d f;
    private List g;
    private af h;
    private af i;
    private com.google.android.apps.youtube.core.converter.http.b j;
    private h k;

    public r(Executor executor, HttpClient httpclient, n n1, b b1, a a1)
    {
        a = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        b = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        c = (n)com.google.android.apps.youtube.common.fromguava.c.a(n1);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
    }

    static b a(r r1)
    {
        return r1.d;
    }

    static h b(r r1)
    {
        return r1.k;
    }

    static d c(r r1)
    {
        return r1.f;
    }

    static Executor d(r r1)
    {
        return r1.a;
    }

    static HttpClient e(r r1)
    {
        return r1.b;
    }

    static n f(r r1)
    {
        return r1.c;
    }

    static af g(r r1)
    {
        return r1.h;
    }

    static com.google.android.apps.youtube.core.converter.http.b h(r r1)
    {
        return r1.j;
    }

    static af i(r r1)
    {
        return r1.i;
    }

    static a j(r r1)
    {
        return r1.e;
    }

    public final q a()
    {
        if (h == null && j == null)
        {
            j = new com.google.android.apps.youtube.core.converter.http.b(k, g);
        }
        return new q(this, (byte)0);
    }

    public final r a(af af)
    {
        h = af;
        return this;
    }

    public final r a(h h1)
    {
        k = h1;
        return this;
    }

    public final r a(d d1)
    {
        f = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        return this;
    }

    public final r a(p p)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        g.add(p);
        return this;
    }
}
