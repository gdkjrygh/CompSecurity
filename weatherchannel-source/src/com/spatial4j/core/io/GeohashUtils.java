// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import java.util.Arrays;

public class GeohashUtils
{

    public static final int MAX_PRECISION = 24;
    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 
        'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
        'y', 'z'
    };
    private static final int b[];
    private static final int c[] = {
        16, 8, 4, 2, 1
    };
    private static final double d[];
    private static final double e[];
    private static boolean f;

    private GeohashUtils()
    {
    }

    public static Point decode(String s, SpatialContext spatialcontext)
    {
        s = decodeBoundary(s, spatialcontext);
        double d1 = (s.getMinY() + s.getMaxY()) / 2D;
        double d2 = s.getMinX();
        return spatialcontext.makePoint((s.getMaxX() + d2) / 2D, d1);
    }

    public static Rectangle decodeBoundary(String s, SpatialContext spatialcontext)
    {
        double d2 = -90D;
        double d1 = 90D;
        double d4 = -180D;
        double d3 = 180D;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++)
        {
            int k = s.charAt(i);
            int j = k;
            if (k >= 'A')
            {
                j = k;
                if (k <= 'Z')
                {
                    j = (char)(k + 32);
                }
            }
            k = b[j - a[0]];
            int ai[] = c;
            j = 0;
            while (j < 5) 
            {
                int l = ai[j];
                if (flag)
                {
                    if ((l & k) != 0)
                    {
                        d4 = (d4 + d3) / 2D;
                    } else
                    {
                        d3 = (d3 + d4) / 2D;
                    }
                } else
                if ((l & k) != 0)
                {
                    d2 = (d2 + d1) / 2D;
                } else
                {
                    d1 = (d1 + d2) / 2D;
                }
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j++;
            }
        }

        return spatialcontext.makeRectangle(d4, d3, d2, d1);
    }

    public static String encodeLatLon(double d1, double d2)
    {
        return encodeLatLon(d1, d2, 12);
    }

    public static String encodeLatLon(double d1, double d2, int i)
    {
        double ad[] = new double[2];
        double[] _tmp = ad;
        ad[0] = -90D;
        ad[1] = 90D;
        double ad1[] = new double[2];
        double[] _tmp1 = ad1;
        ad1[0] = -180D;
        ad1[1] = 180D;
        StringBuilder stringbuilder = new StringBuilder(i);
        boolean flag = true;
        int j = 0;
        int k = 0;
        while (stringbuilder.length() < i) 
        {
            if (flag)
            {
                double d3 = (ad1[0] + ad1[1]) / 2D;
                if (d2 > d3)
                {
                    k |= c[j];
                    ad1[0] = d3;
                } else
                {
                    ad1[1] = d3;
                }
            } else
            {
                double d4 = (ad[0] + ad[1]) / 2D;
                if (d1 > d4)
                {
                    k |= c[j];
                    ad[0] = d4;
                } else
                {
                    ad[1] = d4;
                }
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j < 4)
            {
                j++;
            } else
            {
                stringbuilder.append(a[k]);
                j = 0;
                k = 0;
            }
        }
        return stringbuilder.toString();
    }

    public static String[] getSubGeohashes(String s)
    {
        Object aobj[] = a;
        aobj = new String[32];
        int i = 0;
        do
        {
            char ac[] = a;
            if (i < 32)
            {
                char c1 = a[i];
                aobj[i] = (new StringBuilder()).append(s).append(c1).toString();
                i++;
            } else
            {
                return ((String []) (aobj));
            }
        } while (true);
    }

    public static double[] lookupDegreesSizeForHashLen(int i)
    {
        return (new double[] {
            d[i], e[i]
        });
    }

    public static int lookupHashLenForWidthHeight(double d1, double d2)
    {
        for (int i = 1; i < 24; i++)
        {
            double d3 = d[i];
            double d4 = e[i];
            if (d3 < d2 && d4 < d1)
            {
                return i;
            }
        }

        return 24;
    }

    static 
    {
        char ac[];
        char ac2[];
        boolean flag1;
        if (!com/spatial4j/core/io/GeohashUtils.desiredAssertionStatus())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        f = flag1;
        ac = a;
        ac2 = a;
        b = new int[(ac[31] - a[0]) + 1];
        if (!f && b.length >= 100)
        {
            throw new AssertionError();
        }
        Arrays.fill(b, -500);
        int i = 0;
        do
        {
            char ac1[] = a;
            if (i >= 32)
            {
                break;
            }
            b[a[i] - a[0]] = i;
            i++;
        } while (true);
        d = new double[25];
        e = new double[25];
        d[0] = 180D;
        e[0] = 360D;
        int j = 1;
        boolean flag = false;
        while (j <= 24) 
        {
            double ad[] = d;
            double d1 = d[j - 1];
            int k;
            if (flag)
            {
                k = 8;
            } else
            {
                k = 4;
            }
            ad[j] = d1 / (double)k;
            ad = e;
            d1 = e[j - 1];
            if (flag)
            {
                k = 4;
            } else
            {
                k = 8;
            }
            ad[j] = d1 / (double)k;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j++;
        }
    }
}
