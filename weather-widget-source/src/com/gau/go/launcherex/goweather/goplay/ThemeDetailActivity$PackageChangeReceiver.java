// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jiubang.playsdk.a.a;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            ThemeDetailActivity

public class a extends BroadcastReceiver
{

    final ThemeDetailActivity a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED"))
        {
            context = intent.getDataString();
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if (context != null && !flag)
            {
                context = context.replace("package:", "");
                if ((ThemeDetailActivity.b(a) instanceof a) && com.gau.go.launcherex.goweather.goplay.ThemeDetailActivity.a(a, (a)ThemeDetailActivity.b(a)).equals(context))
                {
                    a.finish();
                }
            }
        }
    }

    public (ThemeDetailActivity themedetailactivity)
    {
        a = themedetailactivity;
        super();
    }
}
