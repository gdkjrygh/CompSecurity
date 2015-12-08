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
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzee;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzk, zzq, zzp

public final class zzd extends zzg
{

    private static final zzd zzrW = new zzd();

    private zzd()
    {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static zzp zza(Context context, String s, zzee zzee)
    {
        Object obj;
label0:
        {
            if (zzk.zzcA().zzP(context))
            {
                zzp zzp = zzrW.zzb(context, s, zzee);
                obj = zzp;
                if (zzp != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Using AdLoader from the client jar.");
            obj = new zzi(context, s, zzee, new VersionInfoParcel(0x738638, 0x738638, true));
        }
        return ((zzp) (obj));
    }

    private zzp zzb(Context context, String s, zzee zzee)
    {
        com.google.android.gms.dynamic.zzd zzd1 = zze.zzw(context);
        context = com.google.android.gms.ads.internal.client.zzp.zza.zzi(((zzq)zzak(context)).zza(zzd1, s, zzee, 0x738638));
        return context;
        context;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote builder for AdLoader.", context);
_L2:
        return null;
        context;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote builder for AdLoader.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected zzq zzc(IBinder ibinder)
    {
        return zzq.zza.zzj(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzc(ibinder);
    }

}
