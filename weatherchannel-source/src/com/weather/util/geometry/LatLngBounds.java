// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.geometry;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.util.geometry:
//            LatLng

public final class LatLngBounds
{

    public static final double MAX_SCALED_WIDTH = 359.99999000000003D;
    public final LatLng northeast;
    public final LatLng southwest;

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        northeast = (LatLng)Preconditions.checkNotNull(latlng);
        southwest = (LatLng)Preconditions.checkNotNull(latlng1);
        boolean flag;
        if (latlng.latitude >= latlng1.latitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "NE lat %s must be >= SW lat %s", new Object[] {
            Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
        });
    }

    public boolean contains(LatLng latlng)
    {
        boolean flag;
        if (northeast.longitude - southwest.longitude < 0.0D)
        {
            if (latlng.longitude <= northeast.longitude || latlng.longitude >= southwest.longitude)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (latlng.longitude <= northeast.longitude && latlng.longitude >= southwest.longitude)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && latlng.latitude <= northeast.latitude && latlng.latitude >= southwest.latitude;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LatLngBounds)obj;
            if (!northeast.equals(((LatLngBounds) (obj)).northeast))
            {
                return false;
            }
            if (!southwest.equals(((LatLngBounds) (obj)).southwest))
            {
                return false;
            }
        }
        return true;
    }

    public LatLng getCenter()
    {
        double d2 = southwest.latitude;
        double d3 = getHeight() / 2D;
        double d = getWidth();
        double d1 = southwest.longitude + d / 2D;
        d = d1;
        if (d1 > 180D)
        {
            d = d1 - 360D;
        }
        return new LatLng(Double.valueOf(d2 + d3), Double.valueOf(d));
    }

    public double getHeight()
    {
        return northeast.latitude - southwest.latitude;
    }

    public double getWidth()
    {
        double d1 = northeast.longitude - southwest.longitude;
        double d = d1;
        if (d1 < 0.0D)
        {
            d = d1 + 360D;
        }
        return d;
    }

    public int hashCode()
    {
        return northeast.hashCode() * 31 + southwest.hashCode();
    }

    public LatLngBounds scale(double d)
    {
        double d1;
        double d2;
        double d3;
        LatLng latlng;
        boolean flag;
        if (d >= 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "factor %s not allowed, must be >>= 0.0", new Object[] {
            Double.valueOf(d)
        });
        latlng = getCenter();
        d2 = (getHeight() * d) / 2D;
        d1 = LatLng.clipLatitude(latlng.latitude + d2);
        d2 = LatLng.clipLatitude(latlng.latitude - d2);
        d3 = Math.min(179.99999500000001D, (getWidth() * d) / 2D);
        d = LatLng.normalizeLongitude(latlng.longitude + d3);
        d3 = LatLng.normalizeLongitude(latlng.longitude - d3);
        return new LatLngBounds(new LatLng(Double.valueOf(d1), Double.valueOf(d)), new LatLng(Double.valueOf(d2), Double.valueOf(d3)));
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("northeast", northeast).add("southwest", southwest).toString();
    }
}
