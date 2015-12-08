// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.offline.p;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.uilib.a.g;
import com.google.android.apps.youtube.uilib.a.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bb, bc, bd, be, 
//            bf, ay, p

public final class ba
    implements j
{

    private final Context a;
    private final a b;
    private final h c;
    private final am d;
    private final w e;
    private final hh f;
    private final r g;
    private final OfflineStoreInterface h;
    private final bj i;
    private final p j;
    private final String k;
    private final v l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;

    public ba(Context context, a a1, h h1, am am1, w w1, hh hh1, r r1, 
            OfflineStoreInterface offlinestoreinterface, bj bj1, p p1, String s)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        d = (am)com.google.android.apps.youtube.common.fromguava.c.a(am1);
        e = (w)com.google.android.apps.youtube.common.fromguava.c.a(w1);
        f = (hh)com.google.android.apps.youtube.common.fromguava.c.a(hh1);
        g = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
        h = (OfflineStoreInterface)com.google.android.apps.youtube.common.fromguava.c.a(offlinestoreinterface);
        i = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        j = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
        k = s;
        a1 = new bb(this);
        h1 = new bc(this);
        am1 = new bd(this);
        w1 = new be(this);
        l = new v((Activity)context);
        l.a(new bf(this));
        m = l.a(com.google.android.youtube.p.dJ, am1);
        n = l.a(com.google.android.youtube.p.fr, w1);
        o = l.a(com.google.android.youtube.p.ft, h1);
        p = l.a(com.google.android.youtube.p.fa, a1);
    }

    static OfflineStoreInterface a(ba ba1)
    {
        return ba1.h;
    }

    static void a(ba ba1, int i1, boolean flag)
    {
        if (flag)
        {
            ba1.l.a(i1);
            return;
        } else
        {
            ba1.l.b(i1);
            return;
        }
    }

    static r b(ba ba1)
    {
        return ba1.g;
    }

    static String c(ba ba1)
    {
        return ba1.k;
    }

    static int d(ba ba1)
    {
        return ba1.m;
    }

    static int e(ba ba1)
    {
        return ba1.n;
    }

    static int f(ba ba1)
    {
        return ba1.o;
    }

    static int g(ba ba1)
    {
        return ba1.p;
    }

    public final g a()
    {
        ay ay1 = new ay(a, new com.google.android.apps.youtube.app.ui.presenter.p(a), c, d, e, f, g, h, i, j, k, l);
        b.a(ay1);
        return ay1;
    }
}
