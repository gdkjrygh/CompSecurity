// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.gau.go.launcherex.gowidget.weather.util.r;

public class t
{

    public static void a(Context context, int i)
    {
        Log.i("wss", "GoWidgetToThemeSettingHandler_gotoThemeStore");
        r.a(context, false);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.gau.go.launcherex.gowidget.weatherwidget", "com.gau.go.launcherex.gowidget.weather.view.ThemeSettingActivity"));
        intent.setFlags(0x14000000);
        intent.putExtra("extra_theme_entrance", i);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void a(Context context, int i, int j)
    {
        Intent intent = new Intent();
        j;
        JVM INSTR tableswitch 1 5: default 44
    //                   1 71
    //                   2 132
    //                   3 138
    //                   4 144
    //                   5 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_150;
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("new widgetType\uFF1F").append(j).toString());
_L2:
        String s = "com.go.weatherex.themeconfig.GoWidget42ThemeConfigHomeActivity";
_L7:
        intent.setComponent(new ComponentName("com.gau.go.launcherex.gowidget.weatherwidget", s));
        intent.setFlags(0x14000000);
        intent.putExtra("gowidget_Id", i);
        intent.putExtra("extra_widget_type", j);
        intent.putExtra("extra_widget_config_entrance", 2);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_161;
_L3:
        s = "com.go.weatherex.themeconfig.GoWidget41ThemeConfigHomeActivity";
          goto _L7
_L4:
        s = "com.go.weatherex.themeconfig.GoWidget21ThemeConfigHomeActivity";
          goto _L7
_L5:
        s = "com.go.weatherex.themeconfig.GoWidgetDays42ThemeConfigHomeActivity";
          goto _L7
        s = "com.go.weatherex.themeconfig.GoWidgetDays41ThemeConfigHomeActivity";
          goto _L7
    }
}
