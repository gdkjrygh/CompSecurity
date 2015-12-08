// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzig, zzih, zzie

static final class zzII
    implements Runnable
{

    final zzie zzIG;
    final a zzIH;
    final zzih zzII;

    public void run()
    {
        try
        {
            zzIG.zzf(zzIH.zze(zzII.get()));
            return;
        }
        catch (CancellationException cancellationexception) { }
        catch (InterruptedException interruptedexception) { }
        catch (ExecutionException executionexception) { }
        zzIG.cancel(true);
    }

    a(zzie zzie1, a a, zzih zzih1)
    {
        zzIG = zzie1;
        zzIH = a;
        zzII = zzih1;
        super();
    }
}
