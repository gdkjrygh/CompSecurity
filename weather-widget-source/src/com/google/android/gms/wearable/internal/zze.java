// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(AmsEntityUpdateParcelable amsentityupdateparcelable, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, amsentityupdateparcelable.mVersionCode);
        zzb.zza(parcel, 2, amsentityupdateparcelable.zzCu());
        zzb.zza(parcel, 3, amsentityupdateparcelable.zzCv());
        zzb.zza(parcel, 4, amsentityupdateparcelable.getValue(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhq(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzky(i);
    }

    public AmsEntityUpdateParcelable zzhq(Parcel parcel)
    {
        byte byte1 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        String s = null;
        byte byte0 = 0;
        int i = 0;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 3: // '\003'
                    byte1 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AmsEntityUpdateParcelable(i, byte0, byte1, s);
            }
        } while (true);
    }

    public AmsEntityUpdateParcelable[] zzky(int i)
    {
        return new AmsEntityUpdateParcelable[i];
    }
}
