// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            c, h, j, d

class i extends BaseAdapter
{

    final c a;

    private i(c c1)
    {
        a = c1;
        super();
    }

    i(c c1, d d)
    {
        this(c1);
    }

    public int getCount()
    {
        return c.a(a).size();
    }

    public Object getItem(int k)
    {
        if (getCount() == 0)
        {
            return null;
        } else
        {
            return (h)c.a(a).get(k);
        }
    }

    public long getItemId(int k)
    {
        return (long)k;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new j(this);
            view = j.a(viewgroup);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (j)view.getTag();
        }
        viewgroup.a(k);
        return view;
    }
}
