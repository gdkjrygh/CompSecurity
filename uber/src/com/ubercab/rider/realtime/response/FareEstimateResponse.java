// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareInfo;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            FareEstimate, FareHijackVehicleViewInfo, FareLinkedVehicleViewInfo, FareSuggestedVehicleView

public abstract class FareEstimateResponse
{

    public FareEstimateResponse()
    {
    }

    public abstract String getCurrencyCode();

    public abstract FareEstimate getEstimate();

    public abstract FareInfo getFareInfo();

    public abstract FareHijackVehicleViewInfo getHijackVehicleViewInfo();

    public abstract FareLinkedVehicleViewInfo getLinkedVehicleViewInfo();

    public abstract FareSuggestedVehicleView getSuggestedVehicleView();

    public abstract Double getSurgeMultiplier();

    public abstract String getUpfrontFareMessage();

    abstract void setCurrencyCode(String s);

    abstract void setEstimate(FareEstimate fareestimate);

    abstract void setFareInfo(FareInfo fareinfo);

    abstract void setHijackVehicleViewInfo(FareHijackVehicleViewInfo farehijackvehicleviewinfo);

    abstract void setLinkedVehicleViewInfo(FareLinkedVehicleViewInfo farelinkedvehicleviewinfo);

    abstract void setSuggestedVehicleView(FareSuggestedVehicleView faresuggestedvehicleview);

    abstract void setSurgeMultiplier(Double double1);

    abstract void setUpfrontFareMessage(String s);
}
