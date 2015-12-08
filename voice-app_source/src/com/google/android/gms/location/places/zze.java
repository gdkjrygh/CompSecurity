// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter, NearbyAlertFilter

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, nearbyalertrequest.zzuC());
        zzb.zzc(parcel, 1000, nearbyalertrequest.getVersionCode());
        zzb.zzc(parcel, 2, nearbyalertrequest.zzuF());
        zzb.zza(parcel, 3, nearbyalertrequest.zzuG(), i, false);
        zzb.zza(parcel, 4, nearbyalertrequest.zzuH(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeq(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgM(i);
    }

    public NearbyAlertRequest zzeq(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = -1;
        PlaceFilter placefilter = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, NearbyAlertFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(k, j, i, placefilter, nearbyalertfilter);
            }
        } while (true);
    }

    public NearbyAlertRequest[] zzgM(int i)
    {
        return new NearbyAlertRequest[i];
    }
}
