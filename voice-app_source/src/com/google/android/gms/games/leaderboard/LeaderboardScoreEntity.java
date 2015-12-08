// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    private final long zzatD;
    private final String zzatE;
    private final String zzatF;
    private final long zzatG;
    private final long zzatH;
    private final String zzatI;
    private final Uri zzatJ;
    private final Uri zzatK;
    private final PlayerEntity zzatL;
    private final String zzatM;
    private final String zzatN;
    private final String zzatO;

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        zzatD = leaderboardscore.getRank();
        zzatE = (String)zzu.zzu(leaderboardscore.getDisplayRank());
        zzatF = (String)zzu.zzu(leaderboardscore.getDisplayScore());
        zzatG = leaderboardscore.getRawScore();
        zzatH = leaderboardscore.getTimestampMillis();
        zzatI = leaderboardscore.getScoreHolderDisplayName();
        zzatJ = leaderboardscore.getScoreHolderIconImageUri();
        zzatK = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (PlayerEntity)((Player) (obj)).freeze();
        }
        zzatL = ((PlayerEntity) (obj));
        zzatM = leaderboardscore.getScoreTag();
        zzatN = leaderboardscore.getScoreHolderIconImageUrl();
        zzatO = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int zza(LeaderboardScore leaderboardscore)
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(leaderboardscore.getRank()), leaderboardscore.getDisplayRank(), Long.valueOf(leaderboardscore.getRawScore()), leaderboardscore.getDisplayScore(), Long.valueOf(leaderboardscore.getTimestampMillis()), leaderboardscore.getScoreHolderDisplayName(), leaderboardscore.getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolder()
        });
    }

    static boolean zza(LeaderboardScore leaderboardscore, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof LeaderboardScore) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboardscore == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardScore)obj;
        if (!zzt.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !zzt.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !zzt.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !zzt.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !zzt.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !zzt.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !zzt.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !zzt.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !zzt.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(leaderboardscore).zzg("Rank", Long.valueOf(leaderboardscore.getRank())).zzg("DisplayRank", leaderboardscore.getDisplayRank()).zzg("Score", Long.valueOf(leaderboardscore.getRawScore())).zzg("DisplayScore", leaderboardscore.getDisplayScore()).zzg("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).zzg("DisplayName", leaderboardscore.getScoreHolderDisplayName()).zzg("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).zzg("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).zzg("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).zzg("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
        Player player;
        if (leaderboardscore.getScoreHolder() == null)
        {
            player = null;
        } else
        {
            player = leaderboardscore.getScoreHolder();
        }
        return zza1.zzg("Player", player).zzg("ScoreTag", leaderboardscore.getScoreTag()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zztG();
    }

    public String getDisplayRank()
    {
        return zzatE;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzatE, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return zzatF;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzatF, chararraybuffer);
    }

    public long getRank()
    {
        return zzatD;
    }

    public long getRawScore()
    {
        return zzatG;
    }

    public Player getScoreHolder()
    {
        return zzatL;
    }

    public String getScoreHolderDisplayName()
    {
        if (zzatL == null)
        {
            return zzatI;
        } else
        {
            return zzatL.getDisplayName();
        }
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (zzatL == null)
        {
            zzlc.zzb(zzatI, chararraybuffer);
            return;
        } else
        {
            zzatL.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if (zzatL == null)
        {
            return zzatK;
        } else
        {
            return zzatL.getHiResImageUri();
        }
    }

    public String getScoreHolderHiResImageUrl()
    {
        if (zzatL == null)
        {
            return zzatO;
        } else
        {
            return zzatL.getHiResImageUrl();
        }
    }

    public Uri getScoreHolderIconImageUri()
    {
        if (zzatL == null)
        {
            return zzatJ;
        } else
        {
            return zzatL.getIconImageUri();
        }
    }

    public String getScoreHolderIconImageUrl()
    {
        if (zzatL == null)
        {
            return zzatN;
        } else
        {
            return zzatL.getIconImageUrl();
        }
    }

    public String getScoreTag()
    {
        return zzatM;
    }

    public long getTimestampMillis()
    {
        return zzatH;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public LeaderboardScore zztG()
    {
        return this;
    }
}
