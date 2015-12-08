// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzqo;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, zzbg, zzo, Container, 
//            TagManager, zzcd

class zzaPs
    implements com.google.android.gms.internal.za
{

    final String zzaPs;
    final zzp zzaPt;

    public void zza(zzqo zzqo1)
    {
        if (zzqo1.getStatus() != Status.zzaaD)
        {
            zzbg.e((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaPt)).toString());
            zzaPt.zza(zzaPt.zzbg(Status.zzaaF));
            return;
        }
        com.google.android.gms.internal.zc zc = zzqo1.zzBw().zzBA();
        if (zc == null)
        {
            zzbg.e("Response doesn't have the requested container");
            zzaPt.zza(zzaPt.zzbg(new Status(8, "Response doesn't have the requested container", null)));
            return;
        } else
        {
            long l = zzqo1.zzBw().zzBB();
            zzp.zza(zzaPt, new zzo(zzp.zzb(zzaPt), zzp.zzc(zzaPt), new Container(zzp.zzd(zzaPt), zzp.zzb(zzaPt).getDataLayer(), zzp.zza(zzaPt), l, zc), new zzo.zza() {

                final zzp._cls1 zzaPu;

                public void zzey(String s)
                {
                    zzaPu.zzaPt.zzey(s);
                }

                public String zzzE()
                {
                    return zzaPu.zzaPt.zzzE();
                }

                public void zzzG()
                {
                    if (zzp.zze(zzaPu.zzaPt).zzkp())
                    {
                        zzaPu.zzaPt.load(zzaPu.zzaPs);
                    }
                }

            
            {
                zzaPu = zzp._cls1.this;
                super();
            }
            }));
            zzaPt.zza(zzp.zzf(zzaPt));
            return;
        }
    }

    _cls1.zzaPu(zzp zzp1, String s)
    {
        zzaPt = zzp1;
        zzaPs = s;
        super();
    }
}
