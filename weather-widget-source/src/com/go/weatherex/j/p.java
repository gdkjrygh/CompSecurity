// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.h;
import com.gau.go.launcherex.gowidget.weather.systemwidget.i;
import com.gau.go.launcherex.gowidget.weather.systemwidget.l;
import com.gau.go.launcherex.gowidget.weather.systemwidget.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.j:
//            q, r, s, t, 
//            u, v, x, h, 
//            ab, y, w, ae, 
//            i, g, k, j

public abstract class p
{

    protected Context a;
    protected final List b = new ArrayList();
    protected com.gau.go.launcherex.gowidget.weather.systemwidget.e c;
    protected i d;
    protected e e;
    protected ab f;
    protected x g;
    protected g h;
    protected m i;
    private com.go.weatherex.j.h j;
    private final l k = new q(this);
    private final h l = new r(this);
    private ae m;
    private BroadcastReceiver n;
    private final IntentFilter o = new IntentFilter();
    private boolean p;
    private BroadcastReceiver q;
    private final com.go.weatherex.j.i r = new v(this);

    protected p(Context context)
    {
        m = new s(this);
        n = new t(this);
        p = false;
        q = new com.go.weatherex.j.u(this);
        a = context.getApplicationContext();
        g = new x(null);
        j = a(a);
        j.a(r);
        e = com.gau.go.launcherex.gowidget.language.e.a(a);
        c = com.gau.go.launcherex.gowidget.weather.systemwidget.e.a(a);
        c.a(l);
        d = com.gau.go.launcherex.gowidget.weather.systemwidget.i.a(a);
        d.a(k);
        f = new ab(a);
        f.a(m);
        h = new g(a);
        i = new m(a);
        context = new IntentFilter();
        context.addAction("android.intent.action.SCREEN_ON");
        context.addAction("android.intent.action.SCREEN_OFF");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE");
        a.registerReceiver(q, context);
        o.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        o.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED");
        o.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        o.addAction("android.intent.action.TIME_TICK");
        o.addAction("android.intent.action.TIME_SET");
        o.addAction("android.intent.action.DATE_CHANGED");
        o.addAction("android.intent.action.TIMEZONE_CHANGED");
        a(o);
        m();
    }

    private void a(Resources resources)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).onLanguageChanged(resources)) { }
    }

    private void a(com.go.weatherex.j.g g1, k k1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(g1, k1)) { }
    }

    private void a(j j1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(j1)) { }
    }

    static void a(p p1)
    {
        p1.u();
    }

    static void a(p p1, Resources resources)
    {
        p1.a(resources);
    }

    static void a(p p1, com.go.weatherex.j.g g1, k k1)
    {
        p1.a(g1, k1);
    }

    static void a(p p1, j j1)
    {
        p1.a(j1);
    }

    static void a(p p1, String s1, u u1)
    {
        p1.a(s1, u1);
    }

    static void a(p p1, ArrayList arraylist)
    {
        p1.a(arraylist);
    }

    static void a(p p1, boolean flag)
    {
        p1.a(flag);
    }

    private void a(String s1, u u1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(s1, u1)) { }
    }

    private void a(ArrayList arraylist)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(arraylist)) { }
    }

    private void a(boolean flag)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(flag)) { }
    }

    static void b(p p1)
    {
        p1.p();
    }

    static void c(p p1)
    {
        p1.q();
    }

    static void d(p p1)
    {
        p1.t();
    }

    static void e(p p1)
    {
        p1.s();
    }

    static void f(p p1)
    {
        p1.r();
    }

    private void m()
    {
        if (p)
        {
            return;
        } else
        {
            a.registerReceiver(n, o);
            p = true;
            return;
        }
    }

    private void n()
    {
        if (!p)
        {
            return;
        } else
        {
            a.unregisterReceiver(n);
            p = false;
            return;
        }
    }

    private void o()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a()) { }
    }

    private void p()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).b()) { }
    }

    private void q()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).c()) { }
    }

    private void r()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).d()) { }
    }

    private void s()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).e()) { }
    }

    private void t()
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).f()) { }
    }

    private void u()
    {
        o();
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 50);
        d().startService(intent);
    }

    protected abstract com.go.weatherex.j.h a(Context context);

    protected void a()
    {
        n();
    }

    protected final void a(int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(i1)) { }
    }

    protected final void a(int i1, int j1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(i1, j1)) { }
    }

    protected final void a(int i1, int j1, String s1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(i1, j1, s1)) { }
    }

    protected final void a(int i1, String s1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).a(i1, s1)) { }
    }

    protected abstract void a(Context context, Intent intent);

    protected abstract void a(IntentFilter intentfilter);

    public void a(com.go.weatherex.j.g g1)
    {
        f.a(g1);
    }

    public void a(y y1)
    {
        if (y1 == null)
        {
            return;
        }
        if (b.contains(y1))
        {
            throw new IllegalStateException((new StringBuilder()).append("did you forget to unregister WidgetServicerListener: ").append(y1).toString());
        } else
        {
            b.add(y1);
            return;
        }
    }

    protected void b()
    {
        m();
    }

    protected final void b(int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).b(i1)) { }
    }

    protected final void b(int i1, int j1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).b(i1, j1)) { }
    }

    protected final void b(int i1, int j1, String s1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).b(i1, j1, s1)) { }
    }

    public void b(y y1)
    {
        if (y1 == null)
        {
            return;
        } else
        {
            b.remove(y1);
            return;
        }
    }

    protected void c()
    {
        a.unregisterReceiver(q);
        n();
        h.b();
        j.a(null);
        b.clear();
        com.gau.go.launcherex.gowidget.weather.systemwidget.i.b();
        com.gau.go.launcherex.gowidget.weather.systemwidget.e.b();
        com.gau.go.launcherex.gowidget.language.e.f();
    }

    protected final void c(int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).c(i1)) { }
    }

    public Context d()
    {
        return a;
    }

    protected final void d(int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).d(i1)) { }
    }

    public com.go.weatherex.j.h e()
    {
        return j;
    }

    protected final void e(int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((y)iterator.next()).e(i1)) { }
    }

    public void f()
    {
        if (d.a)
        {
            k.a(d.a());
        }
    }

    public void g()
    {
        if (c.a)
        {
            l.a("", c.a());
        }
    }

    public void h()
    {
        if (g.a)
        {
            a(g.b);
            return;
        } else
        {
            (new w(this)).execute(new Void[0]);
            return;
        }
    }

    protected abstract boolean i();

    public g j()
    {
        return h;
    }

    public e k()
    {
        return e;
    }

    protected final void l()
    {
        if (d.a)
        {
            Object obj = d.a();
            int j1 = ((ArrayList) (obj)).size();
            if (j1 >= 1)
            {
                ArrayList arraylist = new ArrayList(j1);
                for (int i1 = 0; i1 < j1; i1++)
                {
                    WeatherBean weatherbean = (WeatherBean)((ArrayList) (obj)).get(i1);
                    RequestBean requestbean = new RequestBean();
                    requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
                    arraylist.add(requestbean);
                }

                obj = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
                ((Intent) (obj)).putExtra("notify_request", 22);
                ((Intent) (obj)).putParcelableArrayListExtra("req_arg", arraylist);
                a.startService(((Intent) (obj)));
                return;
            }
        }
    }
}
