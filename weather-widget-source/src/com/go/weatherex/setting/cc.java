// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.theme.c;
import com.gau.go.launcherex.gowidget.weather.view.AppListActivity;
import com.go.weatherex.framework.fragment.a;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            cd, ce, cf, cg

public class cc extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private String A;
    private String B;
    private String C;
    private boolean D;
    private boolean E;
    private cg F;
    private f G;
    private t H;
    private h I;
    public int a;
    public int b;
    public int c;
    private TextView d;
    private View e;
    private View f;
    private CheckBox g;
    private View h;
    private TextView i;
    private int j;
    private String k[];
    private int l[];
    private View m;
    private TextView n;
    private View o;
    private TextView p;
    private View q;
    private CheckBox r;
    private View s;
    private View t;
    private CheckBox u;
    private e v;
    private ce w;
    private cf x;
    private PackageManager y;
    private String z;

    public cc()
    {
        c = 0;
        B = "";
        C = "";
        D = false;
        E = false;
    }

    static int a(cc cc1, int i1)
    {
        cc1.j = i1;
        return i1;
    }

    private void a(int i1)
    {
        Intent intent = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", -1);
        startActivity(intent);
    }

    private void a(int i1, int j1, CharSequence acharsequence[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = acharsequence.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = acharsequence[k1].toString();
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
            arraylist.add(a1);
            k1++;
        }
        acharsequence = d();
        acharsequence.a(i1);
        acharsequence.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        acharsequence.b(i1);
        acharsequence.a(new cd(this, j1));
        acharsequence.a();
    }

    private void a(Context context)
    {
        Cursor cursor = context.getContentResolver().query(WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "app_widget_theme"
        }, null);
        if (cursor != null)
        {
            if (cursor.getCount() > 0 && cursor.moveToNext())
            {
                z = cursor.getString(0);
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(z))
        {
            A = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(context, z);
        }
    }

    private void a(Cursor cursor)
    {
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        cursor.moveToFirst();
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
_L5:
        Object obj = cursor.getString(i1);
        if (!((String) (obj)).equals("widgt_calendar")) goto _L4; else goto _L3
_L3:
        obj = cursor.getString(j1);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            C = ((String) (obj));
        }
_L8:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L5; else goto _L2
_L2:
        cursor.close();
        return;
_L4:
        if (!((String) (obj)).equals("widgt_clock")) goto _L7; else goto _L6
_L6:
        obj = cursor.getString(j1);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            B = ((String) (obj));
        }
          goto _L8
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L2
        obj;
        cursor.close();
        throw obj;
_L7:
        if (!((String) (obj)).equals("dynamic_icon_gowidget")) goto _L8; else goto _L9
_L9:
        obj = cursor.getString(j1);
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag) goto _L8; else goto _L10
_L10:
        c = Integer.parseInt(((String) (obj)));
        if (!G.b())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj = u;
        NumberFormatException numberformatexception;
        if (c == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckBox) (obj)).setChecked(flag);
        t.setVisibility(8);
        u.setVisibility(0);
        u.setEnabled(true);
          goto _L8
        t.setVisibility(0);
        u.setVisibility(8);
        u.setEnabled(false);
          goto _L8
        numberformatexception;
          goto _L8
    }

    static void a(cc cc1, Cursor cursor)
    {
        cc1.a(cursor);
    }

    static void a(cc cc1, String s1)
    {
        cc1.d(s1);
    }

    private void a(String s1)
    {
        if (n != null)
        {
            n.setText(s1);
        }
    }

    static int[] a(cc cc1)
    {
        return cc1.l;
    }

    static void b(cc cc1, String s1)
    {
        cc1.c(s1);
    }

    private void b(String s1)
    {
        B = s1;
    }

    static String[] b(cc cc1)
    {
        return cc1.k;
    }

    static TextView c(cc cc1)
    {
        return cc1.i;
    }

    private void c()
    {
label0:
        {
            if (!TextUtils.isEmpty(z))
            {
                if (!z.contains("app_widget_theme"))
                {
                    break label0;
                }
                D = true;
                E = true;
            }
            return;
        }
        c c1 = com.gau.go.launcherex.gowidget.weather.theme.c.a(getActivity().getApplicationContext());
        c1.a(getActivity().getApplicationContext(), z);
        int j1 = c1.a("goweatherex_widget_l_lunar_fore", z);
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = c1.a("goweatherex_widget_l_lunar", z);
        }
        if (i1 != 0)
        {
            D = true;
        } else
        {
            D = false;
        }
        j1 = c1.a("goweatherex_widget_l_festival_fore", z);
        i1 = j1;
        if (j1 == 0)
        {
            i1 = c1.a("goweatherex_widget_l_festival", z);
        }
        if (i1 != 0)
        {
            E = true;
            return;
        } else
        {
            E = false;
            return;
        }
    }

    static void c(cc cc1, String s1)
    {
        cc1.a(s1);
    }

    private void c(String s1)
    {
        C = s1;
    }

    static int d(cc cc1)
    {
        return cc1.j;
    }

    private t d()
    {
        if (H == null)
        {
            H = new t(getActivity());
        }
        return H;
    }

    static void d(cc cc1, String s1)
    {
        cc1.b(s1);
    }

    private void d(String s1)
    {
        if (p != null)
        {
            p.setText(s1);
        }
    }

    static e e(cc cc1)
    {
        return cc1.v;
    }

    static CheckBox f(cc cc1)
    {
        return cc1.r;
    }

    static boolean g(cc cc1)
    {
        return cc1.D;
    }

    static CheckBox h(cc cc1)
    {
        return cc1.g;
    }

    static boolean i(cc cc1)
    {
        return cc1.E;
    }

    static String j(cc cc1)
    {
        return cc1.B;
    }

    private void j()
    {
        w.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('widgt_calendar', 'dynamic_icon_gowidget', '', 'widget_theme_switcher', 'widgt_clock')", null, null);
    }

    static PackageManager k(cc cc1)
    {
        return cc1.y;
    }

    static String l(cc cc1)
    {
        return cc1.C;
    }

    static TextView m(cc cc1)
    {
        return cc1.n;
    }

    static TextView n(cc cc1)
    {
        return cc1.p;
    }

    static View o(cc cc1)
    {
        return cc1.s;
    }

    static CheckBox p(cc cc1)
    {
        return cc1.u;
    }

    static View q(cc cc1)
    {
        return cc1.t;
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(d, 4, true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        I = new h();
        y = getActivity().getPackageManager();
        G = GoWidgetApplication.b(getActivity().getApplicationContext());
        m = c(0x7f090374);
        m.setOnClickListener(this);
        n = (TextView)c(0x7f090375);
        o = c(0x7f090376);
        o.setOnClickListener(this);
        p = (TextView)c(0x7f090377);
        w = new ce(this, getActivity().getContentResolver());
        j();
        v = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).f();
        d = (TextView)c(0x7f090202);
        d.setText(0x7f08038d);
        e = c(0x7f090226);
        e.setOnClickListener(this);
        h = c(0x7f0901b7);
        h.setOnClickListener(this);
        i = (TextView)c(0x7f0901b8);
        k = com.gau.go.launcherex.gowidget.weather.util.c.b(getActivity());
        l = getResources().getIntArray(0x7f0d0028);
        f = c(0x7f0901b5);
        f.setOnClickListener(this);
        g = (CheckBox)c(0x7f090378);
        g.setOnCheckedChangeListener(this);
        q = c(0x7f090379);
        q.setOnClickListener(this);
        r = (CheckBox)c(0x7f09037a);
        r.setOnCheckedChangeListener(this);
        s = c(0x7f09037b);
        s.setOnClickListener(this);
        u = (CheckBox)c(0x7f09037d);
        u.setOnCheckedChangeListener(this);
        t = c(0x7f09037c);
        if (G.b())
        {
            t.setVisibility(8);
            u.setVisibility(0);
            u.setEnabled(true);
        } else
        {
            t.setVisibility(0);
            u.setVisibility(8);
            u.setEnabled(false);
        }
        a(getActivity());
        c();
        if (!D)
        {
            g.setEnabled(false);
        }
        x = new cf(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        getActivity().registerReceiver(x, bundle);
        F = new cg(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        getActivity().registerReceiver(F, bundle);
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
        if (!compoundbutton.equals(g)) goto _L2; else goto _L1
_L1:
        if (!D) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            i1 = 0;
        }
        if (a != i1)
        {
            a = i1;
            v.a(WeatherContentProvider.g, "setting_key", "calendarType", "setting_value", a);
            v.k(a);
        }
_L6:
        return;
_L4:
        Toast.makeText(getActivity().getApplicationContext(), (new StringBuilder()).append("(").append(A).append(") ").append(getString(0x7f0803de)).toString(), 0).show();
        return;
_L2:
        if (!compoundbutton.equals(r))
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
            v.a(WeatherContentProvider.g, "setting_key", "isCycle", "setting_value", b);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!compoundbutton.equals(u)) goto _L6; else goto _L5
_L5:
        int k1;
        if (flag)
        {
            k1 = ((flag2) ? 1 : 0);
        } else
        {
            k1 = 0;
        }
        if (c != k1)
        {
            c = k1;
            v.a(WeatherContentProvider.g, "setting_key", "dynamic_icon_gowidget", "setting_value", c);
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void onClick(View view)
    {
        int i1 = 0;
        if (!view.equals(e)) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (view.equals(f))
        {
            if (D)
            {
                g.toggle();
                return;
            } else
            {
                Toast.makeText(getActivity().getApplicationContext(), (new StringBuilder()).append("(").append(A).append(") ").append(getString(0x7f0803de)).toString(), 0).show();
                return;
            }
        }
        if (!view.equals(h))
        {
            break; /* Loop/switch isn't completed */
        }
        if (E)
        {
            int j1 = l.length;
            while (i1 < j1) 
            {
                if (j == l[i1])
                {
                    a(0x7f0803cc, i1, k);
                    return;
                }
                i1++;
            }
        } else
        {
            Toast.makeText(getActivity().getApplicationContext(), (new StringBuilder()).append("(").append(A).append(") ").append(getString(0x7f0803df)).toString(), 0).show();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view.equals(m) && !I.a(m.getId()))
        {
            view = new Intent("android.intent.action.VIEW");
            view.setClass(getActivity(), com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
            view.putExtra("calendar_clock_binding_app", 2);
            view.putExtra("app_widget", B);
            startActivityForResult(view, 101);
            getActivity().overridePendingTransition(0x7f040008, 0x7f04001e);
            return;
        }
        if (view.equals(o) && !I.a(o.getId()))
        {
            view = new Intent("android.intent.action.VIEW");
            view.setClass(getActivity(), com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
            view.putExtra("calendar_clock_binding_app", 1);
            view.putExtra("app_widget", C);
            startActivityForResult(view, 102);
            getActivity().overridePendingTransition(0x7f040008, 0x7f04001e);
            return;
        }
        if (view.equals(q))
        {
            r.toggle();
            return;
        }
        if (view.equals(s))
        {
            if (!G.b())
            {
                a(1);
                return;
            } else
            {
                u.toggle();
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008f, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().unregisterReceiver(x);
        getActivity().unregisterReceiver(F);
    }

    public void onResume()
    {
        super.onResume();
    }
}
