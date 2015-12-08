// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.LocalyticsRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.analytics.hurricane.HurricaneModuleViewedAttribute;

public class StormTrackLocalyticsModuleHandler extends HurricaneCentralFeedLocalyticsModuleHandler
{

    private final com.weather.commons.analytics.LocalyticsTags.ScreenName screenName;

    public StormTrackLocalyticsModuleHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, HurricaneModuleViewedAttribute hurricanemoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler, com.weather.commons.analytics.LocalyticsTags.ScreenName screenname1)
    {
        super(screenname, hurricanemoduleviewedattribute, localyticshandler, handler);
        screenName = screenname1;
    }

    public void recordButtonClick()
    {
        if (screenName != null)
        {
            localyticsHandler.getHurricaneCentralMapSummaryRecorder().putValueIfAbsent(HurricaneCentralTag.PREVIOUS_SCREEN, screenName.getName());
        }
    }
}
