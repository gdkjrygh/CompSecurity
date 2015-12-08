// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.util.Comparator;

// Referenced classes of package com.vividsolutions.jts.geom:
//            d

public final class e
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (d)obj;
        obj1 = (d)obj1;
        int i1 = ((d) (obj)).b();
        int j1 = ((d) (obj1)).b();
        int k = ((d) (obj)).a();
        int l = ((d) (obj1)).a();
        double d1;
        double d2;
        int i;
        int j;
        boolean flag;
        if (l < k)
        {
            i = l;
        } else
        {
            i = k;
        }
        flag = false;
        if (i >= 0)
        {
            i = 1;
            j = 0;
        } else
        {
            j = i;
            i = ((flag) ? 1 : 0);
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (k >= l) goto _L4; else goto _L3
_L3:
        l = -1;
_L8:
        return l;
_L4:
        if (k > l)
        {
            return 1;
        }
_L2:
        k = 0;
_L9:
        if (k >= i1 || k >= j1)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        l = 0;
_L11:
label0:
        {
            if (l >= j)
            {
                break MISSING_BLOCK_LABEL_240;
            }
            d1 = ((d) (obj)).a(k, l);
            d2 = ((d) (obj1)).a(k, l);
            if (d1 < d2)
            {
                i = -1;
            } else
            if (d1 > d2)
            {
                i = 1;
            } else
            if (Double.isNaN(d1))
            {
                if (Double.isNaN(d2))
                {
                    break label0;
                }
                i = -1;
            } else
            {
                if (!Double.isNaN(d2))
                {
                    break label0;
                }
                i = 1;
            }
        }
_L10:
        if (i == 0) goto _L6; else goto _L5
_L5:
        l = i;
        if (i != 0) goto _L8; else goto _L7
_L7:
        k++;
          goto _L9
        i = 0;
          goto _L10
_L6:
        l++;
          goto _L11
        i = 0;
          goto _L5
        if (k < i1)
        {
            return 1;
        }
        if (k < j1)
        {
            return -1;
        }
        return 0;
          goto _L9
    }
}
