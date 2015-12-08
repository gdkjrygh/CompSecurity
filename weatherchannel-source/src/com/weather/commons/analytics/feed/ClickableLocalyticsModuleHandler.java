// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.feed;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;

// Referenced classes of package com.weather.commons.analytics.feed:
//            MainFeedLocalyticsModuleHandler, MainFeedSummaryRecorder, LocalyticsFeedButton, LocalyticsModuleViewedAttribute

public class ClickableLocalyticsModuleHandler extends MainFeedLocalyticsModuleHandler
{

    private final LocalyticsFeedButton feedButton;

    public ClickableLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, LocalyticsModuleViewedAttribute localyticsmoduleviewedattribute, LocalyticsFeedButton localyticsfeedbutton, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, localyticsmoduleviewedattribute, localyticshandler, handler);
        feedButton = localyticsfeedbutton;
    }

    public void recordButtonClick()
    {
        if (feedButton != null)
        {
            localyticsHandler.getMainFeedSummaryRecorder().putValue(feedButton, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        }
    }
}
