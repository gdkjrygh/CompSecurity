// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzcs
    implements zzcd
{

    private final long zzOe;
    private final int zzOf;
    private double zzOg;
    private final Object zzOi;
    private long zzaRW;

    public zzcs()
    {
        this(60, 2000L);
    }

    public zzcs(int i, long l)
    {
        zzOi = new Object();
        zzOf = i;
        zzOg = zzOf;
        zzOe = l;
    }

    public boolean zzkp()
    {
        Object obj = zzOi;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (zzOg >= (double)zzOf)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - zzaRW) / (double)zzOe;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzOg = Math.min(zzOf, d + zzOg);
        zzaRW = l;
        if (zzOg < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzOg = zzOg - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzbg.zzaE("No more tokens available.");
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
