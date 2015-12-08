// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPointsBalance

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(LoyaltyPointsBalance loyaltypointsbalance, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, loyaltypointsbalance.getVersionCode());
        zzb.zzc(parcel, 2, loyaltypointsbalance.zzaKw);
        zzb.zza(parcel, 3, loyaltypointsbalance.zzaKx, false);
        zzb.zza(parcel, 4, loyaltypointsbalance.zzaKy);
        zzb.zza(parcel, 5, loyaltypointsbalance.zzaIq, false);
        zzb.zza(parcel, 6, loyaltypointsbalance.zzaKz);
        zzb.zzc(parcel, 7, loyaltypointsbalance.zzaKA);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzis(i);
    }

    public LoyaltyPointsBalance zzfJ(Parcel parcel)
    {
        String s = null;
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        double d = 0.0D;
        long l1 = 0L;
        int i = -1;
        String s1 = null;
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
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 4: // '\004'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i1);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new LoyaltyPointsBalance(k, j, s1, d, s, l1, i);
            }
        } while (true);
    }

    public LoyaltyPointsBalance[] zzis(int i)
    {
        return new LoyaltyPointsBalance[i];
    }
}
