// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AppContentsImpl
    implements AppContents
{
    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzV(status);
        }

        public com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult zzV(Status status)
        {
            return new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult(this, status) {

                final Status zzOl;
                final LoadsImpl zzaqJ;

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqJ = loadsimpl;
                zzOl = status;
                super();
            }
            };
        }
    }


    public AppContentsImpl()
    {
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AppContentsImpl$1

/* anonymous class */
    class _cls1 extends LoadsImpl
    {

        final int zzaqG;
        final String zzaqH;
        final String zzaqI[];
        final boolean zzaqy;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqG, zzaqH, zzaqI, zzaqy);
        }
    }

}
