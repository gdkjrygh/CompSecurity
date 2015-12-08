// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

class adPlayerScoreImpl extends adPlayerScoreImpl
{

    final LeaderboardsImpl zzaqZ;
    final String zzara;
    final int zzarb;
    final int zzarc;

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls3);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zza(this, null, zzara, zzarb, zzarc);
    }

    adPlayerScoreImpl(LeaderboardsImpl leaderboardsimpl, GoogleApiClient googleapiclient, String s, int i, int j)
    {
        zzaqZ = leaderboardsimpl;
        zzara = s;
        zzarb = i;
        zzarc = j;
        super(googleapiclient, null);
    }
}
