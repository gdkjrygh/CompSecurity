// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl
    implements Notifications
{
    private static abstract class ContactSettingLoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzah(status);
        }

        public com.google.android.gms.games.Notifications.ContactSettingLoadResult zzah(Status status)
        {
            return new com.google.android.gms.games.Notifications.ContactSettingLoadResult(this, status) {

                final Status zzOl;
                final ContactSettingLoadImpl zzars;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzars = contactsettingloadimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class ContactSettingUpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
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

    private static abstract class InboxCountImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzai(status);
        }

        public com.google.android.gms.games.Notifications.InboxCountResult zzai(Status status)
        {
            return new com.google.android.gms.games.Notifications.InboxCountResult(this, status) {

                final Status zzOl;
                final InboxCountImpl zzart;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzart = inboxcountimpl;
                zzOl = status;
                super();
            }
            };
        }
    }


    public NotificationsImpl()
    {
    }

    public void clear(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzfD(i);
        }
    }

    public void clearAll(GoogleApiClient googleapiclient)
    {
        clear(googleapiclient, 31);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$1

/* anonymous class */
    class _cls1 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
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
            gamesclientimpl.zzd(this, zzarm, true);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult zzaf(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                final Status zzOl;
                final _cls1 zzarn;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarn = _pcls1;
                zzOl = status;
                super();
            }
            };
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$2

/* anonymous class */
    class _cls2 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
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
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                final Status zzOl;
                final _cls2 zzaro;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzaro = _pcls2;
                zzOl = status;
                super();
            }
            };
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$3

/* anonymous class */
    class _cls3 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
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
            return new com.google.android.gms.games.Notifications.GameMuteStatusLoadResult(this, status) {

                final Status zzOl;
                final _cls3 zzarp;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarp = _pcls3;
                zzOl = status;
                super();
            }
            };
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$4

/* anonymous class */
    class _cls4 extends ContactSettingLoadImpl
    {

        final boolean zzaqy;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzh(this, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$5

/* anonymous class */
    class _cls5 extends ContactSettingUpdateImpl
    {

        final boolean zzarq;
        final Bundle zzarr;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzarq, zzarr);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$6

/* anonymous class */
    class _cls6 extends InboxCountImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzh(this);
        }
    }

}
