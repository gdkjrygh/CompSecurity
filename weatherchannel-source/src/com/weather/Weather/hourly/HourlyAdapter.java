// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hourly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.commons.facade.HourlyWeather;
import com.weather.commons.facade.PrecipitationRoundedValue;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.Wind;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class HourlyAdapter extends BaseAdapter
{

    private final Context context;
    private final List hourlyWeatherList = new ArrayList();
    private LayoutInflater inflater;
    private final int rowLayoutId;
    private final boolean showDateHeader;

    public HourlyAdapter(Context context1, int i)
    {
        rowLayoutId = i;
        boolean flag;
        if (i == 0x7f03005c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        showDateHeader = flag;
        context = context1;
    }

    private View populateRow(ViewGroup viewgroup)
    {
        if (inflater == null)
        {
            inflater = LayoutInflater.from(context);
        }
        viewgroup = (View)Preconditions.checkNotNull(inflater.inflate(rowLayoutId, viewgroup, false));
    /* block-local class not found */
    class HourlyUiHolder {}

        HourlyUiHolder hourlyuiholder = new HourlyUiHolder();
        hourlyuiholder.dateView = (TextView)viewgroup.findViewById(0x7f0d0168);
        hourlyuiholder.timeView = (TextView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0172));
        hourlyuiholder.temperatureView = (TextView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0176));
        hourlyuiholder.windView = (TextView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0175));
        hourlyuiholder.precipitationView = (TextView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0174));
        hourlyuiholder.iconView = (ImageView)Preconditions.checkNotNull(viewgroup.findViewById(0x7f0d0173));
        hourlyuiholder.vgHeader = (ViewGroup)viewgroup.findViewById(0x7f0d0167);
        viewgroup.setTag(hourlyuiholder);
        return viewgroup;
    }

    private static void setVisibility(View view, int i)
    {
        if (view != null)
        {
            view.setVisibility(i);
        }
    }

    public int getCount()
    {
        return hourlyWeatherList.size();
    }

    public Object getItem(int i)
    {
        return hourlyWeatherList.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = populateRow(viewgroup);
        }
        viewgroup = (HourlyUiHolder)view.getTag();
        setVisibility(((HourlyUiHolder) (viewgroup)).vgHeader, 8);
        HourlyWeather hourlyweather = (HourlyWeather)hourlyWeatherList.get(i);
        if (showDateHeader && hourlyweather.isFirstHourOfDay())
        {
            setVisibility(((HourlyUiHolder) (viewgroup)).vgHeader, 0);
            ((HourlyUiHolder) (viewgroup)).dateView.setText(hourlyweather.formatDay());
        }
        ((HourlyUiHolder) (viewgroup)).timeView.setText(hourlyweather.formatHour());
        ((HourlyUiHolder) (viewgroup)).temperatureView.setText(hourlyweather.getTemperature().formatShort());
        ((HourlyUiHolder) (viewgroup)).windView.setText(hourlyweather.getWind().format());
        ((HourlyUiHolder) (viewgroup)).precipitationView.setText(hourlyweather.getPrecipitation().format());
        ((HourlyUiHolder) (viewgroup)).iconView.setImageBitmap(WxIconBitmapCache.getBitmap((new WxIconItem(hourlyweather.getSky())).getSvgIconId()));
        return view;
    }

    public void setHourlyWeatherList(Collection collection)
    {
        hourlyWeatherList.clear();
        hourlyWeatherList.addAll(collection);
        notifyDataSetChanged();
    }
}
