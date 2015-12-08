// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdE(parcel);
        }

        public GameBadgeEntity zzdE(Parcel parcel)
        {
            if (GameBadgeEntity.zzc(GameBadgeEntity.zzrH()) || GameBadgeEntity.zzcM(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.zzdE(parcel);
            }
            int i = parcel.readInt();
            String s = parcel.readString();
            String s1 = parcel.readString();
            parcel = parcel.readString();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                parcel = Uri.parse(parcel);
            }
            return new GameBadgeEntity(1, i, s, s1, parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    private final int zzCY;
    private int zzSq;
    private String zzadv;
    private String zzakM;
    private Uri zzanf;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        zzCY = i;
        zzSq = j;
        zzadv = s;
        zzakM = s1;
        zzanf = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        zzCY = 1;
        zzSq = gamebadge.getType();
        zzadv = gamebadge.getTitle();
        zzakM = gamebadge.getDescription();
        zzanf = gamebadge.getIconImageUri();
    }

    static int zza(GameBadge gamebadge)
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(gamebadge.getType()), gamebadge.getTitle(), gamebadge.getDescription(), gamebadge.getIconImageUri()
        });
    }

    static boolean zza(GameBadge gamebadge, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof GameBadge) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (gamebadge == obj) goto _L4; else goto _L3
_L3:
        obj = (GameBadge)obj;
        if (!zzt.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(GameBadge gamebadge)
    {
        return zzt.zzt(gamebadge).zzg("Type", Integer.valueOf(gamebadge.getType())).zzg("Title", gamebadge.getTitle()).zzg("Description", gamebadge.getDescription()).zzg("IconImageUri", gamebadge.getIconImageUri()).toString();
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

    public Object freeze()
    {
        return zzti();
    }

    public String getDescription()
    {
        return zzakM;
    }

    public Uri getIconImageUri()
    {
        return zzanf;
    }

    public String getTitle()
    {
        return zzadv;
    }

    public int getType()
    {
        return zzSq;
    }

    public int getVersionCode()
    {
        return zzCY;
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

    public void writeToParcel(Parcel parcel, int i)
    {
        if (!zznF())
        {
            GameBadgeEntityCreator.zza(this, parcel, i);
            return;
        }
        parcel.writeInt(zzSq);
        parcel.writeString(zzadv);
        parcel.writeString(zzakM);
        String s;
        if (zzanf == null)
        {
            s = null;
        } else
        {
            s = zzanf.toString();
        }
        parcel.writeString(s);
    }

    public GameBadge zzti()
    {
        return this;
    }

}
