// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globalview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globalview:
//            t, a, v, u

class x extends BaseAdapter
{

    final t a;

    private x(t t1)
    {
        a = t1;
        super();
    }

    x(t t1, u u)
    {
        this(t1);
    }

    public int getCount()
    {
        return t.a(a).size();
    }

    public Object getItem(int i)
    {
        if (getCount() == 0)
        {
            return null;
        } else
        {
            return (a)t.a(a).get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new v(a);
            view = v.a(viewgroup);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (v)view.getTag();
        }
        viewgroup.a(i);
        return view;
    }
}
