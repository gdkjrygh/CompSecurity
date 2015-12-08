// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.testapk;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.client.bc;
import java.util.Iterator;
import java.util.List;

public final class ApiApplication extends BaseApplication
{

    public ApiApplication()
    {
    }

    protected final boolean a()
    {
        Object obj1 = (ActivityManager)getSystemService("activity");
        int i = Process.myPid();
        Object obj = new Intent("com.google.android.youtube.api.service.START");
        ((Intent) (obj)).setPackage(getApplicationInfo().packageName);
        obj = getPackageManager().resolveService(((Intent) (obj)), 0);
        if (((ResolveInfo) (obj)).serviceInfo != null)
        {
            obj = ((ResolveInfo) (obj)).serviceInfo.processName;
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return true;
        }
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses();
        if (obj1 == null || getApplicationInfo().processName.equals(obj))
        {
            return true;
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
            if (runningappprocessinfo.pid == i)
            {
                return !runningappprocessinfo.processName.equals(obj);
            }
        }

        return true;
    }

    protected final a b()
    {
        throw new RuntimeException("The API failed to initialize. Please report this to us!");
    }

    protected final void c()
    {
        throw new RuntimeException("The API failed to initialize. Please report this to us!");
    }

    public final bc f()
    {
        return null;
    }
}
