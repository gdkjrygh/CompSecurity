// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.IntentCompat;

public class NavUtils
{

    private static final NavUtilsImpl IMPL;
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";

    private NavUtils()
    {
    }

    public static Intent getParentActivityIntent(Activity activity)
    {
    /* block-local class not found */
    class NavUtilsImpl {}

        return IMPL.getParentActivityIntent(activity);
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        String s = getParentActivityName(context, componentname);
        if (s == null)
        {
            return null;
        }
        componentname = new ComponentName(componentname.getPackageName(), s);
        if (getParentActivityName(context, componentname) == null)
        {
            return IntentCompat.makeMainActivity(componentname);
        } else
        {
            return (new Intent()).setComponent(componentname);
        }
    }

    public static Intent getParentActivityIntent(Context context, Class class1)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        class1 = getParentActivityName(context, new ComponentName(context, class1));
        if (class1 == null)
        {
            return null;
        }
        class1 = new ComponentName(context, class1);
        if (getParentActivityName(context, class1) == null)
        {
            return IntentCompat.makeMainActivity(class1);
        } else
        {
            return (new Intent()).setComponent(class1);
        }
    }

    public static String getParentActivityName(Activity activity)
    {
        try
        {
            activity = getParentActivityName(((Context) (activity)), activity.getComponentName());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new IllegalArgumentException(activity);
        }
        return activity;
    }

    public static String getParentActivityName(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        componentname = context.getPackageManager().getActivityInfo(componentname, 128);
        return IMPL.getParentActivityName(context, componentname);
    }

    public static void navigateUpFromSameTask(Activity activity)
    {
        Intent intent = getParentActivityIntent(activity);
        if (intent == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Activity ").append(activity.getClass().getSimpleName()).append(" does not have a parent activity name specified.").append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ").append(" element in your manifest?)").toString());
        } else
        {
            navigateUpTo(activity, intent);
            return;
        }
    }

    public static void navigateUpTo(Activity activity, Intent intent)
    {
        IMPL.navigateUpTo(activity, intent);
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
        return IMPL.shouldUpRecreateTask(activity, intent);
    }

    static 
    {
    /* block-local class not found */
    class NavUtilsImplBase {}

    /* block-local class not found */
    class NavUtilsImplJB {}

        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new NavUtilsImplJB();
        } else
        {
            IMPL = new NavUtilsImplBase();
        }
    }
}
