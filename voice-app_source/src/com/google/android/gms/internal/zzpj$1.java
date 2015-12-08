// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzpj, zzpk

class eApiClient extends b
{

    final zzpj zzaJA;
    final byte zzaJz[];

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzpk)ent);
    }

    protected void zza(zzpk zzpk1)
        throws RemoteException
    {
        zzpk1.zza(zzaJC, zzaJz);
    }

    eApiClient(zzpj zzpj1, GoogleApiClient googleapiclient, byte abyte0[])
    {
        zzaJA = zzpj1;
        zzaJz = abyte0;
        super(googleapiclient);
    }
}
