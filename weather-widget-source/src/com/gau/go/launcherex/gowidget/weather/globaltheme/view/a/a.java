// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.view.View;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            b

public abstract class a
    implements com.go.weatherex.framework.a.a
{

    protected Activity a;
    protected com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected final h f = new h();
    private com.go.weatherex.framework.a.a g;

    public a(Activity activity)
    {
        c = true;
        d = true;
        e = true;
        if (activity == null)
        {
            throw new IllegalArgumentException("com.gau.go.launcherex.gowidget.weather.globaltheme.view.action.ActionHelper.ActionHelper(Activity act) : act can't be null ");
        }
        a = activity;
        if (activity instanceof com.go.weatherex.framework.a.a)
        {
            g = (com.go.weatherex.framework.a.a)activity;
        }
        f.a(1500L);
    }

    public Intent a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        return a.getApplicationContext().registerReceiver(broadcastreceiver, intentfilter);
    }

    public Typeface a(Context context, int i, int j)
    {
        if (g != null)
        {
            return g.a(context, i, j);
        } else
        {
            return null;
        }
    }

    public abstract void a();

    public void a(BroadcastReceiver broadcastreceiver)
    {
        a.getApplicationContext().unregisterReceiver(broadcastreceiver);
    }

    public void a(View view, int i, int j)
    {
        if (g != null)
        {
            g.a(view, i, j);
        }
    }

    public void a(View view, int i, boolean flag)
    {
        if (g != null)
        {
            g.a(view, i, flag);
        }
    }

    public abstract void a(b b1);

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b b1)
    {
        b = b1;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a(Activity activity)
    {
        if (activity == null || a == activity)
        {
            return false;
        } else
        {
            a = activity;
            return true;
        }
    }

    public abstract void b();

    public void b(boolean flag)
    {
        d = flag;
    }
}
