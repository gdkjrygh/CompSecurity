// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigResponse

public class zzak
    implements android.os.Parcelable.Creator
{

    public zzak()
    {
    }

    static void zza(GetConfigResponse getconfigresponse, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, getconfigresponse.versionCode);
        zzb.zzc(parcel, 2, getconfigresponse.statusCode);
        zzb.zza(parcel, 3, getconfigresponse.zzaUu, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkk(i);
    }

    public GetConfigResponse zzhc(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        ConnectionConfiguration connectionconfiguration = null;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    connectionconfiguration = (ConnectionConfiguration)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetConfigResponse(i, j, connectionconfiguration);
            }
        } while (true);
    }

    public GetConfigResponse[] zzkk(int i)
    {
        return new GetConfigResponse[i];
    }
}
