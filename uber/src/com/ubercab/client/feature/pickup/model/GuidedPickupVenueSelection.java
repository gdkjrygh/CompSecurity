// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenueSelection

public abstract class GuidedPickupVenueSelection
{

    public GuidedPickupVenueSelection()
    {
    }

    public static GuidedPickupVenueSelection create(GuidedPickupVenue.ZoneFeature zonefeature, GuidedPickupVenue.PickupFeature pickupfeature)
    {
        return create(zonefeature, pickupfeature, false);
    }

    public static GuidedPickupVenueSelection create(GuidedPickupVenue.ZoneFeature zonefeature, GuidedPickupVenue.PickupFeature pickupfeature, boolean flag)
    {
        return (new Shape_GuidedPickupVenueSelection()).setSelectedZone(zonefeature).setSelectedPickup(pickupfeature).setIsSuggestion(flag);
    }

    public abstract boolean getIsSuggestion();

    public abstract GuidedPickupVenue.PickupFeature getSelectedPickup();

    public abstract GuidedPickupVenue.ZoneFeature getSelectedZone();

    abstract GuidedPickupVenueSelection setIsSuggestion(boolean flag);

    abstract GuidedPickupVenueSelection setSelectedPickup(GuidedPickupVenue.PickupFeature pickupfeature);

    abstract GuidedPickupVenueSelection setSelectedZone(GuidedPickupVenue.ZoneFeature zonefeature);
}
