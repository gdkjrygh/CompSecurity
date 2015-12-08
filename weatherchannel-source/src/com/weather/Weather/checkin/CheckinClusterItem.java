// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.google.android.gms.maps.model.LatLng;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;
import com.google.maps.android.clustering.ClusterItem;
import com.weather.dal2.checkin.Checkin;

public class CheckinClusterItem
    implements ClusterItem, Checkin
{

    private static final Range validLatitudes = Range.closed(Double.valueOf(-90D), Double.valueOf(90D));
    private static final Range validLongitudes = Range.closed(Double.valueOf(-180D), Double.valueOf(180D));
    private final boolean isMine;
    private final LatLng latLng;
    private final byte userIconCode;

    public CheckinClusterItem(double d, double d1, byte byte0)
    {
        this(d, d1, byte0, false);
    }

    public CheckinClusterItem(double d, double d1, byte byte0, boolean flag)
    {
        Preconditions.checkArgument(validLatitudes.contains(Double.valueOf(d)), "%s is not a valid latitude", new Object[] {
            Double.valueOf(d)
        });
        Preconditions.checkArgument(validLongitudes.contains(Double.valueOf(d1)), "%s is not a valid longitude", new Object[] {
            Double.valueOf(d1)
        });
        latLng = new LatLng(d, d1);
        userIconCode = byte0;
        isMine = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CheckinClusterItem)obj;
            if (!isMine || !((CheckinClusterItem) (obj)).isMine)
            {
                return false;
            }
            if (Math.round(((CheckinClusterItem) (obj)).latLng.latitude * 1000000D) != Math.round(latLng.latitude * 1000000D))
            {
                return false;
            }
            if (Math.round(((CheckinClusterItem) (obj)).latLng.longitude * 1000000D) != Math.round(latLng.longitude * 1000000D))
            {
                return false;
            }
            if (userIconCode != ((CheckinClusterItem) (obj)).userIconCode)
            {
                return false;
            }
        }
        return true;
    }

    public double getLatitude()
    {
        return latLng.latitude;
    }

    public double getLongitude()
    {
        return latLng.longitude;
    }

    public LatLng getPosition()
    {
        return latLng;
    }

    public byte getUserIconCode()
    {
        return userIconCode;
    }

    public int hashCode()
    {
        int j = (int)Math.round(latLng.latitude * 1000000D);
        int k = (int)Math.round(latLng.longitude * 1000000D);
        byte byte0 = userIconCode;
        int i;
        if (isMine)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return ((j * 31 + k) * 31 + byte0) * 31 + i;
    }

    public boolean isMine()
    {
        return isMine;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("latLng", latLng).add("userIconCode", userIconCode).add("isMine", isMine).toString();
    }

}
