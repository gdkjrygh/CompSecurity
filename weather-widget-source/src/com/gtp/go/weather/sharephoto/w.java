// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoReportActivity, v, u

class w extends BaseAdapter
{

    final PhotoReportActivity a;

    private w(PhotoReportActivity photoreportactivity)
    {
        a = photoreportactivity;
        super();
    }

    w(PhotoReportActivity photoreportactivity, u u)
    {
        this(photoreportactivity);
    }

    public int getCount()
    {
        return com.gtp.go.weather.sharephoto.PhotoReportActivity.a(a).size();
    }

    public Object getItem(int i)
    {
        if (getCount() == 0)
        {
            return null;
        } else
        {
            return (a)com.gtp.go.weather.sharephoto.PhotoReportActivity.a(a).get(i);
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
            view = com.gtp.go.weather.sharephoto.v.a(viewgroup);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (v)view.getTag();
        }
        viewgroup.a(i);
        return view;
    }
}
