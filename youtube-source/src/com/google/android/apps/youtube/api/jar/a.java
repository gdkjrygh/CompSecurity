// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ComponentName;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.youtube.common.fromguava.c;

public final class a
{

    private final Activity a;

    public a(Activity activity)
    {
        a = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
    }

    public final ActionBar a()
    {
        return a.getActionBar();
    }

    public final void a(int i)
    {
        a.setRequestedOrientation(i);
    }

    public final ComponentName b()
    {
        return a.getComponentName();
    }

    public final int c()
    {
        return a.getRequestedOrientation();
    }

    public final Window d()
    {
        return a.getWindow();
    }

    public final WindowManager e()
    {
        return a.getWindowManager();
    }

    public final void f()
    {
        a.onBackPressed();
    }
}
