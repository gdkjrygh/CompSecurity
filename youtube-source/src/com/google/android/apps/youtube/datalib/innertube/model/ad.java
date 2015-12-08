// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.Spanned;
import com.google.a.a.a.a.ak;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.oo;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, t, ap

public final class ad
    implements u
{

    private final oo a;
    private final t b;
    private final float c;
    private final boolean d;
    private ap e;

    public ad(oo oo1, float f1, String s)
    {
        int i1 = 0;
        super();
        a = (oo)com.google.android.apps.youtube.common.fromguava.c.a(oo1);
        c = f1;
        ak aak[];
        int j1;
        boolean flag;
        if (s != null && s.startsWith("RQ"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        s = null;
        aak = oo1.m;
        j1 = aak.length;
        do
        {
label0:
            {
                oo1 = s;
                if (i1 < j1)
                {
                    oo1 = aak[i1];
                    if (((ak) (oo1)).h == null)
                    {
                        break label0;
                    }
                    oo1 = new t(((ak) (oo1)).h);
                }
                b = oo1;
                return;
            }
            i1++;
        } while (true);
    }

    public final Spanned a()
    {
        return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
    }

    public final Spanned b()
    {
        return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.l);
    }

    public final Spanned c()
    {
        return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e);
    }

    public final Spanned d()
    {
        return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
    }

    public final kz e()
    {
        return a.h;
    }

    public final String f()
    {
        return a.k;
    }

    public final boolean g()
    {
        return d;
    }

    public final boolean h()
    {
        return a.j != null;
    }

    public final Spanned i()
    {
        return com.google.android.apps.youtube.datalib.innertube.a.b.a(a.j);
    }

    public final boolean j()
    {
        return a.g;
    }

    public final ap k()
    {
        if (e == null)
        {
            e = new ap(a.d);
        }
        return e;
    }

    public final float l()
    {
        return c;
    }
}
