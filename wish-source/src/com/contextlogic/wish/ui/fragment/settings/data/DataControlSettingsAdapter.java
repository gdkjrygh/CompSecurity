// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.AppEventsLogger;
import java.util.ArrayList;

public class DataControlSettingsAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        CheckBox rowCheckbox;
        TextView rowText;

        ItemRowHolder()
        {
        }
    }


    public DataControlSettingsAdapter(Context context, ArrayList arraylist)
    {
        super(context, 0x7f03004b, arraylist);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        CheckBox checkbox;
        boolean flag;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03004b, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d01b1);
            viewgroup.rowCheckbox = (CheckBox)view.findViewById(0x7f0d01b2);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        ((ItemRowHolder) (viewgroup)).rowText.setText((CharSequence)getItem(i));
        ((ItemRowHolder) (viewgroup)).rowCheckbox.setOnCheckedChangeListener(null);
        checkbox = ((ItemRowHolder) (viewgroup)).rowCheckbox;
        if (!AppEventsLogger.getLimitEventUsage(getContext()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        ((ItemRowHolder) (viewgroup)).rowCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final DataControlSettingsAdapter this$0;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                compoundbutton = getContext();
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                AppEventsLogger.setLimitEventUsage(compoundbutton, flag1);
            }

            
            {
                this$0 = DataControlSettingsAdapter.this;
                super();
            }
        });
        return view;
    }
}
