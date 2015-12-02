// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            FareSplit, ReverseGeocode

public interface Eyeball
{

    public abstract Map getDynamicFares();

    public abstract FareSplit getFareSplit();

    public abstract Map getNearbyVehicles();

    public abstract ReverseGeocode getReverseGeocode();
}
