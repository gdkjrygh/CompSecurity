// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzie, zzih

public class zzig
{
    public static interface zza
    {

        public abstract Object zze(Object obj);
    }


    public static zzih zza(zzih zzih1, zza zza1)
    {
        zzie zzie1 = new zzie();
        zzih1.zzc(new Runnable(zzie1, zza1, zzih1) {

            final zzie zzIG;
            final zza zzIH;
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

            
            {
                zzIG = zzie1;
                zzIH = zza1;
                zzII = zzih1;
                super();
            }
        });
        return zzie1;
    }
}
