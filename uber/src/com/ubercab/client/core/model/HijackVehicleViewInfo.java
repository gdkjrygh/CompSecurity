// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareHijackVehicleViewInfo;
import com.ubercab.rider.realtime.model.FareInfo;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_HijackVehicleViewInfo

public abstract class HijackVehicleViewInfo
    implements FareHijackVehicleViewInfo
{

    public HijackVehicleViewInfo()
    {
    }

    public static HijackVehicleViewInfo create()
    {
        return new Shape_HijackVehicleViewInfo();
    }

    public abstract HijackVehicleViewInfo setErrorMessage(String s);

    public abstract HijackVehicleViewInfo setFareInfo(FareInfo fareinfo);

    public abstract HijackVehicleViewInfo setHijackVehicleSavingTagline(String s);

    public abstract HijackVehicleViewInfo setVehicleSavingTagline(String s);
}
