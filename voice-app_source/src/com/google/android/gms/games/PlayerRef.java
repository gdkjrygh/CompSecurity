// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerLevel, PlayerLevelInfo, PlayerEntity

public final class PlayerRef extends zzc
    implements Player
{

    private final PlayerLevelInfo zzanN;
    private final PlayerColumnNames zzanX;
    private final MostRecentGameInfoRef zzanY;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        zzanX = new PlayerColumnNames(s);
        zzanY = new MostRecentGameInfoRef(dataholder, i, zzanX);
        if (zzrM())
        {
            i = getInteger(zzanX.zzatf);
            int j = getInteger(zzanX.zzati);
            s = new PlayerLevel(i, getLong(zzanX.zzatg), getLong(zzanX.zzath));
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(zzanX.zzath), getLong(zzanX.zzatj));
            } else
            {
                dataholder = s;
            }
            zzanN = new PlayerLevelInfo(getLong(zzanX.zzate), getLong(zzanX.zzatk), s, dataholder);
            return;
        } else
        {
            zzanN = null;
            return;
        }
    }

    private boolean zzrM()
    {
        while (zzbX(zzanX.zzate) || getLong(zzanX.zzate) == -1L) 
        {
            return false;
        }
        return true;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return PlayerEntity.zza(this, obj);
    }

    public Player freeze()
    {
        return new PlayerEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return getString(zzanX.zzasW);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zza(zzanX.zzasW, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return zzbW(zzanX.zzasZ);
    }

    public String getHiResImageUrl()
    {
        return getString(zzanX.zzata);
    }

    public Uri getIconImageUri()
    {
        return zzbW(zzanX.zzasX);
    }

    public String getIconImageUrl()
    {
        return getString(zzanX.zzasY);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!zzbV(zzanX.zzatd) || zzbX(zzanX.zzatd))
        {
            return -1L;
        } else
        {
            return getLong(zzanX.zzatd);
        }
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return zzanN;
    }

    public String getPlayerId()
    {
        return getString(zzanX.zzasV);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(zzanX.zzatb);
    }

    public String getTitle()
    {
        return getString(zzanX.zzatl);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        zza(zzanX.zzatl, chararraybuffer);
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
        return PlayerEntity.zzb(this);
    }

    public boolean isProfileVisible()
    {
        return getBoolean(zzanX.zzatn);
    }

    public String toString()
    {
        return com.google.android.gms.games.PlayerEntity.zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }

    public boolean zzrJ()
    {
        return getBoolean(zzanX.zzatu);
    }

    public int zzrK()
    {
        return getInteger(zzanX.zzatc);
    }

    public MostRecentGameInfo zzrL()
    {
        if (zzbX(zzanX.zzato))
        {
            return null;
        } else
        {
            return zzanY;
        }
    }
}
