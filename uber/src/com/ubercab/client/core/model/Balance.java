// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class Balance
    implements com.ubercab.rider.realtime.model.Balance
{

    Float currencyAmount;
    String currencyCode;
    Integer rewardsAmount;
    Float rewardsToCurrencyRatio;

    public Balance()
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
            obj = (Balance)obj;
            if (currencyAmount == null ? ((Balance) (obj)).currencyAmount != null : !currencyAmount.equals(((Balance) (obj)).currencyAmount))
            {
                return false;
            }
            if (currencyCode == null ? ((Balance) (obj)).currencyCode != null : !currencyCode.equals(((Balance) (obj)).currencyCode))
            {
                return false;
            }
            if (rewardsAmount == null ? ((Balance) (obj)).rewardsAmount != null : !rewardsAmount.equals(((Balance) (obj)).rewardsAmount))
            {
                return false;
            }
            if (rewardsToCurrencyRatio == null ? ((Balance) (obj)).rewardsToCurrencyRatio != null : !rewardsToCurrencyRatio.equals(((Balance) (obj)).rewardsToCurrencyRatio))
            {
                return false;
            }
        }
        return true;
    }

    public double getCurrencyAmount()
    {
        if (currencyAmount == null)
        {
            return 0.0D;
        } else
        {
            return (double)currencyAmount.floatValue();
        }
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public int getRewardsAmount()
    {
        if (rewardsAmount == null)
        {
            return 0;
        } else
        {
            return rewardsAmount.intValue();
        }
    }

    public double getRewardsToCurrencyRatio()
    {
        if (rewardsToCurrencyRatio == null)
        {
            return 0.0D;
        } else
        {
            return (double)rewardsToCurrencyRatio.floatValue();
        }
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (currencyCode != null)
        {
            i = currencyCode.hashCode();
        } else
        {
            i = 0;
        }
        if (currencyAmount != null)
        {
            j = currencyAmount.hashCode();
        } else
        {
            j = 0;
        }
        if (rewardsAmount != null)
        {
            k = rewardsAmount.hashCode();
        } else
        {
            k = 0;
        }
        if (rewardsToCurrencyRatio != null)
        {
            l = rewardsToCurrencyRatio.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }
}
