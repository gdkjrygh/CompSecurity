// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import com.gtp.go.weather.sharephoto.b.g;
import java.util.Comparator;

final class o
    implements Comparator
{

    o()
    {
    }

    public int a(g g1, g g2)
    {
        if (g1.g() != 2 || g2.g() != 2)
        {
            if (g1.g() < g2.g())
            {
                return 1;
            }
            if (g1.g() > g2.g())
            {
                return -1;
            }
            if (g1.j() < g2.j())
            {
                return 1;
            }
            if (g1.j() > g2.j())
            {
                return -1;
            }
        }
        return 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((g)obj, (g)obj1);
    }
}
