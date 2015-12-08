// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.util.k;
import com.go.weatherex.f.b;
import com.gtp.a.a.b.c;

public class PackageChangeReceiver extends BroadcastReceiver
{

    public PackageChangeReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("android.intent.action.PACKAGE_ADDED")) goto _L2; else goto _L1
_L1:
        s = intent.getDataString().replace("package:", "");
        boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(s) && !flag)
        {
            c.a("LJL", (new StringBuilder()).append("------------ACTION_PACKAGE_ADDED------").append(System.currentTimeMillis()).toString());
            intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PACKAGE_ADDED");
            intent.putExtra("com.gau.go.launcherex.gowidget.weatherwidget.EXTRA_PACKAGE_CHANGE", s);
            context.sendBroadcast(intent);
            b.a(context, s);
        }
        intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_HIDE_THEME_ICON");
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            intent.setFlags(32);
        }
        context.sendBroadcast(intent);
_L4:
        return;
_L2:
        if (!s.equals("android.intent.action.PACKAGE_REMOVED"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getDataString().replace("package:", "");
        boolean flag1 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(s) && !flag1)
        {
            c.a("LJL", (new StringBuilder()).append("------------ACTION_PACKAGE_REMOVED------").append(System.currentTimeMillis()).toString());
            intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PACKAGE_REMOVED");
            intent.putExtra("com.gau.go.launcherex.gowidget.weatherwidget.EXTRA_PACKAGE_CHANGE", s);
            context.sendBroadcast(intent);
            intent = e.a(context);
            if (s.equals((new StringBuilder()).append("com.gau.go.weatherex.language.").append(intent.c()).toString()))
            {
                c.a("Language", "\u5F53\u524D\u6B63\u5728\u4F7F\u7528\u7684\u8BED\u8A00\u5305\u88AB\u5220\u9664");
                intent.a("default", "com.gau.go.launcherex.gowidget.weatherwidget");
            }
            k.a(context, s);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!s.equals("android.intent.action.PACKAGE_REPLACED")) goto _L4; else goto _L3
_L3:
        String s1 = intent.getDataString().replace("package:", "");
        boolean flag2 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!TextUtils.isEmpty(s1) && flag2)
        {
            intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PACKAGE_REPLACED");
            intent.putExtra("com.gau.go.launcherex.gowidget.weatherwidget.EXTRA_PACKAGE_CHANGE", s1);
            context.sendBroadcast(intent);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
