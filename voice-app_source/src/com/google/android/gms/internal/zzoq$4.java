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

    final String val$name;
    final zzoq zzaFJ;
    final zzi zzaFL;
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
        zzop1.zza(this, val$name, zzaFs, zzarU, zzaFL, zzaFM);
    }

    eApiClient(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[], zzi zzi, zzi zzi1)
    {
        zzaFJ = final_zzoq1;
        val$name = s;
        zzaFs = s1;
        zzarU = abyte0;
        zzaFL = zzi;
        zzaFM = zzi1;
        super(googleapiclient, null);
    }
}
