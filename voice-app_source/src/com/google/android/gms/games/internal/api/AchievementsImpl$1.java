// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

class adImpl extends adImpl
{

    final boolean zzaqy;
    final AchievementsImpl zzaqz;

    public volatile void zza(com.google.android.gms.common.api.sImpl._cls1 _pcls1)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls1);
    }

    public void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzc(this, zzaqy);
    }

    adImpl(AchievementsImpl achievementsimpl, GoogleApiClient googleapiclient, boolean flag)
    {
        zzaqz = achievementsimpl;
        zzaqy = flag;
        super(googleapiclient, null);
    }
}
