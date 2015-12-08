// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshot, SnapshotMetadataChange, SnapshotMetadata, SnapshotContents, 
//            SnapshotMetadataBuffer

public interface Snapshots
{
    public static interface CommitSnapshotResult
        extends Result
    {

        public abstract SnapshotMetadata getSnapshotMetadata();
    }

    public static interface DeleteSnapshotResult
        extends Result
    {

        public abstract String getSnapshotId();
    }

    public static interface LoadSnapshotsResult
        extends Releasable, Result
    {

        public abstract SnapshotMetadataBuffer getSnapshots();
    }

    public static interface OpenSnapshotResult
        extends Result
    {

        public abstract String getConflictId();

        public abstract Snapshot getConflictingSnapshot();

        public abstract SnapshotContents getResolutionSnapshotContents();

        public abstract Snapshot getSnapshot();
    }


    public static final int DISPLAY_LIMIT_NONE = -1;
    public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
    public static final int RESOLUTION_POLICY_MANUAL = -1;
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    public abstract PendingResult commitAndClose(GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange);

    public abstract PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata);

    public abstract void discardAndClose(GoogleApiClient googleapiclient, Snapshot snapshot);

    public abstract int getMaxCoverImageSize(GoogleApiClient googleapiclient);

    public abstract int getMaxDataSize(GoogleApiClient googleapiclient);

    public abstract Intent getSelectSnapshotIntent(GoogleApiClient googleapiclient, String s, boolean flag, boolean flag1, int i);

    public abstract SnapshotMetadata getSnapshotFromBundle(Bundle bundle);

    public abstract PendingResult load(GoogleApiClient googleapiclient, boolean flag);

    public abstract PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata);

    public abstract PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata, int i);

    public abstract PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag);

    public abstract PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag, int i);

    public abstract PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot);

    public abstract PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents);
}
