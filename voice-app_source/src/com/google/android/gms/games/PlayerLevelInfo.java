// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlayerLevelInfoCreator();
    private final int zzCY;
    private final long zzanT;
    private final long zzanU;
    private final PlayerLevel zzanV;
    private final PlayerLevel zzanW;

    PlayerLevelInfo(int i, long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        zzu.zzu(playerlevel);
        zzu.zzu(playerlevel1);
        zzCY = i;
        zzanT = l;
        zzanU = l1;
        zzanV = playerlevel;
        zzanW = playerlevel1;
    }

    public PlayerLevelInfo(long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        this(1, l, l1, playerlevel, playerlevel1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof PlayerLevelInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevelInfo)obj;
        if (!zzt.equal(Long.valueOf(zzanT), Long.valueOf(((PlayerLevelInfo) (obj)).zzanT)) || !zzt.equal(Long.valueOf(zzanU), Long.valueOf(((PlayerLevelInfo) (obj)).zzanU)) || !zzt.equal(zzanV, ((PlayerLevelInfo) (obj)).zzanV))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(zzanW, ((PlayerLevelInfo) (obj)).zzanW)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return zzanV;
    }

    public long getCurrentXpTotal()
    {
        return zzanT;
    }

    public long getLastLevelUpTimestamp()
    {
        return zzanU;
    }

    public PlayerLevel getNextLevel()
    {
        return zzanW;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzanT), Long.valueOf(zzanU), zzanV, zzanW
        });
    }

    public boolean isMaxLevel()
    {
        return zzanV.equals(zzanW);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.zza(this, parcel, i);
    }

}
