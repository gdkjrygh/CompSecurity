// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.rd;
import com.google.a.a.a.a.re;
import com.google.a.a.a.a.ue;
import com.google.a.a.a.a.uf;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ak, f, h, e

public class ar extends ak
{

    private final rd a;
    private final ue b;
    private List c;
    private CharSequence d;
    private CharSequence e;

    public ar(rd rd1)
    {
        super(rd1);
        a = (rd)com.google.android.apps.youtube.common.fromguava.c.a(rd1);
        if (a.f != null)
        {
            rd1 = a.f.e;
        } else
        {
            rd1 = null;
        }
        b = rd1;
    }

    public final List g()
    {
        if (c == null && b != null)
        {
            c = new ArrayList(b.b.length);
            uf auf[] = b.b;
            int l = auf.length;
            int k = 0;
            while (k < l) 
            {
                uf uf1 = auf[k];
                if (uf1.c != null)
                {
                    c.add(new f(uf1.c));
                } else
                if (uf1.b != null)
                {
                    c.add(new h(uf1.b));
                } else
                if (uf1.d != null)
                {
                    c.add(new e(uf1.d));
                }
                k++;
            }
        }
        return c;
    }

    public final int h()
    {
        if (b == null || b.c == 0)
        {
            return 3;
        } else
        {
            return b.c;
        }
    }

    public final CharSequence i()
    {
        if (b != null && b.d != null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(b.d);
        }
        return d;
    }

    public final CharSequence j()
    {
        if (b != null && b.e != null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(b.e);
        }
        return e;
    }
}
