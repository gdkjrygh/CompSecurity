// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzcf, zzfx

class zzuh extends TimerTask
{

    final ct zzuh;

    public void run()
    {
label0:
        {
            synchronized (zzcf.zza(zzuh.ug))
            {
                if (zzuh.uf.getStatus() != -1 && zzuh.uf.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzcf.zza(zzuh.ug, 1);
        zzuh.uf.reject();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    uf(uf uf)
    {
        zzuh = uf;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzcf$1

/* anonymous class */
    class zzcf._cls1
        implements zzy.zza
    {

        final zzfx zzuf;
        final zzcf zzug;

        public void zzbq()
        {
            (new Timer()).schedule(new zzcf._cls1._cls1(this), zzcf.zza.zzuk);
        }

            
            {
                zzug = zzcf1;
                zzuf = zzfx1;
                super();
            }
    }

}
