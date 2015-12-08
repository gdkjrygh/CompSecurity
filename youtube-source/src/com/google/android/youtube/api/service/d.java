// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.api.service;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.youtube.api.b.a;
import com.google.android.apps.youtube.api.b.a.b;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.api.m;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.ab;
import com.google.android.youtube.player.internal.af;
import com.google.android.youtube.player.internal.y;

// Referenced classes of package com.google.android.youtube.api.service:
//            c, YouTubeService, e

final class d extends af
    implements android.os.IBinder.DeathRecipient, m
{

    private final Context a;
    private final Handler b;
    private final com.google.android.youtube.api.service.c c;
    private final String d;
    private volatile com.google.android.youtube.player.internal.d e;
    private volatile j f;
    private volatile b g;

    public d(Context context, com.google.android.youtube.api.service.c c1, String s, String s1, String s2, String s3, com.google.android.youtube.player.internal.d d1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        e = (com.google.android.youtube.player.internal.d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        b = new Handler(context.getMainLooper());
        c = (com.google.android.youtube.api.service.c)com.google.android.apps.youtube.common.fromguava.c.a(c1, "serviceDestroyedNotifier");
        d = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        j.a(this, b, context, s, s1, s2, s3);
    }

    static b a(d d1, b b1)
    {
        d1.g = null;
        return null;
    }

    static j a(d d1)
    {
        return d1.f;
    }

    static j a(d d1, j j1)
    {
        d1.f = null;
        return null;
    }

    static com.google.android.youtube.player.internal.d a(d d1, com.google.android.youtube.player.internal.d d2)
    {
        d1.e = null;
        return null;
    }

    static com.google.android.youtube.player.internal.d b(d d1)
    {
        return d1.e;
    }

    private void b()
    {
        if (f == null)
        {
            throw new IllegalStateException("YouTubeServiceEntity not initialized");
        } else
        {
            return;
        }
    }

    public final IBinder a()
    {
        b();
        return g.asBinder();
    }

    public final ab a(y y)
    {
        b();
        return new a(b, f, y);
    }

    public final void a(j j1)
    {
        f = j1;
        g = new b(a, b, c, j1);
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        e.asBinder().linkToDeath(this, 0);
        e.a(YouTubeInitializationResult.SUCCESS.name(), asBinder());
        return;
        j1;
    }

    public final void a(Exception exception)
    {
        f = null;
        L.a("Error creating ApiEnvironment", exception);
        if (e != null)
        {
            com.google.android.youtube.api.service.YouTubeService.a(e, j.a(exception));
        }
    }

    public final void a(boolean flag)
    {
        b.post(new e(this, flag));
    }

    public final void binderDied()
    {
        a(true);
        j.a(d);
    }
}
