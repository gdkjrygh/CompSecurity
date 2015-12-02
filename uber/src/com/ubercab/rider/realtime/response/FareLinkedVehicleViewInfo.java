// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareInfo;

public abstract class FareLinkedVehicleViewInfo
    implements com.ubercab.rider.realtime.model.FareLinkedVehicleViewInfo
{

    public FareLinkedVehicleViewInfo()
    {
    }

    abstract FareLinkedVehicleViewInfo setFareInfo(FareInfo fareinfo);

    abstract FareLinkedVehicleViewInfo setLinkedVehicleViewId(String s);
}
