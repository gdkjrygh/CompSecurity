// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import com.google.common.base.Preconditions;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.ups.LocalyticsUpsSignupSource;
import com.weather.commons.analytics.ups.LocalyticsUpsSupport;

public class AnalyticsWpDialogListener extends UpsCommonUtil.AbstractWPDialogListener
{

    private final LocalyticsHandler localyticsHandler;
    private final String omnitureBeacon;
    private final LocalyticsUpsSignupSource signupSource;

    public AnalyticsWpDialogListener(String s, LocalyticsUpsSignupSource localyticsupssignupsource, LocalyticsHandler localyticshandler)
    {
        omnitureBeacon = s;
        signupSource = (LocalyticsUpsSignupSource)Preconditions.checkNotNull(localyticsupssignupsource);
        localyticsHandler = (LocalyticsHandler)Preconditions.checkNotNull(localyticshandler);
    }

    public void onClickPositive()
    {
        super.onClickPositive();
        LocalyticsUpsSupport.recordSignupStarted(localyticsHandler, signupSource);
        if (omnitureBeacon != null)
        {
            Analytics.trackAction(omnitureBeacon, null);
        }
    }
}
