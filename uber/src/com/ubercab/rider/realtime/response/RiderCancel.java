// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

public abstract class RiderCancel
{

    public RiderCancel()
    {
    }

    public abstract ClientStatus getClientStatus();

    public abstract Eyeball getEyeball();

    public abstract Trip getTrip();

    abstract RiderCancel setClientStatus(ClientStatus clientstatus);

    abstract RiderCancel setEyeball(Eyeball eyeball);

    abstract RiderCancel setTrip(Trip trip);
}
