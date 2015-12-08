// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            EventsImpl

class dateImpl extends dateImpl
{

    final EventsImpl zzaqL;
    final String zzaqM;
    final int zzaqN;

    public volatile void zza(com.google.android.gms.common.api.sImpl._cls3 _pcls3)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls3);
    }

    public void zza(GamesClientImpl gamesclientimpl)
    {
        gamesclientimpl.zzp(zzaqM, zzaqN);
    }

    dateImpl(EventsImpl eventsimpl, GoogleApiClient googleapiclient, String s, int i)
    {
        zzaqL = eventsimpl;
        zzaqM = s;
        zzaqN = i;
        super(googleapiclient, null);
    }
}
