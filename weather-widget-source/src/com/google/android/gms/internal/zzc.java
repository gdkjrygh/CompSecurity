// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            zzs, zzb, zzk, zzi, 
//            zzn, zzm

public class zzc extends Thread
{

    private static final boolean DEBUG;
    private final BlockingQueue zzh;
    private final BlockingQueue zzi;
    private final zzb zzj;
    private final zzn zzk;
    private volatile boolean zzl;

    public zzc(BlockingQueue blockingqueue, BlockingQueue blockingqueue1, zzb zzb1, zzn zzn1)
    {
        zzl = false;
        zzh = blockingqueue;
        zzi = blockingqueue1;
        zzj = zzb1;
        zzk = zzn1;
    }

    static BlockingQueue zza(zzc zzc1)
    {
        return zzc1.zzi;
    }

    public void quit()
    {
        zzl = true;
        interrupt();
    }

    public void run()
    {
        if (DEBUG)
        {
            zzs.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        zzj.zza();
_L1:
        Object obj;
label0:
        {
            do
            {
                try
                {
                    do
                    {
                        obj = (zzk)zzh.take();
                        ((zzk) (obj)).zzc("cache-queue-take");
                        if (!((zzk) (obj)).isCanceled())
                        {
                            break label0;
                        }
                        ((zzk) (obj)).zzd("cache-discard-canceled");
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            } while (!zzl);
            return;
        }
        zzb.zza zza1 = zzj.zza(((zzk) (obj)).zzh());
        if (zza1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((zzk) (obj)).zzc("cache-miss");
        zzi.put(obj);
          goto _L1
label1:
        {
            if (!zza1.zzb())
            {
                break label1;
            }
            ((zzk) (obj)).zzc("cache-hit-expired");
            ((zzk) (obj)).zza(zza1);
            zzi.put(obj);
        }
          goto _L1
        zzm zzm1;
label2:
        {
            ((zzk) (obj)).zzc("cache-hit");
            zzm1 = ((zzk) (obj)).zza(new zzi(zza1.data, zza1.zzg));
            ((zzk) (obj)).zzc("cache-hit-parsed");
            if (zza1.zzc())
            {
                break label2;
            }
            zzk.zza(((zzk) (obj)), zzm1);
        }
          goto _L1
        ((zzk) (obj)).zzc("cache-hit-refresh-needed");
        ((zzk) (obj)).zza(zza1);
        zzm1.zzai = true;
        zzk.zza(((zzk) (obj)), zzm1, new Runnable(((zzk) (obj))) {

            final zzk zzm;
            final zzc zzn;

            public void run()
            {
                try
                {
                    zzc.zza(zzn).put(zzm);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    return;
                }
            }

            
            {
                zzn = zzc.this;
                zzm = zzk1;
                super();
            }
        });
          goto _L1
    }

    static 
    {
        DEBUG = zzs.DEBUG;
    }
}
