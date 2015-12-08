// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.download.b;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.jiubang.core.b.a;
import java.util.Iterator;
import java.util.List;

public class k
{

    public static void a(Context context, int i)
    {
        if (w.p(context))
        {
            b(context);
            return;
        } else
        {
            b(context, i);
            return;
        }
    }

    public static void a(Context context, String s)
    {
        if (s.equals("com.gau.go.launcherex") || s.equals("com.gau.go.launcherex.zh"))
        {
            context = GoWidgetApplication.c(context).a();
            if (context.getBoolean("key_rec_golauncher_has_recommended", false))
            {
                context = context.edit();
                context.putBoolean("key_rec_golauncher_uninstalled", true);
                context.commit();
            }
        }
    }

    public static boolean a(Context context)
    {
        while (b(context, "com.go.launcherpad") || b(context, "com.gau.go.launcherex") || b(context, "com.gau.go.launcherex.zh")) 
        {
            return true;
        }
        return false;
    }

    private static void b(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.gau.go.launcherex.zh"));
        intent.setPackage("com.android.vending");
        intent.setFlags(0x10000000);
        try
        {
            context.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            c(context, "https://play.google.com/store/apps/details?id=com.gau.go.launcherex&referrer=utm_source%3DGOWeatherEX_GOwidgetRecommend%26utm_medium%3DHyperlink%26utm_campaign%3DGOWeatherEX_GOwidgetRecommend");
        }
    }

    private static void b(Context context, int i)
    {
        Object obj;
        if (i == 1)
        {
            obj = Uri.parse("market://details?id=com.gau.go.launcherex&referrer=utm_source%3DGOWeatherEX_GOwidgetRecommend%26utm_medium%3DHyperlink%26utm_campaign%3DGOWeatherEX_GOwidgetRecommend");
        } else
        if (i == 3)
        {
            obj = Uri.parse("market://details?id=com.gau.go.launcherex&referrer=utm_source%3DGOweatherGIF%26utm_medium%3Dbanner%26utm_campaign%3DGOAPP");
        } else
        {
            obj = Uri.parse("market://details?id=com.gau.go.launcherex&referrer=utm_source%3DGOweatherFullScreen%26utm_medium%3Dbanner%26utm_campaign%3DGOAPP");
        }
        obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        ((Intent) (obj)).setPackage("com.android.vending");
        ((Intent) (obj)).setFlags(0x10000000);
        try
        {
            context.startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            c(context, "https://play.google.com/store/apps/details?id=com.gau.go.launcherex&referrer=utm_source%3DGOWeatherEX_GOwidgetRecommend%26utm_medium%3DHyperlink%26utm_campaign%3DGOWeatherEX_GOwidgetRecommend");
        }
    }

    private static boolean b(Context context, String s)
    {
        context = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        for (context = context.queryIntentActivities(intent, 0).iterator(); context.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)context.next();
            if (resolveinfo != null && resolveinfo.activityInfo != null && resolveinfo.activityInfo.packageName != null && resolveinfo.activityInfo.name != null && resolveinfo.activityInfo.packageName.startsWith(s))
            {
                return true;
            }
        }

        return false;
    }

    private static void c(Context context, String s)
    {
        String s1;
        if (s.length() > 2)
        {
            s1 = s.substring(s.lastIndexOf("/") + 1);
        } else
        {
            s1 = s;
        }
        com.gau.go.launcherex.gowidget.download.b.a(context.getApplicationContext(), s1, s, 1L, context.getPackageName());
    }
}
