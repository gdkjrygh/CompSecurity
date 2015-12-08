// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            GroundOverlayOptionsParcelable, BitmapDescriptorParcelable

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(GroundOverlayOptionsParcelable groundoverlayoptionsparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, groundoverlayoptionsparcelable.getVersionCode());
        zzb.zza(parcel, 2, groundoverlayoptionsparcelable.zzvM(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhC(i);
    }

    public GroundOverlayOptionsParcelable zzfc(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapdescriptorparcelable = null;
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
                    bitmapdescriptorparcelable = (BitmapDescriptorParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, BitmapDescriptorParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GroundOverlayOptionsParcelable(i, bitmapdescriptorparcelable);
            }
        } while (true);
    }

    public GroundOverlayOptionsParcelable[] zzhC(int i)
    {
        return new GroundOverlayOptionsParcelable[i];
    }
}
