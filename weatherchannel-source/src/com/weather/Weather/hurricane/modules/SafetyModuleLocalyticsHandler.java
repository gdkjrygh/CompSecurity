// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.hurricane.HurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.hurricane.HurricaneModuleViewedAttribute;

public class SafetyModuleLocalyticsHandler extends HurricaneCentralFeedLocalyticsModuleHandler
{

    private final LocalyticsEvent redCrossEvent;
    private final LocalyticsEvent safetyEvent;

    public SafetyModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, HurricaneModuleViewedAttribute hurricanemoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler, LocalyticsEvent localyticsevent, LocalyticsEvent localyticsevent1)
    {
        super(screenname, hurricanemoduleviewedattribute, localyticshandler, handler);
        redCrossEvent = localyticsevent;
        safetyEvent = localyticsevent1;
    }

    public void recordRedCrossButtonClick(String s)
    {
        if (redCrossEvent != null)
        {
            tagEventWithStorm(redCrossEvent, s);
        }
    }

    public void recordSafetyButtonClick(String s)
    {
        if (safetyEvent != null)
        {
            tagEventWithStorm(safetyEvent, s);
        }
    }
}
