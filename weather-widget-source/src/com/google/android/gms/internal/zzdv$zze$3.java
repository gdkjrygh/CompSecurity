// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzdv, zzhu, zzbb

class zzyb
    implements zzyb
{

    final zza zzyb;

    public void zza(zzbb zzbb1)
    {
        zzhu.runOnUiThread(new Runnable(zzbb1) {

            final zzbb zzrt;
            final zzdv.zze._cls3 zzyc;

            public void run()
            {
                zzdv.zze.zza(zzyc.zzyb).zzc(zzrt);
                zzrt.destroy();
            }

            
            {
                zzyc = zzdv.zze._cls3.this;
                zzrt = zzbb1;
                super();
            }
        });
    }

    public void zzc(Object obj)
    {
        zza((zzbb)obj);
    }

    _cls1.zzrt(_cls1.zzrt zzrt)
    {
        zzyb = zzrt;
        super();
    }
}
