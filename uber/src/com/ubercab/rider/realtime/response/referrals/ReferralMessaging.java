// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response.referrals;


public abstract class ReferralMessaging
{

    public ReferralMessaging()
    {
    }

    public abstract String getCardCta();

    public abstract String getCardHeadline();

    public abstract String getCardRequirements();

    public abstract String getCardSubline();

    public abstract String getEmailBody();

    public abstract String getEmailSubject();

    public abstract String getEmailVehicleSolutions();

    public abstract String getMessageBody();

    public abstract String getSocialMessage();

    abstract ReferralMessaging setCardCta(String s);

    abstract ReferralMessaging setCardHeadline(String s);

    abstract ReferralMessaging setCardRequirements(String s);

    abstract ReferralMessaging setCardSubline(String s);

    abstract ReferralMessaging setEmailBody(String s);

    abstract ReferralMessaging setEmailSubject(String s);

    abstract ReferralMessaging setEmailVehicleSolutions(String s);

    abstract ReferralMessaging setMessageBody(String s);

    abstract ReferralMessaging setSocialMessage(String s);
}
