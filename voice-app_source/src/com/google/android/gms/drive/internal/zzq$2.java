// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq, zzs, CreateContentsRequest, zzak

class lient extends b
{

    final zzq zzaeH;
    final int zzaeI;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new CreateContentsRequest(zzaeI), new h(this));
    }

    lient(zzq zzq1, GoogleApiClient googleapiclient, int i)
    {
        zzaeH = zzq1;
        zzaeI = i;
        super(googleapiclient);
    }
}
