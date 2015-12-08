// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzpd

class eApiClient extends a
{

    final zzpd zzaHC;
    final String zzaHD;
    final Uri zzaHE;
    final String zzaHF;
    final String zzaHG;
    final int zzard;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zze)ent);
    }

    protected void zza(zze zze1)
    {
        zze1.zza(this, zzard, zzaHD, zzaHE, zzaHF, zzaHG);
    }

    eApiClient(zzpd zzpd1, GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2)
    {
        zzaHC = zzpd1;
        zzard = i;
        zzaHD = s;
        zzaHE = uri;
        zzaHF = s1;
        zzaHG = s2;
        super(googleapiclient, null);
    }
}
