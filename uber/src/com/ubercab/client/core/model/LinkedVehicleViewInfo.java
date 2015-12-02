// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.FareLinkedVehicleViewInfo;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_LinkedVehicleViewInfo

public abstract class LinkedVehicleViewInfo
    implements FareLinkedVehicleViewInfo
{

    public LinkedVehicleViewInfo()
    {
    }

    public static LinkedVehicleViewInfo create()
    {
        return new Shape_LinkedVehicleViewInfo();
    }

    public abstract LinkedVehicleViewInfo setFareInfo(FareInfo fareinfo);

    public abstract LinkedVehicleViewInfo setLinkedVehicleViewId(String s);
}
