// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.aj;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.themeconfig:
//            k, g

public class j extends a
    implements android.widget.AdapterView.OnItemClickListener
{

    private boolean a;
    private int b;
    private int c;
    private ListView d;
    private g e;
    private View f;
    private b g;
    private final aj h = new k(this);

    public j()
    {
        a = false;
        b = 1;
        c = 0;
    }

    public static j a(Activity activity, int i, int l, boolean flag)
    {
        j j1 = new j();
        j1.b(activity);
        activity = new Bundle();
        activity.putBoolean("is_config_gowidget", flag);
        activity.putInt("widget_type", l);
        activity.putInt("widget_id", i);
        j1.setArguments(activity);
        return j1;
    }

    private void a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("mode undefined:").append(i).toString());

        case 2: // '\002'
            d.setVisibility(0);
            f.setVisibility(8);
            return;

        case 1: // '\001'
            d.setVisibility(8);
            f.setVisibility(0);
            return;
        }
    }

    static void a(j j1)
    {
        j1.b();
    }

    static void a(j j1, int i)
    {
        j1.a(i);
    }

    private void a(List list)
    {
        if (g != null && list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)list.next();
                if (g.x().equals(a1.a()))
                {
                    a1.j(true);
                } else
                {
                    a1.j(false);
                }
            }
        }
    }

    private void b()
    {
        if (!isAdded())
        {
            return;
        }
        String s;
        List list;
        if (a)
        {
            s = com.gau.go.launcherex.gowidget.weather.globaltheme.d.c(getActivity(), c);
        } else
        {
            s = com.gau.go.launcherex.gowidget.weather.globaltheme.d.b(getActivity(), c);
        }
        list = ac.c(b);
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)iterator.next();
            if (s.equals(a1.a()))
            {
                a1.j(true);
                g = ac.a(a1);
            } else
            {
                a1.j(false);
            }
        }

        if (e != null)
        {
            e.h_();
        }
        e = new g(getActivity(), list, d);
        d.setAdapter(e);
        a(2, g);
    }

    private void b(Bundle bundle)
    {
        a = bundle.getBoolean("is_config_gowidget", true);
        b = bundle.getInt("widget_type", 1);
        c = bundle.getInt("widget_id", 0);
    }

    static void b(j j1)
    {
        j1.c();
    }

    private void c()
    {
        if (e != null)
        {
            List list = ac.c(b);
            a(list);
            e.a(list);
        }
    }

    protected void b(int i, Object obj)
    {
        i;
        JVM INSTR tableswitch 2 2: default 20
    //                   2 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (g != (obj = (b)obj))
        {
            g = ((b) (obj));
            a(e.d());
            e.notifyDataSetChanged();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void f()
    {
        super.f();
        if (isAdded());
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        b(getArguments());
        if (ac.i())
        {
            a(2);
            b();
            return;
        } else
        {
            a(1);
            ac.j();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            2
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030095, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (e != null)
        {
            e.h_();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ac.b(h);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (com.jiubang.playsdk.a.a)e.getItem(i);
        if (adapterview != null)
        {
            if (ac.h().e(getActivity(), adapterview))
            {
                com.go.weatherex.i.a.a(getActivity(), adapterview.a());
            } else
            {
                adapterview = ac.a(adapterview);
                if (adapterview != null)
                {
                    a(1, adapterview);
                    return;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f = c(0x7f0903a0);
        d = (ListView)c(0x7f0903a1);
        d.setOnItemClickListener(this);
        ac.a(h);
    }
}
