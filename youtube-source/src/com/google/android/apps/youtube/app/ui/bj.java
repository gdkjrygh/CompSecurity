// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

final class bj extends BaseAdapter
{

    private final LayoutInflater a;
    private final List b;

    public bj(LayoutInflater layoutinflater, List list)
    {
        a = layoutinflater;
        b = list;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = a.inflate(0x1090009, viewgroup, false);
        }
        view = (TextView)view;
        view.setText((CharSequence)((Pair)b.get(i)).second);
        return view;
    }

    public final Object getItem(int i)
    {
        return ((Pair)b.get(i)).second;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = a.inflate(0x1090008, viewgroup, false);
        }
        view = (TextView)view;
        view.setText((CharSequence)((Pair)b.get(i)).second);
        return view;
    }
}
