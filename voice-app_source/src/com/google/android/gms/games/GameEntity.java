// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdr(parcel);
        }

        public GameEntity zzdr(Parcel parcel)
        {
            if (GameEntity.zzc(GameEntity.zzrH()) || GameEntity.zzcM(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.zzdr(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            Object obj2;
            boolean flag;
            boolean flag1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            obj1 = parcel.readString();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            obj2 = parcel.readString();
            if (obj2 == null)
            {
                obj2 = null;
            } else
            {
                obj2 = Uri.parse(((String) (obj2)));
            }
            if (parcel.readInt() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return new GameEntity(7, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    private final boolean zzAg;
    private final int zzCY;
    private final String zzQv;
    private final String zzadI;
    private final String zzakM;
    private final String zzanc;
    private final String zzand;
    private final String zzane;
    private final Uri zzanf;
    private final Uri zzang;
    private final Uri zzanh;
    private final boolean zzani;
    private final boolean zzanj;
    private final String zzank;
    private final int zzanl;
    private final int zzanm;
    private final int zzann;
    private final boolean zzano;
    private final boolean zzanp;
    private final String zzanq;
    private final String zzanr;
    private final String zzans;
    private final boolean zzant;
    private final boolean zzanu;
    private final String zzanv;
    private final boolean zzanw;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6, String s10, boolean flag7)
    {
        zzCY = i;
        zzQv = s;
        zzadI = s1;
        zzanc = s2;
        zzand = s3;
        zzakM = s4;
        zzane = s5;
        zzanf = uri;
        zzanq = s7;
        zzang = uri1;
        zzanr = s8;
        zzanh = uri2;
        zzans = s9;
        zzani = flag;
        zzanj = flag1;
        zzank = s6;
        zzanl = j;
        zzanm = k;
        zzann = l;
        zzano = flag2;
        zzanp = flag3;
        zzAg = flag4;
        zzant = flag5;
        zzanu = flag6;
        zzanv = s10;
        zzanw = flag7;
    }

    public GameEntity(Game game)
    {
        zzCY = 7;
        zzQv = game.getApplicationId();
        zzanc = game.getPrimaryCategory();
        zzand = game.getSecondaryCategory();
        zzakM = game.getDescription();
        zzane = game.getDeveloperName();
        zzadI = game.getDisplayName();
        zzanf = game.getIconImageUri();
        zzanq = game.getIconImageUrl();
        zzang = game.getHiResImageUri();
        zzanr = game.getHiResImageUrl();
        zzanh = game.getFeaturedImageUri();
        zzans = game.getFeaturedImageUrl();
        zzani = game.zzrC();
        zzanj = game.zzrE();
        zzank = game.zzrF();
        zzanl = game.zzrG();
        zzanm = game.getAchievementTotalCount();
        zzann = game.getLeaderboardCount();
        zzano = game.isRealTimeMultiplayerEnabled();
        zzanp = game.isTurnBasedMultiplayerEnabled();
        zzAg = game.isMuted();
        zzant = game.zzrD();
        zzanu = game.areSnapshotsEnabled();
        zzanv = game.getThemeColor();
        zzanw = game.hasGamepadSupport();
    }

    static int zza(Game game)
    {
        return zzt.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.zzrC()), 
            Boolean.valueOf(game.zzrE()), game.zzrF(), Integer.valueOf(game.zzrG()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.zzrD()), Boolean.valueOf(game.areSnapshotsEnabled()), 
            game.getThemeColor(), Boolean.valueOf(game.hasGamepadSupport())
        });
    }

    static boolean zza(Game game, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Game) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (game == obj) goto _L4; else goto _L3
_L3:
        obj = (Game)obj;
        if (!zzt.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) || !zzt.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) || !zzt.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) || !zzt.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) || !zzt.equal(((Game) (obj)).getDescription(), game.getDescription()) || !zzt.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) || !zzt.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) || !zzt.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) || !zzt.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) || !zzt.equal(Boolean.valueOf(((Game) (obj)).zzrC()), Boolean.valueOf(game.zzrC())) || !zzt.equal(Boolean.valueOf(((Game) (obj)).zzrE()), Boolean.valueOf(game.zzrE())) || !zzt.equal(((Game) (obj)).zzrF(), game.zzrF()) || !zzt.equal(Integer.valueOf(((Game) (obj)).zzrG()), Integer.valueOf(game.zzrG())) || !zzt.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) || !zzt.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) || !zzt.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
        if (game.isTurnBasedMultiplayerEnabled() && zzt.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && zzt.equal(Boolean.valueOf(((Game) (obj)).zzrD()), Boolean.valueOf(game.zzrD())))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!zzt.equal(Boolean.valueOf(flag2), Boolean.valueOf(flag)) || !zzt.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) || !zzt.equal(((Game) (obj)).getThemeColor(), game.getThemeColor()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Boolean.valueOf(((Game) (obj)).hasGamepadSupport()), Boolean.valueOf(game.hasGamepadSupport()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Game game)
    {
        return zzt.zzt(game).zzg("ApplicationId", game.getApplicationId()).zzg("DisplayName", game.getDisplayName()).zzg("PrimaryCategory", game.getPrimaryCategory()).zzg("SecondaryCategory", game.getSecondaryCategory()).zzg("Description", game.getDescription()).zzg("DeveloperName", game.getDeveloperName()).zzg("IconImageUri", game.getIconImageUri()).zzg("IconImageUrl", game.getIconImageUrl()).zzg("HiResImageUri", game.getHiResImageUri()).zzg("HiResImageUrl", game.getHiResImageUrl()).zzg("FeaturedImageUri", game.getFeaturedImageUri()).zzg("FeaturedImageUrl", game.getFeaturedImageUrl()).zzg("PlayEnabledGame", Boolean.valueOf(game.zzrC())).zzg("InstanceInstalled", Boolean.valueOf(game.zzrE())).zzg("InstancePackageName", game.zzrF()).zzg("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).zzg("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).zzg("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).zzg("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).zzg("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).zzg("ThemeColor", game.getThemeColor()).zzg("HasGamepadSupport", Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    static boolean zzc(Integer integer)
    {
        return zzd(integer);
    }

    static boolean zzcM(String s)
    {
        return zzca(s);
    }

    static Integer zzrH()
    {
        return zznE();
    }

    public boolean areSnapshotsEnabled()
    {
        return zzanu;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Game freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getAchievementTotalCount()
    {
        return zzanm;
    }

    public String getApplicationId()
    {
        return zzQv;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public String getDeveloperName()
    {
        return zzane;
    }

    public void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzane, chararraybuffer);
    }

    public String getDisplayName()
    {
        return zzadI;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzadI, chararraybuffer);
    }

    public Uri getFeaturedImageUri()
    {
        return zzanh;
    }

    public String getFeaturedImageUrl()
    {
        return zzans;
    }

    public Uri getHiResImageUri()
    {
        return zzang;
    }

    public String getHiResImageUrl()
    {
        return zzanr;
    }

    public Uri getIconImageUri()
    {
        return zzanf;
    }

    public String getIconImageUrl()
    {
        return zzanq;
    }

    public int getLeaderboardCount()
    {
        return zzann;
    }

    public String getPrimaryCategory()
    {
        return zzanc;
    }

    public String getSecondaryCategory()
    {
        return zzand;
    }

    public String getThemeColor()
    {
        return zzanv;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean hasGamepadSupport()
    {
        return zzanw;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isMuted()
    {
        return zzAg;
    }

    public boolean isRealTimeMultiplayerEnabled()
    {
        return zzano;
    }

    public boolean isTurnBasedMultiplayerEnabled()
    {
        return zzanp;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!zznF())
        {
            GameEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeString(zzQv);
        parcel.writeString(zzadI);
        parcel.writeString(zzanc);
        parcel.writeString(zzand);
        parcel.writeString(zzakM);
        parcel.writeString(zzane);
        String s;
        if (zzanf == null)
        {
            s = null;
        } else
        {
            s = zzanf.toString();
        }
        parcel.writeString(s);
        if (zzang == null)
        {
            s = null;
        } else
        {
            s = zzang.toString();
        }
        parcel.writeString(s);
        if (zzanh == null)
        {
            s = obj;
        } else
        {
            s = zzanh.toString();
        }
        parcel.writeString(s);
        if (zzani)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (zzanj)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(zzank);
        parcel.writeInt(zzanl);
        parcel.writeInt(zzanm);
        parcel.writeInt(zzann);
    }

    public boolean zzrC()
    {
        return zzani;
    }

    public boolean zzrD()
    {
        return zzant;
    }

    public boolean zzrE()
    {
        return zzanj;
    }

    public String zzrF()
    {
        return zzank;
    }

    public int zzrG()
    {
        return zzanl;
    }

}
