// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzeq, zzes, zzfx, zzcf, 
//            zzy

static final class zzAh
    implements Runnable
{

    final zzcf zzAh;
    final zzes zzAi;

    public void run()
    {
        zzAi.zzez();
        if (zzAi.zzex() != null)
        {
            zzAi.zzex().zza(new zzfx.zzd() {

                final zzeq._cls3 zzAq;

                public void zza(Object obj)
                {
                    zzc((zzy)obj);
                }

                public void zzc(zzy zzy1)
                {
                    zzy1.zzb("/invalidRequest", zzAq.zzAi.zzAy);
                    zzy1.zzb("/loadAdURL", zzAq.zzAi.zzAz);
                }

            
            {
                zzAq = zzeq._cls3.this;
                super();
            }
            }, new b());
            zzAh.zzb(zzAi.zzex());
        }
    }

    _cls1.zzAq(zzes zzes1, zzcf zzcf1)
    {
        zzAi = zzes1;
        zzAh = zzcf1;
        super();
    }
}
