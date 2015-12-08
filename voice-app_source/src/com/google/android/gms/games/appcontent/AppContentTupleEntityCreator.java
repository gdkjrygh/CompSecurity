// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTupleEntity

public class AppContentTupleEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentTupleEntityCreator()
    {
    }

    static void zza(AppContentTupleEntity appcontenttupleentity, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, appcontenttupleentity.getName(), false);
        zzb.zzc(parcel, 1000, appcontenttupleentity.getVersionCode());
        zzb.zza(parcel, 2, appcontenttupleentity.getValue(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdB(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfx(i);
    }

    public AppContentTupleEntity zzdB(Parcel parcel)
    {
        String s1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentTupleEntity(i, s, s1);
            }
        } while (true);
    }

    public AppContentTupleEntity[] zzfx(int i)
    {
        return new AppContentTupleEntity[i];
    }
}
