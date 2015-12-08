// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            QuestsImpl

class adsImpl extends adsImpl
{

    final boolean zzaqy;
    final QuestsImpl zzarG;
    final String zzarJ[];

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls4 _pcls4)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls4);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzb(this, zzaqy, zzarJ);
    }

    adsImpl(QuestsImpl questsimpl, GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        zzarG = questsimpl;
        zzaqy = flag;
        zzarJ = as;
        super(googleapiclient, null);
    }
}
