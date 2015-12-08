// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            k, l

class n extends BroadcastReceiver
{

    final k a;

    private n(k k1)
    {
        a = k1;
        super();
    }

    n(k k1, l l)
    {
        this(k1);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        context = intent.getAction();
        if (!"android.intent.action.PACKAGE_REMOVED".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = intent.getDataString();
        if (!TextUtils.isEmpty(context))
        {
            context = context.replace("package:", "");
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            c.a("wallpaper", (new StringBuilder()).append("\u6709apk\u5305\u88AB\u5220\u9664,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u5220\u4E86\u5462?pkgName: ").append(context).append(", replacing:").append(flag).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.intent.action.PACKAGE_REPLACED".equals(context)) goto _L1; else goto _L3
_L3:
        c.a("wallpaper", "\u6709apk\u5305\u88AB\u66FF\u6362\u5B89\u88C5,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u66FF\u6362\u4E86\u5462?");
        context = intent.getDataString();
        if (!TextUtils.isEmpty(context))
        {
            context = context.replace("package:", "");
            boolean flag1 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            c.a("wallpaper", (new StringBuilder()).append("\u6709apk\u5305\u88AB\u66FF\u6362\u5B89\u88C5,\u662F\u4E0D\u662F\u6B63\u5728\u4F7F\u7528\u7684\u4E3B\u9898\u5305\u88AB\u66FF\u6362\u4E86\u5462?replacing\uFF1A").append(flag1).toString());
            if (flag1 && com.gau.go.launcherex.gowidget.weather.globaltheme.a.g(context, k.f(a)))
            {
                com.gau.go.launcherex.goweather.livewallpaper.k.a(a, context);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
