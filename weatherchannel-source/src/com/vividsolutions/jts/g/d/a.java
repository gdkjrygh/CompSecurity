// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.d;

import com.vividsolutions.jts.geom.c.k;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;

final class a extends k
{

    private h a;
    private boolean b;

    public a(h h1)
    {
        b = false;
        a = h1;
    }

    protected final boolean a()
    {
        return b;
    }

    protected final void b(i j)
    {
        j = j.getEnvelopeInternal();
        if (a.c(j))
        {
            if (a.d(j))
            {
                b = true;
                return;
            }
            if (j.d() >= a.d() && j.e() <= a.e())
            {
                b = true;
                return;
            }
            if (j.f() >= a.f() && j.g() <= a.g())
            {
                b = true;
                return;
            }
        }
    }

    public final boolean b()
    {
        return b;
    }
}
