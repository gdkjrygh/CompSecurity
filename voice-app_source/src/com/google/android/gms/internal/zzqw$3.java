// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzqw, zzqx

class eApiClient extends com.google.android.gms.wallet.zzb
{

    final zzqw zzaSo;
    final FullWalletRequest zzaSq;
    final int zzaww;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzqx)ent);
    }

    protected void zza(zzqx zzqx1)
    {
        zzqx1.zza(zzaSq, zzaww);
        setResult(Status.zzXP);
    }

    eApiClient(zzqw zzqw1, GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i)
    {
        zzaSo = zzqw1;
        zzaSq = fullwalletrequest;
        zzaww = i;
        super(googleapiclient);
    }
}
