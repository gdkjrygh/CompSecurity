// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.google.maps.android.clustering.view:
//            DefaultClusterRenderer

private static class <init>
{

    private final Marker marker;
    private LatLng position;

    public boolean equals(Object obj)
    {
        if (obj instanceof <init>)
        {
            return marker.equals(((marker)obj).marker);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return marker.hashCode();
    }



/*
    static LatLng access$1602( , LatLng latlng)
    {
        .position = latlng;
        return latlng;
    }

*/


    private position(Marker marker1)
    {
        marker = marker1;
        position = marker1.getPosition();
    }

    position(Marker marker1, position position1)
    {
        this(marker1);
    }
}
