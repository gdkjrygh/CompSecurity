// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.zzee;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzk, zzac, zzv, MobileAdsSettingsParcel, 
//            zzab

public class zzaa
{

    private static final Object zzoW = new Object();
    private static zzaa zzta;
    private zzv zztb;
    private RewardedVideoAd zztc;

    private zzaa()
    {
    }

    public static zzaa zzcP()
    {
        zzaa zzaa1;
        synchronized (zzoW)
        {
            if (zzta == null)
            {
                zzta = new zzaa();
            }
            zzaa1 = zzta;
        }
        return zzaa1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public RewardedVideoAd getRewardedVideoAdInstance(Context context)
    {
label0:
        {
            synchronized (zzoW)
            {
                if (zztc == null)
                {
                    break label0;
                }
                context = zztc;
            }
            return context;
        }
        zzee zzee1 = new zzee();
        zztc = new zzi(context, zzk.zzcF().zza(context, zzee1));
        context = zztc;
        obj;
        JVM INSTR monitorexit ;
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void zza(Context context, String s, zzab zzab)
    {
label0:
        {
            synchronized (zzoW)
            {
                if (zztb == null)
                {
                    break label0;
                }
            }
            return;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        throw new IllegalArgumentException("Context cannot be null.");
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("applicationCode cannot be empty.");
        }
        zzv zzv1;
        zztb = zzk.zzcD().zzt(context);
        zzv1 = zztb;
        if (zzab != null) goto _L2; else goto _L1
_L1:
        context = null;
_L3:
        zzv1.zza(s, context);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        context = new MobileAdsSettingsParcel(zzab);
          goto _L3
        context;
        zzb.zzaC("Fail to initialize mobile ads setting manager");
          goto _L4
    }

}
