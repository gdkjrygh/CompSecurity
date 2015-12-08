// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

class dImpl extends dImpl
{

    final String zzTE;
    final String zzaqA;
    final boolean zzaqy;

    public volatile void zza(com.google.android.gms.common.api.Impl._cls10 _pcls10)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls10);
    }

    public void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzb(this, zzTE, zzaqA, zzaqy);
    }
}
