// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zznf, zzmd, zzng, zzmo

class eApiClient extends c
{

    final zznf zzalC;
    final PendingIntent zzalv;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzmd)ent);
    }

    protected void zza(zzmd zzmd1)
        throws RemoteException
    {
        zzng zzng1 = new zzng(this);
        String s = zzmd1.getContext().getPackageName();
        ((zzmo)zzmd1.zznM()).zza(new SessionUnregistrationRequest(zzalv, zzng1, s));
    }

    eApiClient(zznf zznf1, GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        zzalC = zznf1;
        zzalv = pendingintent;
        super(googleapiclient);
    }
}
