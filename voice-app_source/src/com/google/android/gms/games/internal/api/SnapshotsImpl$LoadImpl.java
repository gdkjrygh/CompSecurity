// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.dImpl
{

    public Result createFailedResult(Status status)
    {
        return zzaw(status);
    }

    public com.google.android.gms.games.snapshot.Result zzaw(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(status) {

            final Status zzOl;
            final SnapshotsImpl.LoadImpl zzasm;

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
                zzasm = SnapshotsImpl.LoadImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.zzOl(GoogleApiClient googleapiclient, _cls1.zzOl zzol)
    {
        this(googleapiclient);
    }
}
