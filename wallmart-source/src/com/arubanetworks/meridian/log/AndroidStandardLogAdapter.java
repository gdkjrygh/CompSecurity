// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.log;

import android.util.Log;

// Referenced classes of package com.arubanetworks.meridian.log:
//            MeridianLogAdapter

public class AndroidStandardLogAdapter
    implements MeridianLogAdapter
{

    public AndroidStandardLogAdapter()
    {
    }

    public void d(String s, String s1, Throwable throwable)
    {
        Log.d(s, s1);
    }

    public void e(String s, String s1, Throwable throwable)
    {
        Log.e(s, s1);
    }

    public void i(String s, String s1, Throwable throwable)
    {
        Log.i(s, s1);
    }

    public void v(String s, String s1, Throwable throwable)
    {
        Log.v(s, s1);
    }

    public void w(String s, String s1, Throwable throwable)
    {
        Log.w(s, s1);
    }

    public void wtf(String s, String s1, Throwable throwable)
    {
        Log.wtf(s, s1);
    }
}
