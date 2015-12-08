// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzlg;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, OpenContentsRequest, zzbi, zzak, 
//            CloseContentsAndUpdateMetadataRequest, zzbq, zzx, CloseContentsRequest

public class zzt
    implements DriveContents
{

    private boolean mClosed;
    private final Contents zzafa;
    private boolean zzafb;
    private boolean zzafc;

    public zzt(Contents contents)
    {
        mClosed = false;
        zzafb = false;
        zzafc = false;
        zzafa = (Contents)zzu.zzu(contents);
    }

    static Contents zza(zzt zzt1)
    {
        return zzt1.zzafa;
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        return commit(googleapiclient, metadatachangeset, null);
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        if (zzafa.getMode() == 0x10000000)
        {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (ExecutionOptions.zzbX(executionoptions1.zzpk()) && !zzafa.zzpc())
        {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        ExecutionOptions.zza(googleapiclient, executionoptions1);
        if (zzpg())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (getDriveId() == null)
        {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (metadatachangeset == null)
        {
            metadatachangeset = MetadataChangeSet.zzads;
        }
        zzpf();
        return googleapiclient.zzb(new zzr.zza(googleapiclient, metadatachangeset, executionoptions1) {

            final zzt zzafd;
            final MetadataChangeSet zzafe;
            final ExecutionOptions zzaff;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzafe.zzpm().setContext(zzs1.getContext());
                zzs1.zzpB().zza(new CloseContentsAndUpdateMetadataRequest(zzt.zza(zzafd).getDriveId(), zzafe.zzpm(), zzt.zza(zzafd).getRequestId(), zzt.zza(zzafd).zzpc(), zzaff), new zzbq(this));
            }

            
            {
                zzafd = zzt.this;
                zzafe = metadatachangeset;
                zzaff = executionoptions;
                super(googleapiclient);
            }
        });
    }

    public void discard(GoogleApiClient googleapiclient)
    {
        if (zzpg())
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            zzpf();
            ((_cls4)googleapiclient.zzb(new zzr.zza(googleapiclient) {

                final zzt zzafd;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new CloseContentsRequest(zzt.zza(zzafd).getRequestId(), false), new zzbq(this));
                }

            
            {
                zzafd = zzt.this;
                super(googleapiclient);
            }
            })).setResultCallback(new ResultCallback() {

                final zzt zzafd;

                public void onResult(Result result)
                {
                    zzm((Status)result);
                }

                public void zzm(Status status)
                {
                    if (!status.isSuccess())
                    {
                        zzx.zzv("DriveContentsImpl", "Error discarding contents");
                        return;
                    } else
                    {
                        zzx.zzt("DriveContentsImpl", "Contents discarded");
                        return;
                    }
                }

            
            {
                zzafd = zzt.this;
                super();
            }
            });
            return;
        }
    }

    public DriveId getDriveId()
    {
        return zzafa.getDriveId();
    }

    public InputStream getInputStream()
    {
        if (zzpg())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (zzafa.getMode() != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (zzafb)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            zzafb = true;
            return zzafa.getInputStream();
        }
    }

    public int getMode()
    {
        return zzafa.getMode();
    }

    public OutputStream getOutputStream()
    {
        if (zzpg())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (zzafa.getMode() != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (zzafc)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            zzafc = true;
            return zzafa.getOutputStream();
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (zzpg())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return zzafa.getParcelFileDescriptor();
        }
    }

    public PendingResult reopenForWrite(GoogleApiClient googleapiclient)
    {
        if (zzpg())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (zzafa.getMode() != 0x10000000)
        {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else
        {
            zzpf();
            return googleapiclient.zza(new zzq.zzb(googleapiclient) {

                final zzt zzafd;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new OpenContentsRequest(zzafd.getDriveId(), 0x20000000, zzt.zza(zzafd).getRequestId()), new zzbi(this, null));
                }

            
            {
                zzafd = zzt.this;
                super(googleapiclient);
            }
            });
        }
    }

    public Contents zzpe()
    {
        return zzafa;
    }

    public void zzpf()
    {
        zzlg.zza(zzafa.getParcelFileDescriptor());
        mClosed = true;
    }

    public boolean zzpg()
    {
        return mClosed;
    }
}
