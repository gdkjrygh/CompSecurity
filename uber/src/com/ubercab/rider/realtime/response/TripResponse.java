// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.Trip;

public abstract class TripResponse
{

    public TripResponse()
    {
    }

    public abstract Trip getTrip();

    public abstract void setTrip(Trip trip);
}
