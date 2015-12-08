// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import com.walmartlabs.anivia.AniviaLog;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app:
//            WalmartApplication

private static class <init> extends AniviaLog
{

    public void debug(String s, String s1, Throwable throwable)
    {
        WLog.d(s, s1);
    }

    public void error(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(s, s1, throwable);
            return;
        } else
        {
            WLog.e(s, s1);
            return;
        }
    }

    public void info(String s, String s1, Throwable throwable)
    {
        WLog.i(s, s1);
    }

    public void verbose(String s, String s1, Throwable throwable)
    {
        WLog.v(s, s1);
    }

    public void warn(String s, String s1, Throwable throwable)
    {
        WLog.w(s, s1);
    }

    public void whatTheFox(String s, String s1, Throwable throwable)
    {
        error(s, s1, throwable);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
