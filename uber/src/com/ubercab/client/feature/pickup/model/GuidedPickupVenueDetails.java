// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            Shape_GuidedPickupVenueDetails, GuidedPickupVenueSelection

public abstract class GuidedPickupVenueDetails
{

    public GuidedPickupVenueDetails()
    {
    }

    public static GuidedPickupVenueDetails create()
    {
        return new Shape_GuidedPickupVenueDetails();
    }

    public static GuidedPickupVenueDetails create(GuidedPickupSnap.Data data, GuidedPickupVenue.VenueFeature venuefeature, GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        return (new Shape_GuidedPickupVenueDetails()).setVenueSnap(data).setVenueFeature(venuefeature).setVenueSelection(guidedpickupvenueselection).validate();
    }

    public abstract GuidedPickupVenue.VenueFeature getVenueFeature();

    public abstract GuidedPickupVenueSelection getVenueSelection();

    public abstract GuidedPickupSnap.Data getVenueSnap();

    public abstract GuidedPickupVenueDetails setVenueFeature(GuidedPickupVenue.VenueFeature venuefeature);

    public abstract GuidedPickupVenueDetails setVenueSelection(GuidedPickupVenueSelection guidedpickupvenueselection);

    public abstract GuidedPickupVenueDetails setVenueSnap(GuidedPickupSnap.Data data);

    public GuidedPickupVenueDetails validate()
    {
        GuidedPickupSnap.Data data = getVenueSnap();
        if (data == null)
        {
            setVenueFeature(null);
            setVenueSelection(null);
        } else
        {
            GuidedPickupVenue.VenueFeature venuefeature = getVenueFeature();
            if (venuefeature == null)
            {
                setVenueSelection(null);
                return this;
            }
            if (!venuefeature.getProperties().getId().equals(data.getId()))
            {
                setVenueFeature(null);
                setVenueSelection(null);
                return this;
            }
        }
        return this;
    }
}
