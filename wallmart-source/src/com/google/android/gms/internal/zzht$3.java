// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzht, zzie, zzhl

static final class zzHB
    implements Runnable
{

    final Callable zzHB;
    final zzie zzrp;

    public void run()
    {
        try
        {
            Process.setThreadPriority(10);
            zzrp.zzf(zzHB.call());
            return;
        }
        catch (Exception exception)
        {
            zzp.zzbA().zzc(exception, true);
        }
        zzrp.cancel(true);
    }

    (zzie zzie1, Callable callable)
    {
        zzrp = zzie1;
        zzHB = callable;
        super();
    }
}
