// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            UnsubscribeRequest

public class zzae
    implements android.os.Parcelable.Creator
{

    public zzae()
    {
    }

    static void zza(UnsubscribeRequest unsubscriberequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, unsubscriberequest.getDataType(), i, false);
        zzb.zzc(parcel, 1000, unsubscriberequest.getVersionCode());
        zzb.zza(parcel, 2, unsubscriberequest.getDataSource(), i, false);
        zzb.zza(parcel, 3, unsubscriberequest.zzqU(), false);
        zzb.zza(parcel, 4, unsubscriberequest.getPackageName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeY(i);
    }

    public UnsubscribeRequest zzdd(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        DataSource datasource = null;
        DataType datatype = null;
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
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataType.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    datasource = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DataSource.CREATOR);
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
                return new UnsubscribeRequest(i, datatype, datasource, ibinder, s);
            }
        } while (true);
    }

    public UnsubscribeRequest[] zzeY(int i)
    {
        return new UnsubscribeRequest[i];
    }
}
