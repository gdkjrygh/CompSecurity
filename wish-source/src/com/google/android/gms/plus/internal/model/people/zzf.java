// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(PersonEntity.ImageEntity imageentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        Set set = imageentity.zzazD;
        if (set.contains(Integer.valueOf(1)))
        {
            zzb.zzc(parcel, 1, imageentity.zzzH);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            zzb.zza(parcel, 2, imageentity.zzAX, true);
        }
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeZ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhs(i);
    }

    public PersonEntity.ImageEntity zzeZ(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                }
                return new PersonEntity.ImageEntity(hashset, i, s);
            }
        } while (true);
    }

    public PersonEntity.ImageEntity[] zzhs(int i)
    {
        return new PersonEntity.ImageEntity[i];
    }
}
