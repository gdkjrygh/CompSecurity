// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzlp

class eApiClient extends a
{

    final String zzazq;
    final int zzazx;
    final zzlp zzazy;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zze));
    }

    protected void zza(zze zze1)
    {
        setCancelToken(zze1.zza(this, zzazx, zzazq));
    }

    eApiClient(zzlp zzlp1, GoogleApiClient googleapiclient, int i, String s)
    {
        zzazy = zzlp1;
        zzazx = i;
        zzazq = s;
        super(googleapiclient, null);
    }
}
