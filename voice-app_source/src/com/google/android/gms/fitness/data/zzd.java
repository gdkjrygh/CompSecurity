// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint, DataSource, Value

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(DataPoint datapoint, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datapoint.getDataSource(), i, false);
        zzb.zzc(parcel, 1000, datapoint.getVersionCode());
        zzb.zza(parcel, 3, datapoint.getTimestampNanos());
        zzb.zza(parcel, 4, datapoint.zzqy());
        zzb.zza(parcel, 5, datapoint.zzqu(), i, false);
        zzb.zza(parcel, 6, datapoint.getOriginalDataSource(), i, false);
        zzb.zza(parcel, 7, datapoint.zzqv());
        zzb.zza(parcel, 8, datapoint.zzqw());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcl(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzee(i);
    }

    public DataPoint zzcl(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        DataSource datasource1 = null;
        long l3 = 0L;
        long l2 = 0L;
        Value avalue[] = null;
        DataSource datasource = null;
        long l1 = 0L;
        long l = 0L;
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
                    datasource1 = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 5: // '\005'
                    avalue = (Value[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, Value.CREATOR);
                    break;

                case 6: // '\006'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 8: // '\b'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataPoint(i, datasource1, l3, l2, avalue, datasource, l1, l);
            }
        } while (true);
    }

    public DataPoint[] zzee(int i)
    {
        return new DataPoint[i];
    }
}
