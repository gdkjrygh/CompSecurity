// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzhj;
import com.google.android.gms.internal.zzlh;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

class zzpx
    implements Runnable
{

    final zzn zzpt;
    final String zzpw;
    final zzhj zzpx;

    public void run()
    {
        try
        {
            ((zzcw)zzpt.zzos.zzqs.get(zzpw)).zza((zzf)zzpx.zzGK);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
        }
    }

    lient.zzb(zzn zzn1, String s, zzhj zzhj1)
    {
        zzpt = zzn1;
        zzpw = s;
        zzpx = zzhj1;
        super();
    }
}
