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

    private boolean zzIz;
    private int zzKR;

    zzs()
    {
        zzKR = 2;
    }

    public void error(Exception exception)
    {
    }

    public void error(String s)
    {
    }

    public int getLogLevel()
    {
        return zzKR;
    }

    public void info(String s)
    {
    }

    public void setLogLevel(int i)
    {
        zzKR = i;
        if (!zzIz)
        {
            Log.i((String)zzy.zzLb.get(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzy.zzLb.get()).append(" DEBUG").toString());
            zzIz = true;
        }
    }

    public void verbose(String s)
    {
    }

    public void warn(String s)
    {
    }
}
