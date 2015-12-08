// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze
{

    private final SimpleArrayMap zzVA;
    private final long zzVy;
    private final int zzVz;

    public zze()
    {
        zzVy = 60000L;
        zzVz = 10;
        zzVA = new SimpleArrayMap(10);
    }

    public zze(int i, long l)
    {
        zzVy = l;
        zzVz = i;
        zzVA = new SimpleArrayMap();
    }

    private void zzc(long l, long l1)
    {
        for (int i = zzVA.size() - 1; i >= 0; i--)
        {
            if (l1 - ((Long)zzVA.valueAt(i)).longValue() > l)
            {
                zzVA.removeAt(i);
            }
        }

    }

    public boolean zzA(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzVA.remove(Long.valueOf(l)) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long zza(Long long1)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = zzVy;
        this;
        JVM INSTR monitorenter ;
        for (; zzVA.size() >= zzVz; Log.w("PassiveTimedConnectionMap", (new StringBuilder()).append("The max capacity ").append(zzVz).append(" is not enough. Current durationThreshold is: ").append(l).toString()))
        {
            zzc(l, l1);
            l /= 2L;
        }

        break MISSING_BLOCK_LABEL_84;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        long1 = (Long)zzVA.put(long1, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return long1;
    }
}
