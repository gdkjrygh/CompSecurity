// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.b.r;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;
import com.jiubang.goweather.c.e;
import com.jiubang.goweather.c.h;

// Referenced classes of package com.go.weatherex.g:
//            z, aa, ad, ac

public class y extends b
{

    h a;
    private a b;
    private TextView c;
    private View d;
    private View g;
    private CityBean h;
    private final Handler i;
    private boolean j;
    private Toast k;
    private boolean l;
    private SharedPreferences m;
    private android.view.View.OnClickListener n;
    private android.view.View.OnClickListener o;

    public y(a a1, ViewGroup viewgroup, Handler handler)
    {
        j = false;
        l = true;
        a = new z(this);
        n = new aa(this);
        o = new ad(this);
        i = handler;
        f = a1.getActivity();
        b = a1;
        e = b.i().a(0x7f0300f0, viewgroup, false);
        c = (TextView)b(0x7f0904dc);
        d = b(0x7f0904db);
        g = b(0x7f090260);
        m = GoWidgetApplication.c(f.getApplicationContext()).a();
        l = m.getBoolean("key_need_show_follow_location_notice", true);
        com.jiubang.goweather.c.e.a(f).a(a);
        if (com.gau.go.launcherex.gowidget.c.g.a(b.getActivity()))
        {
            j = false;
            g.setVisibility(0);
            com.jiubang.goweather.c.e.a(f).b();
            return;
        } else
        {
            a.a(6);
            return;
        }
    }

    static TextView a(y y1)
    {
        return y1.c;
    }

    static Toast a(y y1, Toast toast)
    {
        y1.k = toast;
        return toast;
    }

    static CityBean a(y y1, CityBean citybean)
    {
        y1.h = citybean;
        return citybean;
    }

    private String a(CityBean citybean)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(citybean.b()))
        {
            stringbuilder.append(citybean.b());
        }
        if (!TextUtils.isEmpty(citybean.d()))
        {
            stringbuilder.append(", ").append(citybean.d());
        }
        if (!TextUtils.isEmpty(citybean.c()))
        {
            stringbuilder.append(", (").append(citybean.c()).append(")");
        }
        return stringbuilder.toString();
    }

    private void a()
    {
        (new ac(this)).execute(new Void[0]);
    }

    static boolean a(y y1, boolean flag)
    {
        y1.l = flag;
        return flag;
    }

    static View b(y y1)
    {
        return y1.g;
    }

    static String b(y y1, CityBean citybean)
    {
        return y1.a(citybean);
    }

    static boolean b(y y1, boolean flag)
    {
        y1.j = flag;
        return flag;
    }

    static android.view.View.OnClickListener c(y y1)
    {
        return y1.n;
    }

    static View d(y y1)
    {
        return y1.d;
    }

    private void d()
    {
        Message message = Message.obtain();
        message.what = 4;
        message.obj = h;
        i.sendMessage(message);
        r.a(f).a(h);
    }

    static boolean e(y y1)
    {
        return y1.j;
    }

    static a f(y y1)
    {
        return y1.b;
    }

    static Toast g(y y1)
    {
        return y1.k;
    }

    static android.view.View.OnClickListener h(y y1)
    {
        return y1.o;
    }

    static boolean i(y y1)
    {
        return y1.l;
    }

    static void j(y y1)
    {
        y1.a();
    }

    static void k(y y1)
    {
        y1.d();
    }

    static SharedPreferences l(y y1)
    {
        return y1.m;
    }

    static Context m(y y1)
    {
        return y1.f;
    }

    public void c()
    {
        com.jiubang.goweather.c.e.a(f).b(a);
    }
}
