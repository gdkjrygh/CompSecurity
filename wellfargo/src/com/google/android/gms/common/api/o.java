// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.b.i;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            bm, ax, p, bp, 
//            a, g, r, n, 
//            q

public final class o
{

    private Account a;
    private final Set b = new HashSet();
    private int c;
    private View d;
    private String e;
    private String f;
    private final Map g = new i();
    private final Context h;
    private final Map i = new i();
    private FragmentActivity j;
    private int k;
    private int l;
    private r m;
    private Looper n;
    private b o;
    private g p;
    private final ArrayList q = new ArrayList();
    private final ArrayList r = new ArrayList();
    private com.google.android.gms.signin.i s;

    public o(Context context)
    {
        k = -1;
        l = -1;
        o = com.google.android.gms.common.b.a();
        p = com.google.android.gms.signin.b.c;
        s = new com.google.android.gms.signin.i();
        h = context;
        n = context.getMainLooper();
        e = context.getPackageName();
        f = context.getClass().getName();
    }

    static FragmentActivity a(o o1)
    {
        return o1.j;
    }

    private void a(bm bm1, n n1)
    {
        bm1.a(k, n1, m);
    }

    static void a(o o1, bm bm1, n n1)
    {
        o1.a(bm1, n1);
    }

    private n c()
    {
        ax ax1 = new ax(h.getApplicationContext(), n, a(), o, p, i, q, r, k, -1);
        bm bm1 = bm.a(j);
        if (bm1 == null)
        {
            (new Handler(h.getMainLooper())).post(new p(this, ax1));
            return ax1;
        } else
        {
            a(bm1, ax1);
            return ax1;
        }
    }

    private n d()
    {
        bp bp1 = bp.a(j);
        n n1 = bp1.a(l);
        Object obj = n1;
        if (n1 == null)
        {
            obj = new ax(h.getApplicationContext(), n, a(), o, p, i, q, r, -1, l);
        }
        bp1.a(l, ((n) (obj)), m);
        return ((n) (obj));
    }

    public o a(a a1)
    {
        i.put(a1, null);
        b.addAll(a1.a().a(null));
        return this;
    }

    public o a(q q1)
    {
        q.add(q1);
        return this;
    }

    public o a(r r1)
    {
        r.add(r1);
        return this;
    }

    public h a()
    {
        return new h(a, b, g, c, d, e, f, s.a());
    }

    public n b()
    {
        boolean flag;
        if (!i.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.b(flag, "must call addApi() to add at least one API");
        if (k >= 0)
        {
            return c();
        }
        if (l >= 0)
        {
            return d();
        } else
        {
            return new ax(h, n, a(), o, p, i, q, r, -1, -1);
        }
    }
}
