// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfo, PlayerLevel

public class PlayerLevelInfoCreator
    implements android.os.Parcelable.Creator
{

    public PlayerLevelInfoCreator()
    {
    }

    static void zza(PlayerLevelInfo playerlevelinfo, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, playerlevelinfo.getCurrentXpTotal());
        zzb.zzc(parcel, 1000, playerlevelinfo.getVersionCode());
        zzb.zza(parcel, 2, playerlevelinfo.getLastLevelUpTimestamp());
        zzb.zza(parcel, 3, playerlevelinfo.getCurrentLevel(), i, false);
        zzb.zza(parcel, 4, playerlevelinfo.getNextLevel(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdu(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfq(i);
    }

    public PlayerLevelInfo zzdu(Parcel parcel)
    {
        long l = 0L;
        PlayerLevel playerlevel = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        PlayerLevel playerlevel1 = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    playerlevel1 = (PlayerLevel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PlayerLevel.CREATOR);
                    break;

                case 4: // '\004'
                    playerlevel = (PlayerLevel)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PlayerLevel.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlayerLevelInfo(i, l1, l, playerlevel1, playerlevel);
            }
        } while (true);
    }

    public PlayerLevelInfo[] zzfq(int i)
    {
        return new PlayerLevelInfo[i];
    }
}
