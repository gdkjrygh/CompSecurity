// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            Strategy

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(Strategy strategy, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, strategy.zzaFT);
        zzb.zzc(parcel, 1000, strategy.versionCode);
        zzb.zzc(parcel, 2, strategy.zzaFU);
        zzb.zzc(parcel, 3, strategy.zzaFV);
        zzb.zza(parcel, 4, strategy.zzaFW);
        zzb.zzc(parcel, 5, strategy.zzaFX);
        zzb.zzc(parcel, 6, strategy.zzaFY);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfr(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzig(i);
    }

    public Strategy zzfr(Parcel parcel)
    {
        int i = 0;
        int k1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        boolean flag = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 1000: 
                    j1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k1).toString(), parcel);
            } else
            {
                return new Strategy(j1, i1, l, k, flag, j, i);
            }
        } while (true);
    }

    public Strategy[] zzig(int i)
    {
        return new Strategy[i];
    }
}
