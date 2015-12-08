// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.e.c;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.go.weatherex.framework.fragment.f;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.setting:
//            l, o, m, ba

public class k
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private View a;
    private View b;
    private View c;
    private CheckBox d;
    private m e;
    private boolean f;
    private View g;
    private CheckBox h;
    private VerticalStretchLayout i;
    private TextView j;
    private ImageView k;
    private boolean l;
    private int m;
    private int n;
    private SharedPreferences o;
    private Dialog p;
    private e q;
    private com.gau.go.launcherex.gowidget.c.h r;
    private o s;
    private ViewGroup t;
    private final BroadcastReceiver u = new l(this);

    public k(o o1)
    {
        l = false;
        s = o1;
    }

    private View a(int i1)
    {
        return t.findViewById(i1);
    }

    static void a(k k1)
    {
        k1.i();
    }

    static void a(k k1, boolean flag)
    {
        k1.a(flag);
    }

    private void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        q.u(i1);
        q.a(WeatherContentProvider.g, "setting_key", "dynamic_bg_switch", "setting_value", i1);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            j.setTextColor(m);
            j.setClickable(flag);
            j.setEnabled(flag);
            return;
        } else
        {
            j.setTextColor(n);
            j.setClickable(flag);
            j.setEnabled(flag);
            return;
        }
    }

    private void d()
    {
        Cursor cursor;
        cursor = e().getContentResolver().query(WeatherContentProvider.g, com.gau.go.launcherex.gowidget.weather.e.c.a(), "setting_key=?", new String[] {
            "app_theme"
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        cursor.moveToFirst();
        i1 = cursor.getColumnIndex("setting_value");
        if (i1 == -1) goto _L2; else goto _L3
_L3:
        String s1 = cursor.getString(i1);
_L4:
        try
        {
            cursor.close();
        }
        catch (Exception exception) { }
_L5:
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(s1) || "com.gtp.go.weather.phototheme".equals(s1))
        {
            a.setVisibility(8);
            b.setVisibility(8);
            c.setVisibility(8);
        }
        return;
_L2:
        s1 = "";
          goto _L4
        s1 = "";
          goto _L5
    }

    private Activity e()
    {
        return s.getActivity();
    }

    private Resources f()
    {
        return s.getResources();
    }

    private boolean g()
    {
        return q.a().l == 1;
    }

    private void h()
    {
label0:
        {
            if (!e().isFinishing())
            {
                if (p == null)
                {
                    break label0;
                }
                if (!p.isShowing())
                {
                    p.show();
                }
            }
            return;
        }
        p = ad.a(e());
        p.show();
    }

    private void i()
    {
        if (!e().isFinishing() && p != null && p.isShowing())
        {
            p.dismiss();
            p = null;
        }
    }

    public void a()
    {
        if (com.gau.go.launcherex.goweather.livewallpaper.b.h.a(e().getApplicationContext()))
        {
            h.setChecked(true);
        } else
        {
            h.setChecked(false);
        }
        b(h.isChecked());
    }

    public void a(Bundle bundle)
    {
        m = f().getColor(0x7f0a0086);
        n = f().getColor(0x7f0a0088);
        r = new com.gau.go.launcherex.gowidget.c.h();
        o = GoWidgetApplication.c(e().getApplicationContext()).a();
        e = new m(this);
        q = com.gau.go.launcherex.gowidget.weather.c.c.a(e().getApplicationContext()).f();
        a = a(0x7f090484);
        b = a(0x7f090485);
        c = a(0x7f09036d);
        c.setOnClickListener(this);
        d = (CheckBox)a(0x7f09036e);
        d.setOnCheckedChangeListener(this);
        d();
        g = a(0x7f09036f);
        k = (ImageView)g.findViewById(0x7f090370);
        h = (CheckBox)g.findViewById(0x7f090371);
        j = (TextView)a(0x7f090373);
        i = (VerticalStretchLayout)a(0x7f090372);
        i.setVisibility(8);
        h.setOnCheckedChangeListener(this);
        j.setOnClickListener(this);
        g.setOnClickListener(this);
        boolean flag;
        if (o.getInt("key_new_feature_live_wallpaper", 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (l)
        {
            k.setVisibility(0);
        }
        f = g();
        d.setChecked(f);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH");
        e().registerReceiver(u, bundle);
    }

    public void a(ViewGroup viewgroup)
    {
        s.i().a(0x7f0300e1, viewgroup, true);
        t = viewgroup;
    }

    public void b()
    {
        e().unregisterReceiver(u);
    }

    public void c()
    {
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.equals(d))
        {
            if (f != flag)
            {
                f = flag;
                e.removeMessages(1);
                if (f)
                {
                    compoundbutton = Message.obtain();
                    compoundbutton.what = 1;
                    compoundbutton.arg1 = 1;
                    e.sendMessageDelayed(compoundbutton, 500L);
                } else
                {
                    compoundbutton = Message.obtain();
                    compoundbutton.what = 1;
                    compoundbutton.arg1 = 2;
                    e.sendMessageDelayed(compoundbutton, 500L);
                }
                h();
            }
        } else
        if (compoundbutton.equals(h))
        {
            b(flag);
            if (l)
            {
                k.setVisibility(8);
                compoundbutton = o.edit();
                compoundbutton.putInt("key_new_feature_live_wallpaper", 0);
                compoundbutton.commit();
                return;
            }
        }
    }

    public void onClick(View view)
    {
        if (!r.a(hashCode()))
        {
            if (view.equals(c))
            {
                e.removeMessages(1);
                d.toggle();
                return;
            }
            if (view.equals(j))
            {
                s.a(com/go/weatherex/setting/ba, null);
                return;
            }
            if (view.equals(g))
            {
                view = new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
                try
                {
                    s.startActivity(view);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Toast.makeText(e(), 0x7f0803bd, 0).show();
                }
                return;
            }
        }
    }
}
