// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.weather.dal2.locations.SavedLocation;
import java.util.List;

public class WidgetLocationAdapter extends BaseAdapter
{

    private final Context context;
    private final String followMe;
    private final List locations = Lists.newArrayList();
    private int selectedPosition;

    public WidgetLocationAdapter(Context context1, List list)
    {
        locations.addAll(list);
        context = context1;
        followMe = context1.getString(0x7f070124);
    }

    public void addLocation(SavedLocation savedlocation)
    {
        if (!locations.contains(savedlocation))
        {
            locations.add(0, savedlocation);
            selectedPosition = 1;
        }
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return locations.size() + 1;
    }

    public Object getItem(int i)
    {
        if (i == 0)
        {
            return followMe;
        } else
        {
            return locations.get(i - 1);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public SavedLocation getSelectedLocation()
    {
        if (!locations.isEmpty() && selectedPosition > 0)
        {
            return (SavedLocation)locations.get(selectedPosition - 1);
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
    /* block-local class not found */
    class WidgetUiHolder {}

        RadioButton radiobutton;
        boolean flag;
        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(0x7f0300d2, viewgroup, false);
            viewgroup = new WidgetUiHolder();
            viewgroup.locationName = (TextView)Preconditions.checkNotNull(view.findViewById(0x7f0d035a));
            viewgroup.radioButton = (RadioButton)Preconditions.checkNotNull(view.findViewById(0x7f0d0359));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (WidgetUiHolder)view.getTag();
        }
        if (i == 0)
        {
            ((WidgetUiHolder) (viewgroup)).locationName.setText(followMe);
        } else
        {
            ((WidgetUiHolder) (viewgroup)).locationName.setText(((SavedLocation)locations.get(i - 1)).getNickname());
        }
        ((WidgetUiHolder) (viewgroup)).locationName.setOnClickListener(new _cls1(i));
        radiobutton = ((WidgetUiHolder) (viewgroup)).radioButton;
        if (i == selectedPosition)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        radiobutton.setChecked(flag);
        ((WidgetUiHolder) (viewgroup)).radioButton.setOnClickListener(new _cls2(i));
        return view;
    }


/*
    static int access$002(WidgetLocationAdapter widgetlocationadapter, int i)
    {
        widgetlocationadapter.selectedPosition = i;
        return i;
    }

*/

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
