// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.systemwidget.t;
import com.go.weatherex.j.a.c;
import com.go.weatherex.j.a.d;
import com.go.weatherex.j.a.h;

// Referenced classes of package com.go.weatherex.j:
//            k, ag, g

public abstract class af extends k
    implements c, d, h
{

    private ag a;
    private ag b;

    public af(g g1)
    {
        super(g1);
        a = new ag(e(), 16);
        a.g = 0x7f0901c7;
        a.k = 0x7f0901bf;
        a.l = 0x7f0901bd;
        a.n = 0x7f0901c8;
        a.i = 0x7f0901c9;
        a.j = 0x7f0901ca;
        a.b = 0x7f0901c1;
        a.c = 0x7f0901c2;
        a.d = 0x7f0901c3;
        a.e = 0x7f0901c5;
        a.f = 0x7f0901c6;
        a.h = 0x7f0901cb;
        a.m = 0x7f0901be;
        a.o = 0x7f0901dd;
        a.p = 0x7f0901de;
        a.q = (new int[] {
            0x7f0205ce, 0x7f0205cf, 0x7f0205d0, 0x7f0205d1, 0x7f0205d2, 0x7f0205d3, 0x7f0205d4, 0x7f0205d5, 0x7f0205d6, 0x7f0205d7
        });
        a.r = a.q;
        a.t = 0x7f02063a;
        a.s = i.f;
        b = new ag(f(), 32);
        b.g = 0x7f0901d7;
        b.k = 0x7f0901cf;
        b.l = 0x7f0901cd;
        b.n = 0x7f0901d8;
        b.i = 0x7f0901d9;
        b.j = 0x7f0901da;
        b.b = 0x7f0901d1;
        b.c = 0x7f0901d2;
        b.d = 0x7f0901d3;
        b.e = 0x7f0901d5;
        b.f = 0x7f0901d6;
        b.h = 0x7f0901db;
        b.m = 0x7f0901ce;
        b.o = 0x7f0901dd;
        b.p = 0x7f0901de;
        b.q = a.q;
        b.r = b.q;
        b.t = a.t;
        b.s = a.s;
    }

    protected abstract PendingIntent a(Context context, int j, int l);

    protected t a()
    {
        return null;
    }

    protected void a(RemoteViews remoteviews)
    {
        PendingIntent pendingintent = k();
        a.c(remoteviews, pendingintent);
        b.c(remoteviews, pendingintent);
        pendingintent = h();
        a.b(remoteviews, pendingintent);
        b.b(remoteviews, pendingintent);
        pendingintent = i();
        a.a(remoteviews, pendingintent);
        b.a(remoteviews, pendingintent);
        pendingintent = m();
        a.d(remoteviews, pendingintent);
        b.d(remoteviews, pendingintent);
        a.e(remoteviews, a(a.u.n(), a.u.o(), a.a));
        b.e(remoteviews, a(b.u.n(), b.u.o(), b.a));
    }

    protected void b()
    {
    }

    protected boolean c()
    {
        return true;
    }

    protected RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(aw.n().getPackageName(), 0x7f030036);
        a.a(remoteviews);
        b.a(remoteviews);
        return remoteviews;
    }

    protected abstract g e();

    protected abstract g f();

    public void n()
    {
    }
}
