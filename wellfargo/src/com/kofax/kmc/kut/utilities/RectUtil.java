// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RectUtil
{

    public RectUtil()
    {
    }

    public static void bound(List list, Rect rect)
    {
        if (list == null || list.size() != 4)
        {
            throw new IllegalArgumentException("points list must be of size equal to 4");
        }
        if (list.indexOf(null) != -1)
        {
            throw new IllegalArgumentException("No point in points may be null");
        }
        if (rect == null)
        {
            throw new IllegalArgumentException("bound may not be null");
        } else
        {
            Point point = (Point)list.get(0);
            Point point1 = (Point)list.get(1);
            Point point2 = (Point)list.get(2);
            list = (Point)list.get(3);
            int i = Math.max(point.x, Math.max(Math.max(point1.x, point2.x), ((Point) (list)).x));
            int j = Math.max(point.y, Math.max(Math.max(point1.y, point2.y), ((Point) (list)).y));
            rect.set(Math.min(point.x, Math.min(Math.min(point1.x, point2.x), ((Point) (list)).x)), Math.min(point.y, Math.min(Math.min(point1.y, point2.y), ((Point) (list)).y)), i, j);
            return;
        }
    }

    public static final void fit(Rect rect, Rect rect1, Point point, double d, double d1)
    {
        if (rect == null || rect.width() <= 0 || rect.height() <= 0)
        {
            throw new IllegalArgumentException("outer rect cannot be null or empty");
        }
        if (rect1 == null)
        {
            throw new IllegalArgumentException("inner rect cannot be null");
        }
        if (d >= 0.0D) goto _L2; else goto _L1
_L1:
        double d2 = 0.0D;
_L4:
        int i;
        int j;
        int l;
        int i1;
        d2 = 0.02D * d2;
        d = (double)rect.width() - (double)rect.width() * d2;
        d2 = (double)rect.height() - d2 * (double)rect.height();
        l = (int)Math.round(((double)rect.width() - d) / 2D);
        i1 = (int)Math.round(d + (double)l);
        i = (int)Math.round(((double)rect.height() - d2) / 2D);
        j = (int)Math.round(d2 + (double)i);
        if (point.x <= l || point.x >= i1)
        {
            throw new IllegalArgumentException("center.x is not inside outer, less padding");
        }
        break; /* Loop/switch isn't completed */
_L2:
        d2 = d;
        if (d > 50D)
        {
            d2 = 50D;
        }
        if (true) goto _L4; else goto _L3
_L3:
        double d3;
        double d4;
        if (point.y <= i || point.y >= j)
        {
            throw new IllegalArgumentException("center.y is not inside outer, less padding");
        }
        l = Math.min(point.x - l, i1 - point.x) * 2;
        i = Math.min(point.y - i, j - point.y) * 2;
        d3 = l;
        d4 = i;
        if (0.0D >= d1 || d1 >= 1.0D) goto _L6; else goto _L5
_L5:
        d2 = d1 * d4;
        d = d4;
_L8:
label0:
        {
            if (d2 <= (double)l)
            {
                d3 = d;
                d1 = d2;
                if (d <= (double)i)
                {
                    break label0;
                }
            }
            d3 = Math.min((double)l / d2, (double)i / d);
            d1 = d2 * d3;
            d3 = d * d3;
        }
        i = (int)Math.round((double)point.x - d1 / 2D);
        int k = (int)Math.round((double)point.y - d3 / 2D);
        rect1.set(i, k, (int)Math.round(d1 + (double)i), (int)Math.round(d3 + (double)k));
        return;
_L6:
        if (d1 > 1.0D)
        {
            d = d3 / d1;
            d2 = d3;
        } else
        {
            d = d4;
            d2 = d3;
            if (d1 == 1.0D)
            {
                if (d3 > d4)
                {
                    d2 = d4;
                    d = d4;
                } else
                {
                    d = d3;
                    d2 = d3;
                }
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static List sort(Point point, Point point1, Point point2, Point point3, Rect rect)
    {
        Rect rect1 = rect;
        if (rect == null)
        {
            rect1 = new Rect();
        }
        rect = new ArrayList();
        rect.add(point);
        rect.add(point1);
        rect.add(point2);
        rect.add(point3);
        point = sort(((List) (rect)), rect1);
        Collections.swap(point, 0, 3);
        Collections.swap(point, 1, 2);
        return point;
    }

    public static List sort(List list, Rect rect)
    {
        bound(list, rect);
        Collections.sort(list, new a(new Point(rect.centerX(), rect.centerY())));
        return list;
    }

    private class a
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

        public a(Point point)
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

}
