// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, cameraposition.getVersionCode());
        zzb.zza(parcel, 2, cameraposition.target, i, false);
        zzb.zza(parcel, 3, cameraposition.zoom);
        zzb.zza(parcel, 4, cameraposition.tilt);
        zzb.zza(parcel, 5, cameraposition.bearing);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhw(i);
    }

    public CameraPosition zzeW(Parcel parcel)
    {
        float f = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 5: // '\005'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public CameraPosition[] zzhw(int i)
    {
        return new CameraPosition[i];
    }
}
