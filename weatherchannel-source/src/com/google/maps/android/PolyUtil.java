// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.maps.android:
//            MathUtil

public class PolyUtil
{

    private static final double DEFAULT_TOLERANCE = 0.10000000000000001D;

    private PolyUtil()
    {
    }

    public static boolean containsLocation(LatLng latlng, List list, boolean flag)
    {
        int i = list.size();
        if (i == 0)
        {
            return false;
        }
        double d4 = Math.toRadians(latlng.latitude);
        double d5 = Math.toRadians(latlng.longitude);
        latlng = (LatLng)list.get(i - 1);
        double d = Math.toRadians(latlng.latitude);
        double d1 = Math.toRadians(latlng.longitude);
        i = 0;
        for (latlng = list.iterator(); latlng.hasNext();)
        {
            list = (LatLng)latlng.next();
            double d6 = MathUtil.wrap(d5 - d1, -3.1415926535897931D, 3.1415926535897931D);
            if (d4 == d && d6 == 0.0D)
            {
                return true;
            }
            double d3 = Math.toRadians(((LatLng) (list)).latitude);
            double d2 = Math.toRadians(((LatLng) (list)).longitude);
            int j = i;
            if (intersects(d, d3, MathUtil.wrap(d2 - d1, -3.1415926535897931D, 3.1415926535897931D), d4, d6, flag))
            {
                j = i + 1;
            }
            d = d3;
            d1 = d2;
            i = j;
        }

        return (i & 1) != 0;
    }

    public static List decode(String s)
    {
        ArrayList arraylist;
        int i;
        int j;
        int k;
        int k1;
        k1 = s.length();
        arraylist = new ArrayList();
        i = 0;
        k = 0;
        j = 0;
_L5:
        if (i >= k1) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int j1;
        i1 = 1;
        l = 0;
        j1 = i;
_L7:
        i = j1 + 1;
        j1 = s.charAt(j1) - 63 - 1;
        i1 += j1 << l;
        l += 5;
        if (j1 >= 31)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        if ((i1 & 1) != 0)
        {
            l = ~(i1 >> 1);
        } else
        {
            l = i1 >> 1;
        }
        j1 = k + l;
        l = 1;
        k = 0;
        i1 = i;
_L6:
        i = i1 + 1;
        i1 = s.charAt(i1) - 63 - 1;
        l += i1 << k;
        k += 5;
        if (i1 >= 31) goto _L4; else goto _L3
_L3:
        if ((l & 1) != 0)
        {
            k = ~(l >> 1);
        } else
        {
            k = l >> 1;
        }
        j += k;
        arraylist.add(new LatLng((double)j1 * 1.0000000000000001E-05D, (double)j * 1.0000000000000001E-05D));
        k = j1;
          goto _L5
_L2:
        return arraylist;
_L4:
        i1 = i;
          goto _L6
        j1 = i;
          goto _L7
    }

    public static String encode(List list)
    {
        long l = 0L;
        long l1 = 0L;
        StringBuffer stringbuffer = new StringBuffer();
        for (list = list.iterator(); list.hasNext();)
        {
            LatLng latlng = (LatLng)list.next();
            long l3 = Math.round(latlng.latitude * 100000D);
            long l2 = Math.round(latlng.longitude * 100000D);
            encode(l3 - l, stringbuffer);
            encode(l2 - l1, stringbuffer);
            l = l3;
            l1 = l2;
        }

        return stringbuffer.toString();
    }

    private static void encode(long l, StringBuffer stringbuffer)
    {
        if (l < 0L)
        {
            l = ~(l << 1);
        } else
        {
            l <<= 1;
        }
        for (; l >= 32L; l >>= 5)
        {
            stringbuffer.append(Character.toChars((int)((31L & l | 32L) + 63L)));
        }

        stringbuffer.append(Character.toChars((int)(l + 63L)));
    }

    private static boolean intersects(double d, double d1, double d2, double d3, 
            double d4, boolean flag)
    {
        if (d4 >= 0.0D && d4 >= d2 || d4 < 0.0D && d4 < d2)
        {
            return false;
        }
        if (d3 <= -1.5707963267948966D)
        {
            return false;
        }
        if (d <= -1.5707963267948966D || d1 <= -1.5707963267948966D || d >= 1.5707963267948966D || d1 >= 1.5707963267948966D)
        {
            return false;
        }
        if (d2 <= -3.1415926535897931D)
        {
            return false;
        }
        double d5 = ((d2 - d4) * d + d1 * d4) / d2;
        if (d >= 0.0D && d1 >= 0.0D && d3 < d5)
        {
            return false;
        }
        if (d <= 0.0D && d1 <= 0.0D && d3 >= d5)
        {
            return true;
        }
        if (d3 >= 1.5707963267948966D)
        {
            return true;
        }
        if (flag)
        {
            return Math.tan(d3) >= tanLatGC(d, d1, d2, d4);
        }
        return MathUtil.mercator(d3) >= mercatorLatRhumb(d, d1, d2, d4);
    }

    public static boolean isLocationOnEdge(LatLng latlng, List list, boolean flag)
    {
        return isLocationOnEdge(latlng, list, flag, 0.10000000000000001D);
    }

    public static boolean isLocationOnEdge(LatLng latlng, List list, boolean flag, double d)
    {
        return isLocationOnEdgeOrPath(latlng, list, true, flag, d);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latlng, List list, boolean flag, boolean flag1, double d)
    {
        int i = list.size();
        if (i == 0)
        {
            return false;
        }
        double d10 = d / 6371009D;
        double d7 = MathUtil.hav(d10);
        double d8 = Math.toRadians(latlng.latitude);
        double d9 = Math.toRadians(latlng.longitude);
        double d1;
        double d2;
        if (flag)
        {
            i--;
        } else
        {
            i = 0;
        }
        latlng = (LatLng)list.get(i);
        d2 = Math.toRadians(latlng.latitude);
        d1 = Math.toRadians(latlng.longitude);
        if (flag1)
        {
            for (latlng = list.iterator(); latlng.hasNext();)
            {
                list = (LatLng)latlng.next();
                double d3 = Math.toRadians(((LatLng) (list)).latitude);
                d = Math.toRadians(((LatLng) (list)).longitude);
                if (isOnSegmentGC(d2, d1, d3, d, d8, d9, d7))
                {
                    return true;
                }
                d2 = d3;
                d1 = d;
            }

        } else
        {
            d = MathUtil.mercator(d2);
            double d11 = MathUtil.mercator(d8);
            latlng = new double[3];
            for (list = list.iterator(); list.hasNext();)
            {
                LatLng latlng1 = (LatLng)list.next();
                double d6 = Math.toRadians(latlng1.latitude);
                double d4 = MathUtil.mercator(d6);
                double d5 = Math.toRadians(latlng1.longitude);
                if (Math.max(d2, d6) >= d8 - d10 && Math.min(d2, d6) <= d8 + d10)
                {
                    d2 = MathUtil.wrap(d5 - d1, -3.1415926535897931D, 3.1415926535897931D);
                    d1 = MathUtil.wrap(d9 - d1, -3.1415926535897931D, 3.1415926535897931D);
                    latlng[0] = d1;
                    latlng[1] = 6.2831853071795862D + d1;
                    latlng[2] = d1 - 6.2831853071795862D;
                    int k = latlng.length;
                    double d12;
                    double d13;
                    for (int j = 0; j < k; j++)
                    {
                        d12 = latlng[j];
                        d13 = d4 - d;
                        d1 = d2 * d2 + d13 * d13;
                        if (d1 <= 0.0D)
                        {
                            d1 = 0.0D;
                        } else
                        {
                            d1 = MathUtil.clamp((d12 * d2 + (d11 - d) * d13) / d1, 0.0D, 1.0D);
                        }
                        if (MathUtil.havDistance(d8, MathUtil.inverseMercator(d + d1 * d13), d12 - d1 * d2) < d7)
                        {
                            return true;
                        }
                    }

                }
                d2 = d6;
                d1 = d5;
                d = d4;
            }

        }
        return false;
    }

    public static boolean isLocationOnPath(LatLng latlng, List list, boolean flag)
    {
        return isLocationOnPath(latlng, list, flag, 0.10000000000000001D);
    }

    public static boolean isLocationOnPath(LatLng latlng, List list, boolean flag, double d)
    {
        return isLocationOnEdgeOrPath(latlng, list, false, flag, d);
    }

    private static boolean isOnSegmentGC(double d, double d1, double d2, double d3, 
            double d4, double d5, double d6)
    {
        double d7 = MathUtil.havDistance(d, d4, d1 - d5);
        if (d7 <= d6)
        {
            return true;
        }
        double d8 = MathUtil.havDistance(d2, d4, d3 - d5);
        if (d8 <= d6)
        {
            return true;
        }
        d4 = sinDeltaBearing(d, d1, d2, d3, d4, d5);
        d4 = MathUtil.havFromSin(MathUtil.sinFromHav(d7) * d4);
        if (d4 > d6)
        {
            return false;
        }
        d = MathUtil.havDistance(d, d2, d1 - d3);
        d1 = d + (1.0D - 2D * d) * d4;
        if (d7 > d1 || d8 > d1)
        {
            return false;
        }
        if (d < 0.73999999999999999D)
        {
            return true;
        }
        d = 1.0D - 2D * d4;
        return MathUtil.sinSumFromHav((d7 - d4) / d, (d8 - d4) / d) > 0.0D;
    }

    private static double mercatorLatRhumb(double d, double d1, double d2, double d3)
    {
        return (MathUtil.mercator(d) * (d2 - d3) + MathUtil.mercator(d1) * d3) / d2;
    }

    private static double sinDeltaBearing(double d, double d1, double d2, double d3, 
            double d4, double d5)
    {
        double d6 = Math.sin(d);
        double d7 = Math.cos(d2);
        double d8 = Math.cos(d4);
        d5 -= d1;
        double d9 = d3 - d1;
        d1 = Math.sin(d5) * d8;
        d3 = Math.sin(d9) * d7;
        d4 = Math.sin(d4 - d) + 2D * d6 * d8 * MathUtil.hav(d5);
        d = Math.sin(d2 - d) + 2D * d6 * d7 * MathUtil.hav(d9);
        d2 = (d1 * d1 + d4 * d4) * (d3 * d3 + d * d);
        if (d2 <= 0.0D)
        {
            return 1.0D;
        } else
        {
            return (d1 * d - d4 * d3) / Math.sqrt(d2);
        }
    }

    private static double tanLatGC(double d, double d1, double d2, double d3)
    {
        return (Math.tan(d) * Math.sin(d2 - d3) + Math.tan(d1) * Math.sin(d3)) / Math.sin(d2);
    }
}
