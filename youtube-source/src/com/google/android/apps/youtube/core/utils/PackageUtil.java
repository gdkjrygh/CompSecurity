// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            Util

public final class PackageUtil
{

    public static boolean a(Context context)
    {
        return a(context, "DOGFOOD") || a(context, "DEV");
    }

    private static boolean a(Context context, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return c(context).equals(s);
    }

    public static boolean b(Context context)
    {
        return a(context, "DEV");
    }

    public static String c(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        String s;
        try
        {
            s = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.google.android.apps.youtube.config.BuildType");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.a("Could not get metadata from application info for build type.", context);
            return "RELEASE";
        }
        context = s;
        if (s == null)
        {
            context = "RELEASE";
        }
        return context;
    }

    public static boolean d(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return context.getPackageManager().hasSystemFeature("com.google.android.tv");
    }

    public static boolean e(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        return d(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.television");
    }

    public static String f(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.b("could not retrieve application version name", context);
            return "Unknown";
        }
        return context;
    }

    public static int g(Context context)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        int k;
        try
        {
            k = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            L.b("could not retrieve application version code", context);
            return 0;
        }
        return k;
    }

    public static byte[] h(Context context)
    {
        return Util.a(j(context));
    }

    public static byte[] i(Context context)
    {
        return Util.b(j(context));
    }

    private static byte[] j(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            if (((PackageInfo) (context)).signatures.length != 1)
            {
                throw new IllegalPackageSignatureException(((PackageInfo) (context)).signatures.length);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Couldn't get package information.", context);
        }
        context = ((PackageInfo) (context)).signatures[0].toByteArray();
        return context;
    }

    private class IllegalPackageSignatureException extends Exception
    {

        public final int numberOfSignatures;

        public IllegalPackageSignatureException(int k)
        {
            numberOfSignatures = k;
        }
    }

}
