// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            MomentEntity, ItemScopeEntity

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(MomentEntity momententity, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        Set set = momententity.zzaHQ;
        if (set.contains(Integer.valueOf(1)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, momententity.zzCY);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, momententity.zzKI, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, momententity.zzaIL, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, momententity.zzaID, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, momententity.zzaIM, i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, momententity.zzEl, true);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfL(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziB(i);
    }

    public MomentEntity zzfL(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        ItemScopeEntity itemscopeentity = null;
        String s1 = null;
        ItemScopeEntity itemscopeentity1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    itemscopeentity1 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    itemscopeentity = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new MomentEntity(hashset, i, s2, itemscopeentity1, s1, itemscopeentity, s);
            }
        } while (true);
    }

    public MomentEntity[] zziB(int i)
    {
        return new MomentEntity[i];
    }
}
