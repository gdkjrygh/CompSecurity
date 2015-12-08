// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            PutDataResponse, DataItemParcelable

public class zzbe
    implements android.os.Parcelable.Creator
{

    public zzbe()
    {
    }

    static void zza(PutDataResponse putdataresponse, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, putdataresponse.versionCode);
        zzb.zzc(parcel, 2, putdataresponse.statusCode);
        zzb.zza(parcel, 3, putdataresponse.zzbaA, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhS(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzld(i);
    }

    public PutDataResponse zzhS(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        DataItemParcelable dataitemparcelable = null;
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
                    dataitemparcelable = (DataItemParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DataItemParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PutDataResponse(i, j, dataitemparcelable);
            }
        } while (true);
    }

    public PutDataResponse[] zzld(int i)
    {
        return new PutDataResponse[i];
    }
}
