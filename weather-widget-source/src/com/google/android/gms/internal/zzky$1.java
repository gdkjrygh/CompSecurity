// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzky, zzla, zzlc

class eApiClient extends a
{

    final zzky zzaeu;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzla));
    }

    protected void zza(zzla zzla1)
        throws RemoteException
    {
        ((zzlc)zzla1.zzoA()).zza(new a(this));
    }

    eApiClient(zzky zzky1, GoogleApiClient googleapiclient)
    {
        zzaeu = zzky1;
        super(googleapiclient);
    }
}
