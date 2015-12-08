// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzc

private class <init>
    implements Runnable
{

    final zzc zzUh;

    public void run()
    {
        zzUh.zzUg = false;
        long l = SystemClock.elapsedRealtime();
        boolean flag = zzUh.zzz(l);
        zzUh.zzQ(flag);
    }

    private (zzc zzc1)
    {
        zzUh = zzc1;
        super();
    }

    zzUh(zzc zzc1, zzUh zzuh)
    {
        this(zzc1);
    }
}
