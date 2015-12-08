// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.tenday;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.weather.Weather.feed.Module;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.DailyWeather;
import com.weather.commons.facade.DailyWeatherFacade;
import com.weather.commons.ui.fonts.TextViewWithFont;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.weather.Weather.tenday:
//            FlagshipUIUtil, ForecastLocalyticsModuleHandler, TenDayForecastUnavailableEvent

public final class TenDayModule extends Module
{

    private final String beaconDaySelected;
    private final String beaconSwipedDetails;
    private LinearLayout content;
    private int curPosition;
    private View currView;
    private TextSwitcher dayOfWeekFullSwitcher;
    private RelativeLayout invalidData;
    private final Animation leftIn;
    private final Animation leftOut;
    private final ForecastLocalyticsModuleHandler localyticsModuleHandler;
    private TextViewWithFont morePhraseTextView;
    private TextSwitcher narrativeSwitcher;
    private int positionOfCurrentClickedViewPagerItem;
    private final Animation rightIn;
    private final Animation rightOut;
    private boolean scrollToFriday;
    private boolean showingWeekendMore;
    private TenDayAdapter tenDayAdapter;
    private ViewPager viewPager;
    private final Set weekendDisplayDayNames;

    public TenDayModule(Context context, ModuleConfig moduleconfig, Handler handler, ForecastLocalyticsModuleHandler forecastlocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, forecastlocalyticsmodulehandler);
        showingWeekendMore = true;
        localyticsModuleHandler = forecastlocalyticsmodulehandler;
        leftIn = FlagshipUIUtil.getLeftInAnimation(context);
        rightOut = FlagshipUIUtil.getRightOutAnimation(context);
        rightIn = FlagshipUIUtil.getRightInAnimation(context);
        leftOut = FlagshipUIUtil.getLeftOutAnimation(context);
        beaconDaySelected = context.getString(0x7f070494);
        beaconSwipedDetails = context.getString(0x7f070495);
        context = DateFormatSymbols.getInstance().getWeekdays();
        weekendDisplayDayNames = ImmutableSet.of(context[3], context[4], context[5]);
    }

    private void animateNarrativeForPosition(int i)
    {
    /* block-local class not found */
    class TenDayAdapter {}

        DailyWeather dailyweather = (DailyWeather)TenDayAdapter.access._mth1600(tenDayAdapter).get(i);
        dayOfWeekFullSwitcher.setText(dailyweather.formatMonthFullDayDate());
        String s = dailyweather.getDayPhrase();
        TextSwitcher textswitcher = narrativeSwitcher;
        if (s == null)
        {
            s = dailyweather.getNightPhrase();
        }
        textswitcher.setText(s);
    }

    private void clearNarrativeText()
    {
        if (dayOfWeekFullSwitcher != null)
        {
            dayOfWeekFullSwitcher.setText("");
        }
        if (narrativeSwitcher != null)
        {
            narrativeSwitcher.setText("");
        }
    }

    private void highlight(View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(context.getResources().getDrawable(0x7f020440));
            return;
        } else
        {
            view.setBackgroundDrawable(context.getResources().getDrawable(0x7f020440));
            return;
        }
    }

    private void selectItem(int i, View view)
    {
        if (i < positionOfCurrentClickedViewPagerItem)
        {
            narrativeSwitcher.setInAnimation(leftIn);
            narrativeSwitcher.setOutAnimation(rightOut);
            dayOfWeekFullSwitcher.setInAnimation(leftIn);
            dayOfWeekFullSwitcher.setOutAnimation(rightOut);
        } else
        {
            narrativeSwitcher.setInAnimation(rightIn);
            narrativeSwitcher.setOutAnimation(leftOut);
            dayOfWeekFullSwitcher.setInAnimation(rightIn);
            dayOfWeekFullSwitcher.setOutAnimation(leftOut);
        }
        onTendayItemClicked(i, view);
    }

    private void setMoreTextViewText()
    {
        DailyWeather dailyweather = (DailyWeather)TenDayAdapter.access._mth1600(tenDayAdapter).get(0);
        morePhraseTextView.setLayerType(1, null);
        showingWeekendMore = weekendDisplayDayNames.contains(dailyweather.formatDayLong());
        if (showingWeekendMore)
        {
            Drawable drawable = context.getResources().getDrawable(0x7f020443);
            int i = context.getResources().getInteger(0x7f090004);
            drawable.setBounds(0, 0, i, i);
            morePhraseTextView.setText(context.getResources().getString(0x7f0703e6));
            morePhraseTextView.setTextColor(context.getResources().getColor(0x106000b));
            morePhraseTextView.setCompoundDrawables(drawable, null, null, null);
            scrollToFriday = true;
            return;
        } else
        {
            morePhraseTextView.setText(context.getResources().getString(0x7f0702f6));
            morePhraseTextView.setTextColor(context.getResources().getColor(0x7f0b0065));
            morePhraseTextView.setCompoundDrawables(null, null, null, null);
            scrollToFriday = false;
            return;
        }
    }

    private void setNarrativeForPosition(int i)
    {
        DailyWeather dailyweather = (DailyWeather)TenDayAdapter.access._mth1600(tenDayAdapter).get(i);
        dayOfWeekFullSwitcher.setCurrentText(dailyweather.formatMonthFullDayDate());
        String s = dailyweather.getDayPhrase();
        TextSwitcher textswitcher = narrativeSwitcher;
        if (s == null)
        {
            s = dailyweather.getNightPhrase();
        }
        textswitcher.setCurrentText(s);
    }

    private void setTextSwitcherFactories(Context context)
    {
        narrativeSwitcher.setFactory(new _cls3(context));
        dayOfWeekFullSwitcher.setFactory(new _cls4(context));
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f0300a7, viewgroup, false);
        viewPager = (ViewPager)viewgroup.findViewById(0x7f0d02ae);
        tenDayAdapter = new TenDayAdapter(null);
        viewPager.setAdapter(tenDayAdapter);
        content = (LinearLayout)viewgroup.findViewById(0x7f0d02ad);
        invalidData = (RelativeLayout)viewgroup.findViewById(0x7f0d02b4);
        narrativeSwitcher = (TextSwitcher)Preconditions.checkNotNull((TextSwitcher)viewgroup.findViewById(0x7f0d02b1));
        dayOfWeekFullSwitcher = (TextSwitcher)Preconditions.checkNotNull((TextSwitcher)viewgroup.findViewById(0x7f0d02b0));
        morePhraseTextView = (TextViewWithFont)Preconditions.checkNotNull((TextViewWithFont)viewgroup.findViewById(0x7f0d02b2));
        ((LinearLayout)viewgroup.findViewById(0x7f0d02af)).setOnTouchListener(new _cls1(context));
        setTextSwitcherFactories(context);
        viewgroup.findViewById(0x7f0d02b3).setOnClickListener(new _cls2());
        return viewgroup;
    }

    public void onReceiveData(DailyWeatherFacade dailyweatherfacade)
    {
        setModuleData(dailyweatherfacade);
    }

    public void onTenDayForecastUnavailable(TenDayForecastUnavailableEvent tendayforecastunavailableevent)
    {
        ((Activity)context).runOnUiThread(new _cls5());
    }

    public void onTendayItemClicked(int i, View view)
    {
        if (view != null)
        {
            highlight(view);
            if (currView != null && view != currView)
            {
                currView.setBackgroundColor(0);
            }
            currView = view;
            positionOfCurrentClickedViewPagerItem = i;
        }
        if (curPosition != i)
        {
            curPosition = i;
            animateNarrativeForPosition(i);
            return;
        } else
        {
            setNarrativeForPosition(i);
            return;
        }
    }

    protected void updateUi(DailyWeatherFacade dailyweatherfacade)
    {
        if (dailyweatherfacade == null || tenDayAdapter == null)
        {
            content.setVisibility(8);
            invalidData.setVisibility(0);
            return;
        } else
        {
            invalidData.setVisibility(8);
            content.setVisibility(0);
            tenDayAdapter.setData(dailyweatherfacade);
            setMoreTextViewText();
            setNarrativeForPosition(positionOfCurrentClickedViewPagerItem);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((DailyWeatherFacade)obj);
    }











/*
    static View access$1802(TenDayModule tendaymodule, View view)
    {
        tendaymodule.currView = view;
        return view;
    }

*/













    // Unreferenced inner class com/weather/Weather/tenday/TenDayModule$ViewHolder
    /* block-local class not found */
    class ViewHolder {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls5 {}

}
