// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            SnapshotsImpl

class enImpl extends enImpl
{

    final SnapshotsImpl zzasa;
    final String zzasb;
    final boolean zzasc;
    final int zzasd;

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls2 _pcls2)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls2);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zza(this, zzasb, zzasc, zzasd);
    }

    enImpl(SnapshotsImpl snapshotsimpl, GoogleApiClient googleapiclient, String s, boolean flag, int i)
    {
        zzasa = snapshotsimpl;
        zzasb = s;
        zzasc = flag;
        zzasd = i;
        super(googleapiclient, null);
    }
}
