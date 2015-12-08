// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzgx, zzeh

public class zzgw extends com.google.android.gms.ads.internal.reward.client.zzb.zza
{

    private final Context mContext;
    private final zzgx zzGf;
    private final VersionInfoParcel zzpa;
    private final Object zzpc = new Object();

    public zzgw(Context context, zzeh zzeh, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzpa = versioninfoparcel;
        zzGf = new zzgx(context, AdSizeParcel.zzcB(), zzeh, versioninfoparcel);
    }

    public void destroy()
    {
        synchronized (zzpc)
        {
            zzGf.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isLoaded()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzGf.isLoaded();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void pause()
    {
        synchronized (zzpc)
        {
            zzGf.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (zzpc)
        {
            zzGf.resume();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setUserId(String s)
    {
        synchronized (zzpc)
        {
            zzGf.setUserId(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void show()
    {
        synchronized (zzpc)
        {
            zzGf.zzfO();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        synchronized (zzpc)
        {
            zzGf.zza(rewardedvideoadrequestparcel);
        }
        return;
        rewardedvideoadrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw rewardedvideoadrequestparcel;
    }

    public void zza(zzd zzd)
    {
        synchronized (zzpc)
        {
            zzGf.zza(zzd);
        }
        return;
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }
}
