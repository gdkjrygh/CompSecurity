// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.Context;
import android.support.v7.app.MediaRouteButton;
import android.support.v7.media.s;
import android.support.v7.media.u;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.honeycomb.ui.f;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            j

public final class i
    implements f
{

    private q a;
    private boolean b;
    private boolean c;
    private final s d = an.i();
    private final u e;
    private final com.google.android.apps.youtube.app.honeycomb.phone.j f = new com.google.android.apps.youtube.app.honeycomb.phone.j(this, (byte)0);
    private MediaRouteButton g;
    private MediaRouteButton h;

    public i(Context context)
    {
        b = false;
        c = true;
        e = u.a(context);
        h = a(context);
    }

    static void a(i k)
    {
        k.f();
    }

    private void f()
    {
        int k = 0;
        if (a == null)
        {
            return;
        }
        Object obj = e;
        boolean flag = u.a(d, 0);
        if ((!b || !c) && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a != null)
        {
            a.b(flag);
            a.a(flag);
        }
        obj = h;
        if (!flag)
        {
            k = 8;
        }
        ((MediaRouteButton) (obj)).setVisibility(k);
    }

    public final void A()
    {
        b = false;
        f();
    }

    public final MediaRouteButton a(Context context)
    {
        context = (MediaRouteButton)LayoutInflater.from(context).inflate(l.aE, null);
        context.setRouteSelector(d);
        return context;
    }

    public final void a()
    {
        f();
    }

    public final void a(com.google.android.apps.youtube.app.compat.j j1)
    {
        a = j1.c(j.cr);
        g = (MediaRouteButton)a.d();
        g.setRouteSelector(d);
    }

    public final void a(boolean flag)
    {
        c = flag;
        f();
    }

    public final void b()
    {
        e.a(d, f, 4);
    }

    public final void c()
    {
        e.a(f);
    }

    public final View d()
    {
        return g;
    }

    public final View e()
    {
        return h;
    }

    public final void z()
    {
        b = true;
        f();
    }
}
