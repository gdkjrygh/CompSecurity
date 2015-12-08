// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzs, zzk, AdSizeParcel, zzr

public class zze extends zzg
{

    public zze()
    {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private zzr zza(Context context, AdSizeParcel adsizeparcel, String s, zzee zzee, int i)
    {
        com.google.android.gms.dynamic.zzd zzd1 = com.google.android.gms.dynamic.zze.zzw(context);
        context = zzr.zza.zzk(((zzs)zzak(context)).zza(zzd1, adsizeparcel, s, zzee, 0x738638, i));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote AdManager.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public zzr zza(Context context, AdSizeParcel adsizeparcel, String s, zzee zzee)
    {
        Object obj;
label0:
        {
            if (zzk.zzcA().zzP(context))
            {
                zzr zzr = zza(context, adsizeparcel, s, zzee, 1);
                obj = zzr;
                if (zzr != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Using BannerAdManager from the client jar.");
            obj = new com.google.android.gms.ads.internal.zze(context, adsizeparcel, s, zzee, new VersionInfoParcel(0x738638, 0x738638, true));
        }
        return ((zzr) (obj));
    }

    public zzr zzb(Context context, AdSizeParcel adsizeparcel, String s, zzee zzee)
    {
        Object obj;
label0:
        {
            if (zzk.zzcA().zzP(context))
            {
                zzr zzr = zza(context, adsizeparcel, s, zzee, 2);
                obj = zzr;
                if (zzr != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Using InterstitialAdManager from the client jar.");
            obj = new zzj(context, adsizeparcel, s, zzee, new VersionInfoParcel(0x738638, 0x738638, true));
        }
        return ((zzr) (obj));
    }

    protected Object zzd(IBinder ibinder)
    {
        return zze(ibinder);
    }

    protected zzs zze(IBinder ibinder)
    {
        return zzs.zza.zzl(ibinder);
    }
}
