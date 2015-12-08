// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzlm

public class zzib
{

    private long zzIp;
    private long zzIq;
    private Object zzpc;

    public zzib(long l)
    {
        zzIq = 0x8000000000000000L;
        zzpc = new Object();
        zzIp = l;
    }

    public boolean tryAcquire()
    {
        long l;
label0:
        {
            synchronized (zzpc)
            {
                l = zzp.zzbB().elapsedRealtime();
                if (zzIq + zzIp <= l)
                {
                    break label0;
                }
            }
            return false;
        }
        zzIq = l;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
