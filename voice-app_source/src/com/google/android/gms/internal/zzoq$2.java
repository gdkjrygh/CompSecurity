// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.internal:
//            zzoq, zzop

class eApiClient extends b
{

    final String val$name;
    final AppMetadata zzaFG;
    final long zzaFH;
    final zzi zzaFI;
    final zzoq zzaFJ;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzop)ent);
    }

    protected void zza(zzop zzop1)
        throws RemoteException
    {
        zzop1.zza(this, val$name, zzaFG, zzaFH, zzaFI);
    }

    eApiClient(GoogleApiClient googleapiclient, String s, AppMetadata appmetadata, long l, zzi zzi)
    {
        zzaFJ = final_zzoq1;
        val$name = s;
        zzaFG = appmetadata;
        zzaFH = l;
        zzaFI = zzi;
        super(googleapiclient, null);
    }
}
