// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.Uri;

public final class b
{

    private static final Uri a = Uri.parse("http://play.google.com/store/apps/details");

    public static Intent a(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    public static String a(int i)
    {
        return (new StringBuilder()).append(i / 1000).append(".").append((i % 1000) / 100).append(".").append(i % 100).toString();
    }

    public static String a(Context context)
    {
        Object obj = new Intent("com.google.android.youtube.api.service.START");
        context = context.getPackageManager();
        obj = context.resolveService(((Intent) (obj)), 0);
        if (obj != null && ((ResolveInfo) (obj)).serviceInfo != null && ((ResolveInfo) (obj)).serviceInfo.packageName != null)
        {
            return ((ResolveInfo) (obj)).serviceInfo.packageName;
        }
        if (context.hasSystemFeature("com.google.android.tv"))
        {
            return "com.google.android.youtube.googletv";
        } else
        {
            return "com.google.android.youtube";
        }
    }

    public static boolean a(Context context, String s)
    {
        Resources resources;
        try
        {
            resources = context.getPackageManager().getResourcesForApplication(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return true;
        }
        context = s;
        if (s.equals("com.google.android.youtube.googletvdev"))
        {
            context = "com.google.android.youtube.googletv";
        }
        for (int i = resources.getIdentifier("youtube_api_version_code", "integer", context); i == 0 || 1200 > resources.getInteger(i);)
        {
            return true;
        }

        return false;
    }

    public static boolean a(PackageManager packagemanager)
    {
        return packagemanager.hasSystemFeature("com.google.android.tv");
    }

    public static Context b(Context context)
    {
        try
        {
            context = context.createPackageContext(a(context), 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Intent b(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(a.buildUpon().appendQueryParameter("id", s).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static int c(Context context)
    {
label0:
        {
            Context context1 = b(context);
            int i = 0;
            if (context1 != null)
            {
                i = context1.getResources().getIdentifier("clientTheme", "style", a(context));
            }
            int j = i;
            if (i == 0)
            {
                if (android.os.Build.VERSION.SDK_INT < 14)
                {
                    break label0;
                }
                j = 0x1030128;
            }
            return j;
        }
        return android.os.Build.VERSION.SDK_INT < 11 ? 0x1030005 : 0x103006b;
    }

    public static String d(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", context);
        }
        return context;
    }

}
