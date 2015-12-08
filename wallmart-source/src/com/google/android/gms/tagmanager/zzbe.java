// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlm;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcd, zzbg

class zzbe
    implements zzcd
{

    private final long zzOe;
    private final int zzOf;
    private double zzOg;
    private long zzOh;
    private final Object zzOi = new Object();
    private final String zzOj;
    private final long zzaQB;
    private final zzlm zzpO;

    public zzbe(int i, long l, long l1, String s, zzlm zzlm1)
    {
        zzOf = i;
        zzOg = zzOf;
        zzOe = l;
        zzaQB = l1;
        zzOj = s;
        zzpO = zzlm1;
    }

    public boolean zzkp()
    {
        long l;
label0:
        {
            synchronized (zzOi)
            {
                l = zzpO.currentTimeMillis();
                if (l - zzOh >= zzaQB)
                {
                    break label0;
                }
                zzbg.zzaE((new StringBuilder()).append("Excessive ").append(zzOj).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d;
        if (zzOg >= (double)zzOf)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        d = (double)(l - zzOh) / (double)zzOe;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        zzOg = Math.min(zzOf, d + zzOg);
        zzOh = l;
        if (zzOg < 1.0D)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        zzOg = zzOg - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzbg.zzaE((new StringBuilder()).append("Excessive ").append(zzOj).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
