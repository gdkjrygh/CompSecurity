// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

class zzOl
    implements com.google.android.gms.games.leaderboard.
{

    final Status zzOl;
    final zzOl zzark;

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

    Q(Q q, Status status)
    {
        zzark = q;
        zzOl = status;
        super();
    }
}
