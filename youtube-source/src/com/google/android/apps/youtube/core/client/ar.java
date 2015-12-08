// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.aa;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.converter.http.ba;
import com.google.android.apps.youtube.core.converter.http.dg;
import com.google.android.apps.youtube.core.converter.http.dh;
import com.google.android.apps.youtube.core.converter.http.di;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, ce

public final class ar extends m
    implements ce
{

    private final a a;
    private final af h;
    private final af i;
    private final af j;
    private final af k;

    public ar(Executor executor, HttpClient httpclient, n n, b b1)
    {
        super(executor, httpclient, n, b1);
        a = a(20);
        h = a();
        i = b();
        j = c();
        k = f();
    }

    public ar(Executor executor, HttpClient httpclient, n n, String s, b b1)
    {
        super(executor, httpclient, n, s, b1);
        a = a(20);
        h = a();
        i = b();
        j = c();
        k = f();
    }

    private af a()
    {
        Object obj = new dg();
        com.google.android.apps.youtube.common.cache.b b1 = a(20);
        com.google.android.apps.youtube.core.async.u u = a(((com.google.android.apps.youtube.core.converter.c) (obj)), ((com.google.android.apps.youtube.core.converter.http.ay) (obj)));
        obj = u;
        if (e != null)
        {
            obj = a(((a) (e())), ((af) (u)), 0x240c8400L);
        }
        return a(((a) (b1)), ((af) (a(((af) (obj))))), 0x6ddd00L);
    }

    private af b()
    {
        Object obj = new di(g);
        com.google.android.apps.youtube.core.async.u u = a(((com.google.android.apps.youtube.core.converter.c) (obj)), ((com.google.android.apps.youtube.core.converter.http.ay) (obj)));
        obj = u;
        if (e != null)
        {
            obj = a(e(), u, 0x240c8400L);
        }
        obj = a(((af) (obj)));
        return a(a, ((af) (obj)), 0x6ddd00L);
    }

    private af c()
    {
        return a(a(new di(g), new ba()));
    }

    private af f()
    {
        com.google.android.apps.youtube.core.async.b b1 = a(new aa(g));
        return a(a, b1, 0x6ddd00L);
    }

    public final void a(SubtitleTrack subtitletrack, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack);
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack.videoId);
        if (subtitletrack.offlineSubtitlesPath != null)
        {
            k.a(subtitletrack, b1);
            return;
        } else
        {
            i.a(subtitletrack, b1);
            return;
        }
    }

    public final void a(String s, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        b1 = new dh(b1);
        h.a(s, b1);
    }

    public final void b(SubtitleTrack subtitletrack, com.google.android.apps.youtube.common.a.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack);
        com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack.videoId);
        j.a(subtitletrack, b1);
    }
}
