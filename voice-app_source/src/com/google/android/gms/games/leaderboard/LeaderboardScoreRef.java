// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, LeaderboardScoreEntity

public final class LeaderboardScoreRef extends zzc
    implements LeaderboardScore
{

    private final PlayerRef zzatP;

    LeaderboardScoreRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        zzatP = new PlayerRef(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardScoreEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zztG();
    }

    public String getDisplayRank()
    {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        zza("display_rank", chararraybuffer);
    }

    public String getDisplayScore()
    {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        zza("display_score", chararraybuffer);
    }

    public long getRank()
    {
        return getLong("rank");
    }

    public long getRawScore()
    {
        return getLong("raw_score");
    }

    public Player getScoreHolder()
    {
        if (zzbX("external_player_id"))
        {
            return null;
        } else
        {
            return zzatP;
        }
    }

    public String getScoreHolderDisplayName()
    {
        if (zzbX("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return zzatP.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (zzbX("external_player_id"))
        {
            zza("default_display_name", chararraybuffer);
            return;
        } else
        {
            zzatP.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (zzbX("external_player_id"))
        {
            return null;
        } else
        {
            return zzatP.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (zzbX("external_player_id"))
        {
            return null;
        } else
        {
            return zzatP.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (zzbX("external_player_id"))
        {
            return zzbW("default_display_image_uri");
        } else
        {
            return zzatP.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (zzbX("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return zzatP.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return getString("score_tag");
    }

    public long getTimestampMillis()
    {
        return getLong("achieved_timestamp");
    }

    public int hashCode()
    {
        return LeaderboardScoreEntity.zza(this);
    }

    public String toString()
    {
        return LeaderboardScoreEntity.zzb(this);
    }

    public LeaderboardScore zztG()
    {
        return new LeaderboardScoreEntity(this);
    }
}
