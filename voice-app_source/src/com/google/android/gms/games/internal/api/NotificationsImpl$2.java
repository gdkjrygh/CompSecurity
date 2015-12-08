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

class _cls1.zzOl extends com.google.android.gms.games.thodImpl
{

    final String zzarm;

    public Result createFailedResult(Status status)
    {
        return zzaf(status);
    }

    protected volatile void zza(com.google.android.gms.common.api.sImpl._cls2 _pcls2)
        throws RemoteException
    {
        zza((GamesClientImpl)_pcls2);
    }

    protected void zza(GamesClientImpl gamesclientimpl)
        throws RemoteException
    {
        gamesclientimpl.zzd(this, zzarm, false);
    }

    public com.google.android.gms.games.teStatusChangeResult zzaf(Status status)
    {
        return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(status) {

            final Status zzOl;
            final NotificationsImpl._cls2 zzaro;

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzaro = NotificationsImpl._cls2.this;
                zzOl = status;
                super();
            }
        };
    }
}
