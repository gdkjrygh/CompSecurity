// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.IntersectionMatrix;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.b:
//            m, n, f, e, 
//            b, d

public class o extends m
{

    protected f a;
    private Coordinate b;

    public o(Coordinate coordinate, f f1)
    {
        b = coordinate;
        a = f1;
        c = new n(0, -1);
    }

    public final Coordinate a()
    {
        return b;
    }

    public final void a(int i)
    {
        int j;
        int k;
        boolean flag;
        flag = true;
        if (c == null)
        {
            return;
        }
        j = -1;
        if (c != null)
        {
            j = c.a(i);
        }
        k = ((flag) ? 1 : 0);
        j;
        JVM INSTR tableswitch 0 1: default 56
    //                   0 59
    //                   1 69;
           goto _L1 _L2 _L3
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        k = ((flag) ? 1 : 0);
_L5:
        c.b(i, k);
        return;
_L3:
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(int i, int j)
    {
        if (c == null)
        {
            c = new n(i, j);
            return;
        } else
        {
            c.b(i, j);
            return;
        }
    }

    public final void a(e e1)
    {
        a.a(e1);
        e1.a(this);
    }

    protected void a(IntersectionMatrix intersectionmatrix)
    {
    }

    public final f b()
    {
        return a;
    }

    public final boolean c()
    {
        for (Iterator iterator = a.g().iterator(); iterator.hasNext();)
        {
            if (((b)iterator.next()).a().n())
            {
                return true;
            }
        }

        return false;
    }

    public final boolean d()
    {
        return c.b() == 1;
    }
}
