// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.VenueLocationCollection;
import com.ubercab.rider.realtime.model.VenueZoneProperties;
import hnu;
import java.util.List;

abstract class ObjectVenueZone
    implements hnu
{

    ObjectVenueZone()
    {
    }

    public int getChirality()
    {
        return 1;
    }

    public List getPickupLocations()
    {
        return getProperties().getPickupLocations().getFeatures();
    }
}
