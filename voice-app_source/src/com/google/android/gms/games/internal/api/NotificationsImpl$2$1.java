// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

class zzOl
    implements com.google.android.gms.games.StatusChangeResult
{

    final Status zzOl;
    final zzOl zzaro;

    public Status getStatus()
    {
        return zzOl;
    }

    esult(esult esult, Status status)
    {
        zzaro = esult;
        zzOl = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$2

/* anonymous class */
    class NotificationsImpl._cls2 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String zzarm;

        public Result createFailedResult(Status status)
        {
            return zzaf(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzarm, false);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult zzaf(Status status)
        {
            return new NotificationsImpl._cls2._cls1(this, status);
        }
    }

}
