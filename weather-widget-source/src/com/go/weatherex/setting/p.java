// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.theme.c;
import com.gau.go.launcherex.gowidget.weather.view.AppListActivity;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            q, o, r, s, 
//            t

public class p
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private String A;
    private boolean B;
    private boolean C;
    private com.go.weatherex.setting.t D;
    private f E;
    private t F;
    private h G;
    private o H;
    private ViewGroup I;
    public int a;
    public int b;
    public int c;
    private View d;
    private CheckBox e;
    private View f;
    private TextView g;
    private int h;
    private String i[];
    private int j[];
    private View k;
    private TextView l;
    private View m;
    private TextView n;
    private View o;
    private CheckBox p;
    private View q;
    private View r;
    private CheckBox s;
    private e t;
    private r u;
    private s v;
    private PackageManager w;
    private String x;
    private String y;
    private String z;

    public p(o o1)
    {
        c = 0;
        z = "";
        A = "";
        B = false;
        C = false;
        H = o1;
    }

    static int a(p p1, int i1)
    {
        p1.h = i1;
        return i1;
    }

    private View a(int i1)
    {
        return I.findViewById(i1);
    }

    private void a(int i1, int j1, CharSequence acharsequence[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = acharsequence.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            a a1 = new a();
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
        acharsequence = g();
        acharsequence.a(i1);
        acharsequence.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        acharsequence.b(i1);
        acharsequence.a(new q(this, j1));
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
                x = cursor.getString(0);
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
        if (!TextUtils.isEmpty(x))
        {
            y = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(context, x);
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
            A = ((String) (obj));
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
            z = ((String) (obj));
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
        if (!E.b())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj = s;
        NumberFormatException numberformatexception;
        if (c == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckBox) (obj)).setChecked(flag);
        r.setVisibility(8);
        s.setVisibility(0);
        s.setEnabled(true);
          goto _L8
        r.setVisibility(0);
        s.setVisibility(8);
        s.setEnabled(false);
          goto _L8
        numberformatexception;
          goto _L8
    }

    static void a(p p1, Cursor cursor)
    {
        p1.a(cursor);
    }

    static void a(p p1, String s1)
    {
        p1.d(s1);
    }

    private void a(String s1)
    {
        if (l != null)
        {
            l.setText(s1);
        }
    }

    static int[] a(p p1)
    {
        return p1.j;
    }

    private String b(int i1)
    {
        return H.getString(i1);
    }

    static void b(p p1, String s1)
    {
        p1.c(s1);
    }

    private void b(String s1)
    {
        z = s1;
    }

    static String[] b(p p1)
    {
        return p1.i;
    }

    static TextView c(p p1)
    {
        return p1.g;
    }

    private void c(int i1)
    {
        Intent intent = new Intent(d(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", -1);
        H.startActivity(intent);
    }

    static void c(p p1, String s1)
    {
        p1.a(s1);
    }

    private void c(String s1)
    {
        A = s1;
    }

    static int d(p p1)
    {
        return p1.h;
    }

    private Activity d()
    {
        return H.getActivity();
    }

    static void d(p p1, String s1)
    {
        p1.b(s1);
    }

    private void d(String s1)
    {
        if (n != null)
        {
            n.setText(s1);
        }
    }

    private Resources e()
    {
        return H.getResources();
    }

    static e e(p p1)
    {
        return p1.t;
    }

    static CheckBox f(p p1)
    {
        return p1.p;
    }

    private void f()
    {
label0:
        {
            if (!TextUtils.isEmpty(x))
            {
                if (!x.contains("app_widget_theme"))
                {
                    break label0;
                }
                B = true;
                C = true;
            }
            return;
        }
        c c1 = com.gau.go.launcherex.gowidget.weather.theme.c.a(d().getApplicationContext());
        c1.a(d().getApplicationContext(), x);
        int j1 = c1.a("goweatherex_widget_l_lunar_fore", x);
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = c1.a("goweatherex_widget_l_lunar", x);
        }
        if (i1 != 0)
        {
            B = true;
        } else
        {
            B = false;
        }
        j1 = c1.a("goweatherex_widget_l_festival_fore", x);
        i1 = j1;
        if (j1 == 0)
        {
            i1 = c1.a("goweatherex_widget_l_festival", x);
        }
        if (i1 != 0)
        {
            C = true;
            return;
        } else
        {
            C = false;
            return;
        }
    }

    private t g()
    {
        if (F == null)
        {
            F = new t(d());
        }
        return F;
    }

    static boolean g(p p1)
    {
        return p1.B;
    }

    static CheckBox h(p p1)
    {
        return p1.e;
    }

    private void h()
    {
        u.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('widgt_calendar', 'dynamic_icon_gowidget', '', 'widget_theme_switcher', 'widgt_clock')", null, null);
    }

    static boolean i(p p1)
    {
        return p1.C;
    }

    static String j(p p1)
    {
        return p1.z;
    }

    static Activity k(p p1)
    {
        return p1.d();
    }

    static PackageManager l(p p1)
    {
        return p1.w;
    }

    static String m(p p1)
    {
        return p1.A;
    }

    static TextView n(p p1)
    {
        return p1.l;
    }

    static TextView o(p p1)
    {
        return p1.n;
    }

    static View p(p p1)
    {
        return p1.q;
    }

    static CheckBox q(p p1)
    {
        return p1.s;
    }

    static View r(p p1)
    {
        return p1.r;
    }

    public void a()
    {
    }

    public void a(Bundle bundle)
    {
        G = new h();
        w = d().getPackageManager();
        E = GoWidgetApplication.b(d().getApplicationContext());
        k = a(0x7f090374);
        k.setOnClickListener(this);
        l = (TextView)a(0x7f090375);
        m = a(0x7f090376);
        m.setOnClickListener(this);
        n = (TextView)a(0x7f090377);
        u = new r(this, d().getContentResolver());
        h();
        t = com.gau.go.launcherex.gowidget.weather.c.c.a(d().getApplicationContext()).f();
        f = a(0x7f0901b7);
        f.setOnClickListener(this);
        g = (TextView)a(0x7f0901b8);
        i = com.gau.go.launcherex.gowidget.weather.util.c.b(d());
        j = e().getIntArray(0x7f0d0028);
        f.setVisibility(8);
        d = a(0x7f0901b5);
        d.setOnClickListener(this);
        e = (CheckBox)a(0x7f090378);
        e.setOnCheckedChangeListener(this);
        o = a(0x7f090379);
        o.setOnClickListener(this);
        p = (CheckBox)a(0x7f09037a);
        p.setOnCheckedChangeListener(this);
        q = a(0x7f09037b);
        q.setOnClickListener(this);
        s = (CheckBox)a(0x7f09037d);
        s.setOnCheckedChangeListener(this);
        r = a(0x7f09037c);
        if (E.b())
        {
            r.setVisibility(8);
            s.setVisibility(0);
            s.setEnabled(true);
        } else
        {
            r.setVisibility(0);
            s.setVisibility(8);
            s.setEnabled(false);
        }
        a(((Context) (d())));
        f();
        if (!B)
        {
            e.setEnabled(false);
        }
        v = new s(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        d().registerReceiver(v, bundle);
        D = new com.go.weatherex.setting.t(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        d().registerReceiver(D, bundle);
    }

    public void a(ViewGroup viewgroup)
    {
        H.i().a(0x7f0300e0, viewgroup, true);
        I = viewgroup;
    }

    public void b()
    {
        d().unregisterReceiver(v);
        d().unregisterReceiver(D);
    }

    public void c()
    {
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        i1 = 1;
        if (!compoundbutton.equals(e)) goto _L2; else goto _L1
_L1:
        if (!B) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            i1 = 0;
        }
        if (a != i1)
        {
            a = i1;
            t.a(WeatherContentProvider.g, "setting_key", "calendarType", "setting_value", a);
            t.k(a);
        }
_L6:
        return;
_L4:
        Toast.makeText(d().getApplicationContext(), (new StringBuilder()).append("(").append(y).append(") ").append(b(0x7f0803de)).toString(), 0).show();
        return;
_L2:
        if (!compoundbutton.equals(p))
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
            t.a(WeatherContentProvider.g, "setting_key", "isCycle", "setting_value", b);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!compoundbutton.equals(s)) goto _L6; else goto _L5
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
            t.a(WeatherContentProvider.g, "setting_key", "dynamic_icon_gowidget", "setting_value", c);
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void onClick(View view)
    {
        int i1 = 0;
        if (!view.equals(d)) goto _L2; else goto _L1
_L1:
        if (!B) goto _L4; else goto _L3
_L3:
        e.toggle();
_L6:
        return;
_L4:
        Toast.makeText(d().getApplicationContext(), (new StringBuilder()).append("(").append(y).append(") ").append(b(0x7f0803de)).toString(), 0).show();
        return;
_L2:
        if (!view.equals(f))
        {
            break; /* Loop/switch isn't completed */
        }
        if (C)
        {
            int j1 = j.length;
            while (i1 < j1) 
            {
                if (h == j[i1])
                {
                    a(0x7f0803cc, i1, i);
                    return;
                }
                i1++;
            }
        } else
        {
            Toast.makeText(d().getApplicationContext(), (new StringBuilder()).append("(").append(y).append(") ").append(b(0x7f0803df)).toString(), 0).show();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (view.equals(k) && !G.a(k.getId()))
        {
            view = new Intent("android.intent.action.VIEW");
            view.setClass(d(), com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
            view.putExtra("calendar_clock_binding_app", 2);
            view.putExtra("app_widget", z);
            H.startActivityForResult(view, 101);
            d().overridePendingTransition(0x7f040008, 0x7f04001e);
            return;
        }
        if (view.equals(m) && !G.a(m.getId()))
        {
            view = new Intent("android.intent.action.VIEW");
            view.setClass(d(), com/gau/go/launcherex/gowidget/weather/view/AppListActivity);
            view.putExtra("calendar_clock_binding_app", 1);
            view.putExtra("app_widget", A);
            H.startActivityForResult(view, 102);
            d().overridePendingTransition(0x7f040008, 0x7f04001e);
            return;
        }
        if (view.equals(o))
        {
            p.toggle();
            return;
        }
        if (view.equals(q))
        {
            if (!E.b())
            {
                c(1);
                return;
            } else
            {
                s.toggle();
                return;
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
    }
}
