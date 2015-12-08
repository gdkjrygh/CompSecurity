// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            LoyaltyPoints, LoyaltyPointsBalance, TimeInterval

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(LoyaltyPoints loyaltypoints, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, loyaltypoints.getVersionCode());
        zzb.zza(parcel, 2, loyaltypoints.label, false);
        zzb.zza(parcel, 3, loyaltypoints.zzaKu, i, false);
        zzb.zza(parcel, 4, loyaltypoints.type, false);
        zzb.zza(parcel, 5, loyaltypoints.zzaIK, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzit(i);
    }

    public LoyaltyPoints zzfK(Parcel parcel)
    {
        TimeInterval timeinterval = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
        LoyaltyPointsBalance loyaltypointsbalance = null;
        String s1 = null;
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
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    loyaltypointsbalance = (LoyaltyPointsBalance)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LoyaltyPointsBalance.CREATOR);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, TimeInterval.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LoyaltyPoints(i, s1, loyaltypointsbalance, s, timeinterval);
            }
        } while (true);
    }

    public LoyaltyPoints[] zzit(int i)
    {
        return new LoyaltyPoints[i];
    }
}
