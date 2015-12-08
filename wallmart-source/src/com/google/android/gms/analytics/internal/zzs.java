// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzy

class zzs
    implements Logger
{

    private boolean zzKz;
    private int zzMQ;

    zzs()
    {
        zzMQ = 2;
    }

    public void error(Exception exception)
    {
    }

    public void error(String s)
    {
    }

    public int getLogLevel()
    {
        return zzMQ;
    }

    public void info(String s)
    {
    }

    public void setLogLevel(int i)
    {
        zzMQ = i;
        if (!zzKz)
        {
            Log.i((String)zzy.zzNa.get(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzy.zzNa.get()).append(" DEBUG").toString());
            zzKz = true;
        }
    }

    public void verbose(String s)
    {
    }

    public void warn(String s)
    {
    }
}
