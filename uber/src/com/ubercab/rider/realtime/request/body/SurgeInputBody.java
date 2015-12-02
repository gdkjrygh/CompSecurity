// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SurgeInputBody, LocationBody

public abstract class SurgeInputBody
{

    public SurgeInputBody()
    {
    }

    public static SurgeInputBody create()
    {
        return new Shape_SurgeInputBody();
    }

    public abstract String getCityId();

    public abstract LocationBody getDeviceLocation();

    public abstract String getEventType();

    public abstract LocationBody getPinLocation();

    public abstract String getProductId();

    public abstract String getRiderSession();

    public abstract String getRiderUuid();

    public abstract String getSurgeFareId();

    public abstract long getTimeStamp();

    public abstract String getVehicleViewId();

    public abstract SurgeInputBody setCityId(String s);

    public abstract SurgeInputBody setDeviceLocation(LocationBody locationbody);

    public abstract SurgeInputBody setEventType(String s);

    public abstract SurgeInputBody setPinLocation(LocationBody locationbody);

    public abstract SurgeInputBody setProductId(String s);

    public abstract SurgeInputBody setRiderSession(String s);

    public abstract SurgeInputBody setRiderUuid(String s);

    public abstract SurgeInputBody setSurgeFareId(String s);

    public abstract SurgeInputBody setTimeStamp(long l);

    public abstract SurgeInputBody setVehicleViewId(String s);
}
