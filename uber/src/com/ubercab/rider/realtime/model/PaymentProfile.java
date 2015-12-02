// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;


// Referenced classes of package com.ubercab.rider.realtime.model:
//            RewardInfo

public interface PaymentProfile
{

    public abstract String getAccountName();

    public abstract String getBillingCountryIso2();

    public abstract String getBillingZip();

    public abstract long getCardExpirationEpoch();

    public abstract String getCardNumber();

    public abstract String getCardType();

    public abstract String getExpirationMonthFormatted();

    public abstract String getExpirationYearFormatted();

    public abstract RewardInfo getRewardInfo();

    public abstract String getStatus();

    public abstract String getTokenDisplayName();

    public abstract String getTokenType();

    public abstract String getUseCase();

    public abstract String getUuid();
}
