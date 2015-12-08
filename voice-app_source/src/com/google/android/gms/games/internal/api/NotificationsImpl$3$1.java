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
    implements com.google.android.gms.games.StatusLoadResult
{

    final Status zzOl;
    final zzOl zzarp;

    public Status getStatus()
    {
        return zzOl;
    }

    ult(ult ult, Status status)
    {
        zzarp = ult;
        zzOl = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$3

/* anonymous class */
    class NotificationsImpl._cls3 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        final String zzarm;

        public Result createFailedResult(Status status)
        {
            return zzag(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzo(this, zzarm);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusLoadResult zzag(Status status)
        {
            return new NotificationsImpl._cls3._cls1(this, status);
        }
    }

}
