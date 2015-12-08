// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.globalview.g;

// Referenced classes of package com.go.weatherex.home:
//            t, u, s

public class r
{

    private Activity a;
    private c b;
    private SharedPreferences c;

    public r()
    {
    }

    private void a()
    {
        (new Handler()).postDelayed(new t(this), 1000L);
    }

    static void a(r r1)
    {
        r1.a();
    }

    static void a(r r1, String s1)
    {
        r1.a(s1);
    }

    private void a(String s1)
    {
        s1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s1).toString()));
        try
        {
            s1.setPackage("com.android.vending");
            a.startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Toast.makeText(a, 0x7f0801df, 0).show();
        }
    }

    static c b(r r1)
    {
        return r1.b;
    }

    private boolean b()
    {
label0:
        {
            boolean flag;
            if (!c.getBoolean("key_open_dialog_boolean", true))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                long l = System.currentTimeMillis();
                long l1 = c.getLong("key_first_install_time", 0L);
                if (l < l1 || l1 == 0L)
                {
                    break label0;
                }
                android.content.SharedPreferences.Editor editor = c.edit();
                editor.putBoolean("key_open_dialog_boolean", true);
                editor.commit();
                if (!a.isFinishing())
                {
                    g g1 = new g(a);
                    g1.a(0x7f080535);
                    g1.b(0x7f0802e2);
                    g1.d(0x7f0802e3);
                    g1.c(0x7f0802e4);
                    g1.a(new u(this));
                    g1.a();
                    q.a(a.getApplicationContext()).a(new a(109, "f000"));
                }
            }
            return flag;
        }
        return false;
    }

    static Activity c(r r1)
    {
        return r1.a;
    }

    static boolean d(r r1)
    {
        return r1.b();
    }

    public void a(Activity activity)
    {
        a = null;
        c = null;
    }

    public void a(Activity activity, Bundle bundle)
    {
        a = activity;
        c = GoWidgetApplication.c(a.getApplicationContext()).a();
        b = com.gau.go.launcherex.gowidget.weather.c.c.a(activity.getApplicationContext());
        if (b.b())
        {
            a();
            return;
        } else
        {
            b.a(new s(this));
            return;
        }
    }
}
