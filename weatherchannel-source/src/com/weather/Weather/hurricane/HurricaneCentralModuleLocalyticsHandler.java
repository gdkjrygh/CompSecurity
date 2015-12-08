// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.LocalyticsModuleViewedAttribute;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;

public class HurricaneCentralModuleLocalyticsHandler extends ClickableLocalyticsModuleHandler
{

    private final com.weather.commons.analytics.LocalyticsTags.ScreenName feedScreen;

    public HurricaneCentralModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, com.weather.commons.analytics.LocalyticsTags.ScreenName screenname1, LocalyticsModuleViewedAttribute localyticsmoduleviewedattribute, LocalyticsFeedButton localyticsfeedbutton, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, localyticsmoduleviewedattribute, localyticsfeedbutton, localyticshandler, handler);
        feedScreen = screenname1;
    }

    public void logStartHurricaneCentralFeed()
    {
        if (feedScreen != null)
        {
            localyticsHandler.getHurricaneCentralSummaryRecorder().putValue(HurricaneCentralTag.PREVIOUS_SCREEN, feedScreen.getName());
        }
    }
}
