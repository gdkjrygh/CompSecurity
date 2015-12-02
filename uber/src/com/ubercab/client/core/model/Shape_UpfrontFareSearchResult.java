// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareSearchResult, LocationSearchResult, FareInfo

public final class Shape_UpfrontFareSearchResult extends UpfrontFareSearchResult
{

    private LocationSearchResult destinationLocation;
    private FareInfo fareInfo;

    Shape_UpfrontFareSearchResult()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UpfrontFareSearchResult)obj;
            if (((UpfrontFareSearchResult) (obj)).getDestinationLocation() == null ? getDestinationLocation() != null : !((UpfrontFareSearchResult) (obj)).getDestinationLocation().equals(getDestinationLocation()))
            {
                return false;
            }
            if (((UpfrontFareSearchResult) (obj)).getFareInfo() == null ? getFareInfo() != null : !((UpfrontFareSearchResult) (obj)).getFareInfo().equals(getFareInfo()))
            {
                return false;
            }
        }
        return true;
    }

    public final LocationSearchResult getDestinationLocation()
    {
        return destinationLocation;
    }

    public final FareInfo getFareInfo()
    {
        return fareInfo;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (destinationLocation == null)
        {
            i = 0;
        } else
        {
            i = destinationLocation.hashCode();
        }
        if (fareInfo != null)
        {
            j = fareInfo.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final UpfrontFareSearchResult setDestinationLocation(LocationSearchResult locationsearchresult)
    {
        destinationLocation = locationsearchresult;
        return this;
    }

    final UpfrontFareSearchResult setFareInfo(FareInfo fareinfo)
    {
        fareInfo = fareinfo;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareSearchResult{destinationLocation=")).append(destinationLocation).append(", fareInfo=").append(fareInfo).append("}").toString();
    }
}
