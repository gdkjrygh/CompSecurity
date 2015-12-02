// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            Balance

public interface RewardInfo
{

    public abstract boolean eligibleToUsePoints();

    public abstract Balance getBalance();

    public abstract String getEligibleFor();

    public abstract boolean getEnabled();

    public abstract Boolean getEnrolled();

    public abstract boolean hasBalance();

    public abstract boolean hasTakenEnrollAction();

    public abstract boolean isEarnOnly();

    public abstract boolean isEligible();

    public abstract boolean isEnabled();

    public abstract boolean isEnrolled();

    public abstract boolean usePointsDisabled();
}
