// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(PersonEntity.NameEntity nameentity, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        Set set = nameentity.zzaHQ;
        if (set.contains(Integer.valueOf(1)))
        {
            zzb.zzc(parcel, 1, nameentity.zzCY);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            zzb.zza(parcel, 2, nameentity.zzaIo, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            zzb.zza(parcel, 3, nameentity.zzaJo, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            zzb.zza(parcel, 4, nameentity.zzaIr, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            zzb.zza(parcel, 5, nameentity.zzaJp, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            zzb.zza(parcel, 6, nameentity.zzaJq, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            zzb.zza(parcel, 7, nameentity.zzaJr, true);
        }
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziI(i);
    }

    public PersonEntity.NameEntity zzfS(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
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
                return new PersonEntity.NameEntity(hashset, i, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public PersonEntity.NameEntity[] zziI(int i)
    {
        return new PersonEntity.NameEntity[i];
    }
}
