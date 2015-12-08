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

    private final Object zzpc = new Object();
    private int zzrM;
    private List zzrN;

    public zzbi()
    {
        zzrN = new LinkedList();
    }

    public boolean zza(zzbh zzbh1)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzrN.contains(zzbh1))
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
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzrN.iterator();
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
        if (!zzbh2.zzcm().equals(zzbh1.zzcm())) goto _L2; else goto _L1
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
        synchronized (zzpc)
        {
            if (zzrN.size() >= 10)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("Queue is full, current size = ").append(zzrN.size()).toString());
                zzrN.remove(0);
            }
            int i = zzrM;
            zzrM = i + 1;
            zzbh1.zzg(i);
            zzrN.add(zzbh1);
        }
        return;
        zzbh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzbh1;
    }

    public zzbh zzcs()
    {
        zzbh zzbh1;
label0:
        {
            zzbh1 = null;
            synchronized (zzpc)
            {
                if (zzrN.size() != 0)
                {
                    break label0;
                }
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Queue empty");
            }
            return null;
        }
        if (zzrN.size() < 2)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        int i = 0x80000000;
        Iterator iterator = zzrN.iterator();
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
        zzrN.remove(zzbh1);
        obj;
        JVM INSTR monitorexit ;
        return zzbh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = (zzbh)zzrN.get(0);
        exception.zzcn();
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }
}
