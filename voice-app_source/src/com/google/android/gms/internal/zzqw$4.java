// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqw, zzqx

class eApiClient extends com.google.android.gms.wallet.zzb
{

    final zzqw zzaSo;
    final String zzaSr;
    final String zzaSs;
    final int zzaww;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzqx)ent);
    }

    protected void zza(zzqx zzqx1)
    {
        zzqx1.zze(zzaSr, zzaSs, zzaww);
        setResult(Status.zzXP);
    }

    eApiClient(zzqw zzqw1, GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        zzaSo = zzqw1;
        zzaSr = s;
        zzaSs = s1;
        zzaww = i;
        super(googleapiclient);
    }
}
