// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.g:
//            j, y

public class h
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener
{

    private Activity a;
    private ViewGroup b;
    private ListView c;
    private j d;
    private ArrayList e;
    private y f;
    private final Handler g;
    private a h;

    public h(ViewGroup viewgroup, Activity activity, a a1, Handler handler)
    {
        a = activity;
        h = a1;
        g = handler;
        b = (ViewGroup)h.i().a(0x7f0300f3, viewgroup, false);
        c = (ListView)b.findViewById(0x7f0904e0);
        d = new j(this, null);
        c.setAdapter(d);
        c.setOnItemClickListener(this);
        c.setOnScrollListener(this);
        e = new ArrayList();
        c();
        if (com.gau.go.launcherex.gowidget.weather.util.f.a(a.getApplicationContext()).g() == null)
        {
            f = new y(a1, b, handler);
            b.addView(f.b(), 0);
        }
    }

    private CityBean a(String s)
    {
        s = s.split("#");
        if (s.length != 6)
        {
            return null;
        } else
        {
            String s1 = s[0];
            String s2 = s[1];
            String s3 = s[2];
            Object obj = s[3];
            return new CityBean(s[4], s1, s2, s3, s[5], (new StringBuilder()).append(s1).append(", ").append(s2).append(", (").append(s3).append(")").toString());
        }
    }

    static ArrayList a(h h1)
    {
        return h1.e;
    }

    private void a(CityBean citybean)
    {
        Message message = Message.obtain();
        message.what = 2;
        message.obj = citybean;
        g.sendMessage(message);
    }

    static a b(h h1)
    {
        return h1.h;
    }

    private void c()
    {
        if (e.size() == 0)
        {
            String as[] = a.getResources().getStringArray(0x7f0d001a);
            for (int i = 0; i < as.length; i++)
            {
                CityBean citybean = a(as[i]);
                if (citybean != null)
                {
                    e.add(citybean);
                }
            }

        }
    }

    private void d()
    {
        g.sendEmptyMessage(3);
    }

    public void a()
    {
        if (f != null)
        {
            f.c();
        }
    }

    public void a(int i)
    {
        b.setVisibility(i);
    }

    public View b()
    {
        return b;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (e != null && i >= 0 && i < e.size())
        {
            a((CityBean)e.get(i));
        }
    }

    public void onScroll(AbsListView abslistview, int i, int k, int l)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1)
        {
            d();
        }
    }
}
