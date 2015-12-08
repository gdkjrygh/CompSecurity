// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.tenday;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.LocalyticsModuleViewedAttribute;
import com.weather.commons.analytics.feed.MainFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;

public class ForecastLocalyticsModuleHandler extends MainFeedLocalyticsModuleHandler
{

    private final LocalyticsFeedButton extendedForecastButton;
    private final LocalyticsFeedButton weekendForecastButton;

    public ForecastLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, LocalyticsModuleViewedAttribute localyticsmoduleviewedattribute, LocalyticsFeedButton localyticsfeedbutton, LocalyticsFeedButton localyticsfeedbutton1, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, localyticsmoduleviewedattribute, localyticshandler, handler);
        extendedForecastButton = localyticsfeedbutton;
        weekendForecastButton = localyticsfeedbutton1;
    }

    private void recordClick(LocalyticsFeedButton localyticsfeedbutton)
    {
        if (localyticsfeedbutton != null)
        {
            localyticsHandler.getMainFeedSummaryRecorder().putValue(localyticsfeedbutton, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        }
    }

    public void recordExtendedButtonClicked()
    {
        recordClick(extendedForecastButton);
    }

    public void recordWeekendButtonClicked()
    {
        recordClick(weekendForecastButton);
    }
}
