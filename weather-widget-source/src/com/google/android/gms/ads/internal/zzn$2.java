// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzct;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

class zzpu
    implements Runnable
{

    final zzn zzpt;
    final zzd zzpu;

    public void run()
    {
        try
        {
            zzpt.zzos.zzqp.zza(zzpu);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }

    s.zzd(zzn zzn1, zzd zzd)
    {
        zzpt = zzn1;
        zzpu = zzd;
        super();
    }
}
