// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSource, DataType, Device, Application

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void zza(DataSource datasource, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datasource.getDataType(), i, false);
        zzb.zzc(parcel, 1000, datasource.getVersionCode());
        zzb.zza(parcel, 2, datasource.getName(), false);
        zzb.zzc(parcel, 3, datasource.getType());
        zzb.zza(parcel, 4, datasource.getDevice(), i, false);
        zzb.zza(parcel, 5, datasource.zzqB(), i, false);
        zzb.zza(parcel, 6, datasource.getStreamName(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcn(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeg(i);
    }

    public DataSource zzcn(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        Application application = null;
        Device device = null;
        String s1 = null;
        DataType datatype = null;
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
                    datatype = (DataType)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DataType.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 4: // '\004'
                    device = (Device)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Device.CREATOR);
                    break;

                case 5: // '\005'
                    application = (Application)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Application.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataSource(j, datatype, s1, i, device, application, s);
            }
        } while (true);
    }

    public DataSource[] zzeg(int i)
    {
        return new DataSource[i];
    }
}
