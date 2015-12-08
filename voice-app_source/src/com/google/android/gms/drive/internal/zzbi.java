// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzd, OnContentsResponse, zzt, OnDownloadProgressResponse

class zzbi extends zzd
{

    private final com.google.android.gms.common.api.zza.zzb zzOs;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener zzags;

    zzbi(com.google.android.gms.common.api.zza.zzb zzb, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        zzOs = zzb;
        zzags = downloadprogresslistener;
    }

    public void zza(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        Status status;
        if (oncontentsresponse.zzpK())
        {
            status = new Status(-1);
        } else
        {
            status = Status.zzXP;
        }
        zzOs.zzm(new zzq.zza(status, new zzt(oncontentsresponse.zzpJ())));
    }

    public void zza(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
        if (zzags != null)
        {
            zzags.onProgress(ondownloadprogressresponse.zzpM(), ondownloadprogressresponse.zzpN());
        }
    }

    public void zzt(Status status)
        throws RemoteException
    {
        zzOs.zzm(new zzq.zza(status, null));
    }
}
