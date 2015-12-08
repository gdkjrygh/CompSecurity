// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.goweather.goplay.a.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            ThemeDataHandler, q

public class a extends BroadcastReceiver
{

    final ThemeDataHandler a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = intent.getAction();
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USED_COUPON_ID".equals(obj)) goto _L4; else goto _L3
_L3:
        context = intent.getStringExtra("extra_used_coupon_id");
        if (TextUtils.isEmpty(context)) goto _L1; else goto _L5
_L5:
        int i;
        int j;
        j = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).size();
        i = 0;
_L8:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        if (!((a)com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).get(i)).a().equals(context)) goto _L7; else goto _L6
_L6:
        if (i != -1)
        {
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).remove(i);
            return;
        }
          goto _L1
_L7:
        i++;
          goto _L8
_L4:
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RECEIVE_THEME_COUPON_NOTIFICATION".equals(obj))
        {
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.b(a);
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE".equals(obj))
        {
            String s = intent.getStringExtra("extra_app_widget_theme_package");
            obj = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(1, s);
            intent = ((Intent) (obj));
            if (obj == null)
            {
                intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(2, s);
            }
            if (intent != null && a.a(intent))
            {
                q.d(context);
                com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 1);
                return;
            }
        } else
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE".equals(obj))
        {
            obj = intent.getStringExtra("extra_gowidget_theme_package");
            intent = ((Intent) (obj));
            if ("app_widget_theme_white".equals(obj))
            {
                intent = "go_widget_theme_white";
            }
            intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(2, intent);
            if (intent != null && a.a(intent))
            {
                q.d(context);
                com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 2);
                return;
            }
        } else
        {
label0:
            {
                if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE".equals(obj))
                {
                    break label0;
                }
                intent = intent.getStringExtra("extra_app_theme_package");
                if ("com.gtp.go.weather.phototheme".equals(intent) && com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(3, intent) == null)
                {
                    com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).f(c.a(ThemeDataHandler.d(a)));
                }
                intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(3, intent);
                if (intent != null && a.a(intent))
                {
                    q.d(context);
                    com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 3);
                    return;
                }
            }
        }
          goto _L1
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("extra_wallpaper_theme_package");
        intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(4, intent);
        if (intent == null || !a.a(intent)) goto _L1; else goto _L9
_L9:
        q.d(context);
        com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 3);
        return;
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED".equals(obj)) goto _L1; else goto _L10
_L10:
        com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a();
        ThemeDataHandler.e(a);
        return;
        i = -1;
          goto _L6
    }

    public (ThemeDataHandler themedatahandler)
    {
        a = themedatahandler;
        super();
    }
}
