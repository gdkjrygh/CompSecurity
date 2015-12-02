// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet.contactpicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import butterknife.ButterKnife;
import cev;
import ffc;

public class ContactPickerNoPermissionAdapter extends BaseAdapter
{

    private final cev a;
    private LayoutInflater b;

    public ContactPickerNoPermissionAdapter(Context context, cev cev1)
    {
        a = cev1;
        b = LayoutInflater.from(context);
    }

    public int getCount()
    {
        return 1;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f030093, viewgroup, false);
            ButterKnife.inject(this, view1);
        }
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return false;
    }

    public void onSettingsClick()
    {
        a.c(new ffc());
    }
}
