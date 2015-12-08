// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigsResponse

public class zzao
    implements android.os.Parcelable.Creator
{

    public zzao()
    {
    }

    static void zza(GetConfigsResponse getconfigsresponse, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, getconfigsresponse.versionCode);
        zzb.zzc(parcel, 2, getconfigsresponse.statusCode);
        zzb.zza(parcel, 3, getconfigsresponse.zzbay, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkU(i);
    }

    public GetConfigsResponse zzhJ(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        ConnectionConfiguration aconnectionconfiguration[] = null;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    aconnectionconfiguration = (ConnectionConfiguration[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetConfigsResponse(i, j, aconnectionconfiguration);
            }
        } while (true);
    }

    public GetConfigsResponse[] zzkU(int i)
    {
        return new GetConfigsResponse[i];
    }
}
