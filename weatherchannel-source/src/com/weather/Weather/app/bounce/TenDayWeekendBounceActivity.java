// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.weather.Weather.tenday.TenDayForecastDetailActivity;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class TenDayWeekendBounceActivity extends Activity
{

    private static final String TAG = "TenDayWeekendBounceActivity";

    public TenDayWeekendBounceActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle != null)
        {
            bundle = new Intent(bundle);
            bundle.setClass(this, com/weather/Weather/tenday/TenDayForecastDetailActivity);
            bundle.putExtra("com.weather.scrollToFriday", true);
            LogUtil.d("TenDayWeekendBounceActivity", LoggingMetaTags.TWC_DEEPLINK, (new StringBuilder()).append("onCreate: bounceIntent=").append(bundle).append(", extras=").append(bundle.getExtras()).toString(), new Object[0]);
            startActivity(bundle);
        }
        finish();
    }
}
