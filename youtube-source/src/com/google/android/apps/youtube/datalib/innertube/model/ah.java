// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.net.Uri;
import com.google.a.a.a.a.fk;
import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.pj;
import com.google.a.a.a.a.pk;
import com.google.a.a.a.a.sc;
import com.google.a.a.a.a.vb;
import com.google.a.a.a.a.w;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, ap

public class ah
    implements u
{

    private final pk a;
    private ap b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;
    private CharSequence f;
    private ap g;
    private CharSequence h;
    private kz i;
    private List j;
    private List k;
    private vb l;
    private w m;

    public ah(pk pk1)
    {
        a = (pk)com.google.android.apps.youtube.common.fromguava.c.a(pk1);
        if (pk1.k != null)
        {
            l = pk1.k.b;
            m = pk1.k.c;
        }
    }

    public static List a(String as[])
    {
        if (as.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList(as.length);
        int j1 = as.length;
        int i1 = 0;
        do
        {
            obj = arraylist;
            if (i1 >= j1)
            {
                continue;
            }
            arraylist.add(Uri.parse(as[i1]));
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a()
    {
        return a.b;
    }

    public final ap b()
    {
        if (b == null)
        {
            b = new ap(a.c);
        }
        return b;
    }

    public final CharSequence c()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return c;
    }

    public final CharSequence d()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e);
        }
        return d;
    }

    public final kz e()
    {
        return a.j;
    }

    public final CharSequence f()
    {
        if (e == null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return e;
    }

    public final CharSequence g()
    {
        if (f == null)
        {
            f = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g);
        }
        return f;
    }

    public final ap h()
    {
        if (g == null)
        {
            g = new ap(a.h);
        }
        return g;
    }

    public final CharSequence i()
    {
        if (h == null)
        {
            h = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.i);
        }
        return h;
    }

    public final kz j()
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        if (l == null || l.b == null || l.b.b[0] == null) goto _L4; else goto _L3
_L3:
        i = l.b.b[0].f;
_L2:
        return i;
_L4:
        if (m != null && m.b != null && m.b.b[0] != null)
        {
            i = m.b.b[0].f;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final vb k()
    {
        return l;
    }

    public final w l()
    {
        return m;
    }

    public final List m()
    {
        if (j == null)
        {
            j = a(a.l);
        }
        return j;
    }

    public final List n()
    {
        if (k == null)
        {
            k = a(a.m);
        }
        return k;
    }
}
