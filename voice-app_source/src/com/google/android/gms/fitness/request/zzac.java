// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SubscribeRequest

public class zzac
    implements android.os.Parcelable.Creator
{

    public zzac()
    {
    }

    static void zza(SubscribeRequest subscriberequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, subscriberequest.zzrr(), i, false);
        zzb.zzc(parcel, 1000, subscriberequest.getVersionCode());
        zzb.zza(parcel, 2, subscriberequest.zzrs());
        zzb.zza(parcel, 3, subscriberequest.zzqU(), false);
        zzb.zza(parcel, 4, subscriberequest.getPackageName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdb(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeW(i);
    }

    public SubscribeRequest zzdb(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        android.os.IBinder ibinder = null;
        Subscription subscription = null;
        int i = 0;
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
                    subscription = (Subscription)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Subscription.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SubscribeRequest(i, subscription, flag, ibinder, s);
            }
        } while (true);
    }

    public SubscribeRequest[] zzeW(int i)
    {
        return new SubscribeRequest[i];
    }
}
