// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv, zzgq

class eApiClient extends c
{

    final String zzJT;
    final UsageInfo zzJU[];
    final zzgv zzJV;

    protected void zza(zzgq zzgq1)
        throws RemoteException
    {
        zzgq1.zza(new d(this), zzJT, zzJU);
    }

    eApiClient(zzgv zzgv1, GoogleApiClient googleapiclient, String s, UsageInfo ausageinfo[])
    {
        zzJV = zzgv1;
        zzJT = s;
        zzJU = ausageinfo;
        super(googleapiclient);
    }
}
