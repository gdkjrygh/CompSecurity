// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzcn, zzcm

public class zzcy extends zzg
{

    public zzcy()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    private zzcm zzb(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        com.google.android.gms.dynamic.zzd zzd1 = zze.zzw(context);
        framelayout = zze.zzw(framelayout);
        framelayout1 = zze.zzw(framelayout1);
        context = zzcm.zza.zzu(((zzcn)zzak(context)).zza(zzd1, framelayout, framelayout1, 0x738638));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected zzcn zzD(IBinder ibinder)
    {
        return zzcn.zza.zzv(ibinder);
    }

    public zzcm zza(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
label0:
        {
            if (zzk.zzcA().zzP(context))
            {
                zzcm zzcm = zzb(context, framelayout, framelayout1);
                context = zzcm;
                if (zzcm != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Using NativeAdViewDelegate from the client jar.");
            context = new zzi(framelayout, framelayout1);
        }
        return context;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzD(ibinder);
    }
}
