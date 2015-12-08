// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.widget.AbsListView;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements android.widget.Listener
{

    final WeatherController this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i != 0)
        {
            LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.SCROLLED, com.weather.commons.analytics.alues.AttributeValue.BOOLEAN_YES.getAttributeValue());
        }
    }

    ummaryRecorder()
    {
        this$0 = WeatherController.this;
        super();
    }
}
