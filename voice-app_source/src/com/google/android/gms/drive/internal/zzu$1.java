// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzu, zzs, OpenContentsRequest, zzbi, 
//            zzak, DriveServiceResponse

class lient extends b
{

    final int zzaeI;
    final com.google.android.gms.drive.ile.DownloadProgressListener zzafg;
    final zzu zzafh;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzs)ient);
    }

    protected void zza(zzs zzs1)
        throws RemoteException
    {
        setCancelToken(zzs1.zzpB().zza(new OpenContentsRequest(zzafh.getDriveId(), zzaeI, 0), new zzbi(this, zzafg)).zzpF());
    }

    lient(zzu zzu1, GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.ile.DownloadProgressListener downloadprogresslistener)
    {
        zzafh = zzu1;
        zzaeI = i;
        zzafg = downloadprogresslistener;
        super(googleapiclient);
    }
}
