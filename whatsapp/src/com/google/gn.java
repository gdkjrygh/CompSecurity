// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.google:
//            aZ, c6, bC, gh, 
//            fT

final class gn
    implements Comparator, Serializable
{

    private gn()
    {
    }

    gn(fT ft)
    {
        this();
    }

    public int a(c6 c6_1, c6 c6_2)
    {
        int j = aZ.d;
        int i = ((Integer)c6_1.b().get(bC.STRUCTURED_APPEND_SEQUENCE)).intValue();
        int k = ((Integer)c6_2.b().get(bC.STRUCTURED_APPEND_SEQUENCE)).intValue();
        if (i < k)
        {
            i = -1;
        } else
        {
            if (i > k)
            {
                return 1;
            }
            i = 0;
            if (j != 0)
            {
                gh.a++;
                return 0;
            }
        }
        return i;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c6)obj, (c6)obj1);
    }
}
