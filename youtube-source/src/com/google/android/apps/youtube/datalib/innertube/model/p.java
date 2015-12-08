// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.iq;
import com.google.a.a.a.a.ir;
import com.google.a.a.a.a.is;
import com.google.a.a.a.a.qu;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            e, f, h, g

public final class p
{

    private final iq a;
    private List b;
    private CharSequence c;
    private CharSequence d;

    public p(iq iq1)
    {
        a = iq1;
    }

    public final List a()
    {
        if (b == null)
        {
            b = new ArrayList(a.b.length);
            is ais[] = a.b;
            int j = ais.length;
            for (int i = 0; i < j; i++)
            {
                is is1 = ais[i];
                if (is1.d != null)
                {
                    b.add(new e(is1.d));
                }
                if (is1.c != null)
                {
                    b.add(new f(is1.c));
                }
                if (is1.b != null)
                {
                    b.add(new h(is1.b));
                }
                if (is1.e != null)
                {
                    b.add(new g(is1.e));
                }
            }

        }
        return b;
    }

    public final qu b()
    {
        if (a.d == null)
        {
            return null;
        } else
        {
            return a.d.b;
        }
    }

    public final CharSequence c()
    {
        if (d == null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e);
        }
        return d;
    }

    public final CharSequence d()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.c);
        }
        return c;
    }
}
