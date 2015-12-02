// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.FareSuggestedVehicleView;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_SuggestedVehicleView

public abstract class SuggestedVehicleView
    implements FareSuggestedVehicleView
{

    public SuggestedVehicleView()
    {
    }

    public static SuggestedVehicleView create()
    {
        return new Shape_SuggestedVehicleView();
    }

    abstract SuggestedVehicleView setConfirmationMessage(String s);

    abstract SuggestedVehicleView setConfirmationTitle(String s);

    abstract SuggestedVehicleView setFareInfo(FareInfo fareinfo);

    abstract SuggestedVehicleView setTagline(String s);

    abstract SuggestedVehicleView setVehicleViewId(Integer integer);
}
