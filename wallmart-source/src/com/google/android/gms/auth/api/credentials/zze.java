// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(PasswordSpecification passwordspecification, Parcel parcel, int i)
    {
        i = zzb.zzak(parcel);
        zzb.zza(parcel, 1, passwordspecification.zzRq, false);
        zzb.zzc(parcel, 1000, passwordspecification.mVersionCode);
        zzb.zzb(parcel, 2, passwordspecification.zzRr, false);
        zzb.zza(parcel, 3, passwordspecification.zzRs, false);
        zzb.zzc(parcel, 4, passwordspecification.zzRt);
        zzb.zzc(parcel, 5, passwordspecification.zzRu);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzH(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzax(i);
    }

    public PasswordSpecification zzH(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        String s = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, i1);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel, i1);
                    break;

                case 4: // '\004'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new PasswordSpecification(k, s, arraylist1, arraylist, j, i);
            }
        } while (true);
    }

    public PasswordSpecification[] zzax(int i)
    {
        return new PasswordSpecification[i];
    }
}
