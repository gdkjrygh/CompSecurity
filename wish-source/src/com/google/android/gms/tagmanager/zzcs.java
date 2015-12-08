// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzcs
    implements zzcd
{

    private final long zzIj;
    private final int zzIk;
    private double zzIl;
    private final Object zzIn;
    private long zzaFo;

    public zzcs()
    {
        this(60, 2000L);
    }

    public zzcs(int i, long l)
    {
        zzIn = new Object();
        zzIk = i;
        zzIl = zzIk;
        zzIj = l;
    }

    public boolean zziT()
    {
        Object obj = zzIn;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (zzIl >= (double)zzIk)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - zzaFo) / (double)zzIj;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzIl = Math.min(zzIk, d + zzIl);
        zzaFo = l;
        if (zzIl < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzIl = zzIl - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzbg.zzan("No more tokens available.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
