// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.TripExtraPaymentData;

public final class ExtraPaymentData
    implements TripExtraPaymentData
{

    Boolean useAmexReward;

    public ExtraPaymentData()
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
            obj = (ExtraPaymentData)obj;
            if (useAmexReward == null ? ((ExtraPaymentData) (obj)).useAmexReward != null : !useAmexReward.equals(((ExtraPaymentData) (obj)).useAmexReward))
            {
                return false;
            }
        }
        return true;
    }

    public final String getPaymentProfileUuid()
    {
        return null;
    }

    public final String getPaymentType()
    {
        return null;
    }

    public final boolean getUseAmexReward()
    {
        return useRewards();
    }

    public final int hashCode()
    {
        if (useAmexReward != null)
        {
            return useAmexReward.hashCode();
        } else
        {
            return 0;
        }
    }

    public final boolean useRewards()
    {
        if (useAmexReward == null)
        {
            return false;
        } else
        {
            return useAmexReward.booleanValue();
        }
    }
}
