// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzqo;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzp, zzcd, zzbg, zzo, 
//            Container, TagManager

class zzaPu
    implements zzaPu
{

    final aPs zzaPu;

    public void zzey(String s)
    {
        zzaPu.aPt.zzey(s);
    }

    public String zzzE()
    {
        return zzaPu.aPt.zzzE();
    }

    public void zzzG()
    {
        if (zzp.zze(zzaPu.aPt).zzkp())
        {
            zzaPu.aPt.load(zzaPu.aPs);
        }
    }

    aPs(aPs aps)
    {
        zzaPu = aps;
        super();
    }

    // Unreferenced inner class com/google/android/gms/tagmanager/zzp$1

/* anonymous class */
    class zzp._cls1
        implements com.google.android.gms.internal.zzqk.zza
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
            com.google.android.gms.internal.zzqp.zzc zzc = zzqo1.zzBw().zzBA();
            if (zzc == null)
            {
                zzbg.e("Response doesn't have the requested container");
                zzaPt.zza(zzaPt.zzbg(new Status(8, "Response doesn't have the requested container", null)));
                return;
            } else
            {
                long l = zzqo1.zzBw().zzBB();
                zzp.zza(zzaPt, new zzo(zzp.zzb(zzaPt), zzp.zzc(zzaPt), new Container(zzp.zzd(zzaPt), zzp.zzb(zzaPt).getDataLayer(), zzp.zza(zzaPt), l, zzc), new zzp._cls1._cls1(this)));
                zzaPt.zza(zzp.zzf(zzaPt));
                return;
            }
        }

            
            {
                zzaPt = zzp1;
                zzaPs = s;
                super();
            }
    }

}
