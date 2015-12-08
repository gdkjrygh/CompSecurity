// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzay, zzbn

class t extends zzh
{

    final byte zzQu[];
    final String zzaZK;
    final String zzbaF;
    final zzay zzbaG;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzbn));
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zza(this, zzaZK, zzbaF, zzQu);
    }

    protected Result zzb(Status status)
    {
        return zzbt(status);
    }

    protected com.google.android.gms.wearable.Api.SendMessageResult zzbt(Status status)
    {
        return new b(status, -1);
    }

    t(zzay zzay1, GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        zzbaG = zzay1;
        zzaZK = s;
        zzbaF = s1;
        zzQu = abyte0;
        super(googleapiclient);
    }
}
