// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.aj;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.setting:
//            ac, y

public class ab extends a
    implements android.widget.AdapterView.OnItemClickListener
{

    private int a;
    private ListView b;
    private y c;
    private View d;
    private b e;
    private final aj f = new com.go.weatherex.setting.ac(this);

    public ab()
    {
    }

    public static ab a(Activity activity, int i)
    {
        ab ab1 = new ab();
        ab1.b(activity);
        activity = new Bundle();
        activity.putInt("theme_type", i);
        ab1.setArguments(activity);
        return ab1;
    }

    private void a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("mode undefined:").append(i).toString());

        case 2: // '\002'
            b.setVisibility(0);
            d.setVisibility(8);
            return;

        case 1: // '\001'
            b.setVisibility(8);
            d.setVisibility(0);
            return;
        }
    }

    static void a(ab ab1)
    {
        ab1.b();
    }

    static void a(ab ab1, int i)
    {
        ab1.a(i);
    }

    private void a(List list)
    {
        if (e != null && list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)list.next();
                if (e.x().equals(a1.a()))
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
        List list = ac.b(a);
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            com.jiubang.playsdk.a.a a1 = (com.jiubang.playsdk.a.a)iterator.next();
            if (ac.h().d(getActivity(), a1))
            {
                a1.j(true);
                e = ac.a(a1);
            } else
            {
                a1.j(false);
            }
        }

        if (c != null)
        {
            c.c_();
        }
        c = new y(getActivity(), list, b);
        b.setAdapter(c);
        a(2, e);
    }

    private void b(Bundle bundle)
    {
        a = bundle.getInt("theme_type", 1);
    }

    static void b(ab ab1)
    {
        ab1.c();
    }

    private void c()
    {
        if (c != null)
        {
            List list = ac.b(a);
            a(list);
            c.a(list);
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
        if (e != (obj = (b)obj) && c != null)
        {
            e = ((b) (obj));
            a(c.d());
            c.notifyDataSetChanged();
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
        if (c != null)
        {
            c.c_();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ac.b(f);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (com.jiubang.playsdk.a.a)c.getItem(i);
        if (adapterview != null)
        {
            adapterview = ac.a(adapterview);
            if (adapterview != null)
            {
                a(1, adapterview);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d = c(0x7f0903a0);
        b = (ListView)c(0x7f0903a1);
        b.setOnItemClickListener(this);
        ac.a(f);
    }
}
