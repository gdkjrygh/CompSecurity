// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g;

import com.vividsolutions.jts.a.b;
import com.vividsolutions.jts.a.k;
import com.vividsolutions.jts.a.r;
import com.vividsolutions.jts.b.l;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.u;

public class c
{

    protected final k a;
    protected l b[];
    private u c;

    public c(i j, i i1)
    {
        this(j, i1, b.b);
    }

    private c(i j, i i1, b b1)
    {
        a = new r();
        if (j.getPrecisionModel().compareTo(i1.getPrecisionModel()) >= 0)
        {
            a(j.getPrecisionModel());
        } else
        {
            a(i1.getPrecisionModel());
        }
        b = new l[2];
        b[0] = new l(0, j, b1);
        b[1] = new l(1, i1, b1);
    }

    private void a(u u1)
    {
        c = u1;
        a.a(c);
    }
}
