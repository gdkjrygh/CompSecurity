// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertFilter, UserDataType

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(NearbyAlertFilter nearbyalertfilter, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zzb(parcel, 1, nearbyalertfilter.zzaDo, false);
        zzb.zzc(parcel, 1000, nearbyalertfilter.mVersionCode);
        zzb.zza(parcel, 2, nearbyalertfilter.zzaDm, false);
        zzb.zzc(parcel, 3, nearbyalertfilter.zzaDp, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeB(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgY(i);
    }

    public NearbyAlertFilter zzeB(Parcel parcel)
    {
        java.util.ArrayList arraylist2 = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, UserDataType.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new NearbyAlertFilter(i, arraylist, arraylist1, arraylist2);
            }
        } while (true);
    }

    public NearbyAlertFilter[] zzgY(int i)
    {
        return new NearbyAlertFilter[i];
    }
}
