// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            AutocompletePredictionEntity

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(AutocompletePredictionEntity autocompletepredictionentity, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, autocompletepredictionentity.zzakM, false);
        zzb.zzc(parcel, 1000, autocompletepredictionentity.zzCY);
        zzb.zza(parcel, 2, autocompletepredictionentity.zzazK, false);
        zzb.zza(parcel, 3, autocompletepredictionentity.zzazo, false);
        zzb.zzc(parcel, 4, autocompletepredictionentity.zzaAe, false);
        zzb.zzc(parcel, 5, autocompletepredictionentity.zzaAf);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzex(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgW(i);
    }

    public AutocompletePredictionEntity zzex(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity(j, s1, s, arraylist1, arraylist, i);
            }
        } while (true);
    }

    public AutocompletePredictionEntity[] zzgW(int i)
    {
        return new AutocompletePredictionEntity[i];
    }
}
