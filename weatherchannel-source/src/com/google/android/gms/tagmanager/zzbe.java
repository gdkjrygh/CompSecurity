// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzbe
    implements zzcd
{

    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private long zzMi;
    private final Object zzMj = new Object();
    private final long zzaMh;
    private final zzlb zzpw;
    private final String zzuO;

    public zzbe(int i, long l, long l1, String s, zzlb zzlb1)
    {
        zzMg = i;
        zzMh = zzMg;
        zzMf = l;
        zzaMh = l1;
        zzuO = s;
        zzpw = zzlb1;
    }

    public boolean zzkb()
    {
        long l;
label0:
        {
            synchronized (zzMj)
            {
                l = zzpw.currentTimeMillis();
                if (l - zzMi >= zzaMh)
                {
                    break label0;
                }
                zzbg.zzaC((new StringBuilder()).append("Excessive ").append(zzuO).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (zzMh >= (double)zzMg)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - zzMi) / (double)zzMf;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzMh = Math.min(zzMg, d + zzMh);
        zzMi = l;
        if (zzMh < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        zzMh = zzMh - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbg.zzaC((new StringBuilder()).append("Excessive ").append(zzuO).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
