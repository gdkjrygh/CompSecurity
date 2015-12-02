// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.VenueProperties;
import com.ubercab.rider.realtime.model.VenueZoneCollection;
import hnq;
import java.util.List;

abstract class ObjectVenue
    implements hnq
{

    ObjectVenue()
    {
    }

    public int getChirality()
    {
        return 1;
    }

    public List getZones()
    {
        return getProperties().getZones().getFeatures();
    }
}
