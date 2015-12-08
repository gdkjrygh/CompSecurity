// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze
{

    private final long zzacG;
    private final int zzacH;
    private final SimpleArrayMap zzacI;

    public zze()
    {
        zzacG = 60000L;
        zzacH = 10;
        zzacI = new SimpleArrayMap(10);
    }

    public zze(int i, long l)
    {
        zzacG = l;
        zzacH = i;
        zzacI = new SimpleArrayMap();
    }

    private void zzc(long l, long l1)
    {
        for (int i = zzacI.size() - 1; i >= 0; i--)
        {
            if (l1 - ((Long)zzacI.valueAt(i)).longValue() > l)
            {
                zzacI.removeAt(i);
            }
        }

    }

    public Long zzcp(String s)
    {
        long l1 = SystemClock.elapsedRealtime();
        long l = zzacG;
        this;
        JVM INSTR monitorenter ;
        for (; zzacI.size() >= zzacH; Log.w("ConnectionTracker", (new StringBuilder()).append("The max capacity ").append(zzacH).append(" is not enough. Current durationThreshold is: ").append(l).toString()))
        {
            zzc(l, l1);
            l /= 2L;
        }

        break MISSING_BLOCK_LABEL_84;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s = (Long)zzacI.put(s, Long.valueOf(l1));
        this;
        JVM INSTR monitorexit ;
        return s;
    }

    public boolean zzcq(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (zzacI.remove(s) != null)
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
