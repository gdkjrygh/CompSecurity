// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            ManagedBusinessProfileAttributes, ProfileTheme

public interface Profile
{

    public static final String BILLING_MODE_CENTRALIZED = "Centralized";
    public static final String BILLING_MODE_DECENTRALIZED = "Decentralized";
    public static final String SUMMARY_PERIOD_MONTHLY = "Monthly";
    public static final String SUMMARY_PERIOD_WEEKLY = "Weekly";
    public static final String TROY_PROFILE_TYPE_BUSINESS = "Business";
    public static final String TROY_PROFILE_TYPE_MANAGED_BUSINESS = "ManagedBusiness";
    public static final String TROY_PROFILE_TYPE_PERSONAL = "Personal";

    public abstract String getBillingMode();

    public abstract String getBillingModeFromChildAttributes();

    public abstract String getDefaultPaymentProfileUuid();

    public abstract String getEmail();

    public abstract boolean getIsExpensingEnabled();

    public abstract boolean getIsVerified();

    public abstract ManagedBusinessProfileAttributes getManagedBusinessProfileAttributes();

    public abstract String getMobile();

    public abstract String getName();

    public abstract String getNameFromChildAttributes();

    public abstract List getSelectedSummaryPeriods();

    public abstract ProfileTheme getTheme();

    public abstract ProfileTheme getThemeFromChildAttributes();

    public abstract String getType();

    public abstract String getUuid();
}
