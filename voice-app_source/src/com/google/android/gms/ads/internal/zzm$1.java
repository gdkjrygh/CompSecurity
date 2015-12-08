// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzha;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzm, zzp

class zzpd
    implements Runnable
{

    final zzha zzpd;
    final zzm zzpe;

    public void run()
    {
        try
        {
            zzpe.zzon.zzpX.zza((zzd)zzpd.zzFq);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    lient.zzb(zzm zzm1, zzha zzha1)
    {
        zzpe = zzm1;
        zzpd = zzha1;
        super();
    }
}
