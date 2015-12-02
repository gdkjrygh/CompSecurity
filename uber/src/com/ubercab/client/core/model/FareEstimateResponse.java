// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            FareEstimateLocation

public class FareEstimateResponse
{

    private FareEstimateLocation destinationLocation;
    private FareEstimateLocation pickupLocation;
    private Map vehicleViews;

    public FareEstimateResponse()
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
            obj = (FareEstimateResponse)obj;
            if (destinationLocation == null ? ((FareEstimateResponse) (obj)).destinationLocation != null : !destinationLocation.equals(((FareEstimateResponse) (obj)).destinationLocation))
            {
                return false;
            }
            if (pickupLocation == null ? ((FareEstimateResponse) (obj)).pickupLocation != null : !pickupLocation.equals(((FareEstimateResponse) (obj)).pickupLocation))
            {
                return false;
            }
            if (vehicleViews == null ? ((FareEstimateResponse) (obj)).vehicleViews != null : !vehicleViews.equals(((FareEstimateResponse) (obj)).vehicleViews))
            {
                return false;
            }
        }
        return true;
    }

    public FareEstimateLocation getDestinationLocation()
    {
        return destinationLocation;
    }

    public FareEstimateLocation getPickupLocation()
    {
        return pickupLocation;
    }

    public Map getVehicleViews()
    {
        return vehicleViews;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (vehicleViews != null)
        {
            i = vehicleViews.hashCode();
        } else
        {
            i = 0;
        }
        if (pickupLocation != null)
        {
            j = pickupLocation.hashCode();
        } else
        {
            j = 0;
        }
        if (destinationLocation != null)
        {
            k = destinationLocation.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    void setDestinationLocation(FareEstimateLocation fareestimatelocation)
    {
        destinationLocation = fareestimatelocation;
    }

    void setPickupLocation(FareEstimateLocation fareestimatelocation)
    {
        pickupLocation = fareestimatelocation;
    }

    void setVehicleViews(Map map)
    {
        vehicleViews = map;
    }
}
