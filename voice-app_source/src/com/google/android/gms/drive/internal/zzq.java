// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, zzw, zzu, zzr, 
//            zzd, OnDriveIdResponse, zzn, OnMetadataResponse, 
//            zzt, OnContentsResponse, OnListEntriesResponse, QueryRequest, 
//            zzak, CreateContentsRequest, GetMetadataRequest, zzbq

public class zzq
    implements DriveApi
{
    static class zza
        implements Releasable, com.google.android.gms.drive.DriveApi.DriveContentsResult
    {

        private final Status zzOt;
        private final DriveContents zzacW;

        public DriveContents getDriveContents()
        {
            return zzacW;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzacW != null)
            {
                zzacW.zzpf();
            }
        }

        public zza(Status status, DriveContents drivecontents)
        {
            zzOt = status;
            zzacW = drivecontents;
        }
    }

    static abstract class zzb extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzu(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveContentsResult zzu(Status status)
        {
            return new zza(status, null);
        }

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class zzc extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzOs.zzm(new zzd(Status.zzXP, ondriveidresponse.getDriveId()));
        }

        public void zza(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            zzOs.zzm(new zzd(Status.zzXP, (new zzn(onmetadataresponse.zzpS())).getDriveId()));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zzd(status, null));
        }

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzd
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        private final Status zzOt;
        private final DriveId zzacT;

        public DriveId getDriveId()
        {
            return zzacT;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzd(Status status, DriveId driveid)
        {
            zzOt = status;
            zzacT = driveid;
        }
    }

    static abstract class zze extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzv(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveIdResult zzv(Status status)
        {
            return new zzd(status, null);
        }

        zze(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class zzf
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        private final Status zzOt;
        private final MetadataBuffer zzaeK;
        private final boolean zzaeL;

        public MetadataBuffer getMetadataBuffer()
        {
            return zzaeK;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            if (zzaeK != null)
            {
                zzaeK.release();
            }
        }

        public zzf(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            zzOt = status;
            zzaeK = metadatabuffer;
            zzaeL = flag;
        }
    }

    static abstract class zzg extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzw(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult zzw(Status status)
        {
            return new zzf(status, null, false);
        }

        zzg(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class zzh extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            zzOs.zzm(new zza(Status.zzXP, new zzt(oncontentsresponse.zzpJ())));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zza(status, null));
        }

        public zzh(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzi extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.zzpP());
            zzOs.zzm(new zzf(Status.zzXP, metadatabuffer, onlistentriesresponse.zzpQ()));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zzf(status, null, false));
        }

        public zzi(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    static class zzj extends zzr.zza
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((zzs)client);
        }

        protected void zza(zzs zzs1)
        {
        }

        zzj(GoogleApiClient googleapiclient, Status status)
        {
            super(googleapiclient);
            setResult(status);
        }
    }


    public zzq()
    {
    }

    public PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        return ((zzs)googleapiclient.zza(Drive.zzNX)).cancelPendingActions(googleapiclient, list);
    }

    public PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zze(googleapiclient, s) {

            final zzq zzaeH;
            final String zzaeJ;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new GetMetadataRequest(DriveId.zzcs(zzaeJ), false), new zzc(this));
            }

            
            {
                zzaeH = zzq.this;
                zzaeJ = s;
                super(googleapiclient);
            }
        });
    }

    public DriveFolder getAppFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        }
        googleapiclient = ((zzs)googleapiclient.zza(Drive.zzNX)).zzpD();
        if (googleapiclient != null)
        {
            return new zzw(googleapiclient);
        } else
        {
            return null;
        }
    }

    public DriveFile getFile(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if (driveid == null)
        {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new zzu(driveid);
        }
    }

    public DriveFolder getFolder(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if (driveid == null)
        {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new zzw(driveid);
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new zzw(((zzs)googleapiclient.zza(Drive.zzNX)).zzpC());
        }
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder()
    {
        return new CreateFileActivityBuilder();
    }

    public PendingResult newDriveContents(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient, 0x20000000);
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder()
    {
        return new OpenFileActivityBuilder();
    }

    public PendingResult query(GoogleApiClient googleapiclient, Query query1)
    {
        if (query1 == null)
        {
            throw new IllegalArgumentException("Query must be provided.");
        } else
        {
            return googleapiclient.zza(new zzg(googleapiclient, query1) {

                final Query zzaeG;
                final zzq zzaeH;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new QueryRequest(zzaeG), new zzi(this));
                }

            
            {
                zzaeH = zzq.this;
                zzaeG = query1;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult requestSync(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            final zzq zzaeH;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new zzbq(this));
            }

            
            {
                zzaeH = zzq.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult zza(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new zzb(googleapiclient, i) {

            final zzq zzaeH;
            final int zzaeI;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new CreateContentsRequest(zzaeI), new zzh(this));
            }

            
            {
                zzaeH = zzq.this;
                zzaeI = i;
                super(googleapiclient);
            }
        });
    }
}
