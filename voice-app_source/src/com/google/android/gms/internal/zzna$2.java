// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzna, zzly, zzmj

class eApiClient extends a
{

    final zzna zzald;
    final String zzale;

    protected Result createFailedResult(Status status)
    {
        return zzC(status);
    }

    protected DataTypeResult zzC(Status status)
    {
        return DataTypeResult.zzM(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzly)ent);
    }

    protected void zza(zzly zzly1)
        throws RemoteException
    {
        a a = new a(this, null);
        String s = zzly1.getContext().getPackageName();
        ((zzmj)zzly1.zznM()).zza(new DataTypeReadRequest(zzale, a, s));
    }

    eApiClient(zzna zzna1, GoogleApiClient googleapiclient, String s)
    {
        zzald = zzna1;
        zzale = s;
        super(googleapiclient);
    }
}
