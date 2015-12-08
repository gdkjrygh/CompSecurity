// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class zzuf extends TimerTask
{

    final zzfx zzuf;
    final zzcf zzug;

    public void run()
    {
label0:
        {
            synchronized (zzcf.zza(zzug))
            {
                if (zzuf.getStatus() != -1 && zzuf.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzcf.zza(zzug, 1);
        zzuf.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzcf zzcf1, zzfx zzfx1)
    {
        zzug = zzcf1;
        zzuf = zzfx1;
        super();
    }
}
