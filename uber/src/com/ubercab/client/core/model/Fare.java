// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Fare

public abstract class Fare
    implements com.ubercab.rider.realtime.model.Fare
{

    public static final String TYPE_TIME_AND_DISTANCE = "TimeAndDistance";

    public Fare()
    {
    }

    public static Fare create()
    {
        return new Shape_Fare();
    }

    public abstract String getBase();

    public abstract String getBaseValue();

    public abstract String getCancellation();

    public abstract String getDistanceUnit();

    public abstract int getId();

    public abstract String getMinimum();

    public abstract String getPerDistanceUnit();

    public abstract String getPerMinute();

    public abstract String getSafeRidesFee();

    public abstract String getSpeedThresholdMps();

    public abstract String getType();

    public abstract Fare setBase(String s);

    abstract Fare setBaseValue(String s);

    abstract Fare setCancellation(String s);

    public abstract Fare setDistanceUnit(String s);

    public abstract Fare setId(int i);

    public abstract Fare setMinimum(String s);

    public abstract Fare setPerDistanceUnit(String s);

    public abstract Fare setPerMinute(String s);

    public abstract Fare setSafeRidesFee(String s);

    abstract Fare setSpeedThresholdMps(String s);

    abstract Fare setType(String s);
}
