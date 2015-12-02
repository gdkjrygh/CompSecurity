// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.android.location.UberLatLng;

public final class VehiclePathPoint
    implements com.ubercab.rider.realtime.model.VehiclePathPoint
{

    private Float course;
    private Long epoch;
    private Double latitude;
    private Double longitude;

    public VehiclePathPoint()
    {
    }

    public VehiclePathPoint(long l, UberLatLng uberlatlng, float f)
    {
        epoch = Long.valueOf(l);
        latitude = Double.valueOf(uberlatlng.a());
        longitude = Double.valueOf(uberlatlng.b());
        course = Float.valueOf(f);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (VehiclePathPoint)obj;
            if (course == null ? ((VehiclePathPoint) (obj)).course != null : !course.equals(((VehiclePathPoint) (obj)).course))
            {
                return false;
            }
            if (epoch == null ? ((VehiclePathPoint) (obj)).epoch != null : !epoch.equals(((VehiclePathPoint) (obj)).epoch))
            {
                return false;
            }
            if (latitude == null ? ((VehiclePathPoint) (obj)).latitude != null : !latitude.equals(((VehiclePathPoint) (obj)).latitude))
            {
                return false;
            }
            if (longitude == null ? ((VehiclePathPoint) (obj)).longitude != null : !longitude.equals(((VehiclePathPoint) (obj)).longitude))
            {
                return false;
            }
        }
        return true;
    }

    public final float getCourse()
    {
        if (course != null)
        {
            return course.floatValue();
        } else
        {
            return 0.0F;
        }
    }

    public final long getEpoch()
    {
        if (epoch != null)
        {
            return epoch.longValue();
        } else
        {
            return 0L;
        }
    }

    public final double getLatitude()
    {
        if (latitude != null)
        {
            return latitude.doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public final double getLongitude()
    {
        if (longitude != null)
        {
            return longitude.doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public final UberLatLng getUberLatLng()
    {
        return new UberLatLng(getLatitude(), getLongitude());
    }

    public final int hashCode()
    {
        long l1 = 0L;
        int j = 0;
        int i;
        int k;
        long l;
        if (course != null)
        {
            i = Float.floatToIntBits(course.floatValue());
        } else
        {
            i = 0;
        }
        if (epoch != null)
        {
            j = (int)(epoch.longValue() ^ epoch.longValue() >>> 32);
        }
        if (latitude != null)
        {
            l = Double.doubleToLongBits(latitude.doubleValue());
        } else
        {
            l = 0L;
        }
        k = (int)(l ^ l >>> 32);
        l = l1;
        if (longitude != null)
        {
            l = Double.doubleToLongBits(longitude.doubleValue());
        }
        return (k + (i * 31 + j) * 31) * 31 + (int)(l ^ l >>> 32);
    }

    public final void setEpoch(long l)
    {
        epoch = Long.valueOf(l);
    }

    public final void setLatitude(double d)
    {
        latitude = Double.valueOf(d);
    }

    public final void setLongitude(double d)
    {
        longitude = Double.valueOf(d);
    }
}
