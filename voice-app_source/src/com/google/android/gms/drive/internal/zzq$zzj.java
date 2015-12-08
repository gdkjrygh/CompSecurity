// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq, zzs

static class setResult extends setResult
{

    protected volatile void zza(com.google.android.gms.common.api.nt nt)
        throws RemoteException
    {
        zza((zzs)nt);
    }

    protected void zza(zzs zzs1)
    {
    }

    ent(GoogleApiClient googleapiclient, Status status)
    {
        super(googleapiclient);
        setResult(status);
    }
}
