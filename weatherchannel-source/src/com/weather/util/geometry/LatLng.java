// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.geometry;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;

public final class LatLng
{

    public static final double FULL_CIRCLE = 360D;
    public static final double MAX_LATITUDE = 90D;
    public static final double MAX_LONGITUDE = 180D;
    public static final double MIN_LATITUDE = -90D;
    public static final double MIN_LONGITUDE = -180D;
    private static final Range validLatitudes = Range.closed(Double.valueOf(-90D), Double.valueOf(90D));
    private static final Range validLongitudes = Range.closed(Double.valueOf(-180D), Double.valueOf(180D));
    public final double latitude;
    public final double longitude;

    public LatLng(Double double1, Double double2)
    {
        Preconditions.checkArgument(validLatitudes.contains(double1), "%s is not a valid latitude", new Object[] {
            double1
        });
        Preconditions.checkArgument(validLongitudes.contains(double2), "%s is not a valid longitude", new Object[] {
            double2
        });
        latitude = double1.doubleValue();
        longitude = double2.doubleValue();
    }

    public static double clipLatitude(double d)
    {
        double d1;
        if (d > 90D)
        {
            d1 = 90D;
        } else
        {
            d1 = d;
            if (d < -90D)
            {
                return -90D;
            }
        }
        return d1;
    }

    public static boolean isValid(Double double1, Double double2)
    {
        return double1 != null && validLatitudes.contains(double1) && double2 != null && validLongitudes.contains(double2);
    }

    public static LatLng makeValid(Double double1, Double double2)
    {
        return new LatLng(Double.valueOf(clipLatitude(double1.doubleValue())), Double.valueOf(normalizeLongitude(double2.doubleValue())));
    }

    public static double normalizeLongitude(double d)
    {
        double d1 = d;
        boolean flag;
        if (d1 > 180D)
        {
            d = d1 - 360D;
        } else
        {
            d = d1;
            if (d1 < -180D)
            {
                d = d1 + 360D;
            }
        }
        if (d <= 180D && d >= -180D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Can't normalize longitude %s", new Object[] {
            Double.valueOf(d)
        });
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LatLng)obj;
            if (Double.compare(((LatLng) (obj)).latitude, latitude) != 0)
            {
                return false;
            }
            if (Double.compare(((LatLng) (obj)).longitude, longitude) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(latitude);
        int i = (int)(l >>> 32 ^ l);
        l = Double.doubleToLongBits(longitude);
        return i * 31 + (int)(l >>> 32 ^ l);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("latitude", latitude).add("longitude", longitude).toString();
    }

}
