// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zznh, zzni

class eApiClient extends com.google.android.gms.wallet.zzb
{

    final zznh zzaKf;
    final MaskedWalletRequest zzaKg;
    final int zzapk;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzni));
    }

    protected void zza(zzni zzni1)
    {
        zzni1.zza(zzaKg, zzapk);
        setResult(Status.zzQU);
    }

    eApiClient(zznh zznh1, GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i)
    {
        zzaKf = zznh1;
        zzaKg = maskedwalletrequest;
        zzapk = i;
        super(googleapiclient);
    }
}
