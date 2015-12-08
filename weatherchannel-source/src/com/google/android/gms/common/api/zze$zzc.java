// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zze, zzg, Api

private static class zzXl
    implements iClient.ConnectionProgressReportCallbacks
{

    private final WeakReference zzXe;
    private final Api zzXk;
    private final int zzXl;

    public void onReportAccountValidation(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = true;
        zze1 = (zze)zzXe.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() != zze.zzb(zze1).getLooper())
        {
            flag = false;
        }
        zzu.zza(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        zze.zza(zze1).lock();
        flag = zze.zza(zze1, 1);
        if (!flag)
        {
            zze.zza(zze1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zze.zza(zze1, connectionresult, zzXk, zzXl);
        }
        if (zze.zzf(zze1))
        {
            zze.zzh(zze1);
        }
        zze.zza(zze1).unlock();
        return;
        connectionresult;
        zze.zza(zze1).unlock();
        throw connectionresult;
    }

    public void onReportServiceBinding(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = false;
        zze1 = (zze)zzXe.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() == zze.zzb(zze1).getLooper())
        {
            flag = true;
        }
        zzu.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zze.zza(zze1).lock();
        boolean flag1 = zze.zza(zze1, 0);
        if (!flag1)
        {
            zze.zza(zze1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zze.zza(zze1, connectionresult, zzXk, zzXl);
        }
        if (zze.zzf(zze1))
        {
            zze.zzg(zze1);
        }
        zze.zza(zze1).unlock();
        return;
        connectionresult;
        zze.zza(zze1).unlock();
        throw connectionresult;
    }

    public sult(zze zze1, Api api, int i)
    {
        zzXe = new WeakReference(zze1);
        zzXk = api;
        zzXl = i;
    }
}
