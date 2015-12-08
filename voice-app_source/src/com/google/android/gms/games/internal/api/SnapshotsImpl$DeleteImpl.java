// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

private static abstract class <init> extends com.google.android.gms.games.mpl
{

    public Result createFailedResult(Status status)
    {
        return zzav(status);
    }

    public com.google.android.gms.games.snapshot.esult zzav(Status status)
    {
        return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(status) {

            final Status zzOl;
            final SnapshotsImpl.DeleteImpl zzasl;

            public String getSnapshotId()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzasl = SnapshotsImpl.DeleteImpl.this;
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
