// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions, LatLng

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(PolylineOptions polylineoptions, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, polylineoptions.getVersionCode());
        zzb.zzc(parcel, 2, polylineoptions.getPoints(), false);
        zzb.zza(parcel, 3, polylineoptions.getWidth());
        zzb.zzc(parcel, 4, polylineoptions.getColor());
        zzb.zza(parcel, 5, polylineoptions.getZIndex());
        zzb.zza(parcel, 6, polylineoptions.isVisible());
        zzb.zza(parcel, 7, polylineoptions.isGeodesic());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhs(i);
    }

    public PolylineOptions zzeS(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
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
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 5: // '\005'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, l);
                    break;

                case 6: // '\006'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public PolylineOptions[] zzhs(int i)
    {
        return new PolylineOptions[i];
    }
}
