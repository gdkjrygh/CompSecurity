// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.rightnow;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.Weather.feed.Module;
import com.weather.Weather.lastupdate.LastUpdatedUtil;
import com.weather.Weather.ui.ColorArc;
import com.weather.Weather.video.VideoPreviewFactory;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Distance;
import com.weather.commons.facade.FacadeUtils;
import com.weather.commons.facade.Percentage;
import com.weather.commons.facade.Pressure;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.UVIndex;
import com.weather.commons.facade.Wind;
import com.weather.util.UnitType;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public final class RightNowModule extends Module
{

    private static final int LAST_UPDATED_UPDATE_DELAY_MILLIS = 3000;
    private ColorArc colorArc;
    private Runnable delayedUpdater;
    private TextView dewPoint;
    private boolean doneCreating;
    private TextView feelsLike;
    private TextView humidity;
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;
    private TextView observationStation;
    private long observationTime;
    private TextView observationTimeView;
    private TextView pressure;
    private String previousObservationStation;
    private float progress;
    private long recordCreationTime;
    private TextView recordCreationTimeView;
    private TextView sunrise;
    private TextView sunset;
    private TextView uv;
    private com.weather.Weather.video.VideoPreviewFactory.VideoPreviewComponent videoPreview;
    private TextView visibility;
    private boolean wasVisible;
    private TextView wind;

    public RightNowModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, clickablelocalyticsmodulehandler);
        progress = 1.0F;
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
    }

    private void updateUpdatedTimes()
    {
        android.content.res.Resources resources = context.getResources();
        if (observationTime == -1L)
        {
            observationTimeView.setText("");
        } else
        {
            observationTimeView.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, observationTime, System.currentTimeMillis()));
        }
        if (recordCreationTime == -1L)
        {
            recordCreationTimeView.setText("");
        } else
        {
            recordCreationTimeView.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, recordCreationTime, System.currentTimeMillis()));
        }
        if (visible && delayedUpdater == null)
        {
            delayedUpdater = new _cls1();
            if (!handler.postDelayed(delayedUpdater, 3000L))
            {
                delayedUpdater = null;
            }
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030088, viewgroup, false);
        feelsLike = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0220));
        sunrise = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0222));
        sunset = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0224));
        humidity = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0225));
        dewPoint = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0226));
        visibility = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0227));
        pressure = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0228));
        uv = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d0229));
        wind = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d022a));
        recordCreationTimeView = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d021d));
        observationTimeView = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d021e));
        observationStation = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d021f));
        colorArc = (ColorArc)Preconditions.checkNotNull((ColorArc)viewgroup.findViewById(0x7f0d0221));
        videoPreview = VideoPreviewFactory.getVideoPreviewComponent(context, localyticsModuleHandler, viewgroup, handler, getFeedId(), "current-conditions");
        doneCreating = true;
        return viewgroup;
    }

    public void destroy()
    {
        if (delayedUpdater != null)
        {
            handler.removeCallbacks(delayedUpdater);
        }
        super.destroy();
    }

    public void onNoLongerVisible()
    {
        if (doneCreating)
        {
            super.onNoLongerVisible();
            wasVisible = false;
            if (colorArc != null)
            {
                colorArc.setProgress(0.0F);
                return;
            }
        }
    }

    public void onReceiveData(CurrentWeatherFacade currentweatherfacade)
    {
        setModuleData(currentweatherfacade);
    }

    public void onSettle()
    {
        if (doneCreating)
        {
            super.onSettle();
            updateUpdatedTimes();
            if (!wasVisible)
            {
                wasVisible = true;
                colorArc.animateProgress(progress);
                return;
            }
        }
    }

    public void resume()
    {
        super.resume();
        if (videoPreview != null)
        {
            videoPreview.requestVideo(false);
        }
    }

    public void runRefresh()
    {
        super.runRefresh();
        if (videoPreview != null)
        {
            videoPreview.requestVideo(false);
        }
    }

    protected void updateUi(CurrentWeatherFacade currentweatherfacade)
    {
        if (currentweatherfacade == null)
        {
            return;
        }
        LogUtil.d(TAG, LoggingMetaTags.TWC_VIDEOS, "updateUi: currentData=%s", new Object[] {
            currentweatherfacade
        });
        String s = "";
        if (videoPreview != null)
        {
            videoPreview.requestVideo(false);
        }
        if (currentweatherfacade.isEmpty())
        {
            sunrise.setText("");
            sunset.setText("");
            feelsLike.setText("");
            humidity.setText("");
            dewPoint.setText("");
            visibility.setText("");
            pressure.setText("");
            uv.setText("");
            wind.setText("");
            recordCreationTime = -1L;
            observationTime = -1L;
            progress = 0.0F;
            currentweatherfacade = s;
        } else
        {
            String s1;
            if (DateFormat.is24HourFormat(context))
            {
                sunrise.setText((new StringBuilder()).append("     ").append(currentweatherfacade.getSunrise()).toString());
                sunset.setText((new StringBuilder()).append(currentweatherfacade.getSunset()).append("    ").toString());
            } else
            {
                sunrise.setText(currentweatherfacade.getSunrise());
                sunset.setText(currentweatherfacade.getSunset());
            }
            feelsLike.setText(currentweatherfacade.getFeelsLikeTemp().formatShort());
            humidity.setText(currentweatherfacade.getHumidity().format());
            dewPoint.setText(currentweatherfacade.getDewPoint().formatShort());
            visibility.setText(currentweatherfacade.getVisibility().formatDecimal());
            if (currentweatherfacade.getPressure().unitType == UnitType.ENGLISH)
            {
                s1 = currentweatherfacade.getPressure().format();
            } else
            {
                s1 = currentweatherfacade.getPressure().formatWhole();
            }
            pressure.setText(s1);
            uv.setText(currentweatherfacade.getUvIndex().format());
            wind.setText(currentweatherfacade.getWind().format());
            recordCreationTime = currentweatherfacade.getRecordCreationTime();
            observationTime = currentweatherfacade.getObservationTime();
            s1 = currentweatherfacade.getObservationStation();
            progress = FacadeUtils.howMuchDayGone(currentweatherfacade.getSunriseMs(), currentweatherfacade.getSunsetMs(), System.currentTimeMillis());
            currentweatherfacade = s1;
        }
        updateUpdatedTimes();
        observationStation.setText(currentweatherfacade);
        if (visible)
        {
            wasVisible = true;
            if (TextUtils.equals(previousObservationStation, currentweatherfacade))
            {
                colorArc.setProgress(progress);
            } else
            {
                colorArc.animateProgress(progress);
            }
        } else
        {
            colorArc.setProgress(0.0F);
        }
        previousObservationStation = currentweatherfacade;
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((CurrentWeatherFacade)obj);
    }


/*
    static Runnable access$002(RightNowModule rightnowmodule, Runnable runnable)
    {
        rightnowmodule.delayedUpdater = runnable;
        return runnable;
    }

*/


    /* member class not found */
    class _cls1 {}

}
