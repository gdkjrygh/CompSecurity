// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzae

public class zzad
{

    private final long zzOe;
    private final int zzOf;
    private double zzOg;
    private long zzOh;
    private final Object zzOi;
    private final String zzOj;

    public zzad(int i, long l, String s)
    {
        zzOi = new Object();
        zzOf = i;
        zzOg = zzOf;
        zzOe = l;
        zzOj = s;
    }

    public zzad(String s)
    {
        this(60, 2000L, s);
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
        d = (double)(l - zzOh) / (double)zzOe;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        zzOg = Math.min(zzOf, d + zzOg);
        zzOh = l;
        if (zzOg < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        zzOg = zzOg - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzae.zzaE((new StringBuilder()).append("Excessive ").append(zzOj).append(" detected; call ignored.").toString());
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
