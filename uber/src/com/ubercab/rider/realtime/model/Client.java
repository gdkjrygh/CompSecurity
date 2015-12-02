// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            PaymentProfile, Itinerary, TripExpenseInfo

public interface Client
{

    public abstract PaymentProfile findPaymentProfileByUuid(String s);

    public abstract String getClaimedMobile();

    public abstract int getCountryId();

    public abstract List getCreditBalances();

    public abstract String getCurrentMobile();

    public abstract String getEmail();

    public abstract String getFirstName();

    public abstract String getFormattedName();

    public abstract boolean getHasAmericanMobile();

    public abstract boolean getHasConfirmedMobile();

    public abstract boolean getHasToOptInSmsNotifications();

    public abstract List getInactivePaymentProfiles();

    public abstract boolean getIsAdmin();

    public abstract Itinerary getLastEstimatedTrip();

    public abstract TripExpenseInfo getLastExpenseInfo();

    public abstract String getLastName();

    public abstract PaymentProfile getLastSelectedPaymentProfile();

    public abstract boolean getLastSelectedPaymentProfileIsGoogleWallet();

    public abstract String getLastSelectedPaymentProfileUUID();

    public abstract String getMobile();

    public abstract String getMobileCountryCode();

    public abstract int getMobileCountryId();

    public abstract String getMobileCountryIso2();

    public abstract String getMobileDigits();

    public abstract List getPaymentProfiles();

    public abstract String getPictureUrl();

    public abstract List getProfiles();

    public abstract String getPromotion();

    public abstract List getRecentFareSplitters();

    public abstract String getReferralCode();

    public abstract String getReferralUrl();

    public abstract String getRole();

    public abstract Map getThirdPartyIdentities();

    public abstract String getToken();

    public abstract List getTripBalances();

    public abstract String getUuid();

    public abstract Boolean isMobileRevoked();
}
