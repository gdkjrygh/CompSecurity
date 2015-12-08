// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzkw;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzm, zzp

class zzpd
    implements Runnable
{

    final zzha zzpd;
    final zzm zzpe;
    final String zzpf;

    public void run()
    {
        try
        {
            ((zzcx)zzpe.zzon.zzqa.get(zzpf)).zza((zzf)zzpd.zzFq);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
        }
    }

    lient.zzb(zzm zzm1, String s, zzha zzha1)
    {
        zzpe = zzm1;
        zzpf = s;
        zzpd = zzha1;
        super();
    }
}
