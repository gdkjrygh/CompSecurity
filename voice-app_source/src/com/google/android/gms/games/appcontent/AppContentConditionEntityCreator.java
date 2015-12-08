// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentConditionEntity

public class AppContentConditionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentConditionEntityCreator()
    {
    }

    static void zza(AppContentConditionEntity appcontentconditionentity, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, appcontentconditionentity.zzse(), false);
        zzb.zzc(parcel, 1000, appcontentconditionentity.getVersionCode());
        zzb.zza(parcel, 2, appcontentconditionentity.zzsf(), false);
        zzb.zza(parcel, 3, appcontentconditionentity.zzsg(), false);
        zzb.zza(parcel, 4, appcontentconditionentity.zzsh(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdz(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfv(i);
    }

    public AppContentConditionEntity zzdz(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AppContentConditionEntity(i, s2, s1, s, bundle);
            }
        } while (true);
    }

    public AppContentConditionEntity[] zzfv(int i)
    {
        return new AppContentConditionEntity[i];
    }
}
