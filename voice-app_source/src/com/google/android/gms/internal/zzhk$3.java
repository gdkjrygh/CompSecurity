// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzo;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzhk, zzhs, zzhc

static final class zzGh
    implements Runnable
{

    final Callable zzGh;
    final zzhs zzqX;

    public void run()
    {
        try
        {
            Process.setThreadPriority(10);
            zzqX.zzf(zzGh.call());
            return;
        }
        catch (Exception exception)
        {
            zzo.zzby().zzc(exception, true);
        }
        zzqX.cancel(true);
    }

    (zzhs zzhs1, Callable callable)
    {
        zzqX = zzhs1;
        zzGh = callable;
        super();
    }
}
