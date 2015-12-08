// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Field;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataTypeCreateRequest

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(DataTypeCreateRequest datatypecreaterequest, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, datatypecreaterequest.getName(), false);
        zzb.zzc(parcel, 1000, datatypecreaterequest.getVersionCode());
        zzb.zzc(parcel, 2, datatypecreaterequest.getFields(), false);
        zzb.zza(parcel, 3, datatypecreaterequest.zzqU(), false);
        zzb.zza(parcel, 4, datatypecreaterequest.getPackageName(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcI(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeC(i);
    }

    public DataTypeCreateRequest zzcI(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        java.util.ArrayList arraylist = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, Field.CREATOR);
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
                return new DataTypeCreateRequest(i, s1, arraylist, ibinder, s);
            }
        } while (true);
    }

    public DataTypeCreateRequest[] zzeC(int i)
    {
        return new DataTypeCreateRequest[i];
    }
}
