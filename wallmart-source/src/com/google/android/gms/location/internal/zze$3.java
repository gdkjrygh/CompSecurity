// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zze, zzj

class nt extends a
{

    final zze zzaCI;
    final List zzaCJ;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzaCJ, this);
    }

    nt(zze zze1, GoogleApiClient googleapiclient, List list)
    {
        zzaCI = zze1;
        zzaCJ = list;
        super(googleapiclient);
    }
}
