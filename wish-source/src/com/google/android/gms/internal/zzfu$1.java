// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfu, zzfv, zzfs

static final class zzCR
    implements Runnable
{

    final zzfs zzCP;
    final a zzCQ;
    final zzfv zzCR;

    public void run()
    {
        try
        {
            zzCP.zzc(zzCQ.zzb(zzCR.get()));
            return;
        }
        catch (CancellationException cancellationexception) { }
        catch (InterruptedException interruptedexception) { }
        catch (ExecutionException executionexception) { }
        zzCP.cancel(true);
    }

    a(zzfs zzfs1, a a, zzfv zzfv1)
    {
        zzCP = zzfs1;
        zzCQ = a;
        zzCR = zzfv1;
        super();
    }
}
