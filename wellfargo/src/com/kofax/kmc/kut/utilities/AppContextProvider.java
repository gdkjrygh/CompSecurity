// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import android.app.Application;
import android.content.Context;

public class AppContextProvider extends Application
{

    private static Context a = null;

    public AppContextProvider()
    {
    }

    public static Context getContext()
    {
        return a;
    }

    public static void setContext(Context context)
    {
        a = context;
    }

    public void onCreate()
    {
        super.onCreate();
        a = getApplicationContext();
    }

}
