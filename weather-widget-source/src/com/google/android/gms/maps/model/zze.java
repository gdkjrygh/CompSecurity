// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(LatLng latlng, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, latlng.getVersionCode());
        zzb.zza(parcel, 2, latlng.latitude);
        zzb.zza(parcel, 3, latlng.longitude);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfa(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhA(i);
    }

    public LatLng zzfa(Parcel parcel)
    {
        double d = 0.0D;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int i = 0;
        double d1 = 0.0D;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    d1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, k);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public LatLng[] zzhA(int i)
    {
        return new LatLng[i];
    }
}
