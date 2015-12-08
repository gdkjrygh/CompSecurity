// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl
    implements Acls
{
    private static abstract class LoadNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzU(status);
        }

        public com.google.android.gms.games.internal.game.Acls.LoadAclResult zzU(Status status)
        {
            return AclsImpl.zzT(status);
        }
    }

    private static abstract class UpdateNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }
    }


    public AclsImpl()
    {
    }

    private static com.google.android.gms.games.internal.game.Acls.LoadAclResult zzS(Status status)
    {
        return new com.google.android.gms.games.internal.game.Acls.LoadAclResult(status) {

            final Status zzOl;

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzOl = status;
                super();
            }
        };
    }

    static com.google.android.gms.games.internal.game.Acls.LoadAclResult zzT(Status status)
    {
        return zzS(status);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$2

/* anonymous class */
    class _cls2 extends LoadNotifyAclImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzg(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$3

/* anonymous class */
    class _cls3 extends UpdateNotifyAclImpl
    {

        final String zzaqF;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzn(this, zzaqF);
        }
    }

}
