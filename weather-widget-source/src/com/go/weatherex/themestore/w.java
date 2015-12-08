// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.billing.o;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.setting.PersonalizeSettingsActivity;
import com.go.weatherex.sidebar.shuffle.f;

// Referenced classes of package com.go.weatherex.themestore:
//            c, x, an, a, 
//            y, z, ac, aa, 
//            ab, aj

public class w extends a
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.view.View.OnClickListener, com.go.weatherex.themestore.c
{

    private TextView a;
    private TextView b;
    private an c;
    private com.go.weatherex.themestore.a d;
    private ViewPager e;
    private aa f;
    private View g;
    private ViewGroup h;
    private int i[];
    private int j;
    private final h k = new h();
    private boolean l;
    private boolean m;
    private final aj n = new x(this);

    public w()
    {
        j = -1;
        l = false;
        m = false;
    }

    private int a(int i1)
    {
        for (int j1 = 0; j1 < i.length; j1++)
        {
            if (i1 == i[j1])
            {
                return j1;
            }
        }

        return 0;
    }

    static void a(w w1)
    {
        w1.j();
    }

    static boolean a(w w1, boolean flag)
    {
        w1.l = flag;
        return flag;
    }

    private void b(int i1)
    {
        e.setCurrentItem(i1, true);
    }

    static void b(w w1)
    {
        w1.d();
    }

    static boolean b(w w1, boolean flag)
    {
        w1.m = flag;
        return flag;
    }

    private String[] b()
    {
        String as[];
        int i1;
        as = new String[i.length];
        i1 = 0;
_L6:
        if (i1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        i[i1];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 55
    //                   2 67
    //                   3 79;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_79;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        as[i1] = getString(0x7f0804b9);
          goto _L7
_L3:
        as[i1] = getString(0x7f0804ba);
          goto _L7
        as[i1] = getString(0x7f0804bb);
          goto _L7
        return as;
    }

    private void c()
    {
        c.b.setText(getString(0x7f0804df));
        a.setText(getString(0x7f0804e0));
        b.setText(getString(0x7f0804e1));
    }

    static int[] c(w w1)
    {
        return w1.i;
    }

    static int d(w w1)
    {
        return w1.j;
    }

    private void d()
    {
        if (j == 1)
        {
            int i1;
            if (m)
            {
                d.c(a(3));
            } else
            {
                d.d(a(3));
            }
            if (l)
            {
                d.c(a(1));
            } else
            {
                d.d(a(1));
            }
            i1 = i[e.getCurrentItem()];
            if (i1 == 3 && m)
            {
                d.b().postDelayed(new y(this), 3000L);
            }
            if (i1 == 1 && l)
            {
                d.b().postDelayed(new z(this), 3000L);
                return;
            }
        }
    }

    private void d(int i1)
    {
        if (j == i1)
        {
            return;
        }
        j = i1;
        if (j == 1)
        {
            a.setSelected(true);
            b.setSelected(false);
            d();
            a(4, Integer.valueOf(j));
            return;
        }
        if (j == 2)
        {
            a.setSelected(false);
            b.setSelected(true);
            d.d(a(1));
            d.d(a(3));
            a(4, Integer.valueOf(j));
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("tab id is undefined: ").append(i1).toString());
        }
    }

    private void j()
    {
        while (!isAdded() || !com.go.weatherex.themestore.ac.h().b(getActivity())) 
        {
            return;
        }
        View view = com.go.weatherex.themestore.ac.h().a(getActivity(), null);
        h.addView(view, 0);
    }

    public void a(View view, int i1)
    {
        b(i1);
    }

    protected void b(int i1, Object obj)
    {
    }

    protected void f()
    {
        super.f();
        if (isDetached())
        {
            return;
        } else
        {
            c();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        i = (new int[] {
            1, 3
        });
        if ((new o(getActivity().getApplicationContext())).b() && !com.gau.go.launcherex.gowidget.statistics.w.p(getActivity().getApplicationContext()))
        {
            c.c.setVisibility(0);
        } else
        {
            c.c.setVisibility(8);
        }
        d.a(b());
        a(d.b(), 2, true);
        f = new aa(this, getChildFragmentManager());
        e.setOffscreenPageLimit(i.length);
        d(ac.e().c);
        c();
        g.setVisibility(0);
        d.a(0);
        e.setVisibility(0);
        e.setAdapter(f);
        b(a(ac.e().d));
        com.go.weatherex.themestore.ac.c();
        ac.j();
    }

    public void onClick(View view)
    {
        if (!view.equals(b)) goto _L2; else goto _L1
_L1:
        d(2);
_L4:
        return;
_L2:
        if (view.equals(a))
        {
            d(1);
            return;
        }
        if (view.equals(c.a))
        {
            a(5, null);
            return;
        }
        if (!view.equals(c.c))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!k.a(hashCode()))
        {
            view = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
            view.putExtra("recommend_type", 6);
            startActivity(view);
            com.gau.go.launcherex.goweather.goplay.n.a(getActivity().getApplicationContext()).a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!view.equals(c.d))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k.a(hashCode())) goto _L4; else goto _L5
_L5:
        startActivity(PersonalizeSettingsActivity.a(getActivity(), ac.e().b));
        return;
        if (!view.equals(c.h) || k.a(hashCode())) goto _L4; else goto _L6
_L6:
        com.go.weatherex.sidebar.shuffle.f.a("1624435071119252_1702129906683101");
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030094, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ac.b(n);
    }

    public void onPageScrollStateChanged(int i1)
    {
        d.onPageScrollStateChanged(i1);
    }

    public void onPageScrolled(int i1, float f1, int j1)
    {
        d.onPageScrolled(i1, f1, j1);
    }

    public void onPageSelected(int i1)
    {
        d.onPageSelected(i1);
        if (j == 1)
        {
            if (i[i1] == 3 && m)
            {
                m = false;
                d();
                ac.d(3);
            }
            if (i[i1] == 1 && l)
            {
                l = false;
                d();
                ac.d(1);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d = new com.go.weatherex.themestore.a(getActivity(), c(0x7f09039b));
        d.a(this);
        c = new an(getActivity(), c(0x7f090050));
        a(c.b, 4, true);
        c.g.setVisibility(8);
        if (!com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).e().b())
        {
            c.h.setVisibility(0);
        }
        c.c.setImageResource(0x7f0205b2);
        c.d.setImageResource(0x7f0200cb);
        a = (TextView)c(0x7f09039d);
        b = (TextView)c(0x7f09039e);
        e = (ViewPager)c(0x7f09039a);
        g = c(0x7f09039c);
        h = (ViewGroup)c(0x7f0901e1);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.a.setOnClickListener(this);
        c.c.setOnClickListener(this);
        c.d.setOnClickListener(this);
        c.h.setOnClickListener(this);
        c.h.setImageResource(0x7f020491);
        ((AnimationDrawable)c.h.getDrawable()).start();
        e.setOnPageChangeListener(this);
        com.go.weatherex.themestore.ac.a(n);
    }
}
