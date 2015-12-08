// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzapw extends zzapw
    implements com.google.android.gms.games.leaderboard.pw
{

    private final LeaderboardScoreEntity zzapw = null;

    public LeaderboardScore getScore()
    {
        return zzapw;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        dataholder = new LeaderboardScoreBuffer(dataholder);
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        zzapw = (LeaderboardScoreEntity)dataholder.get(0).freeze();
_L4:
        dataholder.release();
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        dataholder.release();
        throw exception;
    }
}
