// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.request.param.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_FareEstimateBody

public abstract class FareEstimateBody
{

    public FareEstimateBody()
    {
    }

    public static FareEstimateBody create(int i, Location location, Location location1)
    {
        return (new Shape_FareEstimateBody()).setVehicleViewId(i).setDestination(location1).setPickupLocation(location);
    }

    public abstract Integer getCapacity();

    public abstract Location getDestination();

    public abstract FareInfo getFareInfo();

    public abstract Location getPickupLocation();

    public abstract int getVehicleViewId();

    public abstract FareEstimateBody setCapacity(Integer integer);

    abstract FareEstimateBody setDestination(Location location);

    public abstract FareEstimateBody setFareInfo(FareInfo fareinfo);

    abstract FareEstimateBody setPickupLocation(Location location);

    abstract FareEstimateBody setVehicleViewId(int i);
}
