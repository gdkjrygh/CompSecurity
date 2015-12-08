// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.internal.zze;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            zzpe

class eApiClient extends a
{

    final zzpe zzaHL;
    final Collection zzaHM;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zze)ent);
    }

    protected void zza(zze zze1)
    {
        zze1.zza(this, zzaHM);
    }

    eApiClient(zzpe zzpe1, GoogleApiClient googleapiclient, Collection collection)
    {
        zzaHL = zzpe1;
        zzaHM = collection;
        super(googleapiclient, null);
    }
}
