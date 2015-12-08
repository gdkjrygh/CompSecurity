// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzh;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk, zzfs, zzfc

static final class zzCo
    implements Runnable
{

    final Callable zzCo;
    final zzfs zzoJ;

    public void run()
    {
        try
        {
            Process.setThreadPriority(10);
            zzoJ.zzc(zzCo.call());
            return;
        }
        catch (Exception exception)
        {
            zzh.zzaT().zzc(exception, true);
        }
        zzoJ.cancel(true);
    }

    (zzfs zzfs1, Callable callable)
    {
        zzoJ = zzfs1;
        zzCo = callable;
        super();
    }
}
