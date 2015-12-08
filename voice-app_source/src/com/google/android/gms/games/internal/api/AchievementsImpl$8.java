// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

class dateImpl extends dateImpl
{

    final String zzaqB;
    final int zzaqC;
    final AchievementsImpl zzaqz;

    public volatile void zza(com.google.android.gms.common.api.sImpl._cls8 _pcls8)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls8);
    }

    public void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzb(null, zzaqB, zzaqC);
    }

    dateImpl(AchievementsImpl achievementsimpl, String s, GoogleApiClient googleapiclient, String s1, int i)
    {
        zzaqz = achievementsimpl;
        zzaqB = s1;
        zzaqC = i;
        super(s, googleapiclient);
    }
}
