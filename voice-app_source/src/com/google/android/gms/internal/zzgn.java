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
//            zzgo, zzef

public class zzgn extends com.google.android.gms.ads.internal.reward.client.zzb.zza
{

    private final Context mContext;
    private final zzgo zzEM;
    private final VersionInfoParcel zzoM;
    private final Object zzqt = new Object();

    public zzgn(Context context, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoM = versioninfoparcel;
        zzEM = new zzgo(context, AdSizeParcel.zzcx(), zzef, versioninfoparcel);
    }

    public void destroy()
    {
        synchronized (zzqt)
        {
            zzEM.destroy();
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
        synchronized (zzqt)
        {
            flag = zzEM.isLoaded();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void pause()
    {
        synchronized (zzqt)
        {
            zzEM.pause();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void resume()
    {
        synchronized (zzqt)
        {
            zzEM.resume();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setUserId(String s)
    {
        synchronized (zzqt)
        {
            zzEM.setUserId(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void show()
    {
        synchronized (zzqt)
        {
            zzEM.zzfK();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        synchronized (zzqt)
        {
            zzEM.zza(rewardedvideoadrequestparcel);
        }
        return;
        rewardedvideoadrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw rewardedvideoadrequestparcel;
    }

    public void zza(zzd zzd)
    {
        synchronized (zzqt)
        {
            zzEM.zza(zzd);
        }
        return;
        zzd;
        obj;
        JVM INSTR monitorexit ;
        throw zzd;
    }
}
