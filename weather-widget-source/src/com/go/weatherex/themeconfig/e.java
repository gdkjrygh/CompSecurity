// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.c;

// Referenced classes of package com.go.weatherex.themeconfig:
//            n, j, f

public class e extends a
    implements android.support.v4.view.ViewPager.OnPageChangeListener, c
{

    private int a;
    private boolean b;
    private int c;
    private int d;
    private int e[] = {
        1, 2
    };
    private com.go.weatherex.themestore.a f;
    private ViewPager g;
    private f h;
    private n i;
    private j j;
    private TextView k;

    public e()
    {
        a = 1;
        b = false;
        c = 1;
        d = 0;
    }

    public static e a(Activity activity, int l, int i1, int j1, boolean flag)
    {
        e e1 = new e();
        e1.b(activity);
        activity = new Bundle();
        activity.putInt("theme_tab", l);
        activity.putInt("widget_id", i1);
        activity.putInt("widget_type", j1);
        activity.putBoolean("is_config_gowidget", flag);
        e1.setArguments(activity);
        return e1;
    }

    private void a(int l)
    {
        int i1 = 0;
        int j1 = 0;
        for (; i1 < e.length; i1++)
        {
            if (l == e[i1])
            {
                j1 = i1;
            }
        }

        g.setCurrentItem(j1, true);
    }

    static int[] a(e e1)
    {
        return e1.e;
    }

    static n b(e e1)
    {
        return e1.i;
    }

    private void b()
    {
        c;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 50
    //                   2 62
    //                   3 68
    //                   4 74
    //                   5 80;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException("new widgetType?");
_L2:
        int l = 0x7f080596;
_L8:
        k.setText(l);
        return;
_L3:
        l = 0x7f080597;
        continue; /* Loop/switch isn't completed */
_L4:
        l = 0x7f080598;
        continue; /* Loop/switch isn't completed */
_L5:
        l = 0x7f08059a;
        continue; /* Loop/switch isn't completed */
_L6:
        l = 0x7f080599;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void b(Bundle bundle)
    {
        a = 1;
        if (bundle != null)
        {
            a = bundle.getInt("theme_tab", 1);
            c = bundle.getInt("widget_type", 1);
            d = bundle.getInt("widget_id", 0);
            b = bundle.getBoolean("is_config_gowidget", true);
        }
    }

    static j c(e e1)
    {
        return e1.j;
    }

    private String[] c()
    {
        return (new String[] {
            getString(0x7f0804e0), getString(0x7f0804e1)
        });
    }

    public void a(View view, int l)
    {
        g.setCurrentItem(l, true);
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
        i = com.go.weatherex.themeconfig.n.a(getActivity(), c);
        j = com.go.weatherex.themeconfig.j.a(getActivity(), d, c, b);
        f.a(c());
        a(f.b(), 4, true);
        f.a(0);
        a(k, 4, true);
        h = new f(this, getChildFragmentManager());
        g.setOffscreenPageLimit(e.length);
        g.setVisibility(0);
        g.setAdapter(h);
        a(a);
        b();
        ac.c();
        ac.j();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030093, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
    }

    public void onPageScrollStateChanged(int l)
    {
        f.onPageScrollStateChanged(l);
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
        f.onPageScrolled(l, f1, i1);
    }

    public void onPageSelected(int l)
    {
        f.onPageSelected(l);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f = new com.go.weatherex.themestore.a(getActivity(), c(0x7f090398));
        f.a(this);
        g = (ViewPager)c(0x7f09039a);
        g.setOnPageChangeListener(this);
        k = (TextView)c(0x7f090397);
    }
}
