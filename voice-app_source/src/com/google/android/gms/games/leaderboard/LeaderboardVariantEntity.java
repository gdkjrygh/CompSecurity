// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    private final int zzatQ;
    private final int zzatR;
    private final boolean zzatS;
    private final long zzatT;
    private final String zzatU;
    private final long zzatV;
    private final String zzatW;
    private final String zzatX;
    private final long zzatY;
    private final String zzatZ;
    private final String zzaua;
    private final String zzaub;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        zzatQ = leaderboardvariant.getTimeSpan();
        zzatR = leaderboardvariant.getCollection();
        zzatS = leaderboardvariant.hasPlayerInfo();
        zzatT = leaderboardvariant.getRawPlayerScore();
        zzatU = leaderboardvariant.getDisplayPlayerScore();
        zzatV = leaderboardvariant.getPlayerRank();
        zzatW = leaderboardvariant.getDisplayPlayerRank();
        zzatX = leaderboardvariant.getPlayerScoreTag();
        zzatY = leaderboardvariant.getNumScores();
        zzatZ = leaderboardvariant.zztH();
        zzaua = leaderboardvariant.zztI();
        zzaub = leaderboardvariant.zztJ();
    }

    static int zza(LeaderboardVariant leaderboardvariant)
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.zztH(), leaderboardvariant.zztJ(), 
            leaderboardvariant.zztI()
        });
    }

    static boolean zza(LeaderboardVariant leaderboardvariant, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof LeaderboardVariant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboardvariant == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardVariant)obj;
        if (!zzt.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !zzt.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !zzt.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !zzt.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !zzt.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !zzt.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !zzt.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !zzt.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !zzt.equal(((LeaderboardVariant) (obj)).zztH(), leaderboardvariant.zztH()) || !zzt.equal(((LeaderboardVariant) (obj)).zztJ(), leaderboardvariant.zztJ()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((LeaderboardVariant) (obj)).zztI(), leaderboardvariant.zztI())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(leaderboardvariant).zzg("TimeSpan", TimeSpan.zzfG(leaderboardvariant.getTimeSpan())).zzg("Collection", LeaderboardCollection.zzfG(leaderboardvariant.getCollection()));
        Object obj;
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getRawPlayerScore());
        } else
        {
            obj = "none";
        }
        zza1 = zza1.zzg("RawPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerScore();
        } else
        {
            obj = "none";
        }
        zza1 = zza1.zzg("DisplayPlayerScore", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = Long.valueOf(leaderboardvariant.getPlayerRank());
        } else
        {
            obj = "none";
        }
        zza1 = zza1.zzg("PlayerRank", obj);
        if (leaderboardvariant.hasPlayerInfo())
        {
            obj = leaderboardvariant.getDisplayPlayerRank();
        } else
        {
            obj = "none";
        }
        return zza1.zzg("DisplayPlayerRank", obj).zzg("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).zzg("TopPageNextToken", leaderboardvariant.zztH()).zzg("WindowPageNextToken", leaderboardvariant.zztJ()).zzg("WindowPagePrevToken", leaderboardvariant.zztI()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zztK();
    }

    public int getCollection()
    {
        return zzatR;
    }

    public String getDisplayPlayerRank()
    {
        return zzatW;
    }

    public String getDisplayPlayerScore()
    {
        return zzatU;
    }

    public long getNumScores()
    {
        return zzatY;
    }

    public long getPlayerRank()
    {
        return zzatV;
    }

    public String getPlayerScoreTag()
    {
        return zzatX;
    }

    public long getRawPlayerScore()
    {
        return zzatT;
    }

    public int getTimeSpan()
    {
        return zzatQ;
    }

    public boolean hasPlayerInfo()
    {
        return zzatS;
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

    public String zztH()
    {
        return zzatZ;
    }

    public String zztI()
    {
        return zzaua;
    }

    public String zztJ()
    {
        return zzaub;
    }

    public LeaderboardVariant zztK()
    {
        return this;
    }
}
