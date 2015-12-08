// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.log;

import com.arubanetworks.meridian.internal.analytics.MeridianAnalytics;

// Referenced classes of package com.arubanetworks.meridian.log:
//            MeridianLogAdapter

public class AnalyticsCrashReporingLogAdapter
    implements MeridianLogAdapter
{

    public AnalyticsCrashReporingLogAdapter()
    {
    }

    public void d(String s, String s1, Throwable throwable)
    {
    }

    public void e(String s, String s1, Throwable throwable)
    {
        MeridianAnalytics.crash(s1, throwable);
    }

    public void i(String s, String s1, Throwable throwable)
    {
    }

    public void v(String s, String s1, Throwable throwable)
    {
    }

    public void w(String s, String s1, Throwable throwable)
    {
    }

    public void wtf(String s, String s1, Throwable throwable)
    {
        MeridianAnalytics.crash(s1, throwable);
    }
}
