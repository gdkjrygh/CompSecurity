// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.distance;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;

public class DistanceUtils
{

    public static final double DEGREES_TO_RADIANS = 0.017453292519943295D;
    public static final double DEG_180_AS_RADS = 3.1415926535897931D;
    public static final double DEG_225_AS_RADS = 3.9269908169872414D;
    public static final double DEG_270_AS_RADS = 4.7123889803846897D;
    public static final double DEG_45_AS_RADS = 0.78539816339744828D;
    public static final double DEG_90_AS_RADS = 1.5707963267948966D;
    public static final double DEG_TO_KM = 111.19507973436875D;
    public static final double EARTH_EQUATORIAL_RADIUS_KM = 6378.1369999999997D;
    public static final double EARTH_EQUATORIAL_RADIUS_MI = 3963.1905904293039D;
    public static final double EARTH_MEAN_RADIUS_KM = 6371.0087714000001D;
    public static final double EARTH_MEAN_RADIUS_MI = 3958.7613145272735D;
    public static final double KM_TO_DEG = 0.0089932036776166346D;
    public static final double KM_TO_MILES = 0.62137119200000002D;
    public static final double MILES_TO_KM = 1.6093440006146922D;
    public static final double RADIANS_TO_DEGREES = 57.295779513082323D;
    public static final double SIN_45_AS_RADS = Math.sin(0.78539816339744828D);

    private DistanceUtils()
    {
    }

    public static Rectangle calcBoxByDistFromPtDEG(double d, double d1, double d2, SpatialContext spatialcontext, Rectangle rectangle)
    {
        double d3;
        if (d2 == 0.0D)
        {
            d3 = d;
            d2 = d;
            d = d1;
            double d4 = d1;
            d1 = d;
            d = d4;
        } else
        if (d2 >= 180D)
        {
            d = -180D;
            d1 = 180D;
            d2 = -90D;
            d3 = 90D;
        } else
        {
            d3 = d + d2;
            double d8 = d - d2;
            if (d3 >= 90D || d8 <= -90D)
            {
                d = -180D;
                d2 = 180D;
                double d6 = d;
                double d5 = d2;
                if (d3 <= 90D)
                {
                    d6 = d;
                    d5 = d2;
                    if (d8 >= -90D)
                    {
                        d6 = normLonDEG(d1 - 90D);
                        d5 = normLonDEG(90D + d1);
                    }
                }
                double d7 = d3;
                if (d3 > 90D)
                {
                    d7 = 90D;
                }
                d = d6;
                d1 = d5;
                d2 = d8;
                d3 = d7;
                if (d8 < -90D)
                {
                    d2 = -90D;
                    d = d6;
                    d1 = d5;
                    d3 = d7;
                }
            } else
            {
                d2 = calcBoxByDistFromPt_deltaLonDEG(d, d1, d2);
                d = normLonDEG(d1 - d2);
                d1 = normLonDEG(d2 + d1);
                d2 = d8;
            }
        }
        if (rectangle == null)
        {
            return spatialcontext.makeRectangle(d, d1, d2, d3);
        } else
        {
            rectangle.reset(d, d1, d2, d3);
            return rectangle;
        }
    }

    public static double calcBoxByDistFromPt_deltaLonDEG(double d, double d1, double d2)
    {
        if (d2 == 0.0D)
        {
            return 0.0D;
        }
        d = toRadians(d);
        d = Math.asin(Math.sin(toRadians(d2)) / Math.cos(d));
        if (!Double.isNaN(d))
        {
            return toDegrees(d);
        } else
        {
            return 90D;
        }
    }

    public static double calcBoxByDistFromPt_latHorizAxisDEG(double d, double d1, double d2)
    {
        if (d2 != 0.0D)
        {
            if (d + d2 >= 90D)
            {
                return 90D;
            }
            if (d - d2 <= -90D)
            {
                return -90D;
            }
            d1 = toRadians(d);
            d2 = toRadians(d2);
            d1 = Math.asin(Math.sin(d1) / Math.cos(d2));
            if (!Double.isNaN(d1))
            {
                return toDegrees(d1);
            }
            if (d > 0.0D)
            {
                return 90D;
            }
            if (d < 0.0D)
            {
                return -90D;
            }
        }
        return d;
    }

    public static double calcLonDegreesAtLat(double d, double d1)
    {
        double d2 = toRadians(d1);
        double d3 = toRadians(d);
        d = Math.cos(d2);
        d1 = Math.cos(d3);
        d2 = Math.sin(d2);
        d3 = Math.sin(d3);
        return toDegrees(Math.atan2(d2 * d1, (1.0D - d3 * d3) * d));
    }

    public static double degrees2Dist(double d, double d1)
    {
        return radians2Dist(toRadians(d), d1);
    }

    public static double dist2Degrees(double d, double d1)
    {
        return toDegrees(dist2Radians(d, d1));
    }

    public static double dist2Radians(double d, double d1)
    {
        return d / d1;
    }

    public static double distHaversineRAD(double d, double d1, double d2, double d3)
    {
        if (d == d2 && d1 == d3)
        {
            return 0.0D;
        } else
        {
            d1 = Math.sin((d1 - d3) * 0.5D);
            d3 = Math.sin((d - d2) * 0.5D);
            d = d1 * (Math.cos(d) * Math.cos(d2) * d1) + d3 * d3;
            return Math.atan2(Math.sqrt(d), Math.sqrt(1.0D - d)) * 2D;
        }
    }

    public static double distLawOfCosinesRAD(double d, double d1, double d2, double d3)
    {
        if (d == d2 && d1 == d3)
        {
            return 0.0D;
        }
        double d4 = 1.5707963267948966D - d;
        double d5 = 1.5707963267948966D - d2;
        d = Math.cos(d4);
        d2 = Math.cos(d5);
        d4 = Math.sin(d4);
        d5 = Math.sin(d5);
        d = Math.cos(d3 - d1) * (d4 * d5) + d * d2;
        if (d < -1D)
        {
            return 3.1415926535897931D;
        }
        if (d >= 1.0D)
        {
            return 0.0D;
        } else
        {
            return Math.acos(d);
        }
    }

    public static double distSquaredCartesian(double ad[], double ad1[])
    {
        double d = 0.0D;
        for (int i = 0; i < ad.length; i++)
        {
            double d1 = ad[i] - ad1[i];
            d += d1 * d1;
        }

        return d;
    }

    public static double distVincentyRAD(double d, double d1, double d2, double d3)
    {
        if (d == d2 && d1 == d3)
        {
            return 0.0D;
        } else
        {
            double d4 = Math.cos(d);
            double d5 = Math.cos(d2);
            d = Math.sin(d);
            d2 = Math.sin(d2);
            d3 -= d1;
            d1 = Math.cos(d3);
            d3 = Math.sin(d3) * d5;
            double d6 = d4 * d2 - d * d5 * d1;
            return Math.atan2(Math.sqrt(d3 * d3 + d6 * d6), d4 * d5 * d1 + d * d2);
        }
    }

    public static double normLatDEG(double d)
    {
        if (d >= -90D && d <= 90D)
        {
            return d;
        }
        d = Math.abs((d + 90D) % 360D);
        if (d > 180D)
        {
            d = 360D - d;
        }
        return d - 90D;
    }

    public static double normLonDEG(double d)
    {
        if (d >= -180D && d <= 180D)
        {
            return d;
        }
        double d1 = (d + 180D) % 360D;
        if (d1 < 0.0D)
        {
            return d1 + 180D;
        }
        if (d1 == 0.0D && d > 0.0D)
        {
            return 180D;
        } else
        {
            return d1 - 180D;
        }
    }

    public static Point pointOnBearingRAD(double d, double d1, double d2, double d3, 
            SpatialContext spatialcontext, Point point)
    {
        double d5 = Math.cos(d2);
        double d6 = Math.cos(d);
        d2 = Math.sin(d2);
        d = Math.sin(d);
        double d7 = d6 * d2 * Math.cos(d3) + d * d5;
        double d4 = Math.asin(d7);
        d = Math.atan2(d6 * (d2 * Math.sin(d3)), d5 - d * d7) + d1;
        if (d > 3.1415926535897931D)
        {
            d1 = (3.1415926535897931D - (d - 3.1415926535897931D)) * -1D;
        } else
        {
            d1 = d;
            if (d < -3.1415926535897931D)
            {
                d1 = d + 3.1415926535897931D + 3.1415926535897931D;
            }
        }
        if (d4 > 1.5707963267948966D)
        {
            d2 = 1.5707963267948966D - (d4 - 1.5707963267948966D);
            if (d1 < 0.0D)
            {
                d = d1 + 3.1415926535897931D;
            } else
            {
                d = d1 - 3.1415926535897931D;
            }
        } else
        {
            d = d1;
            d2 = d4;
            if (d4 < -1.5707963267948966D)
            {
                d2 = -1.5707963267948966D - (d4 + 1.5707963267948966D);
                if (d1 < 0.0D)
                {
                    d = d1 + 3.1415926535897931D;
                } else
                {
                    d = d1 - 3.1415926535897931D;
                }
            }
        }
        if (point == null)
        {
            return spatialcontext.makePoint(d, d2);
        } else
        {
            point.reset(d, d2);
            return point;
        }
    }

    public static double radians2Dist(double d, double d1)
    {
        return d * d1;
    }

    public static double toDegrees(double d)
    {
        return 57.295779513082323D * d;
    }

    public static double toRadians(double d)
    {
        return 0.017453292519943295D * d;
    }

    public static double[] vectorBoxCorner(double ad[], double ad1[], double d, boolean flag)
    {
        double ad2[];
label0:
        {
            if (ad1 != null)
            {
                ad2 = ad1;
                if (ad1.length == ad.length)
                {
                    break label0;
                }
            }
            ad2 = new double[ad.length];
        }
        double d1 = d;
        if (!flag)
        {
            d1 = -d;
        }
        d = SIN_45_AS_RADS;
        for (int i = 0; i < ad.length; i++)
        {
            ad2[i] = ad[i] + d1 * d;
        }

        return ad2;
    }

    public static double vectorDistance(double ad[], double ad1[], double d)
    {
        double d1;
        if (d == 0.0D || d == 1.0D || d == 2D)
        {
            d1 = (0.0D / 0.0D);
        } else
        {
            d1 = 1.0D / d;
        }
        return vectorDistance(ad, ad1, d, d1);
    }

    public static double vectorDistance(double ad[], double ad1[], double d, double d1)
    {
        double d2 = 0.0D;
        if (d != 0.0D) goto _L2; else goto _L1
_L1:
        int i = 0;
        do
        {
            d = d2;
            if (i >= ad.length)
            {
                break;
            }
            if (ad[i] - ad1[i] == 0.0D)
            {
                d = 0.0D;
            } else
            {
                d = 1.0D;
            }
            d2 += d;
            i++;
        } while (true);
          goto _L3
_L2:
        if (d != 1.0D) goto _L5; else goto _L4
_L4:
        int j = 0;
        do
        {
            d = d2;
            if (j >= ad.length)
            {
                break;
            }
            d2 += Math.abs(ad[j] - ad1[j]);
            j++;
        } while (true);
          goto _L3
_L5:
        if (d != 2D) goto _L7; else goto _L6
_L6:
        d = Math.sqrt(distSquaredCartesian(ad, ad1));
_L3:
        return d;
_L7:
label0:
        {
            if (d != 2147483647D && !Double.isInfinite(d))
            {
                break label0;
            }
            int k = 0;
            do
            {
                d = d2;
                if (k >= ad.length)
                {
                    break;
                }
                d2 = Math.max(d2, Math.max(ad[k], ad1[k]));
                k++;
            } while (true);
        }
        if (true) goto _L3; else goto _L8
_L8:
        for (int l = 0; l < ad.length; l++)
        {
            d2 += Math.pow(ad[l] - ad1[l], d);
        }

        return Math.pow(d2, d1);
    }

}
