// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import com.walmart.android.analytics.GoogleAnalytics;

public class WalmartUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler mDefaultHandler;

    public WalmartUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        mDefaultHandler = uncaughtexceptionhandler;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        GoogleAnalytics.trackUncaughtException(thread, throwable);
        mDefaultHandler.uncaughtException(thread, throwable);
    }
}
