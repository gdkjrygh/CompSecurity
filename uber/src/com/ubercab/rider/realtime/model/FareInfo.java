// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            FareDetail, Metadata, UpfrontFare

public interface FareInfo
{

    public abstract FareDetail getFareDetail();

    public abstract Metadata getMetadata();

    public abstract UpfrontFare getUpfrontFare();

    public abstract String getVehicleViewId();

    public abstract boolean isFareElevated();
}
