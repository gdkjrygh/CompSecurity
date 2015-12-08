// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class enImpl extends enImpl
{

    final SnapshotsImpl zzasa;
    final SnapshotMetadataChange zzasf;
    final String zzash;
    final String zzasi;
    final SnapshotContents zzasj;

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls5 _pcls5)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls5);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zza(this, zzash, zzasi, zzasf, zzasj);
    }

    ge(SnapshotsImpl snapshotsimpl, GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        zzasa = snapshotsimpl;
        zzash = s;
        zzasi = s1;
        zzasf = snapshotmetadatachange;
        zzasj = snapshotcontents;
        super(googleapiclient, null);
    }
}
