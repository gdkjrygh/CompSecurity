// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.weather.Weather.app.WeatherController;
import com.weather.beacons.analytics.Analytics;
import com.weather.beacons.targeting.BeaconTargetingParam;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.WidgetLocations;
import com.weather.util.log.LogUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.weather.Weather.widgets:
//            WidgetType, ClockRefreshService

public abstract class WeatherWidgetProvider extends AppWidgetProvider
{

    public static final String ACTION_CLOCK_REFRESH = "com.weather.Weather.widgets.action.CLOCK_REFRESH";
    public static final String ACTION_REFRESH = "com.weather.Weather.widgets.action.REFRESH";
    public static final String ALERT_COUNT_KEY = "com.weather.Weather.widgets.ALERT_COUNT_KEY";
    public static final String ALERT_SEVERITY_KEY = "com.weather.Weather.widgets.ALERT_SEVERITY_KEY";
    public static final String FROM_WIDGET = "com.weather.Weather.widgets.FROM_WIDGET";
    public static final String ICON_KEY = "com.weather.Weather.widgets.ICON_KEY";
    public static final String LOCATION_NAME_KEY = "com.weather.Weather.widgets.LOCATION_NAME_KEY";
    public static final String OLD_DATA = "com.weather.Weather.widgets.OLD_DATA";
    public static final String PHRASE_KEY = "com.weather.Weather.widgets.PHRASE_KEY";
    public static final String PREFIX = "com.weather.Weather.widgets";
    protected static final String TAG = "WeatherWidgetProvider";
    public static final String TEMPERATURE_KEY = "com.weather.Weather.widgets.TEMPERATURE_KEY";
    protected static final String TIME_OFFSET = "TIME_OFFSET";
    protected static final Map widgetTypeMap = new HashMap();

    public WeatherWidgetProvider()
    {
    }

    private int[] getIds(Context context, AppWidgetManager appwidgetmanager, Bundle bundle)
    {
        return intersect(bundle.getIntArray("appWidgetIds"), appwidgetmanager.getAppWidgetIds(new ComponentName(context, getClass().getName())));
    }

    public static PendingIntent getLaunchIntent(Context context, int i, Bundle bundle, int j)
    {
        Intent intent = new Intent(context, com/weather/Weather/app/WeatherController);
        intent.setFlags(0x4000000);
        intent.putExtras(new Bundle(bundle));
        intent.putExtra("com.weather.Weather.widgets.FROM_WIDGET", j);
        return PendingIntent.getActivity(context, i, intent, 0x8000000);
    }

    private Calendar getNextFullMinute()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, 60 - calendar.get(13));
        return calendar;
    }

    public static Intent getRefreshBroadcastIntent(int ai[], Bundle bundle, String s)
    {
        Intent intent = new Intent("com.weather.Weather.widgets.action.REFRESH");
        bundle.putIntArray("appWidgetIds", ai);
        bundle.putString("TIME_OFFSET", s);
        intent.putExtras(bundle);
        return intent;
    }

    public static Intent getRefreshBroadcastIntent(int ai[], CurrentWeatherFacade currentweatherfacade, SavedLocation savedlocation, String s)
    {
        return getRefreshBroadcastIntent(ai, makeExtras(currentweatherfacade, savedlocation), s);
    }

    private void hideAlertIcons(RemoteViews remoteviews)
    {
        remoteviews.setViewVisibility(0x7f0d0340, 8);
        remoteviews.setViewVisibility(0x7f0d0341, 8);
    }

    private int[] intersect(int ai[], int ai1[])
    {
        return Ints.toArray(Sets.intersection(new HashSet(Ints.asList(ai)), new HashSet(Ints.asList(ai1))));
    }

    public static Bundle makeExtras(CurrentWeatherFacade currentweatherfacade, SavedLocation savedlocation)
    {
        if (currentweatherfacade == null)
        {
            return makeExtras(savedlocation, -1, null, 0, -1, -1, true);
        }
        WeatherAlertsFacade weatheralertsfacade;
        int i;
        int j;
        int k;
        if (currentweatherfacade.getCurrentTemp().value == null)
        {
            i = -1;
        } else
        {
            i = ((Integer)currentweatherfacade.getCurrentTemp().value).intValue();
        }
        weatheralertsfacade = currentweatherfacade.getWeatherAlertsFacade();
        if (weatheralertsfacade != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            j = weatheralertsfacade.getAlertsList().size();
        } else
        {
            j = 0;
        }
        if (k != 0)
        {
            k = weatheralertsfacade.getLowestSeverityNumber();
        } else
        {
            k = 0;
        }
        return makeExtras(savedlocation, i, currentweatherfacade.getPhrase(), currentweatherfacade.getSkyCode(), j, k, false);
    }

    public static Bundle makeExtras(SavedLocation savedlocation, int i, String s, int j, int k, int l, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.weather.Weather.ui.LOCATION_KEY", savedlocation.getKeyTypeCountry());
        bundle.putString("com.weather.Weather.widgets.LOCATION_NAME_KEY", savedlocation.getNickname());
        bundle.putInt("com.weather.Weather.widgets.TEMPERATURE_KEY", i);
        bundle.putString("com.weather.Weather.widgets.PHRASE_KEY", s);
        bundle.putInt("com.weather.Weather.widgets.ICON_KEY", j);
        if (k > 0)
        {
            bundle.putInt("com.weather.Weather.widgets.ALERT_COUNT_KEY", k);
            bundle.putInt("com.weather.Weather.widgets.ALERT_SEVERITY_KEY", l);
        }
        bundle.putBoolean("com.weather.Weather.widgets.OLD_DATA", flag);
        return bundle;
    }

    private void showAlertIcon(Bundle bundle, RemoteViews remoteviews)
    {
        int i;
        int j;
        i = bundle.getInt("com.weather.Weather.widgets.ALERT_COUNT_KEY");
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        j = bundle.getInt("com.weather.Weather.widgets.ALERT_SEVERITY_KEY");
        if (1 != j) goto _L2; else goto _L1
_L1:
        showRedAlertIcon(remoteviews, i);
_L4:
        return;
_L2:
        if (2 != j && 3 != j) goto _L4; else goto _L3
_L3:
        showOrangeAlertIcon(remoteviews, i);
        return;
        hideAlertIcons(remoteviews);
        return;
    }

    private void showOrangeAlertIcon(RemoteViews remoteviews, int i)
    {
        remoteviews.setViewVisibility(0x7f0d0341, 0);
        remoteviews.setViewVisibility(0x7f0d0340, 8);
        remoteviews.setTextViewText(0x7f0d0341, String.valueOf(i));
    }

    private void showRedAlertIcon(RemoteViews remoteviews, int i)
    {
        remoteviews.setViewVisibility(0x7f0d0340, 0);
        remoteviews.setViewVisibility(0x7f0d0341, 8);
        remoteviews.setTextViewText(0x7f0d0340, String.valueOf(i));
    }

    private void updateClock(RemoteViews remoteviews, String s, boolean flag)
    {
        TimeZone timezone = TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(s).toString());
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, MMM d", Locale.getDefault());
        simpledateformat.setTimeZone(timezone);
        if (!flag)
        {
            s = new SimpleDateFormat("a", Locale.getDefault());
            s.setTimeZone(timezone);
            remoteviews.setTextViewText(0x7f0d0349, s.format(new Date()));
            s = new SimpleDateFormat("h:mm", Locale.getDefault());
        } else
        {
            remoteviews.setTextViewText(0x7f0d0349, "");
            s = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        s.setTimeZone(timezone);
        remoteviews.setTextViewText(0x7f0d0348, s.format(new Date()));
        remoteviews.setTextViewText(0x7f0d034d, simpledateformat.format(new Date()));
    }

    protected abstract String getClassName();

    public abstract int getLayoutId();

    public void onDeleted(Context context, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            WidgetLocations.getInstance().removeLocation(Integer.valueOf(k));
        }

        ArrayMap arraymap = new ArrayMap(1);
        arraymap.put(BeaconTargetingParam.WIDGET_TYPE, getClassName());
        Analytics.trackAction(context.getResources().getString(0x7f0704eb), arraymap);
        super.onDeleted(context, ai);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.weather.Weather.widgets.action.REFRESH".equals(intent.getAction()) || "com.weather.Weather.widgets.action.CLOCK_REFRESH".equals(intent.getAction()))
        {
            intent = intent.getExtras();
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = (Bundle)intent.clone();
            }
            if (intent != null && intent.containsKey("appWidgetIds") && intent.get("appWidgetIds") != null)
            {
                AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
                int ai[] = getIds(context, appwidgetmanager, intent);
                if (ai.length > 0)
                {
                    intent.putIntArray("appWidgetIds", ai);
                    onUpdate(context, appwidgetmanager, intent);
                }
            }
            return;
        } else
        {
            super.onReceive(context, intent);
            return;
        }
    }

    public void onUpdate(Context context, AppWidgetManager appwidgetmanager, Bundle bundle)
    {
        Log.i("WeatherWidgetProvider", (new StringBuilder()).append("onUpdate: ").append(getClass().getSimpleName()).append(", extras: ").append(LogUtil.bundleToString(bundle)).toString());
        int ai[] = bundle.getIntArray("appWidgetIds");
        int j = ((WidgetType)widgetTypeMap.get(getClass().getCanonicalName())).getValue();
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            int l = ai[i];
            scheduleClockUpdate(context, bundle, l);
            updateWidget(context, appwidgetmanager, bundle, l, j);
        }

    }

    protected void scheduleClockUpdate(Context context, Bundle bundle, int i)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        context = PendingIntent.getService(context, i, ClockRefreshService.getIntent(context, new Bundle(bundle)), 0x8000000);
        bundle = getNextFullMinute();
        if (android.os.Build.VERSION.SDK_INT == 19)
        {
            alarmmanager.setExact(1, bundle.getTimeInMillis(), context);
            return;
        } else
        {
            alarmmanager.set(1, bundle.getTimeInMillis(), context);
            return;
        }
    }

    public void updateWidget(Context context, AppWidgetManager appwidgetmanager, Bundle bundle, int i, int j)
    {
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), getLayoutId());
        if (bundle.getBoolean("com.weather.Weather.widgets.OLD_DATA"))
        {
            remoteviews.setViewVisibility(0x7f0d0344, 8);
            remoteviews.setViewVisibility(0x7f0d034a, 8);
            remoteviews.setViewVisibility(0x7f0d0346, 0);
        } else
        {
            remoteviews.setViewVisibility(0x7f0d0344, 0);
            remoteviews.setViewVisibility(0x7f0d034a, 0);
            remoteviews.setViewVisibility(0x7f0d0346, 8);
            remoteviews.setImageViewBitmap(0x7f0d0342, WxIconBitmapCache.getBitmap((new WxIconItem(Integer.valueOf(bundle.getInt("com.weather.Weather.widgets.ICON_KEY")))).getSvgIconId()));
            remoteviews.setTextViewText(0x7f0d0343, (new StringBuilder()).append(bundle.getInt("com.weather.Weather.widgets.TEMPERATURE_KEY")).append("\260").toString());
            remoteviews.setTextViewText(0x7f0d0347, bundle.getString("com.weather.Weather.widgets.PHRASE_KEY"));
            remoteviews.setTextViewText(0x7f0d0345, bundle.getString("com.weather.Weather.widgets.LOCATION_NAME_KEY"));
            boolean flag = android.text.format.DateFormat.is24HourFormat(context);
            updateClock(remoteviews, bundle.getString("TIME_OFFSET"), flag);
            showAlertIcon(bundle, remoteviews);
        }
        remoteviews.setOnClickPendingIntent(0x7f0d033f, getLaunchIntent(context, i, bundle, j));
        appwidgetmanager.updateAppWidget(i, remoteviews);
    }

}
