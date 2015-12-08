// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;
import com.google.android.gms.internal.zzgn;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zzc, zzb

public class zzf extends zzg
{

    public zzf()
    {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    private com.google.android.gms.ads.internal.reward.client.zzb zzb(Context context, zzee zzee)
    {
        com.google.android.gms.dynamic.zzd zzd1 = zze.zzw(context);
        context = com.google.android.gms.ads.internal.reward.client.zzb.zza.zzX(((zzc)zzak(context)).zza(zzd1, zzee, 0x738638));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get remote RewardedVideoAd.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public com.google.android.gms.ads.internal.reward.client.zzb zza(Context context, zzee zzee)
    {
        Object obj;
label0:
        {
            if (zzk.zzcA().zzP(context))
            {
                com.google.android.gms.ads.internal.reward.client.zzb zzb1 = zzb(context, zzee);
                obj = zzb1;
                if (zzb1 != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Using RewardedVideoAd from the client jar.");
            obj = new zzgn(context, zzee, new VersionInfoParcel(0x738638, 0x738638, true));
        }
        return ((com.google.android.gms.ads.internal.reward.client.zzb) (obj));
    }

    protected zzc zzaa(IBinder ibinder)
    {
        return zzc.zza.zzY(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzaa(ibinder);
    }
}
