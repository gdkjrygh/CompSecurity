// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzbe
    implements zzcd
{

    private final long zzIj;
    private final int zzIk;
    private double zzIl;
    private long zzIm;
    private final Object zzIn = new Object();
    private final long zzaDT;
    private final zzht zznR;
    private final String zzso;

    public zzbe(int i, long l, long l1, String s, zzht zzht1)
    {
        zzIk = i;
        zzIl = zzIk;
        zzIj = l;
        zzaDT = l1;
        zzso = s;
        zznR = zzht1;
    }

    public boolean zziT()
    {
        long l;
label0:
        {
            synchronized (zzIn)
            {
                l = zznR.currentTimeMillis();
                if (l - zzIm >= zzaDT)
                {
                    break label0;
                }
                zzbg.zzan((new StringBuilder()).append("Excessive ").append(zzso).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (zzIl >= (double)zzIk)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - zzIm) / (double)zzIj;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzIl = Math.min(zzIk, d + zzIl);
        zzIm = l;
        if (zzIl < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        zzIl = zzIl - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbg.zzan((new StringBuilder()).append("Excessive ").append(zzso).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
