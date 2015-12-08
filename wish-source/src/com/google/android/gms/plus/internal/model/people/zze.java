// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(PersonEntity.CoverEntity.CoverPhotoEntity coverphotoentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        Set set = coverphotoentity.zzazD;
        if (set.contains(Integer.valueOf(1)))
        {
            zzb.zzc(parcel, 1, coverphotoentity.zzzH);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            zzb.zzc(parcel, 2, coverphotoentity.zzmb);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            zzb.zza(parcel, 3, coverphotoentity.zzAX, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            zzb.zzc(parcel, 4, coverphotoentity.zzma);
        }
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeY(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhr(i);
    }

    public PersonEntity.CoverEntity.CoverPhotoEntity zzeY(Parcel parcel)
    {
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    hashset.add(Integer.valueOf(4));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != l)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
                }
                return new PersonEntity.CoverEntity.CoverPhotoEntity(hashset, k, j, s, i);
            }
        } while (true);
    }

    public PersonEntity.CoverEntity.CoverPhotoEntity[] zzhr(int i)
    {
        return new PersonEntity.CoverEntity.CoverPhotoEntity[i];
    }
}
