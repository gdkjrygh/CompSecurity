// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu, zzhv, zzhs

static final class zzGP
    implements Runnable
{

    final zzhs zzGN;
    final a zzGO;
    final zzhv zzGP;

    public void run()
    {
        try
        {
            zzGN.zzf(zzGO.zze(zzGP.get()));
            return;
        }
        catch (CancellationException cancellationexception) { }
        catch (InterruptedException interruptedexception) { }
        catch (ExecutionException executionexception) { }
        zzGN.cancel(true);
    }

    a(zzhs zzhs1, a a, zzhv zzhv1)
    {
        zzGN = zzhs1;
        zzGO = a;
        zzGP = zzhv1;
        super();
    }
}
