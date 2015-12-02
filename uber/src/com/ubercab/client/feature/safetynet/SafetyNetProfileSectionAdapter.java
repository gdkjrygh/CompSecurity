// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import butterknife.ButterKnife;
import cev;
import com.ubercab.ui.TextView;
import fff;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafetyNetProfileSectionAdapter extends BaseAdapter
{

    private final cev a;
    private final List b;
    private final LayoutInflater c;

    public SafetyNetProfileSectionAdapter(Context context, cev cev1, String s)
    {
        c = LayoutInflater.from(context);
        b = new ArrayList(Arrays.asList(new String[] {
            s
        }));
        a = cev1;
    }

    private String a(int i)
    {
        return (String)b.get(i);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            view = (TextView)view;
        } else
        {
            view = (TextView)c.inflate(0x7f030140, viewgroup, false);
            ButterKnife.inject(this, view);
        }
        view.setText((CharSequence)b.get(i));
        return view;
    }

    public void onClickSafetyNet()
    {
        a.c(new fff());
    }
}
