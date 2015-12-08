// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze
{

    private final long zzafP;
    private final int zzafQ;
    private final SimpleArrayMap zzafR;

    public zze()
    {
        zzafP = 60000L;
        zzafQ = 10;
        zzafR = new SimpleArrayMap(10);
    }

    public zze(int i, long l)
    {
        zzafP = l;
        zzafQ = i;
        zzafR = new SimpleArrayMap();
    }

    private void zzb(long l, long l1)
    {
        for (int i = zzafR.size() - 1; i >= 0; i--)
        {
            if (l1 - ((Long)zzafR.valueAt(i)).longValue() > l)
            {
                zzafR.removeAt(i);
            }
        }

    }

    public Long zzcy(String s)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = zzafP;
        this;
        JVM INSTR monitorenter ;
        for (; zzafR.size() >= zzafQ; Log.w("ConnectionTracker", (new StringBuilder()).append("The max capacity ").append(zzafQ).append(" is not enough. Current durationThreshold is: ").append(l).toString()))
        {
            zzb(l, l1);
            l /= 2L;
        }

        break MISSING_BLOCK_LABEL_84;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s = (Long)zzafR.put(s, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    public boolean zzcz(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (zzafR.remove(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }
}
