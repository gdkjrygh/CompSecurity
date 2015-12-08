// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.am;
import com.google.a.a.a.a.jx;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.sd;
import com.google.a.a.a.a.si;
import com.google.a.a.a.a.uw;
import com.google.a.a.a.a.ux;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap, am

public class at
    implements u
{

    private final uw a;
    private String b;
    private ap c;
    private final kz d;
    private CharSequence e;
    private CharSequence f;
    private com.google.android.apps.youtube.datalib.innertube.model.am g;

    public at(uw uw1)
    {
        a = (uw)com.google.android.apps.youtube.common.fromguava.c.a(uw1);
        d = uw1.e;
        if (d != null)
        {
            if (d.c != null && d.c.b != null)
            {
                b = d.c.b;
            } else
            if (d.o != null && d.o.b != null)
            {
                b = d.o.b;
                return;
            }
        }
    }

    public final CharSequence a()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.c);
        }
        return e;
    }

    public final CharSequence b()
    {
        if (f == null)
        {
            f = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return f;
    }

    public final ap c()
    {
        if (c == null)
        {
            c = new ap(a.b);
        }
        return c;
    }

    public final com.google.android.apps.youtube.datalib.innertube.model.am d()
    {
        if (g != null || a.g == null || a.g.b == null) goto _L2; else goto _L1
_L1:
        g = new com.google.android.apps.youtube.datalib.innertube.model.am(a.g.b);
_L4:
        return g;
_L2:
        if (g == null && a.d != null)
        {
            int i = a.d.b;
            sd sd1;
            boolean flag;
            if (i != 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sd1 = new sd();
            sd1.e = flag;
            sd1.h = b;
            sd1.g = i;
            g = new com.google.android.apps.youtube.datalib.innertube.model.am(sd1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final kz e()
    {
        return d;
    }
}
