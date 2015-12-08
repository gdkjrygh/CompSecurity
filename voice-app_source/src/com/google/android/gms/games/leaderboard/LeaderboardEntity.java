// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    private final String zzadI;
    private final Uri zzanf;
    private final String zzanq;
    private final ArrayList zzatA;
    private final Game zzatB;
    private final String zzaty;
    private final int zzatz;

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        zzaty = leaderboard.getLeaderboardId();
        zzadI = leaderboard.getDisplayName();
        zzanf = leaderboard.getIconImageUri();
        zzanq = leaderboard.getIconImageUrl();
        zzatz = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        zzatB = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        zzatA = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            zzatA.add((LeaderboardVariantEntity)(LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());
        }

    }

    static int zza(Leaderboard leaderboard)
    {
        return zzt.hashCode(new Object[] {
            leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants()
        });
    }

    static boolean zza(Leaderboard leaderboard, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Leaderboard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (leaderboard == obj) goto _L4; else goto _L3
_L3:
        obj = (Leaderboard)obj;
        if (!zzt.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) || !zzt.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) || !zzt.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) || !zzt.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Leaderboard leaderboard)
    {
        return zzt.zzt(leaderboard).zzg("LeaderboardId", leaderboard.getLeaderboardId()).zzg("DisplayName", leaderboard.getDisplayName()).zzg("IconImageUri", leaderboard.getIconImageUri()).zzg("IconImageUrl", leaderboard.getIconImageUrl()).zzg("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).zzg("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zztE();
    }

    public String getDisplayName()
    {
        return zzadI;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzadI, chararraybuffer);
    }

    public Game getGame()
    {
        return zzatB;
    }

    public Uri getIconImageUri()
    {
        return zzanf;
    }

    public String getIconImageUrl()
    {
        return zzanq;
    }

    public String getLeaderboardId()
    {
        return zzaty;
    }

    public int getScoreOrder()
    {
        return zzatz;
    }

    public ArrayList getVariants()
    {
        return new ArrayList(zzatA);
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

    public Leaderboard zztE()
    {
        return this;
    }
}
