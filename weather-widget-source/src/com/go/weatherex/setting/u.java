// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.l;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.setting:
//            x, w, am, bo, 
//            bz, bl, aj, cc, 
//            at, ad

public class u extends a
    implements android.view.View.OnClickListener
{

    private TextView a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private View n;
    private View o;
    private TextView p;
    private View q;
    private View r;
    private SharedPreferences s;
    private x t;
    private ArrayList u;
    private boolean v;
    private BroadcastReceiver w;
    private h x;
    private View y;

    public u()
    {
        v = false;
    }

    private void a(int i1)
    {
        Intent intent = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 7);
        startActivity(intent);
    }

    static void a(u u1)
    {
        u1.c();
    }

    static void b(u u1)
    {
        u1.d();
    }

    private void c()
    {
        if (com.gau.go.launcherex.gowidget.statistics.w.p(getActivity()))
        {
            c.setVisibility(8);
            return;
        }
        if (GoWidgetApplication.b(getActivity().getApplicationContext()).b())
        {
            c.setVisibility(0);
            c.setText(getText(0x7f08030c));
            return;
        } else
        {
            c.setVisibility(8);
            return;
        }
    }

    static void c(u u1)
    {
        u1.j();
    }

    private void d()
    {
        v = false;
        if (u == null)
        {
            u = com.gau.go.launcherex.gowidget.language.e.a(getActivity()).g();
        }
        Iterator iterator = u.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((l)iterator.next()).b)
            {
                continue;
            }
            v = true;
            break;
        } while (true);
    }

    private void j()
    {
        if (com.gau.go.launcherex.gowidget.b.a.d || v)
        {
            o.setVisibility(0);
            return;
        } else
        {
            o.setVisibility(8);
            return;
        }
    }

    private void k()
    {
        if (com.gau.go.launcherex.gowidget.b.a.f)
        {
            r.setVisibility(0);
            return;
        } else
        {
            r.setVisibility(8);
            return;
        }
    }

    private void l()
    {
        boolean flag = false;
        if (!com.gau.go.launcherex.gowidget.b.a.a)
        {
            com.gau.go.launcherex.gowidget.b.a.b = s.getBoolean("setting_forecast", false);
            com.gau.go.launcherex.gowidget.b.a.c = s.getBoolean("setting_notification_sound", false);
            com.gau.go.launcherex.gowidget.b.a.e = s.getBoolean("key_new_feature_temp_change", false);
            com.gau.go.launcherex.gowidget.b.a.d = s.getBoolean("setting_language", false);
            if (s.getBoolean("key_about_go_weather_ex_new", true) || s.getBoolean("key_has_new_version", false))
            {
                flag = true;
            }
            com.gau.go.launcherex.gowidget.b.a.f = flag;
            com.gau.go.launcherex.gowidget.b.a.a = true;
        }
    }

    private void m()
    {
        if (s.getBoolean("key_is_new_user", true))
        {
            return;
        } else
        {
            y.setVisibility(0);
            return;
        }
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(a, 4, true);
    }

    protected void f()
    {
        super.f();
        a.setText(0x7f08038d);
        c();
        e.setText(0x7f0803be);
        f.setText(0x7f080429);
        h.setText(0x7f08050f);
        g.setText(0x7f08042a);
        j.setText(0x7f08042c);
        k.setText(0x7f0803b4);
        m.setText(0x7f0803f6);
        p.setText(0x7f0803b5);
        d.setText(0x7f080428);
        i.setText(0x7f08042b);
        l.setText(0x7f08042d);
        if (y.getVisibility() == 0)
        {
            ((TextView)y.findViewById(0x7f0902fd)).setText(0x7f08042b);
            ((TextView)y.findViewById(0x7f0902fe)).setText(0x7f0804e7);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        x = new h();
        s = GoWidgetApplication.c(getActivity().getApplicationContext()).a();
        a = (TextView)c(0x7f090202);
        a.setText(0x7f08038d);
        b = c(0x7f090226);
        b.setOnClickListener(this);
        d = (TextView)c(0x7f0902ec);
        i = (TextView)c(0x7f0902f1);
        l = (TextView)c(0x7f0902f4);
        c = (TextView)c(0x7f0902f8);
        c.setOnClickListener(this);
        e = (TextView)c(0x7f0902ed);
        e.setOnClickListener(this);
        f = (TextView)c(0x7f0902ee);
        f.setOnClickListener(this);
        g = (TextView)c(0x7f0902ef);
        g.setOnClickListener(this);
        h = (TextView)c(0x7f0902f0);
        h.setOnClickListener(this);
        bundle = h;
        int i1;
        if (com.go.weatherex.wear.f.a(getActivity()))
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        j = (TextView)c(0x7f0902f2);
        j.setOnClickListener(this);
        k = (TextView)c(0x7f0902f3);
        k.setOnClickListener(this);
        m = (TextView)c(0x7f0902f6);
        o = c(0x7f0902f7);
        n = c(0x7f0902f5);
        n.setOnClickListener(this);
        p = (TextView)c(0x7f0902fa);
        r = c(0x7f0902fb);
        q = c(0x7f0902f9);
        q.setOnClickListener(this);
        y = c(0x7f0902fc);
        l();
        d();
        c();
        t = new x(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        getActivity().registerReceiver(t, bundle);
        w = new com.go.weatherex.setting.w(this, null);
        bundle = new IntentFilter();
        bundle.addAction("android.intent.action.PACKAGE_ADDED");
        bundle.addAction("android.intent.action.PACKAGE_REMOVED");
        bundle.addAction("android.intent.action.PACKAGE_REPLACED");
        bundle.addDataScheme("package");
        getActivity().registerReceiver(w, bundle);
        b();
        m();
    }

    public void onClick(View view)
    {
        if (!x.a(hashCode()))
        {
            if (view.equals(b))
            {
                h();
                return;
            }
            if (view.equals(c))
            {
                a(-1);
                return;
            }
            if (view.equals(e))
            {
                a(com/go/weatherex/setting/am, null);
                return;
            }
            if (view.equals(f))
            {
                a(com/go/weatherex/setting/bo, null);
                return;
            }
            if (view.equals(h))
            {
                com.go.weatherex.setting.bz.a(this);
                return;
            }
            if (view.equals(g))
            {
                a(com/go/weatherex/setting/bl, null);
                return;
            }
            if (view.equals(j))
            {
                a(com/go/weatherex/setting/aj, null);
                return;
            }
            if (view.equals(k))
            {
                a(com/go/weatherex/setting/cc, null);
                return;
            }
            if (view.equals(n))
            {
                if (com.gau.go.launcherex.gowidget.b.a.d)
                {
                    com.gau.go.launcherex.gowidget.b.a.d = false;
                    view = s.edit();
                    view.putBoolean("setting_language", false);
                    view.commit();
                    j();
                }
                a(com/go/weatherex/setting/at, null);
                return;
            }
            if (view.equals(q))
            {
                if (com.gau.go.launcherex.gowidget.b.a.f)
                {
                    com.gau.go.launcherex.gowidget.b.a.f = false;
                    view = s.edit();
                    view.putBoolean("key_about_go_weather_ex_new", false);
                    view.commit();
                    k();
                }
                a(com/go/weatherex/setting/ad, null);
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030086, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().unregisterReceiver(t);
        getActivity().unregisterReceiver(w);
    }

    public void onResume()
    {
        super.onResume();
        j();
        k();
    }
}
