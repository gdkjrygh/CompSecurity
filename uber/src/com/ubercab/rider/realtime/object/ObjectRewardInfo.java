// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import hmo;

abstract class ObjectRewardInfo
    implements hmo
{

    private static final String ELIGIBLE_TO_EARN = "E";
    private static final String ELIGIBLE_TO_EARN_OR_BURN = "B";

    ObjectRewardInfo()
    {
    }

    public boolean eligibleToUsePoints()
    {
        return "B".equals(getEligibleFor());
    }

    public boolean hasBalance()
    {
        return getBalance() != null;
    }

    public boolean hasTakenEnrollAction()
    {
        return getEnrolled() != null;
    }

    public boolean isEarnOnly()
    {
        return "E".equals(getEligibleFor());
    }

    public boolean isEligible()
    {
        return "E".equals(getEligibleFor()) || "B".equals(getEligibleFor());
    }

    public boolean isEnabled()
    {
        return getEnabled();
    }

    public boolean isEnrolled()
    {
        return getEnrolled() != null && getEnrolled().booleanValue();
    }

    public boolean usePointsDisabled()
    {
        return eligibleToUsePoints() && !isEnabled();
    }
}
