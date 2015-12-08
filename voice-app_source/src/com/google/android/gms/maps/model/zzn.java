// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void zza(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, tileoverlayoptions.getVersionCode());
        zzb.zza(parcel, 2, tileoverlayoptions.zzvL(), false);
        zzb.zza(parcel, 3, tileoverlayoptions.isVisible());
        zzb.zza(parcel, 4, tileoverlayoptions.getZIndex());
        zzb.zza(parcel, 5, tileoverlayoptions.getFadeIn());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeY(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhy(i);
    }

    public TileOverlayOptions zzeY(Parcel parcel)
    {
        boolean flag1 = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
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
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public TileOverlayOptions[] zzhy(int i)
    {
        return new TileOverlayOptions[i];
    }
}
