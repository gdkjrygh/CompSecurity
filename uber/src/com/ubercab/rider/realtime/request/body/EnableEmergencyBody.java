// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_EnableEmergencyBody

public abstract class EnableEmergencyBody
{

    public EnableEmergencyBody()
    {
    }

    public static EnableEmergencyBody create()
    {
        return new Shape_EnableEmergencyBody();
    }

    public abstract Long getCreatedAt();

    public abstract String getDriverId();

    public abstract String getDriverName();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract String getRiderName();

    public abstract String getTripUuid();

    public abstract EnableEmergencyBody setCreatedAt(Long long1);

    public abstract EnableEmergencyBody setDriverId(String s);

    public abstract EnableEmergencyBody setDriverName(String s);

    public abstract EnableEmergencyBody setLatitude(Double double1);

    public abstract EnableEmergencyBody setLongitude(Double double1);

    public abstract EnableEmergencyBody setRiderName(String s);

    public abstract EnableEmergencyBody setTripUuid(String s);
}
