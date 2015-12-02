// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


// Referenced classes of package com.ubercab.rider.realtime.response.referrals:
//            ReferralMessaging

public abstract class PartnerCampaignSummary
{

    public PartnerCampaignSummary()
    {
    }

    public abstract String getCurrencyCode();

    public abstract ReferralMessaging getMessaging();

    public abstract int getPendingTotalReferralAmount();

    public abstract String getReferralCode();

    public abstract int getReferralInviteeAmount();

    public abstract int getReferralInviterAmount();

    public abstract int getReferralTripsRequired();

    public abstract String getReferralUrl();

    public abstract PartnerCampaignSummary setCurrencyCode(String s);

    public abstract PartnerCampaignSummary setMessaging(ReferralMessaging referralmessaging);

    public abstract PartnerCampaignSummary setPendingTotalReferralAmount(int i);

    public abstract PartnerCampaignSummary setReferralCode(String s);

    public abstract PartnerCampaignSummary setReferralInviteeAmount(int i);

    public abstract PartnerCampaignSummary setReferralInviterAmount(int i);

    public abstract PartnerCampaignSummary setReferralTripsRequired(int i);

    public abstract PartnerCampaignSummary setReferralUrl(String s);
}
