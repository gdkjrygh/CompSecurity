// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.g.a;

// Referenced classes of package com.vividsolutions.jts.geom:
//            j, o, n, i, 
//            GeometryFactory

public class q extends j
    implements o
{

    private static final long serialVersionUID = 0x7155d2ab4afa7f8dL;

    public q(n an[], GeometryFactory geometryfactory)
    {
        super(an, geometryfactory);
    }

    public boolean equalsExact(i k, double d)
    {
        if (!isEquivalentClass(k))
        {
            return false;
        } else
        {
            return super.equalsExact(k, d);
        }
    }

    public i getBoundary()
    {
        return (new a(this)).a();
    }

    public int getBoundaryDimension()
    {
        byte byte0 = 0;
        if (!isEmpty()) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        if (k != 0)
        {
            byte0 = -1;
        }
        return byte0;
_L2:
        k = 0;
        do
        {
            if (k >= a.length)
            {
                break;
            }
            if (!((n)a[k]).d())
            {
                k = 0;
                continue; /* Loop/switch isn't completed */
            }
            k++;
        } while (true);
        k = 1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getDimension()
    {
        return 1;
    }

    public String getGeometryType()
    {
        return "MultiLineString";
    }

    public i reverse()
    {
        int l = a.length;
        n an[] = new n[l];
        for (int k = 0; k < a.length; k++)
        {
            an[l - 1 - k] = (n)a[k].reverse();
        }

        return getFactory().createMultiLineString(an);
    }
}
