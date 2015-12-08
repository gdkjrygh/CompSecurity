// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AppListActivity, m

class l extends BaseAdapter
{

    final AppListActivity a;
    private LayoutInflater b;
    private List c;

    public l(AppListActivity applistactivity, List list)
    {
        a = applistactivity;
        super();
        b = (LayoutInflater)applistactivity.getSystemService("layout_inflater");
        c = list;
    }

    static LayoutInflater a(l l1)
    {
        return l1.b;
    }

    static List b(l l1)
    {
        return l1.c;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return c.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new m(this);
            view = ((m) (viewgroup)).a;
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (m)view.getTag();
        }
        viewgroup.a(i);
        return view;
    }
}
