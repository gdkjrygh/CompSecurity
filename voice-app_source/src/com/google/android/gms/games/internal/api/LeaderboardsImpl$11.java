// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

class dScoresImpl extends dScoresImpl
{

    final String zzaqA;
    final boolean zzaqy;
    final String zzara;
    final int zzarb;
    final int zzarc;
    final int zzard;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls11 _pcls11)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls11);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzb(this, zzaqA, zzara, zzarb, zzarc, zzard, zzaqy);
    }
}
