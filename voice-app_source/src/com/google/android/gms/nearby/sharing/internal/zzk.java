// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            TrustedDevicesRequest

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(TrustedDevicesRequest trusteddevicesrequest, Parcel parcel, int i)
    {
        i = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, trusteddevicesrequest.versionCode);
        zzb.zza(parcel, 2, trusteddevicesrequest.zzaGv, false);
        zzb.zza(parcel, 3, trusteddevicesrequest.zzaGw, false);
        zzb.zza(parcel, 4, trusteddevicesrequest.zzxa(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfF(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziu(i);
    }

    public TrustedDevicesRequest zzfF(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        byte abyte0[] = null;
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
                    abyte0 = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new TrustedDevicesRequest(i, s, abyte0, ibinder);
            }
        } while (true);
    }

    public TrustedDevicesRequest[] zziu(int i)
    {
        return new TrustedDevicesRequest[i];
    }
}
