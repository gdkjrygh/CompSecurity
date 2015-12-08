// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.os.Handler;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.hurricane.HurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.analytics.hurricane.HurricaneModuleViewedAttribute;

public class HurricaneVideoModuleLocalyticsHandler extends HurricaneCentralFeedLocalyticsModuleHandler
{

    private final com.weather.commons.analytics.LocalyticsTags.ScreenName previousScreen;

    public HurricaneVideoModuleLocalyticsHandler(com.weather.commons.analytics.LocalyticsTags.ScreenName screenname, com.weather.commons.analytics.LocalyticsTags.ScreenName screenname1, HurricaneModuleViewedAttribute hurricanemoduleviewedattribute, LocalyticsHandler localyticshandler, Handler handler)
    {
        super(screenname, hurricanemoduleviewedattribute, localyticshandler, handler);
        previousScreen = screenname1;
    }

    public com.weather.commons.analytics.LocalyticsTags.ScreenName getPreviousScreen()
    {
        return previousScreen;
    }
}
