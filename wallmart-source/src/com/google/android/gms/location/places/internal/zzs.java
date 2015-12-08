// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams

public class zzs
    implements android.os.Parcelable.Creator
{

    public zzs()
    {
    }

    static void zza(PlacesParams placesparams, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zza(parcel, 1, placesparams.zzaEZ, false);
        zzb.zzc(parcel, 1000, placesparams.versionCode);
        zzb.zza(parcel, 2, placesparams.zzaFa, false);
        zzb.zza(parcel, 3, placesparams.zzaFb, false);
        zzb.zza(parcel, 4, placesparams.zzaDU, false);
        zzb.zza(parcel, 5, placesparams.zzaFc, false);
        zzb.zzc(parcel, 6, placesparams.zzaFd);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeN(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhn(i);
    }

    public PlacesParams zzeN(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlacesParams(j, s4, s3, s2, s1, s, i);
            }
        } while (true);
    }

    public PlacesParams[] zzhn(int i)
    {
        return new PlacesParams[i];
    }
}
