// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.rider.realtime.model.Trip;

public final class TripEvent
{

    private final Trip mTrip;

    public TripEvent(Trip trip)
    {
        mTrip = trip;
    }

    public final Trip getTrip()
    {
        return mTrip;
    }
}
