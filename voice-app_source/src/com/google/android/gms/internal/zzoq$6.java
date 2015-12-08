// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzoq, zzop

class eApiClient extends c
{

    final zzoq zzaFJ;
    final String zzaFs;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzop)ent);
    }

    protected void zza(zzop zzop1)
        throws RemoteException
    {
        zzop1.zzp(this, zzaFs);
    }

    eApiClient(zzoq zzoq1, GoogleApiClient googleapiclient, String s)
    {
        zzaFJ = zzoq1;
        zzaFs = s;
        super(googleapiclient, null);
    }
}
