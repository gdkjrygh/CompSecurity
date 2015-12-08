// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataReadRequest

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(DataReadRequest datareadrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, datareadrequest.getDataTypes(), false);
        zzb.zzc(parcel, 2, datareadrequest.getDataSources(), false);
        zzb.zza(parcel, 3, datareadrequest.zzkt());
        zzb.zza(parcel, 4, datareadrequest.zzqs());
        zzb.zzc(parcel, 5, datareadrequest.getAggregatedDataTypes(), false);
        zzb.zzc(parcel, 6, datareadrequest.getAggregatedDataSources(), false);
        zzb.zzc(parcel, 7, datareadrequest.getBucketType());
        zzb.zza(parcel, 8, datareadrequest.zzrb());
        zzb.zza(parcel, 9, datareadrequest.getActivityDataSource(), i, false);
        zzb.zzc(parcel, 10, datareadrequest.getLimit());
        zzb.zza(parcel, 12, datareadrequest.zzra());
        zzb.zza(parcel, 13, datareadrequest.zzqZ());
        zzb.zza(parcel, 14, datareadrequest.zzqU(), false);
        zzb.zza(parcel, 15, datareadrequest.getPackageName(), false);
        zzb.zzc(parcel, 16, datareadrequest.zzrc(), false);
        zzb.zzc(parcel, 1000, datareadrequest.getVersionCode());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzez(i);
    }

    public DataReadRequest zzcF(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int k = 0;
        java.util.ArrayList arraylist4 = null;
        java.util.ArrayList arraylist3 = null;
        long l3 = 0L;
        long l2 = 0L;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        long l1 = 0L;
        DataSource datasource = null;
        int i = 0;
        boolean flag1 = false;
        boolean flag = false;
        android.os.IBinder ibinder = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, DataType.CREATOR);
                    break;

                case 2: // '\002'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, DataSource.CREATOR);
                    break;

                case 3: // '\003'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, DataType.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 9: // '\t'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, DataSource.CREATOR);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 12: // '\f'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 13: // '\r'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 14: // '\016'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, i1);
                    break;

                case 15: // '\017'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 16: // '\020'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, Device.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new DataReadRequest(k, arraylist4, arraylist3, l3, l2, arraylist2, arraylist1, j, l1, datasource, i, flag1, flag, ibinder, s, arraylist);
            }
        } while (true);
    }

    public DataReadRequest[] zzez(int i)
    {
        return new DataReadRequest[i];
    }
}
