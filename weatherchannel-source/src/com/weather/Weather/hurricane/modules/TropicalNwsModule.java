// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.weather.Weather.feed.Module;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.hurricane.ClickableHurricaneCentralFeedLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertIcon;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.ui.WxIconBitmapCache;
import java.util.Comparator;

public class TropicalNwsModule extends Module
{

    private static final Comparator alertComparator = new _cls2();
    private TextView alertTitle;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private final ClickableHurricaneCentralFeedLocalyticsModuleHandler localyticsModuleHandler;
    private View moduleView;
    MultiActivitySummaryManager multiActivitySummaryManager;
    private View readMore;
    String stormId;

    public TropicalNwsModule(Context context, ModuleConfig moduleconfig, Handler handler, ClickableHurricaneCentralFeedLocalyticsModuleHandler clickablehurricanecentralfeedlocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, clickablehurricanecentralfeedlocalyticsmodulehandler);
        localyticsModuleHandler = (ClickableHurricaneCentralFeedLocalyticsModuleHandler)Preconditions.checkNotNull(clickablehurricanecentralfeedlocalyticsmodulehandler);
    }

    private void hide()
    {
        moduleView.setOnClickListener(null);
        if (isHideable)
        {
            moduleView.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            setActive(false);
            return;
        } else
        {
            setActive(true);
            moduleView.setLayoutParams(layoutParams);
            alertTitle.setText(0x7f07022b);
            readMore.setVisibility(8);
            return;
        }
    }

    private void show(WeatherAlert weatheralert)
    {
        setActive(true);
        moduleView.setLayoutParams(layoutParams);
        readMore.setVisibility(0);
        alertTitle.setText(weatheralert.getHeadline());
        moduleView.setOnClickListener(new _cls1(weatheralert));
    }

    protected View createView(ViewGroup viewgroup)
    {
        moduleView = LayoutInflater.from(context).inflate(0x7f030082, viewgroup, false);
        ((ImageView)moduleView.findViewById(0x7f0d0202)).setImageBitmap(WxIconBitmapCache.getBitmap(WeatherAlertIcon.TROPICAL.getIconId()));
        alertTitle = (TextView)moduleView.findViewById(0x7f0d0203);
        readMore = moduleView.findViewById(0x7f0d0204);
        layoutParams = moduleView.getLayoutParams();
        return moduleView;
    }

    public void onCurrentWeatherUpdate(CurrentWeatherFacade currentweatherfacade)
    {
        setModuleData(currentweatherfacade.getWeatherAlertsFacade());
    }

    protected void updateUi(WeatherAlertsFacade weatheralertsfacade)
    {
        if (weatheralertsfacade == null || stormId == null || !weatheralertsfacade.containsTropicalCyclone())
        {
            hide();
            return;
        } else
        {
            show((WeatherAlert)Ordering.from(alertComparator).max(weatheralertsfacade.getAlertsList()));
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((WeatherAlertsFacade)obj);
    }





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
