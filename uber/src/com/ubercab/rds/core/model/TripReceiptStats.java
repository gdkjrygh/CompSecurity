// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripReceiptStats

public abstract class TripReceiptStats
    implements Parcelable
{

    public TripReceiptStats()
    {
    }

    public static TripReceiptStats create()
    {
        return new Shape_TripReceiptStats();
    }

    public abstract String getDistance();

    public abstract String getDistanceLabel();

    public abstract String getDuration();

    public abstract String getVehicleType();

    public abstract TripReceiptStats setDistance(String s);

    public abstract TripReceiptStats setDistanceLabel(String s);

    public abstract TripReceiptStats setDuration(String s);

    public abstract TripReceiptStats setVehicleType(String s);
}
