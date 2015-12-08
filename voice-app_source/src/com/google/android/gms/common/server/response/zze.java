// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.common.server.response:
//            SafeParcelResponse, FieldMappingDictionary

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(SafeParcelResponse safeparcelresponse, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, safeparcelresponse.getVersionCode());
        zzb.zza(parcel, 2, safeparcelresponse.zzoE(), false);
        zzb.zza(parcel, 3, safeparcelresponse.zzoF(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzal(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzbL(i);
    }

    public SafeParcelResponse zzal(Parcel parcel)
    {
        FieldMappingDictionary fieldmappingdictionary = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        Parcel parcel1 = null;
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
                    parcel1 = com.google.android.gms.common.internal.safeparcel.zza.zzD(parcel, k);
                    break;

                case 3: // '\003'
                    fieldmappingdictionary = (FieldMappingDictionary)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FieldMappingDictionary.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new SafeParcelResponse(i, parcel1, fieldmappingdictionary);
            }
        } while (true);
    }

    public SafeParcelResponse[] zzbL(int i)
    {
        return new SafeParcelResponse[i];
    }
}
