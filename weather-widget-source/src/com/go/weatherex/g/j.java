// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.g:
//            h, k, i

class j extends BaseAdapter
{

    final h a;

    private j(h h1)
    {
        a = h1;
        super();
    }

    j(h h1, i i)
    {
        this(h1);
    }

    public int getCount()
    {
        if (h.a(a) != null)
        {
            return h.a(a).size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        CityBean citybean;
        if (view == null)
        {
            viewgroup = new k(a, viewgroup);
            view = ((k) (viewgroup)).a;
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (k)view.getTag();
        }
        citybean = (CityBean)h.a(a).get(i);
        ((k) (viewgroup)).b.setText(citybean.f());
        return view;
    }
}
