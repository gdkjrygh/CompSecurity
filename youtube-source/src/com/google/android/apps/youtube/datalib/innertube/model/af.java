// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ak;
import com.google.a.a.a.a.kj;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.ov;
import com.google.a.a.a.a.ow;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap, Offlineability

public class af
    implements u
{

    private final ow a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private ap e;
    private Offlineability f;
    private final String g;
    private final boolean h;
    private final kj i;

    public af(ow ow1, String s, boolean flag)
    {
        a = (ow)com.google.android.apps.youtube.common.fromguava.c.a(ow1);
        g = s;
        h = flag;
        s = null;
        ak aak[] = ow1.j;
        int l = aak.length;
        int k = 0;
        do
        {
label0:
            {
                ow1 = s;
                if (k < l)
                {
                    ow1 = aak[k];
                    if (((ak) (ow1)).h == null)
                    {
                        break label0;
                    }
                    ow1 = ((ak) (ow1)).h;
                }
                i = ow1;
                return;
            }
            k++;
        } while (true);
    }

    public final String a()
    {
        return a.b;
    }

    public final String b()
    {
        return a.k;
    }

    public final ap c()
    {
        if (e == null)
        {
            e = new ap(a.c);
        }
        return e;
    }

    public final CharSequence d()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return b;
    }

    public final kz e()
    {
        return a.h;
    }

    public final CharSequence f()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return d;
    }

    public final CharSequence g()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g);
        }
        return c;
    }

    public final boolean h()
    {
        return h;
    }

    public final String i()
    {
        return g;
    }

    public final Offlineability j()
    {
        if (f == null && a.p != null && a.p.b != null)
        {
            f = new Offlineability(a.p.b);
        }
        return f;
    }
}
