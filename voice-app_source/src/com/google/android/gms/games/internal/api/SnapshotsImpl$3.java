// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class mmitImpl extends mmitImpl
{

    final SnapshotsImpl zzasa;
    final Snapshot zzase;
    final SnapshotMetadataChange zzasf;

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls3);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zza(this, zzase, zzasf);
    }

    ge(SnapshotsImpl snapshotsimpl, GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        zzasa = snapshotsimpl;
        zzase = snapshot;
        zzasf = snapshotmetadatachange;
        super(googleapiclient, null);
    }
}
