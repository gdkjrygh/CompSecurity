// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzoq, zzop

class eApiClient extends c
{

    final zzoq zzaFJ;
    final zzi zzaFM;
    final String zzaFs;
    final byte zzarU[];

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzop)ent);
    }

    protected void zza(zzop zzop1)
        throws RemoteException
    {
        zzop1.zza(this, zzaFs, zzarU, zzaFM);
    }

    eApiClient(zzoq zzoq1, GoogleApiClient googleapiclient, String s, byte abyte0[], zzi zzi)
    {
        zzaFJ = zzoq1;
        zzaFs = s;
        zzarU = abyte0;
        zzaFM = zzi;
        super(googleapiclient, null);
    }
}
