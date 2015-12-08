// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import com.weather.Weather.app.WeatherController;
import com.weather.Weather.feed.FeedBounceActivity;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsVideo2DetailRecorder;
import com.weather.commons.analytics.LocalyticsVideo2SummaryRecorder;
import com.weather.commons.analytics.LocalyticsVideoDetailRecorder;
import com.weather.commons.analytics.LocalyticsVideoSummaryRecorder;
import com.weather.commons.video2.VideoUtil;

public class Video extends FeedBounceActivity
{

    public Video()
    {
        super(com/weather/Weather/app/WeatherController);
        LocalyticsHandler localyticshandler = LocalyticsHandler.getInstance();
        if (VideoUtil.useImaVideoFeature())
        {
            localyticshandler.getLocalyticsVideo2SummaryRecorder().recordVideoDeeplink();
            localyticshandler.getLocalyticsVideo2DetailRecorder().recordVideoDeeplink();
            return;
        } else
        {
            localyticshandler.getLocalyticsVideoSummaryRecorder().recordVideoDeeplink();
            localyticshandler.getLocalyticsVideoDetailRecorder().recordVideoDeeplink();
            return;
        }
    }

    protected String getModuleId()
    {
        return "video";
    }
}
