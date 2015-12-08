// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzgm, zzhl

class zzEX
    implements Runnable
{

    final AdRequestInfoParcel zzEU;
    final zzgm zzEW;
    final zzk zzEX;

    public void run()
    {
        AdResponseParcel adresponseparcel;
        AdResponseParcel adresponseparcel1;
        try
        {
            adresponseparcel = zzEW.zze(zzEU);
        }
        catch (Exception exception)
        {
            zzp.zzbA().zzc(exception, true);
            zzb.zzd("Could not fetch ad response due to an Exception.", exception);
            exception = null;
        }
        adresponseparcel1 = adresponseparcel;
        if (adresponseparcel == null)
        {
            adresponseparcel1 = new AdResponseParcel(0);
        }
        try
        {
            zzEX.zzb(adresponseparcel1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to forward ad response.", remoteexception);
        }
    }

    uest.zzk(zzgm zzgm1, AdRequestInfoParcel adrequestinfoparcel, zzk zzk1)
    {
        zzEW = zzgm1;
        zzEU = adrequestinfoparcel;
        zzEX = zzk1;
        super();
    }
}
