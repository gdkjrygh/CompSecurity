// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.go.weatherex.ad.c.e;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.themestore:
//            q, ac, m, aj

public class p extends a
    implements android.widget.AdapterView.OnItemClickListener
{

    private int a;
    private ListView b;
    private com.go.weatherex.ad.nativead.a c;
    private m d;
    private View e;
    private final aj f = new com.go.weatherex.themestore.q(this);

    public p()
    {
    }

    public static p a(Activity activity, int i)
    {
        p p1 = new p();
        p1.b(activity);
        activity = new Bundle();
        activity.putInt("theme_type", i);
        p1.setArguments(activity);
        return p1;
    }

    private void a(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("mode undefined:").append(i).toString());

        case 2: // '\002'
            b.setVisibility(0);
            e.setVisibility(8);
            return;

        case 1: // '\001'
            b.setVisibility(8);
            e.setVisibility(0);
            return;
        }
    }

    static void a(p p1)
    {
        p1.b();
    }

    static void a(p p1, int i)
    {
        p1.a(i);
    }

    static int b(p p1)
    {
        return p1.a;
    }

    private void b()
    {
        if (isDetached())
        {
            return;
        }
        java.util.List list = ac.b(a);
        if (d != null)
        {
            d.c();
        }
        d = new m(getActivity(), list, b);
        d.a(getResources().getInteger(0x7f0b0008));
        b.setAdapter(d);
    }

    private void b(Bundle bundle)
    {
        a = bundle.getInt("theme_type", 1);
    }

    static m c(p p1)
    {
        return p1.d;
    }

    private void c()
    {
        if (d != null)
        {
            java.util.List list = ac.b(a);
            d.a(list);
        }
    }

    static void d(p p1)
    {
        p1.c();
    }

    protected void f()
    {
        super.f();
        if (!isDetached());
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030095, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            d.c();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ac.b(f);
        c.a();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (com.jiubang.playsdk.a.a)d.getItem(i);
        if (adapterview != null)
        {
            ac.h().h(getActivity(), adapterview);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = (ListView)c(0x7f0903a1);
        e = c(0x7f0903a0);
        b.setOnItemClickListener(this);
        c = new com.go.weatherex.ad.nativead.a(getActivity());
        b.addFooterView(c);
        if (!com.go.weatherex.ad.c.e.a(getActivity()))
        {
            c.a(getString(0x7f08003e));
        }
        com.go.weatherex.themestore.ac.a(f);
    }
}
