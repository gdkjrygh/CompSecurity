// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
    implements Players
{
    private static abstract class LoadPlayersImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaj(status);
        }

        public com.google.android.gms.games.Players.LoadPlayersResult zzaj(Status status)
        {
            return new com.google.android.gms.games.Players.LoadPlayersResult(this, status) {

                final Status zzOl;
                final LoadPlayersImpl zzarB;

                public PlayerBuffer getPlayers()
                {
                    return new PlayerBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzarB = loadplayersimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadPlayersImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected Result createFailedResult(Status status)
        {
            return zzak(status);
        }

        protected com.google.android.gms.games.Players.LoadProfileSettingsResult zzak(Status status)
        {
            return new com.google.android.gms.games.Players.LoadProfileSettingsResult(this, status) {

                final Status zzOl;
                final LoadProfileSettingsResultImpl zzarC;

                public Status getStatus()
                {
                    return zzOl;
                }

                public boolean isProfileVisible()
                {
                    return true;
                }

                public boolean isVisibilityExplicitlySet()
                {
                    return false;
                }

            
            {
                zzarC = loadprofilesettingsresultimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzal(status);
        }

        public com.google.android.gms.games.Players.LoadXpForGameCategoriesResult zzal(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult(this, status) {

                final Status zzOl;
                final LoadXpForGameCategoriesResultImpl zzarD;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarD = loadxpforgamecategoriesresultimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class LoadXpStreamResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzam(status);
        }

        public com.google.android.gms.games.Players.LoadXpStreamResult zzam(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpStreamResult(this, status) {

                final Status zzOl;
                final LoadXpStreamResultImpl zzarE;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarE = loadxpstreamresultimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }
    }


    public PlayersImpl()
    {
    }

    public Intent getCompareProfileIntent(GoogleApiClient googleapiclient, Player player)
    {
        return Games.zzd(googleapiclient).zza(new PlayerEntity(player));
    }

    public Player getCurrentPlayer(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsx();
    }

    public String getCurrentPlayerId(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsw();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsH();
    }

    public PendingResult loadConnectedPlayers(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, flag) {

            final boolean zzaqy;
            final PlayersImpl zzaru;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzaqy);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadInvitablePlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i, flag) {

            final boolean zzaqy;
            final PlayersImpl zzaru;
            final int zzarv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzarv, false, zzaqy);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzarv = i;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMoreInvitablePlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i) {

            final PlayersImpl zzaru;
            final int zzarv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzarv, true, false);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzarv = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i) {

            final PlayersImpl zzaru;
            final int zzarv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, "played_with", zzarv, true, false);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzarv = i;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPlayer(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, s) {

            final String zzTE;
            final PlayersImpl zzaru;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzTE, false);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzTE = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPlayer(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, s, flag) {

            final String zzTE;
            final boolean zzaqy;
            final PlayersImpl zzaru;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzTE, zzaqy);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzTE = s;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i, flag) {

            final boolean zzaqy;
            final PlayersImpl zzaru;
            final int zzarv;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, "played_with", zzarv, false, zzaqy);
            }

            
            {
                zzaru = PlayersImpl.this;
                zzarv = i;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$10

/* anonymous class */
    class _cls10 extends LoadPlayersImpl
    {

        final String zzaqA;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "nearby", zzaqA, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$11

/* anonymous class */
    class _cls11 extends LoadPlayersImpl
    {

        final String zzaqA;
        final boolean zzaqy;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "played_with", zzaqA, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$12

/* anonymous class */
    class _cls12 extends LoadPlayersImpl
    {

        final String zzaqA;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "played_with", zzaqA, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$13

/* anonymous class */
    class _cls13 extends LoadPlayersImpl
    {

        final boolean zzaqy;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$14

/* anonymous class */
    class _cls14 extends LoadPlayersImpl
    {

        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$15

/* anonymous class */
    class _cls15 extends LoadPlayersImpl
    {

        final boolean zzaqy;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$16

/* anonymous class */
    class _cls16 extends LoadPlayersImpl
    {

        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$17

/* anonymous class */
    class _cls17 extends LoadPlayersImpl
    {

        final boolean zzaqy;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$18

/* anonymous class */
    class _cls18 extends LoadPlayersImpl
    {

        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$19

/* anonymous class */
    class _cls19 extends LoadPlayersImpl
    {

        final String zzaqR;
        final boolean zzaqy;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzaqR, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$20

/* anonymous class */
    class _cls20 extends LoadPlayersImpl
    {

        final String zzaqR;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzaqR, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$21

/* anonymous class */
    class _cls21 extends LoadPlayersImpl
    {

        final boolean zzaqy;
        final String zzarm;
        final int zzarv;
        final String zzarw;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzarw, zzarm, zzarv, false, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$22

/* anonymous class */
    class _cls22 extends LoadPlayersImpl
    {

        final String zzarm;
        final int zzarv;
        final String zzarw;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzarw, zzarm, zzarv, true, false);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$23

/* anonymous class */
    class _cls23 extends LoadXpForGameCategoriesResultImpl
    {

        final String zzarx;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzl(this, zzarx);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$24

/* anonymous class */
    class _cls24 extends LoadXpStreamResultImpl
    {

        final String zzarx;
        final int zzary;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzarx, zzary);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$25

/* anonymous class */
    class _cls25 extends LoadXpStreamResultImpl
    {

        final String zzarx;
        final int zzary;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzarx, zzary);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$26

/* anonymous class */
    class _cls26 extends LoadProfileSettingsResultImpl
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
            gamesclientimpl.zzf(this, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$27

/* anonymous class */
    class _cls27 extends UpdateProfileSettingsResultImpl
    {

        final boolean zzarz;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzg(this, zzarz);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$3

/* anonymous class */
    class _cls3 extends LoadPlayersImpl
    {

        final String zzarA[];

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzarA);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$9

/* anonymous class */
    class _cls9 extends LoadPlayersImpl
    {

        final String zzaqA;
        final int zzarv;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "nearby", zzaqA, zzarv, false, false);
        }
    }

}
