// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishPushPreference;
import com.contextlogic.wish.api.service.SaveSettingService;
import java.util.ArrayList;

public class PushNotificationSettingsAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        CheckBox rowCheckbox;
        TextView rowText;

        ItemRowHolder()
        {
        }
    }


    public PushNotificationSettingsAdapter(Context context, ArrayList arraylist)
    {
        super(context, 0x7f030096, arraylist);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        final WishPushPreference preference;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030096, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d02db);
            viewgroup.rowCheckbox = (CheckBox)view.findViewById(0x7f0d02dc);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        preference = (WishPushPreference)getItem(i);
        ((ItemRowHolder) (viewgroup)).rowText.setText(preference.getName());
        ((ItemRowHolder) (viewgroup)).rowCheckbox.setOnCheckedChangeListener(null);
        ((ItemRowHolder) (viewgroup)).rowCheckbox.setChecked(preference.isPreferenceSelected());
        ((ItemRowHolder) (viewgroup)).rowCheckbox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final PushNotificationSettingsAdapter this$0;
            final WishPushPreference val$preference;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                preference.setPreferenceSelected(flag);
                (new SaveSettingService()).requestService(preference, null, null);
            }

            
            {
                this$0 = PushNotificationSettingsAdapter.this;
                preference = wishpushpreference;
                super();
            }
        });
        return view;
    }
}
