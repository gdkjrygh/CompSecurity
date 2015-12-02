// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;

import com.ubercab.rider.realtime.model.Venue;

// Referenced classes of package com.ubercab.rider.realtime.response:
//            PickupsGeocode

public abstract class VenueGeocode
    implements PickupsGeocode
{

    public VenueGeocode()
    {
    }

    public abstract Venue getData();

    public volatile Object getData()
    {
        return getData();
    }

    abstract void setData(Venue venue);

    abstract void setStatus(String s);
}
