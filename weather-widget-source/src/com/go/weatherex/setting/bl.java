// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

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
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            bm, bn

public class bl extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private t A;
    public int a;
    public int b;
    public int c;
    public int d;
    private e e;
    private TextView f;
    private View g;
    private View h;
    private CheckBox i;
    private TextView j;
    private TextView k;
    private View l;
    private CheckBox m;
    private View n;
    private CheckBox o;
    private View p;
    private TextView q;
    private TextView r;
    private VerticalStretchLayout s;
    private String t[];
    private int u[];
    private int v;
    private int w;
    private int x;
    private int y;
    private bn z;

    public bl()
    {
    }

    private void a(int i1, int j1, String as[], int ai[])
    {
        boolean flag = false;
        ai = new ArrayList();
        int l1 = as.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = as[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            ai.add(a1);
            k1++;
        }
        as = d();
        as.a(i1);
        as.a(ai);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        as.b(i1);
        as.a(new bm(this));
        as.a();
    }

    static void a(bl bl1, boolean flag)
    {
        bl1.a(flag);
    }

    private void a(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            a(false);
            i.setEnabled(false);
            e.b(1, false);
            j();
            return;
        } else
        {
            e.b(0, false);
            i.setEnabled(true);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (!flag)
        {
            h.setClickable(false);
            j.setText(0x7f0803a7);
            k.setTextColor(w);
            return;
        } else
        {
            h.setClickable(true);
            j.setText(0x7f0803a8);
            k.setTextColor(v);
            return;
        }
    }

    static int[] a(bl bl1)
    {
        return bl1.u;
    }

    private void b(boolean flag)
    {
        p.setClickable(flag);
        if (flag)
        {
            q.setTextColor(v);
            r.setTextColor(v);
            q.setCompoundDrawablesWithIntrinsicBounds(0, 0, x, 0);
            return;
        } else
        {
            q.setTextColor(w);
            r.setTextColor(w);
            q.setCompoundDrawablesWithIntrinsicBounds(0, 0, y, 0);
            return;
        }
    }

    static String[] b(bl bl1)
    {
        return bl1.t;
    }

    static TextView c(bl bl1)
    {
        return bl1.q;
    }

    private void c()
    {
        int i1 = 0;
        boolean flag1 = true;
        u u1 = e.a();
        b = u1.a;
        CheckBox checkbox = m;
        int j1;
        boolean flag;
        if (b == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        b(m.isChecked());
        if (m.isChecked())
        {
            s.b();
        } else
        {
            s.a();
        }
        c = u1.b;
        checkbox = i;
        if (c == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        d = u1.c;
        checkbox = o;
        if (d == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        a = u1.e;
        j1 = u.length;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    if (a != u[i1])
                    {
                        break label0;
                    }
                    q.setText(t[i1]);
                }
                return;
            }
            i1++;
        } while (true);
    }

    static e d(bl bl1)
    {
        return bl1.e;
    }

    private t d()
    {
        if (A == null)
        {
            A = new t(getActivity());
        }
        return A;
    }

    private void j()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 20);
        getActivity().startService(intent);
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(f, 4, true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        e = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).f();
        v = getResources().getColor(0x7f0a0086);
        w = getResources().getColor(0x7f0a0088);
        x = 0x7f020425;
        y = 0x7f020425;
        f = (TextView)c(0x7f090202);
        f.setText(0x7f08038d);
        g = c(0x7f090226);
        g.setOnClickListener(this);
        l = c(0x7f090339);
        l.setOnClickListener(this);
        m = (CheckBox)c(0x7f09033a);
        m.setOnCheckedChangeListener(this);
        h = c(0x7f090333);
        k = (TextView)c(0x7f090334);
        j = (TextView)c(0x7f090335);
        h.setOnClickListener(this);
        i = (CheckBox)c(0x7f090336);
        i.setOnCheckedChangeListener(this);
        n = c(0x7f090337);
        n.setOnClickListener(this);
        o = (CheckBox)c(0x7f090338);
        o.setOnCheckedChangeListener(this);
        t = com.gau.go.launcherex.gowidget.weather.util.c.a(getActivity());
        u = getResources().getIntArray(0x7f0d0026);
        p = c(0x7f09033c);
        p.setOnClickListener(this);
        q = (TextView)c(0x7f09033e);
        r = (TextView)c(0x7f09033d);
        s = (VerticalStretchLayout)c(0x7f09033b);
        z = new bn(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION_FAILED");
        getActivity().registerReceiver(z, bundle);
        c();
        b();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        i1 = 1;
        if (!compoundbutton.equals(i)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            i1 = 0;
        }
        if (c != i1)
        {
            c = i1;
            a(Boolean.valueOf(flag));
        }
_L4:
        return;
_L2:
        if (!compoundbutton.equals(m))
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1;
        if (flag)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        if (b != j1)
        {
            b = j1;
            b(flag);
            e.a(WeatherContentProvider.g, "setting_key", "autoUpdate", "setting_value", b);
            if (flag)
            {
                s.d();
                return;
            } else
            {
                s.c();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!compoundbutton.equals(o)) goto _L4; else goto _L3
_L3:
        int k1;
        if (flag)
        {
            k1 = ((flag2) ? 1 : 0);
        } else
        {
            k1 = 0;
        }
        if (d != k1)
        {
            d = k1;
            e.a(WeatherContentProvider.g, "setting_key", "launch_refresh", "setting_value", d);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        if (!view.equals(g)) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (view.equals(l))
        {
            m.toggle();
            return;
        }
        if (view.equals(h))
        {
            i.toggle();
            return;
        }
        if (view.equals(n))
        {
            o.toggle();
            return;
        }
        if (view.equals(p))
        {
            int j1 = u.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                if (a == u[i1])
                {
                    a(0x7f0803ad, i1, t, u);
                    return;
                }
                i1++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008c, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().unregisterReceiver(z);
    }

    public void onResume()
    {
        super.onResume();
    }
}
