// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.gtp.nextlauncher.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            d, e, f

public class c
{

    private Activity a;

    public c(Activity activity)
    {
        a = activity;
    }

    static void a(c c1)
    {
        c1.b();
    }

    private void a(String s)
    {
        c(s);
    }

    private void b()
    {
        int i = Integer.valueOf(w.f(a)).intValue();
        String s = a.getString(0x7f0804d4);
        String s1 = a.getString(0x7f0804d5);
        com.gtp.nextlauncher.a.a.a.a(a, i, 1, "market://details?id=com.gtp.nextlauncher&referrer=utm_source%3DGOWeather%26utm_medium%3DHyperlink%26utm_campaign%3DNextWeather", "market://details?id=com.gtp.nextlauncher.trial&referrer=utm_source%3DGOWeather%26utm_medium%3DHyperlink%26utm_campaign%3DNextWeather", s, s1);
    }

    private boolean b(String s)
    {
        boolean flag = false;
        boolean flag1 = true;
        PackageManager packagemanager = a.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getPackageInfo(s, 1).versionCode;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            i = 0;
        }
        if ("com.gtp.nextlauncher".equals(s))
        {
            if (i < 49)
            {
                flag = true;
            }
        } else
        {
            flag = flag1;
            if ("com.gtp.nextlauncher.trial".equals(s))
            {
                flag = flag1;
                if (i >= 13)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    private void c()
    {
        y y1 = new y(a);
        y1.a(0x7f0804d6);
        y1.b(0x7f0804d7);
        y1.c(0x7f0804d8);
        y1.a(new d(this));
        y1.a();
    }

    private void c(String s)
    {
        Intent intent;
        intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.putExtra("com.gtp.nextlauncher.intentaction.action", 2);
        intent.putExtra("com.gtp.nextlauncher.intentaction.package", a.getPackageName());
        int i = 100;
        int ai[] = a.getResources().getIntArray(0x7f0d001d);
        if (ai.length > 0)
        {
            i = ai[0];
        }
        intent.putExtra("com.gtp.nextlauncher.intentaction.widgettype", i);
        intent.setComponent(new ComponentName(s, "com.gtp.nextlauncher.LauncherActivity"));
        a.startActivity(intent);
_L1:
        return;
        s;
        b();
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
            return;
        }
          goto _L1
    }

    private void d()
    {
        y y1 = new y(a);
        y1.a(0x7f0804d9);
        y1.b(0x7f0804d9);
        y1.c(0x7f0804db);
        y1.a(new e(this));
        y1.a();
    }

    private void e()
    {
        y y1 = new y(a);
        y1.a(0x7f0804dc);
        y1.b(0x7f0804d7);
        y1.c(0x7f0804de);
        y1.a(new f(this));
        y1.a();
    }

    public void a()
    {
        String s = com.gtp.nextlauncher.a.a.a.a(a);
        if (TextUtils.isEmpty(s))
        {
            c();
            return;
        }
        if ("com.gtp.nextlauncher".equals(s))
        {
            if (b(s))
            {
                d();
                return;
            } else
            {
                a(s);
                return;
            }
        }
        if ("com.gtp.nextlauncher.trial".equals(s))
        {
            if (b(s))
            {
                e();
                return;
            } else
            {
                a(s);
                return;
            }
        } else
        {
            e();
            return;
        }
    }

    public boolean a(Activity activity)
    {
        boolean flag;
        if (activity != null && activity != a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a = activity;
        }
        return flag;
    }
}
