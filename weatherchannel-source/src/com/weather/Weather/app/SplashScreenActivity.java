// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.localytics.android.Localytics;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

public class SplashScreenActivity extends TWCBaseActivity
{
    private class StartupRunnable
        implements Runnable
    {

        final SplashScreenActivity this$0;

        public void run()
        {
            startup();
        }

        private StartupRunnable()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }

    }


    private static final String TAG = "SplashScreenActivity";
    private Handler handler;
    private long startTime;
    private final Runnable startupRunnable = new StartupRunnable();
    private long time;

    public SplashScreenActivity()
    {
    }

    private void startup()
    {
        startActivity(new Intent(this, com/weather/Weather/app/WeatherController));
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        startTime = System.currentTimeMillis();
        setContentView(0x7f030003);
        time = getResources().getInteger(0x7f090023);
        handler = new Handler();
    }

    protected void onPause()
    {
        if (!isFinishing())
        {
            MetricRegistry metricregistry = MetricRegistry.getInstance();
            metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_NETWORK.getMetricName()).stop();
            metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_MEMCACHE.getMetricName()).stop();
            metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_DISKCACHE.getMetricName()).stop();
        }
        handler.removeCallbacks(startupRunnable);
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        Localytics.handleTestMode(getIntent());
        MetricRegistry metricregistry = MetricRegistry.getInstance();
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_NETWORK.getMetricName()).reset().start();
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_MEMCACHE.getMetricName()).reset().start();
        metricregistry.timer(com.weather.util.metric.Metric.MetricTag.TIMER_APPLAUNCH_DISKCACHE.getMetricName()).reset().start();
        long l = System.currentTimeMillis();
        l = time - (l - startTime);
        LogUtil.d("SplashScreenActivity", LoggingMetaTags.TWC_UI, "remainingSplashDuration=%s", new Object[] {
            Long.valueOf(l)
        });
        if (l > 10L)
        {
            handler.postDelayed(startupRunnable, l);
            return;
        } else
        {
            startup();
            return;
        }
    }

}
