// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, zzd, OnListParentsResponse, zzn, 
//            OnMetadataResponse, zzr, GetMetadataRequest, zzak, 
//            ListParentsRequest, SetResourceParentsRequest, zzbq, UpdateMetadataRequest, 
//            DeleteResourceRequest, TrashResourceRequest, UntrashResourceRequest

public class zzz
    implements DriveResource
{
    private static class zza extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.zzpR());
            zzOs.zzm(new zzq.zzf(Status.zzXP, onlistparentsresponse, false));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zzq.zzf(status, null, false));
        }

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzb extends com.google.android.gms.drive.internal.zzd
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            zzOs.zzm(new zzc(Status.zzXP, new zzn(onmetadataresponse.zzpS())));
        }

        public void zzt(Status status)
            throws RemoteException
        {
            zzOs.zzm(new zzc(status, null));
        }

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = zzb1;
        }
    }

    private static class zzc
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Status zzOt;
        private final Metadata zzafA;

        public Metadata getMetadata()
        {
            return zzafA;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public zzc(Status status, Metadata metadata)
        {
            zzOt = status;
            zzafA = metadata;
        }
    }

    private abstract class zzd extends zzr
    {

        final zzz zzafy;

        public Result createFailedResult(Status status)
        {
            return zzA(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult zzA(Status status)
        {
            return new zzc(status, null);
        }

        private zzd(GoogleApiClient googleapiclient)
        {
            zzafy = zzz.this;
            super(googleapiclient);
        }

    }


    protected final DriveId zzacT;

    protected zzz(DriveId driveid)
    {
        zzacT = driveid;
    }

    private PendingResult zza(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new zzd(googleapiclient, flag) {

            final boolean zzafx;
            final zzz zzafy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new GetMetadataRequest(zzafy.zzacT, zzafx), new zzb(this));
            }

            
            {
                zzafy = zzz.this;
                zzafx = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((zzs)googleapiclient.zza(Drive.zzNX)).zza(googleapiclient, zzacT, changelistener);
    }

    public PendingResult addChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((zzs)googleapiclient.zza(Drive.zzNX)).zza(googleapiclient, zzacT);
    }

    public PendingResult delete(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            final zzz zzafy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new DeleteResourceRequest(zzafy.zzacT), new zzbq(this));
            }

            
            {
                zzafy = zzz.this;
                super(googleapiclient);
            }
        });
    }

    public DriveId getDriveId()
    {
        return zzacT;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient, false);
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzq.zzg(googleapiclient) {

            final zzz zzafy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new ListParentsRequest(zzafy.zzacT), new zza(this));
            }

            
            {
                zzafy = zzz.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((zzs)googleapiclient.zza(Drive.zzNX)).zzb(googleapiclient, zzacT, changelistener);
    }

    public PendingResult removeChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((zzs)googleapiclient.zza(Drive.zzNX)).zzb(googleapiclient, zzacT);
    }

    public PendingResult setParents(GoogleApiClient googleapiclient, Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        if (set.isEmpty())
        {
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        } else
        {
            return googleapiclient.zzb(new zzr.zza(googleapiclient, new ArrayList(set)) {

                final zzz zzafy;
                final List zzafz;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zzpB().zza(new SetResourceParentsRequest(zzafy.zzacT, zzafz), new zzbq(this));
                }

            
            {
                zzafy = zzz.this;
                zzafz = list;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult trash(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            final zzz zzafy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new TrashResourceRequest(zzafy.zzacT), new zzbq(this));
            }

            
            {
                zzafy = zzz.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult untrash(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            final zzz zzafy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzs)client);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zzpB().zza(new UntrashResourceRequest(zzafy.zzacT), new zzbq(this));
            }

            
            {
                zzafy = zzz.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        } else
        {
            return googleapiclient.zzb(new zzd(googleapiclient, metadatachangeset) {

                final MetadataChangeSet zzafm;
                final zzz zzafy;

                protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((zzs)client);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzafm.zzpm().setContext(zzs1.getContext());
                    zzs1.zzpB().zza(new UpdateMetadataRequest(zzafy.zzacT, zzafm.zzpm()), new zzb(this));
                }

            
            {
                zzafy = zzz.this;
                zzafm = metadatachangeset;
                super(googleapiclient);
            }
            });
        }
    }
}
