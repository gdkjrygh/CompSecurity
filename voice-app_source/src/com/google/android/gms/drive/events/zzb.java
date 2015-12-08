// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangesAvailableEvent, ChangesAvailableOptions

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void zza(ChangesAvailableEvent changesavailableevent, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, changesavailableevent.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, changesavailableevent.zzOx, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, changesavailableevent.zzadO, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaw(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcf(i);
    }

    public ChangesAvailableEvent zzaw(Parcel parcel)
    {
        ChangesAvailableOptions changesavailableoptions = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    changesavailableoptions = (ChangesAvailableOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ChangesAvailableOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ChangesAvailableEvent(i, s, changesavailableoptions);
            }
        } while (true);
    }

    public ChangesAvailableEvent[] zzcf(int i)
    {
        return new ChangesAvailableEvent[i];
    }
}
