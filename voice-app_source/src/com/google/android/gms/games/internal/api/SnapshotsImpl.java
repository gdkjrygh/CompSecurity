// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl
    implements Snapshots
{
    private static abstract class CommitImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzau(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult zzau(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult(this, status) {

                final Status zzOl;
                final CommitImpl zzask;

                public SnapshotMetadata getSnapshotMetadata()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzask = commitimpl;
                zzOl = status;
                super();
            }
            };
        }

        private CommitImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzav(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult zzav(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(this, status) {

                final Status zzOl;
                final DeleteImpl zzasl;

                public String getSnapshotId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasl = deleteimpl;
                zzOl = status;
                super();
            }
            };
        }

        private DeleteImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaw(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult zzaw(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(this, status) {

                final Status zzOl;
                final LoadImpl zzasm;

                public SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzasm = loadimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class OpenImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzax(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult zzax(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(this, status) {

                final Status zzOl;
                final OpenImpl zzasn;

                public String getConflictId()
                {
                    return null;
                }

                public Snapshot getConflictingSnapshot()
                {
                    return null;
                }

                public SnapshotContents getResolutionSnapshotContents()
                {
                    return null;
                }

                public Snapshot getSnapshot()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasn = openimpl;
                zzOl = status;
                super();
            }
            };
        }

        private OpenImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public SnapshotsImpl()
    {
    }

    public PendingResult commitAndClose(GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        return googleapiclient.zzb(new CommitImpl(googleapiclient, snapshot, snapshotmetadatachange) {

            final SnapshotsImpl zzasa;
            final Snapshot zzase;
            final SnapshotMetadataChange zzasf;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzase, zzasf);
            }

            
            {
                zzasa = SnapshotsImpl.this;
                zzase = snapshot;
                zzasf = snapshotmetadatachange;
                super(googleapiclient);
            }
        });
    }

    public PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return googleapiclient.zzb(new DeleteImpl(googleapiclient, snapshotmetadata) {

            final SnapshotsImpl zzasa;
            final SnapshotMetadata zzasg;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzi(this, zzasg.getSnapshotId());
            }

            
            {
                zzasa = SnapshotsImpl.this;
                zzasg = snapshotmetadata;
                super(googleapiclient);
            }
        });
    }

    public void discardAndClose(GoogleApiClient googleapiclient, Snapshot snapshot)
    {
        Games.zzd(googleapiclient).zza(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsQ();
    }

    public int getMaxDataSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsP();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleapiclient, String s, boolean flag, boolean flag1, int i)
    {
        return Games.zzd(googleapiclient).zza(s, flag, flag1, i);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA"))
        {
            return null;
        } else
        {
            return (SnapshotMetadata)bundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA");
        }
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag) {

            final boolean zzaqy;
            final SnapshotsImpl zzasa;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zze(this, zzaqy);
            }

            
            {
                zzasa = SnapshotsImpl.this;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false);
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata, int i)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false, i);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return open(googleapiclient, s, flag, -1);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag, int i)
    {
        return googleapiclient.zzb(new OpenImpl(googleapiclient, s, flag, i) {

            final SnapshotsImpl zzasa;
            final String zzasb;
            final boolean zzasc;
            final int zzasd;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzasb, zzasc, zzasd);
            }

            
            {
                zzasa = SnapshotsImpl.this;
                zzasb = s;
                zzasc = flag;
                zzasd = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot)
    {
        SnapshotMetadata snapshotmetadata = snapshot.getMetadata();
        SnapshotMetadataChange snapshotmetadatachange = (new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder()).fromMetadata(snapshotmetadata).build();
        return resolveConflict(googleapiclient, s, snapshotmetadata.getSnapshotId(), snapshotmetadatachange, snapshot.getSnapshotContents());
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        return googleapiclient.zzb(new OpenImpl(googleapiclient, s, s1, snapshotmetadatachange, snapshotcontents) {

            final SnapshotsImpl zzasa;
            final SnapshotMetadataChange zzasf;
            final String zzash;
            final String zzasi;
            final SnapshotContents zzasj;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzash, zzasi, zzasf, zzasj);
            }

            
            {
                zzasa = SnapshotsImpl.this;
                zzash = s;
                zzasi = s1;
                zzasf = snapshotmetadatachange;
                zzasj = snapshotcontents;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/SnapshotsImpl$6

/* anonymous class */
    class _cls6 extends LoadImpl
    {

        final String zzTE;
        final String zzaqA;
        final boolean zzaqy;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzTE, zzaqA, zzaqy);
        }
    }

}
