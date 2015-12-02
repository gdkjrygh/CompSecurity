// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareInfo;

public abstract class FareHijackVehicleViewInfo
    implements com.ubercab.rider.realtime.model.FareHijackVehicleViewInfo
{

    public FareHijackVehicleViewInfo()
    {
    }

    abstract FareHijackVehicleViewInfo setErrorMessage(String s);

    abstract FareHijackVehicleViewInfo setFareInfo(FareInfo fareinfo);

    abstract FareHijackVehicleViewInfo setHijackVehicleSavingTagline(String s);

    abstract FareHijackVehicleViewInfo setVehicleSavingTagline(String s);
}
