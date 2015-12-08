// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq, zzs, GetMetadataRequest, zzak

class lient extends e
{

    final zzq zzaeH;
    final String zzaeJ;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new GetMetadataRequest(DriveId.zzcs(zzaeJ), false), new c(this));
    }

    lient(zzq zzq1, GoogleApiClient googleapiclient, String s)
    {
        zzaeH = zzq1;
        zzaeJ = s;
        super(googleapiclient);
    }
}
