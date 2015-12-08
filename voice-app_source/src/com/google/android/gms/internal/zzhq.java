// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzlb

public class zzhq
{

    private long zzGC;
    private long zzGD;
    private Object zzqt;

    public zzhq(long l)
    {
        zzGD = 0x8000000000000000L;
        zzqt = new Object();
        zzGC = l;
    }

    public boolean tryAcquire()
    {
        long l;
label0:
        {
            synchronized (zzqt)
            {
                l = zzo.zzbz().elapsedRealtime();
                if (zzGD + zzGC <= l)
                {
                    break label0;
                }
            }
            return false;
        }
        zzGD = l;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
