// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl
    implements TurnBasedMultiplayer
{
    private static abstract class CancelMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String zzKI;

        static String zza(CancelMatchImpl cancelmatchimpl)
        {
            return cancelmatchimpl.zzKI;
        }

        public Result createFailedResult(Status status)
        {
            return zzay(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult zzay(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(this, status) {

                final Status zzOl;
                final CancelMatchImpl zzasw;

                public String getMatchId()
                {
                    return CancelMatchImpl.zza(zzasw);
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasw = cancelmatchimpl;
                zzOl = status;
                super();
            }
            };
        }

        public CancelMatchImpl(String s, GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzKI = s;
        }
    }

    private static abstract class InitiateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaz(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult zzaz(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult(this, status) {

                final Status zzOl;
                final InitiateMatchImpl zzasx;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasx = initiatematchimpl;
                zzOl = status;
                super();
            }
            };
        }

        private InitiateMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LeaveMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaA(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult zzaA(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult(this, status) {

                final Status zzOl;
                final LeaveMatchImpl zzasy;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasy = leavematchimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LeaveMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaB(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult zzaB(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult(this, status) {

                final Status zzOl;
                final LoadMatchImpl zzasz;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasz = loadmatchimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadMatchesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaC(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult zzaC(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult(this, status) {

                final Status zzOl;
                final LoadMatchesImpl zzasA;

                public LoadMatchesResponse getMatches()
                {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzasA = loadmatchesimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadMatchesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaD(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult zzaD(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult(this, status) {

                final Status zzOl;
                final UpdateMatchImpl zzasB;

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzasB = updatematchimpl;
                zzOl = status;
                super();
            }
            };
        }

        private UpdateMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public TurnBasedMultiplayerImpl()
    {
    }

    public PendingResult acceptInvitation(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, s) {

            final String zzaqX;
            final TurnBasedMultiplayerImpl zzasp;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzd(this, zzaqX);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzaqX = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult cancelMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new CancelMatchImpl(s, googleapiclient, s) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzf(this, zzasq);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s1;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult createMatch(GoogleApiClient googleapiclient, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, turnbasedmatchconfig) {

            final TurnBasedMatchConfig zzaso;
            final TurnBasedMultiplayerImpl zzasp;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzaso);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzaso = turnbasedmatchconfig;
                super(googleapiclient);
            }
        });
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzr(s, 1);
        }
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzq(s, 1);
        }
    }

    public void dismissMatch(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzcN(s);
        }
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s)
    {
        return finishMatch(googleapiclient, s, null, (ParticipantResult[])null);
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        }
        return finishMatch(googleapiclient, s, abyte0, ((ParticipantResult []) (list)));
    }

    public transient PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        return googleapiclient.zzb(new UpdateMatchImpl(googleapiclient, s, abyte0, aparticipantresult) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final byte zzast[];
            final ParticipantResult zzasv[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzasq, zzast, zzasv);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                zzast = abyte0;
                zzasv = aparticipantresult;
                super(googleapiclient);
            }
        });
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsB();
    }

    public int getMaxMatchDataSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsL();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j)
    {
        return Games.zzd(googleapiclient).zzb(i, j, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag)
    {
        return Games.zzd(googleapiclient).zzb(i, j, flag);
    }

    public PendingResult leaveMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new LeaveMatchImpl(googleapiclient, s) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zze(this, zzasq);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult leaveMatchDuringTurn(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.zzb(new LeaveMatchImpl(googleapiclient, s, s1) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final String zzasu;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzasq, zzasu);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                zzasu = s1;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new LoadMatchImpl(googleapiclient, s) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzg(this, zzasq);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[])
    {
        return googleapiclient.zza(new LoadMatchesImpl(googleapiclient, i, ai) {

            final TurnBasedMultiplayerImpl zzasp;
            final int zzasr;
            final int zzass[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzasr, zzass);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasr = i;
                zzass = ai;
                super(googleapiclient);
            }
        });
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[])
    {
        return loadMatchesByStatus(googleapiclient, 0, ai);
    }

    public void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if (gamesclientimpl != null)
        {
            gamesclientimpl.zzb(googleapiclient.zzo(onturnbasedmatchupdatereceivedlistener));
        }
    }

    public PendingResult rematch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, s) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzc(this, zzasq);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1)
    {
        return takeTurn(googleapiclient, s, abyte0, s1, (ParticipantResult[])null);
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        }
        return takeTurn(googleapiclient, s, abyte0, s1, ((ParticipantResult []) (list)));
    }

    public transient PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        return googleapiclient.zzb(new UpdateMatchImpl(googleapiclient, s, abyte0, s1, aparticipantresult) {

            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final byte zzast[];
            final String zzasu;
            final ParticipantResult zzasv[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzasq, zzast, zzasu, zzasv);
            }

            
            {
                zzasp = TurnBasedMultiplayerImpl.this;
                zzasq = s;
                zzast = abyte0;
                zzasu = s1;
                zzasv = aparticipantresult;
                super(googleapiclient);
            }
        });
    }

    public void unregisterMatchUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzsE();
        }
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$11

/* anonymous class */
    class _cls11 extends InitiateMatchImpl
    {

        final String zzaqA;
        final String zzasq;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzaqA, zzasq);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$12

/* anonymous class */
    class _cls12 extends InitiateMatchImpl
    {

        final String zzaqA;
        final String zzasq;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzaqA, zzasq);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$13

/* anonymous class */
    class _cls13 extends LoadMatchesImpl
    {

        final String zzaqA;
        final int zzasr;
        final int zzass[];

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqA, zzasr, zzass);
        }
    }

}
