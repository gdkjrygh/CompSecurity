// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.c;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.jiubang.core.b.a;

// Referenced classes of package com.go.weatherex.ad.c:
//            d, f, c, a

public class e
    implements d
{

    private Activity a;
    private ConnectivityManager b;
    private SharedPreferences c;
    private c d;
    private int e;
    private boolean f;

    public e(Activity activity)
    {
        a = activity;
        b = (ConnectivityManager)activity.getSystemService("connectivity");
        c = GoWidgetApplication.c(a.getApplicationContext()).a();
        e = c.getInt("key_adid_enter_2", 1);
        d();
    }

    public static boolean a(Context context)
    {
        context = GoWidgetApplication.b(context.getApplicationContext());
        return context.a(2) || context.a(1) || context.a(32) || context.a(128);
    }

    private void d()
    {
        boolean flag;
        if (e() && !a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    private void e(c c1)
    {
        if (c1 == null)
        {
            d = new com.go.weatherex.ad.c.f(a);
            d.a(this);
            d.b();
        } else
        {
            if (c1 instanceof com.go.weatherex.ad.c.f)
            {
                d.e();
                d = new com.go.weatherex.ad.c.a(a);
                d.a(this);
                d.b();
                return;
            }
            if (c1 instanceof com.go.weatherex.ad.c.a)
            {
                return;
            }
        }
    }

    private boolean e()
    {
        NetworkInfo networkinfo = b.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            return networkinfo.isConnected();
        } else
        {
            return false;
        }
    }

    private void f()
    {
        e = e + 1;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putInt("key_adid_enter_2", e);
        editor.commit();
    }

    public void a()
    {
        if (f)
        {
            e(null);
        }
    }

    public void a(c c1)
    {
    }

    public void b(c c1)
    {
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (f)
        {
            Log.d("mjw", "This is no vip user");
            flag = flag1;
            if (d.c())
            {
                Log.d("mjw", "need load ad");
                d.d();
                flag = true;
            }
        }
        return flag;
    }

    public void c()
    {
        if (d != null)
        {
            d.e();
        }
    }

    public void c(c c1)
    {
        f();
    }

    public void d(c c1)
    {
        a.finish();
    }
}
