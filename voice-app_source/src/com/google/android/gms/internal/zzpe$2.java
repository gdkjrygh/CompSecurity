// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzpe

class eApiClient extends a
{

    final String zzaHD;
    final zzpe zzaHL;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zze)ent);
    }

    protected void zza(zze zze1)
    {
        setCancelToken(zze1.zzq(this, zzaHD));
    }

    eApiClient(zzpe zzpe1, GoogleApiClient googleapiclient, String s)
    {
        zzaHL = zzpe1;
        zzaHD = s;
        super(googleapiclient, null);
    }
}
