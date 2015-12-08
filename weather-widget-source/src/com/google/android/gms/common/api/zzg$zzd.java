// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzx;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzi, Api

private static class zzZS
    implements iClient.zza
{

    private final WeakReference zzZL;
    private final Api zzZR;
    private final int zzZS;

    public void zza(ConnectionResult connectionresult)
    {
        zzg zzg1;
        boolean flag = false;
        zzg1 = (zzg)zzZL.get();
        if (zzg1 == null)
        {
            return;
        }
        if (Looper.myLooper() == zzg.zzd(zzg1).getLooper())
        {
            flag = true;
        }
        zzx.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zzg.zzc(zzg1).lock();
        boolean flag1 = zzg.zza(zzg1, 0);
        if (!flag1)
        {
            zzg.zzc(zzg1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zzg.zza(zzg1, connectionresult, zzZR, zzZS);
        }
        if (zzg.zzk(zzg1))
        {
            zzg.zzl(zzg1);
        }
        zzg.zzc(zzg1).unlock();
        return;
        connectionresult;
        zzg.zzc(zzg1).unlock();
        throw connectionresult;
    }

    public void zzb(ConnectionResult connectionresult)
    {
        zzg zzg1;
        boolean flag = true;
        zzg1 = (zzg)zzZL.get();
        if (zzg1 == null)
        {
            return;
        }
        if (Looper.myLooper() != zzg.zzd(zzg1).getLooper())
        {
            flag = false;
        }
        zzx.zza(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        zzg.zzc(zzg1).lock();
        flag = zzg.zza(zzg1, 1);
        if (!flag)
        {
            zzg.zzc(zzg1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zzg.zza(zzg1, connectionresult, zzZR, zzZS);
        }
        if (zzg.zzk(zzg1))
        {
            zzg.zzm(zzg1);
        }
        zzg.zzc(zzg1).unlock();
        return;
        connectionresult;
        zzg.zzc(zzg1).unlock();
        throw connectionresult;
    }

    public sult(zzg zzg1, Api api, int i)
    {
        zzZL = new WeakReference(zzg1);
        zzZR = api;
        zzZS = i;
    }
}
