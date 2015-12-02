// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google:
//            gV, f2, gh, bK

final class be
    implements Comparator, Serializable
{

    private be()
    {
    }

    be(bK bk)
    {
        this();
    }

    public int a(f2 f2_1, f2 f2_2)
    {
        int i = gV.c;
        float f = f2_2.c() - f2_1.c();
        byte byte0;
        if ((double)f < 0.0D)
        {
            byte0 = -1;
        } else
        if ((double)f > 0.0D)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (i != 0)
        {
            gh.a++;
        }
        return byte0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((f2)obj, (f2)obj1);
    }
}
