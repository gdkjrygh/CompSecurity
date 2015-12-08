// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import java.util.Random;

public class zzl extends zzu.zza
{

    private Object zzqt;
    private long zzsA;
    private final Random zzsz = new Random();

    public zzl()
    {
        zzqt = new Object();
        zzcG();
    }

    public long getValue()
    {
        return zzsA;
    }

    public void zzcG()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        int i;
        long l;
        i = 3;
        l = 0L;
_L2:
        int j;
        j = i - 1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        long l1 = (long)zzsz.nextInt() + 0x80000000L;
        l = l1;
        i = j;
        if (l1 == zzsA) goto _L2; else goto _L1
_L1:
        l = l1;
        i = j;
        if (l1 == 0L) goto _L2; else goto _L3
_L3:
        l = l1;
        zzsA = l;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
