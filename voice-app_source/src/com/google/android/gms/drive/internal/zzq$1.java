// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq, zzs, QueryRequest, zzak

class lient extends g
{

    final Query zzaeG;
    final zzq zzaeH;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new QueryRequest(zzaeG), new i(this));
    }

    lient(zzq zzq1, GoogleApiClient googleapiclient, Query query)
    {
        zzaeH = zzq1;
        zzaeG = query;
        super(googleapiclient);
    }
}
