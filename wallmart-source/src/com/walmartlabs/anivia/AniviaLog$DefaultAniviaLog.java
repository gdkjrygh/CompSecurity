// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import android.util.Log;

// Referenced classes of package com.walmartlabs.anivia:
//            AniviaLog

public static class  extends AniviaLog
{

    public void debug(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.d(s, s1, throwable);
            return;
        } else
        {
            Log.d(s, s1);
            return;
        }
    }

    public void error(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.e(s, s1, throwable);
            return;
        } else
        {
            Log.e(s, s1);
            return;
        }
    }

    public void info(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.i(s, s1, throwable);
            return;
        } else
        {
            Log.i(s, s1);
            return;
        }
    }

    public void verbose(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.v(s, s1, throwable);
            return;
        } else
        {
            Log.v(s, s1);
            return;
        }
    }

    public void warn(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.w(s, s1, throwable);
            return;
        } else
        {
            Log.w(s, s1);
            return;
        }
    }

    public void whatTheFox(String s, String s1, Throwable throwable)
    {
        if (throwable != null)
        {
            Log.wtf(s, s1, throwable);
            return;
        } else
        {
            Log.wtf(s, s1);
            return;
        }
    }

    public ()
    {
    }
}
