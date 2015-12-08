// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlayerLevelCreator();
    private final int zzCY;
    private final int zzanQ;
    private final long zzanR;
    private final long zzanS;

    PlayerLevel(int i, int j, long l, long l1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Min XP must be positive!");
        if (l1 > l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Max XP must be more than min XP!");
        zzCY = i;
        zzanQ = j;
        zzanR = l;
        zzanS = l1;
    }

    public PlayerLevel(int i, long l, long l1)
    {
        this(1, i, l, l1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof PlayerLevel) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevel)obj;
        if (!zzt.equal(Integer.valueOf(((PlayerLevel) (obj)).getLevelNumber()), Integer.valueOf(getLevelNumber())) || !zzt.equal(Long.valueOf(((PlayerLevel) (obj)).getMinXp()), Long.valueOf(getMinXp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Long.valueOf(((PlayerLevel) (obj)).getMaxXp()), Long.valueOf(getMaxXp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getLevelNumber()
    {
        return zzanQ;
    }

    public long getMaxXp()
    {
        return zzanS;
    }

    public long getMinXp()
    {
        return zzanR;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzanQ), Long.valueOf(zzanR), Long.valueOf(zzanS)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("LevelNumber", Integer.valueOf(getLevelNumber())).zzg("MinXp", Long.valueOf(getMinXp())).zzg("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.zza(this, parcel, i);
    }

}
