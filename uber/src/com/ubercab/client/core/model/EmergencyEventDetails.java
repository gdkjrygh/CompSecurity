// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_EmergencyEventDetails

public abstract class EmergencyEventDetails
    implements Parcelable
{

    public EmergencyEventDetails()
    {
    }

    public static EmergencyEventDetails create(String s, String s1, String s2, String s3, String s4, Double double1, Double double2, Long long1)
    {
        return (new Shape_EmergencyEventDetails()).setTripUuid(s).setRiderName(s1).setRiderId(s2).setDriverName(s3).setDriverId(s4).setLatitude(double1).setLongitude(double2).setCreatedAt(long1);
    }

    public abstract Long getCreatedAt();

    public abstract String getDriverId();

    public abstract String getDriverName();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract String getRiderId();

    public abstract String getRiderName();

    public abstract String getTripUuid();

    abstract EmergencyEventDetails setCreatedAt(Long long1);

    abstract EmergencyEventDetails setDriverId(String s);

    abstract EmergencyEventDetails setDriverName(String s);

    abstract EmergencyEventDetails setLatitude(Double double1);

    abstract EmergencyEventDetails setLongitude(Double double1);

    abstract EmergencyEventDetails setRiderId(String s);

    abstract EmergencyEventDetails setRiderName(String s);

    abstract EmergencyEventDetails setTripUuid(String s);
}
