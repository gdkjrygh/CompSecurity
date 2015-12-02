// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;

public class asw
{

    public static AsyncTask a(AsyncTask asynctask, Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
        } else
        {
            return asynctask.execute(aobj);
        }
    }
}
