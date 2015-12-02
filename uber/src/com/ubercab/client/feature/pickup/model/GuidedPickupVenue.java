// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenue

public abstract class GuidedPickupVenue
{

    public GuidedPickupVenue()
    {
    }

    public static GuidedPickupVenue create(VenueFeature venuefeature)
    {
        return (new Shape_GuidedPickupVenue()).setData(venuefeature);
    }

    public abstract VenueFeature getData();

    public abstract String getStatus();

    abstract GuidedPickupVenue setData(VenueFeature venuefeature);

    abstract GuidedPickupVenue setStatus(String s);
}
