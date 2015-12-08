// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gg;
import com.google.android.gms.internal.gy;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Game, a, e

public final class GameEntity extends gg
    implements Game
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int jE;
    private final String nS;
    private final String uf;
    private final String xa;
    private final String xb;
    private final String xc;
    private final String xd;
    private final Uri xe;
    private final Uri xf;
    private final Uri xg;
    private final boolean xh;
    private final boolean xi;
    private final String xj;
    private final int xk;
    private final int xl;
    private final int xm;
    private final boolean xn;
    private final boolean xo;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3)
    {
        jE = i;
        nS = s;
        uf = s1;
        xa = s2;
        xb = s3;
        xc = s4;
        xd = s5;
        xe = uri;
        xf = uri1;
        xg = uri2;
        xh = flag;
        xi = flag1;
        xj = s6;
        xk = j;
        xl = k;
        xm = l;
        xn = flag2;
        xo = flag3;
    }

    public GameEntity(Game game)
    {
        jE = 2;
        nS = game.getApplicationId();
        xa = game.getPrimaryCategory();
        xb = game.getSecondaryCategory();
        xc = game.getDescription();
        xd = game.getDeveloperName();
        uf = game.getDisplayName();
        xe = game.getIconImageUri();
        xf = game.getHiResImageUri();
        xg = game.getFeaturedImageUri();
        xh = game.isPlayEnabledGame();
        xi = game.isInstanceInstalled();
        xj = game.getInstancePackageName();
        xk = game.getGameplayAclStatus();
        xl = game.getAchievementTotalCount();
        xm = game.getLeaderboardCount();
        xn = game.isRealTimeMultiplayerEnabled();
        xo = game.isTurnBasedMultiplayerEnabled();
    }

    static int a(Game game)
    {
        return Arrays.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.isPlayEnabledGame()), 
            Boolean.valueOf(game.isInstanceInstalled()), game.getInstancePackageName(), Integer.valueOf(game.getGameplayAclStatus()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())
        });
    }

    static boolean a(Game game, Object obj)
    {
        if (obj instanceof Game)
        {
            if (game == obj)
            {
                return true;
            }
            obj = (Game)obj;
            if (ge.a(((Game) (obj)).getApplicationId(), game.getApplicationId()) && ge.a(((Game) (obj)).getDisplayName(), game.getDisplayName()) && ge.a(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) && ge.a(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) && ge.a(((Game) (obj)).getDescription(), game.getDescription()) && ge.a(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) && ge.a(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) && ge.a(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) && ge.a(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) && ge.a(Boolean.valueOf(((Game) (obj)).isPlayEnabledGame()), Boolean.valueOf(game.isPlayEnabledGame())) && ge.a(Boolean.valueOf(((Game) (obj)).isInstanceInstalled()), Boolean.valueOf(game.isInstanceInstalled())) && ge.a(((Game) (obj)).getInstancePackageName(), game.getInstancePackageName()) && ge.a(Integer.valueOf(((Game) (obj)).getGameplayAclStatus()), Integer.valueOf(game.getGameplayAclStatus())) && ge.a(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && ge.a(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && ge.a(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())) && ge.a(Boolean.valueOf(((Game) (obj)).isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())))
            {
                return true;
            }
        }
        return false;
    }

    static boolean an(String s)
    {
        return W(s);
    }

    static String b(Game game)
    {
        return ge.a(game).a("ApplicationId", game.getApplicationId()).a("DisplayName", game.getDisplayName()).a("PrimaryCategory", game.getPrimaryCategory()).a("SecondaryCategory", game.getSecondaryCategory()).a("Description", game.getDescription()).a("DeveloperName", game.getDeveloperName()).a("IconImageUri", game.getIconImageUri()).a("HiResImageUri", game.getHiResImageUri()).a("FeaturedImageUri", game.getFeaturedImageUri()).a("PlayEnabledGame", Boolean.valueOf(game.isPlayEnabledGame())).a("InstanceInstalled", Boolean.valueOf(game.isInstanceInstalled())).a("InstancePackageName", game.getInstancePackageName()).a("GameplayAclStatus", Integer.valueOf(game.getGameplayAclStatus())).a("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).a("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).toString();
    }

    static boolean b(Integer integer)
    {
        return c(integer);
    }

    static Integer db()
    {
        return bR();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final Game freeze()
    {
        return this;
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAchievementTotalCount()
    {
        return xl;
    }

    public final String getApplicationId()
    {
        return nS;
    }

    public final String getDescription()
    {
        return xc;
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        gy.a(xc, chararraybuffer);
    }

    public final String getDeveloperName()
    {
        return xd;
    }

    public final void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        gy.a(xd, chararraybuffer);
    }

    public final String getDisplayName()
    {
        return uf;
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        gy.a(uf, chararraybuffer);
    }

    public final Uri getFeaturedImageUri()
    {
        return xg;
    }

    public final int getGameplayAclStatus()
    {
        return xk;
    }

    public final Uri getHiResImageUri()
    {
        return xf;
    }

    public final Uri getIconImageUri()
    {
        return xe;
    }

    public final String getInstancePackageName()
    {
        return xj;
    }

    public final int getLeaderboardCount()
    {
        return xm;
    }

    public final String getPrimaryCategory()
    {
        return xa;
    }

    public final String getSecondaryCategory()
    {
        return xb;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isInstanceInstalled()
    {
        return xi;
    }

    public final boolean isPlayEnabledGame()
    {
        return xh;
    }

    public final boolean isRealTimeMultiplayerEnabled()
    {
        return xn;
    }

    public final boolean isTurnBasedMultiplayerEnabled()
    {
        return xo;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!bS())
        {
            e.a(this, parcel, i);
            return;
        }
        parcel.writeString(nS);
        parcel.writeString(uf);
        parcel.writeString(xa);
        parcel.writeString(xb);
        parcel.writeString(xc);
        parcel.writeString(xd);
        String s;
        if (xe == null)
        {
            s = null;
        } else
        {
            s = xe.toString();
        }
        parcel.writeString(s);
        if (xf == null)
        {
            s = null;
        } else
        {
            s = xf.toString();
        }
        parcel.writeString(s);
        if (xg == null)
        {
            s = obj;
        } else
        {
            s = xg.toString();
        }
        parcel.writeString(s);
        if (xh)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (xi)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(xj);
        parcel.writeInt(xk);
        parcel.writeInt(xl);
        parcel.writeInt(xm);
    }

}
