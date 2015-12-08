// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzds(parcel);
        }

        public PlayerEntity zzds(Parcel parcel)
        {
            if (PlayerEntity.zzc(PlayerEntity.zzrH()) || PlayerEntity.zzcM(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.zzds(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1 = parcel.readString();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            return new PlayerEntity(12, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    private final int zzCY;
    private final String zzTL;
    private final String zzadI;
    private final String zzadv;
    private final long zzanJ;
    private final int zzanK;
    private final long zzanL;
    private final MostRecentGameInfoEntity zzanM;
    private final PlayerLevelInfo zzanN;
    private final boolean zzanO;
    private final boolean zzanP;
    private final Uri zzanf;
    private final Uri zzang;
    private final String zzanq;
    private final String zzanr;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag, boolean flag1)
    {
        zzCY = i;
        zzTL = s;
        zzadI = s1;
        zzanf = uri;
        zzanq = s2;
        zzang = uri1;
        zzanr = s3;
        zzanJ = l;
        zzanK = j;
        zzanL = l1;
        zzadv = s4;
        zzanO = flag;
        zzanM = mostrecentgameinfoentity;
        zzanN = playerlevelinfo;
        zzanP = flag1;
    }

    public PlayerEntity(Player player)
    {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean flag)
    {
        Object obj1 = null;
        super();
        zzCY = 12;
        Object obj;
        if (flag)
        {
            obj = player.getPlayerId();
        } else
        {
            obj = null;
        }
        zzTL = ((String) (obj));
        zzadI = player.getDisplayName();
        zzanf = player.getIconImageUri();
        zzanq = player.getIconImageUrl();
        zzang = player.getHiResImageUri();
        zzanr = player.getHiResImageUrl();
        zzanJ = player.getRetrievedTimestamp();
        zzanK = player.zzrK();
        zzanL = player.getLastPlayedWithTimestamp();
        zzadv = player.getTitle();
        zzanO = player.isProfileVisible();
        obj = player.zzrL();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        zzanM = ((MostRecentGameInfoEntity) (obj));
        zzanN = player.getLevelInfo();
        zzanP = player.zzrJ();
        if (flag)
        {
            com.google.android.gms.common.internal.zzb.zzq(zzTL);
        }
        com.google.android.gms.common.internal.zzb.zzq(zzadI);
        if (zzanJ > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzb.zzU(flag);
    }

    static boolean zza(Player player, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Player) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (player == obj) goto _L4; else goto _L3
_L3:
        obj = (Player)obj;
        if (!zzt.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) || !zzt.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) || !zzt.equal(Boolean.valueOf(((Player) (obj)).zzrJ()), Boolean.valueOf(player.zzrJ())) || !zzt.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) || !zzt.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) || !zzt.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) || !zzt.equal(((Player) (obj)).getTitle(), player.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static int zzb(Player player)
    {
        return zzt.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.zzrJ()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo()
        });
    }

    static String zzc(Player player)
    {
        return zzt.zzt(player).zzg("PlayerId", player.getPlayerId()).zzg("DisplayName", player.getDisplayName()).zzg("HasDebugAccess", Boolean.valueOf(player.zzrJ())).zzg("IconImageUri", player.getIconImageUri()).zzg("IconImageUrl", player.getIconImageUrl()).zzg("HiResImageUri", player.getHiResImageUri()).zzg("HiResImageUrl", player.getHiResImageUrl()).zzg("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).zzg("Title", player.getTitle()).zzg("LevelInfo", player.getLevelInfo()).toString();
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

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Player freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return zzadI;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzadI, chararraybuffer);
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

    public long getLastPlayedWithTimestamp()
    {
        return zzanL;
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return zzanN;
    }

    public String getPlayerId()
    {
        return zzTL;
    }

    public long getRetrievedTimestamp()
    {
        return zzanJ;
    }

    public String getTitle()
    {
        return zzadv;
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzadv, chararraybuffer);
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public int hashCode()
    {
        return zzb(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isProfileVisible()
    {
        return zzanO;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if (!zznF())
        {
            PlayerEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeString(zzTL);
        parcel.writeString(zzadI);
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
            s = obj;
        } else
        {
            s = zzang.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(zzanJ);
    }

    public boolean zzrJ()
    {
        return zzanP;
    }

    public int zzrK()
    {
        return zzanK;
    }

    public MostRecentGameInfo zzrL()
    {
        return zzanM;
    }

}
