// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelable

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, bitmapdescriptorparcelable.getVersionCode());
        zzb.zza(parcel, 2, bitmapdescriptorparcelable.getType());
        zzb.zza(parcel, 3, bitmapdescriptorparcelable.getParameters(), false);
        zzb.zza(parcel, 4, bitmapdescriptorparcelable.getBitmap(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfa(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhA(i);
    }

    public BitmapDescriptorParcelable zzfa(Parcel parcel)
    {
        Bitmap bitmap = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        android.os.Bundle bundle = null;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public BitmapDescriptorParcelable[] zzhA(int i)
    {
        return new BitmapDescriptorParcelable[i];
    }
}
