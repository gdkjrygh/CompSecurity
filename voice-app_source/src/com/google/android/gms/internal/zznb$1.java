// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataInsertRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zznb, zzlz, zzng, zzmk

class eApiClient extends c
{

    final DataSet zzalf;
    final boolean zzalg;
    final zznb zzalh;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzlz)ent);
    }

    protected void zza(zzlz zzlz1)
        throws RemoteException
    {
        zzng zzng1 = new zzng(this);
        String s = zzlz1.getContext().getPackageName();
        ((zzmk)zzlz1.zznM()).zza(new DataInsertRequest(zzalf, zzng1, s, zzalg));
    }

    eApiClient(zznb zznb1, GoogleApiClient googleapiclient, DataSet dataset, boolean flag)
    {
        zzalh = zznb1;
        zzalf = dataset;
        zzalg = flag;
        super(googleapiclient);
    }
}
