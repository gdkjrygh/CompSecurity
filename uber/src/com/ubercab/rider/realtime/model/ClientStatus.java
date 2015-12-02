// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            TripPendingRating

public interface ClientStatus
{

    public static final String STATUS_DISPATCHING = "Dispatching";
    public static final String STATUS_LOOKING = "Looking";
    public static final String STATUS_ON_TRIP = "OnTrip";
    public static final String STATUS_WAITING_FOR_PICKUP = "WaitingForPickup";

    public abstract String getLastRequestMsg();

    public abstract String getLastRequestNote();

    public abstract String getStatus();

    public abstract TripPendingRating getTripPendingRating();
}
