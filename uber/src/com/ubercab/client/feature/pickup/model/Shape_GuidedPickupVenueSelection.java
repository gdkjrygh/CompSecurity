// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


// Referenced classes of package com.ubercab.client.feature.pickup.model:
//            GuidedPickupVenueSelection

public final class Shape_GuidedPickupVenueSelection extends GuidedPickupVenueSelection
{

    private boolean isSuggestion;
    private GuidedPickupVenue.PickupFeature selectedPickup;
    private GuidedPickupVenue.ZoneFeature selectedZone;

    Shape_GuidedPickupVenueSelection()
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
            obj = (GuidedPickupVenueSelection)obj;
            if (((GuidedPickupVenueSelection) (obj)).getSelectedPickup() == null ? getSelectedPickup() != null : !((GuidedPickupVenueSelection) (obj)).getSelectedPickup().equals(getSelectedPickup()))
            {
                return false;
            }
            if (((GuidedPickupVenueSelection) (obj)).getSelectedZone() == null ? getSelectedZone() != null : !((GuidedPickupVenueSelection) (obj)).getSelectedZone().equals(getSelectedZone()))
            {
                return false;
            }
            if (((GuidedPickupVenueSelection) (obj)).getIsSuggestion() != getIsSuggestion())
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getIsSuggestion()
    {
        return isSuggestion;
    }

    public final GuidedPickupVenue.PickupFeature getSelectedPickup()
    {
        return selectedPickup;
    }

    public final GuidedPickupVenue.ZoneFeature getSelectedZone()
    {
        return selectedZone;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        char c;
        if (selectedPickup == null)
        {
            i = 0;
        } else
        {
            i = selectedPickup.hashCode();
        }
        if (selectedZone != null)
        {
            j = selectedZone.hashCode();
        }
        if (isSuggestion)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c ^ ((i ^ 0xf4243) * 0xf4243 ^ j) * 0xf4243;
    }

    final GuidedPickupVenueSelection setIsSuggestion(boolean flag)
    {
        isSuggestion = flag;
        return this;
    }

    final GuidedPickupVenueSelection setSelectedPickup(GuidedPickupVenue.PickupFeature pickupfeature)
    {
        selectedPickup = pickupfeature;
        return this;
    }

    final GuidedPickupVenueSelection setSelectedZone(GuidedPickupVenue.ZoneFeature zonefeature)
    {
        selectedZone = zonefeature;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenueSelection{selectedPickup=")).append(selectedPickup).append(", selectedZone=").append(selectedZone).append(", isSuggestion=").append(isSuggestion).append("}").toString();
    }
}
