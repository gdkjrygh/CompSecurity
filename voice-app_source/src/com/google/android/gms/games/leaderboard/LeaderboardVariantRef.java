// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardVariantRef extends zzc
    implements LeaderboardVariant
{

    LeaderboardVariantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardVariantEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zztK();
    }

    public int getCollection()
    {
        return getInteger("collection");
    }

    public String getDisplayPlayerRank()
    {
        return getString("player_display_rank");
    }

    public String getDisplayPlayerScore()
    {
        return getString("player_display_score");
    }

    public long getNumScores()
    {
        if (zzbX("total_scores"))
        {
            return -1L;
        } else
        {
            return getLong("total_scores");
        }
    }

    public long getPlayerRank()
    {
        if (zzbX("player_rank"))
        {
            return -1L;
        } else
        {
            return getLong("player_rank");
        }
    }

    public String getPlayerScoreTag()
    {
        return getString("player_score_tag");
    }

    public long getRawPlayerScore()
    {
        if (zzbX("player_raw_score"))
        {
            return -1L;
        } else
        {
            return getLong("player_raw_score");
        }
    }

    public int getTimeSpan()
    {
        return getInteger("timespan");
    }

    public boolean hasPlayerInfo()
    {
        return !zzbX("player_raw_score");
    }

    public int hashCode()
    {
        return LeaderboardVariantEntity.zza(this);
    }

    public String toString()
    {
        return LeaderboardVariantEntity.zzb(this);
    }

    public String zztH()
    {
        return getString("top_page_token_next");
    }

    public String zztI()
    {
        return getString("window_page_token_prev");
    }

    public String zztJ()
    {
        return getString("window_page_token_next");
    }

    public LeaderboardVariant zztK()
    {
        return new LeaderboardVariantEntity(this);
    }
}
