// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertSettingsListItem

public class WeatherAlertSettingListAdapter extends BaseAdapter
{
    public static final class OnOffIndicator extends Enum
    {

        private static final OnOffIndicator $VALUES[];
        public static final OnOffIndicator CHECK_BOX;
        public static final OnOffIndicator TEXT;

        public static OnOffIndicator valueOf(String s)
        {
            return (OnOffIndicator)Enum.valueOf(com/weather/Weather/settings/alerts/WeatherAlertSettingListAdapter$OnOffIndicator, s);
        }

        public static OnOffIndicator[] values()
        {
            return (OnOffIndicator[])$VALUES.clone();
        }

        static 
        {
            TEXT = new OnOffIndicator("TEXT", 0);
            CHECK_BOX = new OnOffIndicator("CHECK_BOX", 1);
            $VALUES = (new OnOffIndicator[] {
                TEXT, CHECK_BOX
            });
        }

        private OnOffIndicator(String s, int i)
        {
            super(s, i);
        }
    }


    List alertsList;
    Context context;
    LayoutInflater inflater;
    OnOffIndicator onOffIndicator;

    public WeatherAlertSettingListAdapter(Context context1, List list, OnOffIndicator onoffindicator)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        alertsList = (List)Preconditions.checkNotNull(list);
        onOffIndicator = (OnOffIndicator)Preconditions.checkNotNull(onoffindicator);
        inflater = LayoutInflater.from(context1);
    }

    private void enableOrDisableAll(boolean flag)
    {
        for (int i = 0; i < alertsList.size(); i++)
        {
            setEnabledState(i, flag);
        }

    }

    private void setEnabledState(int i, boolean flag)
    {
        WeatherAlertSettingsListItem weatheralertsettingslistitem = (WeatherAlertSettingsListItem)alertsList.get(i);
        if (flag && !weatheralertsettingslistitem.isEnabled() || !flag && weatheralertsettingslistitem.isEnabled())
        {
            weatheralertsettingslistitem = new WeatherAlertSettingsListItem(weatheralertsettingslistitem.getType(), weatheralertsettingslistitem.getTitle(), weatheralertsettingslistitem.getDescription(), flag);
            alertsList.set(i, weatheralertsettingslistitem);
            notifyDataSetChanged();
        }
    }

    public void disableAll()
    {
        enableOrDisableAll(false);
    }

    public void enableAll()
    {
        enableOrDisableAll(true);
    }

    public int getCount()
    {
        return alertsList.size();
    }

    public WeatherAlertSettingsListItem getItem(int i)
    {
        return (WeatherAlertSettingsListItem)alertsList.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WeatherAlertSettingsListItem weatheralertsettingslistitem = (WeatherAlertSettingsListItem)alertsList.get(i);
        if (weatheralertsettingslistitem.getType() == null)
        {
            view = inflater.inflate(0x7f030093, viewgroup, false);
            ((TextView)view.findViewById(0x7f0d0246)).setText(weatheralertsettingslistitem.getTitle());
        } else
        {
            viewgroup = inflater.inflate(0x7f030092, viewgroup, false);
            if (viewgroup.findViewById(0x7f0d0244) != null)
            {
                ((TextView)viewgroup.findViewById(0x7f0d0244)).setText(weatheralertsettingslistitem.getTitle());
            }
            if (viewgroup.findViewById(0x7f0d0245) != null)
            {
                ((TextView)viewgroup.findViewById(0x7f0d0245)).setText(weatheralertsettingslistitem.getDescription());
            }
            view = viewgroup;
            if (viewgroup.findViewById(0x7f0d0242) != null)
            {
                if (onOffIndicator == OnOffIndicator.TEXT)
                {
                    TextView textview = (TextView)viewgroup.findViewById(0x7f0d0242);
                    textview.setVisibility(0);
                    if (weatheralertsettingslistitem.isEnabled())
                    {
                        view = context.getString(0x7f070277);
                    } else
                    {
                        view = context.getString(0x7f070276);
                    }
                    textview.setText(view);
                    if (weatheralertsettingslistitem.isEnabled())
                    {
                        i = 0xff000000;
                    } else
                    {
                        i = 0xffcccccc;
                    }
                    textview.setTextColor(i);
                    return viewgroup;
                } else
                {
                    view = (CheckBox)viewgroup.findViewById(0x7f0d0243);
                    view.setVisibility(0);
                    view.setChecked(weatheralertsettingslistitem.isEnabled());
                    return viewgroup;
                }
            }
        }
        return view;
    }

    public void setItem(int i, WeatherAlertSettingsListItem weatheralertsettingslistitem)
    {
        alertsList.set(i, Preconditions.checkNotNull(weatheralertsettingslistitem));
        notifyDataSetChanged();
    }

    public void toggleEnabledState(int i)
    {
        boolean flag;
        if (!getItem(i).isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setEnabledState(i, flag);
    }
}
