// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class zzuf
    implements 
{

    final zzfx zzuf;
    final zzcf zzug;

    public void zzbq()
    {
        (new Timer()).schedule(new TimerTask() {

            final zzcf._cls1 zzuh;

            public void run()
            {
label0:
                {
                    synchronized (zzcf.zza(zzuh.zzug))
                    {
                        if (zzuh.zzuf.getStatus() != -1 && zzuh.zzuf.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzcf.zza(zzuh.zzug, 1);
                zzuh.zzuf.reject();
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzuh = zzcf._cls1.this;
                super();
            }
        }, a.zzuk);
    }

    _cls1.zzuh(zzcf zzcf1, zzfx zzfx)
    {
        zzug = zzcf1;
        zzuf = zzfx;
        super();
    }
}
