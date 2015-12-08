// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzav, zzbk

class t extends zzf
{

    final byte zzOn[];
    final String zzaTI;
    final String zzaUC;
    final zzav zzaUD;

    protected Result createFailedResult(Status status)
    {
        return zzbh(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzbk)ent);
    }

    protected void zza(zzbk zzbk1)
        throws RemoteException
    {
        zzbk1.zza(this, zzaTI, zzaUC, zzOn);
    }

    protected com.google.android.gms.wearable.Api.SendMessageResult zzbh(Status status)
    {
        return new b(status, -1);
    }

    t(zzav zzav1, GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        zzaUD = zzav1;
        zzaTI = s;
        zzaUC = s1;
        zzOn = abyte0;
        super(googleapiclient);
    }
}
