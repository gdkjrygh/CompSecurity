// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.IntentFilter;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.support.v7.media.ad;
import android.support.v7.media.f;
import android.support.v7.media.s;
import android.support.v7.media.t;
import android.support.v7.media.u;
import android.support.v7.media.v;
import android.util.Log;
import com.google.android.apps.youtube.app.ac;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.player.notification.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk, ao, YouTubeTvScreen, ap, 
//            RemoteControl

public final class an extends v
    implements c
{

    private static final s a;
    private final u b;
    private final List c = new ArrayList();
    private final bk d;
    private final ac e;
    private final boolean f;
    private YouTubeTvScreen g;
    private int h;
    private b i;
    private RemoteControl j;

    public an(Context context, bk bk1, f f1, ac ac1, boolean flag)
    {
        h = 0;
        d = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        e = (ac)com.google.android.apps.youtube.common.fromguava.c.a(ac1);
        f = flag;
        b = u.a(context);
        bk1.a(new ao(this));
        context = b;
        u.a(f1);
    }

    private ad a(YouTubeTvScreen youtubetvscreen)
    {
        u u1 = b;
        for (Iterator iterator = u.a().iterator(); iterator.hasNext();)
        {
            ad ad1 = (ad)iterator.next();
            if (ad1.m() != null)
            {
                YouTubeTvScreen youtubetvscreen1 = (YouTubeTvScreen)ad1.m().getParcelable("screen");
                if (youtubetvscreen1 != null && youtubetvscreen.getId().equals(youtubetvscreen1.getId()))
                {
                    return ad1;
                }
            }
        }

        return null;
    }

    static u a(an an1)
    {
        return an1.b;
    }

    static RemoteControl a(an an1, RemoteControl remotecontrol)
    {
        an1.j = null;
        return null;
    }

    static void a(an an1, boolean flag)
    {
        an1.a(false);
    }

    private void a(String s)
    {
        if (f || "true".equalsIgnoreCase(e.a("enable_mdx_logs", "")))
        {
            Log.d("YouTube MDX", s);
        }
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ap)iterator.next()).a(j, flag)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private static boolean f(ad ad1)
    {
        for (ad1 = ad1.g().iterator(); ad1.hasNext();)
        {
            if (((IntentFilter)ad1.next()).hasCategory("MDX_MEDIA_ROUTE_CONTROL_CATEGORY"))
            {
                return true;
            }
        }

        return false;
    }

    public static s i()
    {
        return a;
    }

    public final void a(RemoteControlClient remotecontrolclient)
    {
        u u1 = b;
        u.a(remotecontrolclient);
    }

    public final void a(ad ad1)
    {
        a((new StringBuilder("Route added ")).append(ad1).toString());
        if (g != null && g.getId().equals(((YouTubeTvScreen)ad1.m().getParcelable("screen")).getId()))
        {
            ad1.n();
            i.a(g, Boolean.valueOf(true));
            g = null;
            i = null;
        }
    }

    public final void a(YouTubeTvScreen youtubetvscreen, b b1)
    {
        a((new StringBuilder("Selecting mdx route for ")).append(youtubetvscreen).toString());
        ad ad1 = a(youtubetvscreen);
        if (ad1 == null)
        {
            L.c("Trying to select an unknown route - will ignore");
            g = youtubetvscreen;
            i = b1;
            return;
        } else
        {
            ad1.n();
            b1.a(youtubetvscreen, Boolean.valueOf(true));
            return;
        }
    }

    public final void a(ap ap1)
    {
        this;
        JVM INSTR monitorenter ;
        c.add(ap1);
        this;
        JVM INSTR monitorexit ;
        return;
        ap1;
        throw ap1;
    }

    public final void b(RemoteControlClient remotecontrolclient)
    {
        u u1 = b;
        u.b(remotecontrolclient);
    }

    public final void b(ad ad1)
    {
        a((new StringBuilder("Route removed ")).append(ad1).toString());
    }

    public final void b(ap ap1)
    {
        this;
        JVM INSTR monitorenter ;
        c.remove(ap1);
        this;
        JVM INSTR monitorexit ;
        return;
        ap1;
        throw ap1;
    }

    public final void c(ad ad1)
    {
        a((new StringBuilder("Route selected ")).append(ad1).toString());
        if (f(ad1))
        {
            j = d;
        } else
        {
            j = null;
        }
        g = null;
        a(true);
    }

    public final void d(ad ad1)
    {
        a((new StringBuilder("Route unselected ")).append(ad1).toString());
        j = null;
        a(true);
    }

    public final RemoteControl e()
    {
        return j;
    }

    public final void f()
    {
        if (h == 0)
        {
            b.a(a, this, 4);
            RemoteControl remotecontrol = j;
            u u1 = b;
            if (f(u.c()))
            {
                j = d;
            } else
            {
                j = null;
            }
            if (remotecontrol != j)
            {
                a(false);
            }
        }
        h = h + 1;
    }

    public final void g()
    {
        h = h - 1;
        if (h == 0)
        {
            b.a(this);
        }
    }

    public final void h()
    {
        u u1 = b;
        u.b().n();
    }

    static 
    {
        t t1 = new t();
        t1.a("MDX_MEDIA_ROUTE_CONTROL_CATEGORY");
        a = t1.a();
    }
}
