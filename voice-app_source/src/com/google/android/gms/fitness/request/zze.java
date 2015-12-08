// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataInsertRequest

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(DataInsertRequest datainsertrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datainsertrequest.zzqK(), i, false);
        zzb.zzc(parcel, 1000, datainsertrequest.getVersionCode());
        zzb.zza(parcel, 2, datainsertrequest.zzqU(), false);
        zzb.zza(parcel, 3, datainsertrequest.getPackageName(), false);
        zzb.zza(parcel, 4, datainsertrequest.zzqY());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcE(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzey(i);
    }

    public DataInsertRequest zzcE(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        android.os.IBinder ibinder = null;
        DataSet dataset = null;
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
                    dataset = (DataSet)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSet.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DataInsertRequest(i, dataset, ibinder, s, flag);
            }
        } while (true);
    }

    public DataInsertRequest[] zzey(int i)
    {
        return new DataInsertRequest[i];
    }
}
