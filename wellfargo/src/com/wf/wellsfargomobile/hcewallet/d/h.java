// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.app.Activity;
import android.os.Bundle;

public class h
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static int a;
    private static int b;

    public h()
    {
    }

    public static boolean a()
    {
        return a > b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        b++;
    }

    public void onActivityResumed(Activity activity)
    {
        a++;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
