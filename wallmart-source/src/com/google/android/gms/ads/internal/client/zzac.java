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
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzw, zzk, zzv

public class zzac extends zzg
{

    public zzac()
    {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    private zzv zzu(Context context)
    {
        try
        {
            com.google.android.gms.dynamic.zzd zzd1 = zze.zzx(context);
            context = zzv.zza.zzo(((zzw)zzar(context)).zza(zzd1, 0x7877d8));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzb.zzd("Could not get remote MobileAdsSettingManager.", context);
            return null;
        }
        return context;
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzq(ibinder);
    }

    protected zzw zzq(IBinder ibinder)
    {
        return zzw.zza.zzp(ibinder);
    }

    public zzv zzt(Context context)
    {
        Object obj;
label0:
        {
            if (zzk.zzcE().zzR(context))
            {
                zzv zzv = zzu(context);
                obj = zzv;
                if (zzv != null)
                {
                    break label0;
                }
            }
            zzb.zzaC("Using MobileAdsSettingManager from the client jar.");
            new VersionInfoParcel(0x7877d8, 0x7877d8, true);
            obj = zzm.zzq(context);
        }
        return ((zzv) (obj));
    }
}
