// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzs, OpenContentsRequest, zzbi, 
//            zzak, DriveServiceResponse

public class zzu extends zzz
    implements DriveFile
{
    private static class zza
        implements com.google.android.gms.drive.DriveFile.DownloadProgressListener
    {

        private final zzi zzafi;

        public void onProgress(long l, long l1)
        {
            zzafi.zza(new com.google.android.gms.common.api.zzi.zzb(this, l, l1) {

                final long zzafj;
                final long zzafk;
                final zza zzafl;

                public void zza(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
                {
                    downloadprogresslistener.onProgress(zzafj, zzafk);
                }

                public void zzmw()
                {
                }

                public void zzn(Object obj)
                {
                    zza((com.google.android.gms.drive.DriveFile.DownloadProgressListener)obj);
                }

            
            {
                zzafl = zza1;
                zzafj = l;
                zzafk = l1;
                super();
            }
            });
        }

        public zza(zzi zzi1)
        {
            zzafi = zzi1;
        }
    }


    public zzu(DriveId driveid)
    {
        super(driveid);
    }

    private static com.google.android.gms.drive.DriveFile.DownloadProgressListener zza(GoogleApiClient googleapiclient, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (downloadprogresslistener == null)
        {
            return null;
        } else
        {
            return new zza(googleapiclient.zzo(downloadprogresslistener));
        }
    }

    public PendingResult open(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
        {
            throw new IllegalArgumentException("Invalid mode provided.");
        } else
        {
            return googleapiclient.zza(new zzq.zzb(googleapiclient, i, zza(googleapiclient, downloadprogresslistener)) {

                final int zzaeI;
                final com.google.android.gms.drive.DriveFile.DownloadProgressListener zzafg;
                final zzu zzafh;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    setCancelToken(zzs1.zzpB().zza(new OpenContentsRequest(zzafh.getDriveId(), zzaeI, 0), new zzbi(this, zzafg)).zzpF());
                }

            
            {
                zzafh = zzu.this;
                zzaeI = i;
                zzafg = downloadprogresslistener;
                super(googleapiclient);
            }
            });
        }
    }
}
