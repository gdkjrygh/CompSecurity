// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.achievement:
//            AchievementEntity

public class AchievementEntityCreator
    implements android.os.Parcelable.Creator
{

    public AchievementEntityCreator()
    {
    }

    static void zza(AchievementEntity achievemententity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, achievemententity.getAchievementId(), false);
        zzb.zzc(parcel, 2, achievemententity.getType());
        zzb.zza(parcel, 3, achievemententity.getName(), false);
        zzb.zza(parcel, 4, achievemententity.getDescription(), false);
        zzb.zza(parcel, 5, achievemententity.getUnlockedImageUri(), i, false);
        zzb.zza(parcel, 6, achievemententity.getUnlockedImageUrl(), false);
        zzb.zza(parcel, 7, achievemententity.getRevealedImageUri(), i, false);
        zzb.zza(parcel, 8, achievemententity.getRevealedImageUrl(), false);
        zzb.zzc(parcel, 9, achievemententity.getTotalSteps());
        zzb.zza(parcel, 10, achievemententity.getFormattedTotalSteps(), false);
        zzb.zza(parcel, 11, achievemententity.getPlayer(), i, false);
        zzb.zzc(parcel, 12, achievemententity.getState());
        zzb.zzc(parcel, 13, achievemententity.getCurrentSteps());
        zzb.zza(parcel, 14, achievemententity.getFormattedCurrentSteps(), false);
        zzb.zza(parcel, 15, achievemententity.getLastUpdatedTimestamp());
        zzb.zza(parcel, 16, achievemententity.getXpValue());
        zzb.zzc(parcel, 1000, achievemententity.getVersionCode());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdv(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfr(i);
    }

    public AchievementEntity zzdv(Parcel parcel)
    {
        int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i1 = 0;
        String s6 = null;
        int l = 0;
        String s5 = null;
        String s4 = null;
        Uri uri1 = null;
        String s3 = null;
        Uri uri = null;
        String s2 = null;
        int k = 0;
        String s1 = null;
        PlayerEntity playerentity = null;
        int j = 0;
        int i = 0;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k1);
                    break;

                case 1: // '\001'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 3: // '\003'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 4: // '\004'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 5: // '\005'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 7: // '\007'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 9: // '\t'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 10: // '\n'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 11: // '\013'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k1, PlayerEntity.CREATOR);
                    break;

                case 12: // '\f'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 13: // '\r'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k1);
                    break;

                case 15: // '\017'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k1);
                    break;

                case 16: // '\020'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k1);
                    break;

                case 1000: 
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j1).toString(), parcel);
            } else
            {
                return new AchievementEntity(i1, s6, l, s5, s4, uri1, s3, uri, s2, k, s1, playerentity, j, i, s, l2, l1);
            }
        } while (true);
    }

    public AchievementEntity[] zzfr(int i)
    {
        return new AchievementEntity[i];
    }
}
