// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void zza(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, streetviewpanoramacamera.getVersionCode());
        zzb.zza(parcel, 2, streetviewpanoramacamera.zoom);
        zzb.zza(parcel, 3, streetviewpanoramacamera.tilt);
        zzb.zza(parcel, 4, streetviewpanoramacamera.bearing);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzff(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhF(i);
    }

    public StreetViewPanoramaCamera zzff(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public StreetViewPanoramaCamera[] zzhF(int i)
    {
        return new StreetViewPanoramaCamera[i];
    }
}
