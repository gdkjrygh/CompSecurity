// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.projection;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.Point;

// Referenced classes of package com.google.maps.android.projection:
//            Point

public class SphericalMercatorProjection
{

    final double mWorldWidth;

    public SphericalMercatorProjection(double d)
    {
        mWorldWidth = d;
    }

    public LatLng toLatLng(Point point)
    {
        double d = point.x / mWorldWidth;
        return new LatLng(90D - Math.toDegrees(Math.atan(Math.exp(-(0.5D - point.y / mWorldWidth) * 2D * 3.1415926535897931D)) * 2D), (d - 0.5D) * 360D);
    }

    public com.google.maps.android.projection.Point toPoint(LatLng latlng)
    {
        double d = latlng.longitude / 360D;
        double d1 = Math.sin(Math.toRadians(latlng.latitude));
        d1 = (Math.log((1.0D + d1) / (1.0D - d1)) * 0.5D) / -6.2831853071795862D;
        return new com.google.maps.android.projection.Point(mWorldWidth * (d + 0.5D), mWorldWidth * (d1 + 0.5D));
    }
}
