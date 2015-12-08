// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability

public class LocationAvailabilityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public LocationAvailabilityCreator()
    {
    }

    static void zza(LocationAvailability locationavailability, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, locationavailability.zzaBS);
        zzb.zzc(parcel, 1000, locationavailability.getVersionCode());
        zzb.zzc(parcel, 2, locationavailability.zzaBT);
        zzb.zza(parcel, 3, locationavailability.zzaBU);
        zzb.zzc(parcel, 4, locationavailability.zzaBV);
        zzb.zzH(parcel, i);
    }

    public LocationAvailability createFromParcel(Parcel parcel)
    {
        int i = 1;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int l = 0;
        int k = 1000;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new LocationAvailability(l, k, j, i, l1);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public LocationAvailability[] newArray(int i)
    {
        return new LocationAvailability[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
