// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareSearchResult, LocationSearchResult, FareInfo

public abstract class UpfrontFareSearchResult
{

    public UpfrontFareSearchResult()
    {
    }

    public static UpfrontFareSearchResult create()
    {
        return new Shape_UpfrontFareSearchResult();
    }

    public abstract LocationSearchResult getDestinationLocation();

    public abstract FareInfo getFareInfo();

    abstract UpfrontFareSearchResult setDestinationLocation(LocationSearchResult locationsearchresult);

    abstract UpfrontFareSearchResult setFareInfo(FareInfo fareinfo);
}
