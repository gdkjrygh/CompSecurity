// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ab;
import com.google.a.a.a.a.vk;
import com.google.a.a.a.a.vm;
import com.google.a.a.a.a.vq;
import com.google.a.a.a.a.vv;
import com.google.a.a.a.a.wa;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            aw, ay, av, ax

public class a
{

    private ab a;
    private CharSequence b;
    private CharSequence c;
    private aw d;
    private CharSequence e;
    private boolean f;
    private List g;
    private CharSequence h;
    private List i;
    private CharSequence j;
    private List k;

    public a(ab ab1)
    {
        a = (ab)com.google.android.apps.youtube.common.fromguava.c.a(ab1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return b;
    }

    public final boolean b()
    {
        return a.i;
    }

    public final CharSequence c()
    {
        if (c == null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.j);
        }
        return c;
    }

    public final aw d()
    {
        if (d == null)
        {
            d = new aw(a.f.b);
        }
        return d;
    }

    public final void e()
    {
        vq avq[] = a.h;
        int k1 = avq.length;
        for (int l = 0; l < k1; l++)
        {
            Object obj = avq[l];
            if (((vq) (obj)).c != null)
            {
                obj = ((vq) (obj)).c;
                e = com.google.android.apps.youtube.datalib.innertube.a.b.a(((wa) (obj)).b);
                obj = ((wa) (obj)).c;
                g = new ArrayList(obj.length);
                int l1 = obj.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    com.google.a.a.a.a.vz vz = obj[i1];
                    g.add(new ay(vz));
                }

                continue;
            }
            if (((vq) (obj)).b == null)
            {
                continue;
            }
            obj = ((vq) (obj)).b;
            h = com.google.android.apps.youtube.datalib.innertube.a.b.a(((vk) (obj)).b);
            com.google.a.a.a.a.vj avj[] = ((vk) (obj)).c;
            i = new ArrayList(avj.length);
            int i2 = avj.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                com.google.a.a.a.a.vj vj = avj[j1];
                i.add(new av(vj));
            }

        }

        f = true;
    }

    public final CharSequence f()
    {
        if (!f)
        {
            e();
        }
        return e;
    }

    public final List g()
    {
        if (!f)
        {
            e();
        }
        return g;
    }

    public final CharSequence h()
    {
        if (!f)
        {
            e();
        }
        return h;
    }

    public final List i()
    {
        if (!f)
        {
            e();
        }
        return i;
    }

    public final CharSequence j()
    {
        if (j == null && a.g != null)
        {
            j = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.g.b);
        }
        return j;
    }

    public final List k()
    {
        if (k == null && a.g != null)
        {
            com.google.a.a.a.a.vw avw[] = a.g.c;
            k = new ArrayList(avw.length);
            int i1 = avw.length;
            for (int l = 0; l < i1; l++)
            {
                com.google.a.a.a.a.vw vw = avw[l];
                k.add(new ax(vw));
            }

        }
        return k;
    }
}
