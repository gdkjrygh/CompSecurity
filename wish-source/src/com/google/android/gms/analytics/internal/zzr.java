// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzx

class zzr
    implements Logger
{

    private boolean zzEC;
    private int zzGV;

    zzr()
    {
        zzGV = 2;
    }

    public void error(String s)
    {
    }

    public int getLogLevel()
    {
        return zzGV;
    }

    public void setLogLevel(int i)
    {
        zzGV = i;
        if (!zzEC)
        {
            Log.i((String)zzx.zzHf.get(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzx.zzHf.get()).append(" DEBUG").toString());
            zzEC = true;
        }
    }

    public void warn(String s)
    {
    }
}
