// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi, zzj, Api

class zzaar
    implements ApiClient.OnConnectionFailedListener
{

    final zzi zzaap;
    final Api zzaaq;
    final int zzaar;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzi.zza(zzaap).lock();
        zzi.zzb(zzaap).zza(connectionresult, zzaaq, zzaar);
        zzi.zza(zzaap).unlock();
        return;
        connectionresult;
        zzi.zza(zzaap).unlock();
        throw connectionresult;
    }

    Result(zzi zzi1, Api api, int i)
    {
        zzaap = zzi1;
        zzaaq = api;
        zzaar = i;
        super();
    }
}
