// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.b;

import android.app.KeyguardManager;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.gau.go.launcherex.gowidget.weather.view.AppInSDPromptActivity;

public abstract class h
{

    public static boolean a(Context context)
    {
        boolean flag1 = false;
        Object obj = WallpaperManager.getInstance(context);
        boolean flag = flag1;
        if (obj != null)
        {
            obj = ((WallpaperManager) (obj)).getWallpaperInfo();
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (context.getPackageName().equals(((WallpaperInfo) (obj)).getPackageName()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void b(Context context)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/view/AppInSDPromptActivity);
        intent.putExtra("app_in_sd_prompt_tips_type", 2);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public static boolean c(Context context)
    {
        boolean flag = false;
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getApplicationInfo(context.getPackageName(), 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if ((i & 0x40000) != 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean d(Context context)
    {
        context = (KeyguardManager)context.getSystemService("keyguard");
        return context != null && context.inKeyguardRestrictedInputMode();
    }
}
