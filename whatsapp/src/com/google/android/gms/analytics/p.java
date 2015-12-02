// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.util.Log;

// Referenced classes of package com.google.android.gms.analytics:
//            Logger

class p
    implements Logger
{

    private int yM;

    p()
    {
        yM = 2;
    }

    private String af(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(String s)
    {
        if (yM <= 3)
        {
            Log.e("GAV4", af(s));
        }
    }

    public void verbose(String s)
    {
        if (yM <= 0)
        {
            Log.v("GAV4", af(s));
        }
    }
}
