// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            i, a, k, j

class l extends BaseAdapter
{

    final i a;

    private l(i j)
    {
        a = j;
        super();
    }

    l(i j, j j1)
    {
        this(j);
    }

    public int getCount()
    {
        return i.a(a).size();
    }

    public Object getItem(int j)
    {
        if (getCount() == 0)
        {
            return null;
        } else
        {
            return (a)i.a(a).get(j);
        }
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new k(a);
            view = k.a(viewgroup);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (k)view.getTag();
        }
        viewgroup.a(j);
        return view;
    }
}
