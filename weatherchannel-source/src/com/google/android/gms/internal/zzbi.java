// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbh

public class zzbi
{

    private final Object zzqt = new Object();
    private int zzrt;
    private List zzru;

    public zzbi()
    {
        zzru = new LinkedList();
    }

    public boolean zza(zzbh zzbh1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzru.contains(zzbh1))
        {
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzbh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbh1;
    }

    public boolean zzb(zzbh zzbh1)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzru.iterator();
_L2:
        zzbh zzbh2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_68;
            }
            zzbh2 = (zzbh)iterator.next();
        } while (zzbh1 == zzbh2);
        if (!zzbh2.zzci().equals(zzbh1.zzci())) goto _L2; else goto _L1
_L1:
        iterator.remove();
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        zzbh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbh1;
    }

    public void zzc(zzbh zzbh1)
    {
        synchronized (zzqt)
        {
            if (zzru.size() >= 10)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzay((new StringBuilder()).append("Queue is full, current size = ").append(zzru.size()).toString());
                zzru.remove(0);
            }
            int i = zzrt;
            zzrt = i + 1;
            zzbh1.zzg(i);
            zzru.add(zzbh1);
        }
        return;
        zzbh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbh1;
    }

    public zzbh zzco()
    {
        zzbh zzbh1;
label0:
        {
            zzbh1 = null;
            synchronized (zzqt)
            {
                if (zzru.size() != 0)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzay("Queue empty");
            }
            return null;
        }
        if (zzru.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = zzru.iterator();
_L1:
        zzbh zzbh2;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        zzbh2 = (zzbh)iterator.next();
        j = zzbh2.getScore();
        if (j > i)
        {
            zzbh1 = zzbh2;
            i = j;
        }
          goto _L1
        zzru.remove(zzbh1);
        obj;
        JVM INSTR monitorexit ;
        return zzbh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (zzbh)zzru.get(0);
        exception.zzcj();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
