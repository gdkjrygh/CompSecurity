// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class FareEstimateVehicleViewData
{

    private static final float DEFAULT_SURGE_MULTIPLIER = 1F;
    private String fareString;
    private String maxFare;
    private String minFare;
    private Float surgeMultiplier;

    public FareEstimateVehicleViewData()
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
            obj = (FareEstimateVehicleViewData)obj;
            if (fareString == null ? ((FareEstimateVehicleViewData) (obj)).fareString != null : !fareString.equals(((FareEstimateVehicleViewData) (obj)).fareString))
            {
                return false;
            }
            if (maxFare == null ? ((FareEstimateVehicleViewData) (obj)).maxFare != null : !maxFare.equals(((FareEstimateVehicleViewData) (obj)).maxFare))
            {
                return false;
            }
            if (minFare == null ? ((FareEstimateVehicleViewData) (obj)).minFare != null : !minFare.equals(((FareEstimateVehicleViewData) (obj)).minFare))
            {
                return false;
            }
            if (surgeMultiplier == null ? ((FareEstimateVehicleViewData) (obj)).surgeMultiplier != null : !surgeMultiplier.equals(((FareEstimateVehicleViewData) (obj)).surgeMultiplier))
            {
                return false;
            }
        }
        return true;
    }

    public String getFareString()
    {
        return fareString;
    }

    public String getMaxFare()
    {
        return maxFare;
    }

    public String getMinFare()
    {
        return minFare;
    }

    public float getSurgeMultiplier()
    {
        if (surgeMultiplier == null)
        {
            return 1.0F;
        } else
        {
            return surgeMultiplier.floatValue();
        }
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (fareString != null)
        {
            i = fareString.hashCode();
        } else
        {
            i = 0;
        }
        if (maxFare != null)
        {
            j = maxFare.hashCode();
        } else
        {
            j = 0;
        }
        if (minFare != null)
        {
            k = minFare.hashCode();
        } else
        {
            k = 0;
        }
        if (surgeMultiplier != null)
        {
            l = surgeMultiplier.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    void setFareString(String s)
    {
        fareString = s;
    }

    void setMaxFare(String s)
    {
        maxFare = s;
    }

    void setMinFare(String s)
    {
        minFare = s;
    }

    void setSurgeMultiplier(float f)
    {
        surgeMultiplier = Float.valueOf(f);
    }
}
