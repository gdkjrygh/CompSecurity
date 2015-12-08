// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourceQueryParams

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(DataSourceQueryParams datasourcequeryparams, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datasourcequeryparams.zzajG, i, false);
        zzb.zzc(parcel, 1000, datasourcequeryparams.zzCY);
        zzb.zza(parcel, 2, datasourcequeryparams.zzOw);
        zzb.zza(parcel, 3, datasourcequeryparams.zzajW);
        zzb.zza(parcel, 4, datasourcequeryparams.zzamd);
        zzb.zzc(parcel, 5, datasourcequeryparams.zzalY);
        zzb.zzc(parcel, 6, datasourcequeryparams.zzame);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcG(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeA(i);
    }

    public DataSourceQueryParams zzcG(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        DataSource datasource = null;
        int j = 0;
        long l2 = 0L;
        long l3 = 0L;
        int k = 0;
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
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, DataSource.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 4: // '\004'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new DataSourceQueryParams(k, datasource, l3, l2, l1, j, i);
            }
        } while (true);
    }

    public DataSourceQueryParams[] zzeA(int i)
    {
        return new DataSourceQueryParams[i];
    }
}
