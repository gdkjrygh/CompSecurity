// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.Balance;

// Referenced classes of package com.ubercab.client.core.model:
//            Balance

public class RewardInfo
    implements com.ubercab.rider.realtime.model.RewardInfo
{

    private static final String ELIGIBLE_FOR_EARN_AND_BURN = "B";
    private static final String ELIGIBLE_FOR_EARN_ONLY = "E";
    private static final String NOT_ELIGIBLE = "N";
    com.ubercab.client.core.model.Balance balance;
    String eligibleFor;
    Boolean enabled;
    Boolean enrolled;

    public RewardInfo()
    {
    }

    public boolean eligibleToUsePoints()
    {
        return !TextUtils.isEmpty(eligibleFor) && "B".equals(eligibleFor);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RewardInfo)obj;
            if (enabled == null ? ((RewardInfo) (obj)).enabled != null : !enabled.equals(((RewardInfo) (obj)).enabled))
            {
                return false;
            }
            if (balance == null ? ((RewardInfo) (obj)).balance != null : !balance.equals(((RewardInfo) (obj)).balance))
            {
                return false;
            }
            if (eligibleFor == null ? ((RewardInfo) (obj)).eligibleFor != null : !eligibleFor.equals(((RewardInfo) (obj)).eligibleFor))
            {
                return false;
            }
            if (enrolled == null ? ((RewardInfo) (obj)).enrolled != null : !enrolled.equals(((RewardInfo) (obj)).enrolled))
            {
                return false;
            }
        }
        return true;
    }

    public com.ubercab.client.core.model.Balance getBalance()
    {
        return balance;
    }

    public volatile Balance getBalance()
    {
        return getBalance();
    }

    public String getEligibleFor()
    {
        return eligibleFor;
    }

    public boolean getEnabled()
    {
        return enabled.booleanValue();
    }

    public Boolean getEnrolled()
    {
        return enrolled;
    }

    public boolean hasBalance()
    {
        return balance != null;
    }

    public boolean hasTakenEnrollAction()
    {
        return enrolled != null;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (balance != null)
        {
            i = balance.hashCode();
        } else
        {
            i = 0;
        }
        if (eligibleFor != null)
        {
            j = eligibleFor.hashCode();
        } else
        {
            j = 0;
        }
        if (enabled != null)
        {
            k = enabled.hashCode();
        } else
        {
            k = 0;
        }
        if (enrolled != null)
        {
            l = enrolled.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public boolean isEarnOnly()
    {
        return !TextUtils.isEmpty(eligibleFor) && "E".equals(eligibleFor);
    }

    public boolean isEligible()
    {
        return !TextUtils.isEmpty(eligibleFor) && !"N".equals(eligibleFor);
    }

    public boolean isEnabled()
    {
        if (enabled == null)
        {
            return false;
        } else
        {
            return enabled.booleanValue();
        }
    }

    public boolean isEnrolled()
    {
        if (enrolled == null)
        {
            return false;
        } else
        {
            return enrolled.booleanValue();
        }
    }

    public boolean usePointsDisabled()
    {
        return !TextUtils.isEmpty(eligibleFor) && "B".equals(eligibleFor) && !isEnabled();
    }
}
