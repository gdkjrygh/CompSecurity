// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.fitness.result:
//            DataReadResult

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(DataReadResult datareadresult, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzd(parcel, 1, datareadresult.zzrv(), false);
        zzb.zzc(parcel, 1000, datareadresult.getVersionCode());
        zzb.zza(parcel, 2, datareadresult.getStatus(), i, false);
        zzb.zzd(parcel, 3, datareadresult.zzru(), false);
        zzb.zzc(parcel, 5, datareadresult.zzrt());
        zzb.zzc(parcel, 6, datareadresult.zzqA(), false);
        zzb.zzc(parcel, 7, datareadresult.zzrw(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdg(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfb(i);
    }

    public DataReadResult zzdg(Parcel parcel)
    {
        int i = 0;
        ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist1 = null;
        Status status = null;
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
                    com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, arraylist2, getClass().getClassLoader());
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Status.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, arraylist3, getClass().getClassLoader());
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, DataSource.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, DataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new DataReadResult(j, arraylist2, status, arraylist3, i, arraylist1, arraylist);
            }
        } while (true);
    }

    public DataReadResult[] zzfb(int i)
    {
        return new DataReadResult[i];
    }
}
