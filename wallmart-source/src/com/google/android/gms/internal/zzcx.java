// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.internal:
//            zzcm, zzcl

public class zzcx extends zzg
{

    public zzcx()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    private zzcl zzb(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        com.google.android.gms.dynamic.zzd zzd1 = zze.zzx(context);
        framelayout = zze.zzx(framelayout);
        framelayout1 = zze.zzx(framelayout1);
        context = zzcl.zza.zzu(((zzcm)zzar(context)).zza(zzd1, framelayout, framelayout1, 0x7877d8));
        return context;
        context;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected zzcm zzD(IBinder ibinder)
    {
        return zzcm.zza.zzv(ibinder);
    }

    public zzcl zza(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
label0:
        {
            if (zzk.zzcE().zzR(context))
            {
                zzcl zzcl = zzb(context, framelayout, framelayout1);
                context = zzcl;
                if (zzcl != null)
                {
                    break label0;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Using NativeAdViewDelegate from the client jar.");
            context = new zzj(framelayout, framelayout1);
        }
        return context;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzD(ibinder);
    }
}
