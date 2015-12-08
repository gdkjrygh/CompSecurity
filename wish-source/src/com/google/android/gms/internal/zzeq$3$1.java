// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzy, zzes, zzeq, zzfx, 
//            zzcf

class zzAq
    implements zzAq
{

    final  zzAq;

    public void zza(Object obj)
    {
        zzc((zzy)obj);
    }

    public void zzc(zzy zzy1)
    {
        zzy1.zzb("/invalidRequest", zzAq.Ai.zzAy);
        zzy1.zzb("/loadAdURL", zzAq.Ai.zzAz);
    }

    Ah(Ah ah)
    {
        zzAq = ah;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzeq$3

/* anonymous class */
    static final class zzeq._cls3
        implements Runnable
    {

        final zzcf zzAh;
        final zzes zzAi;

        public void run()
        {
            zzAi.zzez();
            if (zzAi.zzex() != null)
            {
                zzAi.zzex().zza(new zzeq._cls3._cls1(this), new zzfx.zzb());
                zzAh.zzb(zzAi.zzex());
            }
        }

            
            {
                zzAi = zzes1;
                zzAh = zzcf1;
                super();
            }
    }

}
