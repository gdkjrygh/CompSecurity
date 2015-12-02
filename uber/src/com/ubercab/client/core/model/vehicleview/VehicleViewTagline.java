// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;

import com.ubercab.rider.realtime.model.Tagline;

// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            Shape_VehicleViewTagline

abstract class VehicleViewTagline
    implements Tagline
{

    VehicleViewTagline()
    {
    }

    public static VehicleViewTagline create(String s, String s1)
    {
        return (new Shape_VehicleViewTagline()).setTitle(s).setDetail(s1);
    }

    public abstract String getDetail();

    public abstract String getTitle();

    abstract VehicleViewTagline setDetail(String s);

    abstract VehicleViewTagline setTitle(String s);
}
