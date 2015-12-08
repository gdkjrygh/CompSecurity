// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

protected static abstract class _cls1.zzOl extends com.google.android.gms.games.mitScoreImpl
{

    public Result createFailedResult(Status status)
    {
        return zzae(status);
    }

    public com.google.android.gms.games.leaderboard. zzae(Status status)
    {
        return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(status) {

            final Status zzOl;
            final LeaderboardsImpl.SubmitScoreImpl zzarl;

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
                zzarl = LeaderboardsImpl.SubmitScoreImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    protected _cls1.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
