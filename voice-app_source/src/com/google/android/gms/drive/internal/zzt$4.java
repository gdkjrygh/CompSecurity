// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzt, zzs, CloseContentsRequest, zzbq, 
//            zzak

class lient extends a
{

    final zzt zzafd;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        zzs1.zzpB().zza(new CloseContentsRequest(zzt.zza(zzafd).getRequestId(), false), new zzbq(this));
    }

    lient(zzt zzt1, GoogleApiClient googleapiclient)
    {
        zzafd = zzt1;
        super(googleapiclient);
    }
}
