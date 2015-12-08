// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.search;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.search:
//            GoogleNowAuthState

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(GoogleNowAuthState googlenowauthstate, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zza(parcel, 1, googlenowauthstate.getAuthCode(), false);
        zzb.zzc(parcel, 1000, googlenowauthstate.zzCY);
        zzb.zza(parcel, 2, googlenowauthstate.getAccessToken(), false);
        zzb.zza(parcel, 3, googlenowauthstate.getNextAllowedTimeMillis());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfX(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziN(i);
    }

    public GoogleNowAuthState zzfX(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        long l = 0L;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new GoogleNowAuthState(i, s1, s, l);
            }
        } while (true);
    }

    public GoogleNowAuthState[] zziN(int i)
    {
        return new GoogleNowAuthState[i];
    }
}
