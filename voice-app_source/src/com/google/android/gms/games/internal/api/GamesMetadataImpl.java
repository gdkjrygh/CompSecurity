// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl
    implements GamesMetadata
{
    private static abstract class LoadGameInstancesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzX(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult zzX(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult(this, status) {

                final Status zzOl;
                final LoadGameInstancesImpl zzaqS;

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqS = loadgameinstancesimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzY(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult zzY(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult(this, status) {

                final Status zzOl;
                final LoadGameSearchSuggestionsImpl zzaqT;

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqT = loadgamesearchsuggestionsimpl;
                zzOl = status;
                super();
            }
            };
        }
    }

    private static abstract class LoadGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzZ(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGamesResult zzZ(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(this, status) {

                final Status zzOl;
                final LoadGamesImpl zzaqU;

                public GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqU = loadgamesimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadGamesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public GamesMetadataImpl()
    {
    }

    public Game getCurrentGame(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsy();
    }

    public PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new LoadGamesImpl(googleapiclient) {

            final GamesMetadataImpl zzaqQ;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzf(this);
            }

            
            {
                zzaqQ = GamesMetadataImpl.this;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$2

/* anonymous class */
    class _cls2 extends LoadGameInstancesImpl
    {

        final String zzaqA;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzj(this, zzaqA);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$3

/* anonymous class */
    class _cls3 extends LoadGameSearchSuggestionsImpl
    {

        final String zzaqR;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzk(this, zzaqR);
        }
    }

}
