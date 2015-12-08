// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            MarkerOptionsParcelable, BitmapDescriptorParcelable

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(MarkerOptionsParcelable markeroptionsparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, markeroptionsparcelable.getVersionCode());
        zzb.zza(parcel, 2, markeroptionsparcelable.zzvO(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfd(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhE(i);
    }

    public MarkerOptionsParcelable zzfd(Parcel parcel)
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
                return new MarkerOptionsParcelable(i, bitmapdescriptorparcelable);
            }
        } while (true);
    }

    public MarkerOptionsParcelable[] zzhE(int i)
    {
        return new MarkerOptionsParcelable[i];
    }
}
