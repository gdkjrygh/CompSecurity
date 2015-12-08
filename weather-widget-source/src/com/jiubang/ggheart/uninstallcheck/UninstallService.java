// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.uninstallcheck;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Process;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.go.weatherex.i.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.ggheart.uninstallcheck:
//            UninstallCheck

public class UninstallService extends Service
{

    private static int a = 0;

    public UninstallService()
    {
    }

    private String a()
    {
        StringBuffer stringbuffer = new StringBuffer("http://goweatherex.3g.cn/goweatherexUninstall/weather/getUninstall");
        stringbuffer.append("?lang=");
        stringbuffer.append(w.j(this));
        stringbuffer.append("&versionName=");
        stringbuffer.append(w.c(this));
        return stringbuffer.toString();
    }

    public static void a(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        if (Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels) >= 480)
        {
            int i = com.jiubang.ggheart.uninstallcheck.UninstallCheck.a(context);
            if (i == 0)
            {
                context.startService(new Intent("com.jiubang.ggheart.uninstallcheck.UninstallService"));
                return;
            }
            if (i != -2)
            {
                c.a("myunistall_init", "check lock file locked");
                return;
            }
        }
    }

    public static void b(Context context)
    {
        if (com.go.weatherex.i.a.c(context, "com.jiubang.ggheart.uninstallcheck.UninstallService") && a != 0)
        {
            Process.killProcess(a);
        }
    }

    public IBinder onBind(Intent intent)
    {
        c.a("UninstallService", "UninstallService onBind");
        return null;
    }

    public void onCreate()
    {
        c.a("UninstallService", "UninstallService onCreate");
        c.a("UninstallService", getPackageCodePath());
        c.a("UninstallService", getPackageName());
        a = com.jiubang.ggheart.uninstallcheck.UninstallCheck.a(this, a());
        c.a("myunistall_init", (new StringBuilder()).append("pid = ").append(a).toString());
        super.onCreate();
    }

    public void onDestroy()
    {
        c.a("myunistall_init", "UninstallService.ondestory");
        super.onDestroy();
    }

    public void onStart(Intent intent, int i)
    {
        c.a("UninstallService", "UninstallService onStart");
        super.onStart(intent, i);
        stopSelf();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        c.a("UninstallService", "UninstallService onStartCommand");
        return super.onStartCommand(intent, i, j);
    }

}
