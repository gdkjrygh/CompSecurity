// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelable

public class PopupLocationInfoParcelableCreator
    implements android.os.Parcelable.Creator
{

    public PopupLocationInfoParcelableCreator()
    {
    }

    static void zza(PopupLocationInfoParcelable popuplocationinfoparcelable, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, popuplocationinfoparcelable.zztc(), false);
        zzb.zzc(parcel, 1000, popuplocationinfoparcelable.getVersionCode());
        zzb.zza(parcel, 2, popuplocationinfoparcelable.getWindowToken(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdD(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfE(i);
    }

    public PopupLocationInfoParcelable zzdD(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        android.os.Bundle bundle = null;
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
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PopupLocationInfoParcelable(i, bundle, ibinder);
            }
        } while (true);
    }

    public PopupLocationInfoParcelable[] zzfE(int i)
    {
        return new PopupLocationInfoParcelable[i];
    }
}
