// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import java.util.List;

// Referenced classes of package com.go.weatherex.g:
//            l, n, m

class p extends BaseAdapter
{

    final l a;

    private p(l l1)
    {
        a = l1;
        super();
    }

    p(l l1, m m)
    {
        this(l1);
    }

    public int getCount()
    {
        return l.a(a).size();
    }

    public Object getItem(int i)
    {
        return l.a(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view = new n(a);
            view1 = view.b();
            viewgroup = view;
        } else
        {
            viewgroup = (n)view.getTag();
            view1 = view;
        }
        viewgroup.a((CityBean)getItem(i));
        return view1;
    }
}
