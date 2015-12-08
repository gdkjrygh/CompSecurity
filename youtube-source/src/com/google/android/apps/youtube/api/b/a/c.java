// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.ConditionVariable;
import com.google.android.apps.youtube.api.jar.a.ce;
import com.google.android.apps.youtube.api.jar.a.ch;
import com.google.android.apps.youtube.api.jar.a.ck;
import com.google.android.apps.youtube.api.jar.a.cn;
import com.google.android.apps.youtube.api.jar.a.cq;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.api.jar.a.cw;
import com.google.android.apps.youtube.api.jar.a.cz;
import com.google.android.apps.youtube.api.jar.a.dc;
import com.google.android.apps.youtube.api.jar.a.df;
import com.google.android.apps.youtube.api.jar.a.di;
import com.google.android.apps.youtube.api.jar.a.dl;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d, b

final class c
    implements Runnable
{

    final ck a;
    final cw b;
    final dc c;
    final df d;
    final ct e;
    final ce f;
    final di g;
    final ch h;
    final cn i;
    final cq j;
    final cz k;
    final dl l;
    final boolean m;
    final AtomicReference n;
    final ConditionVariable o;
    final b p;

    c(b b1, ck ck, cw cw, dc dc, df df, ct ct, ce ce, 
            di di, ch ch, cn cn, cq cq, cz cz, dl dl, boolean flag, 
            AtomicReference atomicreference, ConditionVariable conditionvariable)
    {
        p = b1;
        a = ck;
        b = cw;
        c = dc;
        d = df;
        e = ct;
        f = ce;
        g = di;
        h = ch;
        i = cn;
        j = cq;
        k = cz;
        l = dl;
        m = flag;
        n = atomicreference;
        o = conditionvariable;
        super();
    }

    public final void run()
    {
        d d1 = new d(com.google.android.apps.youtube.api.b.a.b.a(p), com.google.android.apps.youtube.api.b.a.b.b(p), com.google.android.apps.youtube.api.b.a.b.c(p), com.google.android.apps.youtube.api.b.a.b.d(p), a, b, c, d, e, f, g, h, i, j, k, l, m);
        n.set(d1);
        o.open();
    }
}
