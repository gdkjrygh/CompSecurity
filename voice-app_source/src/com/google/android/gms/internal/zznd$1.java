// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zznd, zzmb, zzmm

class eApiClient extends a
{

    final zznd zzalo;

    protected Result createFailedResult(Status status)
    {
        return zzF(status);
    }

    protected ListSubscriptionsResult zzF(Status status)
    {
        return ListSubscriptionsResult.zzN(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzmb)ent);
    }

    protected void zza(zzmb zzmb1)
        throws RemoteException
    {
        a a = new a(this, null);
        String s = zzmb1.getContext().getPackageName();
        ((zzmm)zzmb1.zznM()).zza(new ListSubscriptionsRequest(null, a, s));
    }

    eApiClient(zznd zznd1, GoogleApiClient googleapiclient)
    {
        zzalo = zznd1;
        super(googleapiclient);
    }
}
