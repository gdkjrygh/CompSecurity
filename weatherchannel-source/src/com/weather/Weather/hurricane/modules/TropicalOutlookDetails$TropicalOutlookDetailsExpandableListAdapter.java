// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.common.collect.ImmutableList;
import com.weather.commons.facade.WeatherAlert;
import com.weather.util.date.DateUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

private static class inflater extends BaseExpandableListAdapter
{

    private final List basinAlertPairList;
    private final LayoutInflater inflater;

    public Object getChild(int i, int j)
    {
        return inflater.getContext().getString(((inflater)((Pair)basinAlertPairList.get(i)).first).basinAlertPairList.intValue());
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = inflater.inflate(0x7f0300af, viewgroup, false);
            viewgroup = new inflater(view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (inflater)view.getTag();
        }
        viewgroup.inflater((WeatherAlert)((Pair)basinAlertPairList.get(i)).second);
        return view;
    }

    public int getChildrenCount(int i)
    {
        if (((Pair)basinAlertPairList.get(i)).second != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i == 0 ? 0 : 1;
    }

    public Object getGroup(int i)
    {
        return ((Pair)basinAlertPairList.get(i)).second;
    }

    public int getGroupCount()
    {
        return basinAlertPairList.size();
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        View view1;
        basinAlertPairList basinalertpairlist;
        Object obj;
        Object obj1;
        if (view == null)
        {
            view1 = inflater.inflate(0x7f0300b1, viewgroup, false);
            basinalertpairlist = new inflater(view1);
            view1.setTag(basinalertpairlist);
        } else
        {
            basinalertpairlist = (inflater)view.getTag();
            view1 = view;
        }
        if (basinAlertPairList.isEmpty()) goto _L2; else goto _L1
_L1:
        view = (WeatherAlert)((Pair)basinAlertPairList.get(i)).second;
        if (view == null) goto _L4; else goto _L3
_L3:
        obj = view.getAlertIssueTime();
        obj1 = new SimpleDateFormat("yyyyMMddhhmm zzz", Locale.getDefault());
        view = viewgroup.getContext().getString(0x7f07030a);
        view = (new StringBuilder()).append(view).append(" ").toString();
        if (obj != null) goto _L6; else goto _L5
_L5:
        try
        {
            view = viewgroup.getContext().getString(0x7f0701eb);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view = viewgroup.getContext().getString(0x7f0701eb);
        }
_L8:
        basinalertpairlist.basinAlertPairList(inflater.getContext().getString(((inflater)((Pair)basinAlertPairList.get(i)).first).basinAlertPairList.intValue()), view);
        if (basinAlertPairList.size() == 1 && !flag)
        {
            ((ExpandableListView)viewgroup).expandGroup(i);
        }
_L2:
        return view1;
_L6:
        obj = ((SimpleDateFormat) (obj1)).parse((new StringBuilder()).append(obj).append(" GMT").toString());
        obj1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTime();
        obj1 = (new SimpleDateFormat("Z", Locale.getDefault())).format(((Date) (obj1)));
        view = (new StringBuilder()).append(view).append(DateUtil.getUserFormattedTime(((Date) (obj)).getTime(), ((String) (obj1)), viewgroup.getContext())).toString();
        view = (new StringBuilder()).append(view).append(' ').append(TimeZone.getDefault().getDisplayName(true, 0, Locale.getDefault())).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        view = viewgroup.getContext().getString(0x7f0701eb);
        if (true) goto _L8; else goto _L7
_L7:
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

    (Collection collection, Context context)
    {
        basinAlertPairList = ImmutableList.copyOf(collection);
        inflater = LayoutInflater.from(context);
    }
}
