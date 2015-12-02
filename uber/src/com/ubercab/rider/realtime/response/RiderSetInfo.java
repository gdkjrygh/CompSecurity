// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareSuggestedVehicleView;
import com.ubercab.rider.realtime.model.Trip;

public abstract class RiderSetInfo
{

    public RiderSetInfo()
    {
    }

    public abstract FareSuggestedVehicleView getSuggestedVehicleView();

    public abstract Trip getTrip();

    abstract RiderSetInfo setSuggestedVehicleView(FareSuggestedVehicleView faresuggestedvehicleview);

    abstract RiderSetInfo setTrip(Trip trip);
}
