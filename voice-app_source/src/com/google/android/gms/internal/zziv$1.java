// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zziv, zziq

class eApiClient extends c
{

    final String zzNP;
    final UsageInfo zzNQ[];
    final zziv zzNR;

    protected void zza(zziq zziq1)
        throws RemoteException
    {
        zziq1.zza(new d(this), zzNP, zzNQ);
    }

    eApiClient(zziv zziv1, GoogleApiClient googleapiclient, String s, UsageInfo ausageinfo[])
    {
        zzNR = zziv1;
        zzNP = s;
        zzNQ = ausageinfo;
        super(googleapiclient);
    }
}
