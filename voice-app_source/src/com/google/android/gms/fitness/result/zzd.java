// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.result:
//            DataSourceStatsResult

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(DataSourceStatsResult datasourcestatsresult, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datasourcestatsresult.zzajG, i, false);
        zzb.zzc(parcel, 1000, datasourcestatsresult.zzCY);
        zzb.zza(parcel, 2, datasourcestatsresult.zzOw);
        zzb.zza(parcel, 3, datasourcestatsresult.zzamS);
        zzb.zza(parcel, 4, datasourcestatsresult.zzamT);
        zzb.zza(parcel, 5, datasourcestatsresult.zzamU);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfc(i);
    }

    public DataSourceStatsResult zzdh(Parcel parcel)
    {
        boolean flag = false;
        long l = 0L;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        DataSource datasource = null;
        long l1 = 0L;
        long l2 = 0L;
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
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSource.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataSourceStatsResult(i, datasource, l2, flag, l1, l);
            }
        } while (true);
    }

    public DataSourceStatsResult[] zzfc(int i)
    {
        return new DataSourceStatsResult[i];
    }
}
