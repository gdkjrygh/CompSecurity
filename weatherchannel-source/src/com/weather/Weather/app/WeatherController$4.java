// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.view.View;
import com.weather.Weather.feed.ListAutoScroller;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements android.view.
{

    final WeatherController this$0;

    public void onClick(View view)
    {
        boolean flag;
        if (moduleListView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsFeedButton.BACK_TO_TOP, com.weather.commons.analytics.alues.AttributeValue.BOOLEAN_YES.getAttributeValue());
            WeatherController.access$000(WeatherController.this).smoothScrollToTop();
        }
    }

    ummaryRecorder()
    {
        this$0 = WeatherController.this;
        super();
    }
}
