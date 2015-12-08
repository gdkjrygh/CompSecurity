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

    final String zzaFE;
    final long zzaFH;
    final zzoq zzaFJ;
    final zzi zzaFK;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzop)ent);
    }

    protected void zza(zzop zzop1)
        throws RemoteException
    {
        zzop1.zza(this, zzaFE, zzaFH, zzaFK);
    }

    eApiClient(zzoq zzoq1, GoogleApiClient googleapiclient, String s, long l, zzi zzi)
    {
        zzaFJ = zzoq1;
        zzaFE = s;
        zzaFH = l;
        zzaFK = zzi;
        super(googleapiclient, null);
    }
}
