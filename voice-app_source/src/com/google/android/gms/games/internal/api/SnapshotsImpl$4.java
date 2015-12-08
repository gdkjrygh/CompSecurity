// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class leteImpl extends leteImpl
{

    final SnapshotsImpl zzasa;
    final SnapshotMetadata zzasg;

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls4 _pcls4)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls4);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzi(this, zzasg.getSnapshotId());
    }

    leteImpl(SnapshotsImpl snapshotsimpl, GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        zzasa = snapshotsimpl;
        zzasg = snapshotmetadata;
        super(googleapiclient, null);
    }
}
