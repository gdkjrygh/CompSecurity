// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.DisableFitRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzna, zzly, zzng, zzmj

class eApiClient extends c
{

    final zzna zzald;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzly)ent);
    }

    protected void zza(zzly zzly1)
        throws RemoteException
    {
        zzng zzng1 = new zzng(this);
        String s = zzly1.getContext().getPackageName();
        ((zzmj)zzly1.zznM()).zza(new DisableFitRequest(zzng1, s));
    }

    eApiClient(zzna zzna1, GoogleApiClient googleapiclient)
    {
        zzald = zzna1;
        super(googleapiclient);
    }
}
