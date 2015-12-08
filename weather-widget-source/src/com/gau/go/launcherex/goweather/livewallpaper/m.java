// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.gau.go.launcherex.goweather.livewallpaper.a.c;
import com.gau.go.launcherex.goweather.livewallpaper.b.f;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            k

class m extends BroadcastReceiver
{

    final k a;

    m(k k1)
    {
        a = k1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        if (!k.a(a))
        {
            context = intent.getAction();
            if (context.equals("android.intent.action.MEDIA_SCANNER_FINISHED"))
            {
                k.a(a, 1);
                k.k(a);
            } else
            if (context.equals("android.intent.action.MEDIA_UNMOUNTED"))
            {
                context = com.gau.go.launcherex.goweather.livewallpaper.k.f(a).getPackageManager();
                try
                {
                    context.getApplicationInfo(k.d(a).e(), 0);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                    flag = true;
                }
                if (flag)
                {
                    k.l(a).a(com.gau.go.launcherex.goweather.livewallpaper.k.f(a).getPackageName());
                    return;
                }
            }
        }
    }
}
