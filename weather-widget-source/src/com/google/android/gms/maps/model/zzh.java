// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(PolygonOptions polygonoptions, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, polygonoptions.getVersionCode());
        zzb.zzc(parcel, 2, polygonoptions.getPoints(), false);
        zzb.zzd(parcel, 3, polygonoptions.zzxe(), false);
        zzb.zza(parcel, 4, polygonoptions.getStrokeWidth());
        zzb.zzc(parcel, 5, polygonoptions.getStrokeColor());
        zzb.zzc(parcel, 6, polygonoptions.getFillColor());
        zzb.zza(parcel, 7, polygonoptions.getZIndex());
        zzb.zza(parcel, 8, polygonoptions.isVisible());
        zzb.zza(parcel, 9, polygonoptions.isGeodesic());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhD(i);
    }

    public PolygonOptions zzfd(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, arraylist1, getClass().getClassLoader());
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
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
            }
        } while (true);
    }

    public PolygonOptions[] zzhD(int i)
    {
        return new PolygonOptions[i];
    }
}
