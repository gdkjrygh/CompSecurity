// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.quest:
//            MilestoneEntity

public class MilestoneEntityCreator
    implements android.os.Parcelable.Creator
{

    public MilestoneEntityCreator()
    {
    }

    static void zza(MilestoneEntity milestoneentity, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, milestoneentity.getMilestoneId(), false);
        zzb.zzc(parcel, 1000, milestoneentity.getVersionCode());
        zzb.zza(parcel, 2, milestoneentity.getCurrentProgress());
        zzb.zza(parcel, 3, milestoneentity.getTargetProgress());
        zzb.zza(parcel, 4, milestoneentity.getCompletionRewardData(), false);
        zzb.zzc(parcel, 5, milestoneentity.getState());
        zzb.zza(parcel, 6, milestoneentity.getEventId(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdO(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfX(i);
    }

    public MilestoneEntity zzdO(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        byte abyte0[] = null;
        long l2 = 0L;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, l);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MilestoneEntity(j, s1, l2, l1, abyte0, i, s);
            }
        } while (true);
    }

    public MilestoneEntity[] zzfX(int i)
    {
        return new MilestoneEntity[i];
    }
}
