// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareEstimateRange;
import com.ubercab.rider.realtime.model.Location;

// Referenced classes of package com.ubercab.client.core.model:
//            CnLocation, FareEstimateRange

public class Itinerary
    implements com.ubercab.rider.realtime.model.Itinerary
{

    CnLocation destination;
    com.ubercab.client.core.model.FareEstimateRange fareEstimateRange;
    String fareEstimateString;
    String fareEstimateTagline;
    String fareId;
    CnLocation pickupLocation;
    String vehicleViewId;

    public Itinerary()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Itinerary)obj;
            if (destination == null ? ((Itinerary) (obj)).destination != null : !destination.equals(((Itinerary) (obj)).destination))
            {
                return false;
            }
            if (fareEstimateRange == null ? ((Itinerary) (obj)).fareEstimateRange != null : !fareEstimateRange.equals(((Itinerary) (obj)).fareEstimateRange))
            {
                return false;
            }
            if (fareEstimateString == null ? ((Itinerary) (obj)).fareEstimateString != null : !fareEstimateString.equals(((Itinerary) (obj)).fareEstimateString))
            {
                return false;
            }
            if (fareEstimateTagline == null ? ((Itinerary) (obj)).fareEstimateTagline != null : !fareEstimateTagline.equals(((Itinerary) (obj)).fareEstimateTagline))
            {
                return false;
            }
            if (fareId == null ? ((Itinerary) (obj)).fareId != null : !fareId.equals(((Itinerary) (obj)).fareId))
            {
                return false;
            }
            if (pickupLocation == null ? ((Itinerary) (obj)).pickupLocation != null : !pickupLocation.equals(((Itinerary) (obj)).pickupLocation))
            {
                return false;
            }
            if (vehicleViewId == null ? ((Itinerary) (obj)).vehicleViewId != null : !vehicleViewId.equals(((Itinerary) (obj)).vehicleViewId))
            {
                return false;
            }
        }
        return true;
    }

    public CnLocation getDestination()
    {
        return destination;
    }

    public volatile Location getDestination()
    {
        return getDestination();
    }

    public com.ubercab.client.core.model.FareEstimateRange getFareEstimateRange()
    {
        return fareEstimateRange;
    }

    public volatile FareEstimateRange getFareEstimateRange()
    {
        return getFareEstimateRange();
    }

    public String getFareEstimateString()
    {
        return fareEstimateString;
    }

    public String getFareEstimateTagline()
    {
        return fareEstimateTagline;
    }

    public String getFareId()
    {
        return fareId;
    }

    public CnLocation getPickupLocation()
    {
        return pickupLocation;
    }

    public volatile Location getPickupLocation()
    {
        return getPickupLocation();
    }

    public String getVehicleViewId()
    {
        return vehicleViewId;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (fareEstimateString != null)
        {
            i = fareEstimateString.hashCode();
        } else
        {
            i = 0;
        }
        if (fareEstimateRange != null)
        {
            j = fareEstimateRange.hashCode();
        } else
        {
            j = 0;
        }
        if (fareEstimateTagline != null)
        {
            k = fareEstimateTagline.hashCode();
        } else
        {
            k = 0;
        }
        if (fareId != null)
        {
            l = fareId.hashCode();
        } else
        {
            l = 0;
        }
        if (vehicleViewId != null)
        {
            i1 = vehicleViewId.hashCode();
        } else
        {
            i1 = 0;
        }
        if (destination != null)
        {
            j1 = destination.hashCode();
        } else
        {
            j1 = 0;
        }
        if (pickupLocation != null)
        {
            k1 = pickupLocation.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    void setDestinationLocation(CnLocation cnlocation)
    {
        destination = cnlocation;
    }

    void setFareEstimateString(String s)
    {
        fareEstimateString = s;
    }

    void setFareEstimateTagline(String s)
    {
        fareEstimateTagline = s;
    }

    void setFareId(String s)
    {
        fareId = s;
    }

    void setPickupLocation(CnLocation cnlocation)
    {
        pickupLocation = cnlocation;
    }

    void setVehicleViewId(String s)
    {
        vehicleViewId = s;
    }
}
