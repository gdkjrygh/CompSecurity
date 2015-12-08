// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptions, LatLng, LatLngBounds

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, groundoverlayoptions.getVersionCode());
        zzb.zza(parcel, 2, groundoverlayoptions.zzvI(), false);
        zzb.zza(parcel, 3, groundoverlayoptions.getLocation(), i, false);
        zzb.zza(parcel, 4, groundoverlayoptions.getWidth());
        zzb.zza(parcel, 5, groundoverlayoptions.getHeight());
        zzb.zza(parcel, 6, groundoverlayoptions.getBounds(), i, false);
        zzb.zza(parcel, 7, groundoverlayoptions.getBearing());
        zzb.zza(parcel, 8, groundoverlayoptions.getZIndex());
        zzb.zza(parcel, 9, groundoverlayoptions.isVisible());
        zzb.zza(parcel, 10, groundoverlayoptions.getTransparency());
        zzb.zza(parcel, 11, groundoverlayoptions.getAnchorU());
        zzb.zza(parcel, 12, groundoverlayoptions.getAnchorV());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeN(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhn(i);
    }

    public GroundOverlayOptions zzeN(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        LatLng latlng = null;
        float f6 = 0.0F;
        float f5 = 0.0F;
        LatLngBounds latlngbounds = null;
        float f4 = 0.0F;
        float f3 = 0.0F;
        boolean flag = false;
        float f2 = 0.0F;
        float f1 = 0.0F;
        float f = 0.0F;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLng.CREATOR);
                    break;

                case 4: // '\004'
                    f6 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 5: // '\005'
                    f5 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    f4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 8: // '\b'
                    f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 10: // '\n'
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 11: // '\013'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 12: // '\f'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptions(i, ibinder, latlng, f6, f5, latlngbounds, f4, f3, flag, f2, f1, f);
            }
        } while (true);
    }

    public GroundOverlayOptions[] zzhn(int i)
    {
        return new GroundOverlayOptions[i];
    }
}
