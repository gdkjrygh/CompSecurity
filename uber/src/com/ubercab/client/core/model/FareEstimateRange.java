// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public final class FareEstimateRange
    implements com.ubercab.rider.realtime.model.FareEstimateRange
{

    private Float maxFare;
    private Float minFare;

    public FareEstimateRange()
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
            obj = (FareEstimateRange)obj;
            if (maxFare == null ? ((FareEstimateRange) (obj)).maxFare != null : !maxFare.equals(((FareEstimateRange) (obj)).maxFare))
            {
                return false;
            }
            if (minFare == null ? ((FareEstimateRange) (obj)).minFare != null : !minFare.equals(((FareEstimateRange) (obj)).minFare))
            {
                return false;
            }
        }
        return true;
    }

    public final float getMaxFare()
    {
        if (maxFare != null)
        {
            return maxFare.floatValue();
        } else
        {
            return 0.0F;
        }
    }

    public final float getMinFare()
    {
        if (minFare != null)
        {
            return minFare.floatValue();
        } else
        {
            return 0.0F;
        }
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (minFare != null)
        {
            i = minFare.hashCode();
        } else
        {
            i = 0;
        }
        if (maxFare != null)
        {
            j = maxFare.hashCode();
        }
        return i * 31 + j;
    }
}
