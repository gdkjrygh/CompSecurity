// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardRef, Leaderboard

public final class LeaderboardBuffer extends zzf
{

    public LeaderboardBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzj(int i, int j)
    {
        return zzn(i, j);
    }

    protected Leaderboard zzn(int i, int j)
    {
        return new LeaderboardRef(zzWu, i, j);
    }

    protected String zzni()
    {
        return "external_leaderboard_id";
    }
}
