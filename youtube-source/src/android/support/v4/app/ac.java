// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.d;

// Referenced classes of package android.support.v4.app:
//            af, ae, ad

public final class ac
{

    private static final ad a;

    public static Intent a(Activity activity)
    {
        return a.a(activity);
    }

    public static Intent a(Context context, ComponentName componentname)
    {
        String s = b(context, componentname);
        if (s == null)
        {
            return null;
        }
        componentname = new ComponentName(componentname.getPackageName(), s);
        if (b(context, componentname) == null)
        {
            return d.a(componentname);
        } else
        {
            return (new Intent()).setComponent(componentname);
        }
    }

    public static boolean a(Activity activity, Intent intent)
    {
        return a.a(activity, intent);
    }

    public static String b(Activity activity)
    {
        try
        {
            activity = b(((Context) (activity)), activity.getComponentName());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new IllegalArgumentException(activity);
        }
        return activity;
    }

    public static String b(Context context, ComponentName componentname)
    {
        componentname = context.getPackageManager().getActivityInfo(componentname, 128);
        return a.a(context, componentname);
    }

    public static void b(Activity activity, Intent intent)
    {
        a.b(activity, intent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new af();
        } else
        {
            a = new ae();
        }
    }
}
