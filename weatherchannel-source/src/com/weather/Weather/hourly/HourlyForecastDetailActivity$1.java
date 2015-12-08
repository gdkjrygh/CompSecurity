// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hourly;

import android.widget.AbsListView;
import com.weather.commons.facade.HourlyWeather;

// Referenced classes of package com.weather.Weather.hourly:
//            HourlyForecastDetailActivity, HourlyAdapter

class this._cls0
    implements android.widget.lActivity._cls1
{

    final HourlyForecastDetailActivity this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (HourlyForecastDetailActivity.access$000(HourlyForecastDetailActivity.this).getCount() > i)
        {
            HourlyForecastDetailActivity.access$100(HourlyForecastDetailActivity.this, (HourlyWeather)HourlyForecastDetailActivity.access$000(HourlyForecastDetailActivity.this).getItem(i));
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    ()
    {
        this$0 = HourlyForecastDetailActivity.this;
        super();
    }
}
