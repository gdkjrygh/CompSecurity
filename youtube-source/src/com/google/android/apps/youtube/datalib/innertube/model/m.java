// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ht;
import com.google.a.a.a.a.hu;
import com.google.a.a.a.a.hw;
import com.google.a.a.a.a.ia;
import com.google.a.a.a.a.id;
import com.google.a.a.a.a.rk;
import com.google.a.a.a.a.rl;
import com.google.a.a.a.a.rm;
import com.google.a.a.a.a.rn;
import java.util.Arrays;
import java.util.List;

public final class m
{

    private ia a;
    private rn b;
    private rm c;
    private rk d;
    private rl e;
    private List f;

    public m(ia ia1)
    {
        a = ia1;
    }

    public final rn a()
    {
        if (b == null)
        {
            rn rn;
            if (a.b != null)
            {
                rn = a.b.b;
            } else
            {
                rn = null;
            }
            b = rn;
        }
        return b;
    }

    public final rm b()
    {
        if (c == null)
        {
            rm rm1;
            if (a.c != null)
            {
                rm1 = a.c.b;
            } else
            {
                rm1 = null;
            }
            c = rm1;
        }
        return c;
    }

    public final rk c()
    {
        if (d == null)
        {
            rk rk;
            if (b() != null && b().e != null)
            {
                rk = b().e.b;
            } else
            {
                rk = null;
            }
            d = rk;
        }
        return d;
    }

    public final rl d()
    {
        if (e == null)
        {
            rl rl;
            if (b() != null && b().f != null)
            {
                rl = b().f.b;
            } else
            {
                rl = null;
            }
            e = rl;
        }
        return e;
    }

    public final List e()
    {
        if (f == null)
        {
            f = Arrays.asList(a.d);
        }
        return f;
    }
}
