// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig, OnTurnBasedMatchUpdateReceivedListener, TurnBasedMatch, LoadMatchesResponse

public interface TurnBasedMultiplayer
{
    public static interface CancelMatchResult
        extends Result
    {

        public abstract String getMatchId();
    }

    public static interface InitiateMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }

    public static interface LeaveMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }

    public static interface LoadMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }

    public static interface LoadMatchesResult
        extends Releasable, Result
    {

        public abstract LoadMatchesResponse getMatches();
    }

    public static interface UpdateMatchResult
        extends Result
    {

        public abstract TurnBasedMatch getMatch();
    }


    public abstract PendingResult acceptInvitation(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult cancelMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult createMatch(GoogleApiClient googleapiclient, TurnBasedMatchConfig turnbasedmatchconfig);

    public abstract void declineInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void dismissInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void dismissMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult finishMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], List list);

    public transient abstract PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], ParticipantResult aparticipantresult[]);

    public abstract Intent getInboxIntent(GoogleApiClient googleapiclient);

    public abstract int getMaxMatchDataSize(GoogleApiClient googleapiclient);

    public abstract Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j);

    public abstract Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag);

    public abstract PendingResult leaveMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult leaveMatchDuringTurn(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult loadMatch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[]);

    public abstract PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[]);

    public abstract void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener);

    public abstract PendingResult rematch(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1);

    public abstract PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, List list);

    public transient abstract PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[]);

    public abstract void unregisterMatchUpdateListener(GoogleApiClient googleapiclient);
}
