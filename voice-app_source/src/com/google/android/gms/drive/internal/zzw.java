// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzt, zzq, zzd, 
//            zzu, OnDriveIdResponse, zzr, zzs, 
//            CreateFileRequest, zzak, CreateFolderRequest

public class zzw extends zzz
    implements DriveFolder
{
    private static class zza extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzOs.zzm(new zzc(Status.zzXP, new zzu(ondriveidresponse.getDriveId())));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zzc(status, null));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzb extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzOs.zzm(new zze(Status.zzXP, new zzw(ondriveidresponse.getDriveId())));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zze(status, null));
        }

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzc
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        private final Status zzOt;
        private final DriveFile zzafr;

        public DriveFile getDriveFile()
        {
            return zzafr;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzc(Status status, DriveFile drivefile)
        {
            zzOt = status;
            zzafr = drivefile;
        }
    }

    static abstract class zzd extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzx(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFileResult zzx(Status status)
        {
            return new zzc(status, null);
        }

        zzd(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class zze
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        private final Status zzOt;
        private final DriveFolder zzafs;

        public DriveFolder getDriveFolder()
        {
            return zzafs;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zze(Status status, DriveFolder drivefolder)
        {
            zzOt = status;
            zzafs = drivefolder;
        }
    }

    static abstract class zzf extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzy(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFolderResult zzy(Status status)
        {
            return new zze(status, null);
        }

        zzf(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzw(DriveId driveid)
    {
        super(driveid);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, int i, int j, ExecutionOptions executionoptions)
    {
        ExecutionOptions.zza(googleapiclient, executionoptions);
        return googleapiclient.zzb(new zzd(googleapiclient, metadatachangeset, i, j, executionoptions) {

            final MetadataChangeSet zzafm;
            final int zzafn;
            final int zzafo;
            final ExecutionOptions zzafp;
            final zzw zzafq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzafm.zzpm().setContext(zzs1.getContext());
                CreateFileRequest createfilerequest = new CreateFileRequest(zzafq.getDriveId(), zzafm.zzpm(), zzafn, zzafo, zzafp);
                zzs1.zzpB().zza(createfilerequest, new zza(this));
            }

            
            {
                zzafq = zzw.this;
                zzafm = metadatachangeset;
                zzafn = i;
                zzafo = j;
                zzafp = executionoptions;
                super(googleapiclient);
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        int i;
        if (drivecontents != null)
        {
            if (!(drivecontents instanceof zzt))
            {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (drivecontents.getDriveId() != null)
            {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (drivecontents.zzpg())
            {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            i = drivecontents.zzpe().getRequestId();
            drivecontents.zzpf();
        } else
        {
            i = 1;
        }
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if ("application/vnd.google-apps.folder".equals(metadatachangeset.getMimeType()))
        {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        } else
        {
            return zza(googleapiclient, metadatachangeset, i, 0, executionoptions);
        }
    }

    private Query zza(Query query)
    {
        com.google.android.gms.drive.query.Query.Builder builder = (new com.google.android.gms.drive.query.Query.Builder()).addFilter(Filters.in(SearchableField.PARENTS, getDriveId()));
        if (query != null)
        {
            if (query.getFilter() != null)
            {
                builder.addFilter(query.getFilter());
            }
            builder.setPageToken(query.getPageToken());
            builder.setSortOrder(query.getSortOrder());
        }
        return builder.build();
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents)
    {
        return createFile(googleapiclient, metadatachangeset, drivecontents, null);
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        if (executionoptions1.zzpk() != 0)
        {
            throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
        } else
        {
            return zza(googleapiclient, metadatachangeset, drivecontents, executionoptions1);
        }
    }

    public PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if (metadatachangeset.getMimeType() != null && !metadatachangeset.getMimeType().equals("application/vnd.google-apps.folder"))
        {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        } else
        {
            return googleapiclient.zzb(new zzf(googleapiclient, metadatachangeset) {

                final MetadataChangeSet zzafm;
                final zzw zzafq;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzafm.zzpm().setContext(zzs1.getContext());
                    zzs1.zzpB().zza(new CreateFolderRequest(zzafq.getDriveId(), zzafm.zzpm()), new zzb(this));
                }

            
            {
                zzafq = zzw.this;
                zzafm = metadatachangeset;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult listChildren(GoogleApiClient googleapiclient)
    {
        return queryChildren(googleapiclient, null);
    }

    public PendingResult queryChildren(GoogleApiClient googleapiclient, Query query)
    {
        return (new zzq()).query(googleapiclient, zza(query));
    }
}
