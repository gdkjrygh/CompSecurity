// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzfv

public class zzfu
{
    public static interface zza
    {

        public abstract Object zzb(Object obj);
    }


    public static zzfv zza(zzfv zzfv1, zza zza1)
    {
        zzfs zzfs1 = new zzfs();
        zzfv1.zzb(new Runnable(zzfs1, zza1, zzfv1) {

            final zzfs zzCP;
            final zza zzCQ;
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

            
            {
                zzCP = zzfs1;
                zzCQ = zza1;
                zzCR = zzfv1;
                super();
            }
        });
        return zzfs1;
    }
}
