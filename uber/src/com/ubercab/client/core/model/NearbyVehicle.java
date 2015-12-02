// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.Map;

public class NearbyVehicle
    implements com.ubercab.rider.realtime.model.NearbyVehicle
{

    String etaString;
    String etaStringShort;
    Integer minEta;
    Map vehiclePaths;

    public NearbyVehicle()
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
            obj = (NearbyVehicle)obj;
            if (minEta == null ? ((NearbyVehicle) (obj)).minEta != null : !minEta.equals(((NearbyVehicle) (obj)).minEta))
            {
                return false;
            }
            if (etaString == null ? ((NearbyVehicle) (obj)).etaString != null : !etaString.equals(((NearbyVehicle) (obj)).etaString))
            {
                return false;
            }
            if (etaStringShort == null ? ((NearbyVehicle) (obj)).etaStringShort != null : !etaStringShort.equals(((NearbyVehicle) (obj)).etaStringShort))
            {
                return false;
            }
            if (vehiclePaths == null ? ((NearbyVehicle) (obj)).vehiclePaths != null : !vehiclePaths.equals(((NearbyVehicle) (obj)).vehiclePaths))
            {
                return false;
            }
        }
        return true;
    }

    public String getEtaString()
    {
        return etaString;
    }

    public String getEtaStringShort()
    {
        return etaStringShort;
    }

    public int getMinEta()
    {
        if (minEta != null)
        {
            return minEta.intValue();
        } else
        {
            return 0;
        }
    }

    public Map getVehiclePaths()
    {
        return vehiclePaths;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (minEta != null)
        {
            i = minEta.hashCode();
        } else
        {
            i = 0;
        }
        if (etaString != null)
        {
            j = etaString.hashCode();
        } else
        {
            j = 0;
        }
        if (etaStringShort != null)
        {
            k = etaStringShort.hashCode();
        } else
        {
            k = 0;
        }
        if (vehiclePaths != null)
        {
            l = vehiclePaths.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public void setVehiclePaths(Map map)
    {
        vehiclePaths = map;
    }
}
