// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class SpinnerAdapter extends BaseAdapter
{

    private static final int NONE = 0;
    private static final int OBJECT = 1;
    private int color;
    private LayoutInflater inflater;
    private final List objects;

    public SpinnerAdapter(Activity activity, List list)
    {
        objects = list;
        inflater = activity.getLayoutInflater();
        list = new TypedValue();
        activity.getTheme().resolveAttribute(0x1010036, list, true);
        color = activity.getResources().getColor(((TypedValue) (list)).resourceId);
    }

    public int getCount()
    {
        return objects.size() + 1;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        int j = getItemViewType(i);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = inflater.inflate(0x1090003, null);
        }
        viewgroup = (TextView)view;
        if (j == 1)
        {
            viewgroup.setTextColor(color);
            viewgroup.setText(getItem(i).toString());
            return view;
        } else
        {
            viewgroup.setTextColor(0xff888888);
            viewgroup.setText(com.uservoice.uservoicesdk.R.string.uv_select_none);
            return view;
        }
    }

    public Object getItem(int i)
    {
        if (i == 0)
        {
            return null;
        } else
        {
            return objects.get(i - 1);
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        int j = getItemViewType(i);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = inflater.inflate(0x1090003, null);
        }
        viewgroup = (TextView)view;
        if (j == 1)
        {
            viewgroup.setTextColor(color);
            viewgroup.setText(getItem(i).toString());
            return view;
        } else
        {
            viewgroup.setTextColor(color);
            viewgroup.setText(com.uservoice.uservoicesdk.R.string.uv_select_one);
            return view;
        }
    }
}
