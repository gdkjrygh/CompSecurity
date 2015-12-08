// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.google.common.base.Joiner;
import com.weather.commons.facade.WeatherAlert;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

public static class inflater extends BaseExpandableListAdapter
{

    private final LayoutInflater inflater;
    private final List weatherAlertList;

    public Object getChild(int i, int j)
    {
        return weatherAlertList.get(i);
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        WeatherAlert weatheralert;
        Map map;
        if (view == null)
        {
            view = inflater.inflate(0x7f030096, viewgroup, false);
            viewgroup = new (view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = ()view.getTag();
        }
        weatheralert = (WeatherAlert)getChild(i, j);
        map = weatheralert.getParameters();
        viewgroup.setData(Joiner.on("\n\n").skipNulls().join(WeatherAlert.formatAlert((Iterable)map.get("SYNOPSIS")), WeatherAlert.formatAlert(weatheralert.getWarningText()), new Object[0]));
        return view;
    }

    public int getChildrenCount(int i)
    {
        return 1;
    }

    public Object getGroup(int i)
    {
        return weatherAlertList.get(i);
    }

    public int getGroupCount()
    {
        return weatherAlertList.size();
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x7f030097, viewgroup, false);
            viewgroup = new t(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (t)view.getTag();
        }
        viewgroup.setData(((WeatherAlert)getGroup(i)).getDescription());
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return true;
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (datasetobserver == null)
        {
            return;
        } else
        {
            super.unregisterDataSetObserver(datasetobserver);
            return;
        }
    }

    t(List list, Context context)
    {
        weatherAlertList = list;
        inflater = LayoutInflater.from(context);
    }
}
