// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzd, zzj

class nt extends a
{

    final zzd zzaCC;
    final boolean zzaCD;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zzag(zzaCD);
        zza(((com.google.android.gms.common.api.Result) (Status.zzaaD)));
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, boolean flag)
    {
        zzaCC = zzd1;
        zzaCD = flag;
        super(googleapiclient);
    }
}
