// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            zze, zzg, zzc, zzk, 
//            zzs, zzb, zzn, zzf

public class zzl
{
    public static interface zza
    {

        public abstract void zzg(zzk zzk1);
    }


    private AtomicInteger zzY;
    private final Map zzZ;
    private final Set zzaa;
    private final PriorityBlockingQueue zzab;
    private final PriorityBlockingQueue zzac;
    private zzg zzad[];
    private zzc zzae;
    private List zzaf;
    private final zzb zzj;
    private final zzn zzk;
    private final zzf zzz;

    public zzl(zzb zzb, zzf zzf1)
    {
        this(zzb, zzf1, 4);
    }

    public zzl(zzb zzb, zzf zzf1, int i)
    {
        this(zzb, zzf1, i, ((zzn) (new zze(new Handler(Looper.getMainLooper())))));
    }

    public zzl(zzb zzb, zzf zzf1, int i, zzn zzn)
    {
        zzY = new AtomicInteger();
        zzZ = new HashMap();
        zzaa = new HashSet();
        zzab = new PriorityBlockingQueue();
        zzac = new PriorityBlockingQueue();
        zzaf = new ArrayList();
        zzj = zzb;
        zzz = zzf1;
        zzad = new zzg[i];
        zzk = zzn;
    }

    public int getSequenceNumber()
    {
        return zzY.incrementAndGet();
    }

    public void start()
    {
        stop();
        zzae = new zzc(zzab, zzac, zzj, zzk);
        zzae.start();
        for (int i = 0; i < zzad.length; i++)
        {
            zzg zzg1 = new zzg(zzac, zzz, zzj, zzk);
            zzad[i] = zzg1;
            zzg1.start();
        }

    }

    public void stop()
    {
        if (zzae != null)
        {
            zzae.quit();
        }
        for (int i = 0; i < zzad.length; i++)
        {
            if (zzad[i] != null)
            {
                zzad[i].quit();
            }
        }

    }

    public zzk zze(zzk zzk1)
    {
        zzk1.zza(this);
        synchronized (zzaa)
        {
            zzaa.add(zzk1);
        }
        zzk1.zza(getSequenceNumber());
        zzk1.zzc("add-to-queue");
        if (!zzk1.zzr())
        {
            zzac.add(zzk1);
            return zzk1;
        }
        break MISSING_BLOCK_LABEL_64;
        zzk1;
        set;
        JVM INSTR monitorexit ;
        throw zzk1;
        Map map = zzZ;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        String s;
        s = zzk1.zzh();
        if (!zzZ.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        queue = (Queue)zzZ.get(s);
        Object obj;
        obj = queue;
        if (queue != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = new LinkedList();
        ((Queue) (obj)).add(zzk1);
        zzZ.put(s, obj);
        if (zzs.DEBUG)
        {
            zzs.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[] {
                s
            });
        }
_L1:
        map;
        JVM INSTR monitorexit ;
        return zzk1;
        zzk1;
        map;
        JVM INSTR monitorexit ;
        throw zzk1;
        zzZ.put(s, null);
        zzab.add(zzk1);
          goto _L1
    }

    void zzf(zzk zzk1)
    {
        synchronized (zzaa)
        {
            zzaa.remove(zzk1);
        }
        obj = zzaf;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaf.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzg(zzk1)) { }
        break MISSING_BLOCK_LABEL_74;
        zzk1;
        obj;
        JVM INSTR monitorexit ;
        throw zzk1;
        zzk1;
        obj;
        JVM INSTR monitorexit ;
        throw zzk1;
        obj;
        JVM INSTR monitorexit ;
        if (!zzk1.zzr())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Map map = zzZ;
        map;
        JVM INSTR monitorenter ;
        Queue queue;
        zzk1 = zzk1.zzh();
        queue = (Queue)zzZ.remove(zzk1);
        if (queue == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (zzs.DEBUG)
        {
            zzs.zza("Releasing %d waiting requests for cacheKey=%s.", new Object[] {
                Integer.valueOf(queue.size()), zzk1
            });
        }
        zzab.addAll(queue);
        map;
        JVM INSTR monitorexit ;
        return;
        zzk1;
        map;
        JVM INSTR monitorexit ;
        throw zzk1;
    }
}
