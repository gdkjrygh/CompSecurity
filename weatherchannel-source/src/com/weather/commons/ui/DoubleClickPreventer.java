// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.os.SystemClock;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class DoubleClickPreventer
{

    private static final long MINIMUM_MILLISECONDS_BETWEEN_CLICKS = 1000L;
    private static final String TAG = "DoubleClickPreventer";
    private long lastClickedTime;

    public DoubleClickPreventer()
    {
        lastClickedTime = -1000L;
    }

    public boolean recordClick()
    {
        boolean flag = false;
        long l = SystemClock.elapsedRealtime() - lastClickedTime;
        long l1 = lastClickedTime;
        if (l >= 1000L)
        {
            flag = true;
            lastClickedTime = SystemClock.elapsedRealtime();
        }
        LogUtil.d("DoubleClickPreventer", LoggingMetaTags.TWC_GENERAL, "this=%s, thread=%s, elapsed=%s, MIN=%s, valid=%s, lastClickedTime was=%s", new Object[] {
            this, Thread.currentThread().getName(), Long.valueOf(l), Long.valueOf(1000L), Boolean.valueOf(flag), Long.valueOf(l1)
        });
        return flag;
    }
}
