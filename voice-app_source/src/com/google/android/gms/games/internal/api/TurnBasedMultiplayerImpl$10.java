// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

class dMatchImpl extends dMatchImpl
{

    final TurnBasedMultiplayerImpl zzasp;
    final String zzasq;

    protected volatile void zza(com.google.android.gms.common.api.Impl._cls10 _pcls10)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls10);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzg(this, zzasq);
    }

    dMatchImpl(TurnBasedMultiplayerImpl turnbasedmultiplayerimpl, GoogleApiClient googleapiclient, String s)
    {
        zzasp = turnbasedmultiplayerimpl;
        zzasq = s;
        super(googleapiclient, null);
    }
}
