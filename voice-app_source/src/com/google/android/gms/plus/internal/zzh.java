// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusSession, PlusCommonExtras

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(PlusSession plussession, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zza(parcel, 1, plussession.getAccountName(), false);
        zzb.zzc(parcel, 1000, plussession.getVersionCode());
        zzb.zza(parcel, 2, plussession.zzxx(), false);
        zzb.zza(parcel, 3, plussession.zzxy(), false);
        zzb.zza(parcel, 4, plussession.zzxz(), false);
        zzb.zza(parcel, 5, plussession.zzxA(), false);
        zzb.zza(parcel, 6, plussession.zzxB(), false);
        zzb.zza(parcel, 7, plussession.zzlB(), false);
        zzb.zza(parcel, 8, plussession.zzxC(), false);
        zzb.zza(parcel, 9, plussession.zzxD(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziz(i);
    }

    public PlusSession zzfJ(Parcel parcel)
    {
        PlusCommonExtras pluscommonextras = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String as[] = null;
        String as1[] = null;
        String as2[] = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    as2 = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 3: // '\003'
                    as1 = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, k);
                    break;

                case 5: // '\005'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 9: // '\t'
                    pluscommonextras = (PlusCommonExtras)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PlusCommonExtras.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlusSession(i, s4, as2, as1, as, s3, s2, s1, s, pluscommonextras);
            }
        } while (true);
    }

    public PlusSession[] zziz(int i)
    {
        return new PlusSession[i];
    }
}
