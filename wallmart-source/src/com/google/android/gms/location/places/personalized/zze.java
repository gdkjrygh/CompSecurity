// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.places.personalized.internal.TestDataImpl;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData, PlaceAlias, HereContent

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(PlaceUserData placeuserdata, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zza(parcel, 1, placeuserdata.zzww(), false);
        zzb.zzc(parcel, 1000, placeuserdata.mVersionCode);
        zzb.zza(parcel, 2, placeuserdata.getPlaceId(), false);
        zzb.zzc(parcel, 5, placeuserdata.zzwz(), false);
        zzb.zzc(parcel, 6, placeuserdata.zzwx(), false);
        zzb.zzc(parcel, 7, placeuserdata.zzwy(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhs(i);
    }

    public PlaceUserData zzeS(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, TestDataImpl.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, PlaceAlias.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, HereContent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceUserData(i, s1, s, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public PlaceUserData[] zzhs(int i)
    {
        return new PlaceUserData[i];
    }
}
