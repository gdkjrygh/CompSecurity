// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareEstimateRange;
import com.ubercab.rider.realtime.request.param.Location;

public abstract class FareEstimate
{

    public FareEstimate()
    {
    }

    public abstract Location getDestination();

    public abstract FareEstimateRange getFareEstimateRange();

    public abstract String getFareEstimateString();

    public abstract Integer getFareId();

    public abstract Location getPickupLocation();

    public abstract int getVehicleViewId();

    abstract FareEstimate setDestination(Location location);

    abstract FareEstimate setFareEstimateRange(FareEstimateRange fareestimaterange);

    abstract FareEstimate setFareEstimateString(String s);

    abstract FareEstimate setFareId(Integer integer);

    abstract FareEstimate setPickupLocation(Location location);

    abstract FareEstimate setVehicleViewId(int i);
}
