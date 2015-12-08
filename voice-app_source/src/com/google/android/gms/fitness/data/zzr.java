// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Subscription, DataSource, DataType

public class zzr
    implements android.os.Parcelable.Creator
{

    public zzr()
    {
    }

    static void zza(Subscription subscription, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, subscription.getDataSource(), i, false);
        zzb.zzc(parcel, 1000, subscription.getVersionCode());
        zzb.zza(parcel, 2, subscription.getDataType(), i, false);
        zzb.zza(parcel, 3, subscription.zzqL());
        zzb.zzc(parcel, 4, subscription.getAccuracyMode());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcx(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzer(i);
    }

    public Subscription zzcx(Parcel parcel)
    {
        DataType datatype = null;
        int i = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        long l1 = 0L;
        DataSource datasource = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DataSource.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DataType.CREATOR);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new Subscription(j, datasource, datatype, l1, i);
            }
        } while (true);
    }

    public Subscription[] zzer(int i)
    {
        return new Subscription[i];
    }
}
