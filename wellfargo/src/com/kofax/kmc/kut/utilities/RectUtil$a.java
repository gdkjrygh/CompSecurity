// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import android.graphics.Point;
import java.util.Comparator;

class a
    implements Comparator
{

    private final Point a;

    public int a(Point point, Point point1)
    {
        int i;
        i = 1;
        if (point == null || point1 == null)
        {
            throw new IllegalArgumentException("neither a nor b can be null");
        }
        if (point.x - a.x < 0 || point1.x - a.x >= 0) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (point.x - a.x < 0 && point1.x - a.x >= 0)
        {
            return 1;
        }
        if (point.x - a.x != 0 || point1.x - a.x != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (point.y - a.y >= 0 || point1.y - a.y >= 0)
        {
            if (point.y <= point1.y)
            {
                return 1;
            }
        } else
        {
            if (point1.y <= point.y)
            {
                i = -1;
            }
            return i;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j = (point.x - a.x) * (point1.y - a.y) - (point1.x - a.x) * (point.y - a.y);
        if (j >= 0)
        {
            if (j > 0)
            {
                return 1;
            }
            if ((point.x - a.x) * (point.x - a.x) + (point.y - a.y) * (point.y - a.y) > (point1.x - a.x) * (point1.x - a.x) + (point1.y - a.y) * (point1.y - a.y))
            {
                return 1;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Point)obj, (Point)obj1);
    }

    public (Point point)
    {
        if (point == null)
        {
            throw new IllegalArgumentException("center cannot be null");
        } else
        {
            a = point;
            return;
        }
    }
}
