// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertIcon;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.UIUtil;
import java.util.List;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class HomeScreenUI
{

    private static final String TAG = com/weather/Weather/app/HomeScreenUI.getName();
    public final TextView alertDescription;
    public final ImageView alertIcon;
    public final TextView alertText;
    private boolean alertsExistForLocation;
    private final TextView highLow;
    private final ImageView icon;
    public final RelativeLayout nowCircleFront;
    private final RelativeLayout nowCircleRefresh;
    public final LinearLayout nowSevereAlerts;
    private final TextView phrase;
    private final ProgressBar progressbar;
    private final TextView temperature;
    private final TextView temperatureDegreeSymbol;
    private final TextView temperatureNegativeSymbol;
    private final WeatherController weatherController;

    HomeScreenUI(WeatherController weathercontroller)
    {
        weatherController = (WeatherController)Preconditions.checkNotNull(weathercontroller);
        nowCircleFront = (RelativeLayout)Preconditions.checkNotNull((RelativeLayout)weatherController.findViewById(0x7f0d01e4));
        icon = (ImageView)Preconditions.checkNotNull((ImageView)weatherController.findViewById(0x7f0d01f0));
        temperatureNegativeSymbol = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f2));
        temperature = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f1));
        temperatureDegreeSymbol = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f3));
        phrase = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d0093));
        highLow = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f4));
        weathercontroller = (ImageView)Preconditions.checkNotNull((ImageView)weatherController.findViewById(0x7f0d01e2));
        if (UIUtil.isAmazonMobile(weatherController))
        {
            weathercontroller.setVisibility(4);
        } else
        {
            weathercontroller.setOnClickListener(new _cls1());
        }
        ((ImageView)Preconditions.checkNotNull((ImageView)weatherController.findViewById(0x7f0d01e3))).setOnClickListener(new _cls2());
        progressbar = (ProgressBar)Preconditions.checkNotNull((ProgressBar)weatherController.findViewById(0x7f0d01ea));
        nowCircleRefresh = (RelativeLayout)Preconditions.checkNotNull((RelativeLayout)weatherController.findViewById(0x7f0d01e5));
        nowSevereAlerts = (LinearLayout)Preconditions.checkNotNull((LinearLayout)weatherController.findViewById(0x7f0d0029));
        alertDescription = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f8));
        alertText = (TextView)Preconditions.checkNotNull((TextView)weatherController.findViewById(0x7f0d01f7));
        alertIcon = (ImageView)Preconditions.checkNotNull((ImageView)weatherController.findViewById(0x7f0d01f6));
    }

    private Bitmap getAlertWxIconBitmap(WeatherAlertsFacade weatheralertsfacade)
    {
        weatheralertsfacade = weatheralertsfacade.getAlertsList();
        if (!weatheralertsfacade.isEmpty())
        {
            return WxIconBitmapCache.getBitmap(((WeatherAlert)weatheralertsfacade.get(0)).getIconCode().getIconId());
        } else
        {
            return null;
        }
    }

    private Bitmap getWxIconBitmap(Integer integer)
    {
        return WxIconBitmapCache.getBitmap((new WxIconItem(integer)).getSvgIconId());
    }

    private void setAlertColor(int i)
    {
        alertDescription.setTextColor(i);
        alertText.setBackgroundColor(i);
        alertIcon.setBackgroundColor(i);
    }

    private void setAlerts(WeatherAlertsFacade weatheralertsfacade)
    {
        MainFeedSummaryRecorder mainfeedsummaryrecorder = LocalyticsHandler.getInstance().getMainFeedSummaryRecorder();
        if (weatheralertsfacade == null || weatheralertsfacade.getAlertsList().isEmpty())
        {
            alertsExistForLocation = false;
            mainfeedsummaryrecorder.putValueIfAbsent(LocalyticsMainFeedTag.SEVERE_WEATHER_WARNING, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
            showHideSevereAlert();
            return;
        }
        alertsExistForLocation = true;
        alertDescription.setText(weatheralertsfacade.getTitle());
        alertDescription.setSelected(true);
        if (weatheralertsfacade.getLowestSeverityNumber() == 1)
        {
            showRedAlerts(weatheralertsfacade);
        } else
        {
            showOrangeAlerts();
        }
        nowSevereAlerts.setOnClickListener(new _cls3());
        mainfeedsummaryrecorder.putValue(LocalyticsMainFeedTag.SEVERE_WEATHER_WARNING, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    private void setCurrentTemperature(Temperature temperature1)
    {
        TextView textview;
        int i;
        if (temperature1.value != null && ((Integer)temperature1.value).intValue() < 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        textview = temperatureNegativeSymbol;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        temperature.setText(temperature1.formatAbsValue());
        temperatureDegreeSymbol.setVisibility(0);
    }

    private void setHiLo(CurrentWeatherFacade currentweatherfacade)
    {
        highLow.setText((new StringBuilder()).append(currentweatherfacade.getHiTemp().formatShort()).append(" / ").append(currentweatherfacade.getLoTemp().formatShort()).toString());
    }

    private void setWeatherIcon(Integer integer)
    {
        Bitmap bitmap = getWxIconBitmap(integer);
        icon.setImageBitmap(bitmap);
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValueIfAbsent(LocalyticsMainFeedTag.CURRENT_WEATHER_TYPE, integer.toString());
    }

    private void showOrangeAlerts()
    {
        alertIcon.setVisibility(0);
        alertIcon.setImageBitmap(WxIconBitmapCache.getBitmap(WeatherAlertIcon.GENERIC.getIconId()));
        setAlertColor(alertDescription.getResources().getColor(0x7f0b008d));
        showHideSevereAlert();
    }

    private void showRedAlerts(WeatherAlertsFacade weatheralertsfacade)
    {
        weatheralertsfacade = getAlertWxIconBitmap(weatheralertsfacade);
        if (weatheralertsfacade != null)
        {
            alertIcon.setImageBitmap(weatheralertsfacade);
            alertIcon.setVisibility(0);
        } else
        {
            alertIcon.setVisibility(8);
        }
        setAlertColor(alertDescription.getResources().getColor(0x7f0b008e));
        showHideSevereAlert();
    }

    public boolean doAlertsExistForLocation()
    {
        return alertsExistForLocation;
    }

    public ProgressBar getProgressbar()
    {
        return progressbar;
    }

    public void setCurrentWeather(CurrentWeatherFacade currentweatherfacade)
    {
        LogUtil.method(TAG, LoggingMetaTags.TWC_METRICS, "setCurrentWeather", new Object[] {
            (new StringBuilder()).append("weatherSource=").append(currentweatherfacade.getRecordSetsSource()).toString()
        });
        setCurrentTemperature(currentweatherfacade.getCurrentTemp());
        setWeatherIcon(Integer.valueOf(currentweatherfacade.getSkyCode()));
        phrase.setText(currentweatherfacade.getPhrase());
        setHiLo(currentweatherfacade);
        setFrontCircleVisible();
        setAlerts(currentweatherfacade.getWeatherAlertsFacade());
    }

    public void setFrontCircleVisible()
    {
        nowCircleFront.setVisibility(0);
        progressbar.setVisibility(4);
        nowCircleRefresh.setVisibility(4);
    }

    public void setNoCurrentWeather()
    {
        temperatureNegativeSymbol.setVisibility(8);
        temperature.setText("--");
        temperatureDegreeSymbol.setVisibility(8);
        setWeatherIcon(Integer.valueOf(44));
        phrase.setText(0x7f0701f3);
        highLow.setText("-- / --");
        setFrontCircleVisible();
        setAlerts(null);
    }

    public void showHideSevereAlert()
    {
        int i = weatherController.desiredSevereAlertVisibility();
        nowSevereAlerts.setVisibility(i);
    }



    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
