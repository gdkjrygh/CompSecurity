// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.FareInfo;

public abstract class FareSuggestedVehicleView
    implements com.ubercab.rider.realtime.model.FareSuggestedVehicleView
{

    public FareSuggestedVehicleView()
    {
    }

    abstract FareSuggestedVehicleView setConfirmationMessage(String s);

    abstract FareSuggestedVehicleView setConfirmationTitle(String s);

    abstract FareSuggestedVehicleView setFareInfo(FareInfo fareinfo);

    abstract FareSuggestedVehicleView setTagline(String s);

    abstract FareSuggestedVehicleView setVehicleViewId(Integer integer);
}
