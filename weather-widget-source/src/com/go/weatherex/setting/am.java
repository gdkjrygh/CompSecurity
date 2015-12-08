// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.setting:
//            an, ao, ap, aq, 
//            ar, as

public class am extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private TextView a;
    private View b;
    private View c;
    private TextView d;
    private ArrayList e;
    private View f;
    private TextView g;
    private ArrayList h;
    private View i;
    private TextView j;
    private ArrayList k;
    private View l;
    private TextView m;
    private ArrayList n;
    private View o;
    private TextView p;
    private ArrayList q;
    private View r;
    private View s;
    private CheckBox t;
    private int u;
    private BroadcastReceiver v;
    private e w;
    private f x;
    private t y;

    public am()
    {
    }

    static TextView a(am am1)
    {
        return am1.d;
    }

    private void a(int i1)
    {
        Intent intent = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", 4);
        startActivity(intent);
    }

    static e b(am am1)
    {
        return am1.w;
    }

    static TextView c(am am1)
    {
        return am1.g;
    }

    private void c()
    {
        boolean flag = x.b();
        Object obj = w.a();
        int i1 = ((u) (obj)).g;
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = (com.gau.go.launcherex.gowidget.weather.globalview.a)iterator.next();
            if (i1 != ((Integer)a1.c).intValue())
            {
                continue;
            }
            a1.b = true;
            d.setText(a1.a);
            break;
        } while (true);
        i1 = ((u) (obj)).q;
        iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.gau.go.launcherex.gowidget.weather.globalview.a a2 = (com.gau.go.launcherex.gowidget.weather.globalview.a)iterator.next();
            if (i1 != ((Integer)a2.c).intValue())
            {
                continue;
            }
            a2.b = true;
            g.setText(a2.a);
            break;
        } while (true);
        i1 = ((u) (obj)).A;
        iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.gau.go.launcherex.gowidget.weather.globalview.a a3 = (com.gau.go.launcherex.gowidget.weather.globalview.a)iterator.next();
            if (i1 != ((Integer)a3.c).intValue())
            {
                continue;
            }
            a3.b = true;
            j.setText(a3.a);
            break;
        } while (true);
        i1 = ((u) (obj)).B;
        iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.gau.go.launcherex.gowidget.weather.globalview.a a4 = (com.gau.go.launcherex.gowidget.weather.globalview.a)iterator.next();
            if (i1 != ((Integer)a4.c).intValue())
            {
                continue;
            }
            a4.b = true;
            m.setText(a4.a);
            break;
        } while (true);
        u = ((u) (obj)).r;
        if (t != null)
        {
            if (flag)
            {
                t.setEnabled(true);
                t.setClickable(true);
                Object obj1 = t;
                int j1;
                boolean flag1;
                if (u == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((CheckBox) (obj1)).setChecked(flag1);
            } else
            {
                t.setChecked(false);
                t.setEnabled(false);
                t.setClickable(false);
            }
        }
        j1 = ((u) (obj)).k;
        obj = q.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (com.gau.go.launcherex.gowidget.weather.globalview.a)((Iterator) (obj)).next();
            if (j1 != ((Integer)((com.gau.go.launcherex.gowidget.weather.globalview.a) (obj1)).c).intValue())
            {
                continue;
            }
            obj1.b = true;
            p.setText(((com.gau.go.launcherex.gowidget.weather.globalview.a) (obj1)).a);
            break;
        } while (true);
    }

    static TextView d(am am1)
    {
        return am1.j;
    }

    private void d()
    {
        t t1 = n();
        t1.a(0x7f080391);
        t1.a(e);
        t1.b(0);
        t1.a(new an(this));
        t1.a();
    }

    static TextView e(am am1)
    {
        return am1.m;
    }

    static TextView f(am am1)
    {
        return am1.p;
    }

    static View g(am am1)
    {
        return am1.r;
    }

    static CheckBox h(am am1)
    {
        return am1.t;
    }

    static View i(am am1)
    {
        return am1.s;
    }

    private void j()
    {
        t t1 = n();
        t1.a(0x7f080392);
        t1.a(h);
        t1.b(4);
        t1.a(new ao(this));
        t1.a();
    }

    private void k()
    {
        t t1 = n();
        t1.a(0x7f0803c4);
        t1.a(k);
        t1.b(0);
        t1.a(new ap(this));
        t1.a();
    }

    private void l()
    {
        byte byte0 = 4;
        t t1 = n();
        t1.a(0x7f0803c5);
        t1.a(n);
        if (n.size() <= 4)
        {
            byte0 = 0;
        }
        t1.b(byte0);
        t1.a(new aq(this));
        t1.a();
    }

    private void m()
    {
        t t1 = n();
        t1.a(0x7f08039b);
        t1.a(q);
        t1.b(0);
        t1.a(new ar(this));
        t1.a();
    }

    private t n()
    {
        if (y == null)
        {
            y = new t(getActivity());
        }
        return y;
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(a, 4, true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext());
        w = bundle.f();
        x = bundle.e();
        a = (TextView)c(0x7f090202);
        a.setText(0x7f08038d);
        b = c(0x7f090226);
        b.setOnClickListener(this);
        h = new ArrayList();
        bundle = com.gau.go.launcherex.gowidget.weather.util.c.d(getActivity());
        int ai[] = getResources().getIntArray(0x7f0d002c);
        for (int i1 = 0; i1 < bundle.length; i1++)
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a5 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a5.b = false;
            a5.a = bundle[i1];
            a5.c = Integer.valueOf(ai[i1]);
            h.add(a5);
        }

        bundle = com.gau.go.launcherex.gowidget.weather.util.c.e(getActivity());
        e = new ArrayList(bundle.length);
        for (int j1 = 0; j1 < bundle.length; j1++)
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.b = false;
            a1.a = bundle[j1];
            a1.c = Integer.valueOf((new int[] {
                1, 2
            })[j1]);
            e.add(a1);
        }

        k = new ArrayList();
        bundle = com.gau.go.launcherex.gowidget.weather.util.c.f(getActivity());
        for (int k1 = 0; k1 < bundle.length; k1++)
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a2 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a2.b = false;
            a2.a = bundle[k1];
            a2.c = Integer.valueOf((new int[] {
                1, 2
            })[k1]);
            k.add(a2);
        }

        n = new ArrayList();
        bundle = com.gau.go.launcherex.gowidget.weather.util.c.g(getActivity());
        for (int l1 = 0; l1 < bundle.length; l1++)
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a3 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a3.b = false;
            a3.a = bundle[l1];
            a3.c = Integer.valueOf((new int[] {
                1, 2, 3, 4, 5, 6
            })[l1]);
            n.add(a3);
        }

        q = new ArrayList();
        bundle = new int[3];
        Bundle _tmp = bundle;
        bundle[0] = 1;
        bundle[1] = 2;
        bundle[2] = 3;
        for (int i2 = 0; i2 < bundle.length; i2++)
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a4 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a4.b = false;
            a4.a = com.gau.go.launcherex.gowidget.weather.util.r.a(bundle[i2]);
            a4.c = Integer.valueOf(bundle[i2]);
            q.add(a4);
        }

        c = c(0x7f090323);
        c.setOnClickListener(this);
        d = (TextView)c(0x7f090325);
        f = c(0x7f090326);
        f.setOnClickListener(this);
        g = (TextView)c(0x7f090327);
        i = c(0x7f090328);
        i.setOnClickListener(this);
        j = (TextView)c(0x7f090329);
        l = c(0x7f09032a);
        l.setOnClickListener(this);
        m = (TextView)c(0x7f09032b);
        r = c(0x7f09032e);
        t = (CheckBox)c(0x7f090330);
        s = c(0x7f09032f);
        r.setOnClickListener(this);
        t.setOnCheckedChangeListener(this);
        if (x.b())
        {
            s.setVisibility(8);
            t.setVisibility(0);
            t.setEnabled(true);
            t.setClickable(true);
        } else
        {
            s.setVisibility(0);
            t.setVisibility(8);
            t.setEnabled(false);
            t.setClickable(false);
        }
        o = c(0x7f09032c);
        o.setOnClickListener(this);
        p = (TextView)c(0x7f09032d);
        c();
        v = new as(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        getActivity().registerReceiver(v, bundle);
        b();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.equals(t))
        {
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (u != i1)
            {
                u = i1;
                w.a(WeatherContentProvider.g, "setting_key", "world_clock", "setting_value", u);
            }
        }
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            h();
        } else
        {
            if (view.equals(c))
            {
                d();
                return;
            }
            if (view.equals(f))
            {
                j();
                return;
            }
            if (view.equals(i))
            {
                k();
                return;
            }
            if (view.equals(l))
            {
                l();
                return;
            }
            if (view.equals(r))
            {
                if (!x.b())
                {
                    a(3);
                    return;
                } else
                {
                    t.toggle();
                    return;
                }
            }
            if (view.equals(o))
            {
                m();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008a, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (v != null)
        {
            getActivity().unregisterReceiver(v);
            v = null;
        }
    }

    public void onResume()
    {
        super.onResume();
    }
}
