// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.vividsolutions.jts.geom:
//            i, j

public final class k
    implements Iterator
{

    private i a;
    private boolean b;
    private int c;
    private int d;
    private k e;

    public k(i l)
    {
        a = l;
        b = true;
        d = 0;
        c = l.getNumGeometries();
    }

    public final boolean hasNext()
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (e == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (e.hasNext()) goto _L1; else goto _L3
_L3:
        e = null;
        if (d < c) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final Object next()
    {
        k k1 = this;
_L6:
        if (!k1.b) goto _L2; else goto _L1
_L1:
        i l;
        k1.b = false;
        l = k1.a;
_L4:
        return l;
_L2:
        i i1;
        if (k1.e != null)
        {
            if (k1.e.hasNext())
            {
                k1 = k1.e;
                continue; /* Loop/switch isn't completed */
            }
            k1.e = null;
        }
        if (k1.d >= k1.c)
        {
            throw new NoSuchElementException();
        }
        l = k1.a;
        int j1 = k1.d;
        k1.d = j1 + 1;
        i1 = l.getGeometryN(j1);
        l = i1;
        if (!(i1 instanceof j)) goto _L4; else goto _L3
_L3:
        k1.e = new k((j)i1);
        k1 = k1.e;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void remove()
    {
        throw new UnsupportedOperationException(getClass().getName());
    }
}
