// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zze

class zzXc
    implements Runnable
{

    final ConnectionResult zzXc;
    final zze zzXd;

    public void run()
    {
        zze.zza(zzXd).lock();
        zze.zza(zzXd, zzXc);
        zze.zza(zzXd).unlock();
        return;
        Exception exception;
        exception;
        zze.zza(zzXd).unlock();
        throw exception;
    }

    Result(zze zze1, ConnectionResult connectionresult)
    {
        zzXd = zze1;
        zzXc = connectionresult;
        super();
    }
}
