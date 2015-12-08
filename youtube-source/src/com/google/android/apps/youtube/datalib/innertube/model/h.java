// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.TextUtils;
import com.google.a.a.a.a.ak;
import com.google.a.a.a.a.dj;
import com.google.a.a.a.a.dk;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, t, ap, Offlineability

public class h
    implements u
{

    private dj a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private ap f;
    private Offlineability g;
    private final t h;

    public h(dj dj1)
    {
        a = (dj)com.google.android.apps.youtube.common.fromguava.c.a(dj1);
        Object obj = null;
        ak aak[] = dj1.m;
        int j = aak.length;
        int i = 0;
        do
        {
label0:
            {
                dj1 = obj;
                if (i < j)
                {
                    dj1 = aak[i];
                    if (((ak) (dj1)).h == null)
                    {
                        break label0;
                    }
                    dj1 = new t(((ak) (dj1)).h);
                }
                h = dj1;
                return;
            }
            i++;
        } while (true);
    }

    public final String a()
    {
        return a.b;
    }

    public final CharSequence b()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return b;
    }

    public final CharSequence c()
    {
        if (c == null && a.f != null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
            if (a.g != null)
            {
                android.text.Spanned spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g);
                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(spanned))
                {
                    c = TextUtils.concat(new CharSequence[] {
                        c, " \267 ", spanned
                    });
                }
            }
        }
        return c;
    }

    public final CharSequence d()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.h);
        }
        return d;
    }

    public final kz e()
    {
        return a.i;
    }

    public final CharSequence f()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.k);
        }
        return e;
    }

    public final ap g()
    {
        if (f == null)
        {
            f = new ap(a.c);
        }
        return f;
    }

    public final Offlineability h()
    {
        if (g == null && a.p != null && a.p.b != null)
        {
            g = new Offlineability(a.p.b);
        }
        return g;
    }
}
