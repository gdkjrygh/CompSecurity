// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLocalNodeResponse, NodeParcelable

public class zzap
    implements android.os.Parcelable.Creator
{

    public zzap()
    {
    }

    static void zza(GetLocalNodeResponse getlocalnoderesponse, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, getlocalnoderesponse.versionCode);
        zzb.zzc(parcel, 2, getlocalnoderesponse.statusCode);
        zzb.zza(parcel, 3, getlocalnoderesponse.zzaUz, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzhh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzkp(i);
    }

    public GetLocalNodeResponse zzhh(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        NodeParcelable nodeparcelable = null;
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
                    nodeparcelable = (NodeParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GetLocalNodeResponse(i, j, nodeparcelable);
            }
        } while (true);
    }

    public GetLocalNodeResponse[] zzkp(int i)
    {
        return new GetLocalNodeResponse[i];
    }
}
