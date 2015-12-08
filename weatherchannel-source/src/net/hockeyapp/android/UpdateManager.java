// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Date;
import net.hockeyapp.android.tasks.CheckUpdateTask;
import net.hockeyapp.android.tasks.CheckUpdateTaskWithUI;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.Util;

// Referenced classes of package net.hockeyapp.android:
//            UpdateManagerListener, ExpiryInfoActivity

public class UpdateManager
{

    private static UpdateManagerListener lastListener = null;
    private static CheckUpdateTask updateTask = null;

    public UpdateManager()
    {
    }

    private static boolean checkExpiryDate(WeakReference weakreference, UpdateManagerListener updatemanagerlistener)
    {
        boolean flag = false;
        boolean flag1 = checkExpiryDateForBackground(updatemanagerlistener);
        if (flag1)
        {
            flag = updatemanagerlistener.onBuildExpired();
        }
        if (flag1 && flag)
        {
            startExpiryInfoIntent(weakreference);
        }
        return flag1;
    }

    private static boolean checkExpiryDateForBackground(UpdateManagerListener updatemanagerlistener)
    {
label0:
        {
            boolean flag = false;
            if (updatemanagerlistener != null)
            {
                updatemanagerlistener = updatemanagerlistener.getExpiryDate();
                if (updatemanagerlistener == null || (new Date()).compareTo(updatemanagerlistener) <= 0)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    private static boolean dialogShown(WeakReference weakreference)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (weakreference != null)
        {
            weakreference = (Activity)weakreference.get();
            flag = flag1;
            if (weakreference != null)
            {
                flag = flag1;
                if (weakreference.getFragmentManager().findFragmentByTag("hockey_update_dialog") != null)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static UpdateManagerListener getLastListener()
    {
        return lastListener;
    }

    private static boolean installedFromMarket(WeakReference weakreference)
    {
label0:
        {
            boolean flag = false;
            weakreference = (Context)weakreference.get();
            if (weakreference != null)
            {
                try
                {
                    flag = TextUtils.isEmpty(weakreference.getPackageManager().getInstallerPackageName(weakreference.getPackageName()));
                }
                // Misplaced declaration of an exception variable
                catch (WeakReference weakreference)
                {
                    return false;
                }
                if (flag)
                {
                    break label0;
                }
                flag = true;
            }
            return flag;
        }
        return false;
    }

    public static void register(Activity activity, String s)
    {
        register(activity, s, true);
    }

    public static void register(Activity activity, String s, String s1, UpdateManagerListener updatemanagerlistener, boolean flag)
    {
        s1 = Util.sanitizeAppIdentifier(s1);
        lastListener = updatemanagerlistener;
        for (activity = new WeakReference(activity); Util.fragmentsSupported().booleanValue() && dialogShown(activity) || checkExpiryDate(activity, updatemanagerlistener) || (updatemanagerlistener == null || !updatemanagerlistener.canUpdateInMarket()) && installedFromMarket(activity);)
        {
            return;
        }

        startUpdateTask(activity, s, s1, updatemanagerlistener, flag);
    }

    public static void register(Activity activity, String s, UpdateManagerListener updatemanagerlistener, boolean flag)
    {
        register(activity, "https://sdk.hockeyapp.net/", s, updatemanagerlistener, flag);
    }

    public static void register(Activity activity, String s, boolean flag)
    {
        register(activity, s, null, flag);
    }

    public static void registerForBackground(Context context, String s, String s1, UpdateManagerListener updatemanagerlistener)
    {
        s1 = Util.sanitizeAppIdentifier(s1);
        lastListener = updatemanagerlistener;
        context = new WeakReference(context);
        if (!checkExpiryDateForBackground(updatemanagerlistener) && (updatemanagerlistener != null && updatemanagerlistener.canUpdateInMarket() || !installedFromMarket(context)))
        {
            startUpdateTaskForBackground(context, s, s1, updatemanagerlistener);
        }
    }

    public static void registerForBackground(Context context, String s, UpdateManagerListener updatemanagerlistener)
    {
        registerForBackground(context, "https://sdk.hockeyapp.net/", s, updatemanagerlistener);
    }

    private static void startExpiryInfoIntent(WeakReference weakreference)
    {
        if (weakreference != null)
        {
            weakreference = (Activity)weakreference.get();
            if (weakreference != null)
            {
                weakreference.finish();
                Intent intent = new Intent(weakreference, net/hockeyapp/android/ExpiryInfoActivity);
                intent.addFlags(0x14000000);
                weakreference.startActivity(intent);
            }
        }
    }

    private static void startUpdateTask(WeakReference weakreference, String s, String s1, UpdateManagerListener updatemanagerlistener, boolean flag)
    {
        if (updateTask == null || updateTask.getStatus() == android.os.AsyncTask.Status.FINISHED)
        {
            updateTask = new CheckUpdateTaskWithUI(weakreference, s, s1, updatemanagerlistener, flag);
            AsyncTaskUtils.execute(updateTask);
            return;
        } else
        {
            updateTask.attach(weakreference);
            return;
        }
    }

    private static void startUpdateTaskForBackground(WeakReference weakreference, String s, String s1, UpdateManagerListener updatemanagerlistener)
    {
        if (updateTask == null || updateTask.getStatus() == android.os.AsyncTask.Status.FINISHED)
        {
            updateTask = new CheckUpdateTask(weakreference, s, s1, updatemanagerlistener);
            AsyncTaskUtils.execute(updateTask);
            return;
        } else
        {
            updateTask.attach(weakreference);
            return;
        }
    }

    public static void unregister()
    {
        if (updateTask != null)
        {
            updateTask.cancel(true);
            updateTask.detach();
            updateTask = null;
        }
        lastListener = null;
    }

}
