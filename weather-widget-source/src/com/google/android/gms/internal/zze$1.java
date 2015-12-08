// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            zze

class zzt
    implements Executor
{

    final Handler zzt;
    final zze zzu;

    public void execute(Runnable runnable)
    {
        zzt.post(runnable);
    }

    (zze zze1, Handler handler)
    {
        zzu = zze1;
        zzt = handler;
        super();
    }
}
