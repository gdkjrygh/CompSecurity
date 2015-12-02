// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            GuidedPickupVenueDetails, GuidedPickupVenueSelection

public final class Shape_GuidedPickupVenueDetails extends GuidedPickupVenueDetails
{

    private GuidedPickupVenue.VenueFeature venueFeature;
    private GuidedPickupVenueSelection venueSelection;
    private GuidedPickupSnap.Data venueSnap;

    Shape_GuidedPickupVenueDetails()
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
            obj = (GuidedPickupVenueDetails)obj;
            if (((GuidedPickupVenueDetails) (obj)).getVenueFeature() == null ? getVenueFeature() != null : !((GuidedPickupVenueDetails) (obj)).getVenueFeature().equals(getVenueFeature()))
            {
                return false;
            }
            if (((GuidedPickupVenueDetails) (obj)).getVenueSelection() == null ? getVenueSelection() != null : !((GuidedPickupVenueDetails) (obj)).getVenueSelection().equals(getVenueSelection()))
            {
                return false;
            }
            if (((GuidedPickupVenueDetails) (obj)).getVenueSnap() == null ? getVenueSnap() != null : !((GuidedPickupVenueDetails) (obj)).getVenueSnap().equals(getVenueSnap()))
            {
                return false;
            }
        }
        return true;
    }

    public final GuidedPickupVenue.VenueFeature getVenueFeature()
    {
        return venueFeature;
    }

    public final GuidedPickupVenueSelection getVenueSelection()
    {
        return venueSelection;
    }

    public final GuidedPickupSnap.Data getVenueSnap()
    {
        return venueSnap;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (venueFeature == null)
        {
            i = 0;
        } else
        {
            i = venueFeature.hashCode();
        }
        if (venueSelection == null)
        {
            j = 0;
        } else
        {
            j = venueSelection.hashCode();
        }
        if (venueSnap != null)
        {
            k = venueSnap.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final GuidedPickupVenueDetails setVenueFeature(GuidedPickupVenue.VenueFeature venuefeature)
    {
        venueFeature = venuefeature;
        return this;
    }

    public final GuidedPickupVenueDetails setVenueSelection(GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        venueSelection = guidedpickupvenueselection;
        return this;
    }

    public final GuidedPickupVenueDetails setVenueSnap(GuidedPickupSnap.Data data)
    {
        venueSnap = data;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenueDetails{venueFeature=")).append(venueFeature).append(", venueSelection=").append(venueSelection).append(", venueSnap=").append(venueSnap).append("}").toString();
    }
}
