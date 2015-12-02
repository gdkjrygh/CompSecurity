// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;

import com.ubercab.android.location.UberLatLng;

// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupSnap_Location

public abstract class ation
{

    public static ation create(double d, double d1)
    {
        return (new Shape_GuidedPickupSnap_Location()).setLatitude(Double.valueOf(d)).setLongitude(Double.valueOf(d1));
    }

    public static setLongitude create(UberLatLng uberlatlng)
    {
        return create(uberlatlng.a(), uberlatlng.b());
    }

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    abstract create setLatitude(Double double1);

    abstract create setLongitude(Double double1);

    public ation()
    {
    }
}
