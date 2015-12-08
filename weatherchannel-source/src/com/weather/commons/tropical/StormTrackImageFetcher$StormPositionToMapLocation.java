// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.base.Function;
import com.weather.util.geometry.LatLng;

// Referenced classes of package com.weather.commons.tropical:
//            StormTrackImageFetcher, StormPosition

private static class <init>
    implements Function
{

    public com.weather.util.maps.cation apply(StormPosition stormposition)
    {
        if (stormposition == null)
        {
            return null;
        } else
        {
            return new com.weather.util.maps.cation(Double.valueOf(stormposition.getLatLng().latitude), Double.valueOf(stormposition.getLatLng().longitude));
        }
    }

    public volatile Object apply(Object obj)
    {
        return apply((StormPosition)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
