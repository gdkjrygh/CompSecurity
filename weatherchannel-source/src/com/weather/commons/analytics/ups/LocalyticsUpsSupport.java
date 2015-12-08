// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.ups;

import com.google.common.collect.ImmutableMap;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.Demographics;

// Referenced classes of package com.weather.commons.analytics.ups:
//            LocalyticsUpsLoginSummaryRecorder, LocalyticsUpsAccountProvider, LocalyticsUpsSignupSummaryRecorder, LocalyticsUpsTag, 
//            LocalyticsUpsSignupSource

public final class LocalyticsUpsSupport
{

    private LocalyticsUpsSupport()
    {
    }

    public static void recordAccountDeleted(LocalyticsHandler localyticshandler)
    {
        localyticshandler.tagEvent(LocalyticsEvent.UPS_ACCOUNT_DELETED);
    }

    public static void recordLoginSummary(LocalyticsHandler localyticshandler)
    {
        localyticshandler.tagEvent(LocalyticsEvent.UPS_LOGIN_STARTED);
        localyticshandler.getUpsLoginSummaryRecorder().recordLoginProcessStarted();
    }

    public static void recordSignupComplete(LocalyticsHandler localyticshandler, Demographics demographics, DsxAccount dsxaccount)
    {
        LocalyticsUpsAccountProvider localyticsupsaccountprovider = LocalyticsUpsAccountProvider.valueOf(dsxaccount.getProvider());
        if (localyticsupsaccountprovider == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported provided used for creating account: ").append(dsxaccount.getProvider()).toString());
        } else
        {
            localyticshandler.tagEvent(LocalyticsEvent.UPS_SIGNUP_COMPLETE);
            localyticshandler.getUpsSignupSummaryRecorder().recordAccountCreated(demographics, localyticsupsaccountprovider);
            return;
        }
    }

    public static void recordSignupStarted(LocalyticsHandler localyticshandler, LocalyticsUpsSignupSource localyticsupssignupsource)
    {
        localyticshandler.tagEvent(LocalyticsEvent.UPS_SIGNUP_STARTED, ImmutableMap.of(LocalyticsUpsTag.REFERRER_SOURCE, localyticsupssignupsource.getAttributeValue()));
        localyticshandler.getUpsSignupSummaryRecorder().recordCreationProcessStarted();
    }
}
