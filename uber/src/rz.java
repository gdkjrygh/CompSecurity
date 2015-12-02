// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import java.util.Iterator;
import java.util.List;

public final class rz
{

    public static boolean a = false;
    public static boolean b = false;
    private static int c = -1;
    private static final Object d = new Object();
    private static String e = null;
    private static Integer f = null;

    private rz()
    {
    }

    public static int a(Context context)
    {
        Object obj;
        PackageManager packagemanager;
        packagemanager = context.getPackageManager();
        if (!uz.a)
        {
            try
            {
                context.getResources().getString(kf.common_google_play_services_unknown_issue);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            }
        }
        if (!uz.a && !"com.google.android.gms".equals(context.getPackageName()))
        {
            f(context);
        }
        try
        {
            obj = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        aab.a();
        if (all.b(((PackageInfo) (obj)).versionCode) || all.a(context))
        {
            if (aab.a(((PackageInfo) (obj)), yo.a) == null)
            {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_224;
        }
        Object obj1;
        try
        {
            obj1 = aab.a(packagemanager.getPackageInfo("com.android.vending", 64), yo.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (a(context, "com.android.vending"))
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                if (aab.a(((PackageInfo) (obj)), yo.a) == null)
                {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else
            {
                Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                return 9;
            }
            break MISSING_BLOCK_LABEL_224;
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
        return 9;
        if (aab.a(((PackageInfo) (obj)), new xj[] {
    obj1
}) != null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
        return 9;
        int i = all.a(0x6fcd18);
        if (all.a(((PackageInfo) (obj)).versionCode) < i)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder("Google Play services out of date.  Requires 7327000 but found ")).append(((PackageInfo) (obj)).versionCode).toString());
            return 2;
        }
        obj = ((PackageInfo) (obj)).applicationInfo;
        context = ((Context) (obj));
        if (obj == null)
        {
            try
            {
                context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                context.printStackTrace();
                return 1;
            }
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static Dialog a(int i, Activity activity)
    {
        return a(i, activity, 1001, null);
    }

    public static Dialog a(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(i, activity, null, j, oncancellistener);
    }

    private static Dialog a(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        android.app.AlertDialog.Builder builder1 = null;
        if (i == 0)
        {
            return null;
        }
        int k = i;
        if (all.a(activity))
        {
            k = i;
            if (i == 2)
            {
                k = 42;
            }
        }
        android.app.AlertDialog.Builder builder = builder1;
        if (alv.c())
        {
            TypedValue typedvalue = new TypedValue();
            activity.getTheme().resolveAttribute(0x1010309, typedvalue, true);
            builder = builder1;
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedvalue.resourceId)))
            {
                builder = new android.app.AlertDialog.Builder(activity, 5);
            }
        }
        builder1 = builder;
        if (builder == null)
        {
            builder1 = new android.app.AlertDialog.Builder(activity);
        }
        builder1.setMessage(vc.b(activity, k));
        if (oncancellistener != null)
        {
            builder1.setOnCancelListener(oncancellistener);
        }
        oncancellistener = a(k);
        if (fragment == null)
        {
            fragment = new vd(activity, oncancellistener, j);
        } else
        {
            fragment = new vd(fragment, oncancellistener, j);
        }
        oncancellistener = vc.c(activity, k);
        if (oncancellistener != null)
        {
            builder1.setPositiveButton(oncancellistener, fragment);
        }
        activity = vc.a(activity, k);
        if (activity != null)
        {
            builder1.setTitle(activity);
        }
        return builder1.create();
    }

    public static Intent a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 18: // '\022'
            return vv.b("com.google.android.gms");

        case 42: // '*'
            return vv.a();

        case 3: // '\003'
            return vv.a("com.google.android.gms");
        }
    }

    private static boolean a()
    {
        if (a)
        {
            return b;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

    public static boolean a(int i, Activity activity, Fragment fragment, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        fragment = a(i, activity, fragment, 2, oncancellistener);
        if (fragment == null)
        {
            return false;
        }
        if (activity instanceof FragmentActivity)
        {
            activity = ((FragmentActivity)activity).getSupportFragmentManager();
            sa.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        if (alv.a())
        {
            activity = activity.getFragmentManager();
            rv.a(fragment, oncancellistener).show(activity, "GooglePlayServicesErrorDialog");
        } else
        {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean a(Context context, int i)
    {
        return a(context, i, "com.google.android.gms") && a(context.getPackageManager(), "com.google.android.gms");
    }

    private static boolean a(Context context, int i, String s)
    {
label0:
        {
            {
                boolean flag1 = false;
                if (!alv.f())
                {
                    break label0;
                }
                context = (AppOpsManager)context.getSystemService("appops");
                boolean flag;
                try
                {
                    context.checkPackage(i, s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
            return flag;
        }
        context = context.getPackageManager().getPackagesForUid(i);
        flag = flag1;
        if (context == null)
        {
            continue;
        }
        i = 0;
        do
        {
            flag = flag1;
            if (i >= context.length)
            {
                continue;
            }
            if (s.equals(context[i]))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_28;
_L1:
    }

    private static boolean a(Context context, String s)
    {
        if (alv.h())
        {
            context = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_76;
                }
            } while (!s.equals(((android.content.pm.PackageInstaller.SessionInfo)context.next()).getAppPackageName()));
            return true;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo(s, 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_76;
        context;
        return false;
    }

    public static boolean a(PackageManager packagemanager)
    {
        return b(packagemanager) || !a();
    }

    private static boolean a(PackageManager packagemanager, String s)
    {
        aab.a();
        return aab.a(packagemanager, s);
    }

    public static void b(Context context)
    {
        int i = a(context);
        if (i != 0)
        {
            context = a(i);
            Log.e("GooglePlayServicesUtil", (new StringBuilder("GooglePlayServices not available due to error ")).append(i).toString());
            if (context == null)
            {
                throw new rx(i);
            } else
            {
                throw new ry(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    public static boolean b(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
            return true;
        }
    }

    public static boolean b(Context context, int i)
    {
        if (i == 18)
        {
            return true;
        }
        if (i == 1)
        {
            return a(context, "com.google.android.gms");
        } else
        {
            return false;
        }
    }

    private static boolean b(PackageManager packagemanager)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int i = c;
        if (i != -1) goto _L2; else goto _L1
_L1:
        packagemanager = packagemanager.getPackageInfo("com.google.android.gms", 64);
        aab.a();
        if (aab.a(packagemanager, new xj[] {
            xi.b[1]
        }) == null) goto _L4; else goto _L3
_L3:
        c = 1;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return c != 0;
_L4:
        c = 0;
          goto _L2
        packagemanager;
        c = 0;
          goto _L2
        packagemanager;
        obj;
        JVM INSTR monitorexit ;
        throw packagemanager;
    }

    public static void c(Context context)
    {
        try
        {
            ((NotificationManager)context.getSystemService("notification")).cancel(10436);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static Resources d(Context context)
    {
        try
        {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Context e(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    private static void f(Context context)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e != null) goto _L2; else goto _L1
_L1:
        e = context.getPackageName();
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        if (context == null) goto _L4; else goto _L3
_L3:
        f = Integer.valueOf(context.getInt("com.google.android.gms.version"));
_L5:
        context = f;
        obj;
        JVM INSTR monitorexit ;
        if (context == null)
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        break MISSING_BLOCK_LABEL_160;
_L4:
        f = null;
          goto _L5
        context;
        Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
          goto _L5
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L2:
        if (e.equals(context.getPackageName())) goto _L5; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '")).append(e).append("' and this call used package '").append(context.getPackageName()).append("'.").toString());
        if (context.intValue() != 0x6fcd18)
        {
            throw new IllegalStateException((new StringBuilder("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 7327000 but found ")).append(context).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />").toString());
        } else
        {
            return;
        }
    }

}
