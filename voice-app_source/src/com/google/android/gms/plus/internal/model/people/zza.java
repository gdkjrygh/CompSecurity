// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(PersonEntity personentity, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        Set set = personentity.zzaHQ;
        if (set.contains(Integer.valueOf(1)))
        {
            zzb.zzc(parcel, 1, personentity.zzCY);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            zzb.zza(parcel, 2, personentity.zzaIO, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            zzb.zza(parcel, 3, personentity.zzaIP, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            zzb.zza(parcel, 4, personentity.zzaIQ, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            zzb.zza(parcel, 5, personentity.zzaIR, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            zzb.zzc(parcel, 6, personentity.zzaIS);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            zzb.zza(parcel, 7, personentity.zzaIT, i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            zzb.zza(parcel, 8, personentity.zzaIU, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            zzb.zza(parcel, 9, personentity.zzadI, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            zzb.zzc(parcel, 12, personentity.zzsC);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            zzb.zza(parcel, 14, personentity.zzKI, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            zzb.zza(parcel, 15, personentity.zzaIV, i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            zzb.zza(parcel, 16, personentity.zzaIW);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            zzb.zza(parcel, 19, personentity.zzaIX, i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            zzb.zza(parcel, 18, personentity.zzRA, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            zzb.zzc(parcel, 21, personentity.zzaIZ);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            zzb.zza(parcel, 20, personentity.zzaIY, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            zzb.zzc(parcel, 23, personentity.zzaJb, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            zzb.zzc(parcel, 22, personentity.zzaJa, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            zzb.zzc(parcel, 25, personentity.zzaJd);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            zzb.zzc(parcel, 24, personentity.zzaJc);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            zzb.zza(parcel, 27, personentity.zzF, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            zzb.zza(parcel, 26, personentity.zzaJe, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            zzb.zza(parcel, 29, personentity.zzaJg);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            zzb.zzc(parcel, 28, personentity.zzaJf, true);
        }
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfM(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziC(i);
    }

    public PersonEntity zzfM(Parcel parcel)
    {
        int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        HashSet hashset = new HashSet();
        int j1 = 0;
        String s9 = null;
        PersonEntity.AgeRangeEntity agerangeentity = null;
        String s8 = null;
        String s7 = null;
        int i1 = 0;
        PersonEntity.CoverEntity coverentity = null;
        String s6 = null;
        String s5 = null;
        int l = 0;
        String s4 = null;
        PersonEntity.ImageEntity imageentity = null;
        boolean flag1 = false;
        String s3 = null;
        PersonEntity.NameEntity nameentity = null;
        String s2 = null;
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l1))
                {
                case 10: // '\n'
                case 11: // '\013'
                case 13: // '\r'
                case 17: // '\021'
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    agerangeentity = (PersonEntity.AgeRangeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l1, PersonEntity.AgeRangeEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    coverentity = (PersonEntity.CoverEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l1, PersonEntity.CoverEntity.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 12: // '\f'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    imageentity = (PersonEntity.ImageEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l1, PersonEntity.ImageEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    nameentity = (PersonEntity.NameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l1, PersonEntity.NameEntity.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1, PersonEntity.PlacesLivedEntity.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1, PersonEntity.OrganizationsEntity.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l1);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1, PersonEntity.UrlsEntity.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new PersonEntity(hashset, j1, s9, agerangeentity, s8, s7, i1, coverentity, s6, s5, l, s4, imageentity, flag1, s3, nameentity, s2, k, arraylist2, arraylist1, j, i, s1, s, arraylist, flag);
            }
        } while (true);
    }

    public PersonEntity[] zziC(int i)
    {
        return new PersonEntity[i];
    }
}
