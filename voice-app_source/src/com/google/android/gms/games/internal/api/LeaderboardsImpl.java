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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl
    implements Leaderboards
{
    private static abstract class LoadMetadataImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzab(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult zzab(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(this, status) {

                final Status zzOl;
                final LoadMetadataImpl zzari;

                public LeaderboardBuffer getLeaderboards()
                {
                    return new LeaderboardBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzari = loadmetadataimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadMetadataImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadPlayerScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzac(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult zzac(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(this, status) {

                final Status zzOl;
                final LoadPlayerScoreImpl zzarj;

                public LeaderboardScore getScore()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarj = loadplayerscoreimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadPlayerScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadScoresImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzad(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult zzad(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult(this, status) {

                final Status zzOl;
                final LoadScoresImpl zzark;

                public Leaderboard getLeaderboard()
                {
                    return null;
                }

                public LeaderboardScoreBuffer getScores()
                {
                    return new LeaderboardScoreBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzark = loadscoresimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadScoresImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    protected static abstract class SubmitScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzae(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult zzae(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(this, status) {

                final Status zzOl;
                final SubmitScoreImpl zzarl;

                public ScoreSubmissionData getScoreData()
                {
                    return new ScoreSubmissionData(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzarl = submitscoreimpl;
                zzOl = status;
                super();
            }
            };
        }

        protected SubmitScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public LeaderboardsImpl()
    {
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsz();
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s)
    {
        return getLeaderboardIntent(googleapiclient, s, -1);
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s, int i)
    {
        return Games.zzd(googleapiclient).zzo(s, i);
    }

    public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleapiclient, String s, int i, int j)
    {
        return googleapiclient.zza(new LoadPlayerScoreImpl(googleapiclient, s, i, j) {

            final LeaderboardsImpl zzaqZ;
            final String zzara;
            final int zzarb;
            final int zzarc;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, null, zzara, zzarb, zzarc);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzara = s;
                zzarb = i;
                zzarc = j;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.zza(new LoadMetadataImpl(googleapiclient, s, flag) {

            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzara, zzaqy);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzara = s;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadMetadataImpl(googleapiclient, flag) {

            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzaqy);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, leaderboardscorebuffer, i, j) {

            final LeaderboardsImpl zzaqZ;
            final int zzard;
            final LeaderboardScoreBuffer zzare;
            final int zzarf;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzare, zzard, zzarf);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzare = leaderboardscorebuffer;
                zzard = i;
                zzarf = j;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadPlayerCenteredScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;
            final int zzarb;
            final int zzarc;
            final int zzard;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzara, zzarb, zzarc, zzard, zzaqy);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzara = s;
                zzarb = i;
                zzarc = j;
                zzard = k;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadTopScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;
            final int zzarb;
            final int zzarc;
            final int zzard;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzara, zzarb, zzarc, zzard, zzaqy);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzara = s;
                zzarb = i;
                zzarc = j;
                zzard = k;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l)
    {
        submitScore(googleapiclient, s, l, null);
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        googleapiclient.zza(null, s, l, s1);
        return;
        googleapiclient;
        GamesLog.zzu("LeaderboardsImpl", "service died");
        return;
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l)
    {
        return submitScoreImmediate(googleapiclient, s, l, null);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        return googleapiclient.zzb(new SubmitScoreImpl(googleapiclient, s, l, s1) {

            final LeaderboardsImpl zzaqZ;
            final String zzara;
            final long zzarg;
            final String zzarh;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzara, zzarg, zzarh);
            }

            
            {
                zzaqZ = LeaderboardsImpl.this;
                zzara = s;
                zzarg = l;
                zzarh = s1;
                super(googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$10

/* anonymous class */
    class _cls10 extends LoadScoresImpl
    {

        final String zzaqA;
        final boolean zzaqy;
        final String zzara;
        final int zzarb;
        final int zzarc;
        final int zzard;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqA, zzara, zzarb, zzarc, zzard, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$11

/* anonymous class */
    class _cls11 extends LoadScoresImpl
    {

        final String zzaqA;
        final boolean zzaqy;
        final String zzara;
        final int zzarb;
        final int zzarc;
        final int zzard;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzaqA, zzara, zzarb, zzarc, zzard, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$8

/* anonymous class */
    class _cls8 extends LoadMetadataImpl
    {

        final String zzaqA;
        final boolean zzaqy;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzaqA, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$9

/* anonymous class */
    class _cls9 extends LoadMetadataImpl
    {

        final String zzaqA;
        final boolean zzaqy;
        final String zzara;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqA, zzara, zzaqy);
        }
    }

}
