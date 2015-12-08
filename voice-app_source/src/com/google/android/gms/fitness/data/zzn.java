// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.data:
//            RawDataPoint, Value

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void zza(RawDataPoint rawdatapoint, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, rawdatapoint.zzajV);
        zzb.zzc(parcel, 1000, rawdatapoint.zzCY);
        zzb.zza(parcel, 2, rawdatapoint.zzajW);
        zzb.zza(parcel, 3, rawdatapoint.zzajX, i, false);
        zzb.zzc(parcel, 4, rawdatapoint.zzakH);
        zzb.zzc(parcel, 5, rawdatapoint.zzakI);
        zzb.zza(parcel, 6, rawdatapoint.zzajZ);
        zzb.zza(parcel, 7, rawdatapoint.zzaka);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzct(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzem(i);
    }

    public RawDataPoint zzct(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int k = 0;
        long l4 = 0L;
        long l3 = 0L;
        Value avalue[] = null;
        int j = 0;
        int i = 0;
        long l2 = 0L;
        long l1 = 0L;
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
                    l4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 3: // '\003'
                    avalue = (Value[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1, Value.CREATOR);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new RawDataPoint(k, l4, l3, avalue, j, i, l2, l1);
            }
        } while (true);
    }

    public RawDataPoint[] zzem(int i)
    {
        return new RawDataPoint[i];
    }
}
