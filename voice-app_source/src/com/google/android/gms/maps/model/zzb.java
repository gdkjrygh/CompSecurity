// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions, LatLng

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, circleoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, circleoptions.getCenter(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, circleoptions.getRadius());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, circleoptions.getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 5, circleoptions.getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 6, circleoptions.getFillColor());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, circleoptions.getZIndex());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, circleoptions.isVisible());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeM(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhm(i);
    }

    public CircleOptions zzeM(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
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
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public CircleOptions[] zzhm(int i)
    {
        return new CircleOptions[i];
    }
}
