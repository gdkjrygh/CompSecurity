// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.leaderboard.LeaderboardScore;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

private static abstract class <init> extends com.google.android.gms.games.yerScoreImpl
{

    public Result createFailedResult(Status status)
    {
        return zzac(status);
    }

    public com.google.android.gms.games.leaderboard. zzac(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(status) {

            final Status zzOl;
            final LeaderboardsImpl.LoadPlayerScoreImpl zzarj;

            public LeaderboardScore getScore()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzarj = LeaderboardsImpl.LoadPlayerScoreImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    private _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.zzOl(GoogleApiClient googleapiclient, _cls1.zzOl zzol)
    {
        this(googleapiclient);
    }
}
